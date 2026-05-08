package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class u3b implements Iterable<Pair<? extends String, ? extends b>>, ze8 {
    public static final u3b b = new u3b(bs4.a);
    public final Map<String, b> a;

    public static final class a {
        public final LinkedHashMap a;

        public a(u3b u3bVar) {
            this.a = lc9.i0(u3bVar.a);
        }
    }

    public static final class b {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Entry(value=null, memoryCacheKey=null)";
        }
    }

    public u3b(Map<String, b> map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u3b) {
            return wl7.b(this.a, ((u3b) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<Pair<? extends String, ? extends b>> iterator() {
        Map<String, b> map = this.a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, b> entry : map.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.a + ')';
    }
}
