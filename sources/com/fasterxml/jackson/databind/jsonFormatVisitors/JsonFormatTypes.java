package com.fasterxml.jackson.databind.jsonFormatVisitors;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public enum JsonFormatTypes {
    STRING,
    NUMBER,
    INTEGER,
    BOOLEAN,
    OBJECT,
    ARRAY,
    NULL,
    ANY;

    private static final Map<String, JsonFormatTypes> _byLCName = new HashMap();

    static {
        for (JsonFormatTypes jsonFormatTypes : values()) {
            _byLCName.put(jsonFormatTypes.name().toLowerCase(), jsonFormatTypes);
        }
    }
}
