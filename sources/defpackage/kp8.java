package defpackage;

import defpackage.fi8;
import defpackage.hi8;
import defpackage.lp8;
import defpackage.qu7;
import defpackage.y52;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class kp8 implements Function1 {
    public final lp8 a;
    public final mp8 b;

    public kp8(lp8 lp8Var, mp8 mp8Var) {
        this.a = lp8Var;
        this.b = mp8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        lp8.b aVar;
        t52 t52Var;
        lp8.a aVar2 = (lp8.a) obj;
        aVar2.getClass();
        lp8 lp8Var = this.a;
        hp8 hp8Var = lp8Var.o;
        a62 a62Var = new a62(hp8Var.e, aVar2.a);
        hvc hvcVarC = aVar2.b;
        mp8 mp8Var = this.b;
        sv7 sv7Var = mp8Var.a;
        fi8.a.C0233a c0233aB = hvcVarC != null ? sv7Var.c.b(hvcVarC, lp8Var.w()) : sv7Var.c.a(a62Var, lp8Var.w());
        awc awcVar = c0233aB != null ? c0233aB.a : null;
        a62 a62VarA = awcVar != null ? wuc.a(awcVar.a) : null;
        if (a62VarA == null || (!a62VarA.g() && !a62VarA.c)) {
            if (awcVar == null) {
                aVar = lp8.b.C0308b.a;
            } else if (awcVar.b.a == hi8.a.CLASS) {
                f14 f14Var = lp8Var.b.a.d;
                f14Var.getClass();
                o52 o52VarF = f14Var.f(awcVar);
                if (o52VarF == null) {
                    t52Var = null;
                } else {
                    y52 y52Var = f14Var.c().t;
                    a62 a62VarA2 = wuc.a(awcVar.a);
                    y52Var.getClass();
                    t52Var = (t52) y52Var.b.invoke(new y52.a(a62VarA2, o52VarF));
                }
                aVar = t52Var != null ? new lp8.b.a(t52Var) : lp8.b.C0308b.a;
            } else {
                aVar = lp8.b.c.a;
            }
            if (aVar instanceof lp8.b.a) {
                return ((lp8.b.a) aVar).a;
            }
            if (!(aVar instanceof lp8.b.c)) {
                if (!(aVar instanceof lp8.b.C0308b)) {
                    l.g();
                    return null;
                }
                if (hvcVarC == null) {
                    hvcVarC = sv7Var.b.c(new qu7.a(a62Var, null, 4));
                }
                mq5 mq5VarH = hvcVarC != null ? hvcVarC.h() : null;
                if (mq5VarH != null && !mq5VarH.a.c() && mq5VarH.b().equals(hp8Var.e)) {
                    ap8 ap8Var = new ap8(mp8Var, hp8Var, hvcVarC, null);
                    sv7Var.s.getClass();
                    return ap8Var;
                }
            }
        }
        return null;
    }
}
