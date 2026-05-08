package defpackage;

import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootViewManager;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class adc extends qa1 implements tqg {
    public final d2f a = new d2f(new j7(13));

    @Override // defpackage.tqg
    public final ViewManager<?, ?> createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        Provider<? extends NativeModule> provider;
        str.getClass();
        ModuleSpec moduleSpec = (ModuleSpec) ((Map) this.a.getValue()).get(str);
        NativeModule nativeModule = (moduleSpec == null || (provider = moduleSpec.provider()) == null) ? null : provider.get();
        if (nativeModule instanceof ViewManager) {
            return (ViewManager) nativeModule;
        }
        return null;
    }

    @Override // defpackage.qa1, defpackage.inc
    public final List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactApplicationContext) {
        reactApplicationContext.getClass();
        return u63.a0(new RNGestureHandlerRootViewManager(), new RNGestureHandlerButtonViewManager());
    }

    @Override // defpackage.qa1
    public final NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.getClass();
        reactApplicationContext.getClass();
        if (str.equals("RNGestureHandlerModule")) {
            return new RNGestureHandlerModule(reactApplicationContext);
        }
        return null;
    }

    @Override // defpackage.qa1
    public final omc getReactModuleInfoProvider() throws InvocationTargetException {
        try {
            Object objNewInstance = Class.forName("com.swmansion.gesturehandler.RNGestureHandlerPackage$$ReactModuleInfoProvider").getDeclaredConstructor(null).newInstance(null);
            objNewInstance.getClass();
            return (omc) objNewInstance;
        } catch (ClassNotFoundException unused) {
            return new zcc();
        } catch (IllegalAccessException e) {
            l6.p("No ReactModuleInfoProvider for RNGestureHandlerPackage$$ReactModuleInfoProvider", e);
            return null;
        } catch (InstantiationException e2) {
            l6.p("No ReactModuleInfoProvider for RNGestureHandlerPackage$$ReactModuleInfoProvider", e2);
            return null;
        }
    }

    @Override // defpackage.tqg
    public final Collection getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        return z92.z1(((Map) this.a.getValue()).keySet());
    }

    @Override // defpackage.qa1
    public final List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        reactApplicationContext.getClass();
        return z92.B1(((Map) this.a.getValue()).values());
    }
}
