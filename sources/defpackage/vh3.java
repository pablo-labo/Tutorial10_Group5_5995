package defpackage;

import android.provider.Settings;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vh3 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ wh3 b;

    public /* synthetic */ vh3(boolean z, wh3 wh3Var) {
        this.a = z;
        this.b = wh3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lq5 lq5Var;
        wh3 wh3Var = this.b;
        WindowManager windowManager = wh3Var.b;
        boolean z = this.a;
        if (z) {
            lq5 lq5Var2 = wh3Var.c;
            ReactContext reactContext = wh3Var.a;
            if (lq5Var2 == null) {
                if (!Settings.canDrawOverlays(reactContext)) {
                    s55.b("ReactNative", "Wait for overlay permission to be set");
                    return;
                } else {
                    wh3Var.c = new lq5(reactContext);
                    windowManager.addView(wh3Var.c, new WindowManager.LayoutParams(-1, -1, 2038, 24, -3));
                    return;
                }
            }
        }
        if (z || (lq5Var = wh3Var.c) == null) {
            return;
        }
        lq5Var.removeAllViews();
        windowManager.removeView(wh3Var.c);
        wh3Var.c = null;
    }
}
