package defpackage;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.defaults.DefaultTurboModuleManagerDelegate;
import com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0002*+B\u001f\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB'\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ%\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R,\u0010&\u001a\u001a\u0012\u0004\u0012\u00020 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020%0$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lpnc;", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactApplicationContext", "", "Linc;", "packages", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)V", "Lcom/facebook/jni/HybridData;", "hybridData", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;Lcom/facebook/jni/HybridData;)V", "Lj6g;", "initialize", "", "shouldSupportLegacyPackages", "()Z", "unstable_shouldEnableLegacyModuleInterop", "", "moduleName", "Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;", "getModule", "(Ljava/lang/String;)Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;", "unstable_isModuleRegistered", "(Ljava/lang/String;)Z", "unstable_isLegacyModuleRegistered", "Lcom/facebook/react/bridge/NativeModule;", "getLegacyModule", "(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;", "getEagerInitModuleNames", "()Ljava/util/List;", "", "Lpnc$b;", "moduleProviders", "Ljava/util/List;", "", "", "Lcom/facebook/react/module/model/ReactModuleInfo;", "packageModuleInfos", "Ljava/util/Map;", "shouldEnableLegacyModuleInterop", "Z", "b", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class pnc extends TurboModuleManagerDelegate {
    private final List<b> moduleProviders;
    private final Map<b, Map<String, ReactModuleInfo>> packageModuleInfos;
    private final boolean shouldEnableLegacyModuleInterop;

    public static abstract class a {
        public List<? extends inc> a;

        public abstract DefaultTurboModuleManagerDelegate a(ReactApplicationContext reactApplicationContext, List list);
    }

    public interface b {
        NativeModule getModule(String str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pnc(ReactApplicationContext reactApplicationContext, List<? extends inc> list, HybridData hybridData) {
        super(hybridData);
        reactApplicationContext.getClass();
        list.getClass();
        hybridData.getClass();
        this.moduleProviders = new ArrayList();
        this.packageModuleInfos = new LinkedHashMap();
        qmc qmcVar = ie7.g0;
        this.shouldEnableLegacyModuleInterop = qmcVar.enableBridgelessArchitecture() && qmcVar.useTurboModuleInterop();
        initialize(reactApplicationContext, list);
    }

    private final void initialize(final ReactApplicationContext reactApplicationContext, List<? extends inc> packages) {
        String name;
        for (inc incVar : packages) {
            if (incVar instanceof qa1) {
                final qa1 qa1Var = (qa1) incVar;
                b bVar = new b() { // from class: mnc
                    @Override // pnc.b
                    public final NativeModule getModule(String str) {
                        return pnc.initialize$lambda$0(qa1Var, reactApplicationContext, str);
                    }
                };
                this.moduleProviders.add(bVar);
                this.packageModuleInfos.put(bVar, qa1Var.getReactModuleInfoProvider().a());
            } else if (shouldSupportLegacyPackages() && (incVar instanceof ft8)) {
                ft8 ft8Var = (ft8) incVar;
                reactApplicationContext.getClass();
                List<ModuleSpec> listA = ft8Var.a();
                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (ModuleSpec moduleSpec : listA) {
                    linkedHashMap.put(moduleSpec.getName(), moduleSpec.getProvider());
                }
                b bVar2 = new b() { // from class: nnc
                    @Override // pnc.b
                    public final NativeModule getModule(String str) {
                        return pnc.initialize$lambda$1(linkedHashMap, str);
                    }
                };
                this.moduleProviders.add(bVar2);
                this.packageModuleInfos.put(bVar2, ft8Var.b().a());
            } else if (shouldSupportLegacyPackages()) {
                List<NativeModule> listCreateNativeModules = incVar.createNativeModules(reactApplicationContext);
                final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (NativeModule nativeModule : listCreateNativeModules) {
                    Class<?> cls = nativeModule.getClass();
                    nmc nmcVar = (nmc) cls.getAnnotation(nmc.class);
                    if (nmcVar == null || (name = nmcVar.name()) == null) {
                        name = nativeModule.getName();
                        name.getClass();
                    }
                    String str = name;
                    linkedHashMap3.put(str, nmcVar != null ? new ReactModuleInfo(str, cls.getName(), nmcVar.canOverrideExistingModule(), true, nmcVar.isCxxModule(), TurboModule.class.isAssignableFrom(cls)) : new ReactModuleInfo(str, cls.getName(), nativeModule.canOverrideExistingModule(), true, CxxModuleWrapper.class.isAssignableFrom(cls), TurboModule.class.isAssignableFrom(cls)));
                    linkedHashMap2.put(str, nativeModule);
                }
                b bVar3 = new b() { // from class: onc
                    @Override // pnc.b
                    public final NativeModule getModule(String str2) {
                        return pnc.initialize$lambda$2(linkedHashMap2, str2);
                    }
                };
                this.moduleProviders.add(bVar3);
                this.packageModuleInfos.put(bVar3, linkedHashMap3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule initialize$lambda$0(inc incVar, ReactApplicationContext reactApplicationContext, String str) {
        str.getClass();
        return ((qa1) incVar).getModule(str, reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule initialize$lambda$1(Map map, String str) {
        str.getClass();
        Provider provider = (Provider) map.get(str);
        if (provider != null) {
            return (NativeModule) provider.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule initialize$lambda$2(Map map, String str) {
        str.getClass();
        return (NativeModule) map.get(str);
    }

    private final boolean shouldSupportLegacyPackages() {
        return getShouldEnableLegacyModuleInterop();
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public List<String> getEagerInitModuleNames() {
        Collection<ReactModuleInfo> collectionValues;
        iy8 iy8VarS = u63.s();
        Iterator<b> it = this.moduleProviders.iterator();
        while (it.hasNext()) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(it.next());
            if (map == null || (collectionValues = map.values()) == null) {
                collectionValues = zr4.a;
            }
            for (ReactModuleInfo reactModuleInfo : collectionValues) {
                if (reactModuleInfo.f && reactModuleInfo.d) {
                    iy8VarS.add(reactModuleInfo.a);
                }
            }
        }
        return iy8VarS.l();
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public NativeModule getLegacyModule(String moduleName) {
        moduleName.getClass();
        if (getShouldEnableLegacyModuleInterop()) {
            NativeModule nativeModule = null;
            for (b bVar : this.moduleProviders) {
                Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(bVar);
                ReactModuleInfo reactModuleInfo = map != null ? map.get(moduleName) : null;
                if (reactModuleInfo != null && !reactModuleInfo.f && (nativeModule == null || reactModuleInfo.c)) {
                    NativeModule module = bVar.getModule(moduleName);
                    if (module != null) {
                        nativeModule = module;
                    }
                }
            }
            if (!(nativeModule instanceof TurboModule)) {
                return nativeModule;
            }
        }
        return null;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public TurboModule getModule(String moduleName) {
        moduleName.getClass();
        NativeModule nativeModule = null;
        for (b bVar : this.moduleProviders) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(bVar);
            ReactModuleInfo reactModuleInfo = map != null ? map.get(moduleName) : null;
            if (reactModuleInfo != null && reactModuleInfo.f && (nativeModule == null || reactModuleInfo.c)) {
                NativeModule module = bVar.getModule(moduleName);
                if (module != null) {
                    nativeModule = module;
                }
            }
        }
        if (!(nativeModule instanceof TurboModule)) {
            return null;
        }
        nativeModule.getClass();
        return (TurboModule) nativeModule;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_isLegacyModuleRegistered(String moduleName) {
        moduleName.getClass();
        Iterator<b> it = this.moduleProviders.iterator();
        while (it.hasNext()) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(it.next());
            ReactModuleInfo reactModuleInfo = map != null ? map.get(moduleName) : null;
            if (reactModuleInfo != null && !reactModuleInfo.f) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_isModuleRegistered(String moduleName) {
        moduleName.getClass();
        Iterator<b> it = this.moduleProviders.iterator();
        while (it.hasNext()) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(it.next());
            ReactModuleInfo reactModuleInfo = map != null ? map.get(moduleName) : null;
            if (reactModuleInfo != null && reactModuleInfo.f) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    /* JADX INFO: renamed from: unstable_shouldEnableLegacyModuleInterop, reason: from getter */
    public boolean getShouldEnableLegacyModuleInterop() {
        return this.shouldEnableLegacyModuleInterop;
    }

    public pnc(ReactApplicationContext reactApplicationContext, List<? extends inc> list) {
        reactApplicationContext.getClass();
        list.getClass();
        this.moduleProviders = new ArrayList();
        this.packageModuleInfos = new LinkedHashMap();
        qmc qmcVar = ie7.g0;
        this.shouldEnableLegacyModuleInterop = qmcVar.enableBridgelessArchitecture() && qmcVar.useTurboModuleInterop();
        initialize(reactApplicationContext, list);
    }
}
