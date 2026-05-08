package defpackage;

import android.os.Trace;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.modules.core.TimingModule;
import com.facebook.react.modules.debug.DevMenuModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class pz2 extends qa1 implements lnc {
    public final fmc a;
    public final cmc b;
    public final int c;

    public pz2(fmc fmcVar, cmc cmcVar, int i) {
        this.a = fmcVar;
        this.b = cmcVar;
        this.c = i;
    }

    @Override // defpackage.lnc
    public final void a() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_END);
    }

    @Override // defpackage.lnc
    public final void b() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_START);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.qa1
    public final NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.getClass();
        reactApplicationContext.getClass();
        int iHashCode = str.hashCode();
        fmc fmcVar = this.a;
        switch (iHashCode) {
            case -2013505529:
                if (str.equals("LogBox")) {
                    w24 w24Var = fmcVar.h;
                    w24Var.getClass();
                    return new LogBoxModule(reactApplicationContext, w24Var);
                }
                break;
            case -1789797270:
                if (str.equals("Timing")) {
                    w24 w24Var2 = fmcVar.h;
                    w24Var2.getClass();
                    return new TimingModule(reactApplicationContext, w24Var2);
                }
                break;
            case -1633589448:
                if (str.equals("DevSettings")) {
                    w24 w24Var3 = fmcVar.h;
                    w24Var3.getClass();
                    return new DevSettingsModule(reactApplicationContext, w24Var3);
                }
                break;
            case -1520650172:
                if (str.equals("DeviceInfo")) {
                    return new DeviceInfoModule(reactApplicationContext);
                }
                break;
            case -1071344908:
                if (str.equals("DevMenu")) {
                    w24 w24Var4 = fmcVar.h;
                    w24Var4.getClass();
                    return new DevMenuModule(reactApplicationContext, w24Var4);
                }
                break;
            case -1037217463:
                if (str.equals("DeviceEventManager")) {
                    return new DeviceEventManagerModule(reactApplicationContext, this.b);
                }
                break;
            case -790603268:
                if (str.equals("PlatformConstants")) {
                    return new AndroidInfoModule(reactApplicationContext);
                }
                break;
            case 512434409:
                if (str.equals("ExceptionsManager")) {
                    w24 w24Var5 = fmcVar.h;
                    w24Var5.getClass();
                    return new ExceptionsManagerModule(w24Var5);
                }
                break;
            case 881516744:
                if (str.equals("SourceCode")) {
                    return new SourceCodeModule(reactApplicationContext);
                }
                break;
            case 1256514152:
                if (str.equals("HeadlessJsTaskSupport")) {
                    return new HeadlessJsTaskSupportModule(reactApplicationContext);
                }
                break;
            case 1861242489:
                if (str.equals(UIManagerModule.NAME)) {
                    int i = this.c;
                    ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
                    Trace.beginSection(jpf.g("createUIManagerModule"));
                    try {
                        return new UIManagerModule(reactApplicationContext, fmcVar.f(reactApplicationContext), i);
                    } finally {
                        Trace.endSection();
                        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
                    }
                }
                break;
        }
        l5.q("In CoreModulesPackage, could not find Native module for ".concat(str));
        return null;
    }

    @Override // defpackage.qa1
    public final omc getReactModuleInfoProvider() {
        Class[] clsArr = {AndroidInfoModule.class, DeviceEventManagerModule.class, DeviceInfoModule.class, DevMenuModule.class, DevSettingsModule.class, ExceptionsManagerModule.class, LogBoxModule.class, HeadlessJsTaskSupportModule.class, SourceCodeModule.class, TimingModule.class, UIManagerModule.class};
        HashMap map = new HashMap();
        for (int i = 0; i < 11; i++) {
            Class cls = clsArr[i];
            nmc nmcVar = (nmc) cls.getAnnotation(nmc.class);
            if (nmcVar != null) {
                map.put(nmcVar.name(), new ReactModuleInfo(nmcVar.name(), cls.getName(), nmcVar.canOverrideExistingModule(), nmcVar.needsEagerInit(), nmcVar.isCxxModule(), TurboModule.class.isAssignableFrom(cls)));
            }
        }
        return new oz2(map);
    }
}
