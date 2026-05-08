package defpackage;

import com.facebook.react.bridge.ReactApplicationContext;
import com.indeed.android.rnexample.RNExampleModule;
import com.rivereactnative.RiveReactNativeModule;
import com.rivereactnative.RiveReactNativeRendererModule;
import com.rivereactnative.RiveReactNativeViewManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rcc implements inc {
    public final /* synthetic */ int a;

    public /* synthetic */ rcc(int i) {
        this.a = i;
    }

    @Override // defpackage.inc
    public final List createNativeModules(ReactApplicationContext reactApplicationContext) {
        int i = this.a;
        reactApplicationContext.getClass();
        switch (i) {
            case 0:
                return new ArrayList(u63.Z(new RNExampleModule(reactApplicationContext)));
            default:
                return new ArrayList(u63.a0(new RiveReactNativeRendererModule(reactApplicationContext), new RiveReactNativeModule(reactApplicationContext)));
        }
    }

    @Override // defpackage.inc
    public final List createViewManagers(ReactApplicationContext reactApplicationContext) {
        switch (this.a) {
            case 0:
                return new ArrayList();
            default:
                return u63.Z(new RiveReactNativeViewManager());
        }
    }
}
