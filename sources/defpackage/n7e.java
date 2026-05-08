package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class n7e extends v1 {
    public final bs4 b;
    public final bs4 c;
    public final bs4 d;
    public final bs4 e;
    public final bs4 f;

    public n7e() {
        bs4 bs4Var = bs4.a;
        this.b = bs4Var;
        this.c = bs4Var;
        this.d = bs4Var;
        this.e = bs4Var;
        this.f = bs4Var;
    }

    @Override // defpackage.v1
    public final void R(qb8 qb8Var) {
        this.b.getClass();
        this.c.getClass();
        this.d.getClass();
        this.f.getClass();
    }

    @Override // defpackage.v1
    public final <T> KSerializer<T> X(yd8<T> yd8Var, List<? extends KSerializer<?>> list) {
        yd8Var.getClass();
        list.getClass();
        this.b.getClass();
        return null;
    }

    @Override // defpackage.v1
    public final boolean Y() {
        return false;
    }

    @Override // defpackage.v1
    public final <T> i04<T> a0(yd8<? super T> yd8Var, String str) {
        yd8Var.getClass();
        this.e.getClass();
        this.f.getClass();
        pxf.e(1, null);
        return null;
    }

    @Override // defpackage.v1
    public final <T> r7e<T> b0(yd8<? super T> yd8Var, T t) {
        yd8Var.getClass();
        t.getClass();
        if (!yd8Var.n(t)) {
            return null;
        }
        this.c.getClass();
        this.d.getClass();
        pxf.e(1, null);
        return null;
    }
}
