package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lcom/facebook/react/bridge/JavaScriptExecutor;", "", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "Lj6g;", "close", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/jni/HybridData;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class JavaScriptExecutor {
    private final HybridData mHybridData;

    public JavaScriptExecutor(HybridData hybridData) {
        hybridData.getClass();
        this.mHybridData = hybridData;
    }

    public void close() {
        this.mHybridData.resetNative();
    }

    public abstract String getName();
}
