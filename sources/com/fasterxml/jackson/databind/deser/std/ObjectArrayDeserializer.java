package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@JacksonStdImpl
public class ObjectArrayDeserializer extends ContainerDeserializerBase<Object> implements ContextualDeserializer {
    private static final long serialVersionUID = 1;
    protected final Class<?> _elementClass;
    protected JsonDeserializer<Object> _elementDeserializer;
    protected final TypeDeserializer _elementTypeDeserializer;
    protected final Object[] _emptyValue;
    protected final boolean _untyped;

    public ObjectArrayDeserializer(JavaType javaType, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer) {
        super(javaType, (NullValueProvider) null, (Boolean) null);
        ArrayType arrayType = (ArrayType) javaType;
        Class<?> rawClass = arrayType.getContentType().getRawClass();
        this._elementClass = rawClass;
        this._untyped = rawClass == Object.class;
        this._elementDeserializer = jsonDeserializer;
        this._elementTypeDeserializer = typeDeserializer;
        this._emptyValue = arrayType.getEmptyArray();
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JsonDeserializer<?> jsonDeserializer = this._elementDeserializer;
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, this._containerType.getRawClass(), JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        JsonDeserializer<?> jsonDeserializerFindConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, jsonDeserializer);
        JavaType contentType = this._containerType.getContentType();
        JsonDeserializer<?> jsonDeserializerFindContextualValueDeserializer = jsonDeserializerFindConvertingContentDeserializer == null ? deserializationContext.findContextualValueDeserializer(contentType, beanProperty) : deserializationContext.handleSecondaryContextualization(jsonDeserializerFindConvertingContentDeserializer, beanProperty, contentType);
        TypeDeserializer typeDeserializerForProperty = this._elementTypeDeserializer;
        if (typeDeserializerForProperty != null) {
            typeDeserializerForProperty = typeDeserializerForProperty.forProperty(beanProperty);
        }
        return withResolved(typeDeserializerForProperty, jsonDeserializerFindContextualValueDeserializer, findContentNullProvider(deserializationContext, beanProperty, jsonDeserializerFindContextualValueDeserializer), boolFindFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws JsonMappingException {
        Object objDeserialize;
        int i;
        Object[] objArr = (Object[]) obj;
        if (!jsonParser.isExpectedStartArrayToken()) {
            Object[] objArr2 = (Object[]) handleNonArray(jsonParser, deserializationContext);
            if (objArr2 == null) {
                return objArr;
            }
            int length = objArr.length;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr2.length + length);
            System.arraycopy(objArr2, 0, objArrCopyOf, length, objArr2.length);
            return objArrCopyOf;
        }
        ObjectBuffer objectBufferLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        int length2 = objArr.length;
        Object[] objArrResetAndStart = objectBufferLeaseObjectBuffer.resetAndStart(objArr, length2);
        TypeDeserializer typeDeserializer = this._elementTypeDeserializer;
        while (true) {
            try {
                JsonToken jsonTokenNextToken = jsonParser.nextToken();
                if (jsonTokenNextToken == JsonToken.END_ARRAY) {
                    break;
                }
                try {
                    if (jsonTokenNextToken != JsonToken.VALUE_NULL) {
                        JsonDeserializer<Object> jsonDeserializer = this._elementDeserializer;
                        objDeserialize = typeDeserializer == null ? jsonDeserializer.deserialize(jsonParser, deserializationContext) : jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                    } else if (!this._skipNullValues) {
                        objDeserialize = this._nullProvider.getNullValue(deserializationContext);
                    }
                    objArrResetAndStart[length2] = objDeserialize;
                    length2 = i;
                } catch (Exception e) {
                    e = e;
                    length2 = i;
                    throw JsonMappingException.wrapWithPath(e, objArrResetAndStart, objectBufferLeaseObjectBuffer.bufferedSize() + length2);
                }
                if (length2 >= objArrResetAndStart.length) {
                    objArrResetAndStart = objectBufferLeaseObjectBuffer.appendCompletedChunk(objArrResetAndStart);
                    length2 = 0;
                }
                i = length2 + 1;
            } catch (Exception e2) {
                e = e2;
            }
        }
        Object[] objArrCompleteAndClearBuffer = this._untyped ? objectBufferLeaseObjectBuffer.completeAndClearBuffer(objArrResetAndStart, length2) : objectBufferLeaseObjectBuffer.completeAndClearBuffer(objArrResetAndStart, length2, this._elementClass);
        deserializationContext.returnObjectBuffer(objectBufferLeaseObjectBuffer);
        return objArrCompleteAndClearBuffer;
    }

