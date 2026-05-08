package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class z50 {
    public static final z50 a = new z50();

    public final void a(View view) {
        view.clearViewTranslationCallback();
    }

    public final void b(View view) {
        view.setViewTranslationCallback(y50.a);
    }
}
