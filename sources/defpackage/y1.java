package defpackage;

import defpackage.j29;
import defpackage.jp1;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y1 implements pya {
    public final j29 a;
    public final bwc b;
    public final yx9 c;
    public g04 d;
    public final on9<mq5, lya> e;

    public y1(j29 j29Var, bwc bwcVar, yx9 yx9Var) {
        this.a = j29Var;
        this.b = bwcVar;
        this.c = yx9Var;
        this.e = j29Var.d(new x1(this, 0));
    }

    @Override // defpackage.pya
    public final boolean a(mq5 mq5Var) throws IOException {
        InputStream inputStreamA;
        f62 f62VarA;
        mq5Var.getClass();
        on9<mq5, lya> on9Var = this.e;
        Object obj = ((j29.j) on9Var).b.get(mq5Var);
        if (obj == null || obj == j29.l.b) {
            vc8 vc8Var = (vc8) this;
            if (mq5Var.c(ere.k)) {
                lp1 lp1Var = vc8Var.b.b;
                cp1.m.getClass();
                String strA = cp1.a(mq5Var);
                lp1Var.getClass();
                inputStreamA = lp1.a(strA);
            } else {
                inputStreamA = null;
            }
            f62VarA = inputStreamA != null ? jp1.a.a(mq5Var, vc8Var.a, vc8Var.c, inputStreamA) : null;
        } else {
            f62VarA = (lya) on9Var.invoke(mq5Var);
        }
        return f62VarA == null;
    }

    @Override // defpackage.nya
    @sy3
    public final List<lya> b(mq5 mq5Var) {
        mq5Var.getClass();
        return u63.b0(this.e.invoke(mq5Var));
    }

    @Override // defpackage.pya
    public final void c(mq5 mq5Var, ArrayList arrayList) {
        mq5Var.getClass();
        lya lyaVarInvoke = this.e.invoke(mq5Var);
        if (lyaVarInvoke != null) {
            arrayList.add(lyaVarInvoke);
        }
    }

    @Override // defpackage.nya
    public final Collection<mq5> q(mq5 mq5Var, Function1<? super n8a, Boolean> function1) {
        mq5Var.getClass();
        return is4.a;
    }
}
