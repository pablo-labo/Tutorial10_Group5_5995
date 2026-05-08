package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rw7 {
    public static final rw7 e = new rw7(null, false);
    public final lma a;
    public final p2a b;
    public final boolean c;
    public final boolean d;

    public rw7(lma lmaVar, p2a p2aVar, boolean z, boolean z2) {
        this.a = lmaVar;
        this.b = p2aVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw7)) {
            return false;
        }
        rw7 rw7Var = (rw7) obj;
        return this.a == rw7Var.a && this.b == rw7Var.b && this.c == rw7Var.c && this.d == rw7Var.d;
    }

    public final int hashCode() {
        lma lmaVar = this.a;
        int iHashCode = (lmaVar == null ? 0 : lmaVar.hashCode()) * 31;
        p2a p2aVar = this.b;
        return Boolean.hashCode(this.d) + ia.f((iHashCode + (p2aVar != null ? p2aVar.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaTypeQualifiers(nullability=");
        sb.append(this.a);
        sb.append(", mutability=");
        sb.append(this.b);
        sb.append(", definitelyNotNull=");
        sb.append(this.c);
        sb.append(", isNullabilityQualifierForWarning=");
        return m6.i(sb, this.d, ')');
    }

    public /* synthetic */ rw7(lma lmaVar, boolean z) {
        this(lmaVar, null, z, false);
    }
}
