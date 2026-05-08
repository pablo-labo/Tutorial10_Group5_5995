package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@fd8
public final class ylf implements gd2 {
    public final long a;

    public /* synthetic */ ylf(long j) {
        this.a = j;
    }

    public static final long a(long j, long j2) {
        int i = ny9.b;
        if (((j2 - 1) | 1) != Long.MAX_VALUE) {
            return (1 | (j - 1)) == Long.MAX_VALUE ? ak2.s(j) : ak2.F(j, j2);
        }
        if (j != j2) {
            return wd4.r(ak2.s(j2));
        }
        int i2 = wd4.d;
        return 0L;
    }

    @Override // java.lang.Comparable
    public final int compareTo(gd2 gd2Var) {
        gd2 gd2Var2 = gd2Var;
        gd2Var2.getClass();
        boolean z = gd2Var2 instanceof ylf;
        long j = this.a;
        if (z) {
            return wd4.e(a(j, ((ylf) gd2Var2).a), 0L);
        }
        throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) ("ValueTimeMark(reading=" + j + ')')) + " and " + gd2Var2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ylf) {
            return this.a == ((ylf) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.a + ')';
    }
}
