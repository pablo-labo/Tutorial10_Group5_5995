package defpackage;

import android.content.Context;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.JavaScriptModuleRegistry;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.interop.InteropModuleRegistry;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.ReactInstance;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class zm1 extends ReactApplicationContext implements cy4 {
    public final ReactHostImpl a;
    public final AtomicReference<String> b;
    public final String c;

    public static final class a implements InvocationHandler {
        public final ReactHostImpl a;
        public final Class<? extends JavaScriptModule> b;

        public a(ReactHostImpl reactHostImpl, Class<? extends JavaScriptModule> cls) {
            reactHostImpl.getClass();
            this.a = reactHostImpl;
            this.b = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            WritableNativeArray writableNativeArray;
            obj.getClass();
            method.getClass();
            if (objArr != null) {
                writableNativeArray = Arguments.fromJavaArgs(objArr);
                writableNativeArray.getClass();
            } else {
                writableNativeArray = new WritableNativeArray();
            }
            String jSModuleName = JavaScriptModuleRegistry.INSTANCE.getJSModuleName(this.b);
            String name = method.getName();
            name.getClass();
            this.a.m(jSModuleName, name, writableNativeArray);
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm1(Context context, ReactHostImpl reactHostImpl) {
        super(context);
        context.getClass();
        this.a = reactHostImpl;
        this.b = new AtomicReference<>();
        this.c = zm1.class.getSimpleName();
        if (ie7.g0.useFabricInterop()) {
            initializeInteropModules();
        }
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final void destroy() {
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final void emitDeviceEvent(String str, Object obj) {
        str.getClass();
        WritableNativeArray writableNativeArrayFromJavaArgs = Arguments.fromJavaArgs(new Object[]{str, obj});
        writableNativeArrayFromJavaArgs.getClass();
        this.a.m("RCTDeviceEventEmitter", "emit", writableNativeArrayFromJavaArgs);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final CatalystInstance getCatalystInstance() {
        Log.w(this.c, "[WARNING] Bridgeless doesn't support CatalystInstance. Accessing an API that's not part of the new architecture is not encouraged usage.");
        return new xm1(this.a);
    }

    @Override // defpackage.cy4
    public final EventDispatcher getEventDispatcher() {
        ReactInstance reactInstance = this.a.l;
        if (reactInstance == null) {
            return c0h.V;
        }
        EventDispatcher eventDispatcher = reactInstance.f.getEventDispatcher();
        eventDispatcher.getClass();
        return eventDispatcher;
    }

    @Override // com.facebook.react.bridge.ReactContext
    @sy3
    public final UIManager getFabricUIManager() {
        ReactInstance reactInstance = this.a.l;
        if (reactInstance != null) {
            return reactInstance.f;
        }
        return null;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final CallInvokerHolder getJSCallInvokerHolder() {
        ReactHostImpl reactHostImpl = this.a;
        ReactInstance reactInstance = reactHostImpl.l;
        if (reactInstance != null) {
            return reactInstance.getJSCallInvokerHolder();
        }
        reactHostImpl.u("getJSCallInvokerHolder()", "Tried to get JSCallInvokerHolder while instance is not ready", null);
        return null;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        T t;
        cls.getClass();
        InteropModuleRegistry interopModuleRegistry = this.mInteropModuleRegistry;
        if (interopModuleRegistry != null && (t = (T) interopModuleRegistry.getInteropModule(cls)) != null) {
            return t;
        }
        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(this.a, cls));
        objNewProxyInstance.getClass();
        return (T) objNewProxyInstance;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final JavaScriptContextHolder getJavaScriptContextHolder() {
        ReactInstance reactInstance = this.a.l;
        if (reactInstance != null) {
            return reactInstance.g;
        }
        return null;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final NativeModule getNativeModule(String str) {
        str.getClass();
        ReactInstance reactInstance = this.a.l;
        if (reactInstance != null) {
            return reactInstance.e(str);
        }
        return null;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final Collection<NativeModule> getNativeModules() {
        Collection<NativeModule> modules;
        ReactInstance reactInstance = this.a.l;
        return (reactInstance == null || (modules = reactInstance.b.getModules()) == null) ? zr4.a : modules;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final String getSourceURL() {
        return this.b.get();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final void handleException(Exception exc) {
        exc.getClass();
        this.a.r(exc);
    }

    @Override // com.facebook.react.bridge.ReactContext
    @sy3
    public final boolean hasActiveCatalystInstance() {
        return this.a.l != null;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final boolean hasActiveReactInstance() {
        return this.a.l != null;
    }

    @Override // com.facebook.react.bridge.ReactContext
    @sy3
    public final boolean hasCatalystInstance() {
        return false;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        nmc nmcVar;
        cls.getClass();
        ReactInstance reactInstance = this.a.l;
        if (reactInstance == null || (nmcVar = (nmc) cls.getAnnotation(nmc.class)) == null) {
            return false;
        }
        return reactInstance.b.hasModule(nmcVar.name());
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final boolean hasReactInstance() {
        return this.a.l != null;
    }

    @Override // com.facebook.react.bridge.ReactContext
    @sy3
    public final boolean isBridgeless() {
        return true;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final void registerSegment(final int i, final String str, final Callback callback) {
        str.getClass();
        callback.getClass();
        final ReactHostImpl reactHostImpl = this.a;
        reactHostImpl.getClass();
        final String str2 = "registerSegment(segmentId = \"" + i + "\", path = \"" + str + "\")";
        reactHostImpl.t(str2, "Schedule");
        Function1 function1 = new Function1() { // from class: ilc
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ReactInstance reactInstance = (ReactInstance) obj;
                AtomicInteger atomicInteger = ReactHostImpl.A;
                reactInstance.getClass();
                reactHostImpl.t(str2, "Execute");
                reactInstance.g(i, str);
                callback.invoke(new Object[0]);
                return j6g.a;
            }
        };
        maf<Void> mafVar = maf.g;
        reactHostImpl.k.a().g(new alc(reactHostImpl, str2, function1), x15.b);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final <T extends NativeModule> T getNativeModule(Class<T> cls) {
        cls.getClass();
        return (T) this.a.o(cls);
    }
}
