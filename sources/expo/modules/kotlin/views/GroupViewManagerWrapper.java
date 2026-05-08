package expo.modules.kotlin.views;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import defpackage.gk0;
import defpackage.hb9;
import defpackage.j6g;
import defpackage.lc9;
import defpackage.m45;
import defpackage.mkf;
import defpackage.noc;
import defpackage.ooc;
import defpackage.osg;
import defpackage.rqg;
import defpackage.uf0;
import defpackage.vse;
import defpackage.zb5;
import defpackage.zqg;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010\u0017J\u001d\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001a\u0018\u00010!H\u0016¢\u0006\u0004\b\"\u0010\u001fJ'\u0010(\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020&2\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010+J!\u0010,\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020$H\u0016¢\u0006\u0004\b0\u00101R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Lexpo/modules/kotlin/views/GroupViewManagerWrapper;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Landroid/view/ViewGroup;", "Losg;", "Lzqg;", "viewWrapperDelegate", "<init>", "(Lzqg;)V", "", "getName", "()Ljava/lang/String;", "Lmkf;", "reactContext", "createViewInstance", "(Lmkf;)Landroid/view/ViewGroup;", "viewToUpdate", "Lnoc;", "props", "Lj6g;", "updateProperties", "(Landroid/view/ViewGroup;Lnoc;)V", "view", "onAfterUpdateTransaction", "(Landroid/view/ViewGroup;)V", "Lvse;", "stateWrapper", "", "updateState", "(Landroid/view/ViewGroup;Lnoc;Lvse;)Ljava/lang/Object;", "", "getNativeProps", "()Ljava/util/Map;", "onDropViewInstance", "", "getExportedCustomDirectEventTypeConstants", "parent", "Landroid/view/View;", "child", "", "index", "addView", "(Landroid/view/ViewGroup;Landroid/view/View;I)V", "getChildCount", "(Landroid/view/ViewGroup;)I", "getChildAt", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "removeViewAt", "(Landroid/view/ViewGroup;I)V", "removeView", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "Lzqg;", "getViewWrapperDelegate", "()Lzqg;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GroupViewManagerWrapper extends ViewGroupManager<ViewGroup> implements osg {
    private final zqg viewWrapperDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupViewManagerWrapper(zqg zqgVar) {
        super(null, 1, null);
        zqgVar.getClass();
        this.viewWrapperDelegate = zqgVar;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public void addView(ViewGroup parent, View child, int index) {
        parent.getClass();
        child.getClass();
        getViewWrapperDelegate().b.getClass();
        super.addView(parent, child, index);
        j6g j6gVar = j6g.a;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewGroup createViewInstance(mkf reactContext) {
        reactContext.getClass();
        zqg viewWrapperDelegate = getViewWrapperDelegate();
        viewWrapperDelegate.getClass();
        rqg rqgVar = viewWrapperDelegate.b;
        gk0 gk0VarB = viewWrapperDelegate.a.a.b();
        rqgVar.getClass();
        return (ViewGroup) ((View) rqgVar.b.invoke(reactContext, gk0VarB));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public View getChildAt(ViewGroup parent, int index) {
        parent.getClass();
        getViewWrapperDelegate().b.getClass();
        return super.getChildAt(parent, index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public int getChildCount(ViewGroup parent) {
        parent.getClass();
        getViewWrapperDelegate().b.getClass();
        return super.getChildCount(parent);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        hb9 hb9VarA = getViewWrapperDelegate().a();
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        return exportedCustomDirectEventTypeConstants != null ? lc9.c0(exportedCustomDirectEventTypeConstants, hb9VarA) : hb9VarA;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ViewManagerAdapter_".concat(getViewWrapperDelegate().b());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, String> getNativeProps() {
        Map<String, String> nativeProps = super.getNativeProps();
        for (Map.Entry<String, uf0> entry : getViewWrapperDelegate().b.d.entrySet()) {
            String key = entry.getKey();
            uf0 value = entry.getValue();
            nativeProps.getClass();
            nativeProps.put(key, String.valueOf(value.b.a.a()));
        }
        nativeProps.getClass();
        return nativeProps;
    }

    @Override // defpackage.osg
    public zqg getViewWrapperDelegate() {
        return this.viewWrapperDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(ViewGroup view) {
        view.getClass();
        super.onAfterUpdateTransaction(view);
        getViewWrapperDelegate().d(view);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(ViewGroup view) {
        view.getClass();
        super.onDropViewInstance(view);
        getViewWrapperDelegate().c(view);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(ViewGroup parent, View view) {
        parent.getClass();
        view.getClass();
        getViewWrapperDelegate().b.getClass();
        super.removeView(parent, view);
        j6g j6gVar = j6g.a;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public void removeViewAt(ViewGroup parent, int index) {
        parent.getClass();
        getViewWrapperDelegate().b.getClass();
        super.removeViewAt(parent, index);
        j6g j6gVar = j6g.a;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateProperties(ViewGroup viewToUpdate, noc props) {
        viewToUpdate.getClass();
        props.getClass();
        ReadableMap readableMapA = ooc.a(props);
        super.updateProperties(viewToUpdate, new noc(new zb5(readableMapA, getViewWrapperDelegate().e(viewToUpdate, readableMapA))));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(ViewGroup view, noc props, vse stateWrapper) {
        view.getClass();
        m45 m45Var = view instanceof m45 ? (m45) view : null;
        if (m45Var == null) {
            return null;
        }
        m45Var.setStateWrapper(stateWrapper);
        return super.updateState(m45Var, props, stateWrapper);
    }
}
