package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import defpackage.l5;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DateTimeSerializerBase<T> extends StdScalarSerializer<T> implements ContextualSerializer {
    protected final DateFormat _customFormat;
    protected final AtomicReference<DateFormat> _reusedCustomFormat;
    protected final Boolean _useTimestamp;

    public DateTimeSerializerBase(Class<T> cls, Boolean bool, DateFormat dateFormat) {
        super(cls);
        this._useTimestamp = bool;
        this._customFormat = dateFormat;
        this._reusedCustomFormat = dateFormat == null ? null : new AtomicReference<>();
    }

    public void _acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, boolean z) {
        if (z) {
            visitIntFormat(jsonFormatVisitorWrapper, javaType, JsonParser.NumberType.LONG, JsonValueFormat.UTC_MILLISEC);
        } else {
            visitStringFormat(jsonFormatVisitorWrapper, javaType, JsonValueFormat.DATE_TIME);
        }
    }

    public boolean _asTimestamp(SerializerProvider serializerProvider) {
        Boolean bool = this._useTimestamp;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this._customFormat == null) {
            if (serializerProvider != null) {
                return serializerProvider.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            }
            l5.q("Null SerializerProvider passed for ".concat(handledType().getName()));
        }
        return false;
    }

    public void _serializeAsString(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (this._customFormat == null) {
            serializerProvider.defaultSerializeDateValue(date, jsonGenerator);
            return;
        }
        DateFormat andSet = this._reusedCustomFormat.getAndSet(null);
        if (andSet == null) {
            andSet = (DateFormat) this._customFormat.clone();
        }
        jsonGenerator.writeString(andSet.format(date));
        AtomicReference<DateFormat> atomicReference = this._reusedCustomFormat;
        while (!atomicReference.compareAndSet(null, andSet) && atomicReference.get() == null) {
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        _acceptJsonFormatVisitor(jsonFormatVisitorWrapper, javaType, _asTimestamp(jsonFormatVisitorWrapper.getProvider()));
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, handledType());
        if (valueFindFormatOverrides != null) {
            JsonFormat.Shape shape = valueFindFormatOverrides.getShape();
            if (shape.isNumeric()) {
                return withFormat2(Boolean.TRUE, null);
            }
            if (valueFindFormatOverrides.hasPattern()) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(valueFindFormatOverrides.getPattern(), valueFindFormatOverrides.hasLocale() ? valueFindFormatOverrides.getLocale() : serializerProvider.getLocale());
                simpleDateFormat.setTimeZone(valueFindFormatOverrides.hasTimeZone() ? valueFindFormatOverrides.getTimeZone() : serializerProvider.getTimeZone());
                return withFormat2(Boolean.FALSE, simpleDateFormat);
            }
            boolean zHasLocale = valueFindFormatOverrides.hasLocale();
            boolean zHasTimeZone = valueFindFormatOverrides.hasTimeZone();
            boolean z = shape == JsonFormat.Shape.STRING;
            if (zHasLocale || zHasTimeZone || z) {
                DateFormat dateFormat = serializerProvider.getConfig().getDateFormat();
                if (dateFormat instanceof StdDateFormat) {
                    StdDateFormat stdDateFormatWithTimeZone = (StdDateFormat) dateFormat;
                    if (valueFindFormatOverrides.hasLocale()) {
                        stdDateFormatWithTimeZone = stdDateFormatWithTimeZone.withLocale(valueFindFormatOverrides.getLocale());
                    }
                    if (valueFindFormatOverrides.hasTimeZone()) {
                        stdDateFormatWithTimeZone = stdDateFormatWithTimeZone.withTimeZone(valueFindFormatOverrides.getTimeZone());
                    }
                    return withFormat2(Boolean.FALSE, stdDateFormatWithTimeZone);
                }
                if (!(dateFormat instanceof SimpleDateFormat)) {
                    serializerProvider.reportBadDefinition((Class<?>) handledType(), "Configured `DateFormat` (" + dateFormat.getClass().getName() + ") not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`");
                }
                SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) dateFormat;
                SimpleDateFormat simpleDateFormat3 = zHasLocale ? new SimpleDateFormat(simpleDateFormat2.toPattern(), valueFindFormatOverrides.getLocale()) : (SimpleDateFormat) simpleDateFormat2.clone();
                TimeZone timeZone = valueFindFormatOverrides.getTimeZone();
                if (timeZone != null && !timeZone.equals(simpleDateFormat3.getTimeZone())) {
                    simpleDateFormat3.setTimeZone(timeZone);
                }
                return withFormat2(Boolean.FALSE, simpleDateFormat3);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.jsonschema.SchemaAware
    @Deprecated
    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode(_asTimestamp(serializerProvider) ? "number" : "string", true);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, T t) {
        return false;
    }

    /* JADX INFO: renamed from: withFormat */
    public abstract DateTimeSerializerBase<T> withFormat2(Boolean bool, DateFormat dateFormat);
}
