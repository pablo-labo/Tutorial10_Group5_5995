package defpackage;

import defpackage.v33;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k21 extends v33.e.d.a.b.AbstractC0444b {
    public final String a;
    public final String b;
    public final List<v33.e.d.a.b.AbstractC0445d.AbstractC0446a> c;
    public final v33.e.d.a.b.AbstractC0444b d;
    public final int e;

    public k21() {
        throw null;
    }

    public k21(String str, String str2, List list, v33.e.d.a.b.AbstractC0444b abstractC0444b, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = abstractC0444b;
        this.e = i;
    }

    @Override // v33.e.d.a.b.AbstractC0444b
    public final v33.e.d.a.b.AbstractC0444b a() {
        return this.d;
    }

    @Override // v33.e.d.a.b.AbstractC0444b
    public final List<v33.e.d.a.b.AbstractC0445d.AbstractC0446a> b() {
        return this.c;
    }

    @Override // v33.e.d.a.b.AbstractC0444b
    public final int c() {
        return this.e;
    }

    @Override // v33.e.d.a.b.AbstractC0444b
    public final String d() {
        return this.b;
    }

    @Override // v33.e.d.a.b.AbstractC0444b
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v33.e.d.a.b.AbstractC0444b)) {
            return false;
        }
        v33.e.d.a.b.AbstractC0444b abstractC0444b = (v33.e.d.a.b.AbstractC0444b) obj;
        if (!this.a.equals(abstractC0444b.e())) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (abstractC0444b.d() != null) {
                return false;
            }
        } else if (!str.equals(abstractC0444b.d())) {
            return false;
        }
        if (!this.c.equals(abstractC0444b.b())) {
            return false;
        }
        v33.e.d.a.b.AbstractC0444b abstractC0444b2 = this.d;
        if (abstractC0444b2 == null) {
            if (abstractC0444b.a() != null) {
                return false;
            }
        } else if (!abstractC0444b2.equals(abstractC0444b.a())) {
            return false;
        }
        return this.e == abstractC0444b.c();
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        v33.e.d.a.b.AbstractC0444b abstractC0444b = this.d;
        return this.e ^ ((iHashCode2 ^ (abstractC0444b != null ? abstractC0444b.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return w20.k(sb, this.e, "}");
    }
}
