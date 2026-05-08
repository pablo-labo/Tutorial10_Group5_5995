package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class hth extends nth {
    public final String a;

    public hth(String str) {
        this.a = str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        nth nthVar = (nth) obj;
        int iZza = nthVar.zza();
        int iE = nth.e((byte) 96);
        if (iE != iZza) {
            return iE - nthVar.zza();
        }
        String str = this.a;
        int length = str.length();
        String str2 = ((hth) nthVar).a;
        return length != str2.length() ? str.length() - str2.length() : str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hth.class == obj.getClass()) {
            return this.a.equals(((hth) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(nth.e((byte) 96)), this.a});
    }

    public final String toString() {
        return l5.m("\"", this.a, "\"");
    }

    @Override // defpackage.nth
    public final int zza() {
        return nth.e((byte) 96);
    }
}
