package defpackage;

import androidx.compose.ui.e;
import defpackage.pn5;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class sjf extends e.c implements lm8, eb4, c5e {
    public String d0;
    public tjf e0;
    public pn5.a f0;
    public int g0;
    public boolean h0;
    public int i0;
    public int j0;
    public oa2 k0;
    public HashMap l0;
    public j3b m0;
    public m91 n0;
    public a o0;

    public static final class a {
        public final String a;
        public String b;
        public boolean c = false;
        public j3b d = null;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.a, aVar.a) && wl7.b(this.b, aVar.b) && this.c == aVar.c && wl7.b(this.d, aVar.d);
        }

        public final int hashCode() {
            int iF = ia.f(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            j3b j3bVar = this.d;
            return iF + (j3bVar == null ? 0 : j3bVar.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TextSubstitution(layoutCache=");
            sb.append(this.d);
            sb.append(", isShowingSubstitution=");
            return m6.i(sb, this.c, ')');
        }
    }

    @Override // defpackage.c5e
    public final void F0(s5e s5eVar) {
        m91 m91Var = this.n0;
        if (m91Var == null) {
            m91Var = new m91(this, 14);
            this.n0 = m91Var;
        }
        le0 le0Var = new le0(this.d0);
        qf8<Object>[] qf8VarArr = o5e.a;
        s5eVar.a(k5e.A, u63.Z(le0Var));
        a aVar = this.o0;
        if (aVar != null) {
            boolean z = aVar.c;
            r5e<Boolean> r5eVar = k5e.C;
            qf8<Object>[] qf8VarArr2 = o5e.a;
            qf8<Object> qf8Var = qf8VarArr2[16];
            s5eVar.a(r5eVar, Boolean.valueOf(z));
            le0 le0Var2 = new le0(aVar.b);
            r5e<le0> r5eVar2 = k5e.B;
            qf8<Object> qf8Var2 = qf8VarArr2[15];
            s5eVar.a(r5eVar2, le0Var2);
        }
        s5eVar.a(v4e.k, new r5(null, new hp0(this, 18)));
        s5eVar.a(v4e.l, new r5(null, new ji(this, 15)));
        s5eVar.a(v4e.m, new r5(null, new wm1(this, 19)));
        o5e.b(s5eVar, m91Var);
    }

    @Override // androidx.compose.ui.e.c
    public final boolean R1() {
        return false;
    }

    public final j3b c2() {
        if (this.m0 == null) {
            this.m0 = new j3b(this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, this.j0);
        }
        j3b j3bVar = this.m0;
        j3bVar.getClass();
        return j3bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0036, B:20:0x0042, B:21:0x0049, B:22:0x006b, B:12:0x0015), top: B:28:0x0005 }] */
    @Override // defpackage.lm8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.bg9 d(androidx.compose.ui.layout.q r5, defpackage.vf9 r6, long r7) {
        /*
            r4 = this;
            java.lang.String r0 = "TextStringSimpleNode::measure"
            android.os.Trace.beginSection(r0)
            sjf$a r0 = r4.o0     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L15
            boolean r1 = r0.c     // Catch: java.lang.Throwable -> L92
            if (r1 == 0) goto Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L15
            j3b r0 = r0.d     // Catch: java.lang.Throwable -> L92
            if (r0 != 0) goto L19
        L15:
            j3b r0 = r4.c2()     // Catch: java.lang.Throwable -> L92
        L19:
            r0.d(r5)     // Catch: java.lang.Throwable -> L92
            vl8 r1 = r5.getLayoutDirection()     // Catch: java.lang.Throwable -> L92
            boolean r7 = r0.b(r7, r1)     // Catch: java.lang.Throwable -> L92
            h3b r8 = r0.n     // Catch: java.lang.Throwable -> L92
            if (r8 == 0) goto L2b
            r8.a()     // Catch: java.lang.Throwable -> L92
        L2b:
            j6g r8 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L92
            h80 r8 = r0.j     // Catch: java.lang.Throwable -> L92
            r8.getClass()     // Catch: java.lang.Throwable -> L92
            long r0 = r0.l     // Catch: java.lang.Throwable -> L92
            if (r7 == 0) goto L6b
            r7 = 2
            tia r2 = defpackage.us3.d(r4, r7)     // Catch: java.lang.Throwable -> L92
            r2.G1()     // Catch: java.lang.Throwable -> L92
            java.util.HashMap r2 = r4.l0     // Catch: java.lang.Throwable -> L92
            if (r2 != 0) goto L49
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L92
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L92
            r4.l0 = r2     // Catch: java.lang.Throwable -> L92
        L49:
            tj6 r7 = defpackage.e20.a     // Catch: java.lang.Throwable -> L92
            float r3 = r8.c()     // Catch: java.lang.Throwable -> L92
            int r3 = java.lang.Math.round(r3)     // Catch: java.lang.Throwable -> L92
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L92
            r2.put(r7, r3)     // Catch: java.lang.Throwable -> L92
            tj6 r7 = defpackage.e20.b     // Catch: java.lang.Throwable -> L92
            float r8 = r8.f()     // Catch: java.lang.Throwable -> L92
            int r8 = java.lang.Math.round(r8)     // Catch: java.lang.Throwable -> L92
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L92
            r2.put(r7, r8)     // Catch: java.lang.Throwable -> L92
        L6b:
            r7 = 32
            long r7 = r0 >> r7
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L92
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r8 = (int) r0     // Catch: java.lang.Throwable -> L92
            long r0 = iq2.a.b(r7, r7, r8, r8)     // Catch: java.lang.Throwable -> L92
            androidx.compose.ui.layout.w r6 = r6.R(r0)     // Catch: java.lang.Throwable -> L92
            java.util.HashMap r4 = r4.l0     // Catch: java.lang.Throwable -> L92
            r4.getClass()     // Catch: java.lang.Throwable -> L92
            aq8 r0 = new aq8     // Catch: java.lang.Throwable -> L92
            r1 = 1
            r0.<init>(r6, r1)     // Catch: java.lang.Throwable -> L92
            bg9 r4 = r5.Y0(r7, r8, r4, r0)     // Catch: java.lang.Throwable -> L92
            android.os.Trace.endSection()
            return r4
        L92:
            r4 = move-exception
            android.os.Trace.endSection()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjf.d(androidx.compose.ui.layout.q, vf9, long):bg9");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // defpackage.lm8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int p(defpackage.w59 r1, defpackage.pl7 r2, int r3) {
        /*
            r0 = this;
            sjf$a r2 = r0.o0
            if (r2 == 0) goto L10
            boolean r3 = r2.c
            if (r3 == 0) goto L9
            goto La
        L9:
            r2 = 0
        La:
            if (r2 == 0) goto L10
            j3b r2 = r2.d
            if (r2 != 0) goto L14
        L10:
            j3b r2 = r0.c2()
        L14:
            r2.d(r1)
            vl8 r0 = r1.getLayoutDirection()
            h3b r0 = r2.e(r0)
            float r0 = r0.c()
            int r0 = defpackage.rdf.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjf.p(w59, pl7, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // defpackage.lm8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int r(defpackage.w59 r2, defpackage.pl7 r3, int r4) {
        /*
            r1 = this;
            sjf$a r3 = r1.o0
            if (r3 == 0) goto L10
            boolean r0 = r3.c
            if (r0 == 0) goto L9
            goto La
        L9:
            r3 = 0
        La:
            if (r3 == 0) goto L10
            j3b r3 = r3.d
            if (r3 != 0) goto L14
        L10:
            j3b r3 = r1.c2()
        L14:
            r3.d(r2)
            vl8 r1 = r2.getLayoutDirection()
            int r1 = r3.a(r4, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjf.r(w59, pl7, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // defpackage.lm8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int v(defpackage.w59 r2, defpackage.pl7 r3, int r4) {
        /*
            r1 = this;
            sjf$a r3 = r1.o0
            if (r3 == 0) goto L10
            boolean r0 = r3.c
            if (r0 == 0) goto L9
            goto La
        L9:
            r3 = 0
        La:
            if (r3 == 0) goto L10
            j3b r3 = r3.d
            if (r3 != 0) goto L14
        L10:
            j3b r3 = r1.c2()
        L14:
            r3.d(r2)
            vl8 r1 = r2.getLayoutDirection()
            int r1 = r3.a(r4, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjf.v(w59, pl7, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0016  */
    @Override // defpackage.eb4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(defpackage.sm8 r11) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjf.y(sm8):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // defpackage.lm8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int z(defpackage.w59 r1, defpackage.pl7 r2, int r3) {
        /*
            r0 = this;
            sjf$a r2 = r0.o0
            if (r2 == 0) goto L10
            boolean r3 = r2.c
            if (r3 == 0) goto L9
            goto La
        L9:
            r2 = 0
        La:
            if (r2 == 0) goto L10
            j3b r2 = r2.d
            if (r2 != 0) goto L14
        L10:
            j3b r2 = r0.c2()
        L14:
            r2.d(r1)
            vl8 r0 = r1.getLayoutDirection()
            h3b r0 = r2.e(r0)
            float r0 = r0.b()
            int r0 = defpackage.rdf.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjf.z(w59, pl7, int):int");
    }
}
