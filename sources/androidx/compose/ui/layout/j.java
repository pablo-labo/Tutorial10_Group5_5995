package androidx.compose.ui.layout;

import android.view.ViewGroup;
import androidx.compose.ui.layout.e0;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.layout.w;
import defpackage.a4a;
import defpackage.ae7;
import defpackage.ah2;
import defpackage.b0d;
import defpackage.bg9;
import defpackage.bxe;
import defpackage.cba;
import defpackage.d20;
import defpackage.dm2;
import defpackage.g4a;
import defpackage.gme;
import defpackage.hwa;
import defpackage.ik2;
import defpackage.j4a;
import defpackage.j6g;
import defpackage.khd;
import defpackage.km2;
import defpackage.l0d;
import defpackage.lnd;
import defpackage.nnd;
import defpackage.o6;
import defpackage.oad;
import defpackage.p6;
import defpackage.pe7;
import defpackage.pm8;
import defpackage.q3a;
import defpackage.q6b;
import defpackage.s6b;
import defpackage.tm8;
import defpackage.u6b;
import defpackage.um8;
import defpackage.vf9;
import defpackage.vl8;
import defpackage.wk2;
import defpackage.wl7;
import defpackage.wle;
import defpackage.z3a;
import defpackage.z4h;
import defpackage.z59;
import defpackage.z92;
import defpackage.zf9;
import defpackage.zr4;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class j implements wk2 {
    public final pm8 a;
    public dm2 b;
    public f0 c;
    public int c0;
    public int d;
    public int d0;
    public int e;
    public final z3a<pm8, b> f = lnd.b();
    public final z3a<Object, pm8> V = lnd.b();
    public final c W = new c();
    public final a X = new a();
    public final z3a<Object, pm8> Y = lnd.b();
    public final f0.a Z = new f0.a(0);
    public final z3a<Object, e0.b> a0 = lnd.b();
    public final j4a<Object> b0 = new j4a<>(new Object[16]);
    public final String e0 = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    public final class a implements bxe, q {
        public final /* synthetic */ c a;

        public a() {
            this.a = j.this.W;
        }

        @Override // defpackage.iy3
        public final float C0(long j) {
            return this.a.C0(j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.bxe
        public final List<vf9> F(Object obj, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2) {
            j jVar = j.this;
            z3a<Object, e0.b> z3aVar = jVar.a0;
            z3a<Object, pm8> z3aVar2 = jVar.Y;
            pm8 pm8Var = jVar.a;
            z3a<Object, pm8> z3aVar3 = jVar.V;
            pm8 pm8VarD = z3aVar3.d(obj);
            if (pm8VarD != null && ((j4a.a) pm8Var.E()).a.i((T) pm8VarD) < jVar.d) {
                return pm8VarD.C();
            }
            j4a<Object> j4aVar = jVar.b0;
            if (j4aVar.c < jVar.e) {
                ae7.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
            }
            int i = j4aVar.c;
            int i2 = jVar.e;
            if (i == i2) {
                j4aVar.b(obj);
            } else {
                Object[] objArr = j4aVar.a;
                Object obj2 = objArr[i2];
                objArr[i2] = obj;
            }
            jVar.e++;
            if (z3aVar2.a(obj)) {
                pm8 pm8VarD2 = z3aVar2.d(obj);
                b bVarD = pm8VarD2 != null ? jVar.f.d(pm8VarD2) : null;
                if (bVarD != null && bVarD.d) {
                    jVar.j(pm8VarD2, obj, false, function2);
                }
            } else {
                if (pm8Var.d()) {
                    jVar.e();
                    if (!z3aVar3.b(obj)) {
                        z3aVar.k(obj);
                        Object objD = z3aVar2.d(obj);
                        if (objD == null) {
                            objD = jVar.k(obj);
                            if (objD != null) {
                                jVar.h(((j4a.a) pm8Var.E()).a.i((T) objD), ((j4a.a) pm8Var.E()).a.c);
                                jVar.d0++;
                            } else {
                                int i3 = ((j4a.a) pm8Var.E()).a.c;
                                pm8 pm8Var2 = new pm8(2);
                                pm8Var.e0 = true;
                                pm8Var.P(i3, pm8Var2);
                                j6g j6gVar = j6g.a;
                                pm8Var.e0 = false;
                                jVar.d0++;
                                objD = pm8Var2;
                            }
                            z3aVar2.m(obj, objD);
                        }
                        jVar.j((pm8) objD, obj, false, function2);
                    }
                }
                z3aVar.m(obj, !pm8Var.d() ? new l() : new m(jVar, obj));
                if (pm8Var.u0.d == pm8.d.c) {
                    pm8Var.g0(true);
                } else {
                    pm8.h0(pm8Var, true, 6);
                }
            }
            pm8 pm8VarD3 = z3aVar2.d(obj);
            if (pm8VarD3 == null) {
                return zr4.a;
            }
            List<zf9> listN0 = pm8VarD3.u0.p.n0();
            int size = listN0.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((zf9) ((j4a.a) listN0).get(i4)).f.b = true;
            }
            return listN0;
        }

        @Override // defpackage.iy3
        public final long H(float f) {
            return this.a.H(f);
        }

        @Override // defpackage.iy3
        public final long I(long j) {
            return this.a.I(j);
        }

        @Override // defpackage.iy3
        public final long I1(long j) {
            return this.a.I1(j);
        }

        @Override // defpackage.iy3
        public final float S(long j) {
            return this.a.S(j);
        }

        @Override // androidx.compose.ui.layout.q
        public final bg9 Y0(int i, int i2, Map<d20, Integer> map, Function1<? super w.a, j6g> function1) {
            return this.a.z1(i, i2, map, null, function1);
        }

        @Override // defpackage.iy3
        public final long d0(float f) {
            return this.a.d0(f);
        }

        @Override // defpackage.iy3
        public final float getDensity() {
            return this.a.b;
        }

        @Override // defpackage.ql7
        public final vl8 getLayoutDirection() {
            return this.a.a;
        }

        @Override // defpackage.iy3
        public final float k1(int i) {
            return this.a.k1(i);
        }

        @Override // defpackage.iy3
        public final float l1(float f) {
            return f / this.a.getDensity();
        }

        @Override // defpackage.ql7
        public final boolean m0() {
            return this.a.m0();
        }

        @Override // defpackage.iy3
        public final float p1() {
            return this.a.c;
        }

        @Override // defpackage.iy3
        public final float t1(float f) {
            return this.a.getDensity() * f;
        }

        @Override // defpackage.iy3
        public final int x0(float f) {
            return this.a.x0(f);
        }

        @Override // defpackage.iy3
        public final int x1(long j) {
            return this.a.x1(j);
        }

        @Override // androidx.compose.ui.layout.q
        public final bg9 z1(int i, int i2, Map<d20, Integer> map, Function1<? super khd, j6g> function1, Function1<? super w.a, j6g> function12) {
            return this.a.z1(i, i2, map, function1, function12);
        }
    }

    public static final class b {
        public Object a;
        public Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> b;
        public oad c;
        public boolean d;
        public boolean e;
        public s6b f;
        public g4a<Boolean> g;
        public boolean h;

        public b() {
            throw null;
        }
    }

    public final class c implements bxe {
        public vl8 a = vl8.b;
        public float b;
        public float c;

        public static final class a implements bg9 {
            public final /* synthetic */ int a;
            public final /* synthetic */ int b;
            public final /* synthetic */ Map<d20, Integer> c;
            public final /* synthetic */ Function1<khd, j6g> d;
            public final /* synthetic */ c e;
            public final /* synthetic */ j f;
            public final /* synthetic */ Function1<w.a, j6g> g;

            /* JADX WARN: Multi-variable type inference failed */
            public a(int i, int i2, Map<d20, Integer> map, Function1<? super khd, j6g> function1, c cVar, j jVar, Function1<? super w.a, j6g> function12) {
                this.a = i;
                this.b = i2;
                this.c = map;
                this.d = function1;
                this.e = cVar;
                this.f = jVar;
                this.g = function12;
            }

            @Override // defpackage.bg9
            public final int getHeight() {
                return this.b;
            }

            @Override // defpackage.bg9
            public final int getWidth() {
                return this.a;
            }

            @Override // defpackage.bg9
            public final void j() {
                pe7.a aVar;
                pm8 pm8Var = this.f.a;
                boolean zM0 = this.e.m0();
                Function1<w.a, j6g> function1 = this.g;
                if (!zM0 || (aVar = pm8Var.t0.c.K0) == null) {
                    function1.invoke(pm8Var.t0.c.a0);
                } else {
                    function1.invoke(aVar.a0);
                }
            }

            @Override // defpackage.bg9
            public final Function1<khd, j6g> k() {
                return this.d;
            }

            @Override // defpackage.bg9
            public final Map<d20, Integer> r() {
                return this.c;
            }
        }

        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.bxe
        public final List<vf9> F(Object obj, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2) {
            j jVar = j.this;
            jVar.e();
            pm8 pm8Var = jVar.a;
            pm8.d dVar = pm8Var.u0.d;
            pm8.d dVar2 = pm8.d.c;
            pm8.d dVar3 = pm8.d.a;
            if (dVar != dVar3 && dVar != dVar2 && dVar != pm8.d.b && dVar != pm8.d.d) {
                ae7.b("subcompose can only be used inside the measure or layout blocks");
            }
            z3a<Object, pm8> z3aVar = jVar.V;
            pm8 pm8VarD = z3aVar.d(obj);
            if (pm8VarD == null) {
                pm8VarD = jVar.Y.k(obj);
                if (pm8VarD != null) {
                    if (jVar.d0 <= 0) {
                        ae7.b("Check failed.");
                    }
                    jVar.d0--;
                } else {
                    pm8VarD = jVar.k(obj);
                    if (pm8VarD == null) {
                        int i = jVar.d;
                        pm8 pm8Var2 = new pm8(2);
                        pm8Var.e0 = true;
                        pm8Var.P(i, pm8Var2);
                        j6g j6gVar = j6g.a;
                        pm8Var.e0 = false;
                        pm8VarD = pm8Var2;
                    }
                }
                z3aVar.m(obj, pm8VarD);
            }
            pm8 pm8Var3 = pm8VarD;
            if (z92.R0(jVar.d, pm8Var.E()) != pm8Var3) {
                int i2 = ((j4a.a) pm8Var.E()).a.i((T) pm8Var3);
                if (i2 < jVar.d) {
                    ae7.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
                }
                int i3 = jVar.d;
                if (i3 != i2) {
                    jVar.h(i2, i3);
                }
            }
            jVar.d++;
            jVar.j(pm8Var3, obj, false, function2);
            return (dVar == dVar3 || dVar == dVar2) ? pm8Var3.C() : pm8Var3.B();
        }

        @Override // defpackage.iy3
        public final float getDensity() {
            return this.b;
        }

        @Override // defpackage.ql7
        public final vl8 getLayoutDirection() {
            return this.a;
        }

        @Override // defpackage.ql7
        public final boolean m0() {
            pm8.d dVar = j.this.a.u0.d;
            return dVar == pm8.d.d || dVar == pm8.d.b;
        }

        @Override // defpackage.iy3
        public final float p1() {
            return this.c;
        }

        @Override // androidx.compose.ui.layout.q
        public final bg9 z1(int i, int i2, Map<d20, Integer> map, Function1<? super khd, j6g> function1, Function1<? super w.a, j6g> function12) {
            if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
                ae7.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            return new a(i, i2, map, function1, this, j.this, function12);
        }
    }

    public j(pm8 pm8Var, f0 f0Var) {
        this.a = pm8Var;
        this.c = f0Var;
    }

    public static void b(b bVar) {
        a4a<l0d> a4aVar;
        s6b s6bVar = bVar.f;
        if (s6bVar != null) {
            s6bVar.h.set(u6b.b);
            b0d b0dVar = s6bVar.j;
            if (b0dVar.d.c()) {
                a4aVar = b0dVar.d;
                b0dVar.d = nnd.a();
                b0dVar.c.g();
            } else {
                a4aVar = null;
            }
            b0dVar.b();
            km2 km2Var = s6bVar.a;
            km2Var.f0 = null;
            if (a4aVar != null) {
                km2Var.j0.k = a4aVar;
                km2Var.l0 = 2;
            }
            bVar.f = null;
            oad oadVar = bVar.c;
            if (oadVar != null) {
                oadVar.dispose();
            }
            bVar.c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // defpackage.wk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r17 = this;
            r0 = r17
            r1 = 1
            pm8 r2 = r0.a
            r2.e0 = r1
            z3a<pm8, androidx.compose.ui.layout.j$b> r1 = r0.f
            java.lang.Object[] r3 = r1.c
            long[] r4 = r1.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L52
            r7 = r6
        L14:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4d
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2e:
            if (r12 >= r10) goto L4b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L47
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            androidx.compose.ui.layout.j$b r13 = (androidx.compose.ui.layout.j.b) r13
            oad r13 = r13.c
            if (r13 == 0) goto L47
            r13.dispose()
        L47:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2e
        L4b:
            if (r10 != r11) goto L52
        L4d:
            if (r7 == r5) goto L52
            int r7 = r7 + 1
            goto L14
        L52:
            r2.d0()
            j6g r3 = defpackage.j6g.a
            r2.e0 = r6
            r1.g()
            z3a<java.lang.Object, pm8> r1 = r0.V
            r1.g()
            r0.d0 = r6
            r0.c0 = r6
            z3a<java.lang.Object, pm8> r1 = r0.Y
            r1.g()
            r0.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.j.a():void");
    }

    @Override // defpackage.wk2
    public final void c() {
        g(true);
    }

    public final void d(int i) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        this.c0 = 0;
        pm8 pm8Var = this.a;
        List<pm8> listE = pm8Var.E();
        j4a.a aVar = (j4a.a) listE;
        boolean z4 = true;
        int i2 = (aVar.a.c - this.d0) - 1;
        if (i <= i2) {
            f0.a aVar2 = this.Z;
            aVar2.clear();
            q3a<Object> q3aVar = aVar2.a;
            z3a<pm8, b> z3aVar = this.f;
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    b bVarD = z3aVar.d((pm8) aVar.get(i3));
                    bVarD.getClass();
                    q3aVar.b(bVarD.a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.c.a(aVar2);
            wle.e.getClass();
            wle wleVarA = wle.a.a();
            Function1<Object, j6g> function1E = wleVarA != null ? wleVarA.e() : null;
            wle wleVarB = wle.a.b(wleVarA);
            boolean z5 = false;
            while (i2 >= i) {
                try {
                    pm8 pm8Var2 = (pm8) ((j4a.a) listE).get(i2);
                    b bVarD2 = z3aVar.d(pm8Var2);
                    bVarD2.getClass();
                    b bVar = bVarD2;
                    Object obj = bVar.a;
                    if (q3aVar.a(obj)) {
                        boolean z6 = z4;
                        this.c0++;
                        if (((Boolean) ((gme) bVar.g).getValue()).booleanValue()) {
                            um8 um8Var = pm8Var2.u0;
                            zf9 zf9Var = um8Var.p;
                            pm8.f fVar = pm8.f.c;
                            zf9Var.a0 = fVar;
                            z59 z59Var = um8Var.q;
                            if (z59Var != null) {
                                z59Var.Y = fVar;
                            }
                            i(bVar, false);
                            if (bVar.h) {
                                z = z6;
                                z5 = z;
                            } else {
                                z = z6;
                            }
                            z2 = false;
                        } else {
                            z2 = z3;
                            z = z6;
                        }
                    } else {
                        pm8Var.e0 = z4;
                        z3aVar.k(pm8Var2);
                        oad oadVar = bVar.c;
                        if (oadVar != null) {
                            oadVar.dispose();
                        }
                        z = true;
                        pm8Var.e0(i2, 1);
                        j6g j6gVar = j6g.a;
                        z2 = false;
                        pm8Var.e0 = false;
                    }
                    this.V.k(obj);
                    i2--;
                    boolean z7 = z2;
                    z4 = z;
                    z3 = z7;
                } catch (Throwable th) {
                    wle.a.e(wleVarA, wleVarB, function1E);
                    throw th;
                }
            }
            j6g j6gVar2 = j6g.a;
            wle.a.e(wleVarA, wleVarB, function1E);
            z3 = z5;
        }
        if (z3) {
            wle.e.getClass();
            wle.a.f();
        }
        e();
    }

    public final void e() {
        int i = ((j4a.a) this.a.E()).a.c;
        z3a<pm8, b> z3aVar = this.f;
        if (z3aVar.e != i) {
            ae7.a("Inconsistency between the count of nodes tracked by the state (" + z3aVar.e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.c0) - this.d0 < 0) {
            StringBuilder sbG = o6.g(i, "Incorrect state. Total children ", ". Reusable children ");
            sbG.append(this.c0);
            sbG.append(". Precomposed children ");
            sbG.append(this.d0);
            ae7.a(sbG.toString());
        }
        z3a<Object, pm8> z3aVar2 = this.Y;
        if (z3aVar2.e == this.d0) {
            return;
        }
        ae7.a("Incorrect state. Precomposed children " + this.d0 + ". Map size " + z3aVar2.e);
    }

    @Override // defpackage.wk2
    public final void f() {
        g(false);
    }

    public final void g(boolean z) {
        this.d0 = 0;
        this.Y.g();
        List<pm8> listE = this.a.E();
        int i = ((j4a.a) listE).a.c;
        if (this.c0 != i) {
            this.c0 = i;
            wle.e.getClass();
            wle wleVarA = wle.a.a();
            Function1<Object, j6g> function1E = wleVarA != null ? wleVarA.e() : null;
            wle wleVarB = wle.a.b(wleVarA);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    pm8 pm8Var = (pm8) ((j4a.a) listE).get(i2);
                    b bVarD = this.f.d(pm8Var);
                    if (bVarD != null && ((Boolean) ((gme) bVarD.g).getValue()).booleanValue()) {
                        um8 um8Var = pm8Var.u0;
                        zf9 zf9Var = um8Var.p;
                        pm8.f fVar = pm8.f.c;
                        zf9Var.a0 = fVar;
                        z59 z59Var = um8Var.q;
                        if (z59Var != null) {
                            z59Var.Y = fVar;
                        }
                        i(bVarD, z);
                        bVarD.a = d0.a;
                    }
                } catch (Throwable th) {
                    wle.a.e(wleVarA, wleVarB, function1E);
                    throw th;
                }
            }
            j6g j6gVar = j6g.a;
            wle.a.e(wleVarA, wleVarB, function1E);
            this.V.g();
        }
        e();
    }

    public final void h(int i, int i2) {
        pm8 pm8Var = this.a;
        pm8Var.e0 = true;
        pm8Var.Y(i, i2, 1);
        j6g j6gVar = j6g.a;
        pm8Var.e0 = false;
    }

    public final void i(b bVar, boolean z) {
        oad oadVar;
        if (z || !bVar.h) {
            bVar.g = androidx.compose.runtime.r.f(Boolean.FALSE);
        } else {
            ((gme) bVar.g).setValue(Boolean.FALSE);
        }
        if (bVar.f != null) {
            b(bVar);
            return;
        }
        if (z) {
            oad oadVar2 = bVar.c;
            if (oadVar2 != null) {
                oadVar2.deactivate();
                return;
            }
            return;
        }
        hwa outOfFrameExecutor = tm8.a(this.a).getOutOfFrameExecutor();
        if (outOfFrameExecutor != null) {
            outOfFrameExecutor.d(new n(bVar));
        } else {
            if (bVar.h || (oadVar = bVar.c) == null) {
                return;
            }
            oadVar.deactivate();
        }
    }

    public final void j(pm8 pm8Var, Object obj, boolean z, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2) {
        wle wleVarA;
        Function1<Object, j6g> function1E;
        wle wleVarB;
        km2 km2Var;
        z3a<pm8, b> z3aVar = this.f;
        b bVarD = z3aVar.d(pm8Var);
        if (bVarD == null) {
            ah2 ah2Var = ik2.a;
            bVarD = new b();
            bVarD.a = obj;
            bVarD.b = ah2Var;
            bVarD.c = null;
            bVarD.g = androidx.compose.runtime.r.f(Boolean.TRUE);
            z3aVar.m(pm8Var, bVarD);
        }
        b bVar = bVarD;
        boolean z2 = bVar.b != function2;
        s6b s6bVar = bVar.f;
        pm8 pm8Var2 = this.a;
        if (s6bVar != null) {
            if (z2) {
                b(bVar);
            } else {
                if (z) {
                    return;
                }
                s6b s6bVar2 = bVar.f;
                if (s6bVar2 != null) {
                    wle.e.getClass();
                    wleVarA = wle.a.a();
                    function1E = wleVarA != null ? wleVarA.e() : null;
                    wleVarB = wle.a.b(wleVarA);
                    try {
                        pm8Var2.e0 = true;
                        while (!s6bVar2.c()) {
                            s6bVar2.f(new p6(8));
                        }
                        s6bVar2.a();
                        bVar.f = null;
                        j6g j6gVar = j6g.a;
                        pm8Var2.e0 = false;
                        wle.a.e(wleVarA, wleVarB, function1E);
                    } finally {
                    }
                }
            }
        }
        oad oadVar = bVar.c;
        boolean zU = oadVar != null ? oadVar.u() : true;
        if (z2 || zU || bVar.d) {
            bVar.b = function2;
            if (bVar.f != null) {
                ae7.a("new subcompose call while paused composition is still active");
            }
            wle.e.getClass();
            wleVarA = wle.a.a();
            function1E = wleVarA != null ? wleVarA.e() : null;
            wleVarB = wle.a.b(wleVarA);
            try {
                pm8Var2.e0 = true;
                oad oadVar2 = bVar.c;
                dm2 dm2Var = this.b;
                if (dm2Var == null) {
                    ae7.c("parent composition reference not set");
                    throw new KotlinNothingValueException();
                }
                if (oadVar2 == null || oadVar2.g()) {
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = z4h.a;
                        km2Var = new km2(dm2Var, new cba(pm8Var));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = z4h.a;
                        km2Var = new km2(dm2Var, new cba(pm8Var));
                    }
                    oadVar2 = km2Var;
                }
                bVar.c = oadVar2;
                Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> ah2Var2 = bVar.b;
                if (tm8.a(pm8Var2).getOutOfFrameExecutor() != null) {
                    bVar.h = false;
                } else {
                    bVar.h = true;
                    ah2Var2 = new ah2(1524156494, new o(bVar, ah2Var2), true);
                }
                if (z) {
                    if (bVar.e) {
                        bVar.f = ((q6b) oadVar2).v(ah2Var2);
                    } else {
                        bVar.f = ((q6b) oadVar2).f(ah2Var2);
                    }
                } else if (bVar.e) {
                    oadVar2.s(ah2Var2);
                } else {
                    oadVar2.h(ah2Var2);
                }
                bVar.e = false;
                j6g j6gVar2 = j6g.a;
                pm8Var2.e0 = false;
                wle.a.e(wleVarA, wleVarB, function1E);
                bVar.d = false;
            } finally {
            }
        }
    }

    public final pm8 k(Object obj) {
        z3a<pm8, b> z3aVar;
        int i;
        if (this.c0 == 0) {
            return null;
        }
        j4a.a aVar = (j4a.a) this.a.E();
        int i2 = aVar.a.c - this.d0;
        int i3 = i2 - this.c0;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            z3aVar = this.f;
            if (i5 < i3) {
                i = -1;
                break;
            }
            b bVarD = z3aVar.d((pm8) aVar.get(i5));
            bVarD.getClass();
            if (wl7.b(bVarD.a, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (i4 >= i3) {
                b bVarD2 = z3aVar.d((pm8) aVar.get(i4));
                bVarD2.getClass();
                b bVar = bVarD2;
                Object obj2 = bVar.a;
                if (obj2 == d0.a || this.c.b(obj, obj2)) {
                    bVar.a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
            i5 = i4;
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            h(i5, i3);
        }
        this.c0--;
        pm8 pm8Var = (pm8) aVar.get(i3);
        b bVarD3 = z3aVar.d(pm8Var);
        bVarD3.getClass();
        b bVar2 = bVarD3;
        bVar2.g = androidx.compose.runtime.r.f(Boolean.TRUE);
        bVar2.e = true;
        bVar2.d = true;
        return pm8Var;
    }
}
