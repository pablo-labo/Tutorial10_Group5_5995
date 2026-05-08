package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public class StdDelegatingSerializer extends StdSerializer<Object> implements ContextualSerializer, ResolvableSerializer {
    protected final Converter<Object, ?> _converter;
    protected final JsonSerializer<Object> _delegateSerializer;
    protected final JavaType _delegateType;

    public StdDelegatingSerializer(Converter<Object, ?> converter, JavaType javaType, JsonSerializer<?> jsonSerializer) {
        super(javaType);
        this._converter = converter;
        this._delegateType = javaType;
        this._delegateSerializer = jsonSerializer;
    }

    public JsonSerializer<Object> _findSerializer(Object obj, SerializerProvider serializerProvider) {
        return serializerProvider.findValueSerializer(obj.getClass());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        JsonSerializer<Object> jsonSerializer = this._delegateSerializer;
        if (jsonSerializer != null) {
            jsonSerializer.acceptJsonFormatVisitor(jsonFormatVisitorWrapper, javaType);
        }
    }

    public Object convertValue(Object obj) {
        return this._converter.convert(obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonSerializer<?> jsonSerializerHandleSecondaryContextualization = this._delegateSerializer;
        JavaType outputType = this._delegateType;
        if (jsonSerializerHandleSecondaryContextualization == null) {
            if (outputType == null) {
                outputType = this._converter.getOutputType(serializerProvider.getTypeFactory());
            }
            if (!outputType.isJavaLangObject()) {
                jsonSerializerHandleSecondaryContextualization = serializerProvider.findValueSerializer(outputType);
            }
        }
        if (jsonSerializerHandleSecondaryContextualization instanceof ContextualSerializer) {
            jsonSerializerHandleSecondaryContextualization = serializerProvider.handleSecondaryContextualization(jsonSerializerHandleSecondaryContextualization, beanProperty);
        }
        return (jsonSerializerHandleSecondaryContextualization == this._delegateSerializer && outputType == this._delegateType) ? this : withDelegate(this._converter, outputType, jsonSerializerHandleSecondaryContextualization);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.jsonschema.SchemaAware
    @Deprecated
    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        Object obj = this._delegateSerializer;
        return obj instanceof SchemaAware ? ((SchemaAware) obj).getSchema(serializerProvider, type) : super.getSchema(serializerProvider, type);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, Object obj) {
        Object objConvertValue = convertValue(obj);
        if (objConvertValue == null) {
            return true;
        }
        JsonSerializer<Object> jsonSerializer = this._delegateSerializer;
        return jsonSerializer == null ? obj == null : jsonSerializer.isEmpty(serializerProvider, objConvertValue);
    }

    @Override // com.fasterxml.jackson.databind.ser.ResolvableSerializer
    public void resolve(SerializerProvider serializerProvider) {
        Object obj = this._delegateSerializer;
        if (obj == null || !(obj instanceof ResolvableSerializer)) {
            return;
        }
        ((ResolvableSerializer) obj).resolve(serializerProvider);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Object objConvertValue = convertValue(obj);
        if (objConvertValue == null) {
            serializerProvider.defaultSerializeNull(jsonGenerator);
            return;
        }
        JsonSerializer<Object> jsonSerializer_findSerializer = this._delegateSerializer;
        if (jsonSerializer_findSerializer == null) {
            jsonSerializer_findSerializer = _findSerializer(objConvertValue, serializerProvider);
        }
        jsonSerializer_findSerializer.serialize(objConvertValue, jsonGenerator, serializerProvider);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        Object objConvertValue = convertValue(obj);
        if (objConvertValue == null) {
            serializerProvider.defaultSerializeNull(jsonGenerator);
            return;
        }
        JsonSerializer<Object> jsonSerializer_findSerializer = this._delegateSerializer;
        if (jsonSerializer_findSerializer == null) {
            jsonSerializer_findSerializer = _findSerializer(obj, serializerProvider);
        }
        jsonSerializer_findSerializer.serializeWithType(objConvertValue, jsonGenerator, serializerProvider, typeSerializer);
    }

    public StdDelegatingSerializer withDelegate(Converter<Object, ?> converter, JavaType javaType, JsonSerializer<?> jsonSerializer) {
        ClassUtil.verifyMustOverride(StdDelegatingSerializer.class, this, "withDelegate");
        return new StdDelegatingSerializer(converter, javaType, jsonSerializer);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.jsonschema.SchemaAware
    @Deprecated
    public JsonNode getSchema(SerializerProvider serializerProvider, Type type, boolean z) {
        Object obj = this._delegateSerializer;
        if (obj instanceof SchemaAware) {
            return ((SchemaAware) obj).getSchema(serializerProvider, type, z);
        }
        return super.getSchema(serializerProvider, type);
    }
}
