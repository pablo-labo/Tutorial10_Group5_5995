package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class t98 {
    public static JsonElement a(Object obj) {
        if (obj == null) {
            return JsonNull.INSTANCE;
        }
        if (obj instanceof JsonElement) {
            return (JsonElement) obj;
        }
        if (obj instanceof String) {
            return la8.c((String) obj);
        }
        if (obj instanceof Number) {
            return la8.b((Number) obj);
        }
        if (obj instanceof Boolean) {
            return la8.a((Boolean) obj);
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(t92.r0(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            return new JsonArray(arrayList);
        }
        if (!(obj instanceof Map)) {
            return la8.c(obj.toString());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key instanceof String) {
                linkedHashMap.put(key, value);
            } else {
                linkedHashMap.put(String.valueOf(key), value);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            JsonElement jsonElementA = a(entry2.getValue());
            str.getClass();
            jsonElementA.getClass();
        }
        return new JsonObject(linkedHashMap2);
    }

    public static WritableArray b(Object[] objArr) {
        objArr.getClass();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.getClass();
        for (Object obj : objArr) {
            if (obj instanceof Map) {
                writableArrayCreateArray.pushMap(g((Map) obj));
            } else if (obj instanceof Object[]) {
                writableArrayCreateArray.pushArray(b((Object[]) obj));
            } else if (obj instanceof Boolean) {
                writableArrayCreateArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                writableArrayCreateArray.pushInt(((Number) obj).intValue());
            } else if (obj instanceof Double) {
                writableArrayCreateArray.pushDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                writableArrayCreateArray.pushString((String) obj);
            }
        }
        return writableArrayCreateArray;
    }

    public static WritableArray c(JsonArray jsonArray) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.getClass();
        for (JsonElement jsonElement : jsonArray.a) {
            if (jsonElement instanceof JsonNull) {
                writableArrayCreateArray.pushNull();
            } else if (jsonElement instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
                if (jsonPrimitive.b()) {
                    writableArrayCreateArray.pushString(jsonPrimitive.a());
                } else {
                    wd7 wd7Var = la8.a;
                    if (jve.b(jsonPrimitive.a()) != null) {
                        Boolean boolB = jve.b(jsonPrimitive.a());
                        boolB.getClass();
                        writableArrayCreateArray.pushBoolean(boolB.booleanValue());
                    } else if (la8.e(jsonPrimitive) != null) {
                        Integer numE = la8.e(jsonPrimitive);
                        numE.getClass();
                        writableArrayCreateArray.pushInt(numE.intValue());
                    } else if (la8.h(jsonPrimitive) != null) {
                        la8.h(jsonPrimitive).getClass();
                        writableArrayCreateArray.pushDouble(r1.longValue());
                    } else if (vve.A(jsonPrimitive.a()) != null) {
                        Double dA = vve.A(jsonPrimitive.a());
                        dA.getClass();
                        writableArrayCreateArray.pushDouble(dA.doubleValue());
                    } else {
                        writableArrayCreateArray.pushString(jsonPrimitive.a());
                    }
                }
            } else if (jsonElement instanceof JsonObject) {
                writableArrayCreateArray.pushMap(d((JsonObject) jsonElement));
            } else {
                if (!(jsonElement instanceof JsonArray)) {
                    l.g();
                    return null;
                }
                writableArrayCreateArray.pushArray(c((JsonArray) jsonElement));
            }
        }
        return writableArrayCreateArray;
    }

    public static WritableMap d(JsonObject jsonObject) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        for (Map.Entry<String, JsonElement> entry : jsonObject.a.entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (value instanceof JsonNull) {
                writableMapCreateMap.putNull(key);
            } else if (value instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) value;
                if (jsonPrimitive.b()) {
                    writableMapCreateMap.putString(key, jsonPrimitive.a());
                } else {
                    wd7 wd7Var = la8.a;
                    if (jve.b(jsonPrimitive.a()) != null) {
                        Boolean boolB = jve.b(jsonPrimitive.a());
                        boolB.getClass();
                        writableMapCreateMap.putBoolean(key, boolB.booleanValue());
                    } else if (la8.e(jsonPrimitive) != null) {
                        Integer numE = la8.e(jsonPrimitive);
                        numE.getClass();
                        writableMapCreateMap.putInt(key, numE.intValue());
                    } else if (la8.h(jsonPrimitive) != null) {
                        la8.h(jsonPrimitive).getClass();
                        writableMapCreateMap.putDouble(key, r1.longValue());
                    } else if (vve.A(jsonPrimitive.a()) != null) {
                        Double dA = vve.A(jsonPrimitive.a());
                        dA.getClass();
                        writableMapCreateMap.putDouble(key, dA.doubleValue());
                    } else {
                        writableMapCreateMap.putString(key, jsonPrimitive.a());
                    }
                }
            } else if (value instanceof JsonObject) {
                writableMapCreateMap.putMap(key, d((JsonObject) value));
            } else {
                if (!(value instanceof JsonArray)) {
                    l.g();
                    return null;
                }
                writableMapCreateMap.putArray(key, c((JsonArray) value));
            }
        }
        return writableMapCreateMap;
    }

    public static WritableArray e(JSONArray jSONArray) throws JSONException {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.getClass();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj.equals(null)) {
                writableArrayCreateArray.pushNull();
            } else if (obj instanceof JSONObject) {
                writableArrayCreateArray.pushMap(f((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                writableArrayCreateArray.pushArray(e((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                writableArrayCreateArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                writableArrayCreateArray.pushInt(((Number) obj).intValue());
            } else if (obj instanceof Double) {
                writableArrayCreateArray.pushDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                writableArrayCreateArray.pushString((String) obj);
            } else {
                writableArrayCreateArray.pushString(obj.toString());
            }
        }
        return writableArrayCreateArray;
    }

    public static WritableMap f(JSONObject jSONObject) throws JSONException {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj.equals(null)) {
                next.getClass();
                writableMapCreateMap.putNull(next);
            } else if (obj instanceof JSONObject) {
                next.getClass();
                writableMapCreateMap.putMap(next, f((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                next.getClass();
                writableMapCreateMap.putArray(next, e((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                next.getClass();
                writableMapCreateMap.putBoolean(next, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                next.getClass();
                writableMapCreateMap.putInt(next, ((Number) obj).intValue());
            } else if (obj instanceof Double) {
                next.getClass();
                writableMapCreateMap.putDouble(next, ((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                next.getClass();
                writableMapCreateMap.putString(next, (String) obj);
            } else {
                next.getClass();
                writableMapCreateMap.putString(next, obj.toString());
            }
        }
        return writableMapCreateMap;
    }

    public static WritableMap g(Map map) {
        String string;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && (string = key.toString()) != null) {
                if (value instanceof Map) {
                    writableMapCreateMap.putMap(string, g((Map) value));
                } else if (value instanceof Object[]) {
                    writableMapCreateMap.putArray(string, b((Object[]) value));
                } else if (value instanceof List) {
                    writableMapCreateMap.putArray(string, b(((Collection) value).toArray(new Object[0])));
                } else if (value instanceof Boolean) {
                    writableMapCreateMap.putBoolean(string, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    writableMapCreateMap.putInt(string, ((Number) value).intValue());
                } else if (value instanceof Double) {
                    writableMapCreateMap.putDouble(string, ((Number) value).doubleValue());
                } else if (value instanceof String) {
                    writableMapCreateMap.putString(string, (String) value);
                } else {
                    writableMapCreateMap.putString(string, String.valueOf(value));
                }
            }
        }
        return writableMapCreateMap;
    }
}
