package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q5i implements g3i {
    public final l3i a;
    public final String b;
    public final Object[] c;
    public final int d;

    public q5i(l3i l3iVar, String str, Object[] objArr) {
        this.a = l3iVar;
        this.b = str;
        this.c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // defpackage.g3i
    public final int zza() {
        return (this.d & 1) == 1 ? 1 : 2;
    }

    @Override // defpackage.g3i
    public final boolean zzb() {
        return (this.d & 2) == 2;
    }

    @Override // defpackage.g3i
    public final l3i zzc() {
        return this.a;
    }
}
