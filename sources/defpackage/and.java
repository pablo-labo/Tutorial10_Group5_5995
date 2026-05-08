package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public final class and extends h91 {
    public static final and b = new and(10);

    @Override // defpackage.h91
    public final String toString() {
        return "start_inside";
    }

    @Override // defpackage.h91
    public final void x(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        matrix.getClass();
        rect.getClass();
        float fMin = Math.min(f3, f4);
        if (fMin > 1.0f) {
            fMin = 1.0f;
        }
        float f5 = rect.left;
        float f6 = rect.top;
        matrix.setScale(fMin, fMin);
        matrix.postTranslate(Math.round(f5), Math.round(f6));
    }
}
