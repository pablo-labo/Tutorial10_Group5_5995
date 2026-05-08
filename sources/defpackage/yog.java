package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class yog {
    public static void a(View view, float f) {
        int i = (int) (0.5f + f);
        if (i == 0) {
            i = f == 0.0f ? 0 : f > 0.0f ? 1 : -1;
        }
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }
}
