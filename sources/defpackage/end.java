package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public final class end extends h91 {
    public static final end b = new end(10);

    @Override // defpackage.h91
    public final String toString() {
        return "center";
    }

    @Override // defpackage.h91
    public final void x(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        matrix.setTranslate((int) (((rect.width() - i) * 0.5f) + rect.left + 0.5f), (int) (((rect.height() - i2) * 0.5f) + rect.top + 0.5f));
    }
}
