package defpackage;

import defpackage.e47;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class fr6 extends ka6 {
    public static final ia e = new ia(9);
    public final a d;

    public interface a {
        boolean b(int i, int i2, int i3, int i4, int i5);
    }

    public static final class b {
        public final int a;
        public final boolean b;
        public final int c;

        public b(int i, int i2, boolean z) {
            this.a = i;
            this.b = z;
            this.c = i2;
        }
    }

    public fr6(a aVar) {
        this.d = aVar;
    }

    public static yg0 K1(g4b g4bVar, int i, int i2) {
        int iC2;
        String strConcat;
        int iX = g4bVar.x();
        Charset charsetZ1 = Z1(iX);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        g4bVar.h(0, bArr, i3);
        if (i2 == 2) {
            strConcat = "image/" + jh2.I(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iC2 = 2;
        } else {
            iC2 = c2(0, bArr);
            String strI = jh2.I(new String(bArr, 0, iC2, StandardCharsets.ISO_8859_1));
            strConcat = strI.indexOf(47) == -1 ? "image/".concat(strI) : strI;
        }
        int i4 = bArr[iC2 + 1] & 255;
        int i5 = iC2 + 2;
        int iB2 = b2(i5, bArr, iX);
        String str = new String(bArr, i5, iB2 - i5, charsetZ1);
        int iY1 = Y1(iX) + iB2;
        return new yg0(i4, strConcat, str, i3 <= iY1 ? vjg.b : Arrays.copyOfRange(bArr, iY1, i3));
    }

    public static m22 L1(g4b g4bVar, int i, int i2, boolean z, int i3, a aVar) throws Throwable {
        int i4 = g4bVar.b;
        int iC2 = c2(i4, g4bVar.a);
        String str = new String(g4bVar.a, i4, iC2 - i4, StandardCharsets.ISO_8859_1);
        g4bVar.J(iC2 + 1);
        int iJ = g4bVar.j();
        int iJ2 = g4bVar.j();
        long jZ = g4bVar.z();
        if (jZ == 4294967295L) {
            jZ = -1;
        }
        long jZ2 = g4bVar.z();
        long j = jZ2 == 4294967295L ? -1L : jZ2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (g4bVar.b < i5) {
            gr6 gr6VarO1 = O1(i2, g4bVar, z, i3, aVar);
            if (gr6VarO1 != null) {
                arrayList.add(gr6VarO1);
            }
        }
        return new m22(str, iJ, iJ2, jZ, j, (gr6[]) arrayList.toArray(new gr6[0]));
    }

    public static n22 M1(g4b g4bVar, int i, int i2, boolean z, int i3, a aVar) throws Throwable {
        int i4 = g4bVar.b;
        int iC2 = c2(i4, g4bVar.a);
        String str = new String(g4bVar.a, i4, iC2 - i4, StandardCharsets.ISO_8859_1);
        g4bVar.J(iC2 + 1);
        int iX = g4bVar.x();
        boolean z2 = (iX & 2) != 0;
        boolean z3 = (iX & 1) != 0;
        int iX2 = g4bVar.x();
        String[] strArr = new String[iX2];
        for (int i5 = 0; i5 < iX2; i5++) {
            int i6 = g4bVar.b;
            int iC22 = c2(i6, g4bVar.a);
            strArr[i5] = new String(g4bVar.a, i6, iC22 - i6, StandardCharsets.ISO_8859_1);
            g4bVar.J(iC22 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (g4bVar.b < i7) {
            gr6 gr6VarO1 = O1(i2, g4bVar, z, i3, aVar);
            if (gr6VarO1 != null) {
                arrayList.add(gr6VarO1);
            }
        }
        return new n22(str, z2, z3, strArr, (gr6[]) arrayList.toArray(new gr6[0]));
    }

    public static jc2 N1(int i, g4b g4bVar) {
        if (i < 4) {
            return null;
        }
        int iX = g4bVar.x();
        Charset charsetZ1 = Z1(iX);
        byte[] bArr = new byte[3];
        g4bVar.h(0, bArr, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        g4bVar.h(0, bArr2, i2);
        int iB2 = b2(0, bArr2, iX);
        String str2 = new String(bArr2, 0, iB2, charsetZ1);
        int iY1 = Y1(iX) + iB2;
        return new jc2(str, str2, S1(bArr2, iY1, b2(iY1, bArr2, iX), charsetZ1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x022f A[Catch: all -> 0x0216, Exception -> 0x0218, OutOfMemoryError -> 0x021a, TRY_LEAVE, TryCatch #8 {Exception -> 0x0218, OutOfMemoryError -> 0x021a, all -> 0x0216, blocks: (B:171:0x0211, B:184:0x022a, B:185:0x022f), top: B:199:0x01ff }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0251  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [gr6] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [g4b] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [g4b] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [g4b] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.gr6 O1(int r19, defpackage.g4b r20, boolean r21, int r22, fr6.a r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr6.O1(int, g4b, boolean, int, fr6$a):gr6");
    }

    public static nz5 P1(int i, g4b g4bVar) {
        int iX = g4bVar.x();
        Charset charsetZ1 = Z1(iX);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        g4bVar.h(0, bArr, i2);
        int iC2 = c2(0, bArr);
        String strP = st9.p(new String(bArr, 0, iC2, StandardCharsets.ISO_8859_1));
        int i3 = iC2 + 1;
        int iB2 = b2(i3, bArr, iX);
        String strS1 = S1(bArr, i3, iB2, charsetZ1);
        int iY1 = Y1(iX) + iB2;
        int iB22 = b2(iY1, bArr, iX);
        String strS12 = S1(bArr, iY1, iB22, charsetZ1);
        int iY12 = Y1(iX) + iB22;
        return new nz5(strP, strS1, strS12, i2 <= iY12 ? vjg.b : Arrays.copyOfRange(bArr, iY12, i2));
    }

    public static ku9 Q1(int i, g4b g4bVar) {
        int iD = g4bVar.D();
        int iA = g4bVar.A();
        int iA2 = g4bVar.A();
        int iX = g4bVar.x();
        int iX2 = g4bVar.x();
        f4b f4bVar = new f4b();
        f4bVar.l(g4bVar);
        int i2 = ((i - 10) * 8) / (iX + iX2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iG = f4bVar.g(iX);
            int iG2 = f4bVar.g(iX2);
            iArr[i3] = iG;
            iArr2[i3] = iG2;
        }
        return new ku9(iD, iA, iA2, iArr, iArr2);
    }

    public static snb R1(int i, g4b g4bVar) {
        byte[] bArr = new byte[i];
        g4bVar.h(0, bArr, i);
        int iC2 = c2(0, bArr);
        String str = new String(bArr, 0, iC2, StandardCharsets.ISO_8859_1);
        int i2 = iC2 + 1;
        return new snb(str, i <= i2 ? vjg.b : Arrays.copyOfRange(bArr, i2, i));
    }

    public static String S1(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static ohf T1(int i, g4b g4bVar, String str) {
        if (i < 1) {
            return null;
        }
        int iX = g4bVar.x();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        g4bVar.h(0, bArr, i2);
        return new ohf(str, null, U1(iX, bArr, 0));
    }

    public static qyc U1(int i, byte[] bArr, int i2) {
        if (i2 >= bArr.length) {
            return e47.n("");
        }
        e47.b bVar = e47.b;
        e47.a aVar = new e47.a();
        int iB2 = b2(i2, bArr, i);
        while (i2 < iB2) {
            aVar.c(new String(bArr, i2, iB2 - i2, Z1(i)));
            i2 = Y1(i) + iB2;
            iB2 = b2(i2, bArr, i);
        }
        qyc qycVarF = aVar.f();
        return qycVarF.isEmpty() ? e47.n("") : qycVarF;
    }

    public static ohf V1(int i, g4b g4bVar) {
        if (i < 1) {
            return null;
        }
        int iX = g4bVar.x();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        g4bVar.h(0, bArr, i2);
        int iB2 = b2(0, bArr, iX);
        return new ohf("TXXX", new String(bArr, 0, iB2, Z1(iX)), U1(iX, bArr, Y1(iX) + iB2));
    }

    public static whg W1(int i, g4b g4bVar, String str) {
        byte[] bArr = new byte[i];
        g4bVar.h(0, bArr, i);
        return new whg(str, null, new String(bArr, 0, c2(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static whg X1(int i, g4b g4bVar) {
        if (i < 1) {
            return null;
        }
        int iX = g4bVar.x();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        g4bVar.h(0, bArr, i2);
        int iB2 = b2(0, bArr, iX);
        String str = new String(bArr, 0, iB2, Z1(iX));
        int iY1 = Y1(iX) + iB2;
        return new whg("WXXX", str, S1(bArr, iY1, c2(iY1, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int Y1(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset Z1(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String a2(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int b2(int i, byte[] bArr, int i2) {
        int iC2 = c2(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return iC2;
        }
        while (iC2 < bArr.length - 1) {
            if ((iC2 - i) % 2 == 0 && bArr[iC2 + 1] == 0) {
                return iC2;
            }
            iC2 = c2(iC2 + 1, bArr);
        }
        return bArr.length;
    }

    public static int c2(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int d2(int i, g4b g4bVar) {
        byte[] bArr = g4bVar.a;
        int i2 = g4bVar.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a A[PHI: r3
  0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean e2(defpackage.g4b r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.b
        L6:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r1.j()     // Catch: java.lang.Throwable -> L20
            long r8 = r1.z()     // Catch: java.lang.Throwable -> L20
            int r10 = r1.D()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r1.A()     // Catch: java.lang.Throwable -> L20
            int r8 = r1.A()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.J(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.J(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = r4
            goto L75
        L74:
            r3 = r6
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L7a
            goto L8c
        L7a:
            r4 = r6
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L7a
            goto L8c
        L8a:
            r3 = r6
            r4 = r3
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L99
            r1.J(r2)
            return r6
        L99:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.J(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.K(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.J(r2)
            return r4
        Lb0:
            r1.J(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr6.e2(g4b, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.js9 J1(int r13, byte[] r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr6.J1(int, byte[]):js9");
    }

    @Override // defpackage.ka6
    public final js9 W(os9 os9Var, ByteBuffer byteBuffer) {
        return J1(byteBuffer.limit(), byteBuffer.array());
    }
}
