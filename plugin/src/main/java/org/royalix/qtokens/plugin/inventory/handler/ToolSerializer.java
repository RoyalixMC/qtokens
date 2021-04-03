package org.royalix.qtokens.plugin.inventory.handler;

import com.oop.inteliframework.plugin.module.InteliModule;
import de.tr7zw.changeme.nbtapi.NBTItem;
import lombok.NonNull;
import lombok.SneakyThrows;
import org.royalix.qtokens.api.util.data.SerializedData;
import org.royalix.qtokens.plugin.json.JsonHolder;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.zip.Deflater;

public class ToolSerializer implements InteliModule {
    private static final ToolSerializer INSTANCE = new ToolSerializer();

    public static ToolSerializer get() {
        return INSTANCE;
    }

    @SneakyThrows
    public void serialize(@NonNull SerializedData data, @NonNull NBTItem nbt, String underKey) {
        String serializedObject = platform()
                .safeModuleByClass(JsonHolder.class)
                .NORMAL
                .toJson(data.getJsonElement());

        serializedObject = compress(serializedObject.getBytes(StandardCharsets.UTF_8));
        if (serializedObject.length() > 32767) {
            String[] strings = splitData(serializedObject);
            for (int i = 0; i < strings.length; i++)
                nbt.setString(underKey + "_" + i, strings[i]);

        } else
            nbt.setString(underKey, serializedObject);
    }

    @SneakyThrows
    private String[] splitData(String plainData) {
        char[] initialArray = plainData.toCharArray();
        int length = initialArray.length;
        int chunks = (int) Math.ceil(length / 32767.0);

        return chunkArray(initialArray, chunks);
    }

    private String[] chunkArray(char[] array, int numOfChunks) {
        int chunkSize = (int) Math.ceil((double) array.length / numOfChunks);
        String[] output = new String[numOfChunks];

        for (int i = 0; i < numOfChunks; i++) {
            int start = i * chunkSize;
            int length = Math.min(array.length - start, chunkSize);

            char[] temp = new char[length];
            System.arraycopy(array, start, temp, 0, length);
            output[i] = new String(temp);
        }

        return output;
    }

    private String compress(byte[] bytes) throws Exception {
        Deflater deflater = new Deflater();
        deflater.setInput(bytes);
        deflater.finish();
        ByteArrayOutputStream bos = new ByteArrayOutputStream(bytes.length);
        byte[] buffer = new byte[1024];
        while (!deflater.finished()) {
            int count = deflater.deflate(buffer);
            bos.write(buffer, 0, count);
        }
        bos.close();
        byte[] output = bos.toByteArray();
        return encodeBase64(output);
    }

    private String encodeBase64(byte[] bytes) {
        return Base64.getEncoder().encodeToString(bytes).replace("\r\n", "").replace("\n", "");
    }
}
