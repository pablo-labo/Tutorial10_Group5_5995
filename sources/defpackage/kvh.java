package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kvh extends yvh {
    private final int zzc;
    private final int zzd;

    public kvh(byte[] bArr, int i, int i2) {
        super(bArr);
        fvh.j(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // defpackage.yvh, defpackage.fvh
    public final byte a(int i) {
        int i2 = this.zzd;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zzb[this.zzc + i];
        }
        if (i >= 0) {
            throw new ArrayIndexOutOfBoundsException(uz.d(40, i, i2, "Index > length: ", ", "));
        }
        StringBuilder sb = new StringBuilder(22);
        sb.append("Index < 0: ");
        sb.append(i);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    @Override // defpackage.yvh, defpackage.fvh
    public final int b() {
        return this.zzd;
    }

    @Override // defpackage.yvh, defpackage.fvh
    public final byte i(int i) {
        return this.zzb[this.zzc + i];
    }

    @Override // defpackage.yvh
    public final int l() {
        return this.zzc;
    }
}
