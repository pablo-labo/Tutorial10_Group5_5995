package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ia2 extends mh8<Integer> {
    @Override // defpackage.z91
    public final Object f(lh8 lh8Var, float f) {
        return Integer.valueOf(j(lh8Var, f));
    }

    public final int j(lh8<Integer> lh8Var, float f) {
        Integer num = lh8Var.b;
        Integer num2 = lh8Var.b;
        if (num == null || lh8Var.c == null) {
            r6.g("Missing values for keyframe.");
            return 0;
        }
        return hh1.v(num2.intValue(), du9.b(f, 0.0f, 1.0f), lh8Var.c.intValue());
    }
}
