package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public final class fnd extends h91 {
    public static final fnd b = new fnd(10);

    @Override // defpackage.h91
    public final String toString() {
        return "center_crop";
    }

    @Override // defpackage.h91
    public final void x(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float fWidth;
        float f5;
        if (f4 > f3) {
            fWidth = ((rect.width() - (i * f4)) * 0.5f) + rect.left;
            f5 = rect.top;
            f3 = f4;
        } else {
            float f6 = rect.left;
            float fHeight = ((rect.height() - (i2 * f3)) * 0.5f) + rect.top;
            fWidth = f6;
            f5 = fHeight;
        }
        matrix.setScale(f3, f3);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (f5 + 0.5f));
    }
}
