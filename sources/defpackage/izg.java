package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
public final class izg {

    public static class a {
        public static void a(Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            window.setDecorFitsSystemWindows(z);
        }
    }

    public static class b {
        public static void a(Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    public static void a(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            b.a(window, z);
        } else {
            if (i >= 30) {
                a.a(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }
}
