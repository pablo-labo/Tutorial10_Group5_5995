package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import defpackage.g35;
import defpackage.x9;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0086 ¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0086 ¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0086 ¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001cH\u0082 ¢\u0006\u0004\b\u001d\u0010\u001eJ\"\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0082 ¢\u0006\u0004\b\u001f\u0010 J\"\u0010!\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bH\u0082 ¢\u0006\u0004\b!\u0010\"J\"\u0010#\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0000H\u0082 ¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b%\u0010&J(\u0010(\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u0014H\u0082 ¢\u0006\u0004\b(\u0010)J(\u0010*\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u0014H\u0082 ¢\u0006\u0004\b*\u0010+J*\u0010,\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010'\u001a\u00020\u0014H\u0082 ¢\u0006\u0004\b,\u0010-J*\u0010.\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020\u0014H\u0082 ¢\u0006\u0004\b.\u0010/J*\u00100\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00002\u0006\u0010'\u001a\u00020\u0014H\u0082 ¢\u0006\u0004\b0\u00101J\u0018\u00104\u001a\u00020\u00162\u0006\u00103\u001a\u000202H\u0082 ¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u00106¨\u00067"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptObject;", "Lexpo/modules/kotlin/jni/Destructible;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "", "name", "", "hasProperty", "(Ljava/lang/String;)Z", "Lexpo/modules/kotlin/jni/JavaScriptValue;", "getProperty", "(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptValue;", "", "getPropertyNames", "()[Ljava/lang/String;", "Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "createWeak", "()Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "", "size", "Lj6g;", "setExternalMemoryPressure", "(I)V", "value", "setBoolProperty", "(Ljava/lang/String;Z)V", "", "setDoubleProperty", "(Ljava/lang/String;D)V", "setStringProperty", "(Ljava/lang/String;Ljava/lang/String;)V", "setJSValueProperty", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JavaScriptValue;)V", "setJSObjectProperty", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JavaScriptObject;)V", "unsetProperty", "(Ljava/lang/String;)V", "options", "defineBoolProperty", "(Ljava/lang/String;ZI)V", "defineDoubleProperty", "(Ljava/lang/String;DI)V", "defineStringProperty", "(Ljava/lang/String;Ljava/lang/String;I)V", "defineJSValueProperty", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JavaScriptValue;I)V", "defineJSObjectProperty", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JavaScriptObject;I)V", "Lexpo/modules/kotlin/jni/JNIFunctionBody;", "deallocator", "defineNativeDeallocator", "(Lexpo/modules/kotlin/jni/JNIFunctionBody;)V", "Lcom/facebook/jni/HybridData;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class JavaScriptObject implements Destructible {
    private final HybridData mHybridData;

    public JavaScriptObject(HybridData hybridData) {
        hybridData.getClass();
        this.mHybridData = hybridData;
    }

    public static void c(int i, JavaScriptObject javaScriptObject) {
        javaScriptObject.defineDoubleProperty("__expo_shared_object_id__", i, 0);
    }

    public static void d(String str, JavaScriptObject javaScriptObject) {
        javaScriptObject.defineStringProperty("nativeRefType", str, 0);
    }

    private final native void defineBoolProperty(String name, boolean value, int options);

    private final native void defineDoubleProperty(String name, double value, int options);

    private final native void defineJSObjectProperty(String name, JavaScriptObject value, int options);

    private final native void defineJSValueProperty(String name, JavaScriptValue value, int options);

    private final native void defineNativeDeallocator(JNIFunctionBody deallocator);

    private final native void defineStringProperty(String name, String value, int options);

    private final native void setBoolProperty(String name, boolean value);

    private final native void setDoubleProperty(String name, double value);

    private final native void setJSObjectProperty(String name, JavaScriptObject value);

    private final native void setJSValueProperty(String name, JavaScriptValue value);

    private final native void setStringProperty(String name, String value);

    private final native void unsetProperty(String name);

    @Override // expo.modules.kotlin.jni.Destructible
    public final void a() {
        this.mHybridData.resetNative();
    }

    public final void b(x9 x9Var) {
        defineNativeDeallocator(new g35(x9Var));
    }

    public final native JavaScriptWeakObject createWeak();

    public final void finalize() {
        a();
    }

    public final native JavaScriptValue getProperty(String name);

    public final native String[] getPropertyNames();

    public final native boolean hasProperty(String name);

    public final native void setExternalMemoryPressure(int size);
}
