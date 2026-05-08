package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class ip2 {
    public final ta2 a;
    public final ta2 b;
    public final ta2 c;
    public final float[] d;

    public static final class a extends ip2 {
        public final abd e;
        public final abd f;
        public final float[] g;

        public a(abd abdVar, abd abdVar2) {
            float[] fArrF;
            super(abdVar2, abdVar, abdVar2, null);
            this.e = abdVar;
            this.f = abdVar2;
            float[] fArr = da.b.a;
            bzg bzgVar = abdVar.d;
            float[] fArr2 = abdVar.i;
            bzg bzgVar2 = abdVar2.d;
            float[] fArr3 = abdVar2.j;
            if (ua2.c(bzgVar, bzgVar2)) {
                fArrF = ua2.f(fArr3, fArr2);
            } else {
                float[] fArrA = bzgVar.a();
                float[] fArrA2 = bzgVar2.a();
                bzg bzgVar3 = boa.f;
                fArrF = ua2.f(ua2.c(bzgVar2, bzgVar3) ? fArr3 : ua2.e(ua2.f(ua2.b(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), abdVar2.i)), ua2.c(bzgVar, bzgVar3) ? fArr2 : ua2.f(ua2.b(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
            }
            this.g = fArrF;
        }

        @Override // defpackage.ip2
        public final long a(long j) {
            float fH = da2.h(j);
            float fG = da2.g(j);
            float fE = da2.e(j);
            float fD = da2.d(j);
            yk3 yk3Var = this.e.p;
            float f = (float) yk3Var.f(fH);
            float f2 = (float) yk3Var.f(fG);
            float f3 = (float) yk3Var.f(fE);
            float[] fArr = this.g;
            float f4 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
            float f5 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
            float f6 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
            abd abdVar = this.f;
            float f7 = (float) abdVar.m.f(f4);
            ob3 ob3Var = abdVar.m;
            return pnb.b(f7, (float) ob3Var.f(f5), (float) ob3Var.f(f6), fD, abdVar);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ip2(defpackage.ta2 r9, defpackage.ta2 r10, int r11) {
        /*
            r8 = this;
            long r0 = r9.b
            r2 = 12884901888(0x300000000, double:6.365987373E-314)
            boolean r0 = defpackage.ka2.v(r0, r2)
            if (r0 == 0) goto L12
            ta2 r0 = defpackage.ua2.a(r9)
            goto L13
        L12:
            r0 = r9
        L13:
            long r4 = r10.b
            boolean r1 = defpackage.ka2.v(r4, r2)
            if (r1 == 0) goto L20
            ta2 r1 = defpackage.ua2.a(r10)
            goto L21
        L20:
            r1 = r10
        L21:
            float[] r4 = defpackage.boa.X
            r5 = 3
            if (r11 != r5) goto L6c
            long r6 = r9.b
            boolean r11 = defpackage.ka2.v(r6, r2)
            long r6 = r10.b
            boolean r2 = defpackage.ka2.v(r6, r2)
            if (r11 == 0) goto L37
            if (r2 == 0) goto L37
            goto L6c
        L37:
            if (r11 != 0) goto L3b
            if (r2 == 0) goto L6c
        L3b:
            if (r11 == 0) goto L3e
            goto L3f
        L3e:
            r9 = r10
        L3f:
            abd r9 = (defpackage.abd) r9
            bzg r9 = r9.d
            if (r11 == 0) goto L4a
            float[] r11 = r9.a()
            goto L4b
        L4a:
            r11 = r4
        L4b:
            if (r2 == 0) goto L51
            float[] r4 = r9.a()
        L51:
            r9 = 0
            r2 = r11[r9]
            r3 = r4[r9]
            float r2 = r2 / r3
            r3 = 1
            r6 = r11[r3]
            r7 = r4[r3]
            float r6 = r6 / r7
            r7 = 2
            r11 = r11[r7]
            r4 = r4[r7]
            float r11 = r11 / r4
            float[] r4 = new float[r5]
            r4[r9] = r2
            r4[r3] = r6
            r4[r7] = r11
            goto L6d
        L6c:
            r4 = 0
        L6d:
            r8.<init>(r10, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ip2.<init>(ta2, ta2, int):void");
    }

    public long a(long j) {
        float fH = da2.h(j);
        float fG = da2.g(j);
        float fE = da2.e(j);
        float fD = da2.d(j);
        ta2 ta2Var = this.b;
        long jE = ta2Var.e(fH, fG, fE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE & 4294967295L));
        float fG2 = ta2Var.g(fH, fG, fE);
        float[] fArr = this.d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fG2 *= fArr[2];
        }
        float f = fIntBitsToFloat;
        float f2 = fIntBitsToFloat2;
        return this.c.h(f, f2, fG2, fD, this.a);
    }

    public ip2(ta2 ta2Var, ta2 ta2Var2, ta2 ta2Var3, float[] fArr) {
        this.a = ta2Var;
        this.b = ta2Var2;
        this.c = ta2Var3;
        this.d = fArr;
    }
}
