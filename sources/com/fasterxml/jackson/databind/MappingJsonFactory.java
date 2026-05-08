package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;

/* JADX INFO: loaded from: classes2.dex */
public class MappingJsonFactory extends JsonFactory {
    private static final long serialVersionUID = -1;

    public MappingJsonFactory(ObjectMapper objectMapper) {
        super(objectMapper);
        if (objectMapper == null) {
            setCodec(new ObjectMapper(this));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public JsonFactory copy() {
        _checkInvalidCopy(MappingJsonFactory.class);
        return new MappingJsonFactory(this, null);
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public String getFormatName() {
        return "JSON";
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public final ObjectMapper getCodec() {
        return (ObjectMapper) this._objectCodec;
    }

    public MappingJsonFactory() {
        this(null);
    }

    public MappingJsonFactory(JsonFactory jsonFactory, ObjectMapper objectMapper) {
        super(jsonFactory, objectMapper);
        if (objectMapper == null) {
            setCodec(new ObjectMapper(this));
        }
    }
}
