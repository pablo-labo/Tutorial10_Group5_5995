package defpackage;

import android.graphics.PathMeasure;

/* JADX INFO: loaded from: classes.dex */
public final class o80 implements h6b {
    public final PathMeasure a;

    public o80(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    @Override // defpackage.h6b
    public final boolean a(float f, float f2, v5b v5bVar) {
        if (v5bVar instanceof m80) {
            return this.a.getSegment(f, f2, ((m80) v5bVar).a, true);
        }
        b0.u("Unable to obtain android.graphics.Path");
        return false;
    }

    @Override // defpackage.h6b
    public final void b(m80 m80Var) {
        this.a.setPath(m80Var != null ? m80Var.a : null, false);
    }

    @Override // defpackage.h6b
    public final float getLength() {
        return this.a.getLength();
    }
}
