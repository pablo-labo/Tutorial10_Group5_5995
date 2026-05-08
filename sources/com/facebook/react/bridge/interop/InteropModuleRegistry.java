package com.facebook.react.bridge.interop;

import com.facebook.react.bridge.JavaScriptModule;
import defpackage.ie7;
import defpackage.qmc;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\b*\u0004\u0018\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0010\u001a\u00020\u000f\"\n\b\u0000\u0010\b*\u0004\u0018\u00010\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011R&\u0010\u0013\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/bridge/interop/InteropModuleRegistry;", "", "<init>", "()V", "", "checkReactFeatureFlagsConditions", "()Z", "Lcom/facebook/react/bridge/JavaScriptModule;", "T", "Ljava/lang/Class;", "requestedModule", "getInteropModule", "(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;", "interopModuleInterface", "interopModule", "Lj6g;", "registerInteropModule", "(Ljava/lang/Class;Ljava/lang/Object;)V", "", "supportedModules", "Ljava/util/Map;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InteropModuleRegistry {
    private static final Companion Companion = new Companion(null);
    private final Map<Class<?>, Object> supportedModules = new LinkedHashMap();

    private final boolean checkReactFeatureFlagsConditions() {
        qmc qmcVar = ie7.g0;
        return qmcVar.enableFabricRenderer() && qmcVar.useFabricInterop();
    }

    public final <T extends JavaScriptModule> T getInteropModule(Class<T> requestedModule) {
        requestedModule.getClass();
        if (checkReactFeatureFlagsConditions()) {
            Object obj = this.supportedModules.get(requestedModule);
            if (obj instanceof JavaScriptModule) {
                return (T) obj;
            }
        }
        return null;
    }

    public final <T extends JavaScriptModule> void registerInteropModule(Class<T> interopModuleInterface, Object interopModule) {
        interopModuleInterface.getClass();
        interopModule.getClass();
        if (checkReactFeatureFlagsConditions()) {
            this.supportedModules.put(interopModuleInterface, interopModule);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/bridge/interop/InteropModuleRegistry$Companion;", "", "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
