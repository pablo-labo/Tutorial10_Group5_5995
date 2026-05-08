package com.swmansion.rnscreens;

import android.util.Log;
import android.view.View;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewGroupManager;
import defpackage.bfc;
import defpackage.cfc;
import defpackage.lc9;
import defpackage.mkf;
import defpackage.nmc;
import defpackage.noc;
import defpackage.snc;
import defpackage.sqg;
import defpackage.sy3;
import defpackage.vse;
import defpackage.xm8;
import defpackage.xqd;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = ScreenStackHeaderConfigViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 i2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001jB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001a\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00172\b\b\u0001\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010#J\u001f\u0010%\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0002H\u0014¢\u0006\u0004\b.\u0010#J!\u00101\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b1\u00102J!\u00104\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b4\u00102J\u001f\u00106\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0015H\u0017¢\u0006\u0004\b6\u0010&J!\u00108\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b8\u00102J!\u0010:\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\b:\u0010;J!\u0010=\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u0010<\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\b=\u0010;J\u001f\u0010?\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010>\u001a\u00020+H\u0017¢\u0006\u0004\b?\u0010@J\u001f\u0010B\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010A\u001a\u00020+H\u0017¢\u0006\u0004\bB\u0010@J\u001f\u0010D\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010C\u001a\u00020+H\u0017¢\u0006\u0004\bD\u0010@J!\u0010F\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u0010E\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\bF\u0010;J\u001f\u0010H\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010G\u001a\u00020+H\u0017¢\u0006\u0004\bH\u0010@J\u001f\u0010J\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010I\u001a\u00020+H\u0017¢\u0006\u0004\bJ\u0010@J\u001f\u0010L\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010K\u001a\u00020+H\u0017¢\u0006\u0004\bL\u0010@J!\u0010N\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u0010M\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\bN\u00102J\u001b\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f0OH\u0016¢\u0006\u0004\bP\u0010QJ\u0015\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00020RH\u0014¢\u0006\u0004\bS\u0010TJ#\u0010V\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010U\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bV\u00102J#\u0010W\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010U\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bW\u00102J!\u0010X\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010U\u001a\u00020\u0015H\u0016¢\u0006\u0004\bX\u0010&J!\u0010Y\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010U\u001a\u00020+H\u0016¢\u0006\u0004\bY\u0010@J!\u0010Z\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010U\u001a\u00020+H\u0016¢\u0006\u0004\bZ\u0010@J#\u0010[\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010U\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b[\u00102J!\u0010\\\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010U\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\\\u0010&J#\u0010]\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010U\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b]\u00102J#\u0010^\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010U\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b^\u0010;J!\u0010_\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010U\u001a\u00020+H\u0016¢\u0006\u0004\b_\u0010@J#\u0010`\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010U\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b`\u0010;J!\u0010a\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010U\u001a\u00020+H\u0016¢\u0006\u0004\ba\u0010@J#\u0010b\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010U\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bb\u00102J#\u0010c\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010U\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bc\u00102J\u0017\u0010e\u001a\u00020\u00172\u0006\u0010d\u001a\u00020\u0006H\u0002¢\u0006\u0004\be\u0010fR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010h¨\u0006k"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/f;", "Lcfc;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lmkf;", "reactContext", "createViewInstance", "(Lmkf;)Lcom/swmansion/rnscreens/f;", "Lcom/facebook/react/bridge/ReactApplicationContext;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lxm8;", "createShadowNodeInstance", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Lxm8;", "parent", "Landroid/view/View;", "child", "", "index", "Lj6g;", "addView", "(Lcom/swmansion/rnscreens/f;Landroid/view/View;I)V", "view", "Lnoc;", "props", "Lvse;", "stateWrapper", "", "updateState", "(Lcom/swmansion/rnscreens/f;Lnoc;Lvse;)Ljava/lang/Object;", "onDropViewInstance", "(Lcom/swmansion/rnscreens/f;)V", "removeAllViews", "removeViewAt", "(Lcom/swmansion/rnscreens/f;I)V", "getChildCount", "(Lcom/swmansion/rnscreens/f;)I", "getChildAt", "(Lcom/swmansion/rnscreens/f;I)Landroid/view/View;", "", "needsCustomLayoutForChildren", "()Z", "onAfterUpdateTransaction", "config", "title", "setTitle", "(Lcom/swmansion/rnscreens/f;Ljava/lang/String;)V", "titleFontFamily", "setTitleFontFamily", "titleFontSize", "setTitleFontSize", "titleFontWeight", "setTitleFontWeight", "titleColor", "setTitleColor", "(Lcom/swmansion/rnscreens/f;Ljava/lang/Integer;)V", "backgroundColor", "setBackgroundColor", "hideShadow", "setHideShadow", "(Lcom/swmansion/rnscreens/f;Z)V", "hideBackButton", "setHideBackButton", "topInsetEnabled", "setTopInsetEnabled", "color", "setColor", "hidden", "setHidden", "translucent", "setTranslucent", "backButtonInCustomView", "setBackButtonInCustomView", "direction", "setDirection", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "Lsqg;", "getDelegate", "()Lsqg;", "value", "setBackTitle", "setBackTitleFontFamily", "setBackTitleFontSize", "setBackTitleVisible", "setLargeTitle", "setLargeTitleFontFamily", "setLargeTitleFontSize", "setLargeTitleFontWeight", "setLargeTitleBackgroundColor", "setLargeTitleHideShadow", "setLargeTitleColor", "setDisableBackButtonMenu", "setBackButtonDisplayMode", "setBlurEffect", "propName", "logNotAvailable", "(Ljava/lang/String;)V", "delegate", "Lsqg;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScreenStackHeaderConfigViewManager extends ViewGroupManager<f> implements cfc<f> {
    public static final String REACT_CLASS = "RNSScreenStackHeaderConfig";
    private final sqg<f> delegate;

    public ScreenStackHeaderConfigViewManager() {
        super(null, 1, null);
        this.delegate = new bfc(this, 0);
    }

    private final void logNotAvailable(String propName) {
        Log.w("[RNScreens]", propName + " prop is not available on Android");
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(f parent, View child, int index) {
        parent.getClass();
        child.getClass();
        if (!(child instanceof g)) {
            throw new JSApplicationCausedNativeException("Config children should be of type RNSScreenStackHeaderSubview");
        }
        parent.V.add(index, (g) child);
        parent.b();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public xm8 createShadowNodeInstance(ReactApplicationContext context) {
        context.getClass();
        return new xqd();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public f createViewInstance(mkf reactContext) {
        reactContext.getClass();
        return new f(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(f parent, int index) {
        parent.getClass();
        g gVar = parent.V.get(index);
        gVar.getClass();
        return gVar;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(f parent) {
        parent.getClass();
        return parent.getConfigSubviewsCount();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public sqg<f> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return lc9.Z(new Pair("topAttached", lc9.Z(new Pair("registrationName", "onAttached"))), new Pair("topDetached", lc9.Z(new Pair("registrationName", "onDetached"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.wo6
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(f parent) {
        parent.getClass();
        super.onAfterUpdateTransaction(parent);
        parent.c();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(f view) {
        view.getClass();
        view.l0 = true;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public void removeAllViews(f parent) {
        parent.getClass();
        parent.V.clear();
        parent.b();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(f parent, int index) {
        parent.getClass();
        parent.V.remove(index);
        parent.b();
    }

    @Override // defpackage.cfc
    @snc(name = "backButtonInCustomView")
    public void setBackButtonInCustomView(f config, boolean backButtonInCustomView) {
        config.getClass();
        config.setBackButtonInCustomView(backButtonInCustomView);
    }

    @Override // defpackage.cfc
    @snc(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(f config, Integer backgroundColor) {
        config.getClass();
        config.setBackgroundColor(backgroundColor);
    }

    @Override // defpackage.cfc
    @snc(customType = "Color", name = "color")
    public void setColor(f config, Integer color) {
        config.getClass();
        config.setTintColor(color != null ? color.intValue() : 0);
    }

    @Override // defpackage.cfc
    @snc(name = "direction")
    public void setDirection(f config, String direction) {
        config.getClass();
        config.setDirection(direction);
    }

    @Override // defpackage.cfc
    @snc(name = "hidden")
    public void setHidden(f config, boolean hidden) {
        config.getClass();
        config.setHidden(hidden);
    }

    @Override // defpackage.cfc
    @snc(name = "hideBackButton")
    public void setHideBackButton(f config, boolean hideBackButton) {
        config.getClass();
        config.setHideBackButton(hideBackButton);
    }

    @Override // defpackage.cfc
    @snc(name = "hideShadow")
    public void setHideShadow(f config, boolean hideShadow) {
        config.getClass();
        config.setHideShadow(hideShadow);
    }

    @Override // defpackage.cfc
    @snc(name = "title")
    public void setTitle(f config, String title) {
        config.getClass();
        config.setTitle(title);
    }

    @Override // defpackage.cfc
    @snc(customType = "Color", name = "titleColor")
    public void setTitleColor(f config, Integer titleColor) {
        config.getClass();
        if (titleColor != null) {
            config.setTitleColor(titleColor.intValue());
        }
    }

    @Override // defpackage.cfc
    @snc(name = "titleFontFamily")
    public void setTitleFontFamily(f config, String titleFontFamily) {
        config.getClass();
        config.setTitleFontFamily(titleFontFamily);
    }

    @Override // defpackage.cfc
    @snc(name = "titleFontSize")
    public void setTitleFontSize(f config, int titleFontSize) {
        config.getClass();
        config.setTitleFontSize(titleFontSize);
    }

    @Override // defpackage.cfc
    @snc(name = "titleFontWeight")
    public void setTitleFontWeight(f config, String titleFontWeight) {
        config.getClass();
        config.setTitleFontWeight(titleFontWeight);
    }

    @Override // defpackage.cfc
    @snc(name = "topInsetEnabled")
    @sy3
    public void setTopInsetEnabled(f config, boolean topInsetEnabled) {
        config.getClass();
        config.setTopInsetEnabled(topInsetEnabled);
    }

    @Override // defpackage.cfc
    @snc(name = "translucent")
    public void setTranslucent(f config, boolean translucent) {
        config.getClass();
        config.setTranslucent(translucent);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(f view, noc props, vse stateWrapper) {
        view.getClass();
        view.setStateWrapper(stateWrapper);
        return super.updateState(view, props, stateWrapper);
    }

    @Override // defpackage.cfc
    public void setBackButtonDisplayMode(f view, String value) {
        logNotAvailable("backButtonDisplayMode");
    }

    @Override // defpackage.cfc
    public void setBackTitle(f view, String value) {
        logNotAvailable("backTitle");
    }

    @Override // defpackage.cfc
    public void setBackTitleFontFamily(f view, String value) {
        logNotAvailable("backTitleFontFamily");
    }

    @Override // defpackage.cfc
    public void setBackTitleFontSize(f view, int value) {
        logNotAvailable("backTitleFontSize");
    }

    @Override // defpackage.cfc
    public void setBackTitleVisible(f view, boolean value) {
        logNotAvailable("backTitleVisible");
    }

    @Override // defpackage.cfc
    public void setBlurEffect(f view, String value) {
        logNotAvailable("blurEffect");
    }

    @Override // defpackage.cfc
    public void setDisableBackButtonMenu(f view, boolean value) {
        logNotAvailable("disableBackButtonMenu");
    }

    @Override // defpackage.cfc
    public void setLargeTitle(f view, boolean value) {
        logNotAvailable("largeTitle");
    }

    @Override // defpackage.cfc
    public void setLargeTitleBackgroundColor(f view, Integer value) {
        logNotAvailable("largeTitleBackgroundColor");
    }

    @Override // defpackage.cfc
    public void setLargeTitleColor(f view, Integer value) {
        logNotAvailable("largeTitleColor");
    }

    @Override // defpackage.cfc
    public void setLargeTitleFontFamily(f view, String value) {
        logNotAvailable("largeTitleFontFamily");
    }

    @Override // defpackage.cfc
    public void setLargeTitleFontSize(f view, int value) {
        logNotAvailable("largeTitleFontSize");
    }

    @Override // defpackage.cfc
    public void setLargeTitleFontWeight(f view, String value) {
        logNotAvailable("largeTitleFontWeight");
    }

    @Override // defpackage.cfc
    public void setLargeTitleHideShadow(f view, boolean value) {
        logNotAvailable("largeTitleHideShadow");
    }
}
