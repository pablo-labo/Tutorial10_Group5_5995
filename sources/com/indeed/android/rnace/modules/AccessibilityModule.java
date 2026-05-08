package com.indeed.android.rnace.modules;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseAccessibilityModule;
import com.indeed.android.rnace.modules.AccessibilityModule;
import defpackage.dmc;
import defpackage.nmc;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = IndeedRNBridgeBaseAccessibilityModule.MODULE_NAME)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/indeed/android/rnace/modules/AccessibilityModule;", "Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseAccessibilityModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "reactTag", "Lj6g;", "requestFocus", "(D)V", "rnace_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccessibilityModule extends IndeedRNBridgeBaseAccessibilityModule {
    public static final int $stable = IndeedRNBridgeBaseAccessibilityModule.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibilityModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestFocus$lambda$0(AccessibilityModule accessibilityModule, int i) {
        View viewFocusSearch;
        try {
            ReactApplicationContext reactApplicationContext = accessibilityModule.getReactApplicationContext();
            reactApplicationContext.getClass();
            UIManager uIManagerJ = dmc.j(reactApplicationContext, 2, true);
            if (uIManagerJ == null) {
                ReactApplicationContext reactApplicationContext2 = accessibilityModule.getReactApplicationContext();
                reactApplicationContext2.getClass();
                uIManagerJ = dmc.j(reactApplicationContext2, 1, true);
            }
            if (uIManagerJ == null) {
                Log.e(IndeedRNBridgeBaseAccessibilityModule.MODULE_NAME, "UIManager is null, cannot request focus");
                return;
            }
            View viewResolveView = uIManagerJ.resolveView(i);
            if (viewResolveView == null) {
                viewResolveView = null;
            }
            if (viewResolveView == null) {
                Log.e(IndeedRNBridgeBaseAccessibilityModule.MODULE_NAME, "View not found for reactTag: " + i);
            } else {
                if (!viewResolveView.isFocusable()) {
                    viewResolveView.setFocusable(true);
                }
                if (viewResolveView.requestFocus() || (viewFocusSearch = viewResolveView.focusSearch(2)) == null) {
                    return;
                }
                viewFocusSearch.requestFocus();
            }
        } catch (Exception e) {
            Log.e(IndeedRNBridgeBaseAccessibilityModule.MODULE_NAME, "Failed to request focus for reactTag " + i, e);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseAccessibilityModule
    @ReactMethod
    @SuppressLint({"WrongConstant"})
    public void requestFocus(double reactTag) {
        final int i = (int) reactTag;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: i6
            @Override // java.lang.Runnable
            public final void run() {
                AccessibilityModule.requestFocus$lambda$0(this.a, i);
            }
        });
    }
}
