package defpackage;

import defpackage.ex9;
import defpackage.fx9;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class ml6 implements fx9<p96, InputStream> {
    public static final fva<Integer> b = fva.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");
    public final ex9<p96, p96> a;

    public static class a implements gx9<p96, InputStream> {
        public final ex9<p96, p96> a = new ex9<>();

        @Override // defpackage.gx9
        public final fx9<p96, InputStream> c(n1a n1aVar) {
            return new ml6(this.a);
        }
    }

    public ml6(ex9<p96, p96> ex9Var) {
        this.a = ex9Var;
    }

    @Override // defpackage.fx9
    public final fx9.a<InputStream> a(p96 p96Var, int i, int i2, ova ovaVar) {
        p96 p96Var2 = p96Var;
        ex9<p96, p96> ex9Var = this.a;
        if (ex9Var != null) {
            dx9 dx9Var = ex9Var.a;
            ex9.a aVarA = ex9.a.a(p96Var2);
            Object objA = dx9Var.a(aVarA);
            ArrayDeque arrayDeque = ex9.a.b;
            synchronized (arrayDeque) {
                arrayDeque.offer(aVarA);
            }
            p96 p96Var3 = (p96) objA;
            if (p96Var3 == null) {
                dx9Var.d(ex9.a.a(p96Var2), p96Var2);
            } else {
                p96Var2 = p96Var3;
            }
        }
        return new fx9.a<>(p96Var2, new lm6(p96Var2, ((Integer) ovaVar.c(b)).intValue()));
    }

    @Override // defpackage.fx9
    public final /* bridge */ /* synthetic */ boolean b(p96 p96Var) {
        return true;
    }
}
