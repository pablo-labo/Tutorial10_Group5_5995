package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b74 {
    public final DisplayCutout a;

    public static class a {
        public static List<Rect> a(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        public static int b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public static class b {
        public static Insets a(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    public b74(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final kf7 a() {
        return Build.VERSION.SDK_INT >= 30 ? kf7.c(b.a(this.a)) : kf7.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b74.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((b74) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
