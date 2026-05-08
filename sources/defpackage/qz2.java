package defpackage;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.debug.DevMenuModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class qz2 extends qa1 {
    public final w24 a;
    public final qlc b;

    public qz2(w24 w24Var, qlc qlcVar) {
        w24Var.getClass();
        this.a = w24Var;
        this.b = qlcVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.qa1
    public final NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.getClass();
        reactApplicationContext.getClass();
        int iHashCode = str.hashCode();
        w24 w24Var = this.a;
        switch (iHashCode) {
            case -2013505529:
                if (str.equals("LogBox")) {
                    return new LogBoxModule(reactApplicationContext, w24Var);
                }
                return null;
            case -1633589448:
                if (str.equals("DevSettings")) {
                    return new DevSettingsModule(reactApplicationContext, w24Var);
                }
                return null;
            case -1520650172:
                if (str.equals("DeviceInfo")) {
                    return new DeviceInfoModule(reactApplicationContext);
                }
                return null;
            case -1071344908:
                if (str.equals("DevMenu")) {
                    return new DevMenuModule(reactApplicationContext, w24Var);
                }
                return null;
            case -1037217463:
                if (str.equals("DeviceEventManager")) {
                    return new DeviceEventManagerModule(reactApplicationContext, this.b);
                }
                return null;
            case -790603268:
                if (str.equals("PlatformConstants")) {
                    return new AndroidInfoModule(reactApplicationContext);
                }
                return null;
            case 512434409:
                if (str.equals("ExceptionsManager")) {
                    return new ExceptionsManagerModule(w24Var);
                }
                return null;
            case 881516744:
                if (str.equals("SourceCode")) {
                    return new SourceCodeModule(reactApplicationContext);
                }
                return null;
            default:
                return null;
        }
    }

    @Override // defpackage.qa1
    public final omc getReactModuleInfoProvider() {
        Class[] clsArr = {AndroidInfoModule.class, DeviceInfoModule.class, SourceCodeModule.class, DevMenuModule.class, DevSettingsModule.class, DeviceEventManagerModule.class, LogBoxModule.class, ExceptionsManagerModule.class};
        HashMap map = new HashMap();
        for (int i = 0; i < 8; i++) {
            Class cls = clsArr[i];
            nmc nmcVar = (nmc) cls.getAnnotation(nmc.class);
            if (nmcVar != null) {
                map.put(nmcVar.name(), new ReactModuleInfo(nmcVar.name(), cls.getName(), nmcVar.canOverrideExistingModule(), nmcVar.needsEagerInit(), nmcVar.isCxxModule(), TurboModule.class.isAssignableFrom(cls)));
            }
        }
        return new oz2(map);
    }
}
