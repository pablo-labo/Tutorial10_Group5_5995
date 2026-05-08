package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0086 ¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "Lexpo/modules/kotlin/jni/Destructible;", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;", "decorator", "Lj6g;", "decorate", "(Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;)V", "mHybridData", "Lcom/facebook/jni/HybridData;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JavaScriptModuleObject implements Destructible {
    public final String a;
    private final HybridData mHybridData;

    public JavaScriptModuleObject(JNIDeallocator jNIDeallocator, String str) {
        jNIDeallocator.getClass();
        this.a = str;
        this.mHybridData = initHybrid();
        jNIDeallocator.addReference(this);
    }

    private final native HybridData initHybrid();

    @Override // expo.modules.kotlin.jni.Destructible
    public final void a() {
        this.mHybridData.resetNative();
    }

    public final boolean b() {
        return this.mHybridData.isValid();
    }

    public final native void decorate(JSDecoratorsBridgingObject decorator);

    public final void finalize() {
        a();
    }

    public final String toString() {
        return "JavaScriptModuleObject_".concat(this.a);
    }
}
