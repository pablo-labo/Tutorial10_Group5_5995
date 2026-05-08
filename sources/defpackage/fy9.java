package defpackage;

import android.os.Trace;
import android.view.ViewGroup;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManager;
import expo.modules.adapters.react.FabricComponentsRegistry;
import expo.modules.adapters.react.ModuleRegistryReadyNotifier;
import expo.modules.adapters.react.NativeModulesProxy;
import expo.modules.adapters.react.ReactAdapterPackage;
import expo.modules.kotlin.ExpoBridgeModule;
import expo.modules.kotlin.views.GroupViewManagerWrapper;
import expo.modules.kotlin.views.SimpleViewManagerWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class fy9 implements inc {
    public ua9 a;
    public ReactAdapterPackage b;
    public NativeModulesProxy c;
    public ArrayList d;
    public FabricComponentsRegistry e;

    public final synchronized NativeModulesProxy a(ReactApplicationContext reactApplicationContext, ey9 ey9Var) {
        try {
            NativeModulesProxy nativeModulesProxy = this.c;
            if (nativeModulesProxy != null && nativeModulesProxy.getReactContext() != reactApplicationContext) {
                this.c = null;
            }
            if (this.c == null) {
                NativeModulesProxy nativeModulesProxy2 = new NativeModulesProxy(reactApplicationContext, ey9Var != null ? ey9Var : this.a.a(reactApplicationContext));
                this.c = nativeModulesProxy2;
                ni8 kotlinInteropModuleRegistry = nativeModulesProxy2.getKotlinInteropModuleRegistry();
                NativeModulesProxy nativeModulesProxy3 = this.c;
                kotlinInteropModuleRegistry.getClass();
                nativeModulesProxy3.getClass();
                kotlinInteropModuleRegistry.a.h = new WeakReference<>(nativeModulesProxy3);
            }
            if (ey9Var != null && ey9Var != this.c.getModuleRegistry()) {
                d49 d49Var = mz2.a;
                d49Var.getClass();
                d49Var.a(o39.Error, "❌ NativeModuleProxy was configured with a different instance of the modules registry.", null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    @Override // defpackage.inc
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        NativeModulesProxy nativeModulesProxyA = a(reactApplicationContext, null);
        ey9 moduleRegistry = nativeModulesProxyA.getModuleRegistry();
        Iterator<ui7> it = this.b.e(reactApplicationContext).iterator();
        while (it.hasNext()) {
            moduleRegistry.b(it.next());
        }
        ArrayList arrayList = new ArrayList(2);
        NativeModulesProxy nativeModulesProxyA2 = a(reactApplicationContext, moduleRegistry);
        arrayList.add(nativeModulesProxyA2);
        arrayList.add(new ModuleRegistryReadyNotifier(moduleRegistry));
        Iterator it2 = ((qnc) moduleRegistry.a.get(qnc.class)).a.iterator();
        while (it2.hasNext()) {
            arrayList.addAll(((inc) it2.next()).createNativeModules(reactApplicationContext));
        }
        arrayList.add(new ExpoBridgeModule(reactApplicationContext, new WeakReference(nativeModulesProxyA2)));
        if (this.d == null) {
            return arrayList;
        }
        ni8 kotlinInteropModuleRegistry = nativeModulesProxyA.getKotlinInteropModuleRegistry();
        ArrayList arrayList2 = this.d;
        kotlinInteropModuleRegistry.getClass();
        arrayList2.getClass();
        Trace.beginSection(jpf.g("[ExpoModulesCore] KotlinInteropModuleRegistry.updateModuleHoldersInViewManagers"));
        try {
            ArrayList<zqg> arrayList3 = new ArrayList(t92.r0(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((osg) it3.next()).getViewWrapperDelegate());
            }
            for (zqg zqgVar : arrayList3) {
                zx9<?> zx9VarB = kotlinInteropModuleRegistry.a().b(zqgVar.a.b.a);
                if (zx9VarB == null) {
                    throw new IllegalArgumentException(("Cannot update the module holder for " + zqgVar.a.b.a + ".").toString());
                }
                zqgVar.a = zx9VarB;
            }
            j6g j6gVar = j6g.a;
            return arrayList;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.inc
    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        BaseViewManager simpleViewManagerWrapper;
        ua9 ua9Var = this.a;
        HashSet hashSet = (HashSet) ua9Var.b;
        if (hashSet == null) {
            ua9Var.b = new HashSet();
            for (kya kyaVar : (List) ua9Var.a) {
                if (kyaVar instanceof inc) {
                    ((HashSet) ua9Var.b).addAll(((inc) kyaVar).createViewManagers(reactApplicationContext));
                }
            }
            hashSet = (HashSet) ua9Var.b;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        NativeModulesProxy nativeModulesProxyA = a(reactApplicationContext, null);
        Objects.requireNonNull(nativeModulesProxyA);
        ni8 kotlinInteropModuleRegistry = nativeModulesProxyA.getKotlinInteropModuleRegistry();
        kotlinInteropModuleRegistry.getClass();
        Trace.beginSection(jpf.g("[ExpoModulesCore] KotlinInteropModuleRegistry.exportViewManagers"));
        try {
            dy9 dy9VarA = kotlinInteropModuleRegistry.a();
            ArrayList arrayList2 = new ArrayList();
            for (zx9<?> zx9Var : dy9VarA) {
                Map<String, rqg> map = zx9Var.b.c;
                ArrayList arrayList3 = new ArrayList(map.size());
                for (Map.Entry<String, rqg> entry : map.entrySet()) {
                    String key = entry.getKey();
                    rqg value = entry.getValue();
                    zqg zqgVar = new zqg(zx9Var, value, wl7.b(key, "DEFAULT_MODULE_VIEW") ? zx9Var.b.a : null);
                    int iOrdinal = (ViewGroup.class.isAssignableFrom(value.c) ? xqg.b : xqg.a).ordinal();
                    if (iOrdinal == 0) {
                        simpleViewManagerWrapper = new SimpleViewManagerWrapper(zqgVar);
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        simpleViewManagerWrapper = new GroupViewManagerWrapper(zqgVar);
                    }
                    arrayList3.add(simpleViewManagerWrapper);
                }
                w92.w0(arrayList2, arrayList3);
            }
            Trace.endSection();
            Trace.beginSection(jpf.g("[ExpoModulesCore] KotlinInteropModuleRegistry.extractViewManagersDelegateHolders"));
            try {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (obj instanceof osg) {
                        arrayList4.add(obj);
                    }
                }
                Trace.endSection();
                this.d = arrayList4;
                arrayList.addAll(arrayList2);
                this.e = new FabricComponentsRegistry(arrayList2);
                return arrayList;
            } finally {
            }
        } finally {
        }
    }
}
