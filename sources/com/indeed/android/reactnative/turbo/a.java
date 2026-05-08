package com.indeed.android.reactnative.turbo;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import defpackage.i97;
import defpackage.omc;
import defpackage.qa1;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qa1 {
    @Override // defpackage.qa1
    public final NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.getClass();
        reactApplicationContext.getClass();
        if (str.equals("NativeJSTAccountStatus")) {
            return new NativeJSTAccountStatus(reactApplicationContext);
        }
        return null;
    }

    @Override // defpackage.qa1
    public final omc getReactModuleInfoProvider() {
        return new i97();
    }
}
