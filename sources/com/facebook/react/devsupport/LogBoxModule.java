package com.facebook.react.devsupport;

import com.facebook.fbreact.specs.NativeLogBoxSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import defpackage.b0f;
import defpackage.nmc;
import defpackage.q9;
import defpackage.rx0;
import defpackage.w24;
import defpackage.w29;
import defpackage.zf3;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = "LogBox")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/devsupport/LogBoxModule;", "Lcom/facebook/fbreact/specs/NativeLogBoxSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Lw24;", "devSupportManager", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lw24;)V", "Lj6g;", "show", "()V", "hide", "invalidate", "Lb0f;", "surfaceDelegate", "Lb0f;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LogBoxModule extends NativeLogBoxSpec {
    public static final String NAME = "LogBox";
    private final b0f surfaceDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogBoxModule(ReactApplicationContext reactApplicationContext, w24 w24Var) {
        super(reactApplicationContext);
        w24Var.getClass();
        b0f b0fVarH = w24Var.h("LogBox");
        this.surfaceDelegate = b0fVarH == null ? new w29(w24Var) : b0fVarH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hide$lambda$1(LogBoxModule logBoxModule) {
        logBoxModule.surfaceDelegate.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidate$lambda$2(LogBoxModule logBoxModule) {
        logBoxModule.surfaceDelegate.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$0(LogBoxModule logBoxModule) {
        if (!logBoxModule.surfaceDelegate.d()) {
            logBoxModule.surfaceDelegate.e("LogBox");
        }
        logBoxModule.surfaceDelegate.b();
    }

    @Override // com.facebook.fbreact.specs.NativeLogBoxSpec
    public void hide() {
        UiThreadUtil.runOnUiThread(new rx0(this, 4));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        UiThreadUtil.runOnUiThread(new q9(this, 2));
    }

    @Override // com.facebook.fbreact.specs.NativeLogBoxSpec
    public void show() {
        UiThreadUtil.runOnUiThread(new zf3(this, 5));
    }
}
