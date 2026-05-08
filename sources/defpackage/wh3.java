package defpackage;

import android.view.WindowManager;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes2.dex */
public final class wh3 {
    public final ReactContext a;
    public final WindowManager b;
    public lq5 c;

    public wh3(ReactContext reactContext) {
        reactContext.getClass();
        this.a = reactContext;
        Object systemService = reactContext.getSystemService("window");
        systemService.getClass();
        this.b = (WindowManager) systemService;
    }
}
