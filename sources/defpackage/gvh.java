package defpackage;

import com.google.android.gms.internal.play_billing.a;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public class gvh extends dvh {
    protected final byte[] zza;

    public gvh(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // defpackage.ivh
    public byte a(int i) {
        return this.zza[i];
    }

    @Override // defpackage.ivh
    public byte b(int i) {
        return this.zza[i];
    }

    @Override // defpackage.ivh
    public int c() {
        return this.zza.length;
    }

    @Override // defpackage.ivh
    public final int d(int i, int i2) {
        byte[] bArr = this.zza;
        Charset charset = ezh.a;
        for (int i3 = 0; i3 < i2; i3++) {
            i = (i * 31) + bArr[i3];
        }
        return i;
    }

    @Override // defpackage.ivh
    public final gvh e() {
        ivh.g(47, c());
        return new avh(this.zza, 47);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ivh) && c() == ((ivh) obj).c()) {
            if (c() == 0) {
                return true;
            }
            if (!(obj instanceof gvh)) {
                return obj.equals(this);
            }
            gvh gvhVar = (gvh) obj;
            int i = i();
            int i2 = gvhVar.i();
            if (i == 0 || i2 == 0 || i == i2) {
                int iC = c();
                if (iC > gvhVar.c()) {
                    l6.l(iC, c());
                    return false;
                }
                if (iC > gvhVar.c()) {
                    l5.q(k20.l("Ran off end of other: 0, ", iC, gvhVar.c(), ", "));
                    return false;
                }
                byte[] bArr = this.zza;
                byte[] bArr2 = gvhVar.zza;
                int i3 = 0;
                int i4 = 0;
                while (i3 < iC) {
                    if (bArr[i3] == bArr2[i4]) {
                        i3++;
                        i4++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ivh
    public final void f(a aVar) {
        aVar.v(c(), this.zza);
    }
}
