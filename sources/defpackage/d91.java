package defpackage;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d91 {
    public final ReactContext a;
    public final int b;
    public final EventDispatcher c;

    public d91(ReactContext reactContext, int i) {
        reactContext.getClass();
        this.a = reactContext;
        this.b = i;
        EventDispatcher eventDispatcherE = dmc.e(reactContext, i);
        if (eventDispatcherE != null) {
            this.c = eventDispatcherE;
        } else {
            akb.n(p6.c(i, "[RNScreens] Nullish event dispatcher for view with tag: "));
            throw null;
        }
    }
}
