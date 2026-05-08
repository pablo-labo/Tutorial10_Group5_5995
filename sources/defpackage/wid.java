package defpackage;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import com.th3rdwave.safeareacontext.SafeAreaContextModule;
import com.th3rdwave.safeareacontext.SafeAreaProviderManager;
import com.th3rdwave.safeareacontext.SafeAreaViewManager;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wid extends qa1 {
    @Override // defpackage.qa1, defpackage.inc
    public final List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactApplicationContext) {
        reactApplicationContext.getClass();
        return u63.a0(new SafeAreaProviderManager(), new SafeAreaViewManager());
    }

    @Override // defpackage.qa1
    public final NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.getClass();
        reactApplicationContext.getClass();
        if (str.equals("RNCSafeAreaContext")) {
            return new SafeAreaContextModule(reactApplicationContext);
        }
        return null;
    }

    @Override // defpackage.qa1
    public final omc getReactModuleInfoProvider() {
        HashMap map = new HashMap();
        Class cls = new Class[]{SafeAreaContextModule.class}[0];
        nmc nmcVar = (nmc) cls.getAnnotation(nmc.class);
        if (nmcVar != null) {
            map.put(nmcVar.name(), new ReactModuleInfo(nmcVar.name(), cls.getName(), true, nmcVar.needsEagerInit(), nmcVar.isCxxModule(), true));
        }
        return new oz2(map);
    }
}
