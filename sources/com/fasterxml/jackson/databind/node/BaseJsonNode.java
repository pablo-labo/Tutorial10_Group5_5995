package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.StreamReadConstraints;
import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.util.ExceptionUtil;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseJsonNode extends JsonNode implements Serializable {
    private static final long serialVersionUID = 1;

    public BigInteger _bigIntFromBigDec(BigDecimal bigDecimal) {
        try {
            StreamReadConstraints.defaults().validateBigIntegerScale(bigDecimal.scale());
        } catch (StreamConstraintsException e) {
            ExceptionUtil.throwSneaky(e);
        }
        return bigDecimal.toBigInteger();
    }

    @Override // com.fasterxml.jackson.core.TreeNode
    public JsonParser.NumberType numberType() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable
    public abstract void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider);

    public String toString() {
        return InternalNodeMapper.nodeToString(this);
    }

    public Object writeReplace() {
        return NodeSerialization.from(this);
    }
}
