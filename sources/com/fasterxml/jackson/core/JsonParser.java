package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.fasterxml.jackson.core.util.RequestPayload;
import defpackage.l5;
import java.io.Closeable;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JsonParser implements Closeable {
    protected static final JacksonFeatureSet<StreamReadCapability> DEFAULT_READ_CAPABILITIES = JacksonFeatureSet.fromDefaults(StreamReadCapability.values());
    protected int _features;
    protected transient RequestPayload _requestPayload;

    public enum Feature {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS(false),
        ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        ALLOW_MISSING_VALUES(false),
        ALLOW_TRAILING_COMMA(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        INCLUDE_SOURCE_IN_LOCATION(false),
        USE_FAST_DOUBLE_PARSER(false),
        USE_FAST_BIG_NUMBER_PARSER(false);

        private final boolean _defaultState;
        private final int _mask = 1 << ordinal();

        Feature(boolean z) {
            this._defaultState = z;
        }

        public static int collectDefaults() {
            int mask = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    mask |= feature.getMask();
                }
            }
            return mask;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i) {
            return (this._mask & i) != 0;
        }

        public int getMask() {
            return this._mask;
        }
    }

    public enum NumberType {
        INT,
        LONG,
        BIG_INTEGER,
        FLOAT,
        DOUBLE,
        BIG_DECIMAL
    }

    public enum NumberTypeFP {
        FLOAT16,
        FLOAT32,
        DOUBLE64,
        BIG_DECIMAL,
        UNKNOWN
    }

    public JsonParser() {
        this._features = JsonFactory.DEFAULT_PARSER_FEATURE_FLAGS;
    }

    public JsonParseException _constructError(String str) {
        return new JsonParseException(this, str).withRequestPayload(this._requestPayload);
    }

    public JsonParseException _constructReadException(String str, Throwable th) {
        JsonParseException jsonParseException = new JsonParseException(this, str, th);
        RequestPayload requestPayload = this._requestPayload;
        return requestPayload != null ? jsonParseException.withRequestPayload(requestPayload) : jsonParseException;
    }

    public void _reportUnsupportedOperation() {
        throw new UnsupportedOperationException("Operation not supported by parser of type ".concat(getClass().getName()));
    }

    public void assignCurrentValue(Object obj) {
        JsonStreamContext parsingContext = getParsingContext();
        if (parsingContext != null) {
            parsingContext.setCurrentValue(obj);
        }
    }

    public boolean canReadObjectId() {
        return false;
    }

    public boolean canReadTypeId() {
        return false;
    }

    public abstract void clearCurrentToken();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public JsonLocation currentLocation() {
        return getCurrentLocation();
    }

    public String currentName() {
        return getCurrentName();
    }

    public JsonToken currentToken() {
        return getCurrentToken();
    }

    public int currentTokenId() {
        return getCurrentTokenId();
    }

    public JsonLocation currentTokenLocation() {
        return getTokenLocation();
    }

    public abstract BigInteger getBigIntegerValue();

    public byte[] getBinaryValue() {
        return getBinaryValue(Base64Variants.getDefaultVariant());
    }

    public abstract byte[] getBinaryValue(Base64Variant base64Variant);

    public boolean getBooleanValue() throws JsonParseException {
        JsonToken jsonTokenCurrentToken = currentToken();
        if (jsonTokenCurrentToken == JsonToken.VALUE_TRUE) {
            return true;
        }
        if (jsonTokenCurrentToken == JsonToken.VALUE_FALSE) {
            return false;
        }
        throw new JsonParseException(this, "Current token (" + jsonTokenCurrentToken + ") not of boolean type").withRequestPayload(this._requestPayload);
    }

    public byte getByteValue() throws InputCoercionException {
        int intValue = getIntValue();
        if (intValue < -128 || intValue > 255) {
            throw new InputCoercionException(this, l5.m("Numeric value (", getText(), ") out of range of Java byte"), JsonToken.VALUE_NUMBER_INT, Byte.TYPE);
        }
        return (byte) intValue;
    }

    public abstract ObjectCodec getCodec();

    @Deprecated
    public abstract JsonLocation getCurrentLocation();

    @Deprecated
    public abstract String getCurrentName();

    public abstract JsonToken getCurrentToken();

    @Deprecated
    public abstract int getCurrentTokenId();

    public abstract BigDecimal getDecimalValue();

    public abstract double getDoubleValue();

    public Object getEmbeddedObject() {
        return null;
    }

    public abstract float getFloatValue();

    public abstract int getIntValue();

    public abstract long getLongValue();

    public abstract NumberType getNumberType();

    public NumberTypeFP getNumberTypeFP() {
        NumberType numberType = getNumberType();
        return numberType == NumberType.BIG_DECIMAL ? NumberTypeFP.BIG_DECIMAL : numberType == NumberType.DOUBLE ? NumberTypeFP.DOUBLE64 : numberType == NumberType.FLOAT ? NumberTypeFP.FLOAT32 : NumberTypeFP.UNKNOWN;
    }

    public abstract Number getNumberValue();

    public Object getNumberValueDeferred() {
        return getNumberValue();
    }

    public Object getObjectId() {
        return null;
    }

    public abstract JsonStreamContext getParsingContext();

    public JacksonFeatureSet<StreamReadCapability> getReadCapabilities() {
        return DEFAULT_READ_CAPABILITIES;
    }

    public short getShortValue() throws InputCoercionException {
        int intValue = getIntValue();
        if (intValue < -32768 || intValue > 32767) {
            throw new InputCoercionException(this, l5.m("Numeric value (", getText(), ") out of range of Java short"), JsonToken.VALUE_NUMBER_INT, Short.TYPE);
        }
        return (short) intValue;
    }

    public abstract String getText();

    public abstract char[] getTextCharacters();

    public abstract int getTextLength();

    public abstract int getTextOffset();

    @Deprecated
    public abstract JsonLocation getTokenLocation();

    public Object getTypeId() {
        return null;
    }

    public int getValueAsInt() {
        return getValueAsInt(0);
    }

    public long getValueAsLong() {
        return getValueAsLong(0L);
    }

    public String getValueAsString() {
        return getValueAsString(null);
    }

    public abstract String getValueAsString(String str);

    public abstract boolean hasCurrentToken();

    public abstract boolean hasTextCharacters();

    public abstract boolean hasToken(JsonToken jsonToken);

    public abstract boolean hasTokenId(int i);

    public boolean isEnabled(StreamReadFeature streamReadFeature) {
        return streamReadFeature.mappedFeature().enabledIn(this._features);
    }

    public boolean isExpectedNumberIntToken() {
        return currentToken() == JsonToken.VALUE_NUMBER_INT;
    }

    public boolean isExpectedStartArrayToken() {
        return currentToken() == JsonToken.START_ARRAY;
    }

    public boolean isExpectedStartObjectToken() {
        return currentToken() == JsonToken.START_OBJECT;
    }

    public boolean isNaN() {
        return false;
    }

    public String nextFieldName() {
        if (nextToken() == JsonToken.FIELD_NAME) {
            return currentName();
        }
        return null;
    }

    public String nextTextValue() {
        if (nextToken() == JsonToken.VALUE_STRING) {
            return getText();
        }
        return null;
    }

    public abstract JsonToken nextToken();

    public JsonParser overrideFormatFeatures(int i, int i2) {
        return this;
    }

    public JsonParser overrideStdFeatures(int i, int i2) {
        return setFeatureMask((i & i2) | (this._features & (~i2)));
    }

    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) {
        _reportUnsupportedOperation();
        return 0;
    }

    public int releaseBuffered(OutputStream outputStream) {
        return -1;
    }

    public boolean requiresCustomCodec() {
        return false;
    }

    @Deprecated
    public JsonParser setFeatureMask(int i) {
        this._features = i;
        return this;
    }

    public void setSchema(FormatSchema formatSchema) {
        throw new UnsupportedOperationException("Parser of type " + getClass().getName() + " does not support schema of type '" + formatSchema.getSchemaType() + "'");
    }

    public abstract JsonParser skipChildren();

    public StreamReadConstraints streamReadConstraints() {
        return StreamReadConstraints.defaults();
    }

    public int releaseBuffered(Writer writer) {
        return -1;
    }

    public int getValueAsInt(int i) {
        return i;
    }

    public long getValueAsLong(long j) {
        return j;
    }

    public JsonParser(int i) {
        this._features = i;
    }

    public boolean isEnabled(Feature feature) {
        return feature.enabledIn(this._features);
    }

    public JsonParseException _constructReadException(String str, Object obj) {
        return _constructReadException(String.format(str, obj));
    }

    public JsonParseException _constructReadException(String str, Object obj, Object obj2) {
        return _constructReadException(String.format(str, obj, obj2));
    }

    public JsonParseException _constructReadException(String str) {
        return _constructError(str);
    }

    public JsonParseException _constructReadException(String str, JsonLocation jsonLocation) {
        JsonParseException jsonParseException = new JsonParseException(this, str, jsonLocation);
        RequestPayload requestPayload = this._requestPayload;
        return requestPayload != null ? jsonParseException.withRequestPayload(requestPayload) : jsonParseException;
    }
}
