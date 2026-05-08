package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vdd implements ua7 {
    public final boolean a;
    public final float b;
    public final long c;

    public static final class a implements oa2 {
        public a() {
        }

        @Override // defpackage.oa2
        public final long a() {
            return vdd.this.c;
        }
    }

    public vdd(boolean z, float f, long j) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // defpackage.ua7
    public final ts3 a(ei7 ei7Var) {
        return new wt3(ei7Var, this.a, this.b, new a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdd)) {
            return false;
        }
        vdd vddVar = (vdd) obj;
        if (this.a == vddVar.a && j94.c(this.b, vddVar.b)) {
            return da2.c(this.c, vddVar.c);
        }
        return false;
    }

    @Override // defpackage.ua7
    public final int hashCode() {
        int iC = k6.c(Boolean.hashCode(this.a) * 31, this.b, 961);
        int i = da2.j;
        return Long.hashCode(this.c) + iC;
    }
}
