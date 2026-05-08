package com.facebook.react.defaults;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.defaults.DefaultComponentsRegistry;
import com.facebook.react.defaults.DefaultTurboModuleManagerDelegate;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.uimanager.ViewManager;
import defpackage.pnc;
import defpackage.wmc;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends wmc {
    public boolean f() {
        return false;
    }

    @Override // defpackage.wmc
    public pnc.a getReactPackageTurboModuleManagerDelegateBuilder() {
        if (f()) {
            return new DefaultTurboModuleManagerDelegate.a();
        }
        return null;
    }

    @Override // defpackage.wmc
    public UIManagerProvider getUIManagerProvider() {
        if (f()) {
            return new UIManagerProvider() { // from class: vp3
                @Override // com.facebook.react.bridge.UIManagerProvider
                public final UIManager createUIManager(ReactApplicationContext reactApplicationContext) {
                    reactApplicationContext.getClass();
                    ComponentFactory componentFactory = new ComponentFactory();
                    DefaultComponentsRegistry.register(componentFactory);
                    List<ViewManager> listF = this.a.a().f(reactApplicationContext);
                    listF.getClass();
                    return new b65(componentFactory, new vqg(listF)).createUIManager(reactApplicationContext);
                }
            };
        }
        return null;
    }
}
