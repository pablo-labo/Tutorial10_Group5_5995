package com.facebook.react.internal.turbomodule.core;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.internal.turbomodule.core.TurboModuleManager;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements TurboModuleManager.ModuleProvider {
    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManager.ModuleProvider
    public final NativeModule getModule(String str) {
        return TurboModuleManager._init_$lambda$0(str);
    }
}
