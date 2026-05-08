package androidx.datastore.preferences.protobuf;

import defpackage.l5;
import defpackage.tr1;
import defpackage.z3;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {
    public static final i0 f = new i0(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public i0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public final int a() {
        int iR1;
        int iU1;
        int iM1;
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
                    iM1 = CodedOutputStream.M1(i5);
                } else if (i6 == 2) {
                    iM1 = CodedOutputStream.J1(i5, (tr1) this.c[i3]);
                } else if (i6 == 3) {
                    iR1 = CodedOutputStream.R1(i5) * 2;
                    iU1 = ((i0) this.c[i3]).a();
                } else {
                    if (i6 != 5) {
                        z3.q(InvalidProtocolBufferException.b());
                        return 0;
                    }
                    ((Integer) this.c[i3]).getClass();
                    iM1 = CodedOutputStream.L1(i5);
                }
                i2 = iM1 + i2;
            } else {
                long jLongValue = ((Long) this.c[i3]).longValue();
                iR1 = CodedOutputStream.R1(i5);
                iU1 = CodedOutputStream.U1(jLongValue);
            }
            i2 = iU1 + iR1 + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void b(int i, Object obj) {
        if (!this.e) {
            defpackage.b0.l();
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

    public final void c(k0 k0Var) {
        if (this.a == 0) {
            return;
        }
        k0Var.getClass();
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                ((g) k0Var).a.q2(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                ((g) k0Var).a.d2(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                ((g) k0Var).a(i3, (tr1) obj);
            } else if (i4 == 3) {
                CodedOutputStream codedOutputStream = ((g) k0Var).a;
                codedOutputStream.n2(i3, 3);
                ((i0) obj).c(k0Var);
                codedOutputStream.n2(i3, 4);
            } else {
                if (i4 != 5) {
                    l5.r(InvalidProtocolBufferException.b());
                    return;
                }
                ((g) k0Var).a.b2(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        int i = this.a;
        if (i == i0Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = i0Var.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = i0Var.c;
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
        int i2 = (527 + i) * 31;
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

    public i0() {
        this(0, new int[8], new Object[8], true);
    }
}
