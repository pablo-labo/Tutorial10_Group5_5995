package defpackage;

import defpackage.v33;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m21 extends v33.e.d.a.b.AbstractC0445d {
    public final String a;
    public final int b;
    public final List<v33.e.d.a.b.AbstractC0445d.AbstractC0446a> c;

    public m21() {
        throw null;
    }

    public m21(int i, String str, List list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    @Override // v33.e.d.a.b.AbstractC0445d
    public final List<v33.e.d.a.b.AbstractC0445d.AbstractC0446a> a() {
        return this.c;
    }

    @Override // v33.e.d.a.b.AbstractC0445d
    public final int b() {
        return this.b;
    }

    @Override // v33.e.d.a.b.AbstractC0445d
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v33.e.d.a.b.AbstractC0445d)) {
            return false;
        }
        v33.e.d.a.b.AbstractC0445d abstractC0445d = (v33.e.d.a.b.AbstractC0445d) obj;
        return this.a.equals(abstractC0445d.c()) && this.b == abstractC0445d.b() && this.c.equals(abstractC0445d.a());
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Thread{name=");
        sb.append(this.a);
        sb.append(", importance=");
        sb.append(this.b);
        sb.append(", frames=");
        return g7.i(sb, this.c, "}");
    }
}
