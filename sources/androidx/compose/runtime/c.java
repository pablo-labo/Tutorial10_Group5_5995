package androidx.compose.runtime;

import android.os.Trace;
import androidx.compose.runtime.b;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.datadog.android.rum.internal.debug.UiRumDebugListener;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.a3a;
import defpackage.a4a;
import defpackage.ah2;
import defpackage.ame;
import defpackage.b4a;
import defpackage.bz3;
import defpackage.cba;
import defpackage.cm2;
import defpackage.cz3;
import defpackage.dm2;
import defpackage.el2;
import defpackage.fl2;
import defpackage.fm2;
import defpackage.g4a;
import defpackage.gib;
import defpackage.gke;
import defpackage.gm2;
import defpackage.gme;
import defpackage.gu5;
import defpackage.ia;
import defpackage.il2;
import defpackage.im2;
import defpackage.im7;
import defpackage.j4a;
import defpackage.j6g;
import defpackage.jm2;
import defpackage.jte;
import defpackage.k0d;
import defpackage.km2;
import defpackage.l0d;
import defpackage.lnd;
import defpackage.ml2;
import defpackage.mnd;
import defpackage.nl2;
import defpackage.nnd;
import defpackage.nr0;
import defpackage.nte;
import defpackage.nua;
import defpackage.o0a;
import defpackage.oqc;
import defpackage.p0a;
import defpackage.p6;
import defpackage.pxf;
import defpackage.q0a;
import defpackage.q12;
import defpackage.q7b;
import defpackage.q92;
import defpackage.qad;
import defpackage.rta;
import defpackage.s6;
import defpackage.s8b;
import defpackage.su2;
import defpackage.t8b;
import defpackage.tg5;
import defpackage.tm2;
import defpackage.usc;
import defpackage.ux0;
import defpackage.v03;
import defpackage.vf7;
import defpackage.vh7;
import defpackage.vr4;
import defpackage.wg2;
import defpackage.wk2;
import defpackage.wl7;
import defpackage.wua;
import defpackage.x20;
import defpackage.y2a;
import defpackage.z3a;
import defpackage.zr4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class c implements androidx.compose.runtime.b {
    public int A;
    public int B;
    public boolean C;
    public final ml2 D;
    public final ArrayList E;
    public boolean F;
    public l G;
    public m H;
    public n I;
    public boolean J;
    public t8b K;
    public q12 L;
    public final il2 M;
    public x20 N;
    public tg5 O;
    public p6 P;
    public final im2 Q;
    public final v03 R;
    public boolean S;
    public long T;
    public gm2 U;
    public final cba a;
    public final dm2 b;
    public final m c;
    public final b4a d;
    public final q12 e;
    public final q12 f;
    public final ux0 g;
    public final km2 h;
    public q7b j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public y2a p;
    public boolean q;
    public boolean r;
    public a3a<t8b> v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final vh7 n = new vh7();
    public final ArrayList s = new ArrayList();
    public final vh7 t = new vh7();
    public t8b u = s8b.d;
    public final vh7 x = new vh7();
    public int z = -1;

    public static final class a implements qad {
        public final b a;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // defpackage.k0d
        public final void b() {
        }

        @Override // defpackage.k0d
        public final void d() {
            this.a.w();
        }

        @Override // defpackage.k0d
        public final void e() {
            this.a.w();
        }
    }

    public final class b extends dm2 {
        public final long a;
        public final boolean b;
        public final boolean c;
        public HashSet d;
        public final LinkedHashSet e = new LinkedHashSet();
        public final g4a f = new ParcelableSnapshotMutableState(s8b.d, wg2.Z);

        public b(long j, boolean z, boolean z2, ux0 ux0Var) {
            this.a = j;
            this.b = z;
            this.c = z2;
        }

        @Override // defpackage.dm2
        public final void a(su2 su2Var, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2) {
            c.this.b.a(su2Var, function2);
        }

        @Override // defpackage.dm2
        public final mnd<i> b(su2 su2Var, p6 p6Var, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2) {
            return c.this.b.b(su2Var, p6Var, function2);
        }

        @Override // defpackage.dm2
        public final void c(q0a q0aVar) {
            c.this.b.c(q0aVar);
        }

        @Override // defpackage.dm2
        public final void d() {
            c cVar = c.this;
            cVar.A--;
        }

        @Override // defpackage.dm2
        public final boolean e() {
            return c.this.b.e();
        }

        @Override // defpackage.dm2
        public final boolean f() {
            return this.b;
        }

        @Override // defpackage.dm2
        public final boolean g() {
            return this.c;
        }

        @Override // defpackage.dm2
        public final long h() {
            return this.a;
        }

        @Override // defpackage.dm2
        public final cm2 i() {
            return c.this.h;
        }

        @Override // defpackage.dm2
        public final t8b j() {
            return (t8b) ((gme) this.f).getValue();
        }

        @Override // defpackage.dm2
        public final v03 k() {
            return c.this.b.k();
        }

        @Override // defpackage.dm2
        public final void l(su2 su2Var) {
            c cVar = c.this;
            dm2 dm2Var = cVar.b;
            dm2Var.l(cVar.h);
            dm2Var.l(su2Var);
        }

        @Override // defpackage.dm2
        public final void m(q0a q0aVar, p0a p0aVar, nr0<?> nr0Var) {
            c.this.b.m(q0aVar, p0aVar, nr0Var);
        }

        @Override // defpackage.dm2
        public final p0a n(q0a q0aVar) {
            return c.this.b.n(q0aVar);
        }

        @Override // defpackage.dm2
        public final mnd<i> o(su2 su2Var, p6 p6Var, mnd<i> mndVar) {
            return c.this.b.o(su2Var, p6Var, mndVar);
        }

        @Override // defpackage.dm2
        public final void p(Set<fm2> set) {
            HashSet hashSet = this.d;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.d = hashSet;
            }
            hashSet.add(set);
        }

        @Override // defpackage.dm2
        public final void q(c cVar) {
            this.e.add(cVar);
        }

        @Override // defpackage.dm2
        public final void r(i iVar) {
            c.this.b.r(iVar);
        }

        @Override // defpackage.dm2
        public final void s(km2 km2Var) {
            c.this.b.s(km2Var);
        }

        @Override // defpackage.dm2
        public final void t() {
            c.this.A++;
        }

        @Override // defpackage.dm2
        public final void u(androidx.compose.runtime.b bVar) {
            HashSet<Set> hashSet = this.d;
            if (hashSet != null) {
                for (Set set : hashSet) {
                    bVar.getClass();
                    set.remove(((c) bVar).c);
                }
            }
            pxf.a(this.e).remove(bVar);
        }

        @Override // defpackage.dm2
        public final void v(km2 km2Var) {
            c.this.b.v(km2Var);
        }

        public final void w() {
            LinkedHashSet<c> linkedHashSet = this.e;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            HashSet hashSet = this.d;
            if (hashSet != null) {
                for (c cVar : linkedHashSet) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((Set) it.next()).remove(cVar.c);
                    }
                }
            }
            linkedHashSet.clear();
        }
    }

    public c(cba cbaVar, dm2 dm2Var, m mVar, b4a b4aVar, q12 q12Var, q12 q12Var2, ux0 ux0Var, km2 km2Var) {
        this.a = cbaVar;
        this.b = dm2Var;
        this.c = mVar;
        this.d = b4aVar;
        this.e = q12Var;
        this.f = q12Var2;
        this.g = ux0Var;
        this.h = km2Var;
        this.C = dm2Var.g() || dm2Var.e();
        this.D = new ml2(this);
        this.E = new ArrayList();
        l lVarD = mVar.d();
        lVarD.c();
        this.G = lVarD;
        m mVar2 = new m();
        if (dm2Var.g()) {
            mVar2.b();
        }
        if (dm2Var.e()) {
            mVar2.Z = new a3a<>();
        }
        this.H = mVar2;
        n nVarF = mVar2.f();
        nVarF.e(true);
        this.I = nVarF;
        this.M = new il2(this, q12Var);
        l lVarD2 = this.H.d();
        try {
            x20 x20VarA = lVarD2.a(0);
            lVarD2.c();
            this.N = x20VarA;
            this.O = new tg5();
            this.Q = new im2(this);
            v03 v03VarK = dm2Var.k();
            v03 v03VarD0 = d0();
            this.R = v03VarK.d1(v03VarD0 == null ? vr4.a : v03VarD0);
        } catch (Throwable th) {
            lVarD2.c();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.q0a p0(androidx.compose.runtime.c r13, int r14) {
        /*
            androidx.compose.runtime.l r0 = r13.G
            int r0 = r0.i(r14)
            androidx.compose.runtime.l r1 = r13.G
            int[] r2 = r1.b
            java.lang.Object r1 = r1.p(r14, r2)
            r2 = 126665345(0x78cc281, float:2.1179178E-34)
            r3 = 0
            if (r0 != r2) goto L94
            boolean r0 = r1 instanceof defpackage.o0a
            if (r0 == 0) goto L94
            androidx.compose.runtime.l r0 = r13.G
            boolean r0 = r0.d(r14)
            if (r0 == 0) goto L30
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            q0(r13, r0, r14)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L30
            r12 = r0
            goto L31
        L30:
            r12 = r3
        L31:
            androidx.compose.runtime.l r0 = r13.G
            int[] r1 = r0.b
            java.lang.Object r0 = r0.p(r14, r1)
            r0.getClass()
            r5 = r0
            o0a r5 = (defpackage.o0a) r5
            androidx.compose.runtime.l r0 = r13.G
            r1 = 0
            java.lang.Object r6 = r0.h(r14, r1)
            androidx.compose.runtime.l r0 = r13.G
            x20 r9 = r0.a(r14)
            androidx.compose.runtime.l r0 = r13.G
            int[] r0 = r0.b
            int r1 = r14 * 5
            int r1 = r1 + 3
            r0 = r0[r1]
            int r0 = r0 + r14
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r1 = r13.s
            int r2 = androidx.compose.runtime.d.f(r14, r1)
            if (r2 >= 0) goto L67
            int r2 = r2 + 1
            int r2 = -r2
        L67:
            int r3 = r1.size()
            if (r2 >= r3) goto L86
            java.lang.Object r3 = r1.get(r2)
            im7 r3 = (defpackage.im7) r3
            int r4 = r3.b
            if (r4 >= r0) goto L86
            androidx.compose.runtime.i r4 = r3.a
            java.lang.Object r3 = r3.c
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r4, r3)
            r10.add(r7)
            int r2 = r2 + 1
            goto L67
        L86:
            q0a r4 = new q0a
            km2 r7 = r13.h
            androidx.compose.runtime.m r8 = r13.c
            t8b r11 = r13.Q(r14)
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        L94:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.c.p0(androidx.compose.runtime.c, int):q0a");
    }

    public static final void q0(c cVar, ArrayList arrayList, int i) {
        int i2 = cVar.G.b[(i * 5) + 3] + i;
        int i3 = i + 1;
        while (i3 < i2) {
            if (cVar.G.j(i3)) {
                q0a q0aVarP0 = p0(cVar, i3);
                if (q0aVarP0 != null) {
                    arrayList.add(q0aVarP0);
                }
            } else if (cVar.G.d(i3)) {
                q0(cVar, arrayList, i3);
            }
            i3 += cVar.G.b[(i3 * 5) + 3];
        }
    }

    public static final int r0(c cVar, int i, int i2, boolean z, int i3) {
        l lVar = cVar.G;
        dm2 dm2Var = cVar.b;
        il2 il2Var = cVar.M;
        boolean zJ = lVar.j(i2);
        int[] iArr = lVar.b;
        if (zJ) {
            int i4 = lVar.i(i2);
            Object objP = lVar.p(i2, iArr);
            if (i4 == 126665345 && (objP instanceof o0a)) {
                q0a q0aVarP0 = p0(cVar, i2);
                if (q0aVarP0 != null) {
                    dm2Var.c(q0aVarP0);
                    il2Var.e();
                    km2 km2Var = cVar.h;
                    dm2 dm2Var2 = cVar.b;
                    wua wuaVar = il2Var.b.d;
                    wuaVar.N1(nua.u.c);
                    wua.b.c(wuaVar, km2Var, dm2Var2, q0aVarP0);
                }
                if (!z || i2 == i) {
                    return lVar.o(i2);
                }
                il2Var.c();
                il2Var.b();
                c cVar2 = il2Var.a;
                int iO = cVar2.G.l(i2) ? 1 : cVar2.G.o(i2);
                if (iO > 0) {
                    il2Var.f(i3, iO);
                }
                return 0;
            }
            if (i4 == 206 && wl7.b(objP, d.e)) {
                Object objH = lVar.h(i2, 0);
                a aVar = objH instanceof a ? (a) objH : null;
                if (aVar != null) {
                    for (c cVar3 : aVar.a.e) {
                        m mVar = cVar3.c;
                        if (mVar.b > 0 && (mVar.a[1] & 67108864) != 0) {
                            km2 km2Var2 = cVar3.h;
                            synchronized (km2Var2.d) {
                                km2Var2.H();
                                z3a<Object, Object> z3aVar = km2Var2.c0;
                                km2Var2.c0 = lnd.b();
                                try {
                                    km2Var2.k0.A0(z3aVar);
                                    j6g j6gVar = j6g.a;
                                } finally {
                                }
                            }
                            q12 q12Var = new q12();
                            cVar3.L = q12Var;
                            l lVarD = cVar3.c.d();
                            try {
                                cVar3.G = lVarD;
                                il2 il2Var2 = cVar3.M;
                                q12 q12Var2 = il2Var2.b;
                                try {
                                    il2Var2.b = q12Var;
                                    cVar3.o0(0);
                                    il2 il2Var3 = cVar3.M;
                                    il2Var3.b();
                                    if (il2Var3.c) {
                                        il2Var3.b.d.N1(nua.b0.c);
                                        if (il2Var3.c) {
                                            il2Var3.d(false);
                                            il2Var3.d(false);
                                            il2Var3.b.d.N1(nua.j.c);
                                            il2Var3.c = false;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                                lVarD.c();
                            }
                        }
                        dm2Var.s(cVar3.h);
                    }
                }
                return lVar.o(i2);
            }
            if (!lVar.l(i2)) {
                return lVar.o(i2);
            }
        } else if (lVar.d(i2)) {
            int i5 = iArr[(i2 * 5) + 3] + i2;
            int iR0 = 0;
            for (int i6 = i2 + 1; i6 < i5; i6 += iArr[(i6 * 5) + 3]) {
                boolean zL = lVar.l(i6);
                if (zL) {
                    il2Var.c();
                    Object objN = lVar.n(i6);
                    il2Var.c();
                    il2Var.h.add(objN);
                }
                iR0 += r0(cVar, i, i6, zL || z, zL ? 0 : i3 + iR0);
                if (zL) {
                    il2Var.c();
                    il2Var.a();
                }
            }
            if (!lVar.l(i2)) {
                return iR0;
            }
        } else if (!lVar.l(i2)) {
            return lVar.o(i2);
        }
        return 1;
    }

    @Override // androidx.compose.runtime.b
    public final void A(int i, Object obj) {
        u0(obj, i, 0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0(defpackage.z3a<java.lang.Object, java.lang.Object> r15) {
        /*
            r14 = this;
            java.util.ArrayList r14 = r14.s
            int r0 = defpackage.u63.J(r14)
        L6:
            r1 = -1
            if (r1 >= r0) goto L2a
            java.lang.Object r1 = r14.get(r0)
            im7 r1 = (defpackage.im7) r1
            androidx.compose.runtime.i r2 = r1.a
            x20 r2 = r2.c
            if (r2 == 0) goto L24
            boolean r3 = r2.a()
            if (r3 == 0) goto L24
            int r3 = r1.b
            int r2 = r2.a
            if (r3 == r2) goto L27
            r1.b = r2
            goto L27
        L24:
            r14.remove(r0)
        L27:
            int r0 = r0 + (-1)
            goto L6
        L2a:
            java.lang.Object[] r0 = r15.b
            java.lang.Object[] r1 = r15.c
            long[] r15 = r15.a
            int r2 = r15.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L86
            r3 = 0
            r4 = r3
        L37:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L81
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L51:
            if (r9 >= r7) goto L7f
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L7b
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r0[r10]
            r10 = r1[r10]
            r11.getClass()
            androidx.compose.runtime.i r11 = (androidx.compose.runtime.i) r11
            x20 r12 = r11.c
            if (r12 == 0) goto L7b
            int r12 = r12.a
            zkd r13 = defpackage.zkd.W
            if (r10 != r13) goto L73
            r10 = 0
        L73:
            im7 r13 = new im7
            r13.<init>(r11, r12, r10)
            r14.add(r13)
        L7b:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L51
        L7f:
            if (r7 != r8) goto L86
        L81:
            if (r4 == r2) goto L86
            int r4 = r4 + 1
            goto L37
        L86:
            ol2 r15 = androidx.compose.runtime.d.f
            defpackage.w92.E0(r15, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.c.A0(z3a):void");
    }

    @Override // androidx.compose.runtime.b
    public final void B() {
        u0(null, 125, 2, null);
        this.r = true;
    }

    public final void B0(int i, int i2) {
        if (E0(i) != i2) {
            if (i < 0) {
                y2a y2aVar = this.p;
                if (y2aVar == null) {
                    y2aVar = new y2a();
                    this.p = y2aVar;
                }
                y2aVar.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                int i3 = this.G.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    @Override // androidx.compose.runtime.b
    public final void C(usc uscVar) {
        i iVar = uscVar instanceof i ? (i) uscVar : null;
        if (iVar != null) {
            iVar.b |= 1;
        }
    }

    public final void C0(int i, int i2) {
        int iE0 = E0(i);
        if (iE0 != i2) {
            int i3 = i2 - iE0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iE02 = E0(i) + i3;
                B0(i, iE02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        q7b q7bVar = (q7b) arrayList.get(i4);
                        if (q7bVar != null && q7bVar.a(i, iE02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                l lVar = this.G;
                if (i < 0) {
                    i = lVar.i;
                } else if (lVar.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    @Override // androidx.compose.runtime.b
    public final void D() {
        if (this.l != 0) {
            d.c("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        i iVarB0 = b0();
        if (iVarB0 != null) {
            int i = iVarB0.b;
            if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                iVarB0.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            t0();
        } else {
            k0();
        }
    }

    public final void D0(Object obj) {
        if (this.S) {
            this.I.T(obj);
            return;
        }
        l lVar = this.G;
        boolean z = lVar.n;
        il2 il2Var = this.M;
        if (!z) {
            x20 x20VarA = lVar.a(lVar.i);
            wua wuaVar = il2Var.b.d;
            wuaVar.N1(nua.b.c);
            wua.b.b(wuaVar, 0, x20VarA, 1, obj);
            return;
        }
        int iB = (lVar.l - gke.b(lVar.i, lVar.b)) - 1;
        if (il2Var.a.G.i - il2Var.f >= 0) {
            il2Var.d(true);
            wua wuaVar2 = il2Var.b.d;
            wuaVar2.N1(nua.h0.c);
            wua.b.a(wuaVar2, 0, obj);
            wuaVar2.f[wuaVar2.g - wuaVar2.d[wuaVar2.e - 1].a] = iB;
            return;
        }
        l lVar2 = this.G;
        x20 x20VarA2 = lVar2.a(lVar2.i);
        wua wuaVar3 = il2Var.b.d;
        wuaVar3.N1(nua.e0.c);
        wua.b.b(wuaVar3, 0, obj, 1, x20VarA2);
        wuaVar3.f[wuaVar3.g - wuaVar3.d[wuaVar3.e - 1].a] = iB;
    }

    @Override // androidx.compose.runtime.b
    public final void E(gu5<j6g> gu5Var) {
        wua wuaVar = this.M.b.d;
        wuaVar.N1(nua.a0.c);
        wua.b.a(wuaVar, 0, gu5Var);
    }

    public final int E0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        y2a y2aVar = this.p;
        if (y2aVar != null && y2aVar.c(i) >= 0) {
            int iC = y2aVar.c(i);
            if (iC >= 0) {
                return y2aVar.c[iC];
            }
            s6.j(p6.c(i, "Cannot find value for key "));
        }
        return 0;
    }

    @Override // androidx.compose.runtime.b
    public final void F() {
        U(false);
    }

    @Override // androidx.compose.runtime.b
    public final b H() {
        c cVar;
        w0(206, d.e);
        if (this.S) {
            n.y(this.I);
        }
        Object objG0 = g0();
        a aVar = objG0 instanceof a ? (a) objG0 : null;
        if (aVar == null) {
            cVar = this;
            aVar = new a(cVar.new b(this.T, this.q, this.C, this.h.i0));
            cVar.D0(aVar);
        } else {
            cVar = this;
        }
        b bVar = aVar.a;
        ((gme) bVar.f).setValue(cVar.P());
        cVar.U(false);
        return bVar;
    }

    @Override // androidx.compose.runtime.b
    public final void I() {
        U(false);
    }

    @Override // androidx.compose.runtime.b
    public final void J() {
        U(false);
    }

    @Override // androidx.compose.runtime.b
    public final boolean K(Object obj) {
        if (wl7.b(g0(), obj)) {
            return false;
        }
        D0(obj);
        return true;
    }

    @Override // androidx.compose.runtime.b
    public final void L(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            u0(null, i, 0, null);
            return;
        }
        if (this.r) {
            d.c("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) this.m);
        this.m++;
        l lVar = this.G;
        boolean z = this.S;
        b.a.C0020a c0020a = b.a.a;
        if (z) {
            lVar.k++;
            this.I.R(i, c0020a, c0020a, false);
            Z(false, null);
            return;
        }
        if (lVar.g() == i && ((i3 = lVar.g) >= lVar.h || (lVar.b[(i3 * 5) + 1] & 536870912) == 0)) {
            lVar.u();
            Z(false, null);
            return;
        }
        if (lVar.k <= 0 && (i2 = lVar.g) != lVar.h) {
            int i4 = this.k;
            l0();
            this.M.f(i4, lVar.s());
            d.a(this.s, i2, lVar.g);
        }
        lVar.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            n nVarF = this.H.f();
            this.I = nVarF;
            nVarF.N();
            this.J = false;
            this.K = null;
        }
        n nVar = this.I;
        nVar.d();
        int i5 = nVar.t;
        nVar.R(i, c0020a, c0020a, false);
        this.N = nVar.b(i5);
        Z(false, null);
    }

    @Override // androidx.compose.runtime.b
    public final <T> T M(h hVar) {
        return (T) tm2.a(P(), hVar);
    }

    public final void N() {
        O();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        tg5 tg5Var = this.O;
        tg5Var.e.J1();
        tg5Var.d.J1();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        l lVar = this.G;
        if (!lVar.f) {
            lVar.c();
        }
        if (this.I.w) {
            return;
        }
        a0();
    }

    public final void O() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        il2 il2Var = this.M;
        il2Var.c = false;
        il2Var.d.b = 0;
        il2Var.f = 0;
        il2Var.e = true;
        il2Var.g = 0;
        il2Var.h.clear();
        il2Var.i = -1;
        il2Var.j = -1;
        il2Var.k = -1;
        il2Var.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final t8b P() {
        t8b t8bVar = this.K;
        return t8bVar != null ? t8bVar : Q(this.G.i);
    }

    public final t8b Q(int i) {
        t8b t8bVarB;
        boolean z = this.S;
        rta rtaVar = d.c;
        if (z && this.J) {
            int iF = this.I.v;
            while (iF > 0) {
                n nVar = this.I;
                if (nVar.b[nVar.r(iF) * 5] == 202 && wl7.b(this.I.s(iF), rtaVar)) {
                    Object objQ = this.I.q(iF);
                    objQ.getClass();
                    t8b t8bVar = (t8b) objQ;
                    this.K = t8bVar;
                    return t8bVar;
                }
                n nVar2 = this.I;
                iF = nVar2.F(iF, nVar2.b);
            }
        }
        if (this.G.c > 0) {
            while (i > 0) {
                if (this.G.i(i) == 202) {
                    l lVar = this.G;
                    if (wl7.b(lVar.p(i, lVar.b), rtaVar)) {
                        a3a<t8b> a3aVar = this.v;
                        if (a3aVar == null || (t8bVarB = a3aVar.b(i)) == null) {
                            l lVar2 = this.G;
                            Object objB = lVar2.b(i, lVar2.b);
                            objB.getClass();
                            t8bVarB = (t8b) objB;
                        }
                        this.K = t8bVarB;
                        return t8bVarB;
                    }
                }
                i = this.G.q(i);
            }
        }
        t8b t8bVar2 = this.u;
        this.K = t8bVar2;
        return t8bVar2;
    }

    public final List<fl2> R() {
        boolean z = this.C;
        List list = zr4.a;
        if (!z) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        n nVar = this.I;
        arrayList.addAll(el2.a(nVar, null, nVar.t, null));
        l lVar = this.G;
        if (!lVar.f && lVar.c != 0) {
            oqc oqcVar = new oqc(lVar);
            int iQ = lVar.i;
            Object objValueOf = Integer.valueOf(lVar.l - gke.b(iQ, lVar.b));
            while (iQ >= 0) {
                oqcVar.V(lVar.a.i(iQ), objValueOf);
                objValueOf = lVar.a(iQ);
                iQ = lVar.q(iQ);
            }
            list = (ArrayList) oqcVar.a;
        }
        arrayList.addAll(list);
        arrayList.addAll(h0());
        return arrayList;
    }

    public final void S(z3a<Object, Object> z3aVar, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2) {
        ArrayList arrayList = this.s;
        if (this.F) {
            d.c("Reentrant composition is not supported");
        }
        this.g.a();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(ame.j().g());
            this.v = null;
            A0(z3aVar);
            this.k = 0;
            this.F = true;
            try {
                y0();
                Object objG0 = g0();
                if (objG0 != function2 && function2 != null) {
                    D0(function2);
                }
                ml2 ml2Var = this.D;
                j4a<cz3> j4aVarB = r.b();
                try {
                    j4aVarB.b(ml2Var);
                    rta rtaVar = d.a;
                    if (function2 != null) {
                        w0(UiRumDebugListener.DEFAULT_ALPHA, rtaVar);
                        q92.v(this, function2);
                        U(false);
                    } else if (!this.w || objG0 == null || objG0.equals(b.a.a)) {
                        s0();
                    } else {
                        w0(UiRumDebugListener.DEFAULT_ALPHA, rtaVar);
                        pxf.d(2, objG0);
                        q92.v(this, (Function2) objG0);
                        U(false);
                    }
                    j4aVarB.k(j4aVarB.c - 1);
                    Y();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        d.c("Check failed");
                    }
                    a0();
                    j6g j6gVar = j6g.a;
                } catch (Throwable th) {
                    j4aVarB.k(j4aVarB.c - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void T(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        T(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object objN = this.G.n(i);
            il2 il2Var = this.M;
            il2Var.c();
            il2Var.h.add(objN);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03a0  */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U(boolean r43) {
        /*
            Method dump skipped, instruction units count: 1381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.c.U(boolean):void");
    }

    public final void V() {
        U(false);
        i iVarB0 = b0();
        if (iVarB0 != null) {
            int i = iVarB0.b;
            if ((i & 1) != 0) {
                iVarB0.b = i | 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[EDGE_INSN: B:59:0x0082->B:28:0x0082 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x007f], EDGE_INSN: B:60:0x0082->B:28:0x0082 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x007f]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.runtime.i W() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.c.W():androidx.compose.runtime.i");
    }

    public final void X() {
        if (this.F || this.z != 100) {
            gib.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.z = -1;
        this.y = false;
    }

    public final void Y() {
        U(false);
        this.b.d();
        U(false);
        il2 il2Var = this.M;
        if (il2Var.c) {
            il2Var.d(false);
            il2Var.d(false);
            il2Var.b.d.N1(nua.j.c);
            il2Var.c = false;
        }
        il2Var.b();
        if (il2Var.d.b != 0) {
            d.c("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            d.c("Start/end imbalance");
        }
        O();
        this.G.c();
        this.w = this.x.b() != 0;
    }

    public final void Z(boolean z, q7b q7bVar) {
        this.i.add(this.j);
        this.j = q7bVar;
        int i = this.l;
        vh7 vh7Var = this.n;
        vh7Var.c(i);
        vh7Var.c(this.m);
        vh7Var.c(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    @Override // androidx.compose.runtime.b
    public final boolean a(boolean z) {
        Object objG0 = g0();
        if ((objG0 instanceof Boolean) && z == ((Boolean) objG0).booleanValue()) {
            return false;
        }
        D0(Boolean.valueOf(z));
        return true;
    }

    public final void a0() {
        m mVar = new m();
        if (this.C) {
            mVar.b();
        }
        if (this.b.e()) {
            mVar.Z = new a3a<>();
        }
        this.H = mVar;
        n nVarF = mVar.f();
        nVarF.e(true);
        this.I = nVarF;
    }

    @Override // androidx.compose.runtime.b
    public final <V, T> void b(V v, Function2<? super T, ? super V, j6g> function2) {
        if (this.S) {
            wua wuaVar = this.O.d;
            wuaVar.N1(nua.g0.c);
            wua.b.a(wuaVar, 0, v);
            function2.getClass();
            pxf.d(2, function2);
            wua.b.a(wuaVar, 1, function2);
            return;
        }
        il2 il2Var = this.M;
        il2Var.b();
        wua wuaVar2 = il2Var.b.d;
        wuaVar2.N1(nua.g0.c);
        function2.getClass();
        pxf.d(2, function2);
        wua.b.b(wuaVar2, 0, v, 1, function2);
    }

    public final i b0() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (i) ia.k(1, arrayList);
    }

    @Override // androidx.compose.runtime.b
    public final boolean c(float f) {
        Object objG0 = g0();
        if ((objG0 instanceof Float) && f == ((Number) objG0).floatValue()) {
            return false;
        }
        D0(Float.valueOf(f));
        return true;
    }

    public final boolean c0() {
        if (!i() || this.w) {
            return true;
        }
        i iVarB0 = b0();
        return (iVarB0 == null || (iVarB0.b & 4) == 0) ? false : true;
    }

    @Override // androidx.compose.runtime.b
    public final boolean d(int i) {
        Object objG0 = g0();
        if ((objG0 instanceof Integer) && i == ((Number) objG0).intValue()) {
            return false;
        }
        D0(Integer.valueOf(i));
        return true;
    }

    public final im2 d0() {
        if (this.C) {
            return this.Q;
        }
        return null;
    }

    @Override // androidx.compose.runtime.b
    public final boolean e(long j) {
        Object objG0 = g0();
        if ((objG0 instanceof Long) && j == ((Number) objG0).longValue()) {
            return false;
        }
        D0(Long.valueOf(j));
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(3:(3:(4:(4:(39:32|(1:34)|35|(1:37)(1:38)|39|(1:41)(1:42)|(1:44)|47|142|48|49|(5:51|(1:53)(1:55)|56|(1:58)(1:59)|(1:61))(1:62)|63|138|64|132|65|119|66|67|140|68|69|136|70|71|134|72|73|130|74|126|75|123|76|(1:78)|121|79|80)(1:45)|121|79|80)|123|76|(0))|126|75)|130|74)|119|66|67|140|68|69|136|70|71|134|72|73) */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x020f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0210, code lost:
    
        r23 = r9;
        r9 = r4;
        r11 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0217, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0218, code lost:
    
        r11 = r5;
        r23 = r9;
        r9 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x021e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x021f, code lost:
    
        r11 = r5;
        r23 = r9;
        r9 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b A[Catch: all -> 0x00a9, TryCatch #3 {all -> 0x00a9, blocks: (B:3:0x000a, B:5:0x001b, B:7:0x004e, B:12:0x0057, B:14:0x005d, B:15:0x0062, B:16:0x0065, B:21:0x009e, B:81:0x01f5, B:25:0x00ad, B:26:0x00b0, B:27:0x00b1, B:29:0x00b7, B:32:0x00be, B:34:0x00c4, B:35:0x00c9, B:39:0x00d3, B:41:0x00e0, B:46:0x00fe, B:47:0x0100, B:49:0x0112, B:51:0x011b, B:53:0x0126, B:61:0x0140, B:63:0x0153, B:80:0x01f2, B:109:0x023b, B:110:0x023e, B:112:0x0240, B:113:0x0243, B:42:0x00ee, B:38:0x00ce, B:30:0x00ba, B:114:0x0244, B:17:0x0069, B:19:0x0091, B:20:0x009c, B:48:0x0109), top: B:125:0x000a, inners: #5, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e0 A[Catch: all -> 0x0209, TRY_LEAVE, TryCatch #2 {all -> 0x0209, blocks: (B:76:0x01d3, B:78:0x01e0, B:101:0x022a, B:102:0x022c), top: B:123:0x01d3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e0(java.util.ArrayList r25) {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.c.e0(java.util.ArrayList):void");
    }

    @Override // androidx.compose.runtime.b
    public final boolean f() {
        return this.S;
    }

    public final void f0(o0a o0aVar, t8b t8bVar, Object obj) {
        A(126665345, o0aVar);
        g0();
        D0(obj);
        long j = this.T;
        try {
            this.T = 126665345L;
            if (this.S) {
                n.y(this.I);
            }
            boolean z = (this.S || wl7.b(this.G.f(), t8bVar)) ? false : true;
            if (z) {
                m0(t8bVar);
            }
            u0(d.c, DataOkHttpUploader.HTTP_ACCEPTED, 0, t8bVar);
            this.K = null;
            boolean z2 = this.w;
            this.w = z;
            q92.v(this, new ah2(316014703, new nl2(o0aVar, obj), true));
            this.w = z2;
        } finally {
        }
    }

    @Override // androidx.compose.runtime.b
    public final void g(boolean z) {
        if (this.l != 0) {
            d.c("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (this.S) {
            return;
        }
        if (!z) {
            t0();
            return;
        }
        l lVar = this.G;
        int i = lVar.g;
        int i2 = lVar.h;
        il2 il2Var = this.M;
        il2Var.getClass();
        il2Var.d(false);
        il2Var.b.d.N1(nua.f.c);
        d.a(this.s, i, i2);
        this.G.t();
    }

    public final Object g0() {
        boolean z = this.S;
        b.a.C0020a c0020a = b.a.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof qad)) {
                return objM;
            }
        } else if (this.r) {
            d.c("A call to createNode(), emitNode() or useNode() expected");
            return c0020a;
        }
        return c0020a;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    @Override // androidx.compose.runtime.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.runtime.c h(int r7) {
        /*
            r6 = this;
            r6.L(r7)
            boolean r7 = r6.S
            ux0 r0 = r6.g
            java.util.ArrayList r1 = r6.E
            km2 r2 = r6.h
            if (r7 == 0) goto L26
            androidx.compose.runtime.i r7 = new androidx.compose.runtime.i
            r7.<init>(r2)
            r1.add(r7)
            r6.D0(r7)
            int r1 = r6.B
            r7.e = r1
            int r1 = r7.b
            r1 = r1 & (-17)
            r7.b = r1
            r0.a()
            return r6
        L26:
            androidx.compose.runtime.l r7 = r6.G
            int r7 = r7.i
            java.util.ArrayList r3 = r6.s
            int r7 = androidx.compose.runtime.d.f(r7, r3)
            if (r7 < 0) goto L39
            java.lang.Object r7 = r3.remove(r7)
            im7 r7 = (defpackage.im7) r7
            goto L3a
        L39:
            r7 = 0
        L3a:
            androidx.compose.runtime.l r3 = r6.G
            java.lang.Object r3 = r3.m()
            androidx.compose.runtime.b$a$a r4 = androidx.compose.runtime.b.a.a
            boolean r4 = defpackage.wl7.b(r3, r4)
            if (r4 == 0) goto L51
            androidx.compose.runtime.i r3 = new androidx.compose.runtime.i
            r3.<init>(r2)
            r6.D0(r3)
            goto L56
        L51:
            r3.getClass()
            androidx.compose.runtime.i r3 = (androidx.compose.runtime.i) r3
        L56:
            r2 = 0
            r4 = 1
            if (r7 != 0) goto L6e
            int r7 = r3.b
            r5 = r7 & 64
            if (r5 == 0) goto L62
            r5 = r4
            goto L63
        L62:
            r5 = r2
        L63:
            if (r5 == 0) goto L69
            r7 = r7 & (-65)
            r3.b = r7
        L69:
            if (r5 == 0) goto L6c
            goto L6e
        L6c:
            r7 = r2
            goto L6f
        L6e:
            r7 = r4
        L6f:
            int r5 = r3.b
            if (r7 == 0) goto L76
            r7 = r5 | 8
            goto L78
        L76:
            r7 = r5 & (-9)
        L78:
            r3.b = r7
            r1.add(r3)
            int r7 = r6.B
            r3.e = r7
            int r7 = r3.b
            r7 = r7 & (-17)
            r3.b = r7
            r0.a()
            int r7 = r3.b
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto Lb4
            r7 = r7 & (-257(0xfffffffffffffeff, float:NaN))
            r7 = r7 | 512(0x200, float:7.175E-43)
            r3.b = r7
            il2 r7 = r6.M
            q12 r7 = r7.b
            wua r7 = r7.d
            nua$c0 r0 = nua.c0.c
            r7.N1(r0)
            wua.b.a(r7, r2, r3)
            boolean r7 = r6.y
            if (r7 != 0) goto Lb4
            int r7 = r3.b
            r0 = r7 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto Lb4
            r6.y = r4
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r3.b = r7
        Lb4:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.c.h(int):androidx.compose.runtime.c");
    }

    public final List<fl2> h0() {
        dm2 dm2Var = this.b;
        cm2 cm2VarI = dm2Var.i();
        km2 km2Var = cm2VarI != null ? (km2) cm2VarI : null;
        if (km2Var != null) {
            m mVar = km2Var.f;
            l lVarD = mVar.d();
            try {
                Integer numB = el2.b(lVarD, dm2Var, 0, lVarD.c);
                if (numB != null) {
                    try {
                        return el2.c(mVar.d(), numB.intValue(), 0);
                    } finally {
                    }
                }
            } finally {
            }
        }
        return zr4.a;
    }

    @Override // androidx.compose.runtime.b
    public final boolean i() {
        i iVarB0;
        return (this.S || this.y || this.w || (iVarB0 = b0()) == null || (iVarB0.b & 8) != 0) ? false : true;
    }

    public final int i0(int i) {
        int iQ = this.G.q(i) + 1;
        int i2 = 0;
        while (iQ < i) {
            if (!this.G.k(iQ)) {
                i2++;
            }
            iQ += this.G.b[(iQ * 5) + 3];
        }
        return i2;
    }

    @Override // androidx.compose.runtime.b
    public final nr0<?> j() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #0 {all -> 0x0029, blocks: (B:3:0x0005, B:5:0x0013, B:7:0x0025, B:11:0x002f, B:10:0x002b, B:14:0x0036, B:16:0x003c, B:18:0x0042), top: B:23:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <R> R j0(defpackage.su2 r7, defpackage.su2 r8, java.lang.Integer r9, java.util.List<? extends kotlin.Pair<androidx.compose.runtime.i, ? extends java.lang.Object>> r10, defpackage.gu5<? extends R> r11) {
        /*
            r6 = this;
            boolean r0 = r6.F
            int r1 = r6.k
            r2 = 1
            r6.F = r2     // Catch: java.lang.Throwable -> L29
            r2 = 0
            r6.k = r2     // Catch: java.lang.Throwable -> L29
            r3 = r10
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L29
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L29
        L11:
            if (r2 >= r3) goto L32
            java.lang.Object r4 = r10.get(r2)     // Catch: java.lang.Throwable -> L29
            kotlin.Pair r4 = (kotlin.Pair) r4     // Catch: java.lang.Throwable -> L29
            java.lang.Object r5 = r4.a()     // Catch: java.lang.Throwable -> L29
            androidx.compose.runtime.i r5 = (androidx.compose.runtime.i) r5     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> L29
            if (r4 == 0) goto L2b
            r6.z0(r5, r4)     // Catch: java.lang.Throwable -> L29
            goto L2f
        L29:
            r7 = move-exception
            goto L4b
        L2b:
            r4 = 0
            r6.z0(r5, r4)     // Catch: java.lang.Throwable -> L29
        L2f:
            int r2 = r2 + 1
            goto L11
        L32:
            if (r7 == 0) goto L42
            if (r9 == 0) goto L3b
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L29
            goto L3c
        L3b:
            r9 = -1
        L3c:
            java.lang.Object r7 = r7.c(r8, r9, r11)     // Catch: java.lang.Throwable -> L29
            if (r7 != 0) goto L46
        L42:
            java.lang.Object r7 = r11.invoke()     // Catch: java.lang.Throwable -> L29
        L46:
            r6.F = r0
            r6.k = r1
            return r7
        L4b:
            r6.F = r0
            r6.k = r1
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.c.j0(su2, su2, java.lang.Integer, java.util.List, gu5):java.lang.Object");
    }

    @Override // androidx.compose.runtime.b
    public final long k() {
        return this.T;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01bc, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k0() {
        /*
            Method dump skipped, instruction units count: 901
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.c.k0():void");
    }

    @Override // androidx.compose.runtime.b
    public final v03 l() {
        return this.R;
    }

    public final void l0() {
        o0(this.G.g);
        il2 il2Var = this.M;
        il2Var.d(false);
        il2Var.e();
        il2Var.b.d.N1(nua.x.c);
        int i = il2Var.f;
        l lVar = il2Var.a.G;
        il2Var.f = lVar.b[(lVar.g * 5) + 3] + i;
    }

    @Override // androidx.compose.runtime.b
    public final t8b m() {
        return P();
    }

    public final void m0(t8b t8bVar) {
        a3a<t8b> a3aVar = this.v;
        if (a3aVar == null) {
            a3aVar = new a3a<>();
            this.v = a3aVar;
        }
        a3aVar.h(this.G.g, t8bVar);
    }

    @Override // androidx.compose.runtime.b
    public final void n() {
        if (!this.r) {
            d.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            d.c("useNode() called while inserting");
        }
        l lVar = this.G;
        Object objN = lVar.n(lVar.i);
        il2 il2Var = this.M;
        il2Var.c();
        il2Var.h.add(objN);
        if (this.y && (objN instanceof wk2)) {
            il2Var.b();
            il2Var.b.d.N1(nua.j0.c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n0(int r7, int r8, int r9) {
        /*
            r6 = this;
            androidx.compose.runtime.l r0 = r6.G
            if (r7 != r8) goto L5
            goto L1a
        L5:
            if (r7 == r9) goto L6b
            if (r8 != r9) goto Lb
            goto L6b
        Lb:
            int r1 = r0.q(r7)
            if (r1 != r8) goto L14
            r9 = r8
            goto L6b
        L14:
            int r1 = r0.q(r8)
            if (r1 != r7) goto L1c
        L1a:
            r9 = r7
            goto L6b
        L1c:
            int r1 = r0.q(r7)
            int r2 = r0.q(r8)
            if (r1 != r2) goto L2b
            int r9 = r0.q(r7)
            goto L6b
        L2b:
            r1 = 0
            r2 = r7
            r3 = r1
        L2e:
            if (r2 <= 0) goto L39
            if (r2 == r9) goto L39
            int r2 = r0.q(r2)
            int r3 = r3 + 1
            goto L2e
        L39:
            r2 = r8
            r4 = r1
        L3b:
            if (r2 <= 0) goto L46
            if (r2 == r9) goto L46
            int r2 = r0.q(r2)
            int r4 = r4 + 1
            goto L3b
        L46:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L4a:
            if (r2 >= r9) goto L53
            int r5 = r0.q(r5)
            int r2 = r2 + 1
            goto L4a
        L53:
            int r4 = r4 - r3
            r9 = r8
        L55:
            if (r1 >= r4) goto L5e
            int r9 = r0.q(r9)
            int r1 = r1 + 1
            goto L55
        L5e:
            r1 = r9
            r9 = r5
        L60:
            if (r9 == r1) goto L6b
            int r9 = r0.q(r9)
            int r1 = r0.q(r1)
            goto L60
        L6b:
            if (r7 <= 0) goto L7f
            if (r7 == r9) goto L7f
            boolean r1 = r0.l(r7)
            if (r1 == 0) goto L7a
            il2 r1 = r6.M
            r1.a()
        L7a:
            int r7 = r0.q(r7)
            goto L6b
        L7f:
            r6.T(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.c.n0(int, int, int):void");
    }

    @Override // androidx.compose.runtime.b
    public final boolean o(int i, boolean z) {
        if ((i & 1) == 0 && (this.S || this.y)) {
            if (this.P != null) {
                b0();
            }
        } else if (!z && i()) {
            return false;
        }
        return true;
    }

    public final void o0(int i) {
        boolean zL = this.G.l(i);
        il2 il2Var = this.M;
        if (zL) {
            il2Var.c();
            Object objN = this.G.n(i);
            il2Var.c();
            il2Var.h.add(objN);
        }
        r0(this, i, i, zL, 0);
        il2Var.c();
        if (zL) {
            il2Var.a();
        }
    }

    @Override // androidx.compose.runtime.b
    public final void p(Object obj) {
        int i;
        l lVar;
        int i2;
        n nVar;
        if (obj instanceof k0d) {
            k0d k0dVar = (k0d) obj;
            x20 x20VarA = null;
            if (this.S) {
                n nVar2 = this.I;
                int i3 = nVar2.t;
                if (i3 > nVar2.v + 1) {
                    int i4 = i3 - 1;
                    int iF = nVar2.F(i4, nVar2.b);
                    while (true) {
                        i2 = i4;
                        i4 = iF;
                        nVar = this.I;
                        if (i4 == nVar.v || i4 < 0) {
                            break;
                        } else {
                            iF = nVar.F(i4, nVar.b);
                        }
                    }
                    x20VarA = nVar.b(i2);
                }
            } else {
                l lVar2 = this.G;
                int i5 = lVar2.g;
                if (i5 > lVar2.i + 1) {
                    int i6 = i5 - 1;
                    int iQ = lVar2.q(i6);
                    while (true) {
                        i = i6;
                        i6 = iQ;
                        lVar = this.G;
                        if (i6 == lVar.i || i6 < 0) {
                            break;
                        } else {
                            iQ = lVar.q(i6);
                        }
                    }
                    x20VarA = lVar.a(i);
                }
            }
            l0d l0dVar = new l0d(k0dVar, x20VarA);
            if (this.S) {
                wua wuaVar = this.M.b.d;
                wuaVar.N1(nua.v.c);
                wua.b.a(wuaVar, 0, l0dVar);
            }
            this.d.add(obj);
            obj = l0dVar;
        }
        D0(obj);
    }

    @Override // androidx.compose.runtime.b
    public final void q() {
        U(true);
    }

    @Override // androidx.compose.runtime.b
    public final void r() {
        this.q = true;
        this.C = true;
        this.c.b();
        this.H.b();
        n nVar = this.I;
        m mVar = nVar.a;
        nVar.e = mVar.Y;
        nVar.f = mVar.Z;
    }

    @Override // androidx.compose.runtime.b
    public final i s() {
        return b0();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s0() {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.c.s0():void");
    }

    @Override // androidx.compose.runtime.b
    public final void t() {
        if (this.y && this.G.i == this.z) {
            this.z = -1;
            this.y = false;
        }
        U(false);
    }

    public final void t0() {
        l lVar = this.G;
        int i = lVar.i;
        this.l = i >= 0 ? lVar.b[(i * 5) + 1] & 67108863 : 0;
        lVar.t();
    }

    @Override // androidx.compose.runtime.b
    public final void u(int i) {
        u0(null, i, 0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u0(java.lang.Object r26, int r27, int r28, java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 870
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.c.u0(java.lang.Object, int, int, java.lang.Object):void");
    }

    @Override // androidx.compose.runtime.b
    public final Object v() {
        boolean z = this.S;
        b.a.C0020a c0020a = b.a.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof qad)) {
                return objM instanceof l0d ? ((l0d) objM).a : objM;
            }
        } else if (this.r) {
            d.c("A call to createNode(), emitNode() or useNode() expected");
            return c0020a;
        }
        return c0020a;
    }

    public final void v0() {
        u0(null, -127, 0, null);
    }

    @Override // androidx.compose.runtime.b
    public final fm2 w() {
        gm2 gm2Var = this.U;
        if (gm2Var != null) {
            return gm2Var;
        }
        gm2 gm2Var2 = new gm2(this.h);
        this.U = gm2Var2;
        return gm2Var2;
    }

    public final void w0(int i, rta rtaVar) {
        u0(rtaVar, i, 0, null);
    }

    @Override // androidx.compose.runtime.b
    public final boolean x(Object obj) {
        if (g0() == obj) {
            return false;
        }
        D0(obj);
        return true;
    }

    public final void x0(Object obj, boolean z) {
        if (z) {
            l lVar = this.G;
            if (lVar.k <= 0) {
                if ((lVar.b[(lVar.g * 5) + 1] & 1073741824) == 0) {
                    gib.a("Expected a node group");
                }
                lVar.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            il2 il2Var = this.M;
            il2Var.getClass();
            il2Var.d(false);
            wua wuaVar = il2Var.b.d;
            wuaVar.N1(nua.f0.c);
            wua.b.a(wuaVar, 0, obj);
        }
        this.G.u();
    }

    @Override // androidx.compose.runtime.b
    public final <T> void y(gu5<? extends T> gu5Var) {
        if (!this.r) {
            d.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            d.c("createNode() can only be called when inserting");
        }
        vh7 vh7Var = this.n;
        int i = vh7Var.a[vh7Var.b - 1];
        n nVar = this.I;
        x20 x20VarB = nVar.b(nVar.v);
        this.l++;
        tg5 tg5Var = this.O;
        wua wuaVar = tg5Var.d;
        wuaVar.N1(nua.o.c);
        wua.b.a(wuaVar, 0, gu5Var);
        wuaVar.f[wuaVar.g - wuaVar.d[wuaVar.e - 1].a] = i;
        wua.b.a(wuaVar, 1, x20VarB);
        wua wuaVar2 = tg5Var.e;
        wuaVar2.N1(nua.t.c);
        wuaVar2.f[wuaVar2.g - wuaVar2.d[wuaVar2.e - 1].a] = i;
        wua.b.a(wuaVar2, 0, x20VarB);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void y0() {
        this.m = 0;
        this.G = this.c.d();
        u0(null, 100, 0, null);
        dm2 dm2Var = this.b;
        dm2Var.t();
        t8b t8bVarJ = dm2Var.j();
        this.x.c(this.w ? 1 : 0);
        this.w = K(t8bVarJ);
        this.K = null;
        if (!this.q) {
            this.q = dm2Var.f();
        }
        if (!this.C) {
            this.C = dm2Var.g();
        }
        if (this.C) {
            jte jteVar = jm2.a;
            jteVar.getClass();
            t8bVarJ = t8bVarJ.m(jteVar, new nte(d0()));
        }
        this.u = t8bVarJ;
        Set<fm2> set = (Set) tm2.a(t8bVarJ, vf7.a);
        if (set != null) {
            set.add(w());
            dm2Var.p(set);
        }
        u0(null, Long.hashCode(dm2Var.h()), 0, null);
    }

    @Override // androidx.compose.runtime.b
    public final void z(Object obj) {
        if (!this.S && this.G.g() == 207 && !wl7.b(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        u0(null, 207, 0, obj);
    }

    public final boolean z0(i iVar, Object obj) {
        x20 x20Var = iVar.c;
        if (x20Var == null) {
            return false;
        }
        int iA = this.G.a.a(x20Var);
        if (!this.F || iA < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int iF = d.f(iA, arrayList);
        if (iF < 0) {
            int i = -(iF + 1);
            if (!(obj instanceof bz3)) {
                obj = null;
            }
            arrayList.add(i, new im7(iVar, iA, obj));
            return true;
        }
        im7 im7Var = (im7) arrayList.get(iF);
        if (!(obj instanceof bz3)) {
            im7Var.c = null;
            return true;
        }
        Object obj2 = im7Var.c;
        if (obj2 == null) {
            im7Var.c = obj;
            return true;
        }
        if (obj2 instanceof a4a) {
            ((a4a) obj2).d(obj);
            return true;
        }
        a4a<Object> a4aVar = nnd.a;
        a4a a4aVar2 = new a4a(2);
        a4aVar2.k(obj2);
        a4aVar2.k(obj);
        im7Var.c = a4aVar2;
        return true;
    }
}
