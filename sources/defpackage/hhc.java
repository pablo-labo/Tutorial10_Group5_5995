package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import defpackage.s98;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class hhc {
    public static final WritableMap a(lr7 lr7Var, String str) {
        JsonElement jsonObject;
        JsonElement jsonObject2;
        lr7Var.getClass();
        str.getClass();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        writableMapCreateMap.putString("testName", str);
        writableMapCreateMap.putInt("value", lr7Var.a);
        nr7 nr7Var = lr7Var.b;
        String strB = null;
        if (nr7Var != null) {
            String strA = nr7Var.a();
            if (strA != null) {
                jsonObject = la8.c(strA);
            } else {
                Long l = nr7Var.c;
                if (l != null) {
                    jsonObject = la8.b(Long.valueOf(l.longValue()));
                } else {
                    Double d = nr7Var.a;
                    if (d != null) {
                        jsonObject = la8.b(Double.valueOf(d.doubleValue()));
                    } else {
                        List<String> list = nr7Var.f;
                        if (list != null) {
                            List<String> list2 = list;
                            ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(la8.c((String) it.next()));
                            }
                            jsonObject2 = new JsonArray(arrayList);
                        } else {
                            List<Long> list3 = nr7Var.d;
                            if (list3 != null) {
                                List<Long> list4 = list3;
                                ArrayList arrayList2 = new ArrayList(t92.r0(list4, 10));
                                Iterator<T> it2 = list4.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(la8.b((Number) it2.next()));
                                }
                                jsonObject2 = new JsonArray(arrayList2);
                            } else {
                                List<Double> list5 = nr7Var.b;
                                if (list5 != null) {
                                    List<Double> list6 = list5;
                                    ArrayList arrayList3 = new ArrayList(t92.r0(list6, 10));
                                    Iterator<T> it3 = list6.iterator();
                                    while (it3.hasNext()) {
                                        arrayList3.add(la8.b((Number) it3.next()));
                                    }
                                    jsonObject2 = new JsonArray(arrayList3);
                                } else {
                                    Map<String, Object> map = nr7Var.g;
                                    if (map != null) {
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        for (Map.Entry<String, Object> entry : map.entrySet()) {
                                            String key = entry.getKey();
                                            JsonElement jsonElementA = t98.a(entry.getValue());
                                            key.getClass();
                                            jsonElementA.getClass();
                                        }
                                        jsonObject2 = new JsonObject(linkedHashMap);
                                    } else {
                                        Map<String, Object> map2 = nr7Var.h;
                                        if (map2 != null) {
                                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                            for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
                                                String key2 = entry2.getKey();
                                                JsonElement jsonElementA2 = t98.a(entry2.getValue());
                                                key2.getClass();
                                                jsonElementA2.getClass();
                                            }
                                            jsonObject = new JsonObject(linkedHashMap2);
                                        } else {
                                            jsonObject = JsonNull.INSTANCE;
                                        }
                                    }
                                }
                            }
                        }
                        jsonObject = jsonObject2;
                    }
                }
            }
            if (!(jsonObject instanceof JsonNull)) {
                s98.a aVar = s98.d;
                aVar.getClass();
                strB = aVar.b(JsonElement.Companion.serializer(), jsonObject);
            }
        }
        writableMapCreateMap.putString("payload", strB);
        return writableMapCreateMap;
    }
}
