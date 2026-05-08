package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public interface im8 {
    static float a(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        return 0.0f;
    }

    static m6h b(float f, float f2) {
        return f == f2 ? m6h.EXACTLY : Float.isInfinite(f2) ? m6h.UNDEFINED : m6h.AT_MOST;
    }

    static float c(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 0) {
            return Float.POSITIVE_INFINITY;
        }
        return size;
    }

    static float d(float f, float f2) {
        if (f != f2 && Float.isInfinite(f2)) {
            return Float.POSITIVE_INFINITY;
        }
        return nn2.G(f2);
    }
}
