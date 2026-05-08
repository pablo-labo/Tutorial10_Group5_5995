package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import defpackage.akb;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public class UnrecognizedPropertyException extends PropertyBindingException {
    private static final long serialVersionUID = 1;

    public UnrecognizedPropertyException(JsonParser jsonParser, String str, JsonLocation jsonLocation, Class<?> cls, String str2, Collection<Object> collection) {
        super(jsonParser, str, jsonLocation, cls, str2, collection);
    }

    public static UnrecognizedPropertyException from(JsonParser jsonParser, Object obj, String str, Collection<Object> collection) {
        Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
        UnrecognizedPropertyException unrecognizedPropertyException = new UnrecognizedPropertyException(jsonParser, akb.k("Unrecognized field \"", str, "\" (class ", cls.getName(), "), not marked as ignorable"), jsonParser.currentLocation(), cls, str, collection);
        unrecognizedPropertyException.prependPath(obj, str);
        return unrecognizedPropertyException;
    }
}
