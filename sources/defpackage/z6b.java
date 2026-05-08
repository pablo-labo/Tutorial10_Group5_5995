package defpackage;

import com.wlproctor.util.ProctorPayloadConversionException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public final class z6b {
    public static final JsonArray a(List<? extends Object> list) throws ProctorPayloadConversionException {
        List<? extends Object> list2 = list;
        ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
        for (Object obj : list2) {
            JsonElement jsonElementC = c(obj);
            if (jsonElementC == null) {
                if (obj instanceof Map) {
                    jsonElementC = b((Map) obj);
                } else {
                    if (!(obj instanceof List)) {
                        throw new ProctorPayloadConversionException(t40.i(obj, "list contains unsupported value "));
                    }
                    jsonElementC = a((List) obj);
                }
            }
            arrayList.add(jsonElementC);
        }
        return new JsonArray(arrayList);
    }

    public static final JsonObject b(Map<String, ? extends Object> map) throws ProctorPayloadConversionException {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kc9.V(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            JsonElement jsonElementC = c(value);
            if (jsonElementC == null) {
                if (value instanceof Map) {
                    jsonElementC = b((Map) value);
                } else {
                    if (!(value instanceof List)) {
                        throw new ProctorPayloadConversionException(t40.i(value, "map contains unsupported value "));
                    }
                    jsonElementC = a((List) value);
                }
            }
            linkedHashMap.put(key, jsonElementC);
        }
        return new JsonObject(linkedHashMap);
    }

    public static final JsonPrimitive c(Object obj) {
        if (obj instanceof Number) {
            return la8.b((Number) obj);
        }
        if (obj instanceof String) {
            return la8.c((String) obj);
        }
        if (obj instanceof Boolean) {
            return la8.a((Boolean) obj);
        }
        return null;
    }

    public static final ArrayList d(JsonArray jsonArray) throws ProctorPayloadConversionException {
        Object objE;
        ArrayList arrayList = new ArrayList(t92.r0(jsonArray, 10));
        for (JsonElement jsonElement : jsonArray.a) {
            if (jsonElement instanceof JsonPrimitive) {
                objE = f((JsonPrimitive) jsonElement);
            } else if (jsonElement instanceof JsonArray) {
                objE = d((JsonArray) jsonElement);
            } else {
                if (!(jsonElement instanceof JsonObject)) {
                    l.g();
                    return null;
                }
                objE = e((JsonObject) jsonElement);
            }
            arrayList.add(objE);
        }
        return arrayList;
    }

    public static final LinkedHashMap e(JsonObject jsonObject) throws ProctorPayloadConversionException {
        Object objE;
        jsonObject.getClass();
        Map<String, JsonElement> map = jsonObject.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kc9.V(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            JsonElement jsonElement = (JsonElement) entry.getValue();
            if (jsonElement instanceof JsonPrimitive) {
                objE = f((JsonPrimitive) jsonElement);
            } else if (jsonElement instanceof JsonArray) {
                objE = d((JsonArray) jsonElement);
            } else {
                if (!(jsonElement instanceof JsonObject)) {
                    l.g();
                    return null;
                }
                objE = e((JsonObject) jsonElement);
            }
            linkedHashMap.put(key, objE);
        }
        return linkedHashMap;
    }

    public static final Object f(JsonPrimitive jsonPrimitive) throws ProctorPayloadConversionException {
        if (jsonPrimitive instanceof JsonNull) {
            throw new ProctorPayloadConversionException("JsonNull is not supported");
        }
        if (jsonPrimitive.b()) {
            return jsonPrimitive.a();
        }
        wd7 wd7Var = la8.a;
        Boolean boolB = jve.b(jsonPrimitive.a());
        return boolB == null ? Double.valueOf(Double.parseDouble(jsonPrimitive.a())) : boolB;
    }
}
