package defpackage;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class krh extends grh {
    protected final byte[] zza;

    public krh(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // defpackage.prh
    public byte a(int i) {
        return this.zza[i];
    }

    @Override // defpackage.prh
    public byte b(int i) {
        return this.zza[i];
    }

    @Override // defpackage.prh
    public int c() {
        return this.zza.length;
    }

    @Override // defpackage.prh
    public void d(int i, byte[] bArr) {
        System.arraycopy(this.zza, 0, bArr, 0, i);
    }

    @Override // defpackage.prh
    public final int e(int i, int i2) {
        byte[] bArr = this.zza;
        int iK = k();
        byte[] bArr2 = osh.a;
        for (int i3 = iK; i3 < iK + i2; i3++) {
            i = (i * 31) + bArr[i3];
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof prh) && c() == ((prh) obj).c()) {
            if (c() == 0) {
                return true;
            }
            if (!(obj instanceof krh)) {
                return obj.equals(this);
            }
            krh krhVar = (krh) obj;
            int i = i();
            int i2 = krhVar.i();
            if (i == 0 || i2 == 0 || i == i2) {
                int iC = c();
                if (iC > krhVar.c()) {
                    l6.l(iC, c());
                    return false;
                }
                if (iC > krhVar.c()) {
                    l5.q(k20.l("Ran off end of other: 0, ", iC, krhVar.c(), ", "));
                    return false;
                }
                byte[] bArr = this.zza;
                byte[] bArr2 = krhVar.zza;
                int iK = k() + iC;
                int iK2 = k();
                int iK3 = krhVar.k();
                while (iK2 < iK) {
                    if (bArr[iK2] == bArr2[iK3]) {
                        iK2++;
                        iK3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.prh
    public final krh f(int i, int i2) {
        int iG = prh.g(i, i2, c());
        return iG == 0 ? prh.a : new erh(this.zza, k() + i, iG);
    }

    public int k() {
        return 0;
    }

    public final ByteArrayInputStream l() {
        return new ByteArrayInputStream(this.zza, k(), c());
    }

    public final ByteBuffer m() {
        return ByteBuffer.wrap(this.zza, k(), c()).asReadOnlyBuffer();
    }
}
