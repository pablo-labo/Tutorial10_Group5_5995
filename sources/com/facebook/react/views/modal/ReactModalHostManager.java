package com.facebook.react.views.modal;

import android.content.DialogInterface;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.modal.ReactModalHostManager;
import defpackage.dmc;
import defpackage.kc9;
import defpackage.lmc;
import defpackage.mkf;
import defpackage.mw9;
import defpackage.nmc;
import defpackage.noc;
import defpackage.nw9;
import defpackage.see;
import defpackage.snc;
import defpackage.sqg;
import defpackage.v3d;
import defpackage.vse;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = ReactModalHostManager.REACT_CLASS)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001>B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0019\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u001b\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u001d\u0010\u0017J\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u001f\u0010\u0017J!\u0010!\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b!\u0010\u0013J\u001f\u0010\"\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0014H\u0017¢\u0006\u0004\b\"\u0010\u0017J!\u0010$\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010#H\u0017¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010 \u001a\u00020&H\u0017¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0014H\u0017¢\u0006\u0004\b)\u0010\u0017J!\u0010*\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b*\u0010\u0013J\u001f\u0010+\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b+\u0010,J\u001b\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020.0-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b1\u0010\u0010J)\u00106\u001a\u0004\u0018\u00010.2\u0006\u0010\r\u001a\u00020\u00022\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u0015\u00109\u001a\b\u0012\u0004\u0012\u00020\u000208H\u0014¢\u0006\u0004\b9\u0010:R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lcom/facebook/react/views/modal/ReactModalHostManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/facebook/react/views/modal/ReactModalHostView;", "Lnw9;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lmkf;", "reactContext", "createViewInstance", "(Lmkf;)Lcom/facebook/react/views/modal/ReactModalHostView;", "view", "Lj6g;", "onDropViewInstance", "(Lcom/facebook/react/views/modal/ReactModalHostView;)V", "animationType", "setAnimationType", "(Lcom/facebook/react/views/modal/ReactModalHostView;Ljava/lang/String;)V", "", "transparent", "setTransparent", "(Lcom/facebook/react/views/modal/ReactModalHostView;Z)V", "statusBarTranslucent", "setStatusBarTranslucent", "navigationBarTranslucent", "setNavigationBarTranslucent", "hardwareAccelerated", "setHardwareAccelerated", "visible", "setVisible", "value", "setPresentationStyle", "setAnimated", "Lcom/facebook/react/bridge/ReadableArray;", "setSupportedOrientations", "(Lcom/facebook/react/views/modal/ReactModalHostView;Lcom/facebook/react/bridge/ReadableArray;)V", "", "setIdentifier", "(Lcom/facebook/react/views/modal/ReactModalHostView;I)V", "setAllowSwipeDismissal", "setTestId", "addEventEmitters", "(Lmkf;Lcom/facebook/react/views/modal/ReactModalHostView;)V", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "onAfterUpdateTransaction", "Lnoc;", "props", "Lvse;", "stateWrapper", "updateState", "(Lcom/facebook/react/views/modal/ReactModalHostView;Lnoc;Lvse;)Ljava/lang/Object;", "Lsqg;", "getDelegate", "()Lsqg;", "delegate", "Lsqg;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactModalHostManager extends ViewGroupManager<ReactModalHostView> implements nw9<ReactModalHostView> {
    public static final String REACT_CLASS = "RCTModalHostView";
    private final sqg<ReactModalHostView> delegate;

    public ReactModalHostManager() {
        super(null, 1, null);
        this.delegate = new mw9(this, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEventEmitters$lambda$0(EventDispatcher eventDispatcher, mkf mkfVar, ReactModalHostView reactModalHostView, DialogInterface dialogInterface) {
        eventDispatcher.a(new v3d(dmc.g(mkfVar), reactModalHostView.getId(), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEventEmitters$lambda$1(EventDispatcher eventDispatcher, mkf mkfVar, ReactModalHostView reactModalHostView, DialogInterface dialogInterface) {
        eventDispatcher.a(new see(dmc.g(mkfVar), reactModalHostView.getId()));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(final mkf reactContext, final ReactModalHostView view) {
        reactContext.getClass();
        view.getClass();
        final EventDispatcher eventDispatcherE = dmc.e(reactContext, view.getId());
        if (eventDispatcherE != null) {
            view.setOnRequestCloseListener(new lmc(eventDispatcherE, reactContext, view));
            view.setOnShowListener(new DialogInterface.OnShowListener() { // from class: mmc
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    ReactModalHostManager.addEventEmitters$lambda$1(eventDispatcherE, reactContext, view, dialogInterface);
                }
            });
            view.setEventDispatcher(eventDispatcherE);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactModalHostView createViewInstance(mkf reactContext) {
        reactContext.getClass();
        return new ReactModalHostView(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public sqg<ReactModalHostView> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap<>();
        }
        exportedCustomDirectEventTypeConstants.put("topRequestClose", kc9.W(new Pair("registrationName", "onRequestClose")));
        exportedCustomDirectEventTypeConstants.put("topShow", kc9.W(new Pair("registrationName", "onShow")));
        exportedCustomDirectEventTypeConstants.put("topDismiss", kc9.W(new Pair("registrationName", "onDismiss")));
        exportedCustomDirectEventTypeConstants.put("topOrientationChange", kc9.W(new Pair("registrationName", "onOrientationChange")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(ReactModalHostView view) {
        view.getClass();
        super.onAfterUpdateTransaction(view);
        view.c();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(ReactModalHostView view) {
        view.getClass();
        super.onDropViewInstance(view);
        view.b();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // defpackage.nw9
    @snc(name = "animationType")
    public void setAnimationType(ReactModalHostView view, String animationType) {
        view.getClass();
        if (animationType != null) {
            view.setAnimationType(animationType);
        }
    }

    @Override // defpackage.nw9
    @snc(name = "hardwareAccelerated")
    public void setHardwareAccelerated(ReactModalHostView view, boolean hardwareAccelerated) {
        view.getClass();
        view.setHardwareAccelerated(hardwareAccelerated);
    }

    @Override // defpackage.nw9
    @snc(name = "navigationBarTranslucent")
    public void setNavigationBarTranslucent(ReactModalHostView view, boolean navigationBarTranslucent) {
        view.getClass();
        view.setNavigationBarTranslucent(navigationBarTranslucent);
    }

    @Override // defpackage.nw9
    @snc(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(ReactModalHostView view, boolean statusBarTranslucent) {
        view.getClass();
        view.setStatusBarTranslucent(statusBarTranslucent);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setTestId(ReactModalHostView view, String value) {
        view.getClass();
        super.setTestId(view, value);
        view.setDialogRootViewGroupTestId(value);
    }

    @Override // defpackage.nw9
    @snc(name = "transparent")
    public void setTransparent(ReactModalHostView view, boolean transparent) {
        view.getClass();
        view.setTransparent(transparent);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(ReactModalHostView view, noc props, vse stateWrapper) {
        view.getClass();
        props.getClass();
        stateWrapper.getClass();
        view.setStateWrapper(stateWrapper);
        return null;
    }

    @Override // defpackage.nw9
    @snc(name = "allowSwipeDismissal")
    public void setAllowSwipeDismissal(ReactModalHostView view, boolean value) {
        view.getClass();
    }

    @Override // defpackage.nw9
    @snc(name = "animated")
    public void setAnimated(ReactModalHostView view, boolean value) {
        view.getClass();
    }

    @Override // defpackage.nw9
    @snc(name = "identifier")
    public void setIdentifier(ReactModalHostView view, int value) {
        view.getClass();
    }

    @Override // defpackage.nw9
    @snc(name = "presentationStyle")
    public void setPresentationStyle(ReactModalHostView view, String value) {
        view.getClass();
    }

    @Override // defpackage.nw9
    @snc(name = "supportedOrientations")
    public void setSupportedOrientations(ReactModalHostView view, ReadableArray value) {
        view.getClass();
    }

    @Override // defpackage.nw9
    @snc(name = "visible")
    public void setVisible(ReactModalHostView view, boolean visible) {
        view.getClass();
    }
}
