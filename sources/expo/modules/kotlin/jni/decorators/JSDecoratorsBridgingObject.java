package expo.modules.kotlin.jni.decorators;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import expo.modules.kotlin.jni.Destructible;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIAsyncFunctionBody;
import expo.modules.kotlin.jni.JNIDeallocator;
import expo.modules.kotlin.jni.JNIFunctionBody;
import expo.modules.kotlin.jni.JNINoArgsFunctionBody;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0086 ¢\u0006\u0004\b\b\u0010\tJ>\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0086 ¢\u0006\u0004\b\u0014\u0010\u0015J>\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0016H\u0086 ¢\u0006\u0004\b\u0017\u0010\u0018JX\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012H\u0086 ¢\u0006\u0004\b\u001f\u0010 J\"\u0010\"\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010!H\u0086 ¢\u0006\u0004\b\"\u0010#J \u0010%\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0000H\u0086 ¢\u0006\u0004\b%\u0010&JT\u0010+\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\f\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010(2\u0006\u0010*\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0086 ¢\u0006\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;", "Lexpo/modules/kotlin/jni/Destructible;", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "Lcom/facebook/react/bridge/NativeMap;", "constants", "Lj6g;", "registerConstants", "(Lcom/facebook/react/bridge/NativeMap;)V", "", "name", "", "takesOwner", "enumerable", "", "Lexpo/modules/kotlin/jni/ExpectedType;", "desiredTypes", "Lexpo/modules/kotlin/jni/JNIFunctionBody;", "body", "registerSyncFunction", "(Ljava/lang/String;ZZ[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIFunctionBody;)V", "Lexpo/modules/kotlin/jni/JNIAsyncFunctionBody;", "registerAsyncFunction", "(Ljava/lang/String;ZZ[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIAsyncFunctionBody;)V", "getterTakesOwner", "getterExpectedType", "getter", "setterTakesOwner", "setterExpectedType", "setter", "registerProperty", "(Ljava/lang/String;Z[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIFunctionBody;Z[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIFunctionBody;)V", "Lexpo/modules/kotlin/jni/JNINoArgsFunctionBody;", "registerConstant", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JNINoArgsFunctionBody;)V", "jsDecoratorsBridgingObject", "registerObject", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;)V", "prototypeDecorator", "Ljava/lang/Class;", "ownerClass", "isSharedRef", "registerClass", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;ZLjava/lang/Class;Z[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIFunctionBody;)V", "mHybridData", "Lcom/facebook/jni/HybridData;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JSDecoratorsBridgingObject implements Destructible {
    private final HybridData mHybridData;

    public JSDecoratorsBridgingObject(JNIDeallocator jNIDeallocator) {
        jNIDeallocator.getClass();
        this.mHybridData = initHybrid();
        jNIDeallocator.addReference(this);
    }

    private final native HybridData initHybrid();

    @Override // expo.modules.kotlin.jni.Destructible
    public final void a() {
        this.mHybridData.resetNative();
    }

    public final void finalize() {
        a();
    }

    public final native void registerAsyncFunction(String name, boolean takesOwner, boolean enumerable, ExpectedType[] desiredTypes, JNIAsyncFunctionBody body);

    public final native void registerClass(String name, JSDecoratorsBridgingObject prototypeDecorator, boolean takesOwner, Class<?> ownerClass, boolean isSharedRef, ExpectedType[] desiredTypes, JNIFunctionBody body);

    public final native void registerConstant(String name, JNINoArgsFunctionBody getter);

    public final native void registerConstants(NativeMap constants);

    public final native void registerObject(String name, JSDecoratorsBridgingObject jsDecoratorsBridgingObject);

    public final native void registerProperty(String name, boolean getterTakesOwner, ExpectedType[] getterExpectedType, JNIFunctionBody getter, boolean setterTakesOwner, ExpectedType[] setterExpectedType, JNIFunctionBody setter);

    public final native void registerSyncFunction(String name, boolean takesOwner, boolean enumerable, ExpectedType[] desiredTypes, JNIFunctionBody body);
}
