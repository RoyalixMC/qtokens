package org.royalix.qtokens.plugin.json;

import com.google.gson.Gson;
import com.oop.inteliframework.plugin.module.InteliModule;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class JsonHolder implements InteliModule {

    public final Gson NORMAL;
    public final Gson PRETTY;

}
