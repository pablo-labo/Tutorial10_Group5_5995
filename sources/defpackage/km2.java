package defpackage;

import android.os.Trace;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.d;
import androidx.compose.runtime.i;
import androidx.compose.runtime.m;
import androidx.compose.runtime.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class km2 implements su2, oad, wsc, q6b {
    public final z3a<Object, Object> V;
    public final a4a<i> W;
    public final a4a<i> X;
    public final z3a<Object, Object> Y;
    public final q12 Z;
    public final dm2 a;
    public final q12 a0;
    public final cba b;
    public final z3a<Object, Object> b0;
    public final AtomicReference<Object> c;
    public z3a<Object, Object> c0;
    public final Object d;
    public boolean d0;
    public final b4a e;
    public p6 e0;
    public final m f;
    public s6b f0;
    public km2 g0;
    public int h0;
    public final ux0 i0;
    public final b0d j0;
    public final c k0;
    public int l0;
    public Function2<? super b, ? super Integer, j6g> m0;

    public km2() {
        throw null;
    }

    public km2(dm2 dm2Var, cba cbaVar) {
        this.a = dm2Var;
        this.b = cbaVar;
        this.c = new AtomicReference<>(null);
        this.d = new Object();
        b4a b4aVar = new b4a(new a4a((Object) null));
        this.e = b4aVar;
        m mVar = new m();
        if (dm2Var.e()) {
            mVar.Z = new a3a<>();
        }
        if (dm2Var.g()) {
            mVar.b();
        }
        this.f = mVar;
        this.V = lnd.b();
        this.W = new a4a<>((Object) null);
        this.X = new a4a<>((Object) null);
        this.Y = lnd.b();
        q12 q12Var = new q12();
        this.Z = q12Var;
        q12 q12Var2 = new q12();
        this.a0 = q12Var2;
        this.b0 = lnd.b();
        this.c0 = lnd.b();
        ux0 ux0Var = new ux0(dm2Var, 1);
        this.i0 = ux0Var;
        this.j0 = new b0d();
        c cVar = new c(cbaVar, dm2Var, mVar, b4aVar, q12Var, q12Var2, ux0Var, this);
        dm2Var.q(cVar);
        this.k0 = cVar;
        ah2 ah2Var = xh2.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(java.util.Set<? extends java.lang.Object> r33, boolean r34) {
        /*
            Method dump skipped, instruction units count: 923
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km2.A(java.util.Set, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(defpackage.q12 r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km2.B(q12):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C() {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km2.C():void");
    }

    public final boolean D() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (this.l0 != 1) {
                z = false;
            }
            if (z) {
                this.l0 = 0;
            }
        }
        return z;
    }

    public final s6b E(boolean z, Function2 function2) {
        if (this.f0 != null) {
            gib.b("A pausable composition is in progress");
        }
        s6b s6bVar = new s6b(this, this.a, this.k0, this.e, function2, z, this.b, this.d);
        this.f0 = s6bVar;
        return s6bVar;
    }

    public final void F() {
        Object obj = ygg.d;
        AtomicReference<Object> atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                d.d("pending composition has not been applied");
                r40.e();
                return;
            }
            if (andSet instanceof Set) {
                A((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                d.d("corrupt pendingModifications drain: " + atomicReference);
                r40.e();
                return;
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                A(set, true);
            }
        }
    }

    public final void G() {
        AtomicReference<Object> atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(null);
        if (wl7.b(andSet, ygg.d)) {
            return;
        }
        if (andSet instanceof Set) {
            A((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                A(set, false);
            }
            return;
        }
        if (andSet == null) {
            d.d("calling recordModificationsOf and applyChanges concurrently is not supported");
            r40.e();
        } else {
            d.d("corrupt pendingModifications drain: " + atomicReference);
            r40.e();
        }
    }

    public final void H() {
        is4 is4Var = is4.a;
        AtomicReference<Object> atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(is4Var);
        if (wl7.b(andSet, ygg.d) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            A((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            d.d("corrupt pendingModifications drain: " + atomicReference);
            r40.e();
            return;
        }
        for (Set<? extends Object> set : (Set[]) andSet) {
            A(set, false);
        }
    }

    public final void I() {
        int i = this.l0;
        if (i != 0) {
            gib.b(i != 1 ? i != 2 ? i != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.f0 == null) {
            return;
        }
        gib.b("A pausable composition is in progress");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d2 A[Catch: all -> 0x0042, EDGE_INSN: B:81:0x00d2->B:66:0x00d2 BREAK  A[LOOP:0: B:48:0x0089->B:62:0x00ca], EDGE_INSN: B:82:0x00d2->B:66:0x00d2 BREAK  A[LOOP:0: B:48:0x0089->B:62:0x00ca], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0067, B:40:0x006d, B:41:0x0073, B:43:0x0079, B:45:0x007d, B:48:0x0089, B:50:0x0099, B:52:0x00a5, B:54:0x00af, B:58:0x00be, B:62:0x00ca, B:63:0x00cd, B:66:0x00d2), top: B:79:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.jm7 J(androidx.compose.runtime.i r21, defpackage.x20 r22, java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km2.J(androidx.compose.runtime.i, x20, java.lang.Object):jm7");
    }

    public final void K(Object obj) {
        Object objD = this.V.d(obj);
        if (objD == null) {
            return;
        }
        boolean z = objD instanceof a4a;
        jm7 jm7Var = jm7.d;
        z3a<Object, Object> z3aVar = this.b0;
        if (!z) {
            i iVar = (i) objD;
            if (iVar.b(obj) == jm7Var) {
                ypd.r(z3aVar, obj, iVar);
                return;
            }
            return;
        }
        a4a a4aVar = (a4a) objD;
        Object[] objArr = a4aVar.b;
        long[] jArr = a4aVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        i iVar2 = (i) objArr[(i << 3) + i3];
                        if (iVar2.b(obj) == jm7Var) {
                            ypd.r(z3aVar, obj, iVar2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // defpackage.su2, defpackage.wsc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km2.a(java.lang.Object):void");
    }

    @Override // defpackage.su2
    public final void b(Function2<? super b, ? super Integer, j6g> function2) {
        try {
            synchronized (this.d) {
                F();
                z3a<Object, Object> z3aVar = this.c0;
                this.c0 = lnd.b();
                try {
                    c cVar = this.k0;
                    p6 p6Var = this.e0;
                    if (!cVar.e.d.L1()) {
                        d.c("Expected applyChanges() to have been called");
                    }
                    cVar.P = p6Var;
                    try {
                        cVar.S(z3aVar, function2);
                        cVar.P = null;
                        j6g j6gVar = j6g.a;
                    } catch (Throwable th) {
                        cVar.P = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.c0 = z3aVar;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.e.a.b()) {
                    b0d b0dVar = this.j0;
                    try {
                        b0dVar.g(this.e, this.k0.d0());
                        b0dVar.b();
                        b0dVar.a();
                    } catch (Throwable th4) {
                        b0dVar.a();
                        throw th4;
                    }
                }
                throw th3;
            } catch (Throwable th5) {
                w();
                throw th5;
            }
        }
    }

    @Override // defpackage.su2
    public final <R> R c(su2 su2Var, int i, gu5<? extends R> gu5Var) {
        if (su2Var == null || su2Var.equals(this) || i < 0) {
            return gu5Var.invoke();
        }
        this.g0 = (km2) su2Var;
        this.h0 = i;
        try {
            return gu5Var.invoke();
        } finally {
            this.g0 = null;
            this.h0 = 0;
        }
    }

    @Override // defpackage.wsc
    public final void d() {
        this.d0 = true;
        this.i0.a();
    }

    @Override // defpackage.oad
    public final void deactivate() {
        synchronized (this.d) {
            try {
                if (this.f0 != null) {
                    gib.b("Deactivate is not supported while pausable composition is in progress");
                }
                int i = 1;
                boolean z = this.f.b > 0;
                if (z || !this.e.a.b()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        b0d b0dVar = this.j0;
                        try {
                            b0dVar.g(this.e, this.k0.d0());
                            if (z) {
                                this.b.getClass();
                                n nVarF = this.f.f();
                                try {
                                    nVarF.n(nVarF.t, new n91(i, this.j0, nVarF));
                                    j6g j6gVar = j6g.a;
                                    nVarF.e(true);
                                    this.b.h();
                                    b0dVar.c();
                                } catch (Throwable th) {
                                    nVarF.e(false);
                                    throw th;
                                }
                            }
                            b0dVar.b();
                            b0dVar.a();
                            j6g j6gVar2 = j6g.a;
                        } catch (Throwable th2) {
                            b0dVar.a();
                            throw th2;
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
                this.V.g();
                this.Y.g();
                this.c0.g();
                this.Z.d.J1();
                this.a0.d.J1();
                c cVar = this.k0;
                cVar.E.clear();
                cVar.s.clear();
                cVar.e.d.J1();
                cVar.v = null;
                this.l0 = 1;
                j6g j6gVar3 = j6g.a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // defpackage.cm2
    public final void dispose() {
        synchronized (this.d) {
            try {
                if (this.k0.F) {
                    gib.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.l0 != 3) {
                    this.l0 = 3;
                    this.m0 = xh2.b;
                    q12 q12Var = this.k0.L;
                    if (q12Var != null) {
                        B(q12Var);
                    }
                    int i = 1;
                    boolean z = this.f.b > 0;
                    if (z || !this.e.a.b()) {
                        b0d b0dVar = this.j0;
                        try {
                            b0dVar.g(this.e, this.k0.d0());
                            if (z) {
                                this.b.getClass();
                                n nVarF = this.f.f();
                                try {
                                    nVarF.n(nVarF.t, new kh(this.j0, i));
                                    nVarF.I();
                                    j6g j6gVar = j6g.a;
                                    nVarF.e(true);
                                    this.b.clear();
                                    this.b.h();
                                    b0dVar.c();
                                } catch (Throwable th) {
                                    nVarF.e(false);
                                    throw th;
                                }
                            }
                            b0dVar.b();
                            b0dVar.a();
                        } catch (Throwable th2) {
                            b0dVar.a();
                            throw th2;
                        }
                    }
                    c cVar = this.k0;
                    cVar.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        cVar.b.u(cVar);
                        cVar.E.clear();
                        cVar.s.clear();
                        cVar.e.d.J1();
                        cVar.v = null;
                        cVar.a.clear();
                        j6g j6gVar2 = j6g.a;
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                j6g j6gVar3 = j6g.a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.a.v(this);
    }

    @Override // defpackage.su2
    public final void e() {
        synchronized (this.d) {
            try {
                if (this.a0.d.M1()) {
                    B(this.a0);
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                try {
                    if (!this.e.a.b()) {
                        b0d b0dVar = this.j0;
                        try {
                            b0dVar.g(this.e, this.k0.d0());
                            b0dVar.b();
                            b0dVar.a();
                        } catch (Throwable th2) {
                            b0dVar.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    this.w();
                    throw th3;
                }
            }
        }
    }

    @Override // defpackage.q6b
    public final s6b f(Function2 function2) {
        return E(D(), function2);
    }

    @Override // defpackage.cm2
    public final boolean g() {
        return this.l0 == 3;
    }

    @Override // defpackage.cm2
    public final void h(Function2<? super b, ? super Integer, j6g> function2) {
        boolean zD = D();
        I();
        dm2 dm2Var = this.a;
        if (!zD) {
            this.m0 = function2;
            dm2Var.a(this, function2);
            return;
        }
        c cVar = this.k0;
        cVar.z = 100;
        cVar.y = true;
        this.m0 = function2;
        dm2Var.a(this, function2);
        cVar.X();
    }

    @Override // defpackage.su2
    public final p6 i(p6 p6Var) {
        p6 p6Var2 = this.e0;
        this.e0 = p6Var;
        return p6Var2;
    }

    @Override // defpackage.su2
    public final void j(p0a p0aVar) {
        b0d b0dVar = this.j0;
        try {
            b0dVar.g(this.e, this.k0.d0());
            n nVarF = p0aVar.a.f();
            try {
                nVarF.n(nVarF.t, new kh(b0dVar, 1));
                nVarF.I();
                j6g j6gVar = j6g.a;
                nVarF.e(true);
                b0dVar.c();
            } catch (Throwable th) {
                nVarF.e(false);
                throw th;
            }
        } finally {
            b0dVar.a();
        }
    }

    @Override // defpackage.su2
    public final void k(sj4 sj4Var) {
        c cVar = this.k0;
        if (cVar.F) {
            d.c("Preparing a composition while composing is not supported");
        }
        cVar.F = true;
        try {
            sj4Var.invoke();
        } finally {
            cVar.F = false;
        }
    }

    @Override // defpackage.su2
    public final boolean l() {
        synchronized (this.d) {
            s6b s6bVar = this.f0;
            boolean zM1 = false;
            if (s6bVar != null && s6bVar.h.get() != u6b.e) {
                s6bVar.e();
                return false;
            }
            F();
            try {
                z3a<Object, Object> z3aVar = this.c0;
                this.c0 = lnd.b();
                try {
                    c cVar = this.k0;
                    p6 p6Var = this.e0;
                    wua wuaVar = cVar.e.d;
                    if (!wuaVar.L1()) {
                        d.c("Expected applyChanges() to have been called");
                    }
                    if (z3aVar.e > 0 || !cVar.s.isEmpty()) {
                        cVar.P = p6Var;
                        try {
                            cVar.S(z3aVar, null);
                            cVar.P = null;
                            zM1 = wuaVar.M1();
                        } catch (Throwable th) {
                            cVar.P = null;
                            throw th;
                        }
                    }
                    if (!zM1) {
                        G();
                    }
                    return zM1;
                } catch (Throwable th2) {
                    this.c0 = z3aVar;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.e.a.b()) {
                        b0d b0dVar = this.j0;
                        try {
                            b0dVar.g(this.e, this.k0.d0());
                            b0dVar.b();
                            b0dVar.a();
                        } catch (Throwable th4) {
                            b0dVar.a();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    w();
                    throw th5;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.su2
    public final void m(ond ondVar) {
        Object obj;
        while (true) {
            Object obj2 = this.c.get();
            if (obj2 == null || obj2.equals(ygg.d)) {
                obj = ondVar;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, ondVar};
            } else {
                if (!(obj2 instanceof Object[])) {
                    s40.i(this.c, "corrupt pendingModifications: ");
                    return;
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = ondVar;
                obj = objArrCopyOf;
            }
            AtomicReference<Object> atomicReference = this.c;
            while (!atomicReference.compareAndSet(obj2, obj)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            if (obj2 == null) {
                synchronized (this.d) {
                    G();
                    j6g j6gVar = j6g.a;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    @Override // defpackage.su2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(java.util.Set<? extends java.lang.Object> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof defpackage.ond
            z3a<java.lang.Object, java.lang.Object> r3 = r0.Y
            z3a<java.lang.Object, java.lang.Object> r0 = r0.V
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L5e
            ond r1 = (defpackage.ond) r1
            mnd<T> r1 = r1.a
            java.lang.Object[] r2 = r1.b
            long[] r1 = r1.a
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L7b
            r7 = r4
        L1c:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L36:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r2[r13]
            boolean r14 = r0.b(r13)
            if (r14 != 0) goto L52
            boolean r13 = r3.b(r13)
            if (r13 == 0) goto L53
        L52:
            return r5
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L36
        L57:
            if (r10 != r11) goto L7b
        L59:
            if (r7 == r6) goto L7b
            int r7 = r7 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r6 = r0.b(r2)
            if (r6 != 0) goto L7a
            boolean r2 = r3.b(r2)
            if (r2 == 0) goto L64
        L7a:
            return r5
        L7b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km2.n(java.util.Set):boolean");
    }

    @Override // defpackage.su2
    public final void o(ArrayList arrayList) {
        b4a b4aVar = this.e;
        c cVar = this.k0;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (!((q0a) ((Pair) arrayList.get(i)).d()).c.equals(this)) {
                    d.c("Check failed");
                    break;
                }
                i++;
            }
        }
        try {
            cVar.getClass();
            try {
                cVar.e0(arrayList);
                cVar.O();
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                cVar.N();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!b4aVar.a.b()) {
                    b0d b0dVar = this.j0;
                    try {
                        b0dVar.g(b4aVar, cVar.d0());
                        b0dVar.b();
                        b0dVar.a();
                    } catch (Throwable th3) {
                        b0dVar.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                w();
                throw th4;
            }
        }
    }

    @Override // defpackage.wsc
    public final jm7 p(i iVar, Object obj) {
        km2 km2Var;
        int i = iVar.b;
        if ((i & 2) != 0) {
            iVar.b = i | 4;
        }
        x20 x20Var = iVar.c;
        if (x20Var == null || !x20Var.a()) {
            return jm7.a;
        }
        if (this.f.g(x20Var)) {
            if (iVar.d == null) {
                return jm7.a;
            }
            jm7 jm7VarJ = J(iVar, x20Var, obj);
            if (jm7VarJ != jm7.a) {
                this.i0.a();
            }
            return jm7VarJ;
        }
        synchronized (this.d) {
            km2Var = this.g0;
        }
        if (km2Var != null) {
            c cVar = km2Var.k0;
            if (cVar.F && cVar.z0(iVar, obj)) {
                return jm7.d;
            }
        }
        return jm7.a;
    }

    @Override // defpackage.su2
    public final void q() {
        synchronized (this.d) {
            try {
                B(this.Z);
                G();
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                try {
                    if (!this.e.a.b()) {
                        b0d b0dVar = this.j0;
                        try {
                            b0dVar.g(this.e, this.k0.d0());
                            b0dVar.b();
                            b0dVar.a();
                        } catch (Throwable th2) {
                            b0dVar.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    this.w();
                    throw th3;
                }
            }
        }
    }

    @Override // defpackage.su2
    public final boolean r() {
        return this.k0.F;
    }

    @Override // defpackage.oad
    public final void s(Function2<? super b, ? super Integer, j6g> function2) {
        D();
        I();
        c cVar = this.k0;
        cVar.z = 100;
        cVar.y = true;
        this.m0 = function2;
        this.a.a(this, function2);
        cVar.X();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    @Override // defpackage.su2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.d
            monitor-enter(r0)
            r14.K(r15)     // Catch: java.lang.Throwable -> L4f
            z3a<java.lang.Object, java.lang.Object> r1 = r14.Y     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.d(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof defpackage.a4a     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            a4a r15 = (defpackage.a4a) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.b     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.a     // Catch: java.lang.Throwable -> L4f
            int r2 = r15.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            long r7 = ~r5     // Catch: java.lang.Throwable -> L4f
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L4f
            bz3 r10 = (defpackage.bz3) r10     // Catch: java.lang.Throwable -> L4f
            r14.K(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r14 = move-exception
            goto L65
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L55:
            if (r7 != r8) goto L61
        L57:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1f
        L5c:
            bz3 r15 = (defpackage.bz3) r15     // Catch: java.lang.Throwable -> L4f
            r14.K(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            j6g r14 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)
            return
        L65:
            monitor-exit(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km2.t(java.lang.Object):void");
    }

    @Override // defpackage.cm2
    public final boolean u() {
        boolean z;
        synchronized (this.d) {
            z = this.c0.e > 0;
        }
        return z;
    }

    @Override // defpackage.q6b
    public final s6b v(Function2 function2) {
        D();
        I();
        return E(true, function2);
    }

    @Override // defpackage.su2
    public final void w() {
        this.c.set(null);
        this.Z.d.J1();
        this.a0.d.J1();
        b4a b4aVar = this.e;
        if (b4aVar.a.b()) {
            return;
        }
        b0d b0dVar = this.j0;
        try {
            b0dVar.g(b4aVar, this.k0.d0());
            b0dVar.b();
        } finally {
            b0dVar.a();
        }
    }

    @Override // defpackage.su2
    public final void x() {
        b0d b0dVar;
        synchronized (this.d) {
            try {
                this.k0.v = null;
                if (!this.e.a.b()) {
                    b0dVar = this.j0;
                    try {
                        b0dVar.g(this.e, this.k0.d0());
                        b0dVar.b();
                        b0dVar.a();
                    } finally {
                    }
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                try {
                    if (!this.e.a.b()) {
                        b0dVar = this.j0;
                        try {
                            b0dVar.g(this.e, this.k0.d0());
                            b0dVar.b();
                            b0dVar.a();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    w();
                    throw th2;
                }
            }
        }
    }

    @Override // defpackage.su2
    public final void y() {
        synchronized (this.d) {
            try {
                for (Object obj : this.f.c) {
                    i iVar = obj instanceof i ? (i) obj : null;
                    if (iVar != null) {
                        iVar.invalidate();
                    }
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(Object obj, boolean z) {
        Object objD = this.V.d(obj);
        if (objD == null) {
            return;
        }
        boolean z2 = objD instanceof a4a;
        jm7 jm7Var = jm7.a;
        a4a<i> a4aVar = this.W;
        a4a<i> a4aVar2 = this.X;
        z3a<Object, Object> z3aVar = this.b0;
        if (!z2) {
            i iVar = (i) objD;
            if (ypd.Q(z3aVar, obj, iVar) || iVar.b(obj) == jm7Var) {
                return;
            }
            if (iVar.g == null || z) {
                a4aVar.d(iVar);
                return;
            } else {
                a4aVar2.d(iVar);
                return;
            }
        }
        a4a a4aVar3 = (a4a) objD;
        Object[] objArr = a4aVar3.b;
        long[] jArr = a4aVar3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        i iVar2 = (i) objArr[(i << 3) + i3];
                        if (!ypd.Q(z3aVar, obj, iVar2) && iVar2.b(obj) != jm7Var) {
                            if (iVar2.g == null || z) {
                                a4aVar.d(iVar2);
                            } else {
                                a4aVar2.d(iVar2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
