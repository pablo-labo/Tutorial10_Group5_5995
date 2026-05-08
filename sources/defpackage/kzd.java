package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
public final class kzd extends vr1 {
    public final transient byte[][] d;
    public final transient int[] e;

    public kzd(byte[][] bArr, int[] iArr) {
        super(vr1.c.f());
        this.d = bArr;
        this.e = iArr;
    }

    private final Object writeReplace() {
        return C();
    }

    @Override // defpackage.vr1
    public final void B(zn1 zn1Var, int i) {
        int iX = h4.x(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.e;
            int i3 = iX == 0 ? 0 : iArr[iX - 1];
            int i4 = iArr[iX] - i3;
            byte[][] bArr = this.d;
            int i5 = iArr[bArr.length + iX];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            lyd lydVar = new lyd(bArr[iX], i6, i6 + iMin, true, false);
            lyd lydVar2 = zn1Var.a;
            if (lydVar2 == null) {
                lydVar.g = lydVar;
                lydVar.f = lydVar;
                zn1Var.a = lydVar;
            } else {
                lyd lydVar3 = lydVar2.g;
                lydVar3.getClass();
                lydVar3.b(lydVar);
            }
            i2 += iMin;
            iX++;
        }
        zn1Var.b += (long) i;
    }

    public final vr1 C() {
        return new vr1(z());
    }

    @Override // defpackage.vr1
    public final String a() {
        return C().a();
    }

    @Override // defpackage.vr1
    public final vr1 e(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.d;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.e;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new vr1(bArrDigest);
    }

    @Override // defpackage.vr1
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vr1) {
            vr1 vr1Var = (vr1) obj;
            if (vr1Var.h() == h() && v(0, vr1Var, h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vr1
    public final int h() {
        return this.e[this.d.length - 1];
    }

    @Override // defpackage.vr1
    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.d;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.e;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.a = i3;
        return i3;
    }

    @Override // defpackage.vr1
    public final String m() {
        return C().m();
    }

    @Override // defpackage.vr1
    public final int n(int i, byte[] bArr) {
        bArr.getClass();
        return C().n(i, bArr);
    }

    @Override // defpackage.vr1
    public final byte[] p() {
        return z();
    }

    @Override // defpackage.vr1
    public final byte r(int i) {
        byte[][] bArr = this.d;
        int length = bArr.length - 1;
        int[] iArr = this.e;
        k.b(iArr[length], i, 1L);
        int iX = h4.x(this, i);
        return bArr[iX][(i - (iX == 0 ? 0 : iArr[iX - 1])) + iArr[bArr.length + iX]];
    }

    @Override // defpackage.vr1
    public final int s(int i, byte[] bArr) {
        bArr.getClass();
        return C().s(i, bArr);
    }

    @Override // defpackage.vr1
    public final String toString() {
        return C().toString();
    }

    @Override // defpackage.vr1
    public final boolean u(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        if (i < 0 || i > h() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iX = h4.x(this, i);
        while (i < i4) {
            int[] iArr = this.e;
            int i5 = iX == 0 ? 0 : iArr[iX - 1];
            int i6 = iArr[iX] - i5;
            byte[][] bArr2 = this.d;
            int i7 = iArr[bArr2.length + iX];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!k.a((i - i5) + i7, i2, iMin, bArr2[iX], bArr)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iX++;
        }
        return true;
    }

    @Override // defpackage.vr1
    public final boolean v(int i, vr1 vr1Var, int i2) {
        vr1Var.getClass();
        if (i >= 0 && i <= h() - i2) {
            int i3 = i2 + i;
            int iX = h4.x(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.e;
                int i5 = iX == 0 ? 0 : iArr[iX - 1];
                int i6 = iArr[iX] - i5;
                byte[][] bArr = this.d;
                int i7 = iArr[bArr.length + iX];
                int iMin = Math.min(i3, i6 + i5) - i;
                if (vr1Var.u(i4, (i - i5) + i7, iMin, bArr[iX])) {
                    i4 += iMin;
                    i += iMin;
                    iX++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.vr1
    public final vr1 w(int i, int i2) {
        if (i2 == k.b) {
            i2 = h();
        }
        if (i < 0) {
            h5.k(bg.d(i, "beginIndex=", " < 0"));
            return null;
        }
        if (i2 > h()) {
            StringBuilder sbG = o6.g(i2, "endIndex=", " > length(");
            sbG.append(h());
            sbG.append(')');
            throw new IllegalArgumentException(sbG.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            h5.k(k20.l("endIndex=", i2, i, " < beginIndex="));
            return null;
        }
        if (i == 0 && i2 == h()) {
            return this;
        }
        if (i == i2) {
            return vr1.c;
        }
        int iX = h4.x(this, i);
        int iX2 = h4.x(this, i2 - 1);
        byte[][] bArr = this.d;
        byte[][] bArr2 = (byte[][]) pyd.n(bArr, iX, iX2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.e;
        if (iX <= iX2) {
            int i4 = iX;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iX2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iX != 0 ? iArr2[iX - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new kzd(bArr2, iArr);
    }

    @Override // defpackage.vr1
    public final vr1 y() {
        return C().y();
    }

    @Override // defpackage.vr1
    public final byte[] z() {
        byte[] bArr = new byte[h()];
        byte[][] bArr2 = this.d;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.e;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            pyd.g(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }
}
