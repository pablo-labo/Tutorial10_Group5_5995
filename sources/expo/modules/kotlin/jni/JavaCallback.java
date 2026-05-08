package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import defpackage.d49;
import defpackage.mz2;
import defpackage.o39;
import defpackage.pt7;
import defpackage.qt7;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0082 ¢\u0006\u0004\b\u0007\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\fH\u0082 ¢\u0006\u0004\b\u0007\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000eH\u0082 ¢\u0006\u0004\b\u0007\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0010H\u0082 ¢\u0006\u0004\b\u0007\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0012H\u0082 ¢\u0006\u0004\b\u0007\u0010\u0013J \u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0082 ¢\u0006\u0004\b\u0007\u0010\u0016J&\u0010\u0007\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0017H\u0082 ¢\u0006\u0004\b\u0007\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0019H\u0082 ¢\u0006\u0004\b\u0007\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u001bH\u0082 ¢\u0006\u0004\b\u0007\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u001dH\u0082 ¢\u0006\u0004\b\u0007\u0010\u001eJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012H\u0082 ¢\u0006\u0004\b\u0007\u0010!J\u0018\u0010#\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\"H\u0082 ¢\u0006\u0004\b#\u0010$J\u0018\u0010&\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020%H\u0082 ¢\u0006\u0004\b&\u0010'J\u0018\u0010)\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020(H\u0082 ¢\u0006\u0004\b)\u0010*J\u0018\u0010,\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020+H\u0082 ¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.¨\u0006/"}, d2 = {"Lexpo/modules/kotlin/jni/JavaCallback;", "Lexpo/modules/kotlin/jni/Destructible;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "Lj6g;", "invokeNative", "()V", "", "result", "(I)V", "", "(Z)V", "", "(D)V", "", "(F)V", "", "(Ljava/lang/String;)V", "", "", "(Ljava/util/Collection;)V", "", "(Ljava/util/Map;)V", "Lcom/facebook/react/bridge/WritableNativeArray;", "(Lcom/facebook/react/bridge/WritableNativeArray;)V", "Lcom/facebook/react/bridge/WritableNativeMap;", "(Lcom/facebook/react/bridge/WritableNativeMap;)V", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "(Lexpo/modules/kotlin/sharedobjects/SharedObject;)V", "code", "errorMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "", "invokeIntArray", "([I)V", "", "invokeLongArray", "([J)V", "", "invokeFloatArray", "([F)V", "", "invokeDoubleArray", "([D)V", "Lcom/facebook/jni/HybridData;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JavaCallback implements Destructible {
    private final HybridData mHybridData;

    public JavaCallback(HybridData hybridData) {
        hybridData.getClass();
        this.mHybridData = hybridData;
    }

    private final native void invokeDoubleArray(double[] result);

    private final native void invokeFloatArray(float[] result);

    private final native void invokeIntArray(int[] result);

    private final native void invokeLongArray(long[] result);

    private final native void invokeNative();

    private final native void invokeNative(double result);

    private final native void invokeNative(float result);

    private final native void invokeNative(int result);

    private final native void invokeNative(WritableNativeArray result);

    private final native void invokeNative(WritableNativeMap result);

    private final native void invokeNative(SharedObject result);

    private final native void invokeNative(String result);

    private final native void invokeNative(String code, String errorMessage);

    private final native void invokeNative(Collection<? extends Object> result);

    private final native void invokeNative(Map<String, ? extends Object> result);

    private final native void invokeNative(boolean result);

    @Override // expo.modules.kotlin.jni.Destructible
    public final void a() {
        this.mHybridData.resetNative();
    }

    public final void b() {
        try {
            invokeNative();
        } catch (Throwable th) {
            if (this.mHybridData.isValid()) {
                throw th;
            }
            d49 d49Var = mz2.a;
            d49Var.getClass();
            d49Var.a(o39.Error, "Invalidated JavaCallback was invoked", th);
        }
    }

    public final void c(double d) {
        try {
            invokeNative(d);
        } catch (Throwable th) {
            if (this.mHybridData.isValid()) {
                throw th;
            }
            d49 d49Var = mz2.a;
            d49Var.getClass();
            d49Var.a(o39.Error, "Invalidated JavaCallback was invoked", th);
        }
    }

    public final void d(float f) {
        try {
            invokeNative(f);
        } catch (Throwable th) {
            if (this.mHybridData.isValid()) {
                throw th;
            }
            d49 d49Var = mz2.a;
            d49Var.getClass();
            d49Var.a(o39.Error, "Invalidated JavaCallback was invoked", th);
        }
    }

    public final void e(int i) {
        try {
            invokeNative(i);
        } catch (Throwable th) {
            if (this.mHybridData.isValid()) {
                throw th;
            }
            d49 d49Var = mz2.a;
            d49Var.getClass();
            d49Var.a(o39.Error, "Invalidated JavaCallback was invoked", th);
        }
    }

    public final void f(Object obj) {
        try {
            Object objA = pt7.a(2, obj);
            if (objA == null) {
                invokeNative();
                return;
            }
            if (objA instanceof Integer) {
                invokeNative(((Number) objA).intValue());
                return;
            }
            if (objA instanceof Boolean) {
                invokeNative(((Boolean) objA).booleanValue());
                return;
            }
            if (objA instanceof Double) {
                invokeNative(((Number) objA).doubleValue());
                return;
            }
            if (objA instanceof Float) {
                invokeNative(((Number) objA).floatValue());
                return;
            }
            if (objA instanceof String) {
                invokeNative((String) objA);
                return;
            }
            if (objA instanceof Collection) {
                invokeNative((Collection<? extends Object>) objA);
                return;
            }
            if (objA instanceof Map) {
                invokeNative((Map<String, ? extends Object>) objA);
                return;
            }
            if (objA instanceof WritableNativeArray) {
                invokeNative((WritableNativeArray) objA);
                return;
            }
            if (objA instanceof WritableNativeMap) {
                invokeNative((WritableNativeMap) objA);
                return;
            }
            if (objA instanceof SharedObject) {
                invokeNative((SharedObject) objA);
                return;
            }
            if (objA instanceof int[]) {
                invokeIntArray((int[]) objA);
                return;
            }
            if (objA instanceof long[]) {
                invokeLongArray((long[]) objA);
                return;
            }
            if (objA instanceof float[]) {
                invokeFloatArray((float[]) objA);
            } else {
                if (objA instanceof double[]) {
                    invokeDoubleArray((double[]) objA);
                    return;
                }
                throw new UnexpectedException("Unknown type: " + objA.getClass(), null);
            }
        } catch (Throwable th) {
            if (this.mHybridData.isValid()) {
                throw th;
            }
            d49 d49Var = mz2.a;
            d49Var.getClass();
            d49Var.a(o39.Error, "Invalidated JavaCallback was invoked", th);
        }
    }

    public final void finalize() {
        a();
    }

    public final void g(String str) {
        str.getClass();
        try {
            invokeNative(str);
        } catch (Throwable th) {
            if (this.mHybridData.isValid()) {
                throw th;
            }
            d49 d49Var = mz2.a;
            d49Var.getClass();
            d49Var.a(o39.Error, "Invalidated JavaCallback was invoked", th);
        }
    }

    public final void h(String str, String str2) {
        str.getClass();
        try {
            invokeNative(str, str2);
        } catch (Throwable th) {
            if (this.mHybridData.isValid()) {
                throw th;
            }
            d49 d49Var = mz2.a;
            d49Var.getClass();
            d49Var.a(o39.Error, "Invalidated JavaCallback was invoked", th);
        }
    }

    public final void i(Map<String, ? extends Object> map) {
        try {
            invokeNative(qt7.k(map));
        } catch (Throwable th) {
            if (this.mHybridData.isValid()) {
                throw th;
            }
            d49 d49Var = mz2.a;
            d49Var.getClass();
            d49Var.a(o39.Error, "Invalidated JavaCallback was invoked", th);
        }
    }

    public final void j(boolean z) {
        try {
            invokeNative(z);
        } catch (Throwable th) {
            if (this.mHybridData.isValid()) {
                throw th;
            }
            d49 d49Var = mz2.a;
            d49Var.getClass();
            d49Var.a(o39.Error, "Invalidated JavaCallback was invoked", th);
        }
    }
}
