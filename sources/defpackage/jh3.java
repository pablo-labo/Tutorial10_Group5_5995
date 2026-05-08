package defpackage;

import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class jh3 extends qa1 implements tqg {
    public final Lazy a = boa.E(qt8.c, new pd1(3));

    @Override // defpackage.tqg
    public final ViewManager<?, ?> createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        Provider<? extends NativeModule> provider;
        str.getClass();
        ModuleSpec moduleSpec = (ModuleSpec) ((Map) this.a.getValue()).getOrDefault(str, null);
        NativeModule nativeModule = (moduleSpec == null || (provider = moduleSpec.provider()) == null) ? null : provider.get();
        if (nativeModule instanceof ViewManager) {
            return (ViewManager) nativeModule;
        }
        return null;
    }

    @Override // defpackage.qa1
    public final NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.getClass();
        reactApplicationContext.getClass();
        return null;
    }

    @Override // defpackage.qa1
    public final omc getReactModuleInfoProvider() {
        return new hh3();
    }

    @Override // defpackage.tqg
    public final Collection<String> getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        return ((Map) this.a.getValue()).keySet();
    }

    @Override // defpackage.qa1
    public final List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        reactApplicationContext.getClass();
        return z92.z1(((Map) this.a.getValue()).values());
    }
}
