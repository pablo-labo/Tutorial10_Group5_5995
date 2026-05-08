package defpackage;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.EventDispatcher;
import defpackage.ue8;
import expo.modules.adapters.react.NativeModulesProxy;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class upg<T> implements vpg<T> {
    public final String a;
    public final View b;
    public boolean c;

    public upg(View view, String str) {
        str.getClass();
        this.a = str;
        this.b = view;
    }

    @Override // defpackage.vpg
    public final void invoke(T t) {
        Object obj;
        WritableMap writableMap;
        zx9 zx9Var;
        View view = this.b;
        Context context = view.getContext();
        context.getClass();
        NativeModulesProxy nativeModulesProxyM = q92.m((ReactContext) context);
        if (nativeModulesProxyM == null) {
            return;
        }
        gk0 gk0Var = nativeModulesProxyM.getKotlinInteropModuleRegistry().a;
        boolean z = this.c;
        String str = this.a;
        if (!z) {
            dy9 dy9Var = gk0Var.b.c;
            Class<?> cls = view.getClass();
            dy9Var.getClass();
            Iterator it = dy9Var.b.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    zx9Var = null;
                    break;
                }
                zx9Var = (zx9) ((Map.Entry) it.next()).getValue();
                if (dy9.d(zx9Var, cls) == null) {
                    zx9Var = null;
                }
                if (zx9Var != null) {
                    break;
                }
            }
            if (zx9Var == null) {
                d49.b(mz2.a, "⚠️ Cannot get module holder for " + view.getClass());
                return;
            }
            T t2 = zx9Var.a;
            dy9 dy9Var2 = gk0Var.b.c;
            Class<?> cls2 = view.getClass();
            dy9Var2.getClass();
            rqg rqgVarD = dy9.d(zx9Var, cls2);
            c00 c00Var = rqgVarD != null ? rqgVarD.f : null;
            if (c00Var == null) {
                d49.b(mz2.a, "⚠️ Cannot get callbacks for " + t2.getClass());
                return;
            }
            for (String str2 : (String[]) c00Var.a) {
                if (wl7.b(str2, str)) {
                    this.c = true;
                }
            }
            d49.b(mz2.a, "⚠️ Event " + str + " wasn't exported from " + t2.getClass());
            return;
        }
        gk0Var.getClass();
        try {
            obj = gk0Var.a.a.get(fy4.class);
        } catch (Exception unused) {
            obj = null;
        }
        fy4 fy4Var = (fy4) obj;
        ue8 ue8Var = fy4Var == null ? null : new ue8(fy4Var, gk0Var.b.a);
        if (ue8Var != null) {
            Object objA = pt7.a(6, t);
            if ((objA instanceof j6g) || objA == null) {
                writableMap = null;
            } else if (objA instanceof WritableMap) {
                writableMap = (WritableMap) objA;
            } else {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.getClass();
                qt7.b(writableMapCreateMap, "payload", objA);
                writableMap = writableMapCreateMap;
            }
            str.getClass();
            ReactApplicationContext reactApplicationContext = ue8Var.b.get();
            if (reactApplicationContext == null) {
                return;
            }
            ue8.a aVar = new ue8.a(dmc.h(view), view.getId(), str, writableMap, null);
            EventDispatcher eventDispatcherE = dmc.e(reactApplicationContext, view.getId());
            if (eventDispatcherE != null) {
                eventDispatcherE.a(aVar);
            }
        }
    }
}
