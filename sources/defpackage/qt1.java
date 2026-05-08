package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class qt1 {
    public static final pxc b = new pxc("ApolloCacheReference\\{(.*)\\}");
    public static final qt1 c = new qt1("QUERY_ROOT");
    public final String a;

    public qt1(String str, ArrayList arrayList) {
        str.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        this.a = sb.toString();
    }

    public final boolean equals(Object obj) {
        qt1 qt1Var = obj instanceof qt1 ? (qt1) obj : null;
        return wl7.b(this.a, qt1Var != null ? qt1Var.a : null);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return w40.f(new StringBuilder("CacheKey("), this.a, ')');
    }

    public qt1(String str) {
        str.getClass();
        this.a = str;
    }
}
