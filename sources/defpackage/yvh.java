package defpackage;

import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.measurement.zzev;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public class yvh extends rvh {
    protected final byte[] zzb;

    public yvh(byte[] bArr) {
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // defpackage.fvh
    public byte a(int i) {
        return this.zzb[i];
    }

    @Override // defpackage.fvh
    public int b() {
        return this.zzb.length;
    }

    @Override // defpackage.fvh
    public final int c(int i, int i2) {
        byte[] bArr = this.zzb;
        int iL = l();
        Charset charset = mzh.a;
        for (int i3 = iL; i3 < iL + i2; i3++) {
            i = (i * 31) + bArr[i3];
        }
        return i;
    }

    @Override // defpackage.fvh
    public final String d(Charset charset) {
        return new String(this.zzb, l(), b(), charset);
    }

    @Override // defpackage.fvh
    public final yvh e() {
        int iJ = fvh.j(0, 47, b());
        return iJ == 0 ? fvh.a : new kvh(this.zzb, l(), iJ);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof fvh) && b() == ((fvh) obj).b()) {
            if (b() == 0) {
                return true;
            }
            if (!(obj instanceof yvh)) {
                return obj.equals(this);
            }
            yvh yvhVar = (yvh) obj;
            int iK = k();
            int iK2 = yvhVar.k();
            if (iK == 0 || iK2 == 0 || iK == iK2) {
                int iB = b();
                if (iB > yvhVar.b()) {
                    m6.k(iB, b());
                    return false;
                }
                if (iB > yvhVar.b()) {
                    l5.q(uz.d(59, iB, yvhVar.b(), "Ran off end of other: 0, ", ", "));
                    return false;
                }
                byte[] bArr = this.zzb;
                byte[] bArr2 = yvhVar.zzb;
                int iL = l() + iB;
                int iL2 = l();
                int iL3 = yvhVar.l();
                while (iL2 < iL) {
                    if (bArr[iL2] == bArr2[iL3]) {
                        iL2++;
                        iL3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fvh
    public final void g(zzev.a aVar) throws zzev.zzb {
        aVar.m2(this.zzb, l(), b());
    }

    @Override // defpackage.fvh
    public byte i(int i) {
        return this.zzb[i];
    }

    public int l() {
        return 0;
    }

    @Override // defpackage.fvh
    public final boolean zzc() {
        int iL = l();
        return a.a.F1(iL, this.zzb, b() + iL);
    }
}
