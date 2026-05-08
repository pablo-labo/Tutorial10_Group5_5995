package defpackage;

import com.google.android.gms.internal.measurement.zzev;
import com.google.android.gms.internal.measurement.zzfz;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class x7i {
    public static final x7i f = new x7i(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public x7i(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public final void a(int i, Object obj) {
        if (!this.e) {
            b0.l();
            return;
        }
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.b = Arrays.copyOf(iArr, i3);
            this.c = Arrays.copyOf(this.c, i3);
        }
        int[] iArr2 = this.b;
        int i4 = this.a;
        iArr2[i4] = i;
        this.c[i4] = obj;
        this.a = i4 + 1;
    }

    public final void b(hai haiVar) {
        if (this.a == 0) {
            return;
        }
        haiVar.getClass();
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                ((qwh) haiVar).a.M1(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                ((qwh) haiVar).a.a2(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                ((qwh) haiVar).a(i3, (fvh) obj);
            } else if (i4 == 3) {
                zzev zzevVar = ((qwh) haiVar).a;
                zzevVar.L1(i3, 3);
                ((x7i) obj).b(haiVar);
                zzevVar.L1(i3, 4);
            } else {
                if (i4 != 5) {
                    l5.r(new zzfz("Protocol message tag had invalid wire type."));
                    return;
                }
                ((qwh) haiVar).a.f2(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final int c() {
        int iD2;
        int iE2;
        int iH2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    iH2 = zzev.h2(i5);
                } else if (i6 == 2) {
                    iH2 = zzev.X1(i5, (fvh) this.c[i3]);
                } else if (i6 == 3) {
                    iD2 = zzev.d2(i5) << 1;
                    iE2 = ((x7i) this.c[i3]).c();
                } else {
                    if (i6 != 5) {
                        z3.q(new zzfz("Protocol message tag had invalid wire type."));
                        return 0;
                    }
                    ((Integer) this.c[i3]).getClass();
                    iH2 = zzev.k2(i5);
                }
                i2 = iH2 + i2;
            } else {
                long jLongValue = ((Long) this.c[i3]).longValue();
                iD2 = zzev.d2(i5);
                iE2 = zzev.e2(jLongValue);
            }
            i2 = iE2 + iD2 + i2;
        }
        this.d = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof x7i)) {
            return false;
        }
        x7i x7iVar = (x7i) obj;
        int i = this.a;
        if (i == x7iVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = x7iVar.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = x7iVar.c;
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
        int i2 = (i + 527) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public x7i() {
        this(0, new int[8], new Object[8], true);
    }
}
