package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class di5 extends mh8<Float> {
    public di5() {
        throw null;
    }

    @Override // defpackage.z91
    public final Object f(lh8 lh8Var, float f) {
        return Float.valueOf(k(lh8Var, f));
    }

    public final float j() {
        return k(this.c.b(), c());
    }

    public final float k(lh8<Float> lh8Var, float f) {
        Float f2 = lh8Var.b;
        Float f3 = lh8Var.b;
        if (f2 == null || lh8Var.c == null) {
            r6.g("Missing values for keyframe.");
            return 0.0f;
        }
        if (lh8Var.i == -3987645.8f) {
            lh8Var.i = f3.floatValue();
        }
        float f4 = lh8Var.i;
        if (lh8Var.j == -3987645.8f) {
            lh8Var.j = lh8Var.c.floatValue();
        }
        return du9.e(f4, lh8Var.j, f);
    }
}
