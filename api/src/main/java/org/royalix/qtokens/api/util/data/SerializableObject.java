package org.royalix.qtokens.api.util.data;

public interface SerializableObject {
  void serialize(SerializedData data);

  void deserialize(SerializedData data);
}
