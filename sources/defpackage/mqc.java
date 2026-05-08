package defpackage;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public final class mqc {
    public static final ra8 a = sa8.a(new xr(10));

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
        }
    }

    public static JsonArray a(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            switch (a.a[readableArray.getType(i).ordinal()]) {
                case 1:
                    JsonNull jsonNull = JsonNull.INSTANCE;
                    jsonNull.getClass();
                    arrayList.add(jsonNull);
                    break;
                case 2:
                    JsonPrimitive jsonPrimitiveA = la8.a(Boolean.valueOf(readableArray.getBoolean(i)));
                    jsonPrimitiveA.getClass();
                    arrayList.add(jsonPrimitiveA);
                    break;
                case 3:
                    double d = readableArray.getDouble(i);
                    int i2 = (int) d;
                    if (d == i2) {
                        JsonPrimitive jsonPrimitiveB = la8.b(Integer.valueOf(i2));
                        jsonPrimitiveB.getClass();
                        arrayList.add(jsonPrimitiveB);
                    } else {
                        JsonPrimitive jsonPrimitiveB2 = la8.b(Double.valueOf(d));
                        jsonPrimitiveB2.getClass();
                        arrayList.add(jsonPrimitiveB2);
                    }
                    break;
                case 4:
                    JsonPrimitive jsonPrimitiveC = la8.c(readableArray.getString(i));
                    jsonPrimitiveC.getClass();
                    arrayList.add(jsonPrimitiveC);
                    break;
                case 5:
                    ReadableMap map = readableArray.getMap(i);
                    if (map != null) {
                        arrayList.add(b(map));
                    }
                    break;
                case 6:
                    ReadableArray array = readableArray.getArray(i);
                    if (array != null) {
                        arrayList.add(a(array));
                    }
                    break;
                default:
                    l.g();
                    return null;
            }
        }
        return new JsonArray(arrayList);
    }

    public static JsonObject b(ReadableMap readableMap) {
        okc okcVar = new okc(1);
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            switch (a.a[readableMap.getType(strNextKey).ordinal()]) {
                case 1:
                    okcVar.b(strNextKey, JsonNull.INSTANCE);
                    break;
                case 2:
                    okcVar.b(strNextKey, la8.a(Boolean.valueOf(readableMap.getBoolean(strNextKey))));
                    break;
                case 3:
                    double d = readableMap.getDouble(strNextKey);
                    int i = (int) d;
                    if (d != i) {
                        okcVar.b(strNextKey, la8.b(Double.valueOf(d)));
                    } else {
                        okcVar.b(strNextKey, la8.b(Integer.valueOf(i)));
                    }
                    break;
                case 4:
                    okcVar.b(strNextKey, la8.c(readableMap.getString(strNextKey)));
                    break;
                case 5:
                    ReadableMap map = readableMap.getMap(strNextKey);
                    if (map != null) {
                        okcVar.b(strNextKey, b(map));
                    }
                    j6g j6gVar = j6g.a;
                    break;
                case 6:
                    ReadableArray array = readableMap.getArray(strNextKey);
                    if (array != null) {
                        okcVar.b(strNextKey, a(array));
                    }
                    j6g j6gVar2 = j6g.a;
                    break;
                default:
                    l.g();
                    return null;
            }
        }
        return new JsonObject((LinkedHashMap) okcVar.a);
    }
}
