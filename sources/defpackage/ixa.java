package defpackage;

import defpackage.aj8;
import defpackage.bj8;
import defpackage.f55;
import defpackage.hv1;
import defpackage.mke;
import defpackage.vi8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class ixa {
    public static final List<f55> d = z92.z1(ServiceLoader.load(f55.class, f55.class.getClassLoader()));
    public static final ixa e;
    public static final a f;
    public final bj8 a;
    public final aj8 b;
    public final vi8.a c;

    public static class a implements vi8.a {
        public static /* synthetic */ void b(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // vi8.a
        public final boolean a(kwf kwfVar, kwf kwfVar2) {
            if (kwfVar == null) {
                b(0);
                throw null;
            }
            if (kwfVar2 != null) {
                return kwfVar.equals(kwfVar2);
            }
            b(1);
            throw null;
        }
    }

    public static class b {
        public static final b c = new b(a.a, "SUCCESS");
        public final a a;
        public final String b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            public static final a a;
            public static final a b;
            public static final a c;
            public static final /* synthetic */ a[] d;

            static {
                a aVar = new a("OVERRIDABLE", 0);
                a = aVar;
                a aVar2 = new a("INCOMPATIBLE", 1);
                b = aVar2;
                a aVar3 = new a("CONFLICT", 2);
                c = aVar3;
                d = new a[]{aVar, aVar2, aVar3};
            }

            public a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) d.clone();
            }
        }

        public b(a aVar, String str) {
            this.a = aVar;
            this.b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static /* synthetic */ void a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto Lf
                if (r10 == r2) goto Lf
                if (r10 == r1) goto Lf
                if (r10 == r0) goto Lf
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L11
            Lf:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L11:
                if (r10 == r3) goto L1b
                if (r10 == r2) goto L1b
                if (r10 == r1) goto L1b
                if (r10 == r0) goto L1b
                r5 = r2
                goto L1c
            L1b:
                r5 = r1
            L1c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L31
                if (r10 == r2) goto L31
                if (r10 == r1) goto L2e
                if (r10 == r0) goto L31
                r5[r8] = r7
                goto L35
            L2e:
                r5[r8] = r6
                goto L35
            L31:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L35:
                switch(r10) {
                    case 1: goto L45;
                    case 2: goto L45;
                    case 3: goto L45;
                    case 4: goto L45;
                    case 5: goto L40;
                    case 6: goto L3b;
                    default: goto L38;
                }
            L38:
                r5[r3] = r6
                goto L47
            L3b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L47
            L40:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L47
            L45:
                r5[r3] = r7
            L47:
                if (r10 == r3) goto L5a
                if (r10 == r2) goto L55
                if (r10 == r1) goto L50
                if (r10 == r0) goto L50
                goto L5e
            L50:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L5e
            L55:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L5e
            L5a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L5e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L70
                if (r10 == r2) goto L70
                if (r10 == r1) goto L70
                if (r10 == r0) goto L70
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L75
            L70:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L75:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ixa.b.a(int):void");
        }

        public static b b(String str) {
            return new b(a.b, str);
        }

        public final String toString() {
            return this.a + ": " + this.b;
        }
    }

    static {
        a aVar = new a();
        f = aVar;
        e = new ixa(aVar, bj8.a.b, aj8.a.d);
    }

    public ixa(vi8.a aVar, bj8 bj8Var, aj8 aj8Var) {
        if (aVar == null) {
            a(5);
            throw null;
        }
        if (bj8Var == null) {
            a(6);
            throw null;
        }
        if (aj8Var == null) {
            a(7);
            throw null;
        }
        this.c = aVar;
        this.a = bj8Var;
        this.b = aj8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r25) {
        /*
            Method dump skipped, instruction units count: 1296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ixa.a(int):void");
    }

    public static boolean b(ui8 ui8Var, ui8 ui8Var2, iwf iwfVar) {
        if (ui8Var == null) {
            a(44);
            throw null;
        }
        if (ui8Var2 == null) {
            a(45);
            throw null;
        }
        if (pnb.D(ui8Var) && pnb.D(ui8Var2)) {
            return true;
        }
        return w4.f(iwfVar, ui8Var.P0(), ui8Var2.P0());
    }

    public static void c(hv1 hv1Var, LinkedHashSet linkedHashSet) {
        if (hv1Var == null) {
            a(17);
            throw null;
        }
        hv1.a aVarF = hv1Var.f();
        aVarF.getClass();
        if (aVarF != hv1.a.b) {
            linkedHashSet.add(hv1Var);
        } else {
            if (hv1Var.m().isEmpty()) {
                bg.n(hv1Var, "No overridden descriptors found for (fake override) ");
                return;
            }
            Iterator<? extends hv1> it = hv1Var.m().iterator();
            while (it.hasNext()) {
                c(it.next(), linkedHashSet);
            }
        }
    }

    public static ArrayList d(fv1 fv1Var) {
        hsc hscVarO = fv1Var.O();
        ArrayList arrayList = new ArrayList();
        if (hscVarO != null) {
            arrayList.add(hscVarO.getType());
        }
        Iterator<rlg> it = fv1Var.i().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getType());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0170, code lost:
    
        if (r2 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0172, code lost:
    
        r1 = defpackage.d04.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0175, code lost:
    
        r1 = defpackage.d04.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0177, code lost:
    
        r13 = ((defpackage.hv1) s(r12, new defpackage.tz3(r7))).Z(r13, r0, r1);
        r14.L(r13, r12);
        r14.p(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(java.util.Collection r12, defpackage.t52 r13, defpackage.h91 r14) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ixa.e(java.util.Collection, t52, h91):void");
    }

    public static ArrayList g(Object obj, LinkedList linkedList, Function1 function1, Function1 function12) {
        if (obj == null) {
            a(97);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        fv1 fv1Var = (fv1) function1.invoke(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            fv1 fv1Var2 = (fv1) function1.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                b.a aVarJ = j(fv1Var, fv1Var2);
                if (aVarJ == b.a.a) {
                    arrayList.add(next);
                    it.remove();
                } else if (aVarJ == b.a.c) {
                    function12.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static b i(fv1 fv1Var, fv1 fv1Var2) {
        boolean z;
        if (fv1Var == null) {
            a(38);
            throw null;
        }
        if (fv1Var2 == null) {
            a(39);
            throw null;
        }
        boolean z2 = fv1Var instanceof kv5;
        if ((z2 && !(fv1Var2 instanceof kv5)) || (((z = fv1Var instanceof d4c)) && !(fv1Var2 instanceof d4c))) {
            return b.b("Member kind mismatch");
        }
        if (!z2 && !z) {
            akb.o(fv1Var, "This type of CallableDescriptor cannot be checked for overridability: ");
            return null;
        }
        if (!fv1Var.getName().equals(fv1Var2.getName())) {
            return b.b("Name mismatch");
        }
        b bVarB = (fv1Var.O() == null) != (fv1Var2.O() == null) ? b.b("Receiver presence mismatch") : fv1Var.i().size() != fv1Var2.i().size() ? b.b("Value parameter number mismatch") : null;
        if (bVarB != null) {
            return bVarB;
        }
        return null;
    }

    public static b.a j(fv1 fv1Var, fv1 fv1Var2) {
        ixa ixaVar = e;
        b.a aVar = ixaVar.l(fv1Var2, fv1Var, null).a;
        b.a aVar2 = ixaVar.m(fv1Var, fv1Var2, null, false).a;
        b.a aVar3 = b.a.a;
        if (aVar == aVar3 && aVar2 == aVar3) {
            return aVar3;
        }
        b.a aVar4 = b.a.c;
        return (aVar == aVar4 || aVar2 == aVar4) ? aVar4 : b.a.b;
    }

    public static boolean k(fv1 fv1Var, fv1 fv1Var2) {
        if (fv1Var == null) {
            a(65);
            throw null;
        }
        if (fv1Var2 == null) {
            a(66);
            throw null;
        }
        ui8 returnType = fv1Var.getReturnType();
        ui8 returnType2 = fv1Var2.getReturnType();
        if (p(fv1Var, fv1Var2)) {
            iwf iwfVarF = e.f(fv1Var.getTypeParameters(), fv1Var2.getTypeParameters());
            if (fv1Var instanceof kv5) {
                return o(fv1Var, returnType, fv1Var2, returnType2, iwfVarF);
            }
            if (!(fv1Var instanceof d4c)) {
                bg.m(fv1Var.getClass(), "Unexpected callable: ");
                return false;
            }
            d4c d4cVar = (d4c) fv1Var;
            d4c d4cVar2 = (d4c) fv1Var2;
            p4c p4cVarE = d4cVar.e();
            p4c p4cVarE2 = d4cVar2.e();
            if ((p4cVarE == null || p4cVarE2 == null) ? true : p(p4cVarE, p4cVarE2)) {
                if (d4cVar.N() && d4cVar2.N()) {
                    return w4.f(iwfVarF, returnType.P0(), returnType2.P0());
                }
                if ((d4cVar.N() || !d4cVar2.N()) && o(fv1Var, returnType, fv1Var2, returnType2, iwfVarF)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean o(fv1 fv1Var, ui8 ui8Var, fv1 fv1Var2, ui8 ui8Var2, iwf iwfVar) {
        if (fv1Var == null) {
            a(71);
            throw null;
        }
        if (ui8Var == null) {
            a(72);
            throw null;
        }
        if (fv1Var2 == null) {
            a(73);
            throw null;
        }
        if (ui8Var2 == null) {
            a(74);
            throw null;
        }
        return w4.j(w4.a, iwfVar, ui8Var.P0(), ui8Var2.P0());
    }

    public static boolean p(fv1 fv1Var, fv1 fv1Var2) {
        if (fv1Var == null) {
            a(67);
            throw null;
        }
        if (fv1Var2 != null) {
            Integer numB = d04.b(fv1Var.getVisibility(), fv1Var2.getVisibility());
            return numB == null || numB.intValue() >= 0;
        }
        a(68);
        throw null;
    }

    public static boolean q(fv1 fv1Var, fv1 fv1Var2) {
        if (fv1Var == null) {
            a(13);
            throw null;
        }
        if (fv1Var2 == null) {
            a(14);
            throw null;
        }
        boolean zEquals = fv1Var.equals(fv1Var2);
        iz3 iz3Var = iz3.a;
        if (!zEquals && iz3Var.a(fv1Var.a(), fv1Var2.a(), false)) {
            return true;
        }
        fv1 fv1VarA = fv1Var2.a();
        int i = yz3.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        yz3.b(fv1Var.a(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (iz3Var.a(fv1VarA, (fv1) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static void r(hv1 hv1Var, Function1<hv1, j6g> function1) {
        e04 e04Var;
        e04 e04VarD;
        e04 e04Var2;
        if (hv1Var == null) {
            a(105);
            throw null;
        }
        for (hv1 hv1Var2 : hv1Var.m()) {
            if (hv1Var2.getVisibility() == d04.g) {
                r(hv1Var2, function1);
            }
        }
        if (hv1Var.getVisibility() != d04.g) {
            return;
        }
        Collection<? extends hv1> collectionM = hv1Var.m();
        if (collectionM == null) {
            a(107);
            throw null;
        }
        if (collectionM.isEmpty()) {
            e04VarD = d04.l;
        } else {
            Iterator<? extends hv1> it = collectionM.iterator();
            loop3: while (true) {
                e04Var = null;
                while (it.hasNext()) {
                    e04 visibility = it.next().getVisibility();
                    if (e04Var != null) {
                        Integer numB = d04.b(visibility, e04Var);
                        if (numB == null) {
                            break;
                        } else if (numB.intValue() > 0) {
                        }
                    }
                    e04Var = visibility;
                }
            }
            if (e04Var == null) {
                e04VarD = null;
                break;
            }
            Iterator<? extends hv1> it2 = collectionM.iterator();
            while (it2.hasNext()) {
                Integer numB2 = d04.b(e04Var, it2.next().getVisibility());
                if (numB2 == null || numB2.intValue() < 0) {
                    e04VarD = null;
                    break;
                }
            }
            e04VarD = e04Var;
        }
        if (e04VarD == null) {
            e04VarD = null;
            break;
        }
        if (hv1Var.f() == hv1.a.b) {
            for (hv1 hv1Var3 : collectionM) {
                if (hv1Var3.r() != ax9.e && !hv1Var3.getVisibility().equals(e04VarD)) {
                    e04VarD = null;
                    break;
                }
            }
        } else {
            e04VarD = e04VarD.d();
        }
        if (e04VarD == null) {
            if (function1 != null) {
                function1.invoke(hv1Var);
            }
            e04Var2 = d04.e;
        } else {
            e04Var2 = e04VarD;
        }
        if (hv1Var instanceof e4c) {
            e4c e4cVar = (e4c) hv1Var;
            if (e04Var2 == null) {
                e4c.D0(20);
                throw null;
            }
            e4cVar.Y = e04Var2;
            Iterator it3 = ((d4c) hv1Var).u().iterator();
            while (it3.hasNext()) {
                r((w3c) it3.next(), e04VarD == null ? null : function1);
            }
            return;
        }
        if (hv1Var instanceof mv5) {
            mv5 mv5Var = (mv5) hv1Var;
            if (e04Var2 != null) {
                mv5Var.a0 = e04Var2;
                return;
            } else {
                mv5.D0(10);
                throw null;
            }
        }
        x3c x3cVar = (x3c) hv1Var;
        x3cVar.Z = e04Var2;
        if (e04Var2 != x3cVar.V().getVisibility()) {
            x3cVar.e = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <H> H s(Collection<H> collection, Function1<H, fv1> function1) {
        H h;
        if (collection.size() == 1) {
            H h2 = (H) z92.N0(collection);
            if (h2 != null) {
                return h2;
            }
            a(78);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(t92.r0(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(function1.invoke(it.next()));
        }
        H h3 = (H) z92.N0(collection);
        fv1 fv1Var = (fv1) function1.invoke(h3);
        for (H h4 : collection) {
            fv1 fv1Var2 = (fv1) function1.invoke(h4);
            if (fv1Var2 == null) {
                a(69);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList.add(h4);
                    break;
                }
                if (!k(fv1Var2, (fv1) it2.next())) {
                    break;
                }
            }
            if (k(fv1Var2, fv1Var) && !k(fv1Var, fv1Var2)) {
                h3 = h4;
            }
        }
        if (arrayList.isEmpty()) {
            if (h3 != null) {
                return h3;
            }
            a(79);
            throw null;
        }
        if (arrayList.size() == 1) {
            H h5 = (H) z92.N0(arrayList);
            if (h5 != null) {
                return h5;
            }
            a(80);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                h = null;
                break;
            }
            h = (H) it3.next();
            ui8 returnType = ((fv1) function1.invoke(h)).getReturnType();
            returnType.getClass();
            if (!(returnType.P0() instanceof jh5)) {
                break;
            }
        }
        if (h != null) {
            return h;
        }
        H h6 = (H) z92.N0(arrayList);
        if (h6 != null) {
            return h6;
        }
        a(82);
        throw null;
    }

    public final iwf f(List<rxf> list, List<rxf> list2) {
        if (list == null) {
            a(40);
            throw null;
        }
        if (list2 == null) {
            a(41);
            throw null;
        }
        boolean zIsEmpty = list.isEmpty();
        aj8 aj8Var = this.b;
        bj8 bj8Var = this.a;
        vi8.a aVar = this.c;
        if (zIsEmpty) {
            return new jxa(null, aVar, bj8Var, aj8Var).q0();
        }
        HashMap map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i).j(), list2.get(i).j());
        }
        return new jxa(map, aVar, bj8Var, aj8Var).q0();
    }

    public final void h(n8a n8aVar, Collection collection, Collection collection2, t52 t52Var, h91 h91Var) {
        Integer numB;
        if (n8aVar == null) {
            a(50);
            throw null;
        }
        if (collection == null) {
            a(51);
            throw null;
        }
        if (collection2 == null) {
            a(52);
            throw null;
        }
        if (t52Var == null) {
            a(53);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            hv1 hv1Var = (hv1) it.next();
            if (hv1Var == null) {
                a(57);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            int i = mke.c;
            mke mkeVarA = mke.b.a();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                hv1 hv1Var2 = (hv1) it2.next();
                b.a aVar = l(hv1Var2, hv1Var, t52Var).a;
                boolean z = !d04.e(hv1Var2.getVisibility()) && d04.f(hv1Var2, hv1Var);
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    if (z) {
                        mkeVarA.add(hv1Var2);
                    }
                    arrayList.add(hv1Var2);
                } else if (iOrdinal == 2) {
                    if (z) {
                        h91Var.r(hv1Var2, hv1Var);
                    }
                    arrayList.add(hv1Var2);
                }
            }
            h91Var.L(hv1Var, mkeVarA);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            aj3 aj3VarD = ((hv1) linkedHashSet.iterator().next()).d();
            if (!linkedHashSet.isEmpty()) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    if (((hv1) it3.next()).d() != aj3VarD) {
                        LinkedList<hv1> linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            linkedList.isEmpty();
                            hv1 hv1Var3 = null;
                            for (hv1 hv1Var4 : linkedList) {
                                if (hv1Var3 == null || ((numB = d04.b(hv1Var3.getVisibility(), hv1Var4.getVisibility())) != null && numB.intValue() < 0)) {
                                    hv1Var3 = hv1Var4;
                                }
                            }
                            hv1Var3.getClass();
                            e(g(hv1Var3, linkedList, new kxf(2), new n9(1, h91Var, hv1Var3)), t52Var, h91Var);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            e(Collections.singleton((hv1) it4.next()), t52Var, h91Var);
        }
    }

    public final b l(fv1 fv1Var, fv1 fv1Var2, t52 t52Var) {
        if (fv1Var == null) {
            a(19);
            throw null;
        }
        if (fv1Var2 != null) {
            return m(fv1Var, fv1Var2, t52Var, false);
        }
        a(20);
        throw null;
    }

    public final b m(fv1 fv1Var, fv1 fv1Var2, t52 t52Var, boolean z) {
        if (fv1Var == null) {
            a(22);
            throw null;
        }
        if (fv1Var2 == null) {
            a(23);
            throw null;
        }
        b bVarN = n(fv1Var, fv1Var2, z);
        boolean z2 = bVarN.a == b.a.a;
        List<f55> list = d;
        Iterator<f55> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            f55.a aVar = f55.a.a;
            if (!zHasNext) {
                if (!z2) {
                    return bVarN;
                }
                for (f55 f55Var : list) {
                    if (f55Var.a() == aVar) {
                        int iOrdinal = f55Var.b(fv1Var, fv1Var2, t52Var).ordinal();
                        if (iOrdinal == 0) {
                            ja.q("Contract violation in ", f55Var.getClass().getName(), " condition. It's not supposed to end with success");
                            return null;
                        }
                        if (iOrdinal == 1) {
                            return b.b("External condition");
                        }
                    }
                }
                b bVar = b.c;
                if (bVar != null) {
                    return bVar;
                }
                b.a(0);
                throw null;
            }
            f55 next = it.next();
            if (next.a() != aVar && (!z2 || next.a() != f55.a.b)) {
                int iOrdinal2 = next.b(fv1Var, fv1Var2, t52Var).ordinal();
                if (iOrdinal2 == 0) {
                    z2 = true;
                } else if (iOrdinal2 == 1) {
                    return b.b("External condition");
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b2, code lost:
    
        r14.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ixa.b n(defpackage.fv1 r17, defpackage.fv1 r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ixa.n(fv1, fv1, boolean):ixa$b");
    }
}
