package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class xu1 implements wu1 {
    public final Matrix a = new Matrix();
    public final int[] b = new int[2];

    @Override // defpackage.wu1
    public void e(View view, float[] fArr) {
        Matrix matrix = this.a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.b;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        pg8.M(matrix, fArr);
    }
}
