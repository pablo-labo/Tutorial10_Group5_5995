package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes3.dex */
public final class grd extends Animation {
    public final rqd a;

    public grd(rqd rqdVar) {
        rqdVar.getClass();
        this.a = rqdVar;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        transformation.getClass();
        super.applyTransformation(f, transformation);
        this.a.F(f, !r0.isResumed());
    }
}
