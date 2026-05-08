package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class erh extends krh {
    private final int zzc;
    private final int zzd;

    public erh(byte[] bArr, int i, int i2) {
        super(bArr);
        prh.g(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // defpackage.krh, defpackage.prh
    public final byte a(int i) {
        int i2 = this.zzd;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[this.zzc + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(p6.c(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(k20.l("Index > length: ", i, i2, ", "));
    }

    @Override // defpackage.krh, defpackage.prh
    public final byte b(int i) {
        return this.zza[this.zzc + i];
    }

    @Override // defpackage.krh, defpackage.prh
    public final int c() {
        return this.zzd;
    }

    @Override // defpackage.krh, defpackage.prh
    public final void d(int i, byte[] bArr) {
        System.arraycopy(this.zza, this.zzc, bArr, 0, i);
    }

    @Override // defpackage.krh
    public final int k() {
        return this.zzc;
    }
}
