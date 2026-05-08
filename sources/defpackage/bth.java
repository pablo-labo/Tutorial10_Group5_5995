package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class bth extends nth {
    public final long a;

    public bth(long j) {
        this.a = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        nth nthVar = (nth) obj;
        if (zza() != nthVar.zza()) {
            return zza() - nthVar.zza();
        }
        long jAbs = Math.abs(this.a);
        long jAbs2 = Math.abs(((bth) nthVar).a);
        if (jAbs < jAbs2) {
            return -1;
        }
        return jAbs > jAbs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && bth.class == obj.getClass() && this.a == ((bth) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.a)});
    }

    public final String toString() {
        return Long.toString(this.a);
    }

    @Override // defpackage.nth
    public final int zza() {
        return nth.e(this.a >= 0 ? (byte) 0 : (byte) 32);
    }
}
