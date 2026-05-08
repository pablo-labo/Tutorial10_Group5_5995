package defpackage;

import defpackage.cla;
import defpackage.ere;
import defpackage.hv1;
import defpackage.me8;
import defpackage.mz3;
import defpackage.z1d;
import io.jsonwebtoken.JwtParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class pz3 extends mz3 implements rz3 {
    public static final /* synthetic */ int f = 0;
    public final vz3 d;
    public final d2f e = new d2f(new nx1(this, 1));

    public final class a implements ej3<j6g, StringBuilder> {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x01d9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(defpackage.kv5 r10, java.lang.StringBuilder r11) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 501
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: pz3.a.a(kv5, java.lang.StringBuilder):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b(x3c x3cVar, StringBuilder sb, String str) throws IOException {
            pz3 pz3Var = pz3.this;
            uz3 uz3Var = pz3Var.d.H;
            qf8<Object> qf8Var = vz3.Y[32];
            uz3Var.getClass();
            qf8Var.getClass();
            int iOrdinal = ((y3c) uz3Var.a).ordinal();
            if (iOrdinal == 0) {
                pz3Var.L(x3cVar, sb);
                sb.append(str.concat(" for "));
                d4c d4cVarV = x3cVar.V();
                d4cVarV.getClass();
                pz3.n(pz3Var, d4cVarV, sb);
                return;
            }
            if (iOrdinal == 1) {
                a(x3cVar, sb);
            } else {
                if (iOrdinal == 2) {
                    return;
                }
                l.g();
            }
        }

        @Override // defpackage.ej3
        public final Object c(x3 x3Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            sb.getClass();
            sb.append(x3Var.getName());
            return j6g.a;
        }

        @Override // defpackage.ej3
        public final Object d(g4c g4cVar, Object obj) throws IOException {
            StringBuilder sb = (StringBuilder) obj;
            sb.getClass();
            b(g4cVar, sb, "getter");
            return j6g.a;
        }

        @Override // defpackage.ej3
        public final Object e(slg slgVar, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            sb.getClass();
            pz3.this.f0(slgVar, true, sb, true);
            return j6g.a;
        }

        @Override // defpackage.ej3
        public final Object f(yx9 yx9Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            sb.getClass();
            pz3.this.Q(yx9Var, sb, true);
            return j6g.a;
        }

        @Override // defpackage.ej3
        public final /* bridge */ /* synthetic */ j6g g(kv5 kv5Var, StringBuilder sb) throws IOException {
            a(kv5Var, sb);
            return j6g.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ej3
        public final Object h(tx9 tx9Var, Object obj) throws IOException {
            m52 m52VarC;
            String str;
            StringBuilder sb = (StringBuilder) obj;
            sb.getClass();
            pz3 pz3Var = pz3.this;
            vz3 vz3Var = pz3Var.d;
            int i = 0;
            boolean z = tx9Var.f() == c62.ENUM_ENTRY;
            if (!pz3Var.r()) {
                List<hsc> listY = tx9Var.Y();
                listY.getClass();
                pz3Var.C(sb, listY);
                pz3Var.y(sb, tx9Var, null);
                if (!z) {
                    e04 visibility = tx9Var.getVisibility();
                    visibility.getClass();
                    pz3Var.h0(visibility, sb);
                }
                if ((tx9Var.f() != c62.INTERFACE || tx9Var.r() != ax9.e) && (!tx9Var.f().a() || tx9Var.r() != ax9.b)) {
                    ax9 ax9VarR = tx9Var.r();
                    ax9VarR.getClass();
                    pz3Var.M(ax9VarR, sb, pz3.v(tx9Var));
                }
                pz3Var.L(tx9Var, sb);
                pz3Var.O(sb, pz3Var.q().contains(qz3.INNER) && tx9Var.y(), "inner");
                pz3Var.O(sb, pz3Var.q().contains(qz3.DATA) && tx9Var.H0(), "data");
                pz3Var.O(sb, pz3Var.q().contains(qz3.INLINE) && tx9Var.isInline(), "inline");
                pz3Var.O(sb, pz3Var.q().contains(qz3.VALUE) && tx9Var.s(), "value");
                pz3Var.O(sb, pz3Var.q().contains(qz3.FUN) && tx9Var.e0(), "fun");
                if (tx9Var instanceof zvf) {
                    str = "typealias";
                } else if (tx9Var.a0()) {
                    str = "companion object";
                } else {
                    int iOrdinal = tx9Var.f().ordinal();
                    if (iOrdinal == 0) {
                        str = "class";
                    } else if (iOrdinal == 1) {
                        str = "interface";
                    } else if (iOrdinal == 2) {
                        str = "enum class";
                    } else if (iOrdinal == 3) {
                        str = "enum entry";
                    } else if (iOrdinal == 4) {
                        str = "annotation class";
                    } else {
                        if (iOrdinal != 5) {
                            l.g();
                            return null;
                        }
                        str = "object";
                    }
                }
                sb.append(pz3Var.J(str));
            }
            if (yz3.l(tx9Var)) {
                uz3 uz3Var = vz3Var.G;
                qf8<Object> qf8Var = vz3.Y[31];
                uz3Var.getClass();
                qf8Var.getClass();
                if (((Boolean) uz3Var.a).booleanValue()) {
                    if (pz3Var.r()) {
                        sb.append("companion object");
                    }
                    pz3.W(sb);
                    aj3 aj3VarD = tx9Var.d();
                    if (aj3VarD != null) {
                        sb.append("of ");
                        n8a name = aj3VarD.getName();
                        name.getClass();
                        sb.append(pz3Var.P(name, false));
                    }
                }
                if (pz3Var.u() || !wl7.b(tx9Var.getName(), toe.b)) {
                    if (!pz3Var.r()) {
                        pz3.W(sb);
                    }
                    n8a name2 = tx9Var.getName();
                    name2.getClass();
                    sb.append(pz3Var.P(name2, true));
                }
            } else {
                if (!pz3Var.r()) {
                    pz3.W(sb);
                }
                pz3Var.Q(tx9Var, sb, true);
            }
            if (!z) {
                List<rxf> listP = tx9Var.p();
                listP.getClass();
                pz3Var.c0(listP, sb, false);
                pz3Var.A(tx9Var, sb);
                if (!tx9Var.f().a()) {
                    uz3 uz3Var2 = vz3Var.i;
                    qf8<Object> qf8Var2 = vz3.Y[7];
                    uz3Var2.getClass();
                    qf8Var2.getClass();
                    if (((Boolean) uz3Var2.a).booleanValue() && (m52VarC = tx9Var.C()) != null) {
                        sb.append(" ");
                        pz3Var.y(sb, m52VarC, null);
                        e04 visibility2 = m52VarC.getVisibility();
                        visibility2.getClass();
                        pz3Var.h0(visibility2, sb);
                        sb.append(pz3Var.J("constructor"));
                        List<rlg> listI = m52VarC.i();
                        listI.getClass();
                        pz3Var.g0(listI, m52VarC.g0(), sb);
                    }
                }
                uz3 uz3Var3 = vz3Var.x;
                qf8<Object> qf8Var3 = vz3.Y[22];
                uz3Var3.getClass();
                qf8Var3.getClass();
                if (!((Boolean) uz3Var3.a).booleanValue() && !ei8.F(tx9Var.o())) {
                    Collection<ui8> collectionB = tx9Var.j().b();
                    collectionB.getClass();
                    if (!collectionB.isEmpty() && (collectionB.size() != 1 || !ei8.y(collectionB.iterator().next()))) {
                        pz3.W(sb);
                        sb.append(": ");
                        z92.V0(collectionB, sb, ", ", null, null, new oz3(pz3Var, i), 60);
                    }
                }
                pz3Var.i0(sb, listP);
            }
            return j6g.a;
        }

        @Override // defpackage.ej3
        public final Object i(mya myaVar, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            sb.getClass();
            pz3 pz3Var = pz3.this;
            pz3Var.getClass();
            mq5 mq5Var = myaVar.e;
            sb.append(pz3Var.J("package-fragment"));
            String strH = pz3Var.H(mq5Var.a);
            if (strH.length() > 0) {
                sb.append(" ");
                sb.append(strH);
            }
            if (pz3Var.d.o()) {
                sb.append(" in ");
                pz3Var.Q(myaVar.d(), sb, false);
            }
            return j6g.a;
        }

        @Override // defpackage.ej3
        public final Object j(e5 e5Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            sb.getClass();
            pz3.this.a0(e5Var, sb, true);
            return j6g.a;
        }

        @Override // defpackage.ej3
        public final Object k(v4 v4Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            sb.getClass();
            pz3 pz3Var = pz3.this;
            pz3Var.getClass();
            pz3Var.y(sb, v4Var, null);
            e04 e04Var = v4Var.f;
            e04Var.getClass();
            pz3Var.h0(e04Var, sb);
            pz3Var.L(v4Var, sb);
            sb.append(pz3Var.J("typealias"));
            sb.append(" ");
            pz3Var.Q(v4Var, sb, true);
            pz3Var.c0(v4Var.p(), sb, false);
            pz3Var.A(v4Var, sb);
            sb.append(" = ");
            sb.append(pz3Var.X(((s14) v4Var).t0()));
            return j6g.a;
        }

        @Override // defpackage.ej3
        public final Object l(q4c q4cVar, Object obj) throws IOException {
            StringBuilder sb = (StringBuilder) obj;
            sb.getClass();
            b(q4cVar, sb, "setter");
            return j6g.a;
        }

        @Override // defpackage.ej3
        public final Object m(ws8 ws8Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            sb.getClass();
            pz3 pz3Var = pz3.this;
            pz3Var.getClass();
            mq5 mq5Var = ws8Var.d;
            sb.append(pz3Var.J("package"));
            String strH = pz3Var.H(mq5Var.a);
            if (strH.length() > 0) {
                sb.append(" ");
                sb.append(strH);
            }
            if (pz3Var.d.o()) {
                sb.append(" in context of ");
                pz3Var.Q(ws8Var.c, sb, false);
            }
            return j6g.a;
        }

        @Override // defpackage.ej3
        public final Object n(e4c e4cVar, Object obj) throws IOException {
            StringBuilder sb = (StringBuilder) obj;
            e4cVar.getClass();
            sb.getClass();
            pz3.n(pz3.this, e4cVar, sb);
            return j6g.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
        @Override // defpackage.ej3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object p(defpackage.n52 r11, java.lang.Object r12) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 324
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: pz3.a.p(n52, java.lang.Object):java.lang.Object");
        }
    }

    public pz3(vz3 vz3Var) {
        this.d = vz3Var;
    }

    public static void W(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    public static boolean j0(ui8 ui8Var) {
        if (!tv5.h(ui8Var)) {
            return false;
        }
        List<wxf> listK0 = ui8Var.K0();
        if ((listK0 instanceof Collection) && listK0.isEmpty()) {
            return true;
        }
        Iterator<T> it = listK0.iterator();
        while (it.hasNext()) {
            if (((wxf) it.next()).b()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void n(pz3 pz3Var, d4c d4cVar, StringBuilder sb) throws IOException {
        boolean zR = pz3Var.r();
        vz3 vz3Var = pz3Var.d;
        if (!zR) {
            uz3 uz3Var = vz3Var.g;
            qf8<Object>[] qf8VarArr = vz3.Y;
            qf8<Object> qf8Var = qf8VarArr[5];
            uz3Var.getClass();
            qf8Var.getClass();
            if (!((Boolean) uz3Var.a).booleanValue()) {
                List<hsc> listW0 = d4cVar.w0();
                listW0.getClass();
                pz3Var.C(sb, listW0);
                if (pz3Var.q().contains(qz3.ANNOTATIONS)) {
                    pz3Var.y(sb, d4cVar, null);
                    y85 y85VarV0 = d4cVar.v0();
                    if (y85VarV0 != null) {
                        pz3Var.y(sb, y85VarV0, hf0.FIELD);
                    }
                    y85 y85VarP = d4cVar.P();
                    if (y85VarP != null) {
                        pz3Var.y(sb, y85VarP, hf0.PROPERTY_DELEGATE_FIELD);
                    }
                    uz3 uz3Var2 = vz3Var.H;
                    qf8<Object> qf8Var2 = qf8VarArr[32];
                    uz3Var2.getClass();
                    qf8Var2.getClass();
                    if (((y3c) uz3Var2.a) == y3c.b) {
                        g4c g4cVarC = d4cVar.c();
                        if (g4cVarC != null) {
                            pz3Var.y(sb, g4cVarC, hf0.PROPERTY_GETTER);
                        }
                        p4c p4cVarE = d4cVar.e();
                        if (p4cVarE != null) {
                            pz3Var.y(sb, p4cVarE, hf0.PROPERTY_SETTER);
                            List<rlg> listI = p4cVarE.i();
                            listI.getClass();
                            rlg rlgVar = (rlg) z92.k1(listI);
                            rlgVar.getClass();
                            pz3Var.y(sb, rlgVar, hf0.SETTER_PARAMETER);
                        }
                    }
                }
                e04 visibility = d4cVar.getVisibility();
                visibility.getClass();
                pz3Var.h0(visibility, sb);
                pz3Var.O(sb, pz3Var.q().contains(qz3.CONST) && d4cVar.b0(), "const");
                pz3Var.L(d4cVar, sb);
                pz3Var.N(d4cVar, sb);
                pz3Var.T(d4cVar, sb);
                pz3Var.O(sb, pz3Var.q().contains(qz3.LATEINIT) && d4cVar.x0(), "lateinit");
                pz3Var.K(d4cVar, sb);
            }
            pz3Var.e0(d4cVar, sb, false);
            List<rxf> typeParameters = d4cVar.getTypeParameters();
            typeParameters.getClass();
            pz3Var.c0(typeParameters, sb, true);
            hsc hscVarO = d4cVar.O();
            if (hscVarO != null) {
                pz3Var.y(sb, hscVarO, hf0.RECEIVER);
                ui8 type = hscVarO.getType();
                type.getClass();
                sb.append(pz3Var.G(type));
                sb.append(".");
            }
        }
        pz3Var.Q(d4cVar, sb, true);
        sb.append(": ");
        ui8 type2 = d4cVar.getType();
        type2.getClass();
        sb.append(pz3Var.X(type2));
        pz3Var.V(d4cVar, sb);
        pz3Var.I(d4cVar, sb);
        List<rxf> typeParameters2 = d4cVar.getTypeParameters();
        typeParameters2.getClass();
        pz3Var.i0(sb, typeParameters2);
    }

    public static ax9 v(zm9 zm9Var) {
        boolean z = zm9Var instanceof t52;
        ax9 ax9Var = ax9.e;
        c62 c62Var = c62.INTERFACE;
        ax9 ax9Var2 = ax9.b;
        if (z) {
            return ((t52) zm9Var).f() == c62Var ? ax9Var : ax9Var2;
        }
        aj3 aj3VarD = zm9Var.d();
        t52 t52Var = aj3VarD instanceof t52 ? (t52) aj3VarD : null;
        if (t52Var == null || !(zm9Var instanceof hv1)) {
            return ax9Var2;
        }
        hv1 hv1Var = (hv1) zm9Var;
        Collection<? extends hv1> collectionM = hv1Var.m();
        collectionM.getClass();
        boolean zIsEmpty = collectionM.isEmpty();
        ax9 ax9Var3 = ax9.d;
        return (zIsEmpty || t52Var.r() == ax9Var2) ? (t52Var.f() != c62Var || wl7.b(hv1Var.getVisibility(), d04.a)) ? ax9Var2 : hv1Var.r() == ax9Var ? ax9Var : ax9Var3 : ax9Var3;
    }

    public final void A(w62 w62Var, StringBuilder sb) {
        List<rxf> listP = w62Var.p();
        listP.getClass();
        List<rxf> parameters = w62Var.j().getParameters();
        parameters.getClass();
        if (u() && w62Var.y() && parameters.size() > listP.size()) {
            sb.append(" /*captured type parameters: ");
            b0(sb, parameters.subList(listP.size(), parameters.size()));
            sb.append("*/");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String B(up2<?> up2Var) {
        uz3 uz3Var = this.d.v;
        qf8<Object> qf8Var = vz3.Y[20];
        uz3Var.getClass();
        qf8Var.getClass();
        Function1 function1 = (Function1) uz3Var.a;
        if (function1 != null) {
            return (String) function1.invoke(up2Var);
        }
        if (up2Var instanceof rt0) {
            Iterable iterable = (Iterable) ((rt0) up2Var).a;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strB = B((up2) it.next());
                if (strB != null) {
                    arrayList.add(strB);
                }
            }
            return z92.W0(arrayList, ", ", "{", "}", null, 56);
        }
        if (up2Var instanceof kf0) {
            return zve.b0(x((af0) ((kf0) up2Var).a, null), "@");
        }
        if (!(up2Var instanceof me8)) {
            return up2Var.toString();
        }
        me8.a aVar = (me8.a) ((me8) up2Var).a;
        if (aVar instanceof me8.a.C0318a) {
            return ((me8.a.C0318a) aVar).a + "::class";
        }
        if (!(aVar instanceof me8.a.b)) {
            l.g();
            return null;
        }
        d62 d62Var = ((me8.a.b) aVar).a;
        String strF = d62Var.a.a().a.a;
        int i = d62Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            strF = ja.f('>', "kotlin.Array<", strF);
        }
        return t40.k(strF, "::class");
    }

    public final void C(StringBuilder sb, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            hsc hscVar = (hsc) it.next();
            y(sb, hscVar, hf0.RECEIVER);
            ui8 type = hscVar.getType();
            type.getClass();
            sb.append(G(type));
            if (i == list.size() - 1) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(java.lang.StringBuilder r8, defpackage.mge r9) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz3.D(java.lang.StringBuilder, mge):void");
    }

    public final String E(String str) {
        int iOrdinal = s().ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal == 1) {
            return l5.m("<font color=red><b>", str, "</b></font>");
        }
        l.g();
        return null;
    }

    public final String F(String str, String str2, ei8 ei8Var) {
        str.getClass();
        str2.getClass();
        if (web.F(str, str2)) {
            return wve.K(str2, "(", false) ? l5.m("(", str, ")!") : str.concat("!");
        }
        String strQ0 = zve.q0(p().a(ei8Var.j(ere.a.C), this), "Collection");
        String strX = web.x(str, strQ0.concat("Mutable"), str2, strQ0, strQ0.concat("(Mutable)"));
        if (strX != null) {
            return strX;
        }
        String strX2 = web.x(str, strQ0.concat("MutableMap.MutableEntry"), str2, strQ0.concat("Map.Entry"), strQ0.concat("(Mutable)Map.(Mutable)Entry"));
        if (strX2 != null) {
            return strX2;
        }
        String strQ02 = zve.q0(p().a(ei8Var.k("Array"), this), "Array");
        String strX3 = web.x(str, strQ02.concat(o("Array<")), str2, strQ02.concat(o("Array<out ")), strQ02.concat(o("Array<(out) ")));
        if (strX3 != null) {
            return strX3;
        }
        return "(" + str + ".." + str2 + ')';
    }

    public final String G(ui8 ui8Var) {
        String strX = X(ui8Var);
        return ((!j0(ui8Var) || kyf.e(ui8Var)) && !(ui8Var instanceof fs3)) ? strX : ja.f(')', "(", strX);
    }

    public final String H(nq5 nq5Var) {
        nq5Var.getClass();
        return o(web.w(nq5.e(nq5Var)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I(vlg vlgVar, StringBuilder sb) {
        up2<?> up2VarN0;
        String strB;
        uz3 uz3Var = this.d.u;
        qf8<Object> qf8Var = vz3.Y[19];
        uz3Var.getClass();
        qf8Var.getClass();
        if (!((Boolean) uz3Var.a).booleanValue() || (up2VarN0 = vlgVar.n0()) == null || (strB = B(up2VarN0)) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(o(strB));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String J(String str) {
        int iOrdinal = s().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                l.g();
                return null;
            }
            uz3 uz3Var = this.d.W;
            qf8<Object> qf8Var = vz3.Y[48];
            uz3Var.getClass();
            qf8Var.getClass();
            if (!((Boolean) uz3Var.a).booleanValue()) {
                return l5.m("<b>", str, "</b>");
            }
        }
        return str;
    }

    public final void K(hv1 hv1Var, StringBuilder sb) {
        if (q().contains(qz3.MEMBER_KIND) && u() && hv1Var.f() != hv1.a.a) {
            sb.append("/*");
            sb.append(ie7.A(hv1Var.f().name()));
            sb.append("*/ ");
        }
    }

    public final void L(zm9 zm9Var, StringBuilder sb) {
        O(sb, zm9Var.isExternal(), "external");
        boolean z = false;
        O(sb, q().contains(qz3.EXPECT) && zm9Var.i0(), "expect");
        if (q().contains(qz3.ACTUAL) && zm9Var.X()) {
            z = true;
        }
        O(sb, z, "actual");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M(ax9 ax9Var, StringBuilder sb, ax9 ax9Var2) {
        uz3 uz3Var = this.d.p;
        qf8<Object> qf8Var = vz3.Y[14];
        uz3Var.getClass();
        qf8Var.getClass();
        if (((Boolean) uz3Var.a).booleanValue() || ax9Var != ax9Var2) {
            O(sb, q().contains(qz3.MODALITY), ie7.A(ax9Var.name()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(hv1 hv1Var, StringBuilder sb) {
        if (yz3.s(hv1Var) && hv1Var.r() == ax9.b) {
            return;
        }
        uz3 uz3Var = this.d.B;
        qf8<Object> qf8Var = vz3.Y[26];
        uz3Var.getClass();
        qf8Var.getClass();
        if (((hxa) uz3Var.a) == hxa.a && hv1Var.r() == ax9.d && !hv1Var.m().isEmpty()) {
            return;
        }
        ax9 ax9VarR = hv1Var.r();
        ax9VarR.getClass();
        M(ax9VarR, sb, v(hv1Var));
    }

    public final void O(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(J(str));
            sb.append(" ");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String P(n8a n8aVar, boolean z) {
        String strO = o(web.v(n8aVar));
        uz3 uz3Var = this.d.W;
        qf8<Object> qf8Var = vz3.Y[48];
        uz3Var.getClass();
        qf8Var.getClass();
        return (((Boolean) uz3Var.a).booleanValue() && s() == z1d.b && z) ? l5.m("<b>", strO, "</b>") : strO;
    }

    public final void Q(aj3 aj3Var, StringBuilder sb, boolean z) {
        n8a name = aj3Var.getName();
        name.getClass();
        sb.append(P(name, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(StringBuilder sb, ui8 ui8Var) {
        p7g p7gVarP0 = ui8Var.P0();
        g0 g0Var = p7gVarP0 instanceof g0 ? (g0) p7gVarP0 : null;
        if (g0Var == null) {
            S(sb, ui8Var);
            return;
        }
        mge mgeVar = g0Var.c;
        mge mgeVar2 = g0Var.b;
        vz3 vz3Var = this.d;
        uz3 uz3Var = vz3Var.R;
        qf8<Object>[] qf8VarArr = vz3.Y;
        qf8<Object> qf8Var = qf8VarArr[42];
        uz3Var.getClass();
        qf8Var.getClass();
        boolean zBooleanValue = ((Boolean) uz3Var.a).booleanValue();
        z1d.a aVar = z1d.b;
        if (zBooleanValue) {
            S(sb, mgeVar2);
            uz3 uz3Var2 = vz3Var.S;
            qf8<Object> qf8Var2 = qf8VarArr[43];
            uz3Var2.getClass();
            qf8Var2.getClass();
            if (((Boolean) uz3Var2.a).booleanValue()) {
                if (s() == aVar) {
                    sb.append("<font color=\"808080\"><i>");
                }
                sb.append(" /* ");
                sb.append("from: ");
                S(sb, mgeVar);
                sb.append(" */");
                if (s() == aVar) {
                    sb.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        S(sb, mgeVar);
        uz3 uz3Var3 = vz3Var.Q;
        qf8<Object> qf8Var3 = qf8VarArr[41];
        uz3Var3.getClass();
        qf8Var3.getClass();
        if (((Boolean) uz3Var3.a).booleanValue()) {
            if (s() == aVar) {
                sb.append("<font color=\"808080\"><i>");
            }
            sb.append(" /* ");
            sb.append("= ");
            S(sb, mgeVar2);
            sb.append(" */");
            if (s() == aVar) {
                sb.append("</i></font>");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(java.lang.StringBuilder r18, defpackage.ui8 r19) {
        /*
            Method dump skipped, instruction units count: 635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz3.S(java.lang.StringBuilder, ui8):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T(hv1 hv1Var, StringBuilder sb) {
        if (q().contains(qz3.OVERRIDE) && !hv1Var.m().isEmpty()) {
            uz3 uz3Var = this.d.B;
            qf8<Object> qf8Var = vz3.Y[26];
            uz3Var.getClass();
            qf8Var.getClass();
            if (((hxa) uz3Var.a) != hxa.b) {
                O(sb, true, "override");
                if (u()) {
                    sb.append("/*");
                    sb.append(hv1Var.m().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    public final void U(StringBuilder sb, lb4 lb4Var) {
        lb4 lb4Var2 = (lb4) lb4Var.c;
        w62 w62Var = (w62) lb4Var.a;
        if (lb4Var2 != null) {
            U(sb, lb4Var2);
            sb.append(JwtParser.SEPARATOR_CHAR);
            n8a name = w62Var.getName();
            name.getClass();
            sb.append(P(name, false));
        } else {
            kwf kwfVarJ = w62Var.j();
            kwfVarJ.getClass();
            sb.append(Z(kwfVarJ));
        }
        sb.append(Y((List) lb4Var.b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V(hv1 hv1Var, StringBuilder sb) {
        hsc hscVarO;
        uz3 uz3Var = this.d.F;
        qf8<Object> qf8Var = vz3.Y[30];
        uz3Var.getClass();
        qf8Var.getClass();
        if (((Boolean) uz3Var.a).booleanValue() && (hscVarO = hv1Var.O()) != null) {
            sb.append(" on ");
            ui8 type = hscVarO.getType();
            type.getClass();
            sb.append(X(type));
        }
    }

    public final String X(ui8 ui8Var) {
        ui8Var.getClass();
        StringBuilder sb = new StringBuilder();
        uz3 uz3Var = this.d.y;
        qf8<Object> qf8Var = vz3.Y[23];
        uz3Var.getClass();
        qf8Var.getClass();
        R(sb, (ui8) ((Function1) uz3Var.a).invoke(ui8Var));
        return sb.toString();
    }

    public final String Y(List<? extends wxf> list) throws IOException {
        list.getClass();
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(o("<"));
        z92.V0(list, sb, ", ", null, null, new s4(this, 1), 60);
        sb.append(o(">"));
        return sb.toString();
    }

    public final String Z(kwf kwfVar) {
        kwfVar.getClass();
        v62 v62VarD = kwfVar.d();
        if ((v62VarD instanceof rxf) || (v62VarD instanceof t52) || (v62VarD instanceof zvf)) {
            v62VarD.getClass();
            return lx4.f(v62VarD) ? v62VarD.j().toString() : p().a(v62VarD, this);
        }
        if (v62VarD == null) {
            return kwfVar instanceof kj7 ? ((kj7) kwfVar).g(rl2.c) : kwfVar.toString();
        }
        s40.i(v62VarD.getClass(), "Unexpected classifier: ");
        return null;
    }

    @Override // defpackage.rz3
    public final void a() {
        this.d.a();
    }

    public final void a0(rxf rxfVar, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(o("<"));
        }
        if (u()) {
            sb.append("/*");
            sb.append(rxfVar.getIndex());
            sb.append("*/ ");
        }
        O(sb, rxfVar.v(), "reified");
        String strC = rxfVar.z().c();
        boolean z2 = true;
        O(sb, strC.length() > 0, strC);
        y(sb, rxfVar, null);
        Q(rxfVar, sb, z);
        int size = rxfVar.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            ui8 next = rxfVar.getUpperBounds().iterator().next();
            if (next == null) {
                ei8.a(141);
                throw null;
            }
            if (!ei8.y(next) || !next.N0()) {
                sb.append(" : ");
                sb.append(X(next));
            }
        } else if (z) {
            for (ui8 ui8Var : rxfVar.getUpperBounds()) {
                if (ui8Var == null) {
                    ei8.a(141);
                    throw null;
                }
                if (!ei8.y(ui8Var) || !ui8Var.N0()) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    sb.append(X(ui8Var));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(o(">"));
        }
    }

    @Override // defpackage.rz3
    public final void b() {
        this.d.b();
    }

    public final void b0(StringBuilder sb, List<? extends rxf> list) {
        Iterator<? extends rxf> it = list.iterator();
        while (it.hasNext()) {
            a0(it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    @Override // defpackage.rz3
    public final void c() {
        this.d.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c0(List<? extends rxf> list, StringBuilder sb, boolean z) {
        uz3 uz3Var = this.d.w;
        qf8<Object> qf8Var = vz3.Y[21];
        uz3Var.getClass();
        qf8Var.getClass();
        if (((Boolean) uz3Var.a).booleanValue() || list.isEmpty()) {
            return;
        }
        sb.append(o("<"));
        b0(sb, list);
        sb.append(o(">"));
        if (z) {
            sb.append(" ");
        }
    }

    @Override // defpackage.rz3
    public final void d(x62 x62Var) {
        this.d.d(x62Var);
    }

    public final String d0(wxf wxfVar) throws IOException {
        wxfVar.getClass();
        StringBuilder sb = new StringBuilder();
        z92.V0(u63.Z(wxfVar), sb, ", ", null, null, new s4(this, 1), 60);
        return sb.toString();
    }

    @Override // defpackage.rz3
    public final void e() {
        this.d.e();
    }

    public final void e0(vlg vlgVar, StringBuilder sb, boolean z) {
        if (z || !(vlgVar instanceof rlg)) {
            sb.append(J(vlgVar.N() ? "var" : "val"));
            sb.append(" ");
        }
    }

    @Override // defpackage.rz3
    public final Set<mq5> f() {
        return this.d.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f0(defpackage.rlg r11, boolean r12, java.lang.StringBuilder r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz3.f0(rlg, boolean, java.lang.StringBuilder, boolean):void");
    }

    @Override // defpackage.rz3
    public final void g() {
        this.d.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g0(Collection<? extends rlg> collection, boolean z, StringBuilder sb) {
        uz3 uz3Var = this.d.E;
        qf8<Object> qf8Var = vz3.Y[29];
        uz3Var.getClass();
        qf8Var.getClass();
        int iOrdinal = ((s3b) uz3Var.a).ordinal();
        boolean z2 = true;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    l.g();
                    return;
                }
            } else if (z) {
            }
            z2 = false;
        }
        int size = collection.size();
        t().b(sb);
        int i = 0;
        for (rlg rlgVar : collection) {
            t().d(rlgVar, sb);
            f0(rlgVar, z2, sb, false);
            t().a(rlgVar, i, size, sb);
            i++;
        }
        t().c(sb);
    }

    @Override // defpackage.rz3
    public final void h() {
        this.d.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean h0(e04 e04Var, StringBuilder sb) {
        if (!q().contains(qz3.VISIBILITY)) {
            return false;
        }
        vz3 vz3Var = this.d;
        uz3 uz3Var = vz3Var.n;
        qf8<Object>[] qf8VarArr = vz3.Y;
        qf8<Object> qf8Var = qf8VarArr[12];
        uz3Var.getClass();
        qf8Var.getClass();
        if (((Boolean) uz3Var.a).booleanValue()) {
            e04Var = e04Var.d();
        }
        uz3 uz3Var2 = vz3Var.o;
        qf8<Object> qf8Var2 = qf8VarArr[13];
        uz3Var2.getClass();
        qf8Var2.getClass();
        if (!((Boolean) uz3Var2.a).booleanValue() && e04Var.equals(d04.l)) {
            return false;
        }
        sb.append(J(e04Var.b()));
        sb.append(" ");
        return true;
    }

    @Override // defpackage.rz3
    public final void i(Set<? extends qz3> set) {
        set.getClass();
        this.d.i(set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i0(StringBuilder sb, List list) throws IOException {
        uz3 uz3Var = this.d.w;
        qf8<Object> qf8Var = vz3.Y[21];
        uz3Var.getClass();
        qf8Var.getClass();
        if (((Boolean) uz3Var.a).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rxf rxfVar = (rxf) it.next();
            List<ui8> upperBounds = rxfVar.getUpperBounds();
            upperBounds.getClass();
            for (ui8 ui8Var : z92.J0(upperBounds, 1)) {
                StringBuilder sb2 = new StringBuilder();
                n8a name = rxfVar.getName();
                name.getClass();
                sb2.append(P(name, false));
                sb2.append(" : ");
                ui8Var.getClass();
                sb2.append(X(ui8Var));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(J("where"));
        sb.append(" ");
        z92.V0(arrayList, sb, ", ", null, null, null, 124);
    }

    @Override // defpackage.rz3
    public final void j(LinkedHashSet linkedHashSet) {
        this.d.j(linkedHashSet);
    }

    @Override // defpackage.rz3
    public final void k(s3b s3bVar) {
        this.d.k(s3bVar);
    }

    @Override // defpackage.rz3
    public final void l() {
        this.d.l();
    }

    @Override // defpackage.rz3
    public final void m() {
        this.d.m();
    }

    public final String o(String str) {
        return s().a(str);
    }

    public final x62 p() {
        uz3 uz3Var = this.d.b;
        vz3.Y[0].getClass();
        return (x62) uz3Var.a;
    }

    public final Set<qz3> q() {
        uz3 uz3Var = this.d.e;
        qf8<Object> qf8Var = vz3.Y[3];
        uz3Var.getClass();
        qf8Var.getClass();
        return (Set) uz3Var.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean r() {
        uz3 uz3Var = this.d.f;
        qf8<Object> qf8Var = vz3.Y[4];
        uz3Var.getClass();
        qf8Var.getClass();
        return ((Boolean) uz3Var.a).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final z1d s() {
        uz3 uz3Var = this.d.D;
        qf8<Object> qf8Var = vz3.Y[28];
        uz3Var.getClass();
        qf8Var.getClass();
        return (z1d) uz3Var.a;
    }

    public final mz3.a t() {
        uz3 uz3Var = this.d.C;
        qf8<Object> qf8Var = vz3.Y[27];
        uz3Var.getClass();
        qf8Var.getClass();
        return (mz3.a) uz3Var.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean u() {
        uz3 uz3Var = this.d.j;
        qf8<Object> qf8Var = vz3.Y[8];
        uz3Var.getClass();
        qf8Var.getClass();
        return ((Boolean) uz3Var.a).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String w(aj3 aj3Var) {
        aj3 aj3VarD;
        String str;
        aj3Var.getClass();
        StringBuilder sb = new StringBuilder();
        aj3Var.o0(new a(), sb);
        vz3 vz3Var = this.d;
        uz3 uz3Var = vz3Var.c;
        qf8<Object>[] qf8VarArr = vz3.Y;
        qf8VarArr[1].getClass();
        if (((Boolean) uz3Var.a).booleanValue() && !(aj3Var instanceof lya) && !(aj3Var instanceof wya) && (aj3VarD = aj3Var.d()) != null && !(aj3VarD instanceof xx9)) {
            sb.append(" ");
            int iOrdinal = s().ordinal();
            if (iOrdinal == 0) {
                str = "defined in";
            } else {
                if (iOrdinal != 1) {
                    l.g();
                    return null;
                }
                str = "<i>defined in</i>";
            }
            sb.append(str);
            sb.append(" ");
            nq5 nq5VarG = yz3.g(aj3VarD);
            nq5VarG.getClass();
            sb.append(nq5VarG.c() ? "root package" : H(nq5VarG));
            uz3 uz3Var2 = vz3Var.d;
            qf8VarArr[2].getClass();
            if (((Boolean) uz3Var2.a).booleanValue() && (aj3VarD instanceof lya) && (aj3Var instanceof cj3)) {
                ((cj3) aj3Var).g().getClass();
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String x(af0 af0Var, hf0 hf0Var) throws IOException {
        m52 m52VarC;
        List<rlg> listI;
        af0Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (hf0Var != null) {
            sb.append(hf0Var.a() + ':');
        }
        ui8 type = af0Var.getType();
        sb.append(X(type));
        vz3 vz3Var = this.d;
        if (vz3Var.n().a()) {
            Map<n8a, up2<?>> mapI = af0Var.i();
            uz3 uz3Var = vz3Var.I;
            qf8<Object> qf8Var = vz3.Y[33];
            uz3Var.getClass();
            qf8Var.getClass();
            List list = null;
            t52 t52VarD = ((Boolean) uz3Var.a).booleanValue() ? b04.d(af0Var) : null;
            if (t52VarD != null && (m52VarC = t52VarD.C()) != null && (listI = m52VarC.i()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listI) {
                    if (((rlg) obj).z0()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((rlg) it.next()).getName());
                }
                list = arrayList2;
            }
            if (list == null) {
                list = zr4.a;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (!mapI.containsKey((n8a) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(t92.r0(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((n8a) it2.next()).c() + " = ...");
            }
            Set<Map.Entry<n8a, up2<?>>> setEntrySet = mapI.entrySet();
            ArrayList arrayList5 = new ArrayList(t92.r0(setEntrySet, 10));
            Iterator<T> it3 = setEntrySet.iterator();
            while (it3.hasNext()) {
                Map.Entry entry = (Map.Entry) it3.next();
                n8a n8aVar = (n8a) entry.getKey();
                up2<?> up2Var = (up2) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(n8aVar.c());
                sb2.append(" = ");
                sb2.append(!list.contains(n8aVar) ? B(up2Var) : "...");
                arrayList5.add(sb2.toString());
            }
            List listO1 = z92.o1(z92.h1(arrayList4, arrayList5));
            if (vz3Var.n().c() || !listO1.isEmpty()) {
                z92.V0(listO1, sb, ", ", "(", ")", null, 112);
            }
        }
        if (u() && (pnb.D(type) || (type.M0().d() instanceof cla.b))) {
            sb.append(" /* annotation class not found */");
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(StringBuilder sb, ie0 ie0Var, hf0 hf0Var) {
        Set<mq5> setF;
        if (q().contains(qz3.ANNOTATIONS)) {
            boolean z = ie0Var instanceof ui8;
            vz3 vz3Var = this.d;
            if (z) {
                setF = vz3Var.f();
            } else {
                uz3 uz3Var = vz3Var.K;
                qf8<Object> qf8Var = vz3.Y[35];
                uz3Var.getClass();
                qf8Var.getClass();
                setF = (Set) uz3Var.a;
            }
            uz3 uz3Var2 = vz3Var.M;
            qf8<Object> qf8Var2 = vz3.Y[37];
            uz3Var2.getClass();
            qf8Var2.getClass();
            Function1 function1 = (Function1) uz3Var2.a;
            for (af0 af0Var : ie0Var.getAnnotations()) {
                if (!z92.I0(setF, af0Var.h()) && !wl7.b(af0Var.h(), ere.a.r) && (function1 == null || ((Boolean) function1.invoke(af0Var)).booleanValue())) {
                    sb.append(x(af0Var, hf0Var));
                    uz3 uz3Var3 = vz3Var.J;
                    qf8<Object> qf8Var3 = vz3.Y[34];
                    uz3Var3.getClass();
                    qf8Var3.getClass();
                    if (((Boolean) uz3Var3.a).booleanValue()) {
                        sb.append('\n');
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }
}
