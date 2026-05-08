package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class TextNode extends ValueNode {
    static final TextNode EMPTY_STRING_NODE = new TextNode("");
    private static final long serialVersionUID = 2;
    protected final String _value;

    public TextNode(String str) {
        this._value = str;
    }

    public static TextNode valueOf(String str) {
        if (str == null) {
            return null;
        }
        return str.isEmpty() ? EMPTY_STRING_NODE : new TextNode(str);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean asBoolean(boolean z) {
        String str = this._value;
        if (str != null) {
            String strTrim = str.trim();
            if ("true".equals(strTrim)) {
                return true;
            }
            if ("false".equals(strTrim)) {
                return false;
            }
        }
        return z;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public double asDouble(double d) {
        return NumberInput.parseAsDouble(this._value, d);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public int asInt(int i) {
        return NumberInput.parseAsInt(this._value, i);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public long asLong(long j) {
        return NumberInput.parseAsLong(this._value, j);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.core.TreeNode
    public JsonToken asToken() {
        return JsonToken.VALUE_STRING;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public byte[] binaryValue() {
        return getBinaryValue(Base64Variants.getDefaultVariant());
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof TextNode)) {
            return Objects.equals(((TextNode) obj)._value, this._value);
        }
        return false;
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) throws InvalidFormatException {
        String strTrim = this._value.trim();
        ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder(Math.max(16, Math.min(65536, ((strTrim.length() >> 2) * 3) + 4)));
        try {
            base64Variant.decode(strTrim, byteArrayBuilder);
            return byteArrayBuilder.toByteArray();
        } catch (IllegalArgumentException e) {
            throw InvalidFormatException.from(null, "Cannot access contents of TextNode as binary due to broken Base64 encoding: " + e.getMessage(), strTrim, byte[].class);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.STRING;
    }

    public int hashCode() {
        return Objects.hashCode(this._value);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        String str = this._value;
        if (str == null) {
            jsonGenerator.writeNull();
        } else {
            jsonGenerator.writeString(str);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String textValue() {
        return this._value;
    }
}
