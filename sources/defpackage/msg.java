package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class msg extends lsg {
    @Override // defpackage.ksg
    public final float U(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.ksg
    public final void V(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.ksg
    public final void W(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.ksg
    public final void X(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.ksg
    public final void Y(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // defpackage.lsg
    public final void Z(View view, int i) {
        view.setTransitionVisibility(i);
    }
}
