package com.facebook.react.modules.debug;

import com.facebook.fbreact.specs.NativeDevMenuSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import defpackage.my1;
import defpackage.nmc;
import defpackage.w24;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = "DevMenu")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/modules/debug/DevMenuModule;", "Lcom/facebook/fbreact/specs/NativeDevMenuSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Lw24;", "devSupportManager", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lw24;)V", "Lj6g;", "show", "()V", "reload", "", "enabled", "setProfilingEnabled", "(Z)V", "setHotLoadingEnabled", "Lw24;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DevMenuModule extends NativeDevMenuSpec {
    public static final String NAME = "DevMenu";
    private final w24 devSupportManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevMenuModule(ReactApplicationContext reactApplicationContext, w24 w24Var) {
        super(reactApplicationContext);
        w24Var.getClass();
        this.devSupportManager = w24Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reload$lambda$0(DevMenuModule devMenuModule) {
        devMenuModule.devSupportManager.w();
    }

    @Override // com.facebook.fbreact.specs.NativeDevMenuSpec
    public void reload() {
        if (this.devSupportManager.f()) {
            UiThreadUtil.runOnUiThread(new my1(this, 4));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDevMenuSpec
    public void setHotLoadingEnabled(boolean enabled) {
        this.devSupportManager.g(enabled);
    }

    @Override // com.facebook.fbreact.specs.NativeDevMenuSpec
    public void setProfilingEnabled(boolean enabled) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevMenuSpec
    public void show() {
        if (this.devSupportManager.f()) {
            this.devSupportManager.A();
        }
    }
}
