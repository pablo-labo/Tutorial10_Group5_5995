package defpackage;

import android.view.View;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.indeed.android.rnace.RNAceModule;
import com.indeed.android.rnace.modules.AccessibilityModule;
import com.indeed.android.rnace.views.BlockDescendantFocusViewManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bbc implements inc {
    @Override // defpackage.inc
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        reactApplicationContext.getClass();
        return new ArrayList(u63.a0(new RNAceModule(reactApplicationContext), new AccessibilityModule(reactApplicationContext)));
    }

    @Override // defpackage.inc
    public final List<ViewManager<View, koc<?>>> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return u63.d0(new BlockDescendantFocusViewManager());
    }
}
