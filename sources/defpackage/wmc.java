package defpackage;

import android.app.Application;
import android.content.Context;
import com.facebook.hermes.reactexecutor.HermesExecutor;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.common.LifecycleState;
import com.facebook.soloader.SoLoader;
import defpackage.pnc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class wmc {
    public static final /* synthetic */ int c = 0;
    public final Application a;
    public fmc b;

    public class a implements c0f {
    }

    public wmc(Application application) {
        this.a = application;
    }

    public final synchronized fmc a() {
        try {
            if (this.b == null) {
                ReactMarker.logMarker(ReactMarkerConstants.INIT_REACT_RUNTIME_START);
                ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_START);
                this.b = createReactInstanceManager();
                ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_END);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    public boolean b() {
        return true;
    }

    public c0f c() {
        return new a();
    }

    public fmc createReactInstanceManager() {
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
        hmc baseReactInstanceManagerBuilder = getBaseReactInstanceManagerBuilder();
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
        Application application = baseReactInstanceManagerBuilder.e;
        if (application == null) {
            r6.g("Application property has not been set with this builder");
            return null;
        }
        if (baseReactInstanceManagerBuilder.i == LifecycleState.c) {
            r6.g("Activity needs to be set if initial lifecycle state is resumed");
            return null;
        }
        if (!baseReactInstanceManagerBuilder.f && baseReactInstanceManagerBuilder.b == null && baseReactInstanceManagerBuilder.c == null) {
            r6.g("JS Bundle File or Asset URL has to be provided when dev support is disabled");
            return null;
        }
        if (baseReactInstanceManagerBuilder.d == null && baseReactInstanceManagerBuilder.b == null && baseReactInstanceManagerBuilder.c == null) {
            r6.g("Either MainModulePath or JS Bundle File needs to be provided");
            return null;
        }
        String packageName = application.getPackageName();
        x70.b();
        String str = baseReactInstanceManagerBuilder.b;
        JavaScriptExecutorFactory ph6Var = baseReactInstanceManagerBuilder.l;
        if (ph6Var == null) {
            packageName.getClass();
            Context applicationContext = application.getApplicationContext();
            applicationContext.getClass();
            String str2 = fmc.z;
            try {
                SoLoader.e(applicationContext, 0);
                try {
                    HermesExecutor.a aVar = HermesExecutor.a;
                    if (HermesExecutor.b == null) {
                        SoLoader.l("hermes");
                        SoLoader.l("hermes_executor");
                        HermesExecutor.b = "Release";
                    }
                    ph6Var = new ph6();
                } catch (UnsatisfiedLinkError unused) {
                    s55.f(hmc.u, "Unable to load Hermes. Your application is not built correctly and will fail to execute");
                    ph6Var = null;
                }
            } catch (IOException e) {
                l5.r(e);
                return null;
            }
        }
        JSBundleLoader jSBundleLoaderCreateAssetLoader = baseReactInstanceManagerBuilder.c;
        if (jSBundleLoaderCreateAssetLoader == null && str != null) {
            jSBundleLoaderCreateAssetLoader = JSBundleLoader.INSTANCE.createAssetLoader(application, str, false);
        }
        String str3 = baseReactInstanceManagerBuilder.d;
        ArrayList arrayList = baseReactInstanceManagerBuilder.a;
        boolean z = baseReactInstanceManagerBuilder.f;
        m34 um3Var = baseReactInstanceManagerBuilder.g;
        if (um3Var == null) {
            um3Var = new um3();
        }
        m34 m34Var = um3Var;
        boolean z2 = baseReactInstanceManagerBuilder.h;
        LifecycleState lifecycleState = baseReactInstanceManagerBuilder.i;
        if (lifecycleState == null) {
            r6.g("Initial lifecycle state was not set");
            return null;
        }
        return new fmc(application, ph6Var, jSBundleLoaderCreateAssetLoader, str3, arrayList, z, m34Var, z2, lifecycleState, baseReactInstanceManagerBuilder.j, baseReactInstanceManagerBuilder.k, baseReactInstanceManagerBuilder.m, baseReactInstanceManagerBuilder.n, baseReactInstanceManagerBuilder.o, baseReactInstanceManagerBuilder.p, baseReactInstanceManagerBuilder.q, baseReactInstanceManagerBuilder.r, baseReactInstanceManagerBuilder.s, baseReactInstanceManagerBuilder.t);
    }

    public abstract boolean d();

    public final synchronized boolean e() {
        return this.b != null;
    }

    public final Application getApplication() {
        return this.a;
    }

    public hmc getBaseReactInstanceManagerBuilder() {
        String str = fmc.z;
        hmc hmcVar = new hmc();
        Application application = this.a;
        application.getClass();
        hmcVar.e = application;
        String jSMainModuleName = getJSMainModuleName();
        jSMainModuleName.getClass();
        hmcVar.d = jSMainModuleName;
        hmcVar.f = d();
        hmcVar.g = getDevSupportManagerFactory();
        hmcVar.r = getDevLoadingViewManager();
        hmcVar.h = b();
        hmcVar.q = c();
        hmcVar.j = getJSExceptionHandler();
        hmcVar.k = getRedBoxHandler();
        hmcVar.l = getJavaScriptExecutorFactory();
        hmcVar.o = getUIManagerProvider();
        hmcVar.i = LifecycleState.a;
        hmcVar.p = getReactPackageTurboModuleManagerDelegateBuilder();
        hmcVar.s = getChoreographerProvider();
        hmcVar.t = getPausedInDebuggerOverlayManager();
        for (inc incVar : getPackages()) {
            incVar.getClass();
            hmcVar.a.add(incVar);
        }
        String jSBundleFile = getJSBundleFile();
        if (jSBundleFile == null) {
            String bundleAssetName = getBundleAssetName();
            hh1.n(bundleAssetName);
            hmcVar.b = "assets://".concat(bundleAssetName);
            hmcVar.c = null;
            return hmcVar;
        }
        if (wve.K(jSBundleFile, "assets://", false)) {
            hmcVar.b = jSBundleFile;
            hmcVar.c = null;
            return hmcVar;
        }
        JSBundleLoader jSBundleLoaderCreateFileLoader = JSBundleLoader.INSTANCE.createFileLoader(jSBundleFile);
        jSBundleLoaderCreateFileLoader.getClass();
        hmcVar.c = jSBundleLoaderCreateFileLoader;
        hmcVar.b = null;
        return hmcVar;
    }

    public String getBundleAssetName() {
        return "index.android.bundle";
    }

    public j42 getChoreographerProvider() {
        return null;
    }

    public k24 getDevLoadingViewManager() {
        return null;
    }

    public m34 getDevSupportManagerFactory() {
        return null;
    }

    public String getJSBundleFile() {
        return null;
    }

    public JSExceptionHandler getJSExceptionHandler() {
        return null;
    }

    public String getJSMainModuleName() {
        return "index.android";
    }

    public JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        return null;
    }

    public abstract List<inc> getPackages();

    public x6b getPausedInDebuggerOverlayManager() {
        return null;
    }

    public pnc.a getReactPackageTurboModuleManagerDelegateBuilder() {
        return null;
    }

    public fuc getRedBoxHandler() {
        return null;
    }

    public UIManagerProvider getUIManagerProvider() {
        return new vmc();
    }
}
