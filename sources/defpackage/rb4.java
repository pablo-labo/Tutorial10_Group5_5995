package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class rb4 implements Drawable.Callback {
    public final /* synthetic */ sb4 a;

    public rb4(sb4 sb4Var) {
        this.a = sb4Var;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        drawable.getClass();
        sb4 sb4Var = this.a;
        ((gme) sb4Var.V).setValue(Integer.valueOf(((Number) ((gme) sb4Var.V).getValue()).intValue() + 1));
        Drawable drawable2 = sb4Var.f;
        Lazy lazy = tb4.a;
        ((gme) sb4Var.W).setValue(new kie((drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) ? 9205357640488583168L : oie.e(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight())));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        drawable.getClass();
        runnable.getClass();
        ((Handler) tb4.a.getValue()).postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        drawable.getClass();
        runnable.getClass();
        ((Handler) tb4.a.getValue()).removeCallbacks(runnable);
    }
}
