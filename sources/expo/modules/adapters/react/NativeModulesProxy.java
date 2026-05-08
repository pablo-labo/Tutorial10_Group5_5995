package expo.modules.adapters.react;

import android.os.Trace;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import defpackage.a45;
import defpackage.akb;
import defpackage.d49;
import defpackage.dy9;
import defpackage.ey9;
import defpackage.f13;
import defpackage.gk0;
import defpackage.hy9;
import defpackage.i05;
import defpackage.j6g;
import defpackage.jpf;
import defpackage.kc9;
import defpackage.lc9;
import defpackage.mz2;
import defpackage.ni8;
import defpackage.nz2;
import defpackage.o39;
import defpackage.ohd;
import defpackage.oyc;
import defpackage.p3c;
import defpackage.pf8;
import defpackage.rqg;
import defpackage.w92;
import defpackage.wl7;
import defpackage.wx9;
import defpackage.zx9;
import expo.modules.core.errors.ContextDestroyedException;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public class NativeModulesProxy extends ReactContextBaseJavaModule {
    private static final String EXPORTED_METHODS_KEY = "exportedMethods";
    private static final String MODULES_CONSTANTS_KEY = "modulesConstants";
    private static final String NAME = "NativeUnimoduleProxy";
    private static final String UNDEFINED_METHOD_ERROR = "E_UNDEFINED_METHOD";
    private static final String VIEW_MANAGERS_METADATA_KEY = "viewManagersMetadata";
    private Map<String, Object> cachedConstants;
    private ni8 mKotlinInteropModuleRegistry;
    private ey9 mModuleRegistry;

    public NativeModulesProxy(ReactApplicationContext reactApplicationContext, ey9 ey9Var) {
        super(reactApplicationContext);
        this.mModuleRegistry = ey9Var;
        hy9 hy9Var = (hy9) a45.a.getValue();
        Objects.requireNonNull(hy9Var);
        this.mKotlinInteropModuleRegistry = new ni8(hy9Var, ey9Var, new WeakReference(reactApplicationContext));
    }

    @ReactMethod
    public void callMethod(String str, String str2, ReadableArray readableArray, Promise promise) {
        ni8 ni8Var = this.mKotlinInteropModuleRegistry;
        ni8Var.getClass();
        str.getClass();
        dy9 dy9VarA = ni8Var.a();
        dy9VarA.getClass();
        if (!dy9VarA.b.containsKey(str)) {
            promise.reject(UNDEFINED_METHOD_ERROR, akb.k("Method ", str2, " of Java module ", str, " is undefined."));
            return;
        }
        ni8 ni8Var2 = this.mKotlinInteropModuleRegistry;
        pf8 pf8Var = new pf8(promise);
        ni8Var2.getClass();
        str2.getClass();
        readableArray.getClass();
        try {
            zx9<?> zx9VarB = ni8Var2.a().b(str);
            if (zx9VarB != null) {
                Object[] array = readableArray.toArrayList().toArray();
                array.getClass();
                zx9VarB.b(str2, array, pf8Var);
            } else {
                throw new IllegalArgumentException(("Trying to call '" + str2 + "' on the non-existing module '" + str + "'").toString());
            }
        } catch (CodedException e) {
            p3c.a.a(pf8Var, e);
        } catch (Throwable th) {
            p3c.a.a(pf8Var, new UnexpectedException(th));
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        Map<String, Object> map = this.cachedConstants;
        if (map != null) {
            return map;
        }
        ey9 ey9Var = this.mModuleRegistry;
        synchronized (ey9Var) {
            if (!ey9Var.d) {
                ey9Var.a();
                ey9Var.d = true;
            }
        }
        ni8 kotlinInteropModuleRegistry = getKotlinInteropModuleRegistry();
        kotlinInteropModuleRegistry.b();
        gk0 gk0Var = kotlinInteropModuleRegistry.a;
        gk0Var.getClass();
        Trace.beginSection(jpf.g("[ExpoModulesCore] AppContext.onCreate"));
        try {
            gk0Var.b.c.g();
            j6g j6gVar = j6g.a;
            Trace.endSection();
            HashMap map2 = new HashMap(3);
            map2.put(MODULES_CONSTANTS_KEY, new HashMap());
            map2.put(EXPORTED_METHODS_KEY, new HashMap());
            ni8 ni8Var = this.mKotlinInteropModuleRegistry;
            ni8Var.getClass();
            Trace.beginSection(jpf.g("[ExpoModulesCore] KotlinInteropModuleRegistry.viewManagersMetadata"));
            try {
                dy9 dy9VarA = ni8Var.a();
                ArrayList arrayList = new ArrayList();
                for (zx9<?> zx9Var : dy9VarA) {
                    Map<String, rqg> map3 = zx9Var.b.c;
                    ArrayList arrayList2 = new ArrayList(map3.size());
                    for (Map.Entry<String, rqg> entry : map3.entrySet()) {
                        String key = entry.getKey();
                        rqg value = entry.getValue();
                        boolean zB = wl7.b(key, "DEFAULT_MODULE_VIEW");
                        wx9 wx9Var = zx9Var.b;
                        arrayList2.add(new Pair(zB ? wx9Var.a : wx9Var.a + "_" + key, kc9.W(new Pair("propsNames", value.i))));
                    }
                    w92.w0(arrayList, arrayList2);
                }
                Map mapF0 = lc9.f0(arrayList);
                Trace.endSection();
                map2.put(VIEW_MANAGERS_METADATA_KEY, mapF0);
                mz2.a.a(o39.Info, "✅ Constants were exported", null);
                this.cachedConstants = map2;
                return map2;
            } finally {
            }
        } finally {
        }
    }

    public ni8 getKotlinInteropModuleRegistry() {
        return this.mKotlinInteropModuleRegistry;
    }

    public ey9 getModuleRegistry() {
        return this.mModuleRegistry;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public ReactApplicationContext getReactContext() {
        return getReactApplicationContext();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        ey9 ey9Var = this.mModuleRegistry;
        ey9Var.getClass();
        ArrayList arrayList = new ArrayList(ey9Var.a.values());
        Iterator it = ey9Var.c.iterator();
        while (it.hasNext()) {
            oyc oycVar = (oyc) ((WeakReference) it.next()).get();
            if (oycVar != null) {
                arrayList.add(oycVar);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((oyc) it2.next()).onDestroy();
        }
        gk0 gk0Var = this.mKotlinInteropModuleRegistry.a;
        ohd ohdVar = gk0Var.b;
        Trace.beginSection(jpf.g("[ExpoModulesCore] AppContext.onDestroy"));
        try {
            WeakReference<ReactApplicationContext> weakReference = ohdVar.a;
            dy9 dy9Var = ohdVar.c;
            ReactApplicationContext reactApplicationContext = weakReference.get();
            if (reactApplicationContext != null) {
                reactApplicationContext.removeLifecycleEventListener(gk0Var.c);
            }
            dy9Var.f(i05.b);
            dy9Var.b.clear();
            d49 d49Var = mz2.a;
            o39 o39Var = o39.Info;
            d49Var.a(o39Var, "✅ ModuleRegistry was destroyed", null);
            f13.c(gk0Var.f, new ContextDestroyedException());
            f13.c(gk0Var.g, new ContextDestroyedException());
            f13.c(gk0Var.e, new ContextDestroyedException());
            ((nz2) ohdVar.e.a).a = null;
            ohdVar.f.a();
            d49Var.a(o39Var, "✅ AppContext was destroyed", null);
            j6g j6gVar = j6g.a;
            Trace.endSection();
            d49Var.a(o39Var, "✅ KotlinInteropModuleRegistry was destroyed", null);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public NativeModulesProxy(ReactApplicationContext reactApplicationContext, ey9 ey9Var, hy9 hy9Var) {
        super(reactApplicationContext);
        this.mModuleRegistry = ey9Var;
        Objects.requireNonNull(hy9Var);
        this.mKotlinInteropModuleRegistry = new ni8(hy9Var, ey9Var, new WeakReference(reactApplicationContext));
    }
}
