package com.swmansion.gesturehandler.react;

import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import defpackage.cdc;
import defpackage.ddc;
import defpackage.f90;
import defpackage.lc9;
import defpackage.mkf;
import defpackage.nmc;
import defpackage.sqg;
import defpackage.yqg;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = RNGestureHandlerRootViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001aB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00140\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lddc;", "", "<init>", "()V", "Lsqg;", "getDelegate", "()Lsqg;", "", "getName", "()Ljava/lang/String;", "Lmkf;", "reactContext", "createViewInstance", "(Lmkf;)Lddc;", "view", "Lj6g;", "onDropViewInstance", "(Lddc;)V", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "mDelegate", "Lsqg;", "Companion", "a", "react-native-gesture-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RNGestureHandlerRootViewManager extends ViewGroupManager<ddc> implements yqg {
    public static final String REACT_CLASS = "RNGestureHandlerRootView";
    private final sqg<ddc> mDelegate;

    public RNGestureHandlerRootViewManager() {
        super(null, 1, null);
        this.mDelegate = new f90(this, 1);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ddc createViewInstance(mkf reactContext) {
        reactContext.getClass();
        return new ddc(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public sqg<ddc> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        return lc9.b0(new Pair("onGestureHandlerEvent", lc9.b0(new Pair("registrationName", "onGestureHandlerEvent"))), new Pair("onGestureHandlerStateChange", lc9.b0(new Pair("registrationName", "onGestureHandlerStateChange"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(ddc view) {
        view.getClass();
        cdc cdcVar = view.b;
        if (cdcVar != null) {
            cdcVar.b();
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }
}
