package defpackage;

import defpackage.kab;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gn5 extends qv5 implements Function2<xm5, xm5, j6g> {
    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(xm5 xm5Var, xm5 xm5Var2) {
        boolean zA;
        in5 in5VarG2;
        xm5 xm5Var3 = xm5Var;
        xm5 xm5Var4 = xm5Var2;
        fn5 fn5Var = (fn5) this.receiver;
        if (fn5Var.c0 && (zA = xm5Var4.a()) != xm5Var3.a()) {
            Function1<Boolean, j6g> function1 = fn5Var.g0;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(zA));
            }
            if (zA) {
                u63.Y(fn5Var.Q1(), null, null, new hn5(fn5Var, null), 3);
                luc lucVar = new luc();
                koa.a(fn5Var, new gx(3, lucVar, fn5Var));
                kab kabVar = (kab) lucVar.element;
                fn5Var.i0 = kabVar != null ? kabVar.a() : null;
                tia tiaVar = fn5Var.j0;
                if (tiaVar != null && tiaVar.f1().c0 && (in5VarG2 = fn5Var.g2()) != null) {
                    in5VarG2.c2(fn5Var.j0);
                }
            } else {
                kab.a aVar = fn5Var.i0;
                if (aVar != null) {
                    aVar.release();
                }
                fn5Var.i0 = null;
                in5 in5VarG22 = fn5Var.g2();
                if (in5VarG22 != null) {
                    in5VarG22.c2(null);
                }
            }
            us3.f(fn5Var).U();
            d3a d3aVar = fn5Var.f0;
            if (d3aVar != null) {
                zl5 zl5Var = fn5Var.h0;
                if (zA) {
                    if (zl5Var != null) {
                        fn5Var.f2(d3aVar, new am5(zl5Var));
                        fn5Var.h0 = null;
                    }
                    zl5 zl5Var2 = new zl5();
                    fn5Var.f2(d3aVar, zl5Var2);
                    fn5Var.h0 = zl5Var2;
                } else if (zl5Var != null) {
                    fn5Var.f2(d3aVar, new am5(zl5Var));
                    fn5Var.h0 = null;
                }
            }
        }
        return j6g.a;
    }
}
