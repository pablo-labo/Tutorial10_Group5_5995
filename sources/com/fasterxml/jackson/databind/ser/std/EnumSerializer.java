package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.EnumNamingStrategy;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.EnumNamingStrategyFactory;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.EnumValues;
import defpackage.l6;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@JacksonStdImpl
public class EnumSerializer extends StdScalarSerializer<Enum<?>> implements ContextualSerializer {
    private static final long serialVersionUID = 1;
    protected final Boolean _serializeAsIndex;
    protected final EnumValues _values;
    protected final EnumValues _valuesByEnumNaming;
    protected final EnumValues _valuesByToString;

    public EnumSerializer(EnumValues enumValues, Boolean bool, EnumValues enumValues2, EnumValues enumValues3) {
        super(enumValues.getEnumClass(), false);
        this._values = enumValues;
        this._serializeAsIndex = bool;
        this._valuesByEnumNaming = enumValues2;
        this._valuesByToString = enumValues3;
    }

    public static Boolean _isShapeWrittenUsingIndex(Class<?> cls, JsonFormat.Value value, boolean z, Boolean bool) {
        JsonFormat.Shape shape = value == null ? null : value.getShape();
        if (shape == null || shape == JsonFormat.Shape.ANY || shape == JsonFormat.Shape.SCALAR) {
            return bool;
        }
        if (shape == JsonFormat.Shape.STRING || shape == JsonFormat.Shape.NATURAL) {
            return Boolean.FALSE;
        }
        if (shape.isNumeric() || shape == JsonFormat.Shape.ARRAY) {
            return Boolean.TRUE;
        }
        String name = cls.getName();
        String str = z ? "class" : "property";
        StringBuilder sb = new StringBuilder("Unsupported serialization shape (");
        sb.append(shape);
        sb.append(") for Enum ");
        sb.append(name);
        sb.append(", not supported as ");
        throw new IllegalArgumentException(l6.i(sb, str, " annotation"));
    }

    public static EnumSerializer construct(Class<?> cls, SerializationConfig serializationConfig, BeanDescription beanDescription, JsonFormat.Value value) {
        return new EnumSerializer(EnumValues.constructFromName(serializationConfig, beanDescription.getClassInfo()), _isShapeWrittenUsingIndex(cls, value, true, null), constructEnumNamingStrategyValues(serializationConfig, cls, beanDescription.getClassInfo()), EnumValues.constructFromToString(serializationConfig, beanDescription.getClassInfo()));
    }

    public static EnumValues constructEnumNamingStrategyValues(SerializationConfig serializationConfig, Class<Enum<?>> cls, AnnotatedClass annotatedClass) {
        EnumNamingStrategy enumNamingStrategyCreateEnumNamingStrategyInstance = EnumNamingStrategyFactory.createEnumNamingStrategyInstance(serializationConfig.getAnnotationIntrospector().findEnumNamingStrategy(serializationConfig, annotatedClass), serializationConfig.canOverrideAccessModifiers());
        if (enumNamingStrategyCreateEnumNamingStrategyInstance == null) {
            return null;
        }
        return EnumValues.constructUsingEnumNamingStrategy(serializationConfig, annotatedClass, enumNamingStrategyCreateEnumNamingStrategyInstance);
    }

    public final boolean _serializeAsIndex(SerializerProvider serializerProvider) {
        Boolean bool = this._serializeAsIndex;
        return bool != null ? bool.booleanValue() : serializerProvider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        if (_serializeAsIndex(jsonFormatVisitorWrapper.getProvider())) {
            visitIntFormat(jsonFormatVisitorWrapper, javaType, JsonParser.NumberType.INT);
        } else {
            jsonFormatVisitorWrapper.expectStringFormat(javaType);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, handledType());
        if (valueFindFormatOverrides != null) {
            Boolean bool_isShapeWrittenUsingIndex = _isShapeWrittenUsingIndex(handledType(), valueFindFormatOverrides, false, this._serializeAsIndex);
            if (!Objects.equals(bool_isShapeWrittenUsingIndex, this._serializeAsIndex)) {
                return new EnumSerializer(this._values, bool_isShapeWrittenUsingIndex, this._valuesByEnumNaming, this._valuesByToString);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.jsonschema.SchemaAware
    @Deprecated
    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        if (_serializeAsIndex(serializerProvider)) {
            return createSchemaNode("integer", true);
        }
        ObjectNode objectNodeCreateSchemaNode = createSchemaNode("string", true);
        if (type != null && serializerProvider.constructType(type).isEnumType()) {
            ArrayNode arrayNodePutArray = objectNodeCreateSchemaNode.putArray("enum");
            Iterator<SerializableString> it = this._values.values().iterator();
            while (it.hasNext()) {
                arrayNodePutArray.add(it.next().getValue());
            }
        }
        return objectNodeCreateSchemaNode;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void serialize(Enum<?> r2, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        EnumValues enumValues = this._valuesByEnumNaming;
        if (enumValues != null) {
            jsonGenerator.writeString(enumValues.serializedValueFor(r2));
            return;
        }
        if (_serializeAsIndex(serializerProvider)) {
            jsonGenerator.writeNumber(r2.ordinal());
        } else if (serializerProvider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
            jsonGenerator.writeString(this._valuesByToString.serializedValueFor(r2));
        } else {
            jsonGenerator.writeString(this._values.serializedValueFor(r2));
        }
    }
}
