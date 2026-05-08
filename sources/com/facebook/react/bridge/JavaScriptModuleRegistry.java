package com.facebook.react.bridge;

import defpackage.zve;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000e\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\t0\u0006¢\u0006\u0002\u0010\rR\"\u0010\u0004\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/bridge/JavaScriptModuleRegistry;", "", "<init>", "()V", "moduleInstances", "", "Ljava/lang/Class;", "Lcom/facebook/react/bridge/JavaScriptModule;", "getJavaScriptModule", "T", "instance", "Lcom/facebook/react/bridge/CatalystInstance;", "moduleInterface", "(Lcom/facebook/react/bridge/CatalystInstance;Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;", "JavaScriptModuleInvocationHandler", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JavaScriptModuleRegistry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<Class<? extends JavaScriptModule>, JavaScriptModule> moduleInstances = new HashMap();

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\nH\u0002J2\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/bridge/JavaScriptModuleRegistry$JavaScriptModuleInvocationHandler;", "Ljava/lang/reflect/InvocationHandler;", "catalystInstance", "Lcom/facebook/react/bridge/CatalystInstance;", "moduleInterface", "Ljava/lang/Class;", "Lcom/facebook/react/bridge/JavaScriptModule;", "<init>", "(Lcom/facebook/react/bridge/CatalystInstance;Ljava/lang/Class;)V", "name", "", "getJSModuleName", "invoke", "", "proxy", "method", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class JavaScriptModuleInvocationHandler implements InvocationHandler {
        private final CatalystInstance catalystInstance;
        private final Class<? extends JavaScriptModule> moduleInterface;
        private String name;

        public JavaScriptModuleInvocationHandler(CatalystInstance catalystInstance, Class<? extends JavaScriptModule> cls) {
            catalystInstance.getClass();
            cls.getClass();
            this.catalystInstance = catalystInstance;
            this.moduleInterface = cls;
        }

        private final String getJSModuleName() {
            String str = this.name;
            if (str != null) {
                return str;
            }
            String jSModuleName = JavaScriptModuleRegistry.INSTANCE.getJSModuleName(this.moduleInterface);
            this.name = jSModuleName;
            return jSModuleName;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] args) {
            proxy.getClass();
            method.getClass();
            WritableNativeArray writableNativeArrayFromJavaArgs = args != null ? Arguments.fromJavaArgs(args) : new WritableNativeArray();
            writableNativeArrayFromJavaArgs.getClass();
            CatalystInstance catalystInstance = this.catalystInstance;
            String jSModuleName = getJSModuleName();
            String name = method.getName();
            name.getClass();
            catalystInstance.callFunction(jSModuleName, name, writableNativeArrayFromJavaArgs);
            return null;
        }
    }

    public static final String getJSModuleName(Class<? extends JavaScriptModule> cls) {
        return INSTANCE.getJSModuleName(cls);
    }

    public final synchronized <T extends JavaScriptModule> T getJavaScriptModule(CatalystInstance instance, Class<T> moduleInterface) {
        instance.getClass();
        moduleInterface.getClass();
        T t = (T) this.moduleInstances.get(moduleInterface);
        if (t != null) {
            return t;
        }
        Object objNewProxyInstance = Proxy.newProxyInstance(moduleInterface.getClassLoader(), new Class[]{moduleInterface}, new JavaScriptModuleInvocationHandler(instance, moduleInterface));
        objNewProxyInstance.getClass();
        T t2 = (T) objNewProxyInstance;
        this.moduleInstances.put((Class<? extends JavaScriptModule>) moduleInterface, t2);
        return t2;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007H\u0007¨\u0006\t"}, d2 = {"Lcom/facebook/react/bridge/JavaScriptModuleRegistry$Companion;", "", "<init>", "()V", "getJSModuleName", "", "jsModuleInterface", "Ljava/lang/Class;", "Lcom/facebook/react/bridge/JavaScriptModule;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getJSModuleName(Class<? extends JavaScriptModule> jsModuleInterface) {
            jsModuleInterface.getClass();
            String simpleName = jsModuleInterface.getSimpleName();
            int iV = zve.V(simpleName, '$', 0, 6);
            return iV != -1 ? simpleName.substring(iV + 1) : simpleName;
        }

        private Companion() {
        }
    }
}
