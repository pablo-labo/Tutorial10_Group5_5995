package defpackage;

import android.os.Trace;
import androidx.compose.runtime.g;
import androidx.compose.runtime.r;
import defpackage.ft2;
import defpackage.w27;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class kv0 extends x2b implements k0d {
    public static final tb j0 = new tb(1);
    public final nde V;
    public final g4a W;
    public final x2a X;
    public final g4a Y;
    public ex7 Z;
    public e13 a0;
    public Function1<? super b, ? extends b> b0;
    public Function1<? super b, j6g> c0;
    public ft2 d0;
    public int e0;
    public final nde f;
    public pv0 f0;
    public final gse g0;
    public final gse h0;
    public final rqc i0;

    public static final class a {
        public final m17 a;
        public final w27 b;
        public final jv0 c;

        public a(m17 m17Var, w27 w27Var, jv0 jv0Var) {
            this.a = m17Var;
            this.b = w27Var;
            this.c = jv0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!wl7.b(this.a, aVar.a)) {
                return false;
            }
            jv0 jv0Var = aVar.c;
            jv0 jv0Var2 = this.c;
            return wl7.b(jv0Var2, jv0Var) && jv0Var2.b(this.b, aVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            jv0 jv0Var = this.c;
            return jv0Var.a(this.b) + ((jv0Var.hashCode() + iHashCode) * 31);
        }

        public final String toString() {
            return "Input(imageLoader=" + this.a + ", request=" + this.b + ", modelEqualityDelegate=" + this.c + ')';
        }
    }

    public interface b {

        public static final class a implements b {
            public static final a a = new a();

            @Override // kv0.b
            public final x2b b() {
                return null;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1625786264;
            }

            public final String toString() {
                return "Empty";
            }
        }

        /* JADX INFO: renamed from: kv0$b$b, reason: collision with other inner class name */
        public static final class C0300b implements b {
            public final x2b a;
            public final uw4 b;

            public C0300b(x2b x2bVar, uw4 uw4Var) {
                this.a = x2bVar;
                this.b = uw4Var;
            }

            @Override // kv0.b
            public final x2b b() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0300b)) {
                    return false;
                }
                C0300b c0300b = (C0300b) obj;
                return wl7.b(this.a, c0300b.a) && this.b.equals(c0300b.b);
            }

            public final int hashCode() {
                x2b x2bVar = this.a;
                return this.b.hashCode() + ((x2bVar == null ? 0 : x2bVar.hashCode()) * 31);
            }

            public final String toString() {
                return "Error(painter=" + this.a + ", result=" + this.b + ')';
            }
        }

        public static final class c implements b {
            public final x2b a;

            public c(x2b x2bVar) {
                this.a = x2bVar;
            }

            @Override // kv0.b
            public final x2b b() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && wl7.b(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                x2b x2bVar = this.a;
                if (x2bVar == null) {
                    return 0;
                }
                return x2bVar.hashCode();
            }

            public final String toString() {
                return "Loading(painter=" + this.a + ')';
            }
        }

        public static final class d implements b {
            public final x2b a;
            public final mye b;

            public d(x2b x2bVar, mye myeVar) {
                this.a = x2bVar;
                this.b = myeVar;
            }

            @Override // kv0.b
            public final x2b b() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.a.equals(dVar.a) && this.b.equals(dVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Success(painter=" + this.a + ", result=" + this.b + ')';
            }
        }

        x2b b();
    }

    @uh3(c = "coil3.compose.AsyncImagePainter$onRemembered$1$1", f = "AsyncImagePainter.kt", l = {232}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        @uh3(c = "coil3.compose.AsyncImagePainter$onRemembered$1$1$2", f = "AsyncImagePainter.kt", l = {225, 229}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<a, lu2<? super b>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ kv0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kv0 kv0Var, lu2<? super a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = kv0Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                a aVar = new a(this.this$0, lu2Var);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(a aVar, lu2<? super b> lu2Var) {
                return ((a) create(aVar, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
            
                if (r7 == r5) goto L19;
             */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
            @Override // defpackage.x81
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    int r0 = r6.label
                    r1 = 0
                    r2 = 2
                    r3 = 1
                    if (r0 == 0) goto L1d
                    if (r0 == r3) goto L19
                    if (r0 != r2) goto L13
                    java.lang.Object r6 = r6.L$0
                    kv0 r6 = (defpackage.kv0) r6
                    defpackage.r7d.b(r7)
                    goto L57
                L13:
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r6)
                    return r1
                L19:
                    defpackage.r7d.b(r7)
                    goto L3d
                L1d:
                    defpackage.r7d.b(r7)
                    java.lang.Object r7 = r6.L$0
                    kv0$a r7 = (kv0.a) r7
                    kv0 r0 = r6.this$0
                    pv0 r4 = r0.f0
                    g13 r5 = defpackage.g13.a
                    if (r4 == 0) goto L40
                    w27 r1 = r7.b
                    w27 r0 = defpackage.kv0.j(r0, r1, r3)
                    m17 r7 = r7.a
                    r6.label = r3
                    java.lang.Object r7 = r4.a(r7, r0, r6)
                    if (r7 != r5) goto L3d
                    goto L55
                L3d:
                    kv0$b r7 = (kv0.b) r7
                    return r7
                L40:
                    w27 r3 = r7.b
                    r4 = 0
                    w27 r0 = defpackage.kv0.j(r0, r3, r4)
                    kv0 r3 = r6.this$0
                    m17 r7 = r7.a
                    r6.L$0 = r3
                    r6.label = r2
                    java.lang.Object r7 = r7.b(r0, r6)
                    if (r7 != r5) goto L56
                L55:
                    return r5
                L56:
                    r6 = r3
                L57:
                    c37 r7 = (defpackage.c37) r7
                    r6.getClass()
                    boolean r0 = r7 instanceof defpackage.mye
                    if (r0 == 0) goto L74
                    kv0$b$d r0 = new kv0$b$d
                    mye r7 = (defpackage.mye) r7
                    k07 r1 = r7.a
                    w27 r2 = r7.b
                    android.content.Context r2 = r2.a
                    int r6 = r6.e0
                    x2b r6 = defpackage.wg2.h(r1, r2, r6)
                    r0.<init>(r6, r7)
                    return r0
                L74:
                    boolean r0 = r7 instanceof defpackage.uw4
                    if (r0 == 0) goto L8e
                    kv0$b$b r0 = new kv0$b$b
                    uw4 r7 = (defpackage.uw4) r7
                    k07 r2 = r7.a
                    if (r2 == 0) goto L8a
                    w27 r1 = r7.b
                    android.content.Context r1 = r1.a
                    int r6 = r6.e0
                    x2b r1 = defpackage.wg2.h(r2, r1, r6)
                L8a:
                    r0.<init>(r1, r7)
                    return r0
                L8e:
                    defpackage.l.g()
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: kv0.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public /* synthetic */ class b implements wi5, ev5 {
            public final /* synthetic */ kv0 a;

            public b(kv0 kv0Var) {
                this.a = kv0Var;
            }

            @Override // defpackage.wi5
            public final Object a(Object obj, lu2 lu2Var) {
                kv0.k(this.a, (b) obj);
                return j6g.a;
            }

            @Override // defpackage.ev5
            public final vu5<?> c() {
                return new fa(2, this.a, kv0.class, "updateState", "updateState(Lcoil3/compose/AsyncImagePainter$State;)V", 4);
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof wi5) && (obj instanceof ev5)) {
                    return c().equals(((ev5) obj).c());
                }
                return false;
            }

            public final int hashCode() {
                return c().hashCode();
            }
        }

        /* JADX INFO: renamed from: kv0$c$c, reason: collision with other inner class name */
        @uh3(c = "coil3.compose.AsyncImagePainter$onRemembered$1$1$invokeSuspend$$inlined$flatMapLatest$1", f = "AsyncImagePainter.kt", l = {189}, m = "invokeSuspend")
        public static final class C0301c extends c1f implements wu5<wi5<? super a>, j6g, lu2<? super j6g>, Object> {
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;
            final /* synthetic */ kv0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0301c(kv0 kv0Var, lu2 lu2Var) {
                super(3, lu2Var);
                this.this$0 = kv0Var;
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.label;
                if (i == 0) {
                    r7d.b(obj);
                    wi5 wi5Var = (wi5) this.L$0;
                    gse gseVar = this.this$0.g0;
                    this.label = 1;
                    Object objX = wg2.x(wi5Var, gseVar, this);
                    g13 g13Var = g13.a;
                    if (objX == g13Var) {
                        return g13Var;
                    }
                } else {
                    if (i != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                }
                return j6g.a;
            }

            @Override // defpackage.wu5
            public final Object q(wi5<? super a> wi5Var, j6g j6gVar, lu2<? super j6g> lu2Var) {
                C0301c c0301c = new C0301c(this.this$0, lu2Var);
                c0301c.L$0 = wi5Var;
                c0301c.L$1 = j6gVar;
                return c0301c.invokeSuspend(j6g.a);
            }
        }

        public c(lu2<? super c> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return kv0.this.new c(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                kv0 kv0Var = kv0.this;
                f22 f22VarC0 = wg2.c0(kv0Var.V, new C0301c(kv0Var, null));
                a aVar = new a(kv0.this, null);
                int i2 = zj5.a;
                f22 f22VarC02 = wg2.c0(f22VarC0, new yj5(aVar, null));
                b bVar = new b(kv0.this);
                this.label = 1;
                Object objE = f22VarC02.e(bVar, this);
                g13 g13Var = g13.a;
                if (objE == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    public kv0(a aVar) {
        eo1 eo1Var = eo1.b;
        this.f = wg2.d(1, 0, eo1Var, 2);
        nde ndeVarD = wg2.d(1, 0, eo1Var, 2);
        ndeVarD.b(j6g.a);
        this.V = ndeVarD;
        this.W = r.f(null);
        this.X = g.a(1.0f);
        this.Y = r.f(null);
        this.b0 = j0;
        this.d0 = ft2.a.b;
        this.e0 = 1;
        this.g0 = hh2.e(aVar);
        gse gseVarE = hh2.e(b.a.a);
        this.h0 = gseVarE;
        this.i0 = wg2.j(gseVarE);
    }

    public static final w27 j(kv0 kv0Var, w27 w27Var, boolean z) {
        kv0Var.getClass();
        rie rieVar = w27Var.p;
        w27.c cVar = w27Var.t;
        if (rieVar instanceof hb4) {
            ((hb4) rieVar).x();
        }
        w27.a aVarA = w27.a(w27Var);
        aVarA.d = new lv0(w27Var, kv0Var);
        if (cVar.g == null) {
            aVarA.m = rie.a;
        }
        if (cVar.h == null) {
            ft2 ft2Var = kv0Var.d0;
            y03 y03Var = mkg.a;
            aVarA.n = (wl7.b(ft2Var, ft2.a.b) || wl7.b(ft2Var, ft2.a.e)) ? umd.b : umd.a;
        }
        if (cVar.i == null) {
            aVarA.o = dib.b;
        }
        if (z) {
            vr4 vr4Var = vr4.a;
            aVarA.g = vr4Var;
            aVarA.h = vr4Var;
            aVarA.i = vr4Var;
        }
        return aVarA.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void k(defpackage.kv0 r9, kv0.b r10) {
        /*
            gse r0 = r9.h0
            java.lang.Object r1 = r0.getValue()
            kv0$b r1 = (kv0.b) r1
            kotlin.jvm.functions.Function1<? super kv0$b, ? extends kv0$b> r2 = r9.b0
            java.lang.Object r10 = r2.invoke(r10)
            kv0$b r10 = (kv0.b) r10
            r0.setValue(r10)
            ft2 r5 = r9.d0
            boolean r0 = r10 instanceof kv0.b.d
            r8 = 0
            if (r0 == 0) goto L20
            r0 = r10
            kv0$b$d r0 = (kv0.b.d) r0
            mye r0 = r0.b
            goto L29
        L20:
            boolean r0 = r10 instanceof kv0.b.C0300b
            if (r0 == 0) goto L67
            r0 = r10
            kv0$b$b r0 = (kv0.b.C0300b) r0
            uw4 r0 = r0.b
        L29:
            w27 r2 = r0.a()
            q55$b<fsf$a> r3 = defpackage.z27.b
            java.lang.Object r2 = defpackage.r55.a(r2, r3)
            fsf$a r2 = (fsf.a) r2
            nv0$a r3 = defpackage.nv0.a
            fsf r2 = r2.a(r3, r0)
            boolean r3 = r2 instanceof defpackage.t73
            if (r3 == 0) goto L67
            x2b r3 = r1.b()
            boolean r4 = r1 instanceof kv0.b.c
            if (r4 == 0) goto L48
            goto L49
        L48:
            r3 = r8
        L49:
            x2b r4 = r10.b()
            t73 r2 = (defpackage.t73) r2
            int r6 = r2.c
            boolean r2 = r0 instanceof defpackage.mye
            if (r2 == 0) goto L5f
            mye r0 = (defpackage.mye) r0
            boolean r0 = r0.g
            if (r0 != 0) goto L5c
            goto L5f
        L5c:
            r0 = 0
        L5d:
            r7 = r0
            goto L61
        L5f:
            r0 = 1
            goto L5d
        L61:
            s73 r2 = new s73
            r2.<init>(r3, r4, r5, r6, r7)
            goto L68
        L67:
            r2 = r8
        L68:
            if (r2 == 0) goto L6b
            goto L6f
        L6b:
            x2b r2 = r10.b()
        L6f:
            g4a r0 = r9.W
            gme r0 = (defpackage.gme) r0
            r0.setValue(r2)
            x2b r0 = r1.b()
            x2b r2 = r10.b()
            if (r0 == r2) goto La1
            x2b r0 = r1.b()
            boolean r1 = r0 instanceof defpackage.k0d
            if (r1 == 0) goto L8b
            k0d r0 = (defpackage.k0d) r0
            goto L8c
        L8b:
            r0 = r8
        L8c:
            if (r0 == 0) goto L91
            r0.e()
        L91:
            x2b r0 = r10.b()
            boolean r1 = r0 instanceof defpackage.k0d
            if (r1 == 0) goto L9c
            r8 = r0
            k0d r8 = (defpackage.k0d) r8
        L9c:
            if (r8 == 0) goto La1
            r8.b()
        La1:
            kotlin.jvm.functions.Function1<? super kv0$b, j6g> r9 = r9.c0
            if (r9 == 0) goto La8
            r9.invoke(r10)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kv0.k(kv0, kv0$b):void");
    }

    @Override // defpackage.x2b
    public final boolean a(float f) {
        ((cme) this.X).q(f);
        return true;
    }

    @Override // defpackage.k0d
    public final void b() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object obj = (x2b) ((gme) this.W).getValue();
            k0d k0dVar = obj instanceof k0d ? (k0d) obj : null;
            if (k0dVar != null) {
                k0dVar.b();
            }
            e13 e13Var = this.a0;
            if (e13Var == null) {
                wl7.g("scope");
                throw null;
            }
            uqe uqeVarY = u63.Y(e13Var, null, null, new c(null), 3);
            ex7 ex7Var = this.Z;
            if (ex7Var != null) {
                ex7Var.h(null);
            }
            this.Z = uqeVarY;
            j6g j6gVar = j6g.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.x2b
    public final boolean c(ga2 ga2Var) {
        ((gme) this.Y).setValue(ga2Var);
        return true;
    }

    @Override // defpackage.k0d
    public final void d() {
        ex7 ex7Var = this.Z;
        if (ex7Var != null) {
            ex7Var.h(null);
        }
        this.Z = null;
        Object obj = (x2b) ((gme) this.W).getValue();
        k0d k0dVar = obj instanceof k0d ? (k0d) obj : null;
        if (k0dVar != null) {
            k0dVar.d();
        }
    }

    @Override // defpackage.k0d
    public final void e() {
        ex7 ex7Var = this.Z;
        if (ex7Var != null) {
            ex7Var.h(null);
        }
        this.Z = null;
        Object obj = (x2b) ((gme) this.W).getValue();
        k0d k0dVar = obj instanceof k0d ? (k0d) obj : null;
        if (k0dVar != null) {
            k0dVar.e();
        }
    }

    @Override // defpackage.x2b
    public final long h() {
        x2b x2bVar = (x2b) ((gme) this.W).getValue();
        if (x2bVar != null) {
            return x2bVar.h();
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.x2b
    public final void i(gb4 gb4Var) {
        this.f.b(new kie(gb4Var.c()));
        x2b x2bVar = (x2b) ((gme) this.W).getValue();
        if (x2bVar != null) {
            x2bVar.g(gb4Var, gb4Var.c(), ((cme) this.X).g(), (ga2) ((gme) this.Y).getValue());
        }
    }
}
