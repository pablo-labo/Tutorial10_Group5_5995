package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.g;
import androidx.compose.runtime.i;
import androidx.compose.runtime.q;
import androidx.compose.runtime.r;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.cyd;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class csf<S> {
    public final rsf<S> a;
    public final csf<?> b;
    public final String c;
    public final g4a d;
    public final g4a e;
    public final m3a f;
    public final m3a g;
    public final g4a h;
    public final SnapshotStateList<csf<S>.d<?, ?>> i;
    public final SnapshotStateList<csf<?>> j;
    public final g4a k;
    public final az3 l;

    public final class a<T, V extends ge0> {
        public final mvf a;
        public final g4a b = r.f(null);

        /* JADX INFO: renamed from: csf$a$a, reason: collision with other inner class name */
        public final class C0199a<T, V extends ge0> implements ese<T> {
            public final csf<S>.d<T, V> a;
            public Function1<? super b<S>, ? extends jf5<T>> b;
            public Function1<? super S, ? extends T> c;

            public C0199a(csf<S>.d<T, V> dVar, Function1<? super b<S>, ? extends jf5<T>> function1, Function1<? super S, ? extends T> function12) {
                this.a = dVar;
                this.b = function1;
                this.c = function12;
            }

            @Override // defpackage.ese
            public final T getValue() {
                i(csf.this.f());
                return (T) ((gme) this.a.Y).getValue();
            }

            public final void i(b<S> bVar) {
                T tInvoke = this.c.invoke(bVar.a());
                boolean zH = csf.this.h();
                csf<S>.d<T, V> dVar = this.a;
                if (zH) {
                    dVar.z(this.c.invoke(bVar.b()), tInvoke, this.b.invoke(bVar));
                } else {
                    dVar.A(tInvoke, this.b.invoke(bVar));
                }
            }
        }

        public a(mvf mvfVar, String str) {
            this.a = mvfVar;
        }

        public final C0199a a(Function1 function1, Function1 function12) {
            g4a g4aVar = this.b;
            C0199a c0199a = (C0199a) ((gme) g4aVar).getValue();
            csf<S> csfVar = csf.this;
            if (c0199a == null) {
                Object objInvoke = function12.invoke(csfVar.a.a());
                Object objInvoke2 = function12.invoke(csfVar.a.a());
                mvf mvfVar = this.a;
                ge0 ge0Var = (ge0) mvfVar.a().invoke(objInvoke2);
                ge0Var.d();
                csf<S>.d<?, ?> dVar = csfVar.new d<>(objInvoke, ge0Var, mvfVar);
                c0199a = new C0199a(dVar, function1, function12);
                ((gme) g4aVar).setValue(c0199a);
                csfVar.i.add(dVar);
            }
            c0199a.c = function12;
            c0199a.b = function1;
            c0199a.i(csfVar.f());
            return c0199a;
        }
    }

    public interface b<S> {
        S a();

        S b();

        default boolean c(S s, S s2) {
            return s.equals(b()) && s2.equals(a());
        }
    }

    public static final class c<S> implements b<S> {
        public final S a;
        public final S b;

        public c(S s, S s2) {
            this.a = s;
            this.b = s2;
        }

        @Override // csf.b
        public final S a() {
            return this.b;
        }

        @Override // csf.b
        public final S b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return wl7.b(this.a, bVar.b()) && wl7.b(this.b, bVar.a());
        }

        public final int hashCode() {
            S s = this.a;
            int iHashCode = (s != null ? s.hashCode() : 0) * 31;
            S s2 = this.b;
            return iHashCode + (s2 != null ? s2.hashCode() : 0);
        }
    }

    public final class d<T, V extends ge0> implements ese<T> {
        public final g4a V;
        public final x2a W;
        public boolean X;
        public final g4a Y;
        public V Z;
        public final lvf<T, V> a;
        public final m3a a0;
        public final g4a b;
        public boolean b0;
        public final g4a c;
        public final vpe c0;
        public final g4a d;
        public cyd.a e;
        public aaf<T, V> f;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Object obj, ge0 ge0Var, lvf lvfVar) {
            this.a = lvfVar;
            g4a g4aVarF = r.f(obj);
            this.b = g4aVarF;
            T tInvoke = null;
            g4a g4aVarF2 = r.f(zd0.c(0.0f, null, 7));
            this.c = g4aVarF2;
            this.d = r.f(new aaf((jf5) ((gme) g4aVarF2).getValue(), lvfVar, obj, ((gme) g4aVarF).getValue(), ge0Var));
            this.V = r.f(Boolean.TRUE);
            this.W = g.a(-1.0f);
            this.Y = r.f(obj);
            this.Z = ge0Var;
            this.a0 = q.a(i().d());
            Float f = etg.a.get(lvfVar);
            if (f != null) {
                float fFloatValue = f.floatValue();
                V vInvoke = lvfVar.a().invoke(obj);
                int iB = vInvoke.b();
                for (int i = 0; i < iB; i++) {
                    vInvoke.e(fFloatValue, i);
                }
                tInvoke = this.a.b().invoke(vInvoke);
            }
            this.c0 = zd0.c(0.0f, tInvoke, 3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void A(T t, jf5<T> jf5Var) {
            if (this.X) {
                aaf<T, V> aafVar = this.f;
                if (wl7.b(t, aafVar != null ? aafVar.c : null)) {
                    return;
                }
            }
            g4a g4aVar = this.b;
            boolean zB = wl7.b(((gme) g4aVar).getValue(), t);
            x2a x2aVar = this.W;
            if (zB && ((cme) x2aVar).g() == -1.0f) {
                return;
            }
            ((gme) g4aVar).setValue(t);
            ((gme) this.c).setValue(jf5Var);
            cme cmeVar = (cme) x2aVar;
            Object value = cmeVar.g() == -3.0f ? t : ((gme) this.Y).getValue();
            g4a g4aVar2 = this.V;
            y(value, !((Boolean) ((gme) g4aVar2).getValue()).booleanValue());
            ((gme) g4aVar2).setValue(Boolean.valueOf(cmeVar.g() == -3.0f));
            if (cmeVar.g() >= 0.0f) {
                o(i().f((long) (cmeVar.g() * i().d())));
            } else if (cmeVar.g() == -3.0f) {
                o(t);
            }
            this.X = false;
            ((cme) x2aVar).q(-1.0f);
        }

        @Override // defpackage.ese
        public final T getValue() {
            return (T) ((gme) this.Y).getValue();
        }

        public final aaf<T, V> i() {
            return (aaf) ((gme) this.d).getValue();
        }

        public final void n(long j) {
            if (((cme) this.W).g() == -1.0f) {
                this.b0 = true;
                if (wl7.b(i().c, i().d)) {
                    o(i().c);
                } else {
                    o(i().f(j));
                    this.Z = (V) i().b(j);
                }
            }
        }

        public final void o(T t) {
            ((gme) this.Y).setValue(t);
        }

        public final String toString() {
            return "current value: " + ((gme) this.Y).getValue() + ", target: " + ((gme) this.b).getValue() + ", spec: " + ((jf5) ((gme) this.c).getValue());
        }

        public final void y(T t, boolean z) {
            aaf<T, V> aafVar = this.f;
            T t2 = aafVar != null ? aafVar.c : null;
            gme gmeVar = (gme) this.b;
            boolean zB = wl7.b(t2, gmeVar.getValue());
            m3a m3aVar = this.a0;
            g4a g4aVar = this.d;
            jf5 jf5Var = this.c0;
            if (zB) {
                ((gme) g4aVar).setValue(new aaf(jf5Var, this.a, t, t, this.Z.c()));
                this.X = true;
                ((eme) m3aVar).v(i().d());
                return;
            }
            g4a g4aVar2 = this.c;
            if (!z || this.b0 || (((jf5) ((gme) g4aVar2).getValue()) instanceof vpe)) {
                jf5Var = (jf5) ((gme) g4aVar2).getValue();
            }
            csf<S> csfVar = csf.this;
            long jE = csfVar.e();
            g4a g4aVar3 = csfVar.h;
            ((gme) g4aVar).setValue(new aaf(jE <= 0 ? jf5Var : new lre(jf5Var, csfVar.e()), this.a, t, gmeVar.getValue(), this.Z));
            ((eme) m3aVar).v(i().d());
            this.X = false;
            ((gme) g4aVar3).setValue(Boolean.TRUE);
            if (csfVar.h()) {
                SnapshotStateList<csf<S>.d<?, ?>> snapshotStateList = csfVar.i;
                int size = snapshotStateList.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    csf<S>.d<?, ?> dVar = snapshotStateList.get(i);
                    jMax = Math.max(jMax, ((eme) dVar.a0).a());
                    dVar.n(0L);
                }
                ((gme) g4aVar3).setValue(Boolean.FALSE);
            }
        }

        public final void z(T t, T t2, jf5<T> jf5Var) {
            ((gme) this.b).setValue(t2);
            ((gme) this.c).setValue(jf5Var);
            if (wl7.b(i().d, t) && wl7.b(i().c, t2)) {
                return;
            }
            y(t, false);
        }
    }

    @uh3(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", l = {1202}, m = "invokeSuspend")
    public static final class e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        float F$0;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ csf<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(csf<S> csfVar, lu2<? super e> lu2Var) {
            super(2, lu2Var);
            this.this$0 = csfVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            e eVar = new e(this.this$0, lu2Var);
            eVar.L$0 = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            final float fH;
            e13 e13Var;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                e13 e13Var2 = (e13) this.L$0;
                fH = x0f.h(e13Var2.getCoroutineContext());
                e13Var = e13Var2;
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fH = this.F$0;
                e13Var = (e13) this.L$0;
                r7d.b(obj);
            }
            while (f13.e(e13Var)) {
                final csf<S> csfVar = this.this$0;
                Function1 function1 = new Function1() { // from class: dsf
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        long jLongValue = ((Long) obj2).longValue();
                        csf csfVar2 = csfVar;
                        boolean zH = csfVar2.h();
                        m3a m3aVar = csfVar2.g;
                        if (!zH) {
                            eme emeVar = (eme) m3aVar;
                            if (emeVar.a() == Long.MIN_VALUE) {
                                ((eme) m3aVar).v(jLongValue);
                                ((gme) csfVar2.a.a).setValue(Boolean.TRUE);
                            }
                            long jA = jLongValue - emeVar.a();
                            float f = fH;
                            if (f != 0.0f) {
                                jA = gf9.c(jA / ((double) f));
                            }
                            csfVar2.o(jA);
                            csfVar2.i(jA, f == 0.0f);
                        }
                        return j6g.a;
                    }
                };
                this.L$0 = e13Var;
                this.F$0 = fH;
                this.label = 1;
                Object objW = ly9.a(getContext()).W(function1, this);
                g13 g13Var = g13.a;
                if (objW == g13Var) {
                    return g13Var;
                }
            }
            return j6g.a;
        }
    }

    public static final class f implements l74 {
        @Override // defpackage.l74
        public final void dispose() {
        }
    }

    public csf() {
        throw null;
    }

    public csf(rsf<S> rsfVar, csf<?> csfVar, String str) {
        this.a = rsfVar;
        this.b = csfVar;
        this.c = str;
        this.d = r.f(rsfVar.a());
        this.e = r.f(new c(rsfVar.a(), rsfVar.a()));
        this.f = q.a(0L);
        this.g = q.a(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.h = r.f(bool);
        this.i = new SnapshotStateList<>();
        this.j = new SnapshotStateList<>();
        this.k = r.f(bool);
        this.l = r.c(new fy(this, 20));
        rsfVar.d(this);
    }

    public final void a(final S s, androidx.compose.runtime.b bVar, final int i) {
        int i2;
        androidx.compose.runtime.c cVarH = bVar.h(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? cVarH.K(s) : cVarH.x(s) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(this) ? 32 : 16;
        }
        if (!cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            cVarH.D();
        } else if (h()) {
            cVarH.L(467781377);
            cVarH.U(false);
        } else {
            cVarH.L(466120769);
            q(s);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (z || objV == c0020a) {
                objV = r.c(new nj(this, 24));
                cVarH.p(objV);
            }
            if (((Boolean) ((ese) objV).getValue()).booleanValue()) {
                cVarH.L(466528884);
                Object objV2 = cVarH.v();
                if (objV2 == c0020a) {
                    m74 m74Var = to4.a;
                    objV2 = v40.b(cVarH.l(), cVarH);
                }
                e13 e13Var = (e13) objV2;
                boolean zX = cVarH.x(e13Var) | (i3 == 32);
                Object objV3 = cVarH.v();
                if (zX || objV3 == c0020a) {
                    objV3 = new kc(7, e13Var, this);
                    cVarH.p(objV3);
                }
                to4.a(e13Var, this, (Function1) objV3, cVarH);
                cVarH.U(false);
            } else {
                cVarH.L(467771457);
                cVarH.U(false);
            }
            cVarH.U(false);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: zrf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iL = ka2.L(i | 1);
                    this.a.a(s, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public final long b() {
        SnapshotStateList<csf<S>.d<?, ?>> snapshotStateList = this.i;
        int size = snapshotStateList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((eme) snapshotStateList.get(i).a0).a());
        }
        SnapshotStateList<csf<?>> snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, snapshotStateList2.get(i2).b());
        }
        return jMax;
    }

    public final void c() {
        SnapshotStateList<csf<S>.d<?, ?>> snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            csf<S>.d<?, ?> dVar = snapshotStateList.get(i);
            dVar.f = null;
            dVar.e = null;
            dVar.X = false;
        }
        SnapshotStateList<csf<?>> snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).c();
        }
    }

    public final boolean d() {
        SnapshotStateList<csf<S>.d<?, ?>> snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            if (snapshotStateList.get(i).e != null) {
                return true;
            }
        }
        SnapshotStateList<csf<?>> snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (snapshotStateList2.get(i2).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        csf<?> csfVar = this.b;
        return csfVar != null ? csfVar.e() : this.f.a();
    }

    public final b<S> f() {
        return (b) ((gme) this.e).getValue();
    }

    public final S g() {
        return (S) ((gme) this.d).getValue();
    }

    public final boolean h() {
        return ((Boolean) ((gme) this.k).getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [V extends ge0, ge0] */
    public final void i(long j, boolean z) {
        m3a m3aVar = this.g;
        long jA = ((eme) m3aVar).a();
        rsf<S> rsfVar = this.a;
        if (jA == Long.MIN_VALUE) {
            ((eme) m3aVar).v(j);
            ((gme) rsfVar.a).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((gme) rsfVar.a).getValue()).booleanValue()) {
            ((gme) rsfVar.a).setValue(Boolean.TRUE);
        }
        ((gme) this.h).setValue(Boolean.FALSE);
        SnapshotStateList<csf<S>.d<?, ?>> snapshotStateList = this.i;
        int size = snapshotStateList.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            csf<S>.d<?, ?> dVar = snapshotStateList.get(i);
            g4a g4aVar = dVar.V;
            g4a g4aVar2 = dVar.V;
            if (!((Boolean) ((gme) g4aVar).getValue()).booleanValue()) {
                long jD = z ? dVar.i().d() : j;
                dVar.o(dVar.i().f(jD));
                dVar.Z = dVar.i().b(jD);
                if (dVar.i().c(jD)) {
                    ((gme) g4aVar2).setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) ((gme) g4aVar2).getValue()).booleanValue()) {
                z2 = false;
            }
        }
        SnapshotStateList<csf<?>> snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            csf<?> csfVar = snapshotStateList2.get(i2);
            g4a g4aVar3 = csfVar.d;
            rsf<?> rsfVar2 = csfVar.a;
            if (!wl7.b(((gme) g4aVar3).getValue(), rsfVar2.a())) {
                csfVar.i(j, z);
            }
            if (!wl7.b(((gme) csfVar.d).getValue(), rsfVar2.a())) {
                z2 = false;
            }
        }
        if (z2) {
            j();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j() {
        ((eme) this.g).v(Long.MIN_VALUE);
        rsf<S> rsfVar = this.a;
        if (rsfVar instanceof i4a) {
            ((i4a) rsfVar).c(((gme) this.d).getValue());
        }
        o(0L);
        ((gme) rsfVar.a).setValue(Boolean.FALSE);
        SnapshotStateList<csf<?>> snapshotStateList = this.j;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).j();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(float f2) {
        SnapshotStateList<csf<S>.d<?, ?>> snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            csf<S>.d<?, ?> dVar = snapshotStateList.get(i);
            dVar.getClass();
            if (f2 == -4.0f || f2 == -5.0f) {
                aaf<?, V> aafVar = dVar.f;
                if (aafVar != 0) {
                    dVar.i().h(aafVar.c);
                    dVar.e = null;
                    dVar.f = null;
                }
                Object obj = f2 == -4.0f ? dVar.i().d : dVar.i().c;
                dVar.i().h(obj);
                dVar.i().i(obj);
                dVar.o(obj);
                ((eme) dVar.a0).v(dVar.i().d());
            } else {
                ((cme) dVar.W).q(f2);
            }
        }
        SnapshotStateList<csf<?>> snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).k(f2);
        }
    }

    public final void l(Object obj, Object obj2) {
        ((eme) this.g).v(Long.MIN_VALUE);
        rsf<S> rsfVar = this.a;
        ((gme) rsfVar.a).setValue(Boolean.FALSE);
        boolean zH = h();
        g4a g4aVar = this.d;
        if (!zH || !wl7.b(rsfVar.a(), obj) || !wl7.b(((gme) g4aVar).getValue(), obj2)) {
            if (!wl7.b(rsfVar.a(), obj) && (rsfVar instanceof i4a)) {
                ((i4a) rsfVar).c(obj);
            }
            ((gme) g4aVar).setValue(obj2);
            ((gme) this.k).setValue(Boolean.TRUE);
            ((gme) this.e).setValue(new c(obj, obj2));
        }
        SnapshotStateList<csf<?>> snapshotStateList = this.j;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            csf<?> csfVar = snapshotStateList.get(i);
            csfVar.getClass();
            if (csfVar.h()) {
                csfVar.l(csfVar.a.a(), ((gme) csfVar.d).getValue());
            }
        }
        SnapshotStateList<csf<S>.d<?, ?>> snapshotStateList2 = this.i;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).n(0L);
        }
    }

    public final void m(long j) {
        m3a m3aVar = this.g;
        if (((eme) m3aVar).a() == Long.MIN_VALUE) {
            ((eme) m3aVar).v(j);
        }
        o(j);
        ((gme) this.h).setValue(Boolean.FALSE);
        SnapshotStateList<csf<S>.d<?, ?>> snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).n(j);
        }
        SnapshotStateList<csf<?>> snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            csf<?> csfVar = snapshotStateList2.get(i2);
            if (!wl7.b(((gme) csfVar.d).getValue(), csfVar.a.a())) {
                csfVar.m(j);
            }
        }
    }

    public final void n(cyd.a aVar) {
        SnapshotStateList<csf<S>.d<?, ?>> snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            csf<S>.d<?, ?> dVar = snapshotStateList.get(i);
            g4a g4aVar = dVar.Y;
            if (!wl7.b(dVar.i().c, dVar.i().d)) {
                dVar.f = dVar.i();
                dVar.e = aVar;
            }
            gme gmeVar = (gme) g4aVar;
            ((gme) dVar.d).setValue(new aaf(dVar.c0, dVar.a, gmeVar.getValue(), gmeVar.getValue(), dVar.Z.c()));
            ((eme) dVar.a0).v(dVar.i().d());
            dVar.X = true;
        }
        SnapshotStateList<csf<?>> snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).n(aVar);
        }
    }

    public final void o(long j) {
        if (this.b == null) {
            ((eme) this.f).v(j);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void p() {
        sd0 sd0Var;
        SnapshotStateList<csf<S>.d<?, ?>> snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            csf<S>.d<?, ?> dVar = snapshotStateList.get(i);
            cyd.a aVar = dVar.e;
            if (aVar != null && (sd0Var = dVar.f) != null) {
                long jC = gf9.c(aVar.g * ((double) aVar.d));
                Object objF = sd0Var.f(jC);
                if (dVar.X) {
                    dVar.i().i(objF);
                }
                dVar.i().h(objF);
                ((eme) dVar.a0).v(dVar.i().d());
                if (((cme) dVar.W).g() == -2.0f || dVar.X) {
                    dVar.o(objF);
                } else {
                    dVar.n(csf.this.e());
                }
                if (jC >= aVar.g) {
                    dVar.e = null;
                    dVar.f = null;
                } else {
                    aVar.c = false;
                }
            }
        }
        SnapshotStateList<csf<?>> snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).p();
        }
    }

    public final void q(S s) {
        g4a g4aVar = this.d;
        gme gmeVar = (gme) g4aVar;
        if (wl7.b(gmeVar.getValue(), s)) {
            return;
        }
        ((gme) this.e).setValue(new c(gmeVar.getValue(), s));
        rsf<S> rsfVar = this.a;
        if (!wl7.b(rsfVar.a(), gmeVar.getValue())) {
            rsfVar.c((S) gmeVar.getValue());
        }
        ((gme) g4aVar).setValue(s);
        if (((eme) this.g).a() == Long.MIN_VALUE) {
            ((gme) this.h).setValue(Boolean.TRUE);
        }
        SnapshotStateList<csf<S>.d<?, ?>> snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((cme) snapshotStateList.get(i).W).q(-2.0f);
        }
    }

    public final String toString() {
        SnapshotStateList<csf<S>.d<?, ?>> snapshotStateList = this.i;
        int size = snapshotStateList.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + snapshotStateList.get(i) + ", ";
        }
        return str;
    }
}
