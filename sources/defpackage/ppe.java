package defpackage;

import android.graphics.PointF;
import defpackage.z91;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class ppe extends z91<PointF, PointF> {
    public final PointF h;
    public final PointF i;
    public final di5 j;
    public final di5 k;

    public ppe(di5 di5Var, di5 di5Var2) {
        super(Collections.EMPTY_LIST);
        this.h = new PointF();
        this.i = new PointF();
        this.j = di5Var;
        this.k = di5Var2;
        h(this.d);
    }

    @Override // defpackage.z91
    public final PointF e() {
        return j();
    }

    @Override // defpackage.z91
    public final /* bridge */ /* synthetic */ PointF f(lh8<PointF> lh8Var, float f) {
        return j();
    }

    @Override // defpackage.z91
    public final void h(float f) {
        di5 di5Var = this.j;
        di5Var.h(f);
        di5 di5Var2 = this.k;
        di5Var2.h(f);
        this.h.set(di5Var.e().floatValue(), di5Var2.e().floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((z91.a) arrayList.get(i)).a();
            i++;
        }
    }

    public final PointF j() {
        PointF pointF = this.h;
        float f = pointF.x;
        PointF pointF2 = this.i;
        pointF2.set(f, 0.0f);
        pointF2.set(pointF2.x, pointF.y);
        return pointF2;
    }
}
