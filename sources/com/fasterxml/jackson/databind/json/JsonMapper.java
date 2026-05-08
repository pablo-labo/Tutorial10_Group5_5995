package com.fasterxml.jackson.databind.json;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.cfg.PackageVersion;

/* JADX INFO: loaded from: classes2.dex */
public class JsonMapper extends ObjectMapper {
    private static final long serialVersionUID = 1;

    public JsonMapper() {
        this(new JsonFactory());
    }

    @Override // com.fasterxml.jackson.databind.ObjectMapper
    public JsonMapper copy() {
        _checkInvalidCopy(JsonMapper.class);
        return new JsonMapper(this);
    }

    @Override // com.fasterxml.jackson.databind.ObjectMapper, com.fasterxml.jackson.core.ObjectCodec
    public JsonFactory getFactory() {
        return this._jsonFactory;
    }

    @Override // com.fasterxml.jackson.databind.ObjectMapper, com.fasterxml.jackson.core.ObjectCodec
    public Version version() {
        return PackageVersion.VERSION;
    }

    public JsonMapper(JsonFactory jsonFactory) {
        super(jsonFactory);
    }

    public JsonMapper(JsonMapper jsonMapper) {
        super(jsonMapper);
    }
}
