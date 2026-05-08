package androidx.media3.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.Surface;
import androidx.media3.session.b;
import androidx.media3.session.g;
import androidx.media3.session.legacy.h;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.x;
import androidx.media3.session.z;
import androidx.media3.session.z.b;
import defpackage.b0;
import defpackage.bh9;
import defpackage.boa;
import defpackage.bq1;
import defpackage.cdb;
import defpackage.cqf;
import defpackage.dqf;
import defpackage.e35;
import defpackage.e47;
import defpackage.ebe;
import defpackage.et3;
import defpackage.g35;
import defpackage.gdb;
import defpackage.gi9;
import defpackage.gl9;
import defpackage.h5;
import defpackage.h54;
import defpackage.hi9;
import defpackage.hl9;
import defpackage.hz8;
import defpackage.ia;
import defpackage.ih9;
import defpackage.ij9;
import defpackage.ja;
import defpackage.k35;
import defpackage.k91;
import defpackage.ka2;
import defpackage.l6;
import defpackage.m6;
import defpackage.n60;
import defpackage.no2;
import defpackage.o6;
import defpackage.ob3;
import defpackage.oh9;
import defpackage.oj9;
import defpackage.ox0;
import defpackage.pyc;
import defpackage.q6;
import defpackage.qyc;
import defpackage.r40;
import defpackage.r6g;
import defpackage.rk9;
import defpackage.s40;
import defpackage.tf2;
import defpackage.u37;
import defpackage.uw8;
import defpackage.v37;
import defpackage.v40;
import defpackage.v8e;
import defpackage.v9e;
import defpackage.vdb;
import defpackage.vh6;
import defpackage.vjg;
import defpackage.vk3;
import defpackage.w20;
import defpackage.wpf;
import defpackage.wq2;
import defpackage.wqf;
import defpackage.x9e;
import defpackage.yk9;
import defpackage.yo2;
import defpackage.z25;
import defpackage.z65;
import defpackage.zkd;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class x extends g.a {
    public final WeakReference<s> b;
    public final androidx.media3.session.b<IBinder> c;
    public final Set<r.d> d;
    public pyc e;
    public int f;

    public static final class a implements r.c {
        public final f a;
        public final int b;

        public a(f fVar, int i) {
            this.a = fVar;
            this.b = i;
        }

        @Override // androidx.media3.session.r.c
        public final void a(int i, v8e v8eVar) {
            this.a.F0(i, v8eVar.b(), Bundle.EMPTY);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
        
            if (r2 != 4) goto L26;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.media3.session.r.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(int r10, defpackage.wu8<?> r11) {
            /*
                r9 = this;
                java.lang.String r0 = defpackage.wu8.j
                V r1 = r11.c
                int r2 = r11.d
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                java.lang.String r4 = defpackage.wu8.g
                int r5 = r11.a
                r3.putInt(r4, r5)
                java.lang.String r4 = defpackage.wu8.h
                long r5 = r11.b
                r3.putLong(r4, r5)
                kj9 r4 = r11.e
                if (r4 == 0) goto L43
                java.lang.String r5 = defpackage.wu8.i
                android.os.Bundle r6 = new android.os.Bundle
                r6.<init>()
                java.lang.String r7 = defpackage.kj9.e
                android.os.Bundle r8 = r4.a
                r6.putBundle(r7, r8)
                java.lang.String r7 = defpackage.kj9.f
                boolean r8 = r4.b
                r6.putBoolean(r7, r8)
                java.lang.String r7 = defpackage.kj9.g
                boolean r8 = r4.c
                r6.putBoolean(r7, r8)
                java.lang.String r7 = defpackage.kj9.h
                boolean r4 = r4.d
                r6.putBoolean(r7, r4)
                r3.putBundle(r5, r6)
            L43:
                d9e r11 = r11.f
                if (r11 == 0) goto L50
                java.lang.String r4 = defpackage.wu8.l
                android.os.Bundle r11 = r11.b()
                r3.putBundle(r4, r11)
            L50:
                java.lang.String r11 = defpackage.wu8.k
                r3.putInt(r11, r2)
                if (r1 != 0) goto L58
                goto L9c
            L58:
                r11 = 1
                if (r2 == r11) goto La2
                r11 = 2
                r4 = 0
                if (r2 == r11) goto L93
                r11 = 3
                if (r2 == r11) goto L66
                r11 = 4
                if (r2 == r11) goto La2
                goto L9c
            L66:
                bq1 r11 = new bq1
                e47 r1 = (defpackage.e47) r1
                e47$b r2 = defpackage.e47.b
                e47$a r2 = new e47$a
                r2.<init>()
                r5 = r4
            L72:
                int r6 = r1.size()
                if (r5 >= r6) goto L88
                java.lang.Object r6 = r1.get(r5)
                ij9 r6 = (defpackage.ij9) r6
                android.os.Bundle r6 = r6.b(r4)
                r2.c(r6)
                int r5 = r5 + 1
                goto L72
            L88:
                qyc r1 = r2.f()
                r11.<init>(r1)
                r3.putBinder(r0, r11)
                goto L9c
            L93:
                ij9 r1 = (defpackage.ij9) r1
                android.os.Bundle r11 = r1.b(r4)
                r3.putBundle(r0, r11)
            L9c:
                androidx.media3.session.f r9 = r9.a
                r9.K(r10, r3)
                return
            La2:
                defpackage.bg.h()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.session.x.a.b(int, wu8):void");
        }

        @Override // androidx.media3.session.r.c
        public final void c(int i, z zVar, gdb.a aVar, boolean z, boolean z2) {
            Bundle bundleT;
            int i2 = this.b;
            ka2.q(i2 != 0);
            boolean z3 = z || !aVar.a(17);
            boolean z4 = z2 || !aVar.a(30);
            f fVar = this.a;
            if (i2 < 2) {
                fVar.d1(i, zVar.q(aVar, z, true).t(i2), z3);
                return;
            }
            z zVarQ = zVar.q(aVar, z, z2);
            if (fVar instanceof m) {
                bundleT = new Bundle();
                bundleT.putBinder(z.l0, zVarQ.new b());
            } else {
                bundleT = zVarQ.t(i2);
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean(z.a.d, z3);
            bundle.putBoolean(z.a.e, z4);
            fVar.G0(i, bundleT, bundle);
        }

        @Override // androidx.media3.session.r.c
        public final void d(int i) {
            this.a.d(i);
        }

        @Override // androidx.media3.session.r.c
        public final void e(int i, Bundle bundle) {
            this.a.a1(i, bundle);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            return Objects.equals(this.a.asBinder(), ((a) obj).a.asBinder());
        }

        @Override // androidx.media3.session.r.c
        public final void f() {
            boa.p(this.a);
        }

        @Override // androidx.media3.session.r.c
        public final void g(int i, v9e v9eVar, boolean z, boolean z2, int i2) {
            this.a.D0(i, v9eVar.a(z, z2).c(i2));
        }

        @Override // androidx.media3.session.r.c
        public final void h(int i, gdb.a aVar) {
            this.a.B0(i, aVar.c());
        }

        public final int hashCode() {
            return Objects.hash(this.a.asBinder());
        }

        @Override // androidx.media3.session.r.c
        public final void i(int i, x9e x9eVar) {
            this.a.k0(i, x9eVar.b());
        }
    }

    public interface b {
        void a(vdb vdbVar, r.d dVar);
    }

    public interface c {
        void c(vdb vdbVar, r.d dVar, List<ij9> list);
    }

    public interface d {
        void a(vdb vdbVar, r.e eVar);
    }

    public interface e<T, K extends s> {
        T g(K k, r.d dVar, int i);
    }

    public x(s sVar) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.b = new WeakReference<>(sVar);
        this.c = new androidx.media3.session.b<>(sVar);
        this.d = Collections.synchronizedSet(new HashSet());
        this.e = pyc.X;
    }

    public static <T, K extends s> hz8<Void> h(K k, r.d dVar, int i, e<hz8<T>, K> eVar, wq2<hz8<T>> wq2Var) {
        if (k.k()) {
            return u37.b;
        }
        hz8<T> hz8VarG = eVar.g(k, dVar, i);
        ebe ebeVar = new ebe();
        hz8VarG.a(new yk9(k, ebeVar, wq2Var, hz8VarG, 1), h54.a);
        return ebeVar;
    }

    public static void n1(s sVar, r.d dVar, int i, x9e x9eVar) {
        try {
            r.c cVar = dVar.e;
            ka2.r(cVar);
            cVar.i(i, x9eVar);
            sVar.c.a(true, true);
        } catch (RemoteException e2) {
            zkd.U("MediaSessionStub", "Failed to send result to controller " + dVar, e2);
        }
    }

    public static k91 o1(wq2 wq2Var) {
        return new k91(new tf2(wq2Var, 7));
    }

    @Override // androidx.media3.session.g
    public final void A0(f fVar, int i, Bundle bundle) {
        if (fVar == null || bundle == null) {
            return;
        }
        try {
            l1(fVar, i, 19, o1(new vk3(oj9.b(bundle), 6)));
        } catch (RuntimeException e2) {
            zkd.U("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e2);
        }
    }

    @Override // androidx.media3.session.g
    public final void B(f fVar, int i, Bundle bundle, final boolean z) {
        if (fVar == null || bundle == null) {
            return;
        }
        try {
            final ox0 ox0VarA = ox0.a(bundle);
            l1(fVar, i, 35, o1(new wq2() { // from class: ol9
                @Override // defpackage.wq2
                public final void accept(Object obj) {
                    ((vdb) obj).F(ox0VarA, z);
                }
            }));
        } catch (RuntimeException e2) {
            zkd.U("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e2);
        }
    }

    @Override // androidx.media3.session.g
    public final void C0(f fVar, int i) {
        if (fVar == null) {
            return;
        }
        l1(fVar, i, 2, o1(new r40(13)));
    }

    @Override // androidx.media3.session.g
    public final void D(f fVar, int i, final int i2) {
        if (fVar == null || i2 < 0) {
            return;
        }
        l1(fVar, i, 25, o1(new wq2() { // from class: tl9
            @Override // defpackage.wq2
            public final void accept(Object obj) {
                ((vdb) obj).F0(i2);
            }
        }));
    }

    @Override // androidx.media3.session.g
    public final void F(f fVar, int i, IBinder iBinder, final boolean z) {
        if (fVar == null || iBinder == null) {
            return;
        }
        try {
            e47<Bundle> e47VarA = bq1.a(iBinder);
            e47.b bVar = e47.b;
            e47.a aVar = new e47.a();
            for (int i2 = 0; i2 < e47VarA.size(); i2++) {
                Bundle bundle = e47VarA.get(i2);
                bundle.getClass();
                aVar.c(ij9.a(bundle));
            }
            final qyc qycVarF = aVar.f();
            l1(fVar, i, 20, new vh6(new rk9(new e() { // from class: bm9
                @Override // androidx.media3.session.x.e
                public final Object g(s sVar, r.d dVar, int i3) {
                    boolean z2 = z;
                    return sVar.t(dVar, qycVarF, z2 ? -1 : sVar.t.v0(), z2 ? -9223372036854775807L : sVar.t.K0());
                }
            }, new s40()), 7));
        } catch (RuntimeException e2) {
            zkd.U("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e2);
        }
    }

    @Override // androidx.media3.session.g
    public final void G(f fVar, int i) {
        if (fVar == null) {
            return;
        }
        l1(fVar, i, 6, o1(new w20(16)));
    }

    @Override // androidx.media3.session.g
    public final void I(f fVar, int i) {
        r.d dVarG;
        if (fVar == null || (dVarG = this.c.g(fVar.asBinder())) == null) {
            return;
        }
        m1(dVarG, i, 9, o1(new ja(15)));
    }

    @Override // androidx.media3.session.g
    public final void I0(f fVar) {
        if (fVar == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            s sVar = this.b.get();
            if (sVar != null && !sVar.k()) {
                r.d dVarG = this.c.g(fVar.asBinder());
                if (dVarG != null) {
                    vjg.T(sVar.l, new et3(2, this, dVarG));
                }
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // androidx.media3.session.g
    public final void J0(f fVar, int i, final int i2, final int i3) {
        if (fVar == null || i2 < 0 || i3 < i2) {
            return;
        }
        l1(fVar, i, 20, new k91(new b() { // from class: bl9
            @Override // androidx.media3.session.x.b
            public final void a(vdb vdbVar, r.d dVar) {
                x xVar = this.a;
                vdbVar.y(xVar.k1(dVar, vdbVar, i2), xVar.k1(dVar, vdbVar, i3));
            }
        }));
    }

    @Override // androidx.media3.session.g
    public final void O0(f fVar, int i, Bundle bundle, boolean z) {
        if (fVar == null || bundle == null) {
            return;
        }
        try {
            l1(fVar, i, 31, new vh6(new rk9(new bh9(ij9.a(bundle), z), new s40()), 7));
        } catch (RuntimeException e2) {
            zkd.U("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e2);
        }
    }

    @Override // androidx.media3.session.g
    public final void P(f fVar, int i, Bundle bundle) {
        s sVar;
        WeakReference<s> weakReference = this.b;
        if (fVar == null || bundle == null) {
            return;
        }
        try {
            yo2 yo2VarA = yo2.a(bundle);
            int callingUid = Binder.getCallingUid();
            int callingPid = Binder.getCallingPid();
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = yo2VarA.d;
            }
            try {
                h.b bVar = new h.b(yo2VarA.c, callingPid, callingUid);
                s sVar2 = weakReference.get();
                boolean z = sVar2 != null && androidx.media3.session.legacy.h.a(sVar2.f).b(bVar);
                int i2 = yo2VarA.a;
                int i3 = yo2VarA.b;
                r.d dVar = new r.d(bVar, i2, i3, z, new a(fVar, i3), yo2VarA.e);
                if (fVar == null || (sVar = weakReference.get()) == null || sVar.k()) {
                    boa.p(fVar);
                } else {
                    this.d.add(dVar);
                    vjg.T(sVar.l, new no2(this, dVar, sVar, fVar));
                }
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th;
            }
        } catch (RuntimeException e2) {
            zkd.U("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e2);
        }
    }

    @Override // androidx.media3.session.g
    public final void P0(f fVar, int i) {
        r.d dVarG;
        if (fVar == null || (dVarG = this.c.g(fVar.asBinder())) == null) {
            return;
        }
        m1(dVarG, i, 3, o1(new q6(11)));
    }

    @Override // androidx.media3.session.g
    public final void R0(f fVar, int i) {
        r.d dVarG;
        if (fVar == null || (dVarG = this.c.g(fVar.asBinder())) == null) {
            return;
        }
        m1(dVarG, i, 12, o1(new ia(11)));
    }

    @Override // androidx.media3.session.g
    public final void S0(f fVar, int i, final int i2, final int i3, IBinder iBinder) {
        if (fVar == null || iBinder == null || i2 < 0 || i3 < i2) {
            return;
        }
        try {
            e47<Bundle> e47VarA = bq1.a(iBinder);
            e47.b bVar = e47.b;
            e47.a aVar = new e47.a();
            for (int i4 = 0; i4 < e47VarA.size(); i4++) {
                Bundle bundle = e47VarA.get(i4);
                bundle.getClass();
                aVar.c(ij9.a(bundle));
            }
            l1(fVar, i, 20, new vh6(new uw8(new g35(aVar.f()), new c() { // from class: cl9
                @Override // androidx.media3.session.x.c
                public final void c(vdb vdbVar, r.d dVar, List list) {
                    x xVar = this.a;
                    vdbVar.K(list, xVar.k1(dVar, vdbVar, i2), xVar.k1(dVar, vdbVar, i3));
                }
            }), 7));
        } catch (RuntimeException e2) {
            zkd.U("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e2);
        }
    }

    @Override // androidx.media3.session.g
    public final void T0(f fVar, int i) {
        r.d dVarG;
        if (fVar == null || (dVarG = this.c.g(fVar.asBinder())) == null) {
            return;
        }
        m1(dVarG, i, 1, o1(new z65(1, this, dVarG)));
    }

    @Override // androidx.media3.session.g
    public final void U(f fVar, int i) {
        r.d dVarG;
        if (fVar == null || (dVarG = this.c.g(fVar.asBinder())) == null) {
            return;
        }
        m1(dVarG, i, 7, o1(new s40()));
    }

    @Override // androidx.media3.session.g
    public final void U0(f fVar, int i, final boolean z) {
        if (fVar == null) {
            return;
        }
        l1(fVar, i, 1, o1(new wq2() { // from class: dl9
            @Override // defpackage.wq2
            public final void accept(Object obj) {
                ((vdb) obj).A(z);
            }
        }));
    }

    @Override // androidx.media3.session.g
    public final void W(f fVar, int i) {
        if (fVar == null) {
            return;
        }
        l1(fVar, i, 4, o1(new h5(17)));
    }

    @Override // androidx.media3.session.g
    public final void W0(f fVar, int i, final int i2) {
        if (fVar == null) {
            return;
        }
        l1(fVar, i, 34, o1(new wq2() { // from class: jl9
            @Override // defpackage.wq2
            public final void accept(Object obj) {
                ((vdb) obj).t(i2);
            }
        }));
    }

    @Override // androidx.media3.session.g
    public final void X0(f fVar, int i) {
        r.d dVarG;
        if (fVar == null || (dVarG = this.c.g(fVar.asBinder())) == null) {
            return;
        }
        m1(dVarG, i, 11, o1(new o6(14)));
    }

    @Override // androidx.media3.session.g
    public final void Z(f fVar, int i, final int i2) {
        if (fVar == null) {
            return;
        }
        l1(fVar, i, 34, o1(new wq2() { // from class: il9
            @Override // defpackage.wq2
            public final void accept(Object obj) {
                ((vdb) obj).C(i2);
            }
        }));
    }

    @Override // androidx.media3.session.g
    public final void b0(f fVar, int i, Bundle bundle, final long j) {
        if (fVar == null || bundle == null) {
            return;
        }
        try {
            final ij9 ij9VarA = ij9.a(bundle);
            l1(fVar, i, 31, new vh6(new rk9(new e() { // from class: rl9
                @Override // androidx.media3.session.x.e
                public final Object g(s sVar, r.d dVar, int i2) {
                    return sVar.t(dVar, e47.n(ij9VarA), 0, j);
                }
            }, new s40()), 7));
        } catch (RuntimeException e2) {
            zkd.U("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e2);
        }
    }

    public final <K extends s> void c(f fVar, final int i, final v8e v8eVar, final int i2, final e<hz8<Void>, K> eVar) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final s sVar = this.b.get();
            if (sVar != null && !sVar.k()) {
                final r.d dVarG = this.c.g(fVar.asBinder());
                if (dVarG == null) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                } else {
                    vjg.T(sVar.l, new Runnable() { // from class: vl9
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.media3.session.b<IBinder> bVar = this.a.c;
                            r.d dVar = dVarG;
                            if (bVar.k(dVar)) {
                                v8e v8eVar2 = v8eVar;
                                s sVar2 = sVar;
                                int i3 = i;
                                if (v8eVar2 != null) {
                                    if (!bVar.n(dVar, v8eVar2)) {
                                        x.n1(sVar2, dVar, i3, new x9e(-4));
                                        return;
                                    }
                                } else if (!bVar.m(dVar, i2)) {
                                    x.n1(sVar2, dVar, i3, new x9e(-4));
                                    return;
                                }
                                eVar.g(sVar2, dVar, i3);
                            }
                        }
                    });
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // androidx.media3.session.g
    public final void c0(f fVar, int i, int i2) {
        if (fVar == null || i2 < 0) {
            return;
        }
        l1(fVar, i, 20, new k91(new gi9(this, i2)));
    }

    @Override // androidx.media3.session.g
    public final void c1(f fVar, int i) {
        if (fVar == null) {
            return;
        }
        l1(fVar, i, 26, o1(new b0(19)));
    }

    @Override // androidx.media3.session.g
    public final void d0(f fVar, int i) {
        if (fVar == null) {
            return;
        }
        l1(fVar, i, 8, o1(new m6(11)));
    }

    public final z e(z zVar) {
        e47<wqf.a> e47Var = zVar.D.a;
        e47.a aVar = new e47.a();
        v37.a aVar2 = new v37.a(4);
        for (int i = 0; i < e47Var.size(); i++) {
            wqf.a aVar3 = e47Var.get(i);
            wpf wpfVar = aVar3.b;
            String string = (String) this.e.get(wpfVar);
            if (string == null) {
                StringBuilder sb = new StringBuilder();
                int i2 = this.f;
                this.f = i2 + 1;
                String str = vjg.a;
                sb.append(Integer.toString(i2, 36));
                sb.append("-");
                sb.append(wpfVar.b);
                string = sb.toString();
            }
            aVar2.d(wpfVar, string);
            aVar.c(new wqf.a(new wpf(string, aVar3.b.d), aVar3.c, aVar3.d, aVar3.e));
        }
        this.e = aVar2.a();
        z zVarB = zVar.b(new wqf(aVar.f()));
        dqf dqfVar = zVarB.E;
        if (dqfVar.D.isEmpty()) {
            return zVarB;
        }
        dqf.b bVarC = dqfVar.a().c();
        r6g<cqf> it = dqfVar.D.values().iterator();
        while (it.hasNext()) {
            cqf next = it.next();
            wpf wpfVar2 = next.a;
            String str2 = (String) this.e.get(wpfVar2);
            if (str2 != null) {
                bVarC.a(new cqf(new wpf(str2, wpfVar2.d), next.b));
            } else {
                bVarC.a(next);
            }
        }
        return zVarB.o(bVarC.b());
    }

    @Override // androidx.media3.session.g
    public final void e0(f fVar, int i, final long j) {
        if (fVar == null) {
            return;
        }
        l1(fVar, i, 5, o1(new wq2() { // from class: ul9
            @Override // defpackage.wq2
            public final void accept(Object obj) {
                ((vdb) obj).j0(j);
            }
        }));
    }

    @Override // androidx.media3.session.g
    public final void f0(f fVar, int i, final float f) {
        if (fVar == null || f < 0.0f || f > 1.0f) {
            return;
        }
        l1(fVar, i, 24, o1(new wq2() { // from class: pl9
            @Override // defpackage.wq2
            public final void accept(Object obj) {
                ((vdb) obj).k0(f);
            }
        }));
    }

    @Override // androidx.media3.session.g
    public final void f1(f fVar, int i, final boolean z, final int i2) {
        if (fVar == null) {
            return;
        }
        l1(fVar, i, 34, o1(new wq2() { // from class: ql9
            @Override // defpackage.wq2
            public final void accept(Object obj) {
                ((vdb) obj).r(i2, z);
            }
        }));
    }

    @Override // androidx.media3.session.g
    public final void g0(f fVar, int i, Bundle bundle) {
        b.C0057b<IBinder> c0057b;
        if (fVar == null || bundle == null) {
            return;
        }
        try {
            x9e x9eVarA = x9e.a(bundle);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                androidx.media3.session.b<IBinder> bVar = this.c;
                IBinder iBinderAsBinder = fVar.asBinder();
                synchronized (bVar.a) {
                    try {
                        r.d dVarG = bVar.g(iBinderAsBinder);
                        c0057b = dVarG != null ? bVar.c.get(dVarG) : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                a0 a0Var = c0057b != null ? c0057b.b : null;
                if (a0Var == null) {
                    return;
                }
                a0Var.d(i, x9eVarA);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e2) {
            zkd.U("MediaSessionStub", "Ignoring malformed Bundle for SessionResult", e2);
        }
    }

    @Override // androidx.media3.session.g
    public final void g1(f fVar, int i, Bundle bundle, Bundle bundle2) {
        if (fVar == null || bundle == null || bundle2 == null) {
            return;
        }
        try {
            v8e v8eVarA = v8e.a(bundle);
            c(fVar, i, v8eVarA, 0, new vh6(new hl9(v8eVarA, bundle2), 7));
        } catch (RuntimeException e2) {
            zkd.U("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e2);
        }
    }

    @Override // androidx.media3.session.g
    public final void h0(f fVar, int i, final int i2, final int i3) {
        if (fVar == null || i2 < 0 || i3 < 0) {
            return;
        }
        l1(fVar, i, 20, o1(new wq2() { // from class: sl9
            @Override // defpackage.wq2
            public final void accept(Object obj) {
                ((vdb) obj).z0(i2, i3);
            }
        }));
    }

    @Override // androidx.media3.session.g
    public final void h1(f fVar, int i, IBinder iBinder, final int i2, final long j) {
        if (fVar == null || iBinder == null) {
            return;
        }
        if (i2 == -1 || i2 >= 0) {
            try {
                e47<Bundle> e47VarA = bq1.a(iBinder);
                e47.b bVar = e47.b;
                e47.a aVar = new e47.a();
                for (int i3 = 0; i3 < e47VarA.size(); i3++) {
                    Bundle bundle = e47VarA.get(i3);
                    bundle.getClass();
                    aVar.c(ij9.a(bundle));
                }
                final qyc qycVarF = aVar.f();
                l1(fVar, i, 20, new vh6(new rk9(new e() { // from class: ll9
                    @Override // androidx.media3.session.x.e
                    public final Object g(s sVar, r.d dVar, int i4) {
                        int i5 = i2;
                        return sVar.t(dVar, qycVarF, i5 == -1 ? sVar.t.v0() : i5, i5 == -1 ? sVar.t.K0() : j);
                    }
                }, new s40()), 7));
            } catch (RuntimeException e2) {
                zkd.U("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e2);
            }
        }
    }

    @Override // androidx.media3.session.g
    public final void i0(f fVar, int i, final float f) {
        if (fVar == null || f <= 0.0f) {
            return;
        }
        l1(fVar, i, 13, o1(new wq2() { // from class: el9
            @Override // defpackage.wq2
            public final void accept(Object obj) {
                ((vdb) obj).h(f);
            }
        }));
    }

    @Override // androidx.media3.session.g
    public final void j0(f fVar, int i, int i2, Bundle bundle) {
        if (fVar == null || bundle == null || i2 < 0) {
            return;
        }
        try {
            l1(fVar, i, 20, new vh6(new uw8(new z25(ij9.a(bundle), 4), new oh9(this, i2)), 7));
        } catch (RuntimeException e2) {
            zkd.U("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e2);
        }
    }

    @Override // androidx.media3.session.g
    public final void j1(f fVar, int i, Bundle bundle) {
        if (fVar == null || bundle == null) {
            return;
        }
        try {
            l1(fVar, i, 29, o1(new hi9(this, dqf.b(bundle))));
        } catch (RuntimeException e2) {
            zkd.U("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e2);
        }
    }

    public final int k1(r.d dVar, vdb vdbVar, int i) {
        if (vdbVar.O0(17)) {
            androidx.media3.session.b<IBinder> bVar = this.c;
            if (!bVar.l(dVar, 17) && bVar.l(dVar, 16)) {
                return vdbVar.v0() + i;
            }
        }
        return i;
    }

    @Override // androidx.media3.session.g
    public final void l(f fVar, int i) {
        if (fVar == null) {
            return;
        }
        l1(fVar, i, 26, o1(new b0(18)));
    }

    @Override // androidx.media3.session.g
    public final void l0(f fVar, int i, IBinder iBinder) {
        if (fVar == null || iBinder == null) {
            return;
        }
        try {
            e47<Bundle> e47VarA = bq1.a(iBinder);
            e47.b bVar = e47.b;
            e47.a aVar = new e47.a();
            for (int i2 = 0; i2 < e47VarA.size(); i2++) {
                Bundle bundle = e47VarA.get(i2);
                bundle.getClass();
                aVar.c(ij9.a(bundle));
            }
            l1(fVar, i, 20, new vh6(new uw8(new vh6(aVar.f(), 6), new l6()), 7));
        } catch (RuntimeException e2) {
            zkd.U("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e2);
        }
    }

    public final <K extends s> void l1(f fVar, int i, int i2, e<hz8<Void>, K> eVar) {
        r.d dVarG = this.c.g(fVar.asBinder());
        if (dVarG != null) {
            m1(dVarG, i, i2, eVar);
        }
    }

    @Override // androidx.media3.session.g
    public final void m0(f fVar, int i, int i2, Bundle bundle) {
        if (fVar == null || bundle == null || i2 < 0) {
            return;
        }
        try {
            l1(fVar, i, 20, new vh6(new uw8(new vh6(ij9.a(bundle), 5), new k35(this, i2)), 7));
        } catch (RuntimeException e2) {
            zkd.U("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e2);
        }
    }

    public final <K extends s> void m1(final r.d dVar, final int i, final int i2, final e<hz8<Void>, K> eVar) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final s sVar = this.b.get();
            if (sVar != null && !sVar.k()) {
                vjg.T(sVar.l, new Runnable() { // from class: wl9
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.session.b<IBinder> bVar = this.a.c;
                        final r.d dVar2 = dVar;
                        int i3 = i2;
                        boolean zL = bVar.l(dVar2, i3);
                        final s sVar2 = sVar;
                        final int i4 = i;
                        if (!zL) {
                            x.n1(sVar2, dVar2, i4, new x9e(-4));
                            return;
                        }
                        zng zngVar = sVar2.e;
                        sVar2.v(dVar2);
                        zngVar.getClass();
                        final x.e eVar2 = eVar;
                        if (i3 != 27) {
                            bVar.b(dVar2, i3, new b.a() { // from class: am9
                                @Override // androidx.media3.session.b.a
                                public final hz8 run() {
                                    return (hz8) eVar2.g(sVar2, dVar2, i4);
                                }
                            });
                        } else {
                            eVar2.g(sVar2, dVar2, i4);
                            bVar.b(dVar2, i3, new zl9());
                        }
                    }
                });
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // androidx.media3.session.g
    public final void n(f fVar, int i) {
        r.d dVarG;
        if (fVar == null || (dVarG = this.c.g(fVar.asBinder())) == null) {
            return;
        }
        m1(dVarG, i, 1, o1(new defpackage.l(11)));
    }

    @Override // androidx.media3.session.g
    public final void n0(f fVar, int i, final int i2, final int i3) {
        if (fVar == null || i2 < 0) {
            return;
        }
        l1(fVar, i, 33, o1(new wq2() { // from class: ml9
            @Override // defpackage.wq2
            public final void accept(Object obj) {
                ((vdb) obj).h0(i2, i3);
            }
        }));
    }

    @Override // androidx.media3.session.g
    public final void o0(f fVar, int i, boolean z) {
        if (fVar == null) {
            return;
        }
        l1(fVar, i, 26, o1(new gl9(0, z)));
    }

    @Override // androidx.media3.session.g
    public final void p0(f fVar, int i, int i2) {
        if (fVar == null || i2 < 0) {
            return;
        }
        l1(fVar, i, 10, new k91(new ih9(this, i2)));
    }

    @Override // androidx.media3.session.g
    public final void q0(f fVar, int i, final int i2, final long j) {
        if (fVar == null || i2 < 0) {
            return;
        }
        l1(fVar, i, 10, new k91(new b() { // from class: fl9
            @Override // androidx.media3.session.x.b
            public final void a(vdb vdbVar, r.d dVar) {
                vdbVar.U(this.a.k1(dVar, vdbVar, i2), j);
            }
        }));
    }

    @Override // androidx.media3.session.g
    public final void r(f fVar, int i) {
        if (fVar == null) {
            return;
        }
        l1(fVar, i, 20, o1(new v40(13)));
    }

    @Override // androidx.media3.session.g
    public final void r0(f fVar, int i, final int i2) {
        if (fVar == null) {
            return;
        }
        if (i2 == 2 || i2 == 0 || i2 == 1) {
            l1(fVar, i, 15, o1(new wq2() { // from class: nl9
                @Override // defpackage.wq2
                public final void accept(Object obj) {
                    ((vdb) obj).w0(i2);
                }
            }));
        }
    }

    @Override // androidx.media3.session.g
    public final void t(f fVar, int i) {
        if (fVar == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            s sVar = this.b.get();
            if (sVar != null && !sVar.k()) {
                vjg.T(sVar.l, new n60(4, this, fVar));
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // androidx.media3.session.g
    public final void u0(f fVar, int i, Bundle bundle) {
        if (fVar == null || bundle == null) {
            return;
        }
        try {
            l1(fVar, i, 13, o1(new ob3(new cdb(bundle.getFloat(cdb.e, 1.0f), bundle.getFloat(cdb.f, 1.0f)), 5)));
        } catch (RuntimeException e2) {
            zkd.U("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e2);
        }
    }

    @Override // androidx.media3.session.g
    public final void v(f fVar, int i, boolean z) {
        if (fVar == null) {
            return;
        }
        l1(fVar, i, 14, o1(new gl9(1, z)));
    }

    @Override // androidx.media3.session.g
    public final void v0(f fVar, int i, final int i2, final int i3, final int i4) {
        if (fVar == null || i2 < 0 || i3 < i2 || i4 < 0) {
            return;
        }
        l1(fVar, i, 20, o1(new wq2() { // from class: kl9
            @Override // defpackage.wq2
            public final void accept(Object obj) {
                ((vdb) obj).A0(i2, i3, i4);
            }
        }));
    }

    @Override // androidx.media3.session.g
    public final void x0(f fVar, int i, Surface surface) {
        if (fVar == null) {
            return;
        }
        l1(fVar, i, 27, o1(new ob3(surface, 6)));
    }

    @Override // androidx.media3.session.g
    public final void z0(f fVar, int i, int i2, IBinder iBinder) {
        if (fVar == null || iBinder == null || i2 < 0) {
            return;
        }
        try {
            e47<Bundle> e47VarA = bq1.a(iBinder);
            e47.b bVar = e47.b;
            e47.a aVar = new e47.a();
            for (int i3 = 0; i3 < e47VarA.size(); i3++) {
                Bundle bundle = e47VarA.get(i3);
                bundle.getClass();
                aVar.c(ij9.a(bundle));
            }
            l1(fVar, i, 20, new vh6(new uw8(new vk3(aVar.f(), 5), new e35(this, i2)), 7));
        } catch (RuntimeException e2) {
            zkd.U("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e2);
        }
    }
}
