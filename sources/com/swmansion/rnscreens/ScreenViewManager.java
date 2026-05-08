package com.swmansion.rnscreens;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.swmansion.rnscreens.a;
import defpackage.afc;
import defpackage.ece;
import defpackage.hgd;
import defpackage.ie7;
import defpackage.k0;
import defpackage.ka2;
import defpackage.lc9;
import defpackage.m6;
import defpackage.mkf;
import defpackage.nf4;
import defpackage.nh7;
import defpackage.nmc;
import defpackage.nn2;
import defpackage.noc;
import defpackage.ojh;
import defpackage.pqd;
import defpackage.r6;
import defpackage.snc;
import defpackage.sqg;
import defpackage.sy3;
import defpackage.vse;
import defpackage.ze9;
import defpackage.zec;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = ScreenViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 d2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001eB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b%\u0010&J\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0011\u0010\u001bJ!\u0010(\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b(\u0010)J!\u0010+\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b+\u0010)J\u001f\u0010.\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,H\u0017¢\u0006\u0004\b.\u0010/J!\u00100\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b0\u0010)J!\u00102\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b2\u0010)J!\u00104\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b4\u0010)J!\u00106\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00105\u001a\u0004\u0018\u00010\u0016H\u0017¢\u0006\u0004\b6\u00107J!\u00109\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00108\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b9\u0010)J\u001f\u0010;\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010:\u001a\u00020,H\u0017¢\u0006\u0004\b;\u0010/J\u001f\u0010=\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010<\u001a\u00020,H\u0017¢\u0006\u0004\b=\u0010/J!\u0010?\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010>\u001a\u0004\u0018\u00010\u0016H\u0017¢\u0006\u0004\b?\u00107J\u001f\u0010A\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010@\u001a\u00020,H\u0017¢\u0006\u0004\bA\u0010/J\u001f\u0010C\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010B\u001a\u00020,H\u0017¢\u0006\u0004\bC\u0010/J\u001f\u0010E\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010D\u001a\u00020,H\u0017¢\u0006\u0004\bE\u0010/J!\u0010G\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020\u0016H\u0017¢\u0006\u0004\bG\u0010\u001bJ!\u0010H\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bH\u0010/J!\u0010I\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bI\u0010/J!\u0010J\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020\u0016H\u0016¢\u0006\u0004\bJ\u0010\u001bJ!\u0010K\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bK\u0010/J!\u0010L\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bL\u0010/J#\u0010N\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010F\u001a\u0004\u0018\u00010MH\u0016¢\u0006\u0004\bN\u0010OJ!\u0010P\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bP\u0010/J!\u0010Q\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bQ\u0010/J#\u0010R\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010F\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bR\u0010)J!\u0010T\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010F\u001a\u0004\u0018\u00010SH\u0017¢\u0006\u0004\bT\u0010UJ\u001f\u0010V\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u0016H\u0017¢\u0006\u0004\bV\u0010\u001bJ\u001f\u0010W\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020,H\u0017¢\u0006\u0004\bW\u0010/J\u001f\u0010X\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u000eH\u0017¢\u0006\u0004\bX\u0010\u0012J\u001f\u0010Y\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020,H\u0017¢\u0006\u0004\bY\u0010/J\u001f\u0010Z\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u0016H\u0017¢\u0006\u0004\bZ\u0010\u001bJ!\u0010[\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010F\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b[\u0010)J\u001b\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"0\\H\u0016¢\u0006\u0004\b]\u0010^J\u0015\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00020_H\u0014¢\u0006\u0004\b`\u0010aR\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010c¨\u0006f"}, d2 = {"Lcom/swmansion/rnscreens/ScreenViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/a;", "Lafc;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lmkf;", "reactContext", "createViewInstance", "(Lmkf;)Lcom/swmansion/rnscreens/a;", "view", "", "activityState", "Lj6g;", "setActivityState", "(Lcom/swmansion/rnscreens/a;F)V", "parent", "Landroid/view/View;", "child", "", "index", "addView", "(Lcom/swmansion/rnscreens/a;Landroid/view/View;I)V", "removeViewAt", "(Lcom/swmansion/rnscreens/a;I)V", "removeView", "(Lcom/swmansion/rnscreens/a;Landroid/view/View;)V", "Lnoc;", "props", "Lvse;", "stateWrapper", "", "updateState", "(Lcom/swmansion/rnscreens/a;Lnoc;Lvse;)Ljava/lang/Object;", "onAfterUpdateTransaction", "(Lcom/swmansion/rnscreens/a;)V", "presentation", "setStackPresentation", "(Lcom/swmansion/rnscreens/a;Ljava/lang/String;)V", "animation", "setStackAnimation", "", "gestureEnabled", "setGestureEnabled", "(Lcom/swmansion/rnscreens/a;Z)V", "setReplaceAnimation", "screenOrientation", "setScreenOrientation", "statusBarAnimation", "setStatusBarAnimation", "statusBarColor", "setStatusBarColor", "(Lcom/swmansion/rnscreens/a;Ljava/lang/Integer;)V", "statusBarStyle", "setStatusBarStyle", "statusBarTranslucent", "setStatusBarTranslucent", "statusBarHidden", "setStatusBarHidden", "navigationBarColor", "setNavigationBarColor", "navigationBarTranslucent", "setNavigationBarTranslucent", "navigationBarHidden", "setNavigationBarHidden", "nativeBackButtonDismissalEnabled", "setNativeBackButtonDismissalEnabled", "value", "setSheetElevation", "setFullScreenSwipeEnabled", "setFullScreenSwipeShadowEnabled", "setTransitionDuration", "setHideKeyboardOnSwipe", "setCustomAnimationOnSwipe", "Lcom/facebook/react/bridge/ReadableMap;", "setGestureResponseDistance", "(Lcom/swmansion/rnscreens/a;Lcom/facebook/react/bridge/ReadableMap;)V", "setHomeIndicatorHidden", "setPreventNativeDismiss", "setSwipeDirection", "Lcom/facebook/react/bridge/ReadableArray;", "setSheetAllowedDetents", "(Lcom/swmansion/rnscreens/a;Lcom/facebook/react/bridge/ReadableArray;)V", "setSheetLargestUndimmedDetent", "setSheetGrabberVisible", "setSheetCornerRadius", "setSheetExpandsWhenScrolledToEdge", "setSheetInitialDetent", "setScreenId", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "Lsqg;", "getDelegate", "()Lsqg;", "delegate", "Lsqg;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ScreenViewManager extends ViewGroupManager<a> implements afc<a> {
    public static final String REACT_CLASS = "RNSScreen";
    private final sqg<a> delegate;

    public ScreenViewManager() {
        super(null, 1, null);
        this.delegate = new zec(this, 0);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(a parent, View child, int index) {
        parent.getClass();
        child.getClass();
        if (child instanceof c) {
            ((c) child).setDelegate$react_native_screens_release(parent);
        } else if (child instanceof pqd) {
            parent.setFooter((pqd) child);
        }
        super.addView(parent, child, index);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(mkf reactContext) {
        reactContext.getClass();
        return new a(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public sqg<a> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return lc9.b0(new Pair("topDismissed", lc9.Z(new Pair("registrationName", "onDismissed"))), new Pair("topWillAppear", lc9.Z(new Pair("registrationName", "onWillAppear"))), new Pair("topAppear", lc9.Z(new Pair("registrationName", "onAppear"))), new Pair("topWillDisappear", lc9.Z(new Pair("registrationName", "onWillDisappear"))), new Pair("topDisappear", lc9.Z(new Pair("registrationName", "onDisappear"))), new Pair("topHeaderHeightChange", lc9.Z(new Pair("registrationName", "onHeaderHeightChange"))), new Pair("topHeaderBackButtonClicked", lc9.Z(new Pair("registrationName", "onHeaderBackButtonClicked"))), new Pair("topTransitionProgress", lc9.Z(new Pair("registrationName", "onTransitionProgress"))), new Pair("topSheetDetentChanged", lc9.Z(new Pair("registrationName", "onSheetDetentChanged"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(a view) {
        view.getClass();
        super.onAfterUpdateTransaction(view);
        if (view.i0) {
            view.i0 = false;
            if (view.b0 != a.d.d || view.getBackground() == null) {
                return;
            }
            Drawable background = view.getBackground();
            ze9 ze9Var = background instanceof ze9 ? (ze9) background : null;
            if (ze9Var != null) {
                float fC = nn2.C(view.j0);
                new hgd();
                new hgd();
                hgd hgdVar = new hgd();
                hgd hgdVar2 = new hgd();
                k0 k0Var = new k0(0.0f);
                k0 k0Var2 = new k0(0.0f);
                nf4 nf4Var = new nf4();
                nf4 nf4Var2 = new nf4();
                nf4 nf4Var3 = new nf4();
                nf4 nf4Var4 = new nf4();
                ie7 ie7VarU = ka2.u(0);
                k0 k0Var3 = new k0(fC);
                ie7 ie7VarU2 = ka2.u(0);
                k0 k0Var4 = new k0(fC);
                ece eceVar = new ece();
                eceVar.a = ie7VarU;
                eceVar.b = ie7VarU2;
                eceVar.c = hgdVar;
                eceVar.d = hgdVar2;
                eceVar.e = k0Var3;
                eceVar.f = k0Var4;
                eceVar.g = k0Var;
                eceVar.h = k0Var2;
                eceVar.i = nf4Var;
                eceVar.j = nf4Var2;
                eceVar.k = nf4Var3;
                eceVar.l = nf4Var4;
                ze9Var.setShapeAppearanceModel(eceVar);
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(a parent, View view) {
        parent.getClass();
        view.getClass();
        super.removeView(parent, view);
        if (view instanceof pqd) {
            parent.setFooter(null);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(a parent, int index) {
        parent.getClass();
        if (parent.getChildAt(index) instanceof pqd) {
            parent.setFooter(null);
        }
        super.removeViewAt(parent, index);
    }

    @snc(name = "activityState")
    public final void setActivityState(a view, int activityState) {
        view.getClass();
        if (activityState == -1) {
            return;
        }
        if (activityState == 0) {
            view.setActivityState(a.EnumC0194a.a);
        } else if (activityState == 1) {
            view.setActivityState(a.EnumC0194a.b);
        } else {
            if (activityState != 2) {
                return;
            }
            view.setActivityState(a.EnumC0194a.c);
        }
    }

    @Override // defpackage.afc
    @snc(defaultBoolean = true, name = "gestureEnabled")
    public void setGestureEnabled(a view, boolean gestureEnabled) {
        view.getClass();
        view.setGestureEnabled(gestureEnabled);
    }

    @Override // defpackage.afc
    @snc(name = "nativeBackButtonDismissalEnabled")
    public void setNativeBackButtonDismissalEnabled(a view, boolean nativeBackButtonDismissalEnabled) {
        view.getClass();
        view.setNativeBackButtonDismissalEnabled(nativeBackButtonDismissalEnabled);
    }

    @Override // defpackage.afc
    @snc(customType = "Color", name = "navigationBarColor")
    @sy3
    public void setNavigationBarColor(a view, Integer navigationBarColor) {
        view.getClass();
        view.setNavigationBarColor(navigationBarColor);
    }

    @Override // defpackage.afc
    @snc(name = "navigationBarHidden")
    public void setNavigationBarHidden(a view, boolean navigationBarHidden) {
        view.getClass();
        view.setNavigationBarHidden(Boolean.valueOf(navigationBarHidden));
    }

    @Override // defpackage.afc
    @snc(name = "navigationBarTranslucent")
    @sy3
    public void setNavigationBarTranslucent(a view, boolean navigationBarTranslucent) {
        view.getClass();
        view.setNavigationBarTranslucent(Boolean.valueOf(navigationBarTranslucent));
    }

    @Override // defpackage.afc
    @snc(name = "replaceAnimation")
    public void setReplaceAnimation(a view, String animation) {
        a.b bVar;
        view.getClass();
        if (animation == null || animation.equals("pop")) {
            bVar = a.b.b;
        } else {
            if (!animation.equals("push")) {
                m6.m("Unknown replace animation type ".concat(animation));
                return;
            }
            bVar = a.b.a;
        }
        view.setReplaceAnimation(bVar);
    }

    @Override // defpackage.afc
    public void setScreenId(a view, String value) {
        view.getClass();
        if (value == null || value.length() == 0) {
            value = null;
        }
        view.setScreenId(value);
    }

    @Override // defpackage.afc
    @snc(name = "screenOrientation")
    public void setScreenOrientation(a view, String screenOrientation) {
        view.getClass();
        view.setScreenOrientation(screenOrientation);
    }

    @Override // defpackage.afc
    @snc(name = "sheetAllowedDetents")
    public void setSheetAllowedDetents(a view, ReadableArray value) {
        view.getClass();
        view.getSheetDetents().clear();
        if (value == null || value.size() == 0) {
            view.getSheetDetents().add(Double.valueOf(1.0d));
            return;
        }
        int iO = ojh.o(0, value.size() - 1, 1);
        List<Double> sheetDetents = view.getSheetDetents();
        sheetDetents.getClass();
        nh7 nh7Var = new nh7(0, iO, 1);
        while (nh7Var.hasNext()) {
            sheetDetents.add(Double.valueOf(value.getDouble(nh7Var.next().intValue())));
        }
    }

    @Override // defpackage.afc
    @snc(name = "sheetCornerRadius")
    public void setSheetCornerRadius(a view, float value) {
        view.getClass();
        view.setSheetCornerRadius(value);
    }

    @Override // defpackage.afc
    @snc(name = "sheetElevation")
    public void setSheetElevation(a view, int value) {
        if (view != null) {
            view.setSheetElevation(value);
        }
    }

    @Override // defpackage.afc
    @snc(name = "sheetExpandsWhenScrolledToEdge")
    public void setSheetExpandsWhenScrolledToEdge(a view, boolean value) {
        view.getClass();
        view.setSheetExpandsWhenScrolledToEdge(value);
    }

    @Override // defpackage.afc
    @snc(name = "sheetGrabberVisible")
    public void setSheetGrabberVisible(a view, boolean value) {
        view.getClass();
        view.setSheetGrabberVisible(value);
    }

    @Override // defpackage.afc
    @snc(name = "sheetInitialDetent")
    public void setSheetInitialDetent(a view, int value) {
        view.getClass();
        view.setSheetInitialDetentIndex(value);
    }

    @Override // defpackage.afc
    @snc(name = "sheetLargestUndimmedDetent")
    public void setSheetLargestUndimmedDetent(a view, int value) {
        view.getClass();
        if (-1 > value || value >= 3) {
            r6.g("[RNScreens] sheetLargestUndimmedDetent on Android supports values between -1 and 2");
        } else {
            view.setSheetLargestUndimmedDetentIndex(value);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r2.equals("default") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r2.equals("flip") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        if (r2.equals("simple_push") != false) goto L42;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.afc
    @defpackage.snc(name = "stackAnimation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setStackAnimation(com.swmansion.rnscreens.a r1, java.lang.String r2) {
        /*
            r0 = this;
            r1.getClass()
            if (r2 == 0) goto L8d
            int r0 = r2.hashCode()
            switch(r0) {
                case -1418955385: goto L7a;
                case -1198710326: goto L6f;
                case -427095442: goto L64;
                case -349395819: goto L59;
                case 3135100: goto L4e;
                case 3145837: goto L45;
                case 3387192: goto L3a;
                case 182437661: goto L2f;
                case 1500346553: goto L24;
                case 1544803905: goto L1a;
                case 1601504978: goto Le;
                default: goto Lc;
            }
        Lc:
            goto L83
        Le:
            java.lang.String r0 = "slide_from_bottom"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L83
            com.swmansion.rnscreens.a$c r0 = com.swmansion.rnscreens.a.c.d
            goto L8f
        L1a:
            java.lang.String r0 = "default"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L83
            goto L8d
        L24:
            java.lang.String r0 = "ios_from_right"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L83
            com.swmansion.rnscreens.a$c r0 = com.swmansion.rnscreens.a.c.W
            goto L8f
        L2f:
            java.lang.String r0 = "fade_from_bottom"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L83
            com.swmansion.rnscreens.a$c r0 = com.swmansion.rnscreens.a.c.V
            goto L8f
        L3a:
            java.lang.String r0 = "none"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L83
            com.swmansion.rnscreens.a$c r0 = com.swmansion.rnscreens.a.c.b
            goto L8f
        L45:
            java.lang.String r0 = "flip"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L83
            goto L8d
        L4e:
            java.lang.String r0 = "fade"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L83
            com.swmansion.rnscreens.a$c r0 = com.swmansion.rnscreens.a.c.c
            goto L8f
        L59:
            java.lang.String r0 = "slide_from_right"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L83
            com.swmansion.rnscreens.a$c r0 = com.swmansion.rnscreens.a.c.e
            goto L8f
        L64:
            java.lang.String r0 = "slide_from_left"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L83
            com.swmansion.rnscreens.a$c r0 = com.swmansion.rnscreens.a.c.f
            goto L8f
        L6f:
            java.lang.String r0 = "ios_from_left"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L83
            com.swmansion.rnscreens.a$c r0 = com.swmansion.rnscreens.a.c.X
            goto L8f
        L7a:
            java.lang.String r0 = "simple_push"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L83
            goto L8d
        L83:
            java.lang.String r0 = "Unknown animation type "
            java.lang.String r0 = r0.concat(r2)
            defpackage.m6.m(r0)
            return
        L8d:
            com.swmansion.rnscreens.a$c r0 = com.swmansion.rnscreens.a.c.a
        L8f:
            r1.setStackAnimation(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackAnimation(com.swmansion.rnscreens.a, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r2.equals("fullScreenModal") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (r2.equals("containedTransparentModal") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r2.equals("pageSheet") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r2.equals("containedModal") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        if (r2.equals("modal") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        r0 = com.swmansion.rnscreens.a.d.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        if (r2.equals("transparentModal") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = com.swmansion.rnscreens.a.d.c;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.afc
    @defpackage.snc(name = "stackPresentation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setStackPresentation(com.swmansion.rnscreens.a r1, java.lang.String r2) {
        /*
            r0 = this;
            r1.getClass()
            if (r2 == 0) goto L60
            int r0 = r2.hashCode()
            switch(r0) {
                case -76271493: goto L52;
                case 3452698: goto L47;
                case 104069805: goto L3c;
                case 438078970: goto L33;
                case 872434704: goto L2a;
                case 955284238: goto L21;
                case 1171936146: goto L18;
                case 1798290171: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L60
        Ld:
            java.lang.String r0 = "formSheet"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L60
            com.swmansion.rnscreens.a$d r0 = com.swmansion.rnscreens.a.d.d
            goto L5c
        L18:
            java.lang.String r0 = "fullScreenModal"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L60
            goto L44
        L21:
            java.lang.String r0 = "containedTransparentModal"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L60
            goto L5a
        L2a:
            java.lang.String r0 = "pageSheet"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L60
            goto L44
        L33:
            java.lang.String r0 = "containedModal"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L60
            goto L44
        L3c:
            java.lang.String r0 = "modal"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L60
        L44:
            com.swmansion.rnscreens.a$d r0 = com.swmansion.rnscreens.a.d.b
            goto L5c
        L47:
            java.lang.String r0 = "push"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L60
            com.swmansion.rnscreens.a$d r0 = com.swmansion.rnscreens.a.d.a
            goto L5c
        L52:
            java.lang.String r0 = "transparentModal"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L60
        L5a:
            com.swmansion.rnscreens.a$d r0 = com.swmansion.rnscreens.a.d.c
        L5c:
            r1.setStackPresentation(r0)
            return
        L60:
            java.lang.String r0 = "Unknown presentation type "
            java.lang.String r0 = defpackage.l5.l(r0, r2)
            defpackage.m6.m(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackPresentation(com.swmansion.rnscreens.a, java.lang.String):void");
    }

    @Override // defpackage.afc
    @snc(name = "statusBarAnimation")
    public void setStatusBarAnimation(a view, String statusBarAnimation) {
        view.getClass();
        view.setStatusBarAnimated(Boolean.valueOf((statusBarAnimation == null || "none".equals(statusBarAnimation)) ? false : true));
    }

    @Override // defpackage.afc
    @snc(customType = "Color", name = "statusBarColor")
    @sy3
    public void setStatusBarColor(a view, Integer statusBarColor) {
        view.getClass();
        view.setStatusBarColor(statusBarColor);
    }

    @Override // defpackage.afc
    @snc(name = "statusBarHidden")
    public void setStatusBarHidden(a view, boolean statusBarHidden) {
        view.getClass();
        view.setStatusBarHidden(Boolean.valueOf(statusBarHidden));
    }

    @Override // defpackage.afc
    @snc(name = "statusBarStyle")
    public void setStatusBarStyle(a view, String statusBarStyle) {
        view.getClass();
        view.setStatusBarStyle(statusBarStyle);
    }

    @Override // defpackage.afc
    @snc(name = "statusBarTranslucent")
    @sy3
    public void setStatusBarTranslucent(a view, boolean statusBarTranslucent) {
        view.getClass();
        view.setStatusBarTranslucent(Boolean.valueOf(statusBarTranslucent));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(a view, noc props, vse stateWrapper) {
        view.getClass();
        view.setStateWrapper(stateWrapper);
        return super.updateState(view, props, stateWrapper);
    }

    @Override // defpackage.afc
    public void setCustomAnimationOnSwipe(a view, boolean value) {
    }

    @Override // defpackage.afc
    public void setFullScreenSwipeEnabled(a view, boolean value) {
    }

    @Override // defpackage.afc
    public void setFullScreenSwipeShadowEnabled(a view, boolean value) {
    }

    @Override // defpackage.afc
    public void setGestureResponseDistance(a view, ReadableMap value) {
    }

    @Override // defpackage.afc
    public void setHideKeyboardOnSwipe(a view, boolean value) {
    }

    @Override // defpackage.afc
    public void setHomeIndicatorHidden(a view, boolean value) {
    }

    @Override // defpackage.afc
    public void setPreventNativeDismiss(a view, boolean value) {
    }

    @Override // defpackage.afc
    public void setSwipeDirection(a view, String value) {
    }

    @Override // defpackage.afc
    public void setTransitionDuration(a view, int value) {
    }

    @Override // defpackage.afc
    public void setActivityState(a view, float activityState) {
        view.getClass();
        setActivityState(view, (int) activityState);
    }
}
