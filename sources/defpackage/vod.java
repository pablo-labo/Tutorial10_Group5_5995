package defpackage;

import defpackage.m7f;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vod {

    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ak2.i((Integer) ((Map.Entry) t).getKey(), (Integer) ((Map.Entry) t2).getKey());
        }
    }

    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ak2.i((Integer) ((Map.Entry) t).getKey(), (Integer) ((Map.Entry) t2).getKey());
        }
    }

    public static final List<kp5> a(iid iidVar) {
        int iF = q92.f("id", iidVar);
        int iF2 = q92.f("seq", iidVar);
        int iF3 = q92.f("from", iidVar);
        int iF4 = q92.f("to", iidVar);
        iy8 iy8VarS = u63.s();
        while (iidVar.M1()) {
            iy8VarS.add(new kp5(iidVar.r1(iF3), (int) iidVar.getLong(iF), (int) iidVar.getLong(iF2), iidVar.r1(iF4)));
        }
        return z92.o1(iy8VarS.l());
    }

    public static final m7f.d b(zhd zhdVar, String str, boolean z) {
        iid iidVarQ1 = zhdVar.Q1("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iF = q92.f("seqno", iidVarQ1);
            int iF2 = q92.f("cid", iidVarQ1);
            int iF3 = q92.f("name", iidVarQ1);
            int iF4 = q92.f("desc", iidVarQ1);
            if (iF != -1 && iF2 != -1 && iF3 != -1 && iF4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (iidVarQ1.M1()) {
                    if (((int) iidVarQ1.getLong(iF2)) >= 0) {
                        int i = (int) iidVarQ1.getLong(iF);
                        String strR1 = iidVarQ1.r1(iF3);
                        String str2 = iidVarQ1.getLong(iF4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), strR1);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List listP1 = z92.p1(linkedHashMap.entrySet(), new a());
                ArrayList arrayList = new ArrayList(t92.r0(listP1, 10));
                Iterator it = listP1.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listZ1 = z92.z1(arrayList);
                List listP12 = z92.p1(linkedHashMap2.entrySet(), new b());
                ArrayList arrayList2 = new ArrayList(t92.r0(listP12, 10));
                Iterator it2 = listP12.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                m7f.d dVar = new m7f.d(str, z, listZ1, z92.z1(arrayList2));
                pi3.d(iidVarQ1, null);
                return dVar;
            }
            pi3.d(iidVarQ1, null);
            return null;
        } finally {
        }
    }
}
