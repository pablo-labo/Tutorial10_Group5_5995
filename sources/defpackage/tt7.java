package defpackage;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.avro.b;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final class tt7 {
    public static void a(Object obj, TokenBuffer tokenBuffer) {
        if (obj == b.a) {
            tokenBuffer.writeNull();
            return;
        }
        if (obj instanceof Map) {
            tokenBuffer.writeStartObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                tokenBuffer.writeFieldName(entry.getKey().toString());
                a(entry.getValue(), tokenBuffer);
            }
            tokenBuffer.writeEndObject();
            return;
        }
        if (obj instanceof Collection) {
            tokenBuffer.writeStartArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                a(it.next(), tokenBuffer);
            }
            tokenBuffer.writeEndArray();
            return;
        }
        if (obj instanceof byte[]) {
            tokenBuffer.writeBinary((byte[]) obj);
            return;
        }
        if ((obj instanceof CharSequence) || (obj instanceof Enum)) {
            tokenBuffer.writeString(obj.toString());
            return;
        }
        if (obj instanceof Double) {
            tokenBuffer.writeNumber(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Float) {
            tokenBuffer.writeNumber(((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Long) {
            tokenBuffer.writeNumber(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Integer) {
            tokenBuffer.writeNumber(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Boolean) {
            tokenBuffer.writeBoolean(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof BigInteger) {
            tokenBuffer.writeNumber((BigInteger) obj);
        } else if (obj instanceof BigDecimal) {
            tokenBuffer.writeNumber((BigDecimal) obj);
        } else {
            r40.m("Unknown datum class: ".concat(String.valueOf(obj.getClass())));
        }
    }

    public static Object b(JsonNode jsonNode, g gVar) {
        if (gVar != null && gVar.K().equals(g.u.UNION)) {
            return b(jsonNode, gVar.L().get(0));
        }
        if (jsonNode == null) {
            return null;
        }
        if (jsonNode.isNull()) {
            return b.a;
        }
        if (jsonNode.isBoolean()) {
            return Boolean.valueOf(jsonNode.asBoolean());
        }
        if (jsonNode.isInt()) {
            if (gVar == null || gVar.K().equals(g.u.INT)) {
                return Integer.valueOf(jsonNode.asInt());
            }
            if (gVar.K().equals(g.u.LONG)) {
                return Long.valueOf(jsonNode.asLong());
            }
            if (gVar.K().equals(g.u.FLOAT)) {
                return Float.valueOf((float) jsonNode.asDouble());
            }
            if (gVar.K().equals(g.u.DOUBLE)) {
                return Double.valueOf(jsonNode.asDouble());
            }
        } else if (jsonNode.isLong()) {
            if (gVar == null || gVar.K().equals(g.u.LONG)) {
                return Long.valueOf(jsonNode.asLong());
            }
            if (gVar.K().equals(g.u.INT)) {
                return jsonNode.canConvertToInt() ? Integer.valueOf(jsonNode.asInt()) : Long.valueOf(jsonNode.asLong());
            }
            if (gVar.K().equals(g.u.FLOAT)) {
                return Float.valueOf((float) jsonNode.asDouble());
            }
            if (gVar.K().equals(g.u.DOUBLE)) {
                return Double.valueOf(jsonNode.asDouble());
            }
        } else if (jsonNode.isDouble() || jsonNode.isFloat()) {
            if (gVar == null) {
                return jsonNode.isDouble() ? Double.valueOf(jsonNode.doubleValue()) : Float.valueOf(jsonNode.floatValue());
            }
            if (gVar.K().equals(g.u.DOUBLE)) {
                return Double.valueOf(jsonNode.doubleValue());
            }
            if (gVar.K().equals(g.u.FLOAT)) {
                return Float.valueOf(jsonNode.floatValue());
            }
        } else {
            if (jsonNode.isBinary()) {
                try {
                    return jsonNode.binaryValue();
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            if (jsonNode.isTextual()) {
                if (gVar == null || gVar.K().equals(g.u.STRING) || gVar.K().equals(g.u.ENUM)) {
                    return jsonNode.asText();
                }
                if (gVar.K().equals(g.u.BYTES) || gVar.K().equals(g.u.FIXED)) {
                    return jsonNode.textValue().getBytes(StandardCharsets.ISO_8859_1);
                }
            } else {
                if (jsonNode.isArray()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<JsonNode> it = jsonNode.iterator();
                    while (it.hasNext()) {
                        arrayList.add(b(it.next(), gVar == null ? null : gVar.x()));
                    }
                    return arrayList;
                }
                if (jsonNode.isObject()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator<String> itFieldNames = jsonNode.fieldNames();
                    while (itFieldNames.hasNext()) {
                        String next = itFieldNames.next();
                        linkedHashMap.put(next, b(jsonNode.get(next), (gVar == null || !gVar.K().equals(g.u.MAP)) ? (gVar == null || !gVar.K().equals(g.u.RECORD)) ? null : gVar.B(next).d : gVar.M()));
                    }
                    return linkedHashMap;
                }
            }
        }
        return null;
    }
}
