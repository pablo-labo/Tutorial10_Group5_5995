package defpackage;

import com.facebook.react.views.switchview.ReactSwitchManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s89 implements Provider {
    public final /* synthetic */ int a;

    public /* synthetic */ s89(int i) {
        this.a = i;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.a) {
            case 0:
                return new ReactSwitchManager();
            default:
                return new RNGestureHandlerButtonViewManager();
        }
    }
}
