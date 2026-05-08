package com.facebook.react.runtime;

import com.facebook.jni.HybridData;
import com.facebook.jni.annotations.DoNotStripAny;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.soloader.SoLoader;
import defpackage.cw7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@DoNotStripAny
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/runtime/JSTimerExecutor;", "Lcw7;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "Lcom/facebook/react/bridge/WritableNativeArray;", "timerIDs", "Lj6g;", "callTimers", "(Lcom/facebook/react/bridge/WritableNativeArray;)V", "Lcom/facebook/react/bridge/WritableArray;", "(Lcom/facebook/react/bridge/WritableArray;)V", "", "frameTime", "callIdleCallbacks", "(D)V", "", "warningMessage", "emitTimeDriftWarning", "(Ljava/lang/String;)V", "Lcom/facebook/jni/HybridData;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JSTimerExecutor implements cw7 {
    private static final a Companion = new a();
    private final HybridData mHybridData;

    public static final class a {
    }

    static {
        SoLoader.l("rninstance");
    }

    public JSTimerExecutor(HybridData hybridData) {
        hybridData.getClass();
        this.mHybridData = hybridData;
    }

    private final native void callTimers(WritableNativeArray timerIDs);

    @Override // defpackage.cw7
    public void callIdleCallbacks(double frameTime) {
    }

    @Override // defpackage.cw7
    public void callTimers(WritableArray timerIDs) {
        timerIDs.getClass();
        callTimers((WritableNativeArray) timerIDs);
    }

    @Override // defpackage.cw7
    public void emitTimeDriftWarning(String warningMessage) {
        warningMessage.getClass();
    }
}
