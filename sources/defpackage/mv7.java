package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mv7 {
    public static final mv7 d = new mv7(v2d.STRICT, 6);
    public final v2d a;
    public final cj8 b;
    public final v2d c;

    public mv7(v2d v2dVar, int i) {
        this(v2dVar, (i & 2) != 0 ? new cj8(1, 0, 0) : null, v2dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv7)) {
            return false;
        }
        mv7 mv7Var = (mv7) obj;
        return this.a == mv7Var.a && wl7.b(this.b, mv7Var.b) && this.c == mv7Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        cj8 cj8Var = this.b;
        return this.c.hashCode() + ((iHashCode + (cj8Var == null ? 0 : cj8Var.d)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.a + ", sinceVersion=" + this.b + ", reportLevelAfter=" + this.c + ')';
    }

    public mv7(v2d v2dVar, cj8 cj8Var, v2d v2dVar2) {
        this.a = v2dVar;
        this.b = cj8Var;
        this.c = v2dVar2;
    }
}
