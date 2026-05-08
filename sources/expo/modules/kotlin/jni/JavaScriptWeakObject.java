package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "Lexpo/modules/kotlin/jni/Destructible;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "lock", "()Lexpo/modules/kotlin/jni/JavaScriptObject;", "Lcom/facebook/jni/HybridData;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JavaScriptWeakObject implements Destructible {
    private final HybridData mHybridData;

    public JavaScriptWeakObject(HybridData hybridData) {
        hybridData.getClass();
        this.mHybridData = hybridData;
    }

    @Override // expo.modules.kotlin.jni.Destructible
    public final void a() {
        this.mHybridData.resetNative();
    }

    public final void finalize() {
        a();
    }

    public final native JavaScriptObject lock();
}
