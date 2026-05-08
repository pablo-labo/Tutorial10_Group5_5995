package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class ycb {
    public static final Typeface a(Typeface typeface, so5 so5Var, Context context) {
        ThreadLocal<Paint> threadLocal = xyf.a;
        if (typeface == null) {
            return null;
        }
        if (so5Var.a.isEmpty()) {
            return typeface;
        }
        ThreadLocal<Paint> threadLocal2 = xyf.a;
        Paint paint = threadLocal2.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal2.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(qbb.a(so5Var, context));
        return paint.getTypeface();
    }
}
