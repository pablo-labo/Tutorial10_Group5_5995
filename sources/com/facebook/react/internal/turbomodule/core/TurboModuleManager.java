package com.facebook.react.internal.turbomodule.core;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.internal.turbomodule.core.TurboModuleInteropUtils;
import com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.NativeMethodCallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.turbomodule.core.interfaces.NativeMethodCallInvokerHolder;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.soloader.SoLoader;
import defpackage.f84;
import defpackage.h5;
import defpackage.j6g;
import defpackage.l5;
import defpackage.s55;
import defpackage.z92;
import defpackage.zr4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0007\u0018\u0000 K2\u00020\u0001:\u0003LMKB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010!\u001a\u0004\u0018\u00010\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\"J2\u0010(\u001a\u00020'2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020#2\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0082 ¢\u0006\u0004\b(\u0010)J\u0018\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020\u000eH\u0082 ¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u0004\u0018\u00010\u00142\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b.\u0010\u0016J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b/\u0010\u0010J\u000f\u00100\u001a\u00020+H\u0016¢\u0006\u0004\b0\u00101R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R \u00104\u001a\b\u0012\u0004\u0012\u00020\f038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010:R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b?\u0010@R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001e0A8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020'8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bD\u0010E\u0012\u0004\bF\u00101R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00140G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006N"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;", "Lcom/facebook/react/internal/turbomodule/core/interfaces/TurboModuleRegistry;", "Lcom/facebook/react/bridge/RuntimeExecutor;", "runtimeExecutor", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;", "delegate", "Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;", "jsCallInvokerHolder", "Lcom/facebook/react/turbomodule/core/interfaces/NativeMethodCallInvokerHolder;", "nativeMethodCallInvokerHolder", "<init>", "(Lcom/facebook/react/bridge/RuntimeExecutor;Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;Lcom/facebook/react/turbomodule/core/interfaces/NativeMethodCallInvokerHolder;)V", "", "moduleName", "", "isTurboModule", "(Ljava/lang/String;)Z", "isLegacyModule", "shouldEnableLegacyModuleInterop", "()Z", "Lcom/facebook/react/bridge/NativeModule;", "getLegacyJavaModule", "(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;", "Lcom/facebook/react/bridge/CxxModuleWrapper;", "getLegacyCxxModule", "(Ljava/lang/String;)Lcom/facebook/react/bridge/CxxModuleWrapper;", "getTurboLegacyCxxModule", "Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;", "getTurboJavaModule", "(Ljava/lang/String;)Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;", "moduleHolder", "shouldPerfLog", "getOrCreateModule", "(Ljava/lang/String;Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;Z)Lcom/facebook/react/bridge/NativeModule;", "Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "Lcom/facebook/react/turbomodule/core/NativeMethodCallInvokerHolderImpl;", "nativeMethodCallInvoker", "tmmDelegate", "Lcom/facebook/jni/HybridData;", "initHybrid", "(Lcom/facebook/react/bridge/RuntimeExecutor;Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;Lcom/facebook/react/turbomodule/core/NativeMethodCallInvokerHolderImpl;Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;)Lcom/facebook/jni/HybridData;", "shouldCreateLegacyModules", "Lj6g;", "installJSIBindings", "(Z)V", "getModule", "hasModule", "invalidate", "()V", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;", "", "eagerInitModuleNames", "Ljava/util/List;", "getEagerInitModuleNames", "()Ljava/util/List;", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleProvider;", "turboModuleProvider", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleProvider;", "legacyModuleProvider", "Ljava/lang/Object;", "moduleCleanupLock", "Ljava/lang/Object;", "moduleCleanupStarted", "Z", "", "moduleHolders", "Ljava/util/Map;", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", "", "getModules", "()Ljava/util/Collection;", "modules", "Companion", "ModuleHolder", "ModuleProvider", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TurboModuleManager implements TurboModuleRegistry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "TurboModuleManager";
    private final TurboModuleManagerDelegate delegate;
    private final List<String> eagerInitModuleNames;
    private final ModuleProvider legacyModuleProvider;

    @f84
    private final HybridData mHybridData;
    private final Object moduleCleanupLock;
    private boolean moduleCleanupStarted;
    private final Map<String, ModuleHolder> moduleHolders;
    private final ModuleProvider turboModuleProvider;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R$\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0013\u0010\u0012R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;", "", "<init>", "()V", "Lj6g;", "startCreatingModule", "endCreatingModule", "Lcom/facebook/react/bridge/NativeModule;", "module", "Lcom/facebook/react/bridge/NativeModule;", "getModule", "()Lcom/facebook/react/bridge/NativeModule;", "setModule", "(Lcom/facebook/react/bridge/NativeModule;)V", "", "value", "isCreatingModule", "Z", "()Z", "isDoneCreatingModule", "", "moduleId", "I", "getModuleId", "()I", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ModuleHolder {
        private static volatile int holderCount;
        private volatile boolean isCreatingModule;
        private volatile boolean isDoneCreatingModule;
        private volatile NativeModule module;
        private volatile int moduleId = holderCount;

        public ModuleHolder() {
            holderCount++;
        }

        public final void endCreatingModule() {
            this.isCreatingModule = false;
            this.isDoneCreatingModule = true;
        }

        public final NativeModule getModule() {
            return this.module;
        }

        public final int getModuleId() {
            return this.moduleId;
        }

        /* JADX INFO: renamed from: isCreatingModule, reason: from getter */
        public final boolean getIsCreatingModule() {
            return this.isCreatingModule;
        }

        /* JADX INFO: renamed from: isDoneCreatingModule, reason: from getter */
        public final boolean getIsDoneCreatingModule() {
            return this.isDoneCreatingModule;
        }

        public final void setModule(NativeModule nativeModule) {
            this.module = nativeModule;
        }

        public final void startCreatingModule() {
            this.isCreatingModule = true;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bâ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleProvider;", "", "getModule", "Lcom/facebook/react/bridge/NativeModule;", "name", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ModuleProvider {
        NativeModule getModule(String name);
    }

    static {
        SoLoader.l("turbomodulejsijni");
    }

    public TurboModuleManager(RuntimeExecutor runtimeExecutor, TurboModuleManagerDelegate turboModuleManagerDelegate, CallInvokerHolder callInvokerHolder, NativeMethodCallInvokerHolder nativeMethodCallInvokerHolder) {
        List<String> eagerInitModuleNames;
        runtimeExecutor.getClass();
        callInvokerHolder.getClass();
        nativeMethodCallInvokerHolder.getClass();
        this.delegate = turboModuleManagerDelegate;
        this.moduleCleanupLock = new Object();
        this.moduleHolders = new LinkedHashMap();
        this.mHybridData = initHybrid(runtimeExecutor, (CallInvokerHolderImpl) callInvokerHolder, (NativeMethodCallInvokerHolderImpl) nativeMethodCallInvokerHolder, turboModuleManagerDelegate);
        installJSIBindings(shouldEnableLegacyModuleInterop());
        this.eagerInitModuleNames = (turboModuleManagerDelegate == null || (eagerInitModuleNames = turboModuleManagerDelegate.getEagerInitModuleNames()) == null) ? zr4.a : eagerInitModuleNames;
        ModuleProvider aVar = new a();
        this.turboModuleProvider = turboModuleManagerDelegate == null ? aVar : new ModuleProvider() { // from class: com.facebook.react.internal.turbomodule.core.b
            @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManager.ModuleProvider
            public final NativeModule getModule(String str) {
                return TurboModuleManager._init_$lambda$1(this.a, str);
            }
        };
        if (turboModuleManagerDelegate != null && shouldEnableLegacyModuleInterop()) {
            aVar = new ModuleProvider() { // from class: com.facebook.react.internal.turbomodule.core.c
                @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManager.ModuleProvider
                public final NativeModule getModule(String str) {
                    return TurboModuleManager._init_$lambda$3(this.a, str);
                }
            };
        }
        this.legacyModuleProvider = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule _init_$lambda$0(String str) {
        str.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule _init_$lambda$1(TurboModuleManager turboModuleManager, String str) {
        str.getClass();
        return (NativeModule) turboModuleManager.delegate.getModule(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule _init_$lambda$3(TurboModuleManager turboModuleManager, String str) {
        str.getClass();
        NativeModule legacyModule = turboModuleManager.delegate.getLegacyModule(str);
        if (legacyModule != null) {
            if (!(legacyModule instanceof TurboModule)) {
                return legacyModule;
            }
            h5.k(l5.m("NativeModule \"", str, "\" is a TurboModule"));
        }
        return null;
    }

    @f84
    private final CxxModuleWrapper getLegacyCxxModule(String moduleName) {
        if (!isLegacyModule(moduleName)) {
            return null;
        }
        NativeModule module = getModule(moduleName);
        if (!(module instanceof CxxModuleWrapper) || (module instanceof TurboModule)) {
            return null;
        }
        return (CxxModuleWrapper) module;
    }

    @f84
    private final NativeModule getLegacyJavaModule(String moduleName) {
        if (!isLegacyModule(moduleName)) {
            return null;
        }
        NativeModule module = getModule(moduleName);
        if ((module instanceof CxxModuleWrapper) || (module instanceof TurboModule)) {
            return null;
        }
        return module;
    }

    private static /* synthetic */ void getMHybridData$annotations() {
    }

    @f84
    private static final List<TurboModuleInteropUtils.MethodDescriptor> getMethodDescriptorsFromModule(NativeModule nativeModule) {
        return INSTANCE.getMethodDescriptorsFromModule(nativeModule);
    }

    private final NativeModule getOrCreateModule(String moduleName, ModuleHolder moduleHolder, boolean shouldPerfLog) {
        boolean z;
        NativeModule module;
        synchronized (moduleHolder) {
            try {
                if (moduleHolder.getIsDoneCreatingModule()) {
                    if (shouldPerfLog) {
                        TurboModulePerfLogger.moduleCreateCacheHit(moduleName, moduleHolder.getModuleId());
                    }
                    return moduleHolder.getModule();
                }
                boolean z2 = false;
                if (moduleHolder.getIsCreatingModule()) {
                    z = false;
                } else {
                    moduleHolder.startCreatingModule();
                    z = true;
                }
                j6g j6gVar = j6g.a;
                if (!z) {
                    synchronized (moduleHolder) {
                        while (moduleHolder.getIsCreatingModule()) {
                            try {
                                moduleHolder.wait();
                            } catch (InterruptedException unused) {
                                z2 = true;
                            }
                        }
                        if (z2) {
                            Thread.currentThread().interrupt();
                        }
                        module = moduleHolder.getModule();
                    }
                    return module;
                }
                TurboModulePerfLogger.moduleCreateConstructStart(moduleName, moduleHolder.getModuleId());
                NativeModule module2 = this.turboModuleProvider.getModule(moduleName);
                if (module2 == null) {
                    module2 = this.legacyModuleProvider.getModule(moduleName);
                }
                TurboModulePerfLogger.moduleCreateConstructEnd(moduleName, moduleHolder.getModuleId());
                TurboModulePerfLogger.moduleCreateSetUpStart(moduleName, moduleHolder.getModuleId());
                if (module2 != null) {
                    synchronized (moduleHolder) {
                        moduleHolder.setModule(module2);
                    }
                    module2.initialize();
                } else {
                    s55.h(TAG, "getOrCreateModule(): Unable to create module \"%s\" (legacy: %b, turbo: %b)", moduleName, Boolean.valueOf(isLegacyModule(moduleName)), Boolean.valueOf(isTurboModule(moduleName)));
                }
                TurboModulePerfLogger.moduleCreateSetUpEnd(moduleName, moduleHolder.getModuleId());
                synchronized (moduleHolder) {
                    moduleHolder.endCreatingModule();
                    moduleHolder.notifyAll();
                }
                return module2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @f84
    private final TurboModule getTurboJavaModule(String moduleName) {
        if (!isTurboModule(moduleName)) {
            return null;
        }
        NativeModule module = getModule(moduleName);
        if ((module instanceof CxxModuleWrapper) || !(module instanceof TurboModule)) {
            return null;
        }
        return (TurboModule) module;
    }

    @f84
    private final CxxModuleWrapper getTurboLegacyCxxModule(String moduleName) {
        if (!isTurboModule(moduleName)) {
            return null;
        }
        NativeModule module = getModule(moduleName);
        if ((module instanceof CxxModuleWrapper) && (module instanceof TurboModule)) {
            return (CxxModuleWrapper) module;
        }
        return null;
    }

    private final native HybridData initHybrid(RuntimeExecutor runtimeExecutor, CallInvokerHolderImpl jsCallInvokerHolder, NativeMethodCallInvokerHolderImpl nativeMethodCallInvoker, TurboModuleManagerDelegate tmmDelegate);

    private final native void installJSIBindings(boolean shouldCreateLegacyModules);

    private final boolean isLegacyModule(String moduleName) {
        TurboModuleManagerDelegate turboModuleManagerDelegate = this.delegate;
        return turboModuleManagerDelegate != null && turboModuleManagerDelegate.unstable_isLegacyModuleRegistered(moduleName);
    }

    private final boolean isTurboModule(String moduleName) {
        TurboModuleManagerDelegate turboModuleManagerDelegate = this.delegate;
        return turboModuleManagerDelegate != null && turboModuleManagerDelegate.unstable_isModuleRegistered(moduleName);
    }

    private final boolean shouldEnableLegacyModuleInterop() {
        TurboModuleManagerDelegate turboModuleManagerDelegate = this.delegate;
        return turboModuleManagerDelegate != null && turboModuleManagerDelegate.getShouldEnableLegacyModuleInterop();
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    public List<String> getEagerInitModuleNames() {
        return this.eagerInitModuleNames;
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    public NativeModule getModule(String moduleName) {
        moduleName.getClass();
        synchronized (this.moduleCleanupLock) {
            if (this.moduleCleanupStarted) {
                s55.h(TAG, "getModule(): Tried to get module \"%s\", but TurboModuleManager was tearing down (legacy: %b, turbo: %b)", moduleName, Boolean.valueOf(isLegacyModule(moduleName)), Boolean.valueOf(isTurboModule(moduleName)));
                return null;
            }
            if (!this.moduleHolders.containsKey(moduleName)) {
                this.moduleHolders.put(moduleName, new ModuleHolder());
            }
            ModuleHolder moduleHolder = this.moduleHolders.get(moduleName);
            j6g j6gVar = j6g.a;
            if (moduleHolder == null) {
                s55.h(TAG, "getModule(): Tried to get module \"%s\", but moduleHolder was null", moduleName);
                return null;
            }
            ModuleHolder moduleHolder2 = moduleHolder;
            TurboModulePerfLogger.moduleCreateStart(moduleName, moduleHolder2.getModuleId());
            NativeModule orCreateModule = getOrCreateModule(moduleName, moduleHolder2, true);
            if (orCreateModule != null) {
                TurboModulePerfLogger.moduleCreateEnd(moduleName, moduleHolder2.getModuleId());
                return orCreateModule;
            }
            TurboModulePerfLogger.moduleCreateFail(moduleName, moduleHolder2.getModuleId());
            return orCreateModule;
        }
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    public Collection<NativeModule> getModules() {
        List<ModuleHolder> listZ1;
        NativeModule module;
        synchronized (this.moduleCleanupLock) {
            listZ1 = z92.z1(this.moduleHolders.values());
        }
        ArrayList arrayList = new ArrayList();
        for (ModuleHolder moduleHolder : listZ1) {
            synchronized (listZ1) {
                module = moduleHolder.getModule();
            }
            if (module != null) {
                arrayList.add(module);
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    public boolean hasModule(String moduleName) {
        ModuleHolder moduleHolder;
        boolean z;
        moduleName.getClass();
        synchronized (this.moduleCleanupLock) {
            moduleHolder = this.moduleHolders.get(moduleName);
        }
        if (moduleHolder == null) {
            return false;
        }
        synchronized (moduleHolder) {
            z = moduleHolder.getModule() != null;
        }
        return z;
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    public void invalidate() {
        synchronized (this.moduleCleanupLock) {
            this.moduleCleanupStarted = true;
            j6g j6gVar = j6g.a;
        }
        for (Map.Entry<String, ModuleHolder> entry : this.moduleHolders.entrySet()) {
            NativeModule orCreateModule = getOrCreateModule(entry.getKey(), entry.getValue(), false);
            if (orCreateModule != null) {
                orCreateModule.invalidate();
            }
        }
        this.moduleHolders.clear();
        this.mHybridData.resetNative();
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$Companion;", "", "<init>", "()V", "TAG", "", "getMethodDescriptorsFromModule", "", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleInteropUtils$MethodDescriptor;", "module", "Lcom/facebook/react/bridge/NativeModule;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @f84
        public final List<TurboModuleInteropUtils.MethodDescriptor> getMethodDescriptorsFromModule(NativeModule module) {
            return TurboModuleInteropUtils.getMethodDescriptorsFromModule(module);
        }

        private Companion() {
        }
    }
}
