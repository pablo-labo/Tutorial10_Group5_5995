package com.google.gson;

/* JADX INFO: loaded from: classes2.dex */
public class JsonParseException extends RuntimeException {
    static final long serialVersionUID = -4086729973971783390L;

    public JsonParseException(RuntimeException runtimeException, String str) {
        super(str, runtimeException);
    }
}
