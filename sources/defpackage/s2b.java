package defpackage;

import defpackage.r2b;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s2b<Key, Value> {
    public final List<r2b.b.c<Key, Value>> a;
    public final Integer b;
    public final h4 c;
    public final int d;

    public s2b(List<r2b.b.c<Key, Value>> list, Integer num, h4 h4Var, int i) {
        this.a = list;
        this.b = num;
        this.c = h4Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s2b)) {
            return false;
        }
        s2b s2bVar = (s2b) obj;
        return this.a.equals(s2bVar.a) && wl7.b(this.b, s2bVar.b) && this.c == s2bVar.c && this.d == s2bVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        Integer num = this.b;
        return Integer.hashCode(this.d) + this.c.hashCode() + iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingState(pages=");
        sb.append(this.a);
        sb.append(", anchorPosition=");
        sb.append(this.b);
        sb.append(", config=");
        sb.append(this.c);
        sb.append(", leadingPlaceholderCount=");
        return k6.h(sb, this.d, ')');
    }
}
