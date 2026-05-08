package defpackage;

import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootViewManager;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r89 implements Provider {
    public final /* synthetic */ int a;

    public /* synthetic */ r89(int i) {
        this.a = i;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.a) {
            case 0:
                return new ReactScrollViewManager(null, 1, null);
            default:
                return new RNGestureHandlerRootViewManager();
        }
    }
}
