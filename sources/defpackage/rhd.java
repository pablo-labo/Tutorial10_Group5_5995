package defpackage;

import defpackage.ad8;
import defpackage.gd8;
import defpackage.nd8;
import defpackage.od8;
import defpackage.rw5;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class rhd {
    public static final a62 a;

    static {
        mq5 mq5Var = new mq5("java.lang.Void");
        a = new a62(mq5Var.b(), mq5Var.a.f());
    }

    public static ad8.e a(kv5 kv5Var) {
        String strA = ooe.a(kv5Var);
        if (strA == null) {
            if (kv5Var instanceof f4c) {
                String strC = b04.i(kv5Var).getName().c();
                strC.getClass();
                strA = jc8.a(strC);
            } else if (kv5Var instanceof p4c) {
                String strC2 = b04.i(kv5Var).getName().c();
                strC2.getClass();
                strA = "set".concat(jc8.b(strC2) ? strC2.substring(2) : ie7.h(strC2));
            } else {
                strA = kv5Var.getName().c();
                strA.getClass();
            }
        }
        return new ad8.e(new gd8.b(strA, vs9.a(kv5Var, 1)));
    }

    public static nd8 b(d4c d4cVar) {
        d4cVar.getClass();
        d4c d4cVarA = ((d4c) yz3.t(d4cVar)).a();
        d4cVarA.getClass();
        if (d4cVarA instanceof q14) {
            q14 q14Var = (q14) d4cVarA;
            g5c g5cVar = q14Var.p0;
            rw5.e<g5c, od8.c> eVar = od8.d;
            eVar.getClass();
            od8.c cVar = (od8.c) r5c.a(g5cVar, eVar);
            if (cVar != null) {
                return new nd8.c(d4cVarA, g5cVar, cVar, q14Var.q0, q14Var.r0);
            }
        } else if (d4cVarA instanceof ov7) {
            ov7 ov7Var = (ov7) d4cVarA;
            qne qneVarG = ov7Var.g();
            dw7 dw7Var = qneVarG instanceof dw7 ? (dw7) qneVarG : null;
            mvc mvcVarB = dw7Var != null ? dw7Var.b() : null;
            if (mvcVarB instanceof ovc) {
                return new nd8.a(((ovc) mvcVarB).a);
            }
            if (!(mvcVarB instanceof rvc)) {
                akb.p("Incorrect resolution sequence for Java field ", d4cVarA, " (source = ", mvcVarB);
                return null;
            }
            Method method = ((rvc) mvcVarB).a;
            p4c p4cVar = ov7Var.m0;
            qne qneVarG2 = p4cVar != null ? p4cVar.g() : null;
            dw7 dw7Var2 = qneVarG2 instanceof dw7 ? (dw7) qneVarG2 : null;
            mvc mvcVarB2 = dw7Var2 != null ? dw7Var2.b() : null;
            rvc rvcVar = mvcVarB2 instanceof rvc ? (rvc) mvcVarB2 : null;
            return new nd8.b(method, rvcVar != null ? rvcVar.a : null);
        }
        g4c g4cVarC = d4cVarA.c();
        g4cVarC.getClass();
        ad8.e eVarA = a(g4cVarC);
        p4c p4cVarE = d4cVarA.e();
        return new nd8.d(eVarA, p4cVarE != null ? a(p4cVarE) : null);
    }

    public static ad8 c(kv5 kv5Var) {
        Method method;
        kv5Var.getClass();
        kv5 kv5VarA = ((kv5) yz3.t(kv5Var)).a();
        kv5VarA.getClass();
        if (!(kv5VarA instanceof l04)) {
            if (kv5VarA instanceof iv7) {
                qne qneVarG = ((iv7) kv5VarA).g();
                dw7 dw7Var = qneVarG instanceof dw7 ? (dw7) qneVarG : null;
                mvc mvcVarB = dw7Var != null ? dw7Var.b() : null;
                rvc rvcVar = mvcVarB instanceof rvc ? (rvc) mvcVarB : null;
                if (rvcVar != null && (method = rvcVar.a) != null) {
                    return new ad8.c(method);
                }
                s6.i(kv5VarA, "Incorrect resolution sequence for Java method ");
                return null;
            }
            if (kv5VarA instanceof nu7) {
                qne qneVarG2 = ((nu7) kv5VarA).g();
                dw7 dw7Var2 = qneVarG2 instanceof dw7 ? (dw7) qneVarG2 : null;
                mvc mvcVarB2 = dw7Var2 != null ? dw7Var2.b() : null;
                if (mvcVarB2 instanceof lvc) {
                    return new ad8.b(((lvc) mvcVarB2).a);
                }
                if (mvcVarB2 instanceof hvc) {
                    Class<?> cls = ((hvc) mvcVarB2).a;
                    if (cls.isAnnotation()) {
                        return new ad8.a(cls);
                    }
                }
                akb.p("Incorrect resolution sequence for Java constructor ", kv5VarA, " (", mvcVarB2);
                return null;
            }
            if ((kv5VarA.getName().equals(ere.c) && jz3.k(kv5VarA)) || ((kv5VarA.getName().equals(ere.a) && jz3.k(kv5VarA)) || (wl7.b(kv5VarA.getName(), e82.e) && kv5VarA.i().isEmpty()))) {
                return a(kv5VarA);
            }
            StringBuilder sb = new StringBuilder("Unknown origin of ");
            sb.append(kv5VarA);
            Class<?> cls2 = kv5VarA.getClass();
            sb.append(" (");
            sb.append(cls2);
            sb.append(')');
            throw new qi8(sb.toString());
        }
        g14 g14Var = (g14) kv5VarA;
        rp9 rp9VarF0 = g14Var.f0();
        if (rp9VarF0 instanceof b5c) {
            s45 s45Var = pd8.a;
            gd8.b bVarC = pd8.c((b5c) rp9VarF0, g14Var.I(), g14Var.D());
            if (bVarC != null) {
                return new ad8.e(bVarC);
            }
        }
        if (rp9VarF0 instanceof w4c) {
            s45 s45Var2 = pd8.a;
            gd8.b bVarA = pd8.a((w4c) rp9VarF0, g14Var.I(), g14Var.D());
            if (bVarA != null) {
                String str = bVarA.a;
                String str2 = bVarA.b;
                aj3 aj3VarD = kv5Var.d();
                aj3VarD.getClass();
                if (fe7.b(aj3VarD)) {
                    return new ad8.e(bVarA);
                }
                aj3 aj3VarD2 = kv5Var.d();
                aj3VarD2.getClass();
                if (!fe7.c(aj3VarD2)) {
                    return new ad8.d(bVarA);
                }
                uq2 uq2Var = (uq2) kv5Var;
                if (uq2Var.c0()) {
                    if (!wl7.b(str, "constructor-impl") || !wve.D(str2, ")V", false)) {
                        v40.n(bVarA, "Invalid signature: ");
                        return null;
                    }
                } else {
                    if (!wl7.b(str, "constructor-impl")) {
                        v40.n(bVarA, "Invalid signature: ");
                        return null;
                    }
                    t52 t52VarD0 = uq2Var.d0();
                    t52VarD0.getClass();
                    a62 a62VarF = b04.f(t52VarD0);
                    a62VarF.getClass();
                    String strB = e62.b(a62VarF.b());
                    if (wve.D(str2, ")V", false)) {
                        String strConcat = zve.d0(str2, "V").concat(strB);
                        str.getClass();
                        bVarA = new gd8.b(str, strConcat);
                    } else if (!wve.D(str2, strB, false)) {
                        v40.n(bVarA, "Invalid signature: ");
                        return null;
                    }
                }
                return new ad8.e(bVarA);
            }
        }
        return a(kv5VarA);
    }
}
