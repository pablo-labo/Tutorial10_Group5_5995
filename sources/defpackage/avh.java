package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class avh extends gvh {
    private final int zzc;

    public avh(byte[] bArr, int i) {
        super(bArr);
        ivh.g(i, bArr.length);
        this.zzc = i;
    }

    @Override // defpackage.gvh, defpackage.ivh
    public final byte a(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return ((gvh) this).zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(p6.c(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(k20.l("Index > length: ", i, i2, ", "));
    }

    @Override // defpackage.gvh, defpackage.ivh
    public final byte b(int i) {
        return ((gvh) this).zza[i];
    }

    @Override // defpackage.gvh, defpackage.ivh
    public final int c() {
        return this.zzc;
    }
}
