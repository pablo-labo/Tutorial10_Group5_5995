package com.swmansion.rnscreens;

import android.util.Log;
import com.facebook.jni.HybridData;
import com.facebook.react.fabric.FabricUIManager;
import defpackage.f84;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0086 ¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/swmansion/rnscreens/NativeProxy;", "", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "Lcom/facebook/react/fabric/FabricUIManager;", "fabricUIManager", "Lj6g;", "nativeAddMutationsListener", "(Lcom/facebook/react/fabric/FabricUIManager;)V", "invalidateNative", "()V", "", "screenTag", "notifyScreenRemoved", "(I)V", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeProxy {
    public static final ConcurrentHashMap<Integer, WeakReference<a>> a = new ConcurrentHashMap<>();

    @f84
    private final HybridData mHybridData = initHybrid();

    private final native HybridData initHybrid();

    public final native void invalidateNative();

    public final native void nativeAddMutationsListener(FabricUIManager fabricUIManager);

    @f84
    public final void notifyScreenRemoved(int screenTag) {
        WeakReference<a> weakReference = a.get(Integer.valueOf(screenTag));
        if (weakReference == null) {
            return;
        }
        a aVar = weakReference.get();
        if (aVar != null) {
            if (aVar.h0) {
                return;
            }
            aVar.h0 = true;
            aVar.e(aVar);
            return;
        }
        Log.w("[RNScreens]", "Reference stored in NativeProxy for tag " + screenTag + " no longer points to valid object.");
    }
}
