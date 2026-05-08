package defpackage;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import com.reactnativecommunity.asyncstorage.AsyncStorageModule;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class tv0 extends cvf {

    public class a implements omc {
        @Override // defpackage.omc
        public final Map<String, ReactModuleInfo> a() {
            HashMap map = new HashMap();
            Class cls = new Class[]{AsyncStorageModule.class}[0];
            nmc nmcVar = (nmc) cls.getAnnotation(nmc.class);
            String strName = nmcVar.name();
            String strName2 = nmcVar.name();
            String name = cls.getName();
            boolean zCanOverrideExistingModule = nmcVar.canOverrideExistingModule();
            boolean zNeedsEagerInit = nmcVar.needsEagerInit();
            nmcVar.hasConstants();
            boolean zIsCxxModule = nmcVar.isCxxModule();
            strName2.getClass();
            map.put(strName, new ReactModuleInfo(strName2, name, zCanOverrideExistingModule, zNeedsEagerInit, zIsCxxModule, true));
            return map;
        }
    }

    @Override // defpackage.qa1, defpackage.inc
    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.qa1
    public final NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.getClass();
        if (str.equals("RNCAsyncStorage")) {
            return new AsyncStorageModule(reactApplicationContext);
        }
        return null;
    }

    @Override // defpackage.qa1
    public final omc getReactModuleInfoProvider() {
        try {
            return (omc) Class.forName("com.reactnativecommunity.asyncstorage.AsyncStoragePackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return new a();
        } catch (IllegalAccessException | InstantiationException e) {
            l6.p("No ReactModuleInfoProvider for com.reactnativecommunity.asyncstorage.AsyncStoragePackage$$ReactModuleInfoProvider", e);
            return null;
        }
    }
}
