package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.NameTransformer;
import defpackage.akb;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JsonSerializer<T> {

    public static abstract class None extends JsonSerializer<Object> {
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        jsonFormatVisitorWrapper.expectAnyFormat(javaType);
    }

    public Class<T> handledType() {
        return null;
    }

    public boolean isEmpty(SerializerProvider serializerProvider, T t) {
        return t == null;
    }

    public boolean isUnwrappingSerializer() {
        return false;
    }

    public abstract void serialize(T t, JsonGenerator jsonGenerator, SerializerProvider serializerProvider);

    /* JADX WARN: Multi-variable type inference failed */
    public void serializeWithType(T t, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        Class clsHandledType = handledType();
        if (clsHandledType == null) {
            clsHandledType = t.getClass();
        }
        serializerProvider.reportBadDefinition((Class<?>) clsHandledType, akb.k("Type id handling not implemented for type ", clsHandledType.getName(), " (by serializer of type ", getClass().getName(), ")"));
    }

    public JsonSerializer<T> unwrappingSerializer(NameTransformer nameTransformer) {
        return this;
    }

    public boolean usesObjectId() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonSerializer<?> withIgnoredProperties(Set<String> set) {
        return this;
    }
}
