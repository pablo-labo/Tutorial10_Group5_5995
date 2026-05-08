package expo.modules.adapters.react;

import com.facebook.react.bridge.BaseJavaModule;
import defpackage.ey9;

/* JADX INFO: loaded from: classes3.dex */
public class ModuleRegistryReadyNotifier extends BaseJavaModule {
    private ey9 mModuleRegistry;

    public ModuleRegistryReadyNotifier(ey9 ey9Var) {
        this.mModuleRegistry = ey9Var;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ModuleRegistryReadyNotifier";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        ey9 ey9Var = this.mModuleRegistry;
        synchronized (ey9Var) {
            if (!ey9Var.d) {
                ey9Var.a();
                ey9Var.d = true;
            }
        }
    }
}
