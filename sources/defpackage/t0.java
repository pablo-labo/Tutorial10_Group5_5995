package defpackage;

import defpackage.gd8;
import defpackage.ln9;
import defpackage.od8;
import defpackage.rw5;
import defpackage.s5c;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import t0.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t0<A, S extends a<? extends A>> implements df0<A> {
    public final bwc a;

    public static abstract class a<A> {
    }

    public static final class b {
        /* JADX WARN: Removed duplicated region for block: B:49:0x00c2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static defpackage.oi8 a(defpackage.s5c r4, boolean r5, boolean r6, java.lang.Boolean r7, boolean r8, defpackage.bwc r9, defpackage.us9 r10) {
            /*
                Method dump skipped, instruction units count: 218
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: t0.b.a(s5c, boolean, boolean, java.lang.Boolean, boolean, bwc, us9):oi8");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c a;
        public static final c b;
        public static final c c;
        public static final /* synthetic */ c[] d;

        static {
            c cVar = new c("PROPERTY", 0);
            a = cVar;
            c cVar2 = new c("BACKING_FIELD", 1);
            b = cVar2;
            c cVar3 = new c("DELEGATE_FIELD", 2);
            c = cVar3;
            d = new c[]{cVar, cVar2, cVar3};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) d.clone();
        }
    }

    public t0(bwc bwcVar) {
        this.a = bwcVar;
    }

    public static /* synthetic */ List m(t0 t0Var, s5c s5cVar, ln9 ln9Var, Boolean bool, boolean z, int i) {
        boolean z2 = (i & 4) == 0;
        if ((i & 16) != 0) {
            bool = null;
        }
        return t0Var.l(s5cVar, ln9Var, z2, false, bool, (i & 32) != 0 ? false : z);
    }

    public static ln9 n(rp9 rp9Var, o8a o8aVar, hyf hyfVar, je0 je0Var, boolean z) {
        rp9Var.getClass();
        o8aVar.getClass();
        if (rp9Var instanceof w4c) {
            s45 s45Var = pd8.a;
            gd8.b bVarA = pd8.a((w4c) rp9Var, o8aVar, hyfVar);
            if (bVarA == null) {
                return null;
            }
            return ln9.a.a(bVarA);
        }
        if (rp9Var instanceof b5c) {
            s45 s45Var2 = pd8.a;
            gd8.b bVarC = pd8.c((b5c) rp9Var, o8aVar, hyfVar);
            if (bVarC == null) {
                return null;
            }
            return ln9.a.a(bVarC);
        }
        if (!(rp9Var instanceof g5c)) {
            return null;
        }
        rw5.e<g5c, od8.c> eVar = od8.d;
        eVar.getClass();
        od8.c cVar = (od8.c) r5c.a((rw5.c) rp9Var, eVar);
        if (cVar == null) {
            return null;
        }
        int iOrdinal = je0Var.ordinal();
        if (iOrdinal == 1) {
            return v0.a((g5c) rp9Var, o8aVar, hyfVar, true, true, z);
        }
        if (iOrdinal == 2) {
            if (!cVar.w()) {
                return null;
            }
            od8.b bVarR = cVar.r();
            bVarR.getClass();
            return new ln9(o8aVar.getString(bVarR.n()).concat(o8aVar.getString(bVarR.m())));
        }
        if (iOrdinal != 3 || !cVar.x()) {
            return null;
        }
        od8.b bVarS = cVar.s();
        bVarS.getClass();
        return new ln9(o8aVar.getString(bVarS.n()).concat(o8aVar.getString(bVarS.m())));
    }

    @Override // defpackage.df0
    public final ArrayList a(j5c j5cVar, o8a o8aVar) {
        j5cVar.getClass();
        o8aVar.getClass();
        Object objL = j5cVar.l(od8.f);
        objL.getClass();
        Iterable<t4c> iterable = (Iterable) objL;
        ArrayList arrayList = new ArrayList(t92.r0(iterable, 10));
        for (t4c t4cVar : iterable) {
            t4cVar.getClass();
            arrayList.add(((kf1) this).e.a(t4cVar, o8aVar));
        }
        return arrayList;
    }

    @Override // defpackage.df0
    public final ArrayList b(l5c l5cVar, o8a o8aVar) {
        l5cVar.getClass();
        o8aVar.getClass();
        Object objL = l5cVar.l(od8.h);
        objL.getClass();
        Iterable<t4c> iterable = (Iterable) objL;
        ArrayList arrayList = new ArrayList(t92.r0(iterable, 10));
        for (t4c t4cVar : iterable) {
            t4cVar.getClass();
            arrayList.add(((kf1) this).e.a(t4cVar, o8aVar));
        }
        return arrayList;
    }

    @Override // defpackage.df0
    public final List<A> c(s5c s5cVar, z4c z4cVar) {
        s5cVar.getClass();
        return m(this, s5cVar, new ln9(g7.e('#', s5cVar.a.getString(z4cVar.v()), e62.b(((s5c.a) s5cVar).f.b()))), null, false, 60);
    }

    @Override // defpackage.df0
    public final List<A> d(s5c s5cVar, g5c g5cVar) {
        g5cVar.getClass();
        return r(s5cVar, g5cVar, c.b);
    }

    @Override // defpackage.df0
    public final List<A> e(s5c s5cVar, rp9 rp9Var, je0 je0Var) {
        rp9Var.getClass();
        ln9 ln9VarN = n(rp9Var, s5cVar.a, s5cVar.b, je0Var, false);
        return ln9VarN != null ? m(this, s5cVar, new ln9(ln9VarN.a.concat("@0")), null, false, 60) : zr4.a;
    }

    @Override // defpackage.df0
    public final ArrayList f(s5c.a aVar) {
        aVar.getClass();
        qne qneVar = aVar.c;
        pi8 pi8Var = qneVar instanceof pi8 ? (pi8) qneVar : null;
        oi8 oi8Var = pi8Var != null ? pi8Var.a : null;
        if (oi8Var == null) {
            s40.i(aVar.f.a(), "Class for loading annotations is not found: ");
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        oi8Var.c(new u0(this, arrayList));
        return arrayList;
    }

    @Override // defpackage.df0
    public final List<A> g(s5c s5cVar, rp9 rp9Var, je0 je0Var) {
        rp9Var.getClass();
        if (je0Var == je0.b) {
            return r(s5cVar, (g5c) rp9Var, c.a);
        }
        ln9 ln9VarN = n(rp9Var, s5cVar.a, s5cVar.b, je0Var, false);
        return ln9VarN == null ? zr4.a : m(this, s5cVar, ln9VarN, null, false, 60);
    }

    @Override // defpackage.df0
    public final List<A> i(s5c s5cVar, g5c g5cVar) {
        g5cVar.getClass();
        return r(s5cVar, g5cVar, c.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    @Override // defpackage.df0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<A> k(defpackage.s5c r7, defpackage.rp9 r8, defpackage.je0 r9, int r10, defpackage.n5c r11) {
        /*
            r6 = this;
            r8.getClass()
            o8a r11 = r7.a
            hyf r0 = r7.b
            r1 = 0
            ln9 r9 = n(r8, r11, r0, r9, r1)
            if (r9 == 0) goto L89
            boolean r11 = r8 instanceof defpackage.b5c
            r0 = 1
            if (r11 == 0) goto L23
            b5c r8 = (defpackage.b5c) r8
            boolean r11 = r8.g0()
            if (r11 != 0) goto L21
            boolean r8 = r8.h0()
            if (r8 == 0) goto L4a
        L21:
            r1 = r0
            goto L4a
        L23:
            boolean r11 = r8 instanceof defpackage.g5c
            if (r11 == 0) goto L36
            g5c r8 = (defpackage.g5c) r8
            boolean r11 = r8.f0()
            if (r11 != 0) goto L21
            boolean r8 = r8.g0()
            if (r8 == 0) goto L4a
            goto L21
        L36:
            boolean r11 = r8 instanceof defpackage.w4c
            if (r11 == 0) goto L71
            r8 = r7
            s5c$a r8 = (s5c.a) r8
            u4c$c r11 = r8.g
            u4c$c r2 = u4c.c.ENUM_CLASS
            if (r11 != r2) goto L45
            r1 = 2
            goto L4a
        L45:
            boolean r8 = r8.h
            if (r8 == 0) goto L4a
            goto L21
        L4a:
            int r10 = r10 + r1
            ln9 r2 = new ln9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r9.a
            r8.append(r9)
            r9 = 64
            r8.append(r9)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r2.<init>(r8)
            r4 = 0
            r5 = 60
            r3 = 0
            r0 = r6
            r1 = r7
            java.util.List r6 = m(r0, r1, r2, r3, r4, r5)
            return r6
        L71:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            java.lang.Class r7 = r8.getClass()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Unsupported message: "
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        L89:
            zr4 r6 = defpackage.zr4.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t0.k(s5c, rp9, je0, int, n5c):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<A> l(defpackage.s5c r9, defpackage.ln9 r10, boolean r11, boolean r12, java.lang.Boolean r13, boolean r14) {
        /*
            r8 = this;
            r0 = r8
            kf1 r0 = (defpackage.kf1) r0
            us9 r7 = r0.f
            bwc r6 = r8.a
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            oi8 r9 = t0.b.a(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != 0) goto L2a
            boolean r9 = r1 instanceof s5c.a
            r11 = 0
            if (r9 == 0) goto L29
            r9 = r1
            s5c$a r9 = (s5c.a) r9
            qne r9 = r9.c
            boolean r12 = r9 instanceof defpackage.pi8
            if (r12 == 0) goto L23
            pi8 r9 = (defpackage.pi8) r9
            goto L24
        L23:
            r9 = r11
        L24:
            if (r9 == 0) goto L29
            oi8 r9 = r9.a
            goto L2a
        L29:
            r9 = r11
        L2a:
            if (r9 != 0) goto L2d
            goto L43
        L2d:
            s0 r8 = (defpackage.s0) r8
            nn9<oi8, mf0<A, C>> r8 = r8.b
            j29$k r8 = (j29.k) r8
            java.lang.Object r8 = r8.invoke(r9)
            mf0 r8 = (defpackage.mf0) r8
            java.util.HashMap r8 = r8.a
            java.lang.Object r8 = r8.get(r10)
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L45
        L43:
            zr4 r8 = defpackage.zr4.a
        L45:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t0.l(s5c, ln9, boolean, boolean, java.lang.Boolean, boolean):java.util.List");
    }

    public final boolean o(a62 a62Var) {
        if (a62Var.e() == null || !wl7.b(a62Var.f().c(), "Container")) {
            return false;
        }
        oi8 oi8VarA = gi8.a(this.a, a62Var, ((kf1) this).f);
        if (oi8VarA == null) {
            return false;
        }
        LinkedHashSet linkedHashSet = soe.a;
        huc hucVar = new huc();
        ((awc) oi8VarA).c(new roe(hucVar));
        return hucVar.element;
    }

    public abstract lf1 p(a62 a62Var, qne qneVar, List list);

    public final lf1 q(a62 a62Var, uuc uucVar, List list) {
        list.getClass();
        if (soe.a.contains(a62Var)) {
            return null;
        }
        return p(a62Var, uucVar, list);
    }

    public final List<A> r(s5c s5cVar, g5c g5cVar, c cVar) {
        hyf hyfVar = s5cVar.b;
        Boolean boolC = ch5.B.c(g5cVar.Q());
        boolean zD = pd8.d(g5cVar);
        o8a o8aVar = s5cVar.a;
        if (cVar == c.a) {
            ln9 ln9VarA = v0.a(g5cVar, o8aVar, hyfVar, (40 & 8) == 0, (40 & 16) == 0, true);
            if (ln9VarA != null) {
                return m(this, s5cVar, ln9VarA, boolC, zD, 8);
            }
        } else {
            ln9 ln9VarA2 = v0.a(g5cVar, o8aVar, hyfVar, (40 & 8) == 0, (40 & 16) == 0, true);
            if (ln9VarA2 != null) {
                if (zve.L(ln9VarA2.a, "$delegate", false) == (cVar == c.c)) {
                    return l(s5cVar, ln9VarA2, true, true, boolC, zD);
                }
            }
        }
        return zr4.a;
    }
}
