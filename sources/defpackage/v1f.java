package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class v1f {
    public final iy3 a;
    public final q30<w1f> b;

    public static final class a extends mj8 implements gu5<Float> {
        public a() {
            super(0);
        }

        @Override // defpackage.gu5
        public final Float invoke() {
            return Float.valueOf(v1f.this.a.t1(125.0f));
        }
    }

    public v1f(w1f w1fVar, iy3 iy3Var, Function1<? super w1f, Boolean> function1, Function1<? super Float, Float> function12) {
        this.a = iy3Var;
        this.b = new q30<>(w1fVar, function12, new a(), a30.a, function1);
    }

    public final Object a(c1f c1fVar) {
        Object objB = this.b.b(w1f.c, n4a.a, new h30(4, null), c1fVar);
        g13 g13Var = g13.a;
        if (objB != g13Var) {
            objB = j6g.a;
        }
        return objB == g13Var ? objB : j6g.a;
    }
}
