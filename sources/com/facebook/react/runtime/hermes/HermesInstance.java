package com.facebook.react.runtime.hermes;

import com.facebook.jni.HybridData;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/react/runtime/hermes/HermesInstance;", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HermesInstance extends JSRuntimeFactory {
    static {
        SoLoader.l("hermesinstancejni");
    }

    public HermesInstance() {
        super(initHybrid(false));
    }

    @DoNotStrip
    public static final native HybridData initHybrid(boolean z);
}
