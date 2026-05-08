package defpackage;

import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final class gg0 {
    public static float a(BackEvent backEvent) {
        return backEvent.getProgress();
    }

    public static int b(BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }

    public static float c(BackEvent backEvent) {
        return backEvent.getTouchX();
    }

    public static float d(BackEvent backEvent) {
        return backEvent.getTouchY();
    }
}
