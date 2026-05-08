package defpackage;

import com.google.android.gms.internal.play_billing.b;
import com.google.android.gms.internal.play_billing.zzfp;

/* JADX INFO: loaded from: classes2.dex */
public final class c5i {
    public static final c5i f = new c5i(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public c5i(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public final int a() {
        int iB;
        int iC;
        int iB2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iB3 = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 == 1) {
                    ((Long) this.c[i2]).getClass();
                    iB2 = b.b(i4 << 3) + 8;
                } else if (i5 == 2) {
                    int i6 = i4 << 3;
                    ivh ivhVar = (ivh) this.c[i2];
                    int iB4 = b.b(i6);
                    int iC2 = ivhVar.c();
                    iB3 = b.b(iC2) + iC2 + iB4 + iB3;
                } else if (i5 == 3) {
                    int iB5 = b.b(i4 << 3);
                    iB = iB5 + iB5;
                    iC = ((c5i) this.c[i2]).a();
                } else {
                    if (i5 != 5) {
                        z3.q(new zzfp());
                        return 0;
                    }
                    ((Integer) this.c[i2]).getClass();
                    iB2 = b.b(i4 << 3) + 4;
                }
                iB3 = iB2 + iB3;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.c[i2]).longValue();
                iB = b.b(i7);
                iC = b.c(jLongValue);
            }
            iB3 = iC + iB + iB3;
        }
        this.d = iB3;
        return iB3;
    }

    public final void b(h6i h6iVar) {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    ((wvh) h6iVar).a.t(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    ((wvh) h6iVar).a.i(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    ((wvh) h6iVar).a.f(i4, (ivh) obj);
                } else if (i3 == 3) {
                    ((wvh) h6iVar).a.q(i4, 3);
                    ((c5i) obj).b(h6iVar);
                    ((wvh) h6iVar).a.q(i4, 4);
                } else {
                    if (i3 != 5) {
                        l5.r(new zzfp());
                        return;
                    }
                    ((wvh) h6iVar).a.g(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c5i)) {
            return false;
        }
        c5i c5iVar = (c5i) obj;
        int i = this.a;
        if (i == c5iVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = c5iVar.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = c5iVar.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i + 527;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public c5i() {
        this(0, new int[8], new Object[8], true);
    }
}
