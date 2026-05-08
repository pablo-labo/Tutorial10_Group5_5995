package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f6b extends mh8<PointF> {
    public final PointF h;
    public final float[] i;
    public final float[] j;
    public final PathMeasure k;
    public e6b l;

    public f6b(ArrayList arrayList) {
        super(arrayList);
        this.h = new PointF();
        this.i = new float[2];
        this.j = new float[2];
        this.k = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.z91
    public final Object f(lh8 lh8Var, float f) {
        e6b e6bVar = (e6b) lh8Var;
        Path path = e6bVar.q;
        if (path == null) {
            return (PointF) lh8Var.b;
        }
        e6b e6bVar2 = this.l;
        PathMeasure pathMeasure = this.k;
        if (e6bVar2 != e6bVar) {
            pathMeasure.setPath(path, false);
            this.l = e6bVar;
        }
        float length = pathMeasure.getLength();
        float f2 = f * length;
        float[] fArr = this.i;
        float[] fArr2 = this.j;
        pathMeasure.getPosTan(f2, fArr, fArr2);
        float f3 = fArr[0];
        float f4 = fArr[1];
        PointF pointF = this.h;
        pointF.set(f3, f4);
        if (f2 < 0.0f) {
            pointF.offset(fArr2[0] * f2, fArr2[1] * f2);
            return pointF;
        }
        if (f2 > length) {
            float f5 = f2 - length;
            pointF.offset(fArr2[0] * f5, fArr2[1] * f5);
        }
        return pointF;
    }
}
