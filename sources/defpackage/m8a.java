package defpackage;

import defpackage.e47;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m8a {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public static final class b {
        public final int a;
        public final int b;
        public final int c;

        public b(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    public static final class c {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int[] e;
        public final int f;

        public c(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
            this.a = i;
            this.b = z;
            this.c = i2;
            this.d = i3;
            this.e = iArr;
            this.f = i4;
        }
    }

    public static final class d {
        public final e47<c> a;
        public final int[] b;

        public d(qyc qycVar, int[] iArr) {
            this.a = e47.j(qycVar);
            this.b = iArr;
        }
    }

    public static final class e {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public e(int i, int i2, int i3, int i4, int i5) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    public static final class f {
        public final e47<e> a;
        public final int[] b;

        public f(qyc qycVar, int[] iArr) {
            this.a = e47.j(qycVar);
            this.b = iArr;
        }
    }

    public static final class g {
        public final int a;

        public g(int i) {
            this.a = i;
        }
    }

    public static final class h {
        public final int a;
        public final c b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final float i;
        public final int j;
        public final int k;
        public final int l;
        public final int m;

        public h(int i, c cVar, int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8, int i9, int i10, int i11) {
            this.a = i;
            this.b = cVar;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.i = f;
            this.j = i8;
            this.k = i9;
            this.l = i10;
            this.m = i11;
            this.g = i6;
            this.h = i7;
        }
    }

    public static final class i {
        public final int a;
        public final int b;
        public final int c;

        public i(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    public static final class j {
        public final e47<i> a;
        public final int[] b;

        public j(qyc qycVar, int[] iArr) {
            this.a = e47.j(qycVar);
            this.b = iArr;
        }
    }

    public static final class k {
        public final e47<a> a;
        public final d b;
        public final f c;
        public final j d;

        public k(qyc qycVar, d dVar, f fVar, j jVar) {
            e47<a> e47VarJ;
            if (qycVar != null) {
                e47VarJ = e47.j(qycVar);
            } else {
                e47.b bVar = e47.b;
                e47VarJ = qyc.e;
            }
            this.a = e47VarJ;
            this.b = dVar;
            this.c = fVar;
            this.d = jVar;
        }
    }

    public static final class l {
        public final int a;
        public final boolean b;

        public l(int i, int i2, boolean z) {
            this.a = i2;
            this.b = z;
        }
    }

    public static final class m {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final float g;
        public final int h;
        public final int i;
        public final boolean j;
        public final boolean k;
        public final int l;
        public final int m;
        public final int n;
        public final boolean o;
        public final int p;
        public final int q;
        public final int r;
        public final int s;

        public m(int i, int i2, int i3, int i4, int i5, int i6, float f, int i7, int i8, boolean z, boolean z2, int i9, int i10, int i11, boolean z3, int i12, int i13, int i14, int i15) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = f;
            this.h = i7;
            this.i = i8;
            this.j = z;
            this.k = z2;
            this.l = i9;
            this.m = i10;
            this.n = i11;
            this.o = z3;
            this.p = i12;
            this.q = i13;
            this.r = i14;
            this.s = i15;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        ka2.q(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            a(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            a(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            a(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b2 = bArr[i6];
            if ((b2 & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                    a(zArr);
                    return i7;
                }
                i6 -= 2;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }

    public static boolean c(byte[] bArr, int i2, androidx.media3.common.a aVar) {
        int i3;
        if (Objects.equals(aVar.n, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i3 = b2 & 31) == 1 || i3 == 9 || i3 == 14)) {
                return false;
            }
        } else if (Objects.equals(aVar.n, "video/hevc")) {
            b bVarE = e(new h4b(bArr, 4, i2 + 4));
            int i4 = bVarE.a;
            if (i4 == 35) {
                return false;
            }
            if (i4 <= 14 && i4 % 2 == 0 && bVarE.c == aVar.E - 1) {
                return false;
            }
        }
        return true;
    }

    public static int d(androidx.media3.common.a aVar) {
        if (Objects.equals(aVar.n, "video/avc")) {
            return 1;
        }
        return (Objects.equals(aVar.n, "video/hevc") || st9.c(aVar.k, "video/hevc") != null) ? 2 : 0;
    }

    public static b e(h4b h4bVar) {
        h4bVar.i();
        return new b(h4bVar.e(6), h4bVar.e(6), h4bVar.e(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static m8a.c f(defpackage.h4b r19, boolean r20, int r21, m8a.c r22) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 2
            r6 = 8
            r7 = 0
            if (r20 == 0) goto L42
            int r2 = r0.e(r5)
            boolean r8 = r0.d()
            r9 = 5
            int r9 = r0.e(r9)
            r10 = r7
            r11 = r10
        L1e:
            r12 = 32
            if (r10 >= r12) goto L2e
            boolean r12 = r0.d()
            if (r12 == 0) goto L2b
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 | r12
        L2b:
            int r10 = r10 + 1
            goto L1e
        L2e:
            r10 = r7
        L2f:
            if (r10 >= r3) goto L3a
            int r12 = r0.e(r6)
            r4[r10] = r12
            int r10 = r10 + 1
            goto L2f
        L3a:
            r13 = r2
        L3b:
            r17 = r4
            r14 = r8
            r15 = r9
            r16 = r11
            goto L57
        L42:
            if (r2 == 0) goto L50
            int r3 = r2.a
            boolean r8 = r2.b
            int r9 = r2.c
            int r11 = r2.d
            int[] r4 = r2.e
            r13 = r3
            goto L3b
        L50:
            r17 = r4
            r13 = r7
            r14 = r13
            r15 = r14
            r16 = r15
        L57:
            int r18 = r0.e(r6)
            r2 = r7
        L5c:
            if (r7 >= r1) goto L71
            boolean r3 = r0.d()
            if (r3 == 0) goto L66
            int r2 = r2 + 88
        L66:
            boolean r3 = r0.d()
            if (r3 == 0) goto L6e
            int r2 = r2 + 8
        L6e:
            int r7 = r7 + 1
            goto L5c
        L71:
            r0.j(r2)
            if (r1 <= 0) goto L7b
            int r6 = r6 - r1
            int r6 = r6 * r5
            r0.j(r6)
        L7b:
            m8a$c r12 = new m8a$c
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m8a.f(h4b, boolean, int, m8a$c):m8a$c");
    }

    public static g g(int i2, byte[] bArr, int i3) {
        byte b2;
        int i4 = i2 + 2;
        do {
            i3--;
            b2 = bArr[i3];
            if (b2 != 0) {
                break;
            }
        } while (i3 > i4);
        if (b2 == 0 || i3 <= i4) {
            return null;
        }
        h4b h4bVar = new h4b(bArr, i4, i3 + 1);
        while (h4bVar.b(16)) {
            int iE = h4bVar.e(8);
            int i5 = 0;
            while (iE == 255) {
                i5 += 255;
                iE = h4bVar.e(8);
            }
            int i6 = i5 + iE;
            int iE2 = h4bVar.e(8);
            int i7 = 0;
            while (iE2 == 255) {
                i7 += 255;
                iE2 = h4bVar.e(8);
            }
            int i8 = i7 + iE2;
            if (i8 == 0 || !h4bVar.b(i8)) {
                return null;
            }
            if (i6 == 176) {
                int iF = h4bVar.f();
                boolean zD = h4bVar.d();
                int iF2 = zD ? h4bVar.f() : 0;
                int iF3 = h4bVar.f();
                int iF4 = -1;
                for (int i9 = 0; i9 <= iF3; i9++) {
                    iF4 = h4bVar.f();
                    h4bVar.f();
                    int iE3 = h4bVar.e(6);
                    if (iE3 == 63) {
                        return null;
                    }
                    h4bVar.e(iE3 == 0 ? Math.max(0, iF - 30) : Math.max(0, (iE3 + iF) - 31));
                    if (zD) {
                        int iE4 = h4bVar.e(6);
                        if (iE4 == 63) {
                            return null;
                        }
                        h4bVar.e(iE4 == 0 ? Math.max(0, iF2 - 30) : Math.max(0, (iE4 + iF2) - 31));
                    }
                    if (h4bVar.d()) {
                        h4bVar.j(10);
                    }
                }
                return new g(iF4);
            }
            h4bVar.j(i8 * 8);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static m8a.h h(byte[] r32, int r33, int r34, m8a.k r35) {
        /*
            Method dump skipped, instruction units count: 991
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m8a.h(byte[], int, int, m8a$k):m8a$h");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static m8a.k i(int r40, byte[] r41, int r42) {
        /*
            Method dump skipped, instruction units count: 2144
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m8a.i(int, byte[], int):m8a$k");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static m8a.m j(int r30, byte[] r31, int r32) {
        /*
            Method dump skipped, instruction units count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m8a.j(int, byte[], int):m8a$m");
    }

    public static void k(h4b h4bVar) {
        int iF = h4bVar.f() + 1;
        h4bVar.j(8);
        for (int i2 = 0; i2 < iF; i2++) {
            h4bVar.f();
            h4bVar.f();
            h4bVar.i();
        }
        h4bVar.j(20);
    }

    public static int l(int i2, byte[] bArr) {
        int i3;
        synchronized (c) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    if (i4 >= i2 - 2) {
                        i4 = i2;
                        break;
                    }
                    try {
                        if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                            break;
                        }
                        i4++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i4 < i2) {
                    int[] iArr = d;
                    if (iArr.length <= i5) {
                        d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    d[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = d[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i10 + 2;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i3 - i6);
        }
        return i3;
    }
}
