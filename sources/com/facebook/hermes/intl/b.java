package com.facebook.hermes.intl;

import android.icu.util.ULocale;
import com.facebook.hermes.intl.a;
import defpackage.d6g;
import defpackage.f19;
import defpackage.g19;
import defpackage.wo7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static HashMap a(List list, HashMap map, List list2) throws JSRangeErrorException {
        a.C0127a c0127aB;
        Object obj;
        HashMap map2 = new HashMap();
        if (((String) wo7.a(map, "localeMatcher")).equals("lookup")) {
            String[] strArr = (String[]) list.toArray(new String[list.size()]);
            String[] strArrD = a.d();
            c0127aB = new a.C0127a();
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    c0127aB.a = new g19(ULocale.getDefault(ULocale.Category.FORMAT));
                    break;
                }
                g19 g19VarA = f19.a(strArr[i]);
                String strA = a.a(g19VarA.g().toLanguageTag(), strArrD);
                if (!strA.isEmpty()) {
                    c0127aB.a = f19.a(strA);
                    c0127aB.b = g19VarA.mo34a();
                    break;
                }
                i++;
            }
        } else {
            c0127aB = a.b((String[]) list.toArray(new String[list.size()]));
        }
        HashSet<String> hashSet = new HashSet();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            boolean zIsEmpty = c0127aB.b.isEmpty();
            wo7.a aVar = wo7.b;
            if (zIsEmpty || !c0127aB.b.containsKey(str)) {
                obj = aVar;
            } else {
                String str2 = c0127aB.b.get(str);
                boolean zIsEmpty2 = str2.isEmpty();
                String str3 = str2;
                if (zIsEmpty2) {
                    str3 = "true";
                }
                hashSet.add(str);
                obj = str3;
            }
            Object obj2 = obj;
            if (map.containsKey(str)) {
                Object objA = wo7.a(map, str);
                boolean z = objA instanceof String;
                Object obj3 = objA;
                if (z) {
                    boolean zIsEmpty3 = ((String) objA).isEmpty();
                    obj3 = objA;
                    if (zIsEmpty3) {
                        obj3 = Boolean.TRUE;
                    }
                }
                obj2 = obj;
                if (!(obj3 instanceof wo7.b)) {
                    boolean zEquals = obj3.equals(obj);
                    obj2 = obj;
                    if (!zEquals) {
                        hashSet.remove(str);
                        obj2 = obj3;
                    }
                }
            }
            boolean z2 = obj2 instanceof wo7.a;
            Object objC = obj2;
            if (!z2) {
                objC = d6g.c(obj2, str);
            }
            if (!(objC instanceof String) || d6g.a(str, (String) objC, c0127aB.a)) {
                map2.put(str, objC);
            } else {
                map2.put(str, aVar);
            }
        }
        for (String str4 : hashSet) {
            ArrayList<String> arrayList = new ArrayList<>();
            String str5 = (String) d6g.c(c0127aB.b.get(str4), str4);
            if (str5 == null || d6g.a(str4, str5, c0127aB.a)) {
                arrayList.add(str5);
                c0127aB.a.d(str4, arrayList);
            }
        }
        map2.put("locale", c0127aB.a);
        return map2;
    }
}
