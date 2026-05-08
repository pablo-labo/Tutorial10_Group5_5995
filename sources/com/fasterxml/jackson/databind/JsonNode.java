package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JsonNode extends JsonSerializable.Base implements TreeNode, Iterable<JsonNode> {
    public boolean asBoolean() {
        return asBoolean(false);
    }

    public double asDouble() {
        return asDouble(0.0d);
    }

    public int asInt() {
        return asInt(0);
    }

    public long asLong() {
        return asLong(0L);
    }

    public abstract String asText();

    public BigInteger bigIntegerValue() {
        return BigInteger.ZERO;
    }

    public byte[] binaryValue() {
        return null;
    }

    public boolean booleanValue() {
        return false;
    }

    public boolean canConvertToInt() {
        return false;
    }

    public boolean canConvertToLong() {
        return false;
    }

    public BigDecimal decimalValue() {
        return BigDecimal.ZERO;
    }

    public double doubleValue() {
        return 0.0d;
    }

    public Iterator<JsonNode> elements() {
        return ClassUtil.emptyIterator();
    }

    public abstract boolean equals(Object obj);

    public Iterator<String> fieldNames() {
        return ClassUtil.emptyIterator();
    }

    public Iterator<Map.Entry<String, JsonNode>> fields() {
        return ClassUtil.emptyIterator();
    }

    public float floatValue() {
        return 0.0f;
    }

    public JsonNode get(String str) {
        return null;
    }

    public abstract JsonNodeType getNodeType();

    public boolean has(String str) {
        return get(str) != null;
    }

    public int intValue() {
        return 0;
    }

    public boolean isArray() {
        return false;
    }

    public final boolean isBinary() {
        return getNodeType() == JsonNodeType.BINARY;
    }

    public final boolean isBoolean() {
        return getNodeType() == JsonNodeType.BOOLEAN;
    }

    public boolean isDouble() {
        return false;
    }

    public boolean isFloat() {
        return false;
    }

    public boolean isInt() {
        return false;
    }

    public boolean isIntegralNumber() {
        return false;
    }

    public boolean isLong() {
        return false;
    }

    public final boolean isNull() {
        return getNodeType() == JsonNodeType.NULL;
    }

    public final boolean isNumber() {
        return getNodeType() == JsonNodeType.NUMBER;
    }

    public boolean isObject() {
        return false;
    }

    public final boolean isPojo() {
        return getNodeType() == JsonNodeType.POJO;
    }

    public final boolean isTextual() {
        return getNodeType() == JsonNodeType.STRING;
    }

    @Override // java.lang.Iterable
    public final Iterator<JsonNode> iterator() {
        return elements();
    }

    public long longValue() {
        return 0L;
    }

    public Number numberValue() {
        return null;
    }

    public int size() {
        return 0;
    }

    public String textValue() {
        return null;
    }

    public boolean asBoolean(boolean z) {
        return z;
    }

    public int asInt(int i) {
        return i;
    }

    public double asDouble(double d) {
        return d;
    }

    public long asLong(long j) {
        return j;
    }
}
