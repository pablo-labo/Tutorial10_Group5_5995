package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public final class hnd extends h91 {
    public static final hnd b = new hnd(10);

    @Override // defpackage.h91
    public final String toString() {
        return "fit_center";
    }

    @Override // defpackage.h91
    public final void x(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float fMin = Math.min(f3, f4);
        float fWidth = ((rect.width() - (i * fMin)) * 0.5f) + rect.left;
        float fHeight = ((rect.height() - (i2 * fMin)) * 0.5f) + rect.top;
        matrix.setScale(fMin, fMin);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
    }
}