    public Byte[] deserializeFromBase64(JsonParser jsonParser, DeserializationContext deserializationContext) {
        byte[] binaryValue = jsonParser.getBinaryValue(deserializationContext.getBase64Variant());
        Byte[] bArr = new Byte[binaryValue.length];
        int length = binaryValue.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = Byte.valueOf(binaryValue[i]);
        }
        return bArr;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return (Object[]) typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public JsonDeserializer<Object> getContentDeserializer() {
        return this._elementDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) {
        return this._emptyValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object handleNonArray(com.fasterxml.jackson.core.JsonParser r10, com.fasterxml.jackson.databind.DeserializationContext r11) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer.handleNonArray(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):java.lang.Object");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return this._elementDeserializer == null && this._elementTypeDeserializer == null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Array;
    }

    public ObjectArrayDeserializer withResolved(TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider, Boolean bool) {
        return (Objects.equals(bool, this._unwrapSingle) && nullValueProvider == this._nullProvider && jsonDeserializer == this._elementDeserializer && typeDeserializer == this._elementTypeDeserializer) ? this : new ObjectArrayDeserializer(this, jsonDeserializer, typeDeserializer, nullValueProvider, bool);
    }

    public ObjectArrayDeserializer(ObjectArrayDeserializer objectArrayDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider, Boolean bool) {
        super(objectArrayDeserializer, nullValueProvider, bool);
        this._elementClass = objectArrayDeserializer._elementClass;
        this._untyped = objectArrayDeserializer._untyped;
        this._emptyValue = objectArrayDeserializer._emptyValue;
        this._elementDeserializer = jsonDeserializer;
        this._elementTypeDeserializer = typeDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonMappingException {
        Object[] objArrCompleteAndClearBuffer;
        Object objDeserializeWithType;
        int i;
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext);
        }
        ObjectBuffer objectBufferLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] objArrResetAndStart = objectBufferLeaseObjectBuffer.resetAndStart();
        TypeDeserializer typeDeserializer = this._elementTypeDeserializer;
        int i2 = 0;
        while (true) {
            try {
                JsonToken jsonTokenNextToken = jsonParser.nextToken();
                if (jsonTokenNextToken == JsonToken.END_ARRAY) {
                    break;
                }
                try {
                    if (jsonTokenNextToken == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else {
                        JsonDeserializer<Object> jsonDeserializer = this._elementDeserializer;
                        if (typeDeserializer == null) {
                            objDeserializeWithType = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                        } else {
                            objDeserializeWithType = jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                        }
                    }
                    objArrResetAndStart[i2] = objDeserializeWithType;
                    i2 = i;
                } catch (Exception e) {
                    e = e;
                    i2 = i;
                    throw JsonMappingException.wrapWithPath(e, objArrResetAndStart, objectBufferLeaseObjectBuffer.bufferedSize() + i2);
                }
                if (i2 >= objArrResetAndStart.length) {
                    objArrResetAndStart = objectBufferLeaseObjectBuffer.appendCompletedChunk(objArrResetAndStart);
                    i2 = 0;
                }
                i = i2 + 1;
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (this._untyped) {
            objArrCompleteAndClearBuffer = objectBufferLeaseObjectBuffer.completeAndClearBuffer(objArrResetAndStart, i2);
        } else {
            objArrCompleteAndClearBuffer = objectBufferLeaseObjectBuffer.completeAndClearBuffer(objArrResetAndStart, i2, this._elementClass);
        }
        deserializationContext.returnObjectBuffer(objectBufferLeaseObjectBuffer);
        return objArrCompleteAndClearBuffer;
    }
}
