package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class eg9 {
    public static final void a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 0 || mode2 == 0) {
            r6.g("A catalyst view must have an explicit width and height given to it. This should normally happen as part of the standard catalyst UI framework.");
        }
    }
}
