package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.soloader.SoLoader;
import defpackage.b49;
import defpackage.dy9;
import defpackage.i62;
import defpackage.j6g;
import defpackage.nz2;
import defpackage.ohd;
import defpackage.qde;
import defpackage.wl7;
import defpackage.x9;
import defpackage.zx9;
import expo.modules.kotlin.exception.Exceptions$AppContextLost;
import expo.modules.kotlin.sharedobjects.SharedObject;
import expo.modules.kotlin.sharedobjects.SharedRef;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0082 ¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082 ¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0086 ¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0086 ¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dH\u0086 ¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u001dH\u0086 ¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u000fH\u0086 ¢\u0006\u0004\b!\u0010\u0005J \u0010%\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001dH\u0086 ¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010'\u001a\u00020\u0016H\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010'\u001a\u00020\u0016H\u0007¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00160.H\u0007¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u000f2\u0006\u00102\u001a\u0002012\u0006\u0010$\u001a\u00020\u001dH\u0007¢\u0006\u0004\b3\u00104J\u0019\u00105\u001a\u0004\u0018\u00010\u001d2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b7\u00108J#\u0010:\u001a\u00020\u000f2\n\u00102\u001a\u0006\u0012\u0002\b\u0003092\u0006\u0010$\u001a\u00020\u001dH\u0007¢\u0006\u0004\b:\u0010;J\u001d\u0010<\u001a\u0004\u0018\u00010\u001d2\n\u00102\u001a\u0006\u0012\u0002\b\u000309H\u0007¢\u0006\u0004\b<\u0010=J\u0011\u0010>\u001a\u0004\u0018\u00010(H\u0007¢\u0006\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lexpo/modules/kotlin/jni/JSIContext;", "Lexpo/modules/kotlin/jni/Destructible;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "<init>", "()V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "", "jsRuntimePointer", "Lexpo/modules/kotlin/jni/JNIDeallocator;", "jniDeallocator", "Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "jsInvokerHolder", "Lj6g;", "installJSI", "(JLexpo/modules/kotlin/jni/JNIDeallocator;Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;)V", "Lcom/facebook/react/bridge/RuntimeExecutor;", "runtimeExecutor", "installJSIForBridgeless", "(JLexpo/modules/kotlin/jni/JNIDeallocator;Lcom/facebook/react/bridge/RuntimeExecutor;)V", "", "script", "Lexpo/modules/kotlin/jni/JavaScriptValue;", "evaluateScript", "(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptValue;", "evaluateVoidScript", "(Ljava/lang/String;)V", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "global", "()Lexpo/modules/kotlin/jni/JavaScriptObject;", "createObject", "drainJSEventLoop", "", "id", "js", "setNativeStateForSharedObject", "(ILexpo/modules/kotlin/jni/JavaScriptObject;)V", "name", "Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "getJavaScriptModuleObject", "(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "", "hasModule", "(Ljava/lang/String;)Z", "", "getJavaScriptModulesName", "()[Ljava/lang/String;", "", "native", "registerSharedObject", "(Ljava/lang/Object;Lexpo/modules/kotlin/jni/JavaScriptObject;)V", "getSharedObject", "(I)Lexpo/modules/kotlin/jni/JavaScriptObject;", "deleteSharedObject", "(I)V", "Ljava/lang/Class;", "registerClass", "(Ljava/lang/Class;Lexpo/modules/kotlin/jni/JavaScriptObject;)V", "getJavascriptClass", "(Ljava/lang/Class;)Lexpo/modules/kotlin/jni/JavaScriptObject;", "getCoreModuleObject", "()Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "mHybridData", "Lcom/facebook/jni/HybridData;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JSIContext implements Destructible, AutoCloseable {
    public WeakReference<ohd> a;
    private final HybridData mHybridData = initHybrid();

    static {
        SoLoader.l("expo-modules-core");
    }

    private final native HybridData initHybrid();

    private final native void installJSI(long jsRuntimePointer, JNIDeallocator jniDeallocator, CallInvokerHolderImpl jsInvokerHolder);

    private final native void installJSIForBridgeless(long jsRuntimePointer, JNIDeallocator jniDeallocator, RuntimeExecutor runtimeExecutor);

    @Override // expo.modules.kotlin.jni.Destructible
    public final void a() {
        this.mHybridData.resetNative();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        a();
    }

    public final native JavaScriptObject createObject();

    public final void deleteSharedObject(int id) {
        b49 b49Var;
        Pair pair;
        ohd ohdVar = h().get();
        if (ohdVar == null || (b49Var = ohdVar.g) == null) {
            return;
        }
        synchronized (b49Var) {
            pair = (Pair) ((LinkedHashMap) b49Var.c).remove(new qde(id));
        }
        if (pair != null) {
            SharedObject sharedObject = (SharedObject) pair.a();
            sharedObject.a = 0;
            sharedObject.P();
        }
    }

    public final native void drainJSEventLoop();

    public final native JavaScriptValue evaluateScript(String script);

    public final native void evaluateVoidScript(String script);

    public final void finalize() {
        a();
    }

    public final JavaScriptModuleObject getCoreModuleObject() {
        zx9<nz2> zx9Var;
        ohd ohdVar = h().get();
        if (ohdVar == null || (zx9Var = ohdVar.e) == null) {
            return null;
        }
        return (JavaScriptModuleObject) zx9Var.d.getValue();
    }

    public final JavaScriptModuleObject getJavaScriptModuleObject(String name) {
        dy9 dy9Var;
        zx9<?> zx9VarB;
        name.getClass();
        ohd ohdVar = h().get();
        if (ohdVar == null || (dy9Var = ohdVar.c) == null || (zx9VarB = dy9Var.b(name)) == null) {
            return null;
        }
        return (JavaScriptModuleObject) zx9VarB.d.getValue();
    }

    public final String[] getJavaScriptModulesName() {
        dy9 dy9Var;
        LinkedHashMap linkedHashMap;
        Set setKeySet;
        String[] strArr;
        ohd ohdVar = h().get();
        return (ohdVar == null || (dy9Var = ohdVar.c) == null || (linkedHashMap = dy9Var.b) == null || (setKeySet = linkedHashMap.keySet()) == null || (strArr = (String[]) setKeySet.toArray(new String[0])) == null) ? new String[0] : strArr;
    }

    public final JavaScriptObject getJavascriptClass(Class<?> cls) {
        i62 i62Var;
        cls.getClass();
        ohd ohdVar = h().get();
        if (ohdVar == null || (i62Var = ohdVar.h) == null) {
            return null;
        }
        return (JavaScriptObject) ((LinkedHashMap) i62Var.a).get(cls);
    }

    public final JavaScriptObject getSharedObject(int id) {
        SharedObject sharedObjectA;
        JavaScriptWeakObject javaScriptWeakObject;
        ohd ohdVar = h().get();
        JavaScriptObject javaScriptObjectLock = null;
        if (ohdVar == null || (sharedObjectA = qde.a(id, ohdVar)) == null) {
            return null;
        }
        b49 b49Var = ohdVar.g;
        b49Var.getClass();
        synchronized (b49Var) {
            Pair pair = (Pair) ((LinkedHashMap) b49Var.c).get(new qde(sharedObjectA.a));
            if (pair != null && (javaScriptWeakObject = (JavaScriptWeakObject) pair.e()) != null) {
                javaScriptObjectLock = javaScriptWeakObject.lock();
            }
        }
        return javaScriptObjectLock;
    }

    public final native JavaScriptObject global();

    public final WeakReference<ohd> h() {
        WeakReference<ohd> weakReference = this.a;
        if (weakReference != null) {
            return weakReference;
        }
        wl7.g("runtimeContextHolder");
        throw null;
    }

    public final boolean hasModule(String name) {
        dy9 dy9Var;
        name.getClass();
        ohd ohdVar = h().get();
        if (ohdVar == null || (dy9Var = ohdVar.c) == null) {
            return false;
        }
        return dy9Var.b.containsKey(name);
    }

    public final void p(ohd ohdVar, long j, CallInvokerHolderImpl callInvokerHolderImpl) {
        ohdVar.getClass();
        this.a = new WeakReference<>(ohdVar);
        installJSI(j, ohdVar.f, callInvokerHolderImpl);
    }

    public final void registerClass(Class<?> cls, JavaScriptObject js) {
        i62 i62Var;
        cls.getClass();
        js.getClass();
        ohd ohdVar = h().get();
        if (ohdVar == null || (i62Var = ohdVar.h) == null) {
            return;
        }
        js.b(new x9(5, i62Var, cls));
        ((LinkedHashMap) i62Var.a).put(cls, js);
    }

    public final void registerSharedObject(Object obj, JavaScriptObject js) throws Exceptions$AppContextLost {
        b49 b49Var;
        int i;
        obj.getClass();
        js.getClass();
        ohd ohdVar = h().get();
        if (ohdVar == null || (b49Var = ohdVar.g) == null) {
            return;
        }
        SharedObject sharedObject = (SharedObject) obj;
        synchronized (b49Var) {
            i = b49Var.a;
            b49Var.a = i + 1;
        }
        sharedObject.a = i;
        JavaScriptObject.c(i, js);
        ohd ohdVar2 = (ohd) ((WeakReference) b49Var.b).get();
        if (ohdVar2 == null) {
            throw new Exceptions$AppContextLost();
        }
        ohdVar2.a().setNativeStateForSharedObject(i, js);
        int iG = sharedObject.G();
        if (iG > 0) {
            js.setExternalMemoryPressure(iG);
        }
        if (sharedObject instanceof SharedRef) {
            JavaScriptObject.d(((SharedRef) sharedObject).getE(), js);
        }
        JavaScriptWeakObject javaScriptWeakObjectCreateWeak = js.createWeak();
        synchronized (b49Var) {
            ((LinkedHashMap) b49Var.c).put(new qde(i), new Pair(sharedObject, javaScriptWeakObjectCreateWeak));
            j6g j6gVar = j6g.a;
        }
        if (sharedObject.b.get() == null) {
            sharedObject.b = new WeakReference<>(ohdVar2);
        }
    }

    public final void s(ohd ohdVar, long j, RuntimeExecutor runtimeExecutor) {
        ohdVar.getClass();
        this.a = new WeakReference<>(ohdVar);
        installJSIForBridgeless(j, ohdVar.f, runtimeExecutor);
    }

    public final native void setNativeStateForSharedObject(int id, JavaScriptObject js);
}
