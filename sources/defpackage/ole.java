package defpackage;

import androidx.compose.foundation.gestures.a;

/* JADX INFO: loaded from: classes.dex */
public final class ole implements caf {
    public final z1b a;
    public final yi3<Float> b;
    public final vpe c;
    public final a.C0013a d = a.c;

    public ole(z1b z1bVar, yi3 yi3Var, vpe vpeVar) {
        this.a = z1bVar;
        this.b = yi3Var;
        this.c = vpeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(defpackage.ole r4, defpackage.xrd r5, float r6, float r7, defpackage.zi r8, defpackage.pu2 r9) {
        /*
            r4.getClass()
            boolean r0 = r9 instanceof defpackage.nle
            if (r0 == 0) goto L17
            r0 = r9
            nle r0 = (defpackage.nle) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.label = r1
        L15:
            r9 = r0
            goto L1d
        L17:
            nle r0 = new nle
            r0.<init>(r4, r9)
            goto L15
        L1d:
            java.lang.Object r0 = r9.result
            int r1 = r9.label
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            defpackage.r7d.b(r0)
            goto L99
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L32:
            defpackage.r7d.b(r0)
            float r0 = java.lang.Math.abs(r6)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3f
            goto L47
        L3f:
            float r0 = java.lang.Math.abs(r7)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L4e
        L47:
            r4 = 28
            ae0 r4 = defpackage.boa.a(r6, r7, r4)
            return r4
        L4e:
            r9.label = r2
            yi3<java.lang.Float> r0 = r4.b
            qmg r2 = r0.b()
            ce0 r3 = new ce0
            r3.<init>(r1)
            ce0 r1 = new ce0
            r1.<init>(r7)
            ge0 r1 = r2.b(r3, r1)
            ce0 r1 = (defpackage.ce0) r1
            float r1 = r1.a
            float r1 = java.lang.Math.abs(r1)
            float r2 = java.lang.Math.abs(r6)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L7c
            ze4 r4 = new ze4
            r1 = 2
            r4.<init>(r0, r1)
        L7a:
            r0 = r6
            goto L85
        L7c:
            ke0 r0 = new ke0
            vpe r4 = r4.c
            r0.<init>(r4)
            r4 = r0
            goto L7a
        L85:
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r0)
            r0 = r7
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r0)
            java.lang.Object r0 = r4.K(r5, r6, r7, r8, r9)
            g13 r4 = defpackage.g13.a
            if (r0 != r4) goto L99
            return r4
        L99:
            vd0 r0 = (defpackage.vd0) r0
            ae0<T, V extends ge0> r4 = r0.b
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ole.c(ole, xrd, float, float, zi, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.caf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.xrd r5, float r6, kotlin.jvm.functions.Function1 r7, defpackage.pu2 r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.mle
            if (r0 == 0) goto L13
            r0 = r8
            mle r0 = (defpackage.mle) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            mle r0 = new mle
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.r7d.b(r8)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.r7d.b(r8)
            r0.label = r2
            java.lang.Object r8 = r4.d(r5, r6, r7, r0)
            g13 r4 = defpackage.g13.a
            if (r8 != r4) goto L3a
            return r4
        L3a:
            vd0 r8 = (defpackage.vd0) r8
            java.lang.Float r4 = r8.a
            float r4 = r4.floatValue()
            ae0<T, V extends ge0> r5 = r8.b
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L4a
            goto L54
        L4a:
            java.lang.Object r4 = r5.i()
            java.lang.Number r4 = (java.lang.Number) r4
            float r6 = r4.floatValue()
        L54:
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ole.b(xrd, float, kotlin.jvm.functions.Function1, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.xrd r10, float r11, kotlin.jvm.functions.Function1 r12, defpackage.pu2 r13) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.kle
            if (r0 == 0) goto L13
            r0 = r13
            kle r0 = (defpackage.kle) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kle r0 = new kle
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L2a
            java.lang.Object r9 = r0.L$0
            r12 = r9
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            defpackage.r7d.b(r13)
            goto L4e
        L2a:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r9)
            r9 = 0
            return r9
        L31:
            defpackage.r7d.b(r13)
            lle r3 = new lle
            r8 = 0
            r4 = r9
            r7 = r10
            r5 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r0.L$0 = r6
            r0.label = r2
            androidx.compose.foundation.gestures.a$a r9 = r4.d
            java.lang.Object r13 = defpackage.u63.q0(r9, r3, r0)
            g13 r9 = defpackage.g13.a
            if (r13 != r9) goto L4d
            return r9
        L4d:
            r12 = r6
        L4e:
            vd0 r13 = (defpackage.vd0) r13
            java.lang.Float r9 = new java.lang.Float
            r10 = 0
            r9.<init>(r10)
            r12.invoke(r9)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ole.d(xrd, float, kotlin.jvm.functions.Function1, pu2):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ole) {
            ole oleVar = (ole) obj;
            return oleVar.c.equals(this.c) && wl7.b(oleVar.b, this.b) && oleVar.a == this.a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
