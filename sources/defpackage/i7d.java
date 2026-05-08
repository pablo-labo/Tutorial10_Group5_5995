package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i7d {
    public final Double a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;

    public /* synthetic */ i7d(int i, boolean z) {
        this(null, false, 0, 0, (i & 16) != 0 ? false : z);
    }

    public static i7d a(i7d i7dVar, Double d, boolean z, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = i7dVar.c;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = i7dVar.d;
        }
        boolean z2 = i7dVar.e;
        i7dVar.getClass();
        return new i7d(d, z, i4, i2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7d)) {
            return false;
        }
        i7d i7dVar = (i7d) obj;
        return wl7.b(this.a, i7dVar.a) && this.b == i7dVar.b && this.c == i7dVar.c && this.d == i7dVar.d && this.e == i7dVar.e;
    }

    public final int hashCode() {
        Double d = this.a;
        return Boolean.hashCode(this.e) + w40.c(this.d, w40.c(this.c, ia.f((d == null ? 0 : d.hashCode()) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResponsivenessUiState(responsivenessRate=");
        sb.append(this.a);
        sb.append(", isEarned=");
        sb.append(this.b);
        sb.append(", employerOutreaches=");
        uz.i(sb, this.c, ", jobseekerResponses=", this.d, ", isEnabled=");
        return z3.o(sb, this.e, ")");
    }

    public i7d() {
        this(31, false);
    }

    public i7d(Double d, boolean z, int i, int i2, boolean z2) {
        this.a = d;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = z2;
    }
}
