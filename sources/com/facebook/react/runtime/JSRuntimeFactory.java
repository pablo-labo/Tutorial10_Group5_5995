package com.facebook.react.runtime;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import defpackage.f84;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/react/runtime/JSRuntimeFactory;", "", "Lcom/facebook/jni/HybridData;", "mHybridData", "Lcom/facebook/jni/HybridData;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class JSRuntimeFactory {

    @f84
    private final HybridData mHybridData;

    static {
        SoLoader.l("rninstance");
    }

    public JSRuntimeFactory(HybridData hybridData) {
        hybridData.getClass();
        this.mHybridData = hybridData;
    }
}
