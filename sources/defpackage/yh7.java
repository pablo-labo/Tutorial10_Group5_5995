package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class yh7 extends mh8<Integer> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.z91
    public final Object f(lh8 lh8Var, float f) {
        int i;
        T t = lh8Var.b;
        if (t == 0) {
            r6.g("Missing values for keyframe.");
            return null;
        }
        T t2 = lh8Var.c;
        if (t2 == 0) {
            if (lh8Var.k == 784923401) {
                lh8Var.k = ((Integer) t).intValue();
            }
            i = lh8Var.k;
        } else {
            if (lh8Var.l == 784923401) {
                lh8Var.l = ((Integer) t2).intValue();
            }
            i = lh8Var.l;
        }
        if (lh8Var.k == 784923401) {
            lh8Var.k = ((Integer) t).intValue();
        }
        int i2 = lh8Var.k;
        PointF pointF = du9.a;
        return Integer.valueOf((int) ((f * (i - i2)) + i2));
    }
}
