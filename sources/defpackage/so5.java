package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class so5 {
    public final ArrayList a;

    public so5(po5... po5VarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (po5 po5Var : po5VarArr) {
            String strB = po5Var.b();
            Object arrayList = linkedHashMap.get(strB);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strB, arrayList);
            }
            ((List) arrayList).add(po5Var);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() != 1) {
                h5.k(w40.f(akb.m("'", str, "' must be unique. Actual [ ["), z92.W0(list, null, null, null, null, 63), ']'));
                throw null;
            }
            w92.w0(arrayList2, list);
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        this.a = arrayList3;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            ((po5) arrayList3.get(i)).getClass();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof so5) {
            return wl7.b(this.a, ((so5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
