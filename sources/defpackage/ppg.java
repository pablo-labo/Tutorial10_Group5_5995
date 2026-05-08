package defpackage;

import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class ppg {
    public static void a(View view) {
        view.resetPivot();
    }

    public static void b(View view, int i) {
        view.setOutlineAmbientShadowColor(i);
    }

    public static void c(View view, int i) {
        view.setOutlineSpotShadowColor(i);
    }

    public static boolean d(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
