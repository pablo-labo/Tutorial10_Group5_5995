package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.l5;

/* JADX INFO: loaded from: classes.dex */
public class o extends RecyclerView.w {

    @SuppressLint({"UnknownNullness"})
    public PointF k;
    public final DisplayMetrics l;
    public float n;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator();
    public boolean m = false;
    public int o = 0;
    public int p = 0;

    @SuppressLint({"UnknownNullness"})
    public o(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    public static int e(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            l5.q("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            return 0;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    @Override // androidx.recyclerview.widget.RecyclerView.w
    @android.annotation.SuppressLint({"UnknownNullness"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(android.view.View r11, androidx.recyclerview.widget.RecyclerView.w.a r12) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.o.c(android.view.View, androidx.recyclerview.widget.RecyclerView$w$a):void");
    }

    @SuppressLint({"UnknownNullness"})
    public float f(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int g(int i) {
        float fAbs = Math.abs(i);
        if (!this.m) {
            this.n = f(this.l);
            this.m = true;
        }
        return (int) Math.ceil(fAbs * this.n);
    }
}
