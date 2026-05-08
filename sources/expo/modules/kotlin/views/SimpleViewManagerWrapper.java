package expo.modules.kotlin.views;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import defpackage.gk0;
import defpackage.hb9;
import defpackage.lc9;
import defpackage.mkf;
import defpackage.noc;
import defpackage.ooc;
import defpackage.osg;
import defpackage.rqg;
import defpackage.uf0;
import defpackage.zb5;
import defpackage.zqg;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\u001d\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lexpo/modules/kotlin/views/SimpleViewManagerWrapper;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Landroid/view/View;", "Losg;", "Lzqg;", "viewWrapperDelegate", "<init>", "(Lzqg;)V", "", "getName", "()Ljava/lang/String;", "Lmkf;", "reactContext", "createViewInstance", "(Lmkf;)Landroid/view/View;", "viewToUpdate", "Lnoc;", "props", "Lj6g;", "updateProperties", "(Landroid/view/View;Lnoc;)V", "view", "onAfterUpdateTransaction", "(Landroid/view/View;)V", "", "getNativeProps", "()Ljava/util/Map;", "onDropViewInstance", "", "", "getExportedCustomDirectEventTypeConstants", "Lzqg;", "getViewWrapperDelegate", "()Lzqg;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SimpleViewManagerWrapper extends SimpleViewManager<View> implements osg {
    private final zqg viewWrapperDelegate;

    public SimpleViewManagerWrapper(zqg zqgVar) {
        zqgVar.getClass();
        this.viewWrapperDelegate = zqgVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(mkf reactContext) {
        reactContext.getClass();
        zqg viewWrapperDelegate = getViewWrapperDelegate();
        viewWrapperDelegate.getClass();
        rqg rqgVar = viewWrapperDelegate.b;
        gk0 gk0VarB = viewWrapperDelegate.a.a.b();
        rqgVar.getClass();
        return (View) rqgVar.b.invoke(reactContext, gk0VarB);
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
    public void onAfterUpdateTransaction(View view) {
        view.getClass();
        super.onAfterUpdateTransaction(view);
        getViewWrapperDelegate().d(view);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(View view) {
        view.getClass();
        super.onDropViewInstance(view);
        getViewWrapperDelegate().c(view);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateProperties(View viewToUpdate, noc props) {
        viewToUpdate.getClass();
        props.getClass();
        ReadableMap readableMapA = ooc.a(props);
        super.updateProperties(viewToUpdate, new noc(new zb5(readableMapA, getViewWrapperDelegate().e(viewToUpdate, readableMapA))));
    }
}
