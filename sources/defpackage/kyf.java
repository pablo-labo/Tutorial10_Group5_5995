package defpackage;

import defpackage.mke;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public final class kyf {
    public static final hx4 a = lx4.c(kx4.Y, new String[0]);
    public static final hx4 b = lx4.c(kx4.V, new String[0]);
    public static final a c = new a("NO_EXPECTED_TYPE");
    public static final a d = new a("UNIT_EXPECTED_TYPE");

    public static class a extends nt3 {
        public final String b;

        public a(String str) {
            this.b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static /* synthetic */ void Y0(int r9) {
            /*
                r0 = 4
                r1 = 1
                if (r9 == r1) goto L9
                if (r9 == r0) goto L9
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto Lb
            L9:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            Lb:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L13
                if (r9 == r0) goto L13
                r5 = r3
                goto L14
            L13:
                r5 = r4
            L14:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
                r7 = 0
                if (r9 == r1) goto L30
                if (r9 == r4) goto L2b
                if (r9 == r3) goto L26
                if (r9 == r0) goto L30
                java.lang.String r8 = "newAttributes"
                r5[r7] = r8
                goto L32
            L26:
                java.lang.String r8 = "kotlinTypeRefiner"
                r5[r7] = r8
                goto L32
            L2b:
                java.lang.String r8 = "delegate"
                r5[r7] = r8
                goto L32
            L30:
                r5[r7] = r6
            L32:
                java.lang.String r7 = "refine"
                if (r9 == r1) goto L3e
                if (r9 == r0) goto L3b
                r5[r1] = r6
                goto L42
            L3b:
                r5[r1] = r7
                goto L42
            L3e:
                java.lang.String r6 = "toString"
                r5[r1] = r6
            L42:
                if (r9 == r1) goto L56
                if (r9 == r4) goto L52
                if (r9 == r3) goto L4f
                if (r9 == r0) goto L56
                java.lang.String r3 = "replaceAttributes"
                r5[r4] = r3
                goto L56
            L4f:
                r5[r4] = r7
                goto L56
            L52:
                java.lang.String r3 = "replaceDelegate"
                r5[r4] = r3
            L56:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L64
                if (r9 == r0) goto L64
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L69
            L64:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L69:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kyf.a.Y0(int):void");
        }

        @Override // defpackage.nt3, defpackage.ui8
        public final ui8 O0(bj8 bj8Var) {
            if (bj8Var != null) {
                return this;
            }
            Y0(3);
            throw null;
        }

        @Override // defpackage.mge, defpackage.p7g
        public final /* bridge */ /* synthetic */ p7g Q0(boolean z) {
            Q0(z);
            throw null;
        }

        @Override // defpackage.nt3, defpackage.p7g
        /* JADX INFO: renamed from: R0 */
        public final p7g O0(bj8 bj8Var) {
            if (bj8Var != null) {
                return this;
            }
            Y0(3);
            throw null;
        }

        @Override // defpackage.mge, defpackage.p7g
        public final /* bridge */ /* synthetic */ p7g S0(gwf gwfVar) {
            S0(gwfVar);
            throw null;
        }

        @Override // defpackage.mge
        /* JADX INFO: renamed from: T0 */
        public final mge Q0(boolean z) {
            throw new IllegalStateException(this.b);
        }

        @Override // defpackage.mge
        /* JADX INFO: renamed from: U0 */
        public final mge S0(gwf gwfVar) {
            if (gwfVar != null) {
                throw new IllegalStateException(this.b);
            }
            Y0(0);
            throw null;
        }

        @Override // defpackage.nt3
        public final mge V0() {
            throw new IllegalStateException(this.b);
        }

        @Override // defpackage.nt3
        /* JADX INFO: renamed from: W0 */
        public final mge O0(bj8 bj8Var) {
            if (bj8Var != null) {
                return this;
            }
            Y0(3);
            throw null;
        }

        @Override // defpackage.nt3
        public final nt3 X0(mge mgeVar) {
            throw new IllegalStateException(this.b);
        }

        @Override // defpackage.mge
        public final String toString() {
            String str = this.b;
            if (str != null) {
                return str;
            }
            Y0(1);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r27) {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kyf.a(int):void");
    }

    public static boolean b(ui8 ui8Var) {
        if (ui8Var == null) {
            a(28);
            throw null;
        }
        if (ui8Var.N0()) {
            return true;
        }
        return (ui8Var.P0() instanceof jh5) && b(((jh5) ui8Var.P0()).c);
    }

    public static boolean c(ui8 ui8Var, Function1<p7g, Boolean> function1, mke<ui8> mkeVar) {
        if (ui8Var == null) {
            return false;
        }
        p7g p7gVarP0 = ui8Var.P0();
        if (m(ui8Var)) {
            return function1.invoke(p7gVarP0).booleanValue();
        }
        if (mkeVar != null && mkeVar.contains(ui8Var)) {
            return false;
        }
        if (function1.invoke(p7gVarP0).booleanValue()) {
            return true;
        }
        if (mkeVar == null) {
            int i = mke.c;
            mkeVar = mke.b.a();
        }
        mkeVar.add(ui8Var);
        jh5 jh5Var = p7gVarP0 instanceof jh5 ? (jh5) p7gVarP0 : null;
        if (jh5Var != null && (c(jh5Var.b, function1, mkeVar) || c(jh5Var.c, function1, mkeVar))) {
            return true;
        }
        if ((p7gVarP0 instanceof fs3) && c(((fs3) p7gVarP0).b, function1, mkeVar)) {
            return true;
        }
        kwf kwfVarM0 = ui8Var.M0();
        if (kwfVarM0 instanceof kj7) {
            Iterator<ui8> it = ((kj7) kwfVarM0).b.iterator();
            while (it.hasNext()) {
                if (c(it.next(), function1, mkeVar)) {
                    return true;
                }
            }
            return false;
        }
        for (wxf wxfVar : ui8Var.K0()) {
            if (!wxfVar.b() && c(wxfVar.getType(), function1, mkeVar)) {
                return true;
            }
        }
        return false;
    }

    public static List<wxf> d(List<rxf> list) {
        if (list == null) {
            a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<rxf> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new yxf(it.next().o()));
        }
        return z92.z1(arrayList);
    }

    public static boolean e(ui8 ui8Var) {
        if (ui8Var == null) {
            a(27);
            throw null;
        }
        if (!ui8Var.N0() && (!(ui8Var.P0() instanceof jh5) || !e(((jh5) ui8Var.P0()).c))) {
            if (!(ui8Var.P0() instanceof fs3)) {
                if (f(ui8Var)) {
                    if (ui8Var == null) {
                        a(29);
                        throw null;
                    }
                    if (!(ui8Var.M0().d() instanceof t52)) {
                        TypeSubstitutor typeSubstitutorD = TypeSubstitutor.d(ui8Var);
                        Collection<ui8> collectionB = ui8Var.M0().b();
                        ArrayList arrayList = new ArrayList(collectionB.size());
                        for (ui8 ui8Var2 : collectionB) {
                            if (ui8Var2 == null) {
                                a(21);
                                throw null;
                            }
                            ui8 ui8VarJ = typeSubstitutorD.j(ui8Var2, ylg.INVARIANT);
                            ui8 ui8VarH = ui8VarJ != null ? h(ui8VarJ, ui8Var.N0()) : null;
                            if (ui8VarH != null) {
                                arrayList.add(ui8VarH);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (e((ui8) it.next())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (ui8Var instanceof q4) {
                    throw null;
                }
                kwf kwfVarM0 = ui8Var.M0();
                if (kwfVarM0 instanceof kj7) {
                    Iterator<ui8> it2 = ((kj7) kwfVarM0).b.iterator();
                    while (it2.hasNext()) {
                        if (e(it2.next())) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean f(ui8 ui8Var) {
        if (ui8Var != null) {
            return (ui8Var.M0().d() instanceof rxf ? (rxf) ui8Var.M0().d() : null) != null || (ui8Var.M0() instanceof tha);
        }
        a(60);
        throw null;
    }

    public static p7g g(ui8 ui8Var, boolean z) {
        if (ui8Var == null) {
            a(3);
            throw null;
        }
        p7g p7gVarQ0 = ui8Var.P0().Q0(z);
        if (p7gVarQ0 != null) {
            return p7gVarQ0;
        }
        a(4);
        throw null;
    }

    public static ui8 h(ui8 ui8Var, boolean z) {
        if (ui8Var != null) {
            return z ? g(ui8Var, true) : ui8Var;
        }
        a(8);
        throw null;
    }

    public static mge i(mge mgeVar, boolean z) {
        if (mgeVar == null) {
            a(5);
            throw null;
        }
        if (!z) {
            if (mgeVar != null) {
                return mgeVar;
            }
            a(7);
            throw null;
        }
        mge mgeVarQ0 = mgeVar.Q0(true);
        if (mgeVarQ0 != null) {
            return mgeVarQ0;
        }
        a(6);
        throw null;
    }

    public static hre j(rxf rxfVar) {
        if (rxfVar != null) {
            return new hre(rxfVar);
        }
        a(45);
        throw null;
    }

    public static xxf k(rxf rxfVar, lw7 lw7Var) {
        if (rxfVar != null) {
            return lw7Var.b == jyf.a ? new yxf(ewa.L(rxfVar)) : new hre(rxfVar);
        }
        a(46);
        throw null;
    }

    public static mge l(kwf kwfVar, in9 in9Var, Function1<bj8, mge> function1) {
        if (kwfVar == null) {
            a(12);
            throw null;
        }
        if (in9Var == null) {
            a(13);
            throw null;
        }
        List<wxf> listD = d(kwfVar.getParameters());
        gwf.b.getClass();
        return yi8.e(gwf.c, kwfVar, listD, false, in9Var, function1);
    }

    public static boolean m(ui8 ui8Var) {
        if (ui8Var != null) {
            return ui8Var == c || ui8Var == d;
        }
        a(0);
        throw null;
    }
}
