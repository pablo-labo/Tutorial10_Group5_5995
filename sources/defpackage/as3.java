package defpackage;

import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class as3 {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashSet c;
    public final LinkedHashSet d;
    public boolean e;
    public boolean f;

    public as3() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        this.b = linkedHashMap;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.c = linkedHashSet;
        this.d = linkedHashSet;
        this.e = true;
    }

    public static void a(Map map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (map.containsKey(str) && pxf.f(map.get(str))) {
                Object obj = map.get(str);
                obj.getClass();
                Map mapB = pxf.b(obj);
                Map map3 = value instanceof Map ? (Map) value : null;
                if (map3 == null) {
                    n6.c("'", str, "' is an object in destination but not in map");
                    return;
                }
                a(mapB, map3);
            } else {
                map.put(str, value);
            }
        }
    }

    public final LinkedHashMap b(Map map) {
        Object obj;
        LinkedHashMap linkedHashMap = this.b;
        boolean zIsEmpty = linkedHashMap.isEmpty();
        LinkedHashMap linkedHashMap2 = this.a;
        if (zIsEmpty) {
            linkedHashMap2.putAll(map);
            return linkedHashMap;
        }
        Object obj2 = map.get("incremental");
        List<Map> list = obj2 instanceof List ? (List) obj2 : null;
        if (list == null) {
            this.f = true;
        } else {
            this.f = false;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map map2 : list) {
                Map map3 = (Map) map2.get("data");
                Object obj3 = map2.get("path");
                obj3.getClass();
                List list2 = (List) obj3;
                Object obj4 = linkedHashMap.get("data");
                obj4.getClass();
                Object obj5 = (Map) obj4;
                if (map3 != null) {
                    for (Object obj6 : list2) {
                        if (obj5 instanceof List) {
                            obj6.getClass();
                            obj = ((List) obj5).get(((Integer) obj6).intValue());
                        } else {
                            obj5.getClass();
                            obj = ((Map) obj5).get(obj6);
                        }
                        obj5 = obj;
                    }
                    obj5.getClass();
                    a(pxf.b(obj5), map3);
                    this.c.add(new zr3(list2, (String) map2.get("label")));
                }
                Object obj7 = map2.get(SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY);
                List list3 = obj7 instanceof List ? (List) obj7 : null;
                if (list3 != null) {
                    w92.w0(arrayList, list3);
                }
                Object obj8 = map2.get("extensions");
                Map map4 = obj8 instanceof Map ? (Map) obj8 : null;
                if (map4 != null) {
                    arrayList2.add(map4);
                }
            }
            if (arrayList.isEmpty()) {
                linkedHashMap2.remove(SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY);
            } else {
                linkedHashMap2.put(SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, arrayList);
            }
            if (arrayList2.isEmpty()) {
                linkedHashMap2.remove("extensions");
            } else {
                linkedHashMap2.put("extensions", kc9.W(new Pair("incremental", arrayList2)));
            }
        }
        Boolean bool = (Boolean) map.get("hasNext");
        this.e = bool != null ? bool.booleanValue() : false;
        return linkedHashMap;
    }
}
