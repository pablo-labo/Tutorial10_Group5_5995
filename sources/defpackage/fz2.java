package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class fz2 {
    public static final pxc a = new pxc("\\s*;\\s*");
    public static final pxc b = new pxc("\\s*:\\s*");
    public static final pxc c = new pxc("\\s*&\\s*");
    public static final pxc d = new pxc("\\s*=\\s*");

    public static LinkedHashMap a(String str) {
        List<String> listG = a.g(str, 0);
        ArrayList arrayList = new ArrayList(t92.r0(listG, 10));
        Iterator<T> it = listG.iterator();
        while (it.hasNext()) {
            arrayList.add(d.g(zve.e0((String) it.next()), 0));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((List) obj).size() == 2) {
                arrayList2.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList2) {
            String str2 = (String) ((List) obj2).get(0);
            Object arrayList3 = linkedHashMap.get(str2);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(str2, arrayList3);
            }
            ((List) arrayList3).add(obj2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kc9.V(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), Integer.valueOf(((List) entry.getValue()).size()));
        }
        return linkedHashMap2;
    }
}
