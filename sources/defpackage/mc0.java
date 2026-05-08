package defpackage;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mc0 implements tc0<PointF, PointF> {
    public final dc0 b;
    public final dc0 c;

    public mc0(dc0 dc0Var, dc0 dc0Var2) {
        this.b = dc0Var;
        this.c = dc0Var2;
    }

    @Override // defpackage.tc0
    public final boolean b() {
        return this.b.b() && this.c.b();
    }

    @Override // defpackage.tc0
    public final z91<PointF, PointF> t() {
        return new ppe(this.b.t(), this.c.t());
    }

    @Override // defpackage.tc0
    public final List<lh8<PointF>> x() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
