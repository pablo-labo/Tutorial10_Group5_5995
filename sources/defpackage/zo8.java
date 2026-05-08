package defpackage;

import defpackage.cc5;
import defpackage.ere;
import defpackage.lf0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zo8 implements lf0 {
    public final mp8 a;
    public final ku7 b;
    public final boolean c;
    public final on9<fu7, af0> d;

    public zo8(mp8 mp8Var, ku7 ku7Var, boolean z) {
        mp8Var.getClass();
        ku7Var.getClass();
        this.a = mp8Var;
        this.b = ku7Var;
        this.c = z;
        this.d = mp8Var.a.a.d(new q52(this, 1));
    }

    @Override // defpackage.lf0
    public final boolean P0(mq5 mq5Var) {
        return lf0.b.b(this, mq5Var);
    }

    @Override // defpackage.lf0
    public final boolean isEmpty() {
        return this.b.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<af0> iterator() {
        ku7 ku7Var = this.b;
        y92 y92VarG0 = z92.G0(ku7Var.getAnnotations());
        on9<fu7, af0> on9Var = this.d;
        on9Var.getClass();
        xrf xrfVar = new xrf(y92VarG0, on9Var);
        n8a n8aVar = ju7.a;
        return new cc5.a(new cc5(v6e.M(ut0.e0(new r6e[]{xrfVar, new w6e(ju7.a(ere.a.m, ku7Var, this.a))}), new lt(11)), false, new tb(13)));
    }

    @Override // defpackage.lf0
    public final af0 p(mq5 mq5Var) {
        af0 af0VarInvoke;
        mq5Var.getClass();
        ku7 ku7Var = this.b;
        fu7 fu7VarP = ku7Var.p(mq5Var);
        if (fu7VarP != null && (af0VarInvoke = this.d.invoke(fu7VarP)) != null) {
            return af0VarInvoke;
        }
        n8a n8aVar = ju7.a;
        return ju7.a(mq5Var, ku7Var, this.a);
    }
}
