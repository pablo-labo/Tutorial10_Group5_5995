package com.facebook.react.bridge;

import android.os.Trace;
import com.facebook.react.uimanager.UIManagerModule;
import defpackage.akb;
import defpackage.h5;
import defpackage.iy8;
import defpackage.jpf;
import defpackage.nmc;
import defpackage.r6;
import defpackage.u63;
import defpackage.wl7;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\n\u0018\u0000 /2\u00020\u0001:\u0001/B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0015J%\u0010\u001d\u001a\u00020\u001c\"\b\b\u0000\u0010\u0019*\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\u001f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0019*\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\"J\u0015\u0010\u001f\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060\f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00180\f8F¢\u0006\u0006\u001a\u0004\b-\u0010+¨\u00060"}, d2 = {"Lcom/facebook/react/bridge/NativeModuleRegistry;", "", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactApplicationContext", "", "", "Lcom/facebook/react/bridge/ModuleHolder;", "modules", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/Map;)V", "Lcom/facebook/react/bridge/JSInstance;", "jsInstance", "", "Lcom/facebook/react/bridge/JavaModuleWrapper;", "getJavaModules", "(Lcom/facebook/react/bridge/JSInstance;)Ljava/util/List;", "newRegister", "Lj6g;", "registerModules", "(Lcom/facebook/react/bridge/NativeModuleRegistry;)V", "notifyJSInstanceDestroy", "()V", "notifyJSInstanceInitialized", "onBatchComplete", "Lcom/facebook/react/bridge/NativeModule;", "T", "Ljava/lang/Class;", "moduleInterface", "", "hasModule", "(Ljava/lang/Class;)Z", "getModule", "(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;", "name", "(Ljava/lang/String;)Z", "(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Ljava/util/Map;", "", "getModuleMap", "()Ljava/util/Map;", "moduleMap", "getCxxModules", "()Ljava/util/List;", "cxxModules", "getAllModules", "allModules", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeModuleRegistry {
    private static final Companion Companion = new Companion(null);
    private final Map<String, ModuleHolder> modules;
    private final ReactApplicationContext reactApplicationContext;

    public NativeModuleRegistry(ReactApplicationContext reactApplicationContext, Map<String, ModuleHolder> map) {
        reactApplicationContext.getClass();
        map.getClass();
        this.reactApplicationContext = reactApplicationContext;
        this.modules = map;
    }

    private final Map<String, ModuleHolder> getModuleMap() {
        return this.modules;
    }

    public final List<NativeModule> getAllModules() {
        iy8 iy8VarS = u63.s();
        Iterator<ModuleHolder> it = this.modules.values().iterator();
        while (it.hasNext()) {
            iy8VarS.add(it.next().getModule());
        }
        return iy8VarS.l();
    }

    public final List<ModuleHolder> getCxxModules() {
        iy8 iy8VarS = u63.s();
        Iterator<Map.Entry<String, ModuleHolder>> it = this.modules.entrySet().iterator();
        while (it.hasNext()) {
            ModuleHolder value = it.next().getValue();
            if (value.isCxxModule()) {
                iy8VarS.add(value);
            }
        }
        return iy8VarS.l();
    }

    public final List<JavaModuleWrapper> getJavaModules(JSInstance jsInstance) {
        jsInstance.getClass();
        iy8 iy8VarS = u63.s();
        Iterator<Map.Entry<String, ModuleHolder>> it = this.modules.entrySet().iterator();
        while (it.hasNext()) {
            ModuleHolder value = it.next().getValue();
            if (!value.isCxxModule()) {
                iy8VarS.add(new JavaModuleWrapper(jsInstance, value));
            }
        }
        return iy8VarS.l();
    }

    public final <T extends NativeModule> T getModule(Class<T> moduleInterface) {
        moduleInterface.getClass();
        nmc nmcVar = (nmc) moduleInterface.getAnnotation(nmc.class);
        if (nmcVar == null) {
            h5.k("Could not find @ReactModule annotation in class ".concat(moduleInterface.getName()));
            return null;
        }
        ModuleHolder moduleHolder = this.modules.get(nmcVar.name());
        if (moduleHolder != null) {
            T t = (T) moduleHolder.getModule();
            t.getClass();
            return t;
        }
        throw new IllegalStateException((nmcVar + ".name could not be found. Is it defined in " + moduleInterface.getName()).toString());
    }

    public final <T extends NativeModule> boolean hasModule(Class<T> moduleInterface) {
        moduleInterface.getClass();
        nmc nmcVar = (nmc) moduleInterface.getAnnotation(nmc.class);
        if (nmcVar != null) {
            return this.modules.containsKey(nmcVar.name());
        }
        h5.k("Could not find @ReactModule annotation in class ".concat(moduleInterface.getName()));
        return false;
    }

    public final void notifyJSInstanceDestroy() {
        this.reactApplicationContext.assertOnNativeModulesQueueThread();
        Trace.beginSection(jpf.g("NativeModuleRegistry_notifyJSInstanceDestroy"));
        try {
            Iterator<ModuleHolder> it = this.modules.values().iterator();
            while (it.hasNext()) {
                it.next().destroy();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void notifyJSInstanceInitialized() {
        this.reactApplicationContext.assertOnNativeModulesQueueThread("From version React Native v0.44, native modules are explicitly not initialized on the UI thread.");
        ReactMarker.logMarker(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_START);
        Trace.beginSection(jpf.g("NativeModuleRegistry_notifyJSInstanceInitialized"));
        try {
            Iterator<ModuleHolder> it = this.modules.values().iterator();
            while (it.hasNext()) {
                it.next().markInitializable$ReactAndroid_release();
            }
        } finally {
            Trace.endSection();
            ReactMarker.logMarker(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_END);
        }
    }

    public final void onBatchComplete() {
        ModuleHolder moduleHolder = this.modules.get(UIManagerModule.NAME);
        if (moduleHolder == null || !moduleHolder.hasInstance$ReactAndroid_release()) {
            return;
        }
        NativeModule module = moduleHolder.getModule();
        module.getClass();
        ((OnBatchCompleteListener) module).onBatchComplete();
    }

    public final void registerModules(NativeModuleRegistry newRegister) {
        newRegister.getClass();
        if (!wl7.b(this.reactApplicationContext, newRegister.reactApplicationContext)) {
            r6.g("Extending native modules with non-matching application contexts.");
            return;
        }
        for (Map.Entry<String, ModuleHolder> entry : newRegister.getModuleMap().entrySet()) {
            String key = entry.getKey();
            ModuleHolder value = entry.getValue();
            if (!this.modules.containsKey(key)) {
                this.modules.put(key, value);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/bridge/NativeModuleRegistry$Companion;", "", "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final boolean hasModule(String name) {
        name.getClass();
        return this.modules.containsKey(name);
    }

    public final NativeModule getModule(String name) {
        name.getClass();
        ModuleHolder moduleHolder = this.modules.get(name);
        if (moduleHolder != null) {
            return moduleHolder.getModule();
        }
        akb.n("Could not find module with name ".concat(name));
        return null;
    }
}
