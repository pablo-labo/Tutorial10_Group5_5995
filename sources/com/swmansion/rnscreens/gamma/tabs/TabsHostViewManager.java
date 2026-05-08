package com.swmansion.rnscreens.gamma.tabs;

import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import defpackage.b7f;
import defpackage.bk1;
import defpackage.f7f;
import defpackage.h5;
import defpackage.l5;
import defpackage.lc9;
import defpackage.mkf;
import defpackage.nmc;
import defpackage.r6;
import defpackage.s7f;
import defpackage.snc;
import defpackage.sqg;
import defpackage.tec;
import defpackage.tod;
import defpackage.uec;
import defpackage.ui;
import defpackage.v7f;
import defpackage.w40;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = TabsHostViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0007\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001@B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0002H\u0014¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b(\u0010'J!\u0010*\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u00022\u0006\u0010%\u001a\u00020)H\u0017¢\u0006\u0004\b*\u0010+J!\u0010-\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u00022\u0006\u0010%\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J!\u0010/\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b/\u00100J!\u00101\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b1\u00100J!\u00102\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b2\u00100J!\u00103\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b3\u0010'J!\u00104\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b4\u0010'J!\u00105\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b5\u00100J!\u00106\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b6\u0010'J!\u00107\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b7\u0010'J\u001f\u00108\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010%\u001a\u00020,H\u0017¢\u0006\u0004\b8\u0010.J!\u00109\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b9\u0010'J!\u0010:\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u00022\u0006\u0010%\u001a\u00020)H\u0017¢\u0006\u0004\b:\u0010+J!\u0010;\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b;\u0010'J!\u0010<\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b<\u00100R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Ls7f;", "Luec;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lmkf;", "reactContext", "createViewInstance", "(Lmkf;)Ls7f;", "Lsqg;", "getDelegate", "()Lsqg;", "parent", "Landroid/view/View;", "child", "", "index", "Lj6g;", "addView", "(Ls7f;Landroid/view/View;I)V", "removeView", "(Ls7f;Landroid/view/View;)V", "removeViewAt", "(Ls7f;I)V", "removeAllViews", "(Ls7f;)V", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "view", "addEventEmitters", "(Lmkf;Ls7f;)V", "value", "setTabBarBackgroundColor", "(Ls7f;Ljava/lang/Integer;)V", "setTabBarTintColor", "", "setTabBarItemTitleFontSize", "(Ls7f;F)V", "", "setControlNavigationStateInJS", "(Ls7f;Z)V", "setTabBarItemTitleFontFamily", "(Ls7f;Ljava/lang/String;)V", "setTabBarItemTitleFontWeight", "setTabBarItemTitleFontStyle", "setTabBarItemTitleFontColor", "setTabBarItemIconColor", "setTabBarMinimizeBehavior", "setTabBarItemTitleFontColorActive", "setTabBarItemActiveIndicatorColor", "setTabBarItemActiveIndicatorEnabled", "setTabBarItemIconColorActive", "setTabBarItemTitleFontSizeActive", "setTabBarItemRippleColor", "setTabBarItemLabelVisibilityMode", "delegate", "Lsqg;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TabsHostViewManager extends ViewGroupManager<s7f> implements uec<s7f> {
    public static final String REACT_CLASS = "RNSBottomTabs";
    private final sqg<s7f> delegate;

    public TabsHostViewManager() {
        super(null, 1, null);
        this.delegate = new tec(this, 0);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(mkf reactContext, s7f view) {
        reactContext.getClass();
        view.getClass();
        super.addEventEmitters(reactContext, view);
        if (view.getId() == -1) {
            r6.g("[RNScreens] TabsHost must have its tag set when registering event emitters");
            return;
        }
        mkf mkfVar = view.a;
        int id = view.getId();
        mkfVar.getClass();
        view.setEventEmitter$react_native_screens_release(new v7f(mkfVar, id));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(s7f parent, View child, int index) {
        parent.getClass();
        child.getClass();
        if (!(child instanceof b7f)) {
            l5.q("[RNScreens] Attempt to attach child that is not of type javaClass");
            return;
        }
        b7f b7fVar = (b7f) child;
        bk1 bk1Var = parent.d;
        if (index >= bk1Var.getMaxItemCount()) {
            h5.k(w40.e("[RNScreens] Attempt to insert TabScreen at index ", index, "; BottomNavigationView supports at most ", bk1Var.getMaxItemCount(), " items"));
            return;
        }
        parent.W.add(index, new f7f(b7fVar));
        b7fVar.setTabScreenDelegate$react_native_screens_release(parent);
        s7f.a aVar = parent.b;
        aVar.a();
        aVar.b();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public s7f createViewInstance(mkf reactContext) {
        reactContext.getClass();
        return new s7f(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public sqg<s7f> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return lc9.b0(new Pair("topNativeFocusChange", lc9.Z(new Pair("registrationName", "onNativeFocusChange"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public void removeAllViews(s7f parent) {
        parent.getClass();
        ArrayList arrayList = parent.W;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((f7f) it.next()).a.setTabScreenDelegate$react_native_screens_release(null);
        }
        arrayList.clear();
        s7f.a aVar = parent.b;
        aVar.a();
        aVar.b();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(s7f parent, View child) {
        parent.getClass();
        child.getClass();
        if (!(child instanceof b7f)) {
            l5.q("[RNScreens] Attempt to detach child that is not of type javaClass");
            return;
        }
        b7f b7fVar = (b7f) child;
        boolean zRemoveIf = parent.W.removeIf(new tod(new ui(b7fVar, 15), 1));
        Boolean boolValueOf = Boolean.valueOf(zRemoveIf);
        if (!zRemoveIf) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            b7fVar.setTabScreenDelegate$react_native_screens_release(null);
            s7f.a aVar = parent.b;
            aVar.a();
            aVar.b();
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(s7f parent, int index) {
        parent.getClass();
        ((f7f) parent.W.remove(index)).a.setTabScreenDelegate$react_native_screens_release(null);
        s7f.a aVar = parent.b;
        aVar.a();
        aVar.b();
    }

    @Override // defpackage.uec
    @snc(customType = "Color", name = "tabBarBackgroundColor")
    public void setTabBarBackgroundColor(s7f view, Integer value) {
        view.getClass();
        view.setTabBarBackgroundColor(value);
    }

    @Override // defpackage.uec
    @snc(customType = "Color", name = "tabBarItemActiveIndicatorColor")
    public void setTabBarItemActiveIndicatorColor(s7f view, Integer value) {
        view.getClass();
        view.setTabBarItemActiveIndicatorColor(value);
    }

    @Override // defpackage.uec
    @snc(name = "tabBarItemActiveIndicatorEnabled")
    public void setTabBarItemActiveIndicatorEnabled(s7f view, boolean value) {
        view.getClass();
        view.setTabBarItemActiveIndicatorEnabled(value);
    }

    @Override // defpackage.uec
    @snc(customType = "Color", name = "tabBarItemIconColor")
    public void setTabBarItemIconColor(s7f view, Integer value) {
        view.getClass();
        view.setTabBarItemIconColor(value);
    }

    @Override // defpackage.uec
    @snc(customType = "Color", name = "tabBarItemIconColorActive")
    public void setTabBarItemIconColorActive(s7f view, Integer value) {
        view.getClass();
        view.setTabBarItemIconColorActive(value);
    }

    @Override // defpackage.uec
    @snc(name = "tabBarItemLabelVisibilityMode")
    public void setTabBarItemLabelVisibilityMode(s7f view, String value) {
        view.getClass();
        view.setTabBarItemLabelVisibilityMode(value);
    }

    @Override // defpackage.uec
    @snc(customType = "Color", name = "tabBarItemRippleColor")
    public void setTabBarItemRippleColor(s7f view, Integer value) {
        view.getClass();
        view.setTabBarItemRippleColor(value);
    }

    @Override // defpackage.uec
    @snc(customType = "Color", name = "tabBarItemTitleFontColor")
    public void setTabBarItemTitleFontColor(s7f view, Integer value) {
        view.getClass();
        view.setTabBarItemTitleFontColor(value);
    }

    @Override // defpackage.uec
    @snc(customType = "Color", name = "tabBarItemTitleFontColorActive")
    public void setTabBarItemTitleFontColorActive(s7f view, Integer value) {
        view.getClass();
        view.setTabBarItemTitleFontColorActive(value);
    }

    @Override // defpackage.uec
    @snc(name = "tabBarItemTitleFontFamily")
    public void setTabBarItemTitleFontFamily(s7f view, String value) {
        view.getClass();
        view.setTabBarItemTitleFontFamily(value);
    }

    @Override // defpackage.uec
    @snc(name = "tabBarItemTitleFontSize")
    public void setTabBarItemTitleFontSize(s7f view, float value) {
        if (view != null) {
            view.setTabBarItemTitleFontSize(Float.valueOf(value));
        }
    }

    @Override // defpackage.uec
    @snc(name = "tabBarItemTitleFontSizeActive")
    public void setTabBarItemTitleFontSizeActive(s7f view, float value) {
        if (view != null) {
            view.setTabBarItemTitleFontSizeActive(Float.valueOf(value));
        }
    }

    @Override // defpackage.uec
    @snc(name = "tabBarItemTitleFontStyle")
    public void setTabBarItemTitleFontStyle(s7f view, String value) {
        view.getClass();
        view.setTabBarItemTitleFontStyle(value);
    }

    @Override // defpackage.uec
    @snc(name = "tabBarItemTitleFontWeight")
    public void setTabBarItemTitleFontWeight(s7f view, String value) {
        view.getClass();
        view.setTabBarItemTitleFontWeight(value);
    }

    @Override // defpackage.uec
    public void setControlNavigationStateInJS(s7f view, boolean value) {
    }

    @Override // defpackage.uec
    public void setTabBarMinimizeBehavior(s7f view, String value) {
        view.getClass();
    }

    @Override // defpackage.uec
    public void setTabBarTintColor(s7f view, Integer value) {
        view.getClass();
    }
}
