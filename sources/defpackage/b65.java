package defpackage;

import android.os.Trace;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.FabricUIManagerBinding;
import com.facebook.react.fabric.events.EventBeatManager;

/* JADX INFO: loaded from: classes2.dex */
public final class b65 implements UIManagerProvider {
    public final ComponentFactory a;
    public final vqg b;

    public b65(ComponentFactory componentFactory, vqg vqgVar) {
        this.a = componentFactory;
        this.b = vqgVar;
    }

    @Override // com.facebook.react.bridge.UIManagerProvider
    public final UIManager createUIManager(ReactApplicationContext reactApplicationContext) {
        reactApplicationContext.getClass();
        Trace.beginSection(jpf.g("FabricUIManagerProviderImpl.create"));
        EventBeatManager eventBeatManager = new EventBeatManager();
        Trace.beginSection(jpf.g("FabricUIManagerProviderImpl.createUIManager"));
        FabricUIManager fabricUIManager = new FabricUIManager(reactApplicationContext, this.b, eventBeatManager);
        Trace.endSection();
        Trace.beginSection(jpf.g("FabricUIManagerProviderImpl.registerBinding"));
        FabricUIManagerBinding fabricUIManagerBinding = new FabricUIManagerBinding();
        CatalystInstance catalystInstance = reactApplicationContext.getCatalystInstance();
        RuntimeExecutor runtimeExecutor = catalystInstance != null ? catalystInstance.getRuntimeExecutor() : null;
        RuntimeScheduler runtimeScheduler = catalystInstance != null ? catalystInstance.getRuntimeScheduler() : null;
        if (runtimeExecutor == null || runtimeScheduler == null) {
            r6.g("Unable to register FabricUIManager with CatalystInstance, runtimeExecutor and runtimeScheduler must not be null");
            return null;
        }
        fabricUIManagerBinding.b(runtimeExecutor, runtimeScheduler, fabricUIManager, eventBeatManager, this.a);
        Trace.endSection();
        Trace.endSection();
        return fabricUIManager;
    }
}
