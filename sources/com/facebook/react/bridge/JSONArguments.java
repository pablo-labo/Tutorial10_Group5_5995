package com.facebook.react.bridge;

import defpackage.l5;
import defpackage.p6;
import java.util.Iterator;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\nH\u0007¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/bridge/JSONArguments;", "", "<init>", "()V", "fromJSONObject", "Lcom/facebook/react/bridge/ReadableMap;", "obj", "Lorg/json/JSONObject;", "fromJSONObjectString", "objStr", "", "fromJSONArray", "Lcom/facebook/react/bridge/ReadableArray;", "arr", "Lorg/json/JSONArray;", "fromJSONArrayString", "arrStr", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JSONArguments {
    public static final JSONArguments INSTANCE = new JSONArguments();

    private JSONArguments() {
    }

    public static final ReadableArray fromJSONArray(JSONArray arr) throws JSONException {
        arr.getClass();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.getClass();
        ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(writableArrayCreateArray);
        int length = arr.length();
        for (int i = 0; i < length; i++) {
            Object obj = arr.get(i);
            if (obj instanceof JSONObject) {
                readableArrayBuilder.add(fromJSONObject((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                readableArrayBuilder.add(fromJSONArray((JSONArray) obj));
            } else if (obj instanceof String) {
                readableArrayBuilder.add((String) obj);
            } else if (obj instanceof Boolean) {
                readableArrayBuilder.add(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                readableArrayBuilder.add(((Number) obj).intValue());
            } else if (obj instanceof Double) {
                readableArrayBuilder.add(((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                readableArrayBuilder.add((int) ((Number) obj).longValue());
            } else {
                if (!arr.isNull(i)) {
                    throw new JSONException(p6.c(i, "Unexpected value when parsing JSON array. index: "));
                }
                readableArrayBuilder.addNull();
            }
        }
        return writableArrayCreateArray;
    }

    public static final ReadableArray fromJSONArrayString(String arrStr) {
        arrStr.getClass();
        return fromJSONArray(new JSONArray(arrStr));
    }

    public static final ReadableMap fromJSONObject(JSONObject obj) throws JSONException {
        obj.getClass();
        Iterator<String> itKeys = obj.keys();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj2 = obj.get(next);
            if (obj2 instanceof JSONObject) {
                next.getClass();
                readableMapBuilder.put(next, fromJSONObject((JSONObject) obj2));
            } else if (obj2 instanceof JSONArray) {
                next.getClass();
                readableMapBuilder.put(next, fromJSONArray((JSONArray) obj2));
            } else if (obj2 instanceof String) {
                next.getClass();
                readableMapBuilder.put(next, (String) obj2);
            } else if (obj2 instanceof Boolean) {
                next.getClass();
                readableMapBuilder.put(next, ((Boolean) obj2).booleanValue());
            } else if (obj2 instanceof Integer) {
                next.getClass();
                readableMapBuilder.put(next, ((Number) obj2).intValue());
            } else if (obj2 instanceof Double) {
                next.getClass();
                readableMapBuilder.put(next, ((Number) obj2).doubleValue());
            } else if (obj2 instanceof Long) {
                next.getClass();
                readableMapBuilder.put(next, (int) ((Number) obj2).longValue());
            } else {
                if (!obj.isNull(next)) {
                    throw new JSONException(l5.l("Unexpected value when parsing JSON object. key: ", next));
                }
                next.getClass();
                readableMapBuilder.putNull(next);
            }
        }
        return writableMapCreateMap;
    }

    public static final ReadableMap fromJSONObjectString(String objStr) {
        objStr.getClass();
        return fromJSONObject(new JSONObject(objStr));
    }
}
