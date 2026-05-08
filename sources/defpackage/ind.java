package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public final class ind extends h91 {
    public static final ind b = new ind(10);

    @Override // defpackage.h91
    public final String toString() {
        return "fit_xy";
    }

    @Override // defpackage.h91
    public final void x(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float f5 = rect.left;
        float f6 = rect.top;
        matrix.setScale(f3, f4);
        matrix.postTranslate((int) (f5 + 0.5f), (int) (f6 + 0.5f));
    }
}
