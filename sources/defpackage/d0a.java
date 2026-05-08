package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d0a {
    public final xsd a;
    public final k60 b;
    public final isd c;
    public iy3 d;
    public boolean f;
    public uqe g;
    public final go1 e = h22.a(Integer.MAX_VALUE, 6, null);
    public final up1 h = new up1();

    public static final class a {
        public final long a;
        public final long b;
        public final boolean c;

        public a(long j, long j2, boolean z) {
            this.a = j;
            this.b = j2;
            this.c = z;
        }

        public final a a(a aVar) {
            return new a(ooa.f(this.a, aVar.a), Math.max(this.b, aVar.b), this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return ooa.c(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ia.d(Long.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MouseWheelScrollDelta(value=");
            sb.append((Object) ooa.h(this.a));
            sb.append(", timeMillis=");
            sb.append(this.b);
            sb.append(", shouldApplyImmediately=");
            return m6.i(sb, this.c, ')');
        }
    }

    public d0a(xsd xsdVar, k60 k60Var, isd isdVar, iy3 iy3Var) {
        this.a = xsdVar;
        this.b = k60Var;
        this.c = isdVar;
        this.d = iy3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x011c, code lost:
    
        if (r0.invoke(r1, r9) == r14) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, d0a$a] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, ae0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.d0a r16, defpackage.xsd r17, d0a.a r18, float r19, float r20, defpackage.pu2 r21) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d0a.a(d0a, xsd, d0a$a, float, float, pu2):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r10v0, types: [T, d0a$a] */
    /* JADX WARN: Type inference failed for: r12v4, types: [T, ae0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.d0a r11, defpackage.luc r12, defpackage.iuc r13, defpackage.xsd r14, defpackage.luc r15, long r16, defpackage.pu2 r18) {
        /*
            r0 = r16
            r2 = r18
            boolean r3 = r2 instanceof defpackage.i0a
            if (r3 == 0) goto L17
            r3 = r2
            i0a r3 = (defpackage.i0a) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.label = r4
            goto L1c
        L17:
            i0a r3 = new i0a
            r3.<init>(r2)
        L1c:
            java.lang.Object r2 = r3.result
            int r4 = r3.label
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L48
            if (r4 != r6) goto L42
            java.lang.Object r11 = r3.L$4
            luc r11 = (defpackage.luc) r11
            java.lang.Object r12 = r3.L$3
            xsd r12 = (defpackage.xsd) r12
            java.lang.Object r0 = r3.L$2
            iuc r0 = (defpackage.iuc) r0
            java.lang.Object r1 = r3.L$1
            luc r1 = (defpackage.luc) r1
            java.lang.Object r3 = r3.L$0
            d0a r3 = (defpackage.d0a) r3
            defpackage.r7d.b(r2)
            r7 = r11
            r5 = r12
            r12 = r1
            r11 = r3
            goto L71
        L42:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r11)
            return r5
        L48:
            defpackage.r7d.b(r2)
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 >= 0) goto L54
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L54:
            j0a r2 = new j0a
            r2.<init>(r11, r5)
            r3.L$0 = r11
            r3.L$1 = r12
            r3.L$2 = r13
            r3.L$3 = r14
            r3.L$4 = r15
            r3.label = r6
            java.lang.Object r2 = defpackage.ewa.P(r0, r2, r3)
            g13 r0 = defpackage.g13.a
            if (r2 != r0) goto L6e
            return r0
        L6e:
            r0 = r13
            r5 = r14
            r7 = r15
        L71:
            d0a$a r2 = (d0a.a) r2
            if (r2 == 0) goto Lab
            T r1 = r12.element
            d0a$a r1 = (d0a.a) r1
            boolean r1 = r1.c
            long r3 = r2.a
            long r8 = r2.b
            d0a$a r10 = new d0a$a
            r18 = r1
            r14 = r3
            r16 = r8
            r13 = r10
            r13.<init>(r14, r16, r18)
            r1 = r13
            r12.element = r1
            long r3 = r5.e(r3)
            float r12 = r5.g(r3)
            r0.element = r12
            r12 = 30
            r1 = 0
            ae0 r12 = defpackage.boa.a(r1, r1, r12)
            r7.element = r12
            r11.e(r2)
            float r11 = r0.element
            boolean r11 = defpackage.w74.d(r11)
            r11 = r11 ^ r6
            goto Lac
        Lab:
            r11 = 0
        Lac:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d0a.b(d0a, luc, iuc, xsd, luc, long, pu2):java.lang.Object");
    }

    public static a d(go1 go1Var) {
        a aVar = null;
        s6e s6eVarW = q92.w(new l0a(new hr(go1Var, 9), null));
        while (s6eVarW.hasNext()) {
            a aVarA = (a) s6eVarW.next();
            if (aVar != null) {
                aVarA = aVar.a(aVarA);
            }
            aVar = aVarA;
        }
        return aVar;
    }

    public final float c(afa afaVar, float f) {
        xsd xsdVar = this.a;
        return xsdVar.g(xsdVar.e(afaVar.a(xsdVar.h(xsdVar.d(f)))));
    }

    public final void e(a aVar) {
        long j = aVar.b;
        long j2 = aVar.a;
        up1 up1Var = this.h;
        ((xmg) up1Var.c).a(j, Float.intBitsToFloat((int) (j2 >> 32)));
        ((xmg) up1Var.d).a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.xsd r5, defpackage.h0a r6, defpackage.pu2 r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.m0a
            if (r0 == 0) goto L13
            r0 = r7
            m0a r0 = (defpackage.m0a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            m0a r0 = new m0a
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.r7d.b(r7)
            goto L4a
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L2c:
            defpackage.r7d.b(r7)
            r4.f = r3
            n0a r7 = new n0a
            r7.<init>(r2, r5, r6)
            r0.label = r3
            dze r5 = new dze
            v03 r6 = r0.getContext()
            r5.<init>(r0, r6)
            java.lang.Object r5 = defpackage.a6g.a(r5, r3, r5, r7)
            g13 r6 = defpackage.g13.a
            if (r5 != r6) goto L4a
            return r6
        L4a:
            r5 = 0
            r4.f = r5
            j6g r4 = defpackage.j6g.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d0a.f(xsd, h0a, pu2):java.lang.Object");
    }
}
