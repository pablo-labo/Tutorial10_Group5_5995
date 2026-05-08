package com.facebook.react.views.virtualview;

import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import defpackage.dmc;
import defpackage.ie7;
import defpackage.mkf;
import defpackage.nmc;
import defpackage.s55;
import defpackage.snc;
import defpackage.sqg;
import defpackage.tsg;
import defpackage.usg;
import defpackage.vsg;
import defpackage.wsg;
import defpackage.xpc;
import defpackage.ysg;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = ReactVirtualViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001%B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001e\u0010\u001fR0\u0010\"\u001a\u001e\u0012\f\u0012\n !*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n !*\u0004\u0018\u00010\u00000\u00000 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/facebook/react/views/virtualview/ReactVirtualViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lxpc;", "Lvsg;", "<init>", "()V", "Lsqg;", "getDelegate", "()Lsqg;", "", "getName", "()Ljava/lang/String;", "Lmkf;", "reactContext", "createViewInstance", "(Lmkf;)Lxpc;", "view", "", "value", "Lj6g;", "setInitialHidden", "(Lxpc;Z)V", "", "setRenderState", "(Lxpc;I)V", "nativeId", "setNativeId", "(Lxpc;Ljava/lang/String;)V", "addEventEmitters", "(Lmkf;Lxpc;)V", "prepareToRecycleView", "(Lmkf;Lxpc;)Lxpc;", "Lusg;", "kotlin.jvm.PlatformType", "_delegate", "Lusg;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactVirtualViewManager extends ViewGroupManager<xpc> implements vsg<xpc> {
    public static final String REACT_CLASS = "VirtualView";
    private final usg<xpc, ReactVirtualViewManager> _delegate;

    public ReactVirtualViewManager() {
        super(null, 1, null);
        this._delegate = new usg<>(this);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(mkf reactContext, xpc view) {
        reactContext.getClass();
        view.getClass();
        EventDispatcher eventDispatcherE = dmc.e(reactContext, view.getId());
        if (eventDispatcherE == null) {
            return;
        }
        view.setModeChangeEmitter$ReactAndroid_release(new tsg(view.getId(), dmc.g(reactContext), eventDispatcherE));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public xpc createViewInstance(mkf reactContext) {
        reactContext.getClass();
        return new xpc(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public sqg<xpc> getDelegate() {
        return this._delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public xpc prepareToRecycleView(mkf reactContext, xpc view) {
        reactContext.getClass();
        view.getClass();
        view.recycleView$ReactAndroid_release();
        return (xpc) super.prepareToRecycleView(reactContext, view);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // defpackage.vsg
    @snc(name = "initialHidden")
    public void setInitialHidden(xpc view, boolean value) {
        view.getClass();
        if (view.getMode$ReactAndroid_release() == null) {
            view.setMode$ReactAndroid_release(value ? wsg.Hidden : wsg.Visible);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setNativeId(xpc view, String nativeId) {
        view.getClass();
        super.setNativeId(view, nativeId);
        if (view.getDebugLogEnabled$ReactAndroid_release()) {
            String strValueOf = String.valueOf(view.getId());
            s55.n("ReactVirtualView:setNativeId", ((Object) strValueOf) + " [" + view.getId() + "][" + view.getNativeId$ReactAndroid_release() + "]");
        }
    }

    @Override // defpackage.vsg
    @snc(name = "renderState")
    public void setRenderState(xpc view, int value) {
        view.getClass();
        if (ie7.g0.enableVirtualViewRenderState()) {
            view.setRenderState$ReactAndroid_release(value != 1 ? value != 2 ? ysg.Unknown : ysg.None : ysg.Rendered);
        }
    }
}
