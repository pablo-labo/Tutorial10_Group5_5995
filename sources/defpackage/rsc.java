package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rsc {

    public static final class a extends rsc {
        public final Map<String, lsc> a;
        public final int b;
        public final boolean c;

        public a(int i, Map map, boolean z) {
            this.a = map;
            this.b = i;
            this.c = z;
        }

        public static a b(a aVar, LinkedHashMap linkedHashMap, int i) {
            Map<String, lsc> map = linkedHashMap;
            if ((i & 1) != 0) {
                map = aVar.a;
            }
            int i2 = aVar.b;
            boolean z = (i & 4) != 0 ? aVar.c : true;
            map.getClass();
            return new a(i2, map, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + w40.c(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FoundSearches(recentSearches=");
            sb.append(this.a);
            sb.append(", numToShowUnexpanded=");
            sb.append(this.b);
            sb.append(", isExpanded=");
            return z3.o(sb, this.c, ")");
        }
    }

    public static final class b extends rsc {
        public static final b a = new b();
    }

    public final List<lsc> a() {
        if (!(this instanceof a)) {
            return zr4.a;
        }
        List listZ1 = z92.z1(((a) this).a.values());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listZ1) {
            if (!((lsc) obj).e) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
