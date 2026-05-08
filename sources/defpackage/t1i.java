package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public class t1i extends x1i {
    protected final byte[] zzpc;

    public t1i(byte[] bArr) {
        bArr.getClass();
        this.zzpc = bArr;
    }

    @Override // defpackage.h0i
    public final int a(int i, int i2) {
        byte[] bArr = this.zzpc;
        int i3 = i();
        Charset charset = p5i.a;
        for (int i4 = i3; i4 < i3 + i2; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    @Override // defpackage.h0i
    public final String c(Charset charset) {
        return new String(this.zzpc, i(), size(), charset);
    }

    @Override // defpackage.h0i
    public final boolean d() {
        int i = i();
        return cei.a.H1(this.zzpc, i, size() + i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof h0i) && size() == ((h0i) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof t1i)) {
                return obj.equals(this);
            }
            t1i t1iVar = (t1i) obj;
            int iE = e();
            int iE2 = t1iVar.e();
            if (iE == 0 || iE2 == 0 || iE == iE2) {
                int size = size();
                if (size > t1iVar.size()) {
                    m6.k(size, size());
                    return false;
                }
                if (size > t1iVar.size()) {
                    l5.q(uz.d(59, size, t1iVar.size(), "Ran off end of other: 0, ", ", "));
                    return false;
                }
                byte[] bArr = this.zzpc;
                byte[] bArr2 = t1iVar.zzpc;
                int i = i() + size;
                int i2 = i();
                int i3 = t1iVar.i();
                while (i2 < i) {
                    if (bArr[i2] == bArr2[i3]) {
                        i2++;
                        i3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.h0i
    public byte f(int i) {
        return this.zzpc[i];
    }

    @Override // defpackage.h0i
    public byte g(int i) {
        return this.zzpc[i];
    }

    public int i() {
        return 0;
    }

    @Override // defpackage.h0i
    public int size() {
        return this.zzpc.length;
    }
}
