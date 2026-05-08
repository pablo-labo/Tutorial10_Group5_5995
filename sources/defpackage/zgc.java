package defpackage;

import android.util.Log;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.swmansion.rnscreens.ModalScreenViewManager;
import com.swmansion.rnscreens.ScreenContainerViewManager;
import com.swmansion.rnscreens.ScreenContentWrapperManager;
import com.swmansion.rnscreens.ScreenFooterManager;
import com.swmansion.rnscreens.ScreenStackHeaderConfigViewManager;
import com.swmansion.rnscreens.ScreenStackHeaderSubviewManager;
import com.swmansion.rnscreens.ScreenStackViewManager;
import com.swmansion.rnscreens.ScreenViewManager;
import com.swmansion.rnscreens.ScreensModule;
import com.swmansion.rnscreens.SearchBarManager;
import com.swmansion.rnscreens.gamma.tabs.TabScreenViewManager;
import com.swmansion.rnscreens.gamma.tabs.TabsHostViewManager;
import com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zgc extends qa1 {
    @Override // defpackage.qa1, defpackage.inc
    public final List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactApplicationContext) {
        reactApplicationContext.getClass();
        ScreenDummyLayoutHelper screenDummyLayoutHelper = new ScreenDummyLayoutHelper();
        screenDummyLayoutHelper.V = it1.c;
        screenDummyLayoutHelper.W = new WeakReference<>(reactApplicationContext);
        try {
            System.loadLibrary("react_codegen_rnscreens");
        } catch (UnsatisfiedLinkError unused) {
            Log.w("ScreenDummyLayoutHelper", "[RNScreens] Failed to load react_codegen_rnscreens library.");
        }
        ScreenDummyLayoutHelper.Z = new WeakReference<>(screenDummyLayoutHelper);
        if (!reactApplicationContext.hasCurrentActivity() || !screenDummyLayoutHelper.b(reactApplicationContext)) {
            reactApplicationContext.addLifecycleEventListener(screenDummyLayoutHelper);
        }
        LifecycleEventListener lifecycleEventListener = nf7.a;
        if (nf7.e) {
            Log.w("[RNScreens]", "InsetObserverProxy registers on new context while it has not been invalidated on the old one. Please report this as issue at https://github.com/software-mansion/react-native-screens/issues");
        }
        nf7.e = true;
        reactApplicationContext.addLifecycleEventListener(lifecycleEventListener);
        return u63.a0(new ScreenContainerViewManager(), new ScreenViewManager(), new ModalScreenViewManager(), new ScreenStackViewManager(), new ScreenStackHeaderConfigViewManager(), new ScreenStackHeaderSubviewManager(), new SearchBarManager(), new ScreenFooterManager(), new ScreenContentWrapperManager(), new TabsHostViewManager(), new TabScreenViewManager());
    }

    @Override // defpackage.qa1
    public final NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.getClass();
        reactApplicationContext.getClass();
        if (str.equals("RNSModule")) {
            return new ScreensModule(reactApplicationContext);
        }
        return null;
    }

    @Override // defpackage.qa1
    public final omc getReactModuleInfoProvider() {
        return new gcc(1);
    }
}
