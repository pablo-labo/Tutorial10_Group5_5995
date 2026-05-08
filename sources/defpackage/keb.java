package defpackage;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class keb extends mh8<PointF> {
    public final PointF h;

    public keb(List<lh8<PointF>> list) {
        super(list);
        this.h = new PointF();
    }

    @Override // defpackage.z91
    public final Object f(lh8 lh8Var, float f) {
        return g(lh8Var, f, f, f);
    }

    @Override // defpackage.z91
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final PointF g(lh8<PointF> lh8Var, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2 = lh8Var.b;
        if (pointF2 == null || (pointF = lh8Var.c) == null) {
            r6.g("Missing values for keyframe.");
            return null;
        }
        PointF pointF3 = pointF2;
        PointF pointF4 = pointF;
        float f4 = pointF3.x;
        float fB = k6.b(pointF4.x, f4, f2, f4);
        float f5 = pointF3.y;
        float fB2 = k6.b(pointF4.y, f5, f3, f5);
        PointF pointF5 = this.h;
        pointF5.set(fB, fB2);
        return pointF5;
    }
}
