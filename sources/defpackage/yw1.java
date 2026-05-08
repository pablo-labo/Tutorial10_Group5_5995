package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class yw1 {
    public static boolean a(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.quickReject(f, f2, f3, f4);
    }

    public static boolean b(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    public static boolean c(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }
}
