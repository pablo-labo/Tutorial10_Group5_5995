package defpackage;

import androidx.compose.runtime.g;
import androidx.compose.runtime.r;
import androidx.navigation.d;

/* JADX INFO: loaded from: classes.dex */
public final class cyd<S> extends rsf<S> {
    public static final ce0 r = new ce0(0.0f);
    public static final ce0 s = new ce0(1.0f);
    public final g4a b;
    public final g4a c;
    public S d;
    public csf<S> e;
    public long f;
    public final cq0 g;
    public qw1 i;
    public a n;
    public final bt o;
    public float p;
    public final x2a h = g.a(0.0f);
    public final a5a j = pnb.i();
    public final u4a k = new u4a();
    public long l = Long.MIN_VALUE;
    public final p3a<a> m = new p3a<>((Object) null);
    public final cd q = new cd(this, 15);

    public static final class a {
        public long a;
        public omg b;
        public boolean c;
        public float d;
        public final ce0 e = new ce0(0.0f);
        public ce0 f;
        public long g;
        public long h;

        public final String toString() {
            return "progress nanos: " + this.a + ", animationSpec: " + this.b + ", isComplete: " + this.c + ", value: " + this.d + ", start: " + this.e + ", initialVelocity: " + this.f + ", durationNanos: " + this.g + ", animationSpecDuration: " + this.h;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cyd(d dVar) {
        this.b = r.f(dVar);
        this.c = r.f(dVar);
        this.d = dVar;
        int i = 16;
        this.g = new cq0(this, i);
        this.o = new bt(this, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(defpackage.cyd r10) {
        /*
            x2a r0 = r10.h
            csf<S> r1 = r10.e
            if (r1 != 0) goto L7
            return
        L7:
            cyd$a r2 = r10.n
            r3 = 0
            if (r2 != 0) goto L63
            long r4 = r10.f
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L62
            cme r0 = (defpackage.cme) r0
            float r2 = r0.g()
            r4 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L21
            goto L62
        L21:
            g4a r2 = r10.c
            gme r2 = (defpackage.gme) r2
            java.lang.Object r2 = r2.getValue()
            g4a r4 = r10.b
            gme r4 = (defpackage.gme) r4
            java.lang.Object r4 = r4.getValue()
            boolean r2 = defpackage.wl7.b(r2, r4)
            if (r2 == 0) goto L38
            goto L62
        L38:
            cyd$a r2 = new cyd$a
            r2.<init>()
            float r4 = r0.g()
            r2.d = r4
            long r4 = r10.f
            r2.g = r4
            double r4 = (double) r4
            float r6 = r0.g()
            double r6 = (double) r6
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r8 = r8 - r6
            double r8 = r8 * r4
            long r4 = defpackage.gf9.c(r8)
            r2.h = r4
            r4 = 0
            float r0 = r0.g()
            ce0 r5 = r2.e
            r5.e(r0, r4)
            goto L63
        L62:
            r2 = r3
        L63:
            if (r2 == 0) goto L71
            long r4 = r10.f
            r2.g = r4
            p3a<cyd$a> r0 = r10.m
            r0.g(r2)
            r1.n(r2)
        L71:
            r10.n = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyd.f(cyd):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(defpackage.cyd r10, defpackage.pu2 r11) {
        /*
            p3a<cyd$a> r0 = r10.m
            boolean r1 = r11 instanceof defpackage.eyd
            if (r1 == 0) goto L15
            r1 = r11
            eyd r1 = (defpackage.eyd) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            eyd r1 = new eyd
            r1.<init>(r10, r11)
        L1a:
            java.lang.Object r11 = r1.result
            int r2 = r1.label
            r3 = 2
            r4 = 1
            r5 = -9223372036854775808
            g13 r7 = defpackage.g13.a
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2b
            goto L32
        L2b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r10)
            r10 = 0
            return r10
        L32:
            defpackage.r7d.b(r11)
            goto L74
        L36:
            defpackage.r7d.b(r11)
            boolean r11 = r0.d()
            if (r11 == 0) goto L46
            cyd$a r11 = r10.n
            if (r11 != 0) goto L46
            j6g r10 = defpackage.j6g.a
            return r10
        L46:
            v03 r11 = r1.getContext()
            float r11 = defpackage.x0f.h(r11)
            r2 = 0
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 != 0) goto L5b
            r10.k()
            r10.l = r5
            j6g r10 = defpackage.j6g.a
            return r10
        L5b:
            long r8 = r10.l
            int r11 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r11 != 0) goto L74
            bt r11 = r10.o
            r1.label = r4
            v03 r2 = r1.getContext()
            ky9 r2 = defpackage.ly9.a(r2)
            java.lang.Object r11 = r2.W(r11, r1)
            if (r11 != r7) goto L74
            goto L8c
        L74:
            boolean r11 = r0.e()
            if (r11 != 0) goto L84
            cyd$a r11 = r10.n
            if (r11 == 0) goto L7f
            goto L84
        L7f:
            r10.l = r5
            j6g r10 = defpackage.j6g.a
            return r10
        L84:
            r1.label = r3
            java.lang.Object r11 = r10.j(r1)
            if (r11 != r7) goto L74
        L8c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyd.g(cyd, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(defpackage.cyd r8, defpackage.pu2 r9) throws java.lang.Throwable {
        /*
            a5a r0 = r8.j
            boolean r1 = r9 instanceof defpackage.hyd
            if (r1 == 0) goto L15
            r1 = r9
            hyd r1 = (defpackage.hyd) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            hyd r1 = new hyd
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.result
            int r2 = r1.label
            r3 = 0
            r4 = 2
            r5 = 1
            g13 r6 = defpackage.g13.a
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r1.L$0
            defpackage.r7d.b(r9)
            goto L71
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r8)
            return r3
        L35:
            java.lang.Object r2 = r1.L$0
            defpackage.r7d.b(r9)
            r9 = r2
            goto L52
        L3c:
            defpackage.r7d.b(r9)
            g4a r9 = r8.b
            gme r9 = (defpackage.gme) r9
            java.lang.Object r9 = r9.getValue()
            r1.L$0 = r9
            r1.label = r5
            java.lang.Object r2 = r0.h(r1)
            if (r2 != r6) goto L52
            goto L6d
        L52:
            r1.L$0 = r9
            r1.label = r4
            qw1 r2 = new qw1
            lu2 r1 = defpackage.ewa.v(r1)
            r2.<init>(r5, r1)
            r2.q()
            r8.i = r2
            r0.p(r3)
            java.lang.Object r0 = r2.p()
            if (r0 != r6) goto L6e
        L6d:
            return r6
        L6e:
            r7 = r0
            r0 = r9
            r9 = r7
        L71:
            boolean r9 = defpackage.wl7.b(r9, r0)
            if (r9 == 0) goto L7a
            j6g r8 = defpackage.j6g.a
            return r8
        L7a:
            r0 = -9223372036854775808
            r8.l = r0
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "targetState while waiting for composition"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyd.h(cyd, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i(defpackage.cyd r8, defpackage.pu2 r9) throws java.lang.Throwable {
        /*
            a5a r0 = r8.j
            boolean r1 = r9 instanceof defpackage.iyd
            if (r1 == 0) goto L15
            r1 = r9
            iyd r1 = (defpackage.iyd) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            iyd r1 = new iyd
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.result
            int r2 = r1.label
            r3 = 0
            r4 = 2
            r5 = 1
            g13 r6 = defpackage.g13.a
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r1.L$0
            defpackage.r7d.b(r9)
            goto L7d
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r8)
            return r3
        L35:
            java.lang.Object r2 = r1.L$0
            defpackage.r7d.b(r9)
            r9 = r2
            goto L52
        L3c:
            defpackage.r7d.b(r9)
            g4a r9 = r8.b
            gme r9 = (defpackage.gme) r9
            java.lang.Object r9 = r9.getValue()
            r1.L$0 = r9
            r1.label = r5
            java.lang.Object r2 = r0.h(r1)
            if (r2 != r6) goto L52
            goto L79
        L52:
            S r2 = r8.d
            boolean r2 = defpackage.wl7.b(r9, r2)
            if (r2 == 0) goto L5e
            r0.p(r3)
            goto L83
        L5e:
            r1.L$0 = r9
            r1.label = r4
            qw1 r2 = new qw1
            lu2 r1 = defpackage.ewa.v(r1)
            r2.<init>(r5, r1)
            r2.q()
            r8.i = r2
            r0.p(r3)
            java.lang.Object r0 = r2.p()
            if (r0 != r6) goto L7a
        L79:
            return r6
        L7a:
            r7 = r0
            r0 = r9
            r9 = r7
        L7d:
            boolean r1 = defpackage.wl7.b(r9, r0)
            if (r1 == 0) goto L86
        L83:
            j6g r8 = defpackage.j6g.a
            return r8
        L86:
            r1 = -9223372036854775808
            r8.l = r1
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "snapTo() was canceled because state was changed to "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = " instead of "
            r1.append(r9)
            r1.append(r0)
            java.lang.String r9 = r1.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyd.i(cyd, pu2):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void l(a aVar, long j) {
        long j2 = aVar.a + j;
        aVar.a = j2;
        long j3 = aVar.h;
        if (j2 >= j3) {
            aVar.d = 1.0f;
            return;
        }
        omg omgVar = aVar.b;
        ce0 ce0Var = aVar.e;
        if (omgVar == null) {
            float f = j2 / j3;
            aVar.d = (f * 1.0f) + ((1.0f - f) * ce0Var.a(0));
            return;
        }
        ce0 ce0Var2 = aVar.f;
        if (ce0Var2 == null) {
            ce0Var2 = r;
        }
        aVar.d = nic.B(((ce0) omgVar.q(j2, ce0Var, s, ce0Var2)).a(0), 0.0f, 1.0f);
    }

    @Override // defpackage.rsf
    public final S a() {
        return (S) ((gme) this.c).getValue();
    }

    @Override // defpackage.rsf
    public final S b() {
        return (S) ((gme) this.b).getValue();
    }

    @Override // defpackage.rsf
    public final void c(S s2) {
        ((gme) this.c).setValue(s2);
    }

    @Override // defpackage.rsf
    public final void d(csf<S> csfVar) {
        csf<S> csfVar2 = this.e;
        if (csfVar2 != null && csfVar != csfVar2) {
            hib.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.e + ", new instance: " + csfVar);
        }
        this.e = csfVar;
    }

    @Override // defpackage.rsf
    public final void e() {
        this.e = null;
        ((qme) msf.b.getValue()).b(this);
    }

    public final Object j(pu2 pu2Var) {
        float fH = x0f.h(pu2Var.getContext());
        if (fH <= 0.0f) {
            k();
            return j6g.a;
        }
        this.p = fH;
        Object objW = ly9.a(pu2Var.getContext()).W(this.q, pu2Var);
        return objW == g13.a ? objW : j6g.a;
    }

    public final void k() {
        csf<S> csfVar = this.e;
        if (csfVar != null) {
            csfVar.c();
        }
        this.m.i();
        if (this.n != null) {
            this.n = null;
            o(1.0f);
            n();
        }
    }

    public final Object m(float f, Object obj, c1f c1fVar) {
        if (0.0f > f || f > 1.0f) {
            hib.a("Expecting fraction between 0 and 1. Got " + f);
        }
        csf<S> csfVar = this.e;
        if (csfVar == null) {
            return j6g.a;
        }
        Object objA = u4a.a(this.k, new fyd(obj, ((gme) this.b).getValue(), this, csfVar, f, null), c1fVar);
        return objA == g13.a ? objA : j6g.a;
    }

    public final void n() {
        csf<S> csfVar = this.e;
        if (csfVar == null) {
            return;
        }
        csfVar.m(gf9.c(((double) ((cme) this.h).g()) * ((Number) csfVar.l.getValue()).longValue()));
    }

    public final void o(float f) {
        ((cme) this.h).q(f);
    }
}
