package defpackage;

import defpackage.v33;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i21 extends v33.e.d.a.b {
    public final List<v33.e.d.a.b.AbstractC0445d> a;
    public final v33.e.d.a.b.AbstractC0444b b;
    public final v33.a c;
    public final v33.e.d.a.b.c d;
    public final List<v33.e.d.a.b.AbstractC0443a> e;

    public i21() {
        throw null;
    }

    public i21(List list, k21 k21Var, v33.a aVar, l21 l21Var, List list2) {
        this.a = list;
        this.b = k21Var;
        this.c = aVar;
        this.d = l21Var;
        this.e = list2;
    }

    @Override // v33.e.d.a.b
    public final v33.a a() {
        return this.c;
    }

    @Override // v33.e.d.a.b
    public final List<v33.e.d.a.b.AbstractC0443a> b() {
        return this.e;
    }

    @Override // v33.e.d.a.b
    public final v33.e.d.a.b.AbstractC0444b c() {
        return this.b;
    }

    @Override // v33.e.d.a.b
    public final v33.e.d.a.b.c d() {
        return this.d;
    }

    @Override // v33.e.d.a.b
    public final List<v33.e.d.a.b.AbstractC0445d> e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v33.e.d.a.b)) {
            return false;
        }
        v33.e.d.a.b bVar = (v33.e.d.a.b) obj;
        List<v33.e.d.a.b.AbstractC0445d> list = this.a;
        if (list == null) {
            if (bVar.e() != null) {
                return false;
            }
        } else if (!list.equals(bVar.e())) {
            return false;
        }
        v33.e.d.a.b.AbstractC0444b abstractC0444b = this.b;
        if (abstractC0444b == null) {
            if (bVar.c() != null) {
                return false;
            }
        } else if (!abstractC0444b.equals(bVar.c())) {
            return false;
        }
        v33.a aVar = this.c;
        if (aVar == null) {
            if (bVar.a() != null) {
                return false;
            }
        } else if (!aVar.equals(bVar.a())) {
            return false;
        }
        return this.d.equals(bVar.d()) && this.e.equals(bVar.b());
    }

    public final int hashCode() {
        List<v33.e.d.a.b.AbstractC0445d> list = this.a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        v33.e.d.a.b.AbstractC0444b abstractC0444b = this.b;
        int iHashCode2 = (iHashCode ^ (abstractC0444b == null ? 0 : abstractC0444b.hashCode())) * 1000003;
        v33.a aVar = this.c;
        return this.e.hashCode() ^ (((((aVar != null ? aVar.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Execution{threads=");
        sb.append(this.a);
        sb.append(", exception=");
        sb.append(this.b);
        sb.append(", appExitInfo=");
        sb.append(this.c);
        sb.append(", signal=");
        sb.append(this.d);
        sb.append(", binaries=");
        return g7.i(sb, this.e, "}");
    }
}
