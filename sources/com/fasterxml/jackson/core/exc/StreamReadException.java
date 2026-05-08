package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.RequestPayload;
import defpackage.h5;

/* JADX INFO: loaded from: classes2.dex */
public abstract class StreamReadException extends JsonProcessingException {
    static final long serialVersionUID = 2;
    protected transient JsonParser _processor;
    protected RequestPayload _requestPayload;

    public StreamReadException(JsonParser jsonParser, String str) {
        this(jsonParser, str, _currentLocation(jsonParser), null);
    }

    public static JsonLocation _currentLocation(JsonParser jsonParser) {
        if (jsonParser == null) {
            return null;
        }
        return jsonParser.currentLocation();
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (this._requestPayload == null) {
            return message;
        }
        StringBuilder sbG = h5.g(message, "\nRequest payload : ");
        sbG.append(this._requestPayload.toString());
        return sbG.toString();
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    public JsonParser getProcessor() {
        return this._processor;
    }

    public StreamReadException(JsonParser jsonParser, String str, JsonLocation jsonLocation, Throwable th) {
        super(str, jsonLocation, th);
        this._processor = jsonParser;
    }
}
