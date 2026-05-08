package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class wsh extends nth {
    public final boolean a;

    public wsh(boolean z) {
        this.a = z;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        nth nthVar = (nth) obj;
        int iZza = nthVar.zza();
        int iE = nth.e((byte) -32);
        if (iE != iZza) {
            return iE - nthVar.zza();
        }
        return (true != this.a ? 20 : 21) - (true != ((wsh) nthVar).a ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && wsh.class == obj.getClass() && this.a == ((wsh) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(nth.e((byte) -32)), Boolean.valueOf(this.a)});
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }

    @Override // defpackage.nth
    public final int zza() {
        return nth.e((byte) -32);
    }
}
