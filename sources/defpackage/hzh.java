package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.swmansion.rnscreens.a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class hzh implements hna, ej3, p52, ykh {
    public Object a;

    public hzh() {
        this.a = new maf();
    }

    @Override // defpackage.ykh
    public Task a(Intent intent) {
        return Tasks.call((ExecutorService) this.a, new jda(intent, 1));
    }

    @Override // defpackage.hna
    public Object b() {
        Type type = (Type) this.a;
        if (!(type instanceof ParameterizedType)) {
            bg.k(type, "Invalid EnumSet type: ");
            return null;
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        bg.k(type, "Invalid EnumSet type: ");
        return null;
    }

    @Override // defpackage.ej3
    public Object c(x3 x3Var, Object obj) {
        return null;
    }

    @Override // defpackage.ej3
    public Object d(g4c g4cVar, Object obj) {
        return g(g4cVar, obj);
    }

    @Override // defpackage.ej3
    public Object e(slg slgVar, Object obj) {
        return null;
    }

    @Override // defpackage.ej3
    public Object f(yx9 yx9Var, Object obj) {
        return null;
    }

    @Override // defpackage.ej3
    public Object g(kv5 kv5Var, Object obj) {
        ((j6g) obj).getClass();
        return new ye8((te8) this.a, kv5Var);
    }

    @Override // defpackage.ej3
    public Object h(tx9 tx9Var, Object obj) {
        return null;
    }

    @Override // defpackage.ej3
    public Object i(mya myaVar, Object obj) {
        return null;
    }

    @Override // defpackage.ej3
    public Object j(e5 e5Var, Object obj) {
        return null;
    }

    @Override // defpackage.ej3
    public Object k(v4 v4Var, Object obj) {
        return null;
    }

    @Override // defpackage.ej3
    public Object l(q4c q4cVar, Object obj) {
        return g(q4cVar, obj);
    }

    @Override // defpackage.ej3
    public Object m(ws8 ws8Var, Object obj) {
        return null;
    }

    @Override // defpackage.ej3
    public Object n(e4c e4cVar, Object obj) {
        te8 te8Var = (te8) this.a;
        e4cVar.getClass();
        ((j6g) obj).getClass();
        int i = (e4cVar.i0 != null ? 1 : 0) + (e4cVar.j0 != null ? 1 : 0);
        if (e4cVar.f) {
            if (i == 0) {
                return new ff8(te8Var, e4cVar);
            }
            if (i == 1) {
                return new hf8(te8Var, e4cVar);
            }
            if (i == 2) {
                return new if8(te8Var, e4cVar);
            }
        } else {
            if (i == 0) {
                return new sf8(te8Var, e4cVar);
            }
            if (i == 1) {
                return new uf8(te8Var, e4cVar);
            }
            if (i == 2) {
                return new wf8(te8Var, e4cVar);
            }
        }
        s6.i(e4cVar, "Unsupported property: ");
        return null;
    }

    @Override // defpackage.p52
    public o52 o(a62 a62Var) {
        o52 o52VarO;
        a62Var.getClass();
        for (lya lyaVar : boa.I((pya) this.a, a62Var.a)) {
            if ((lyaVar instanceof o14) && (o52VarO = ((o14) lyaVar).X.o(a62Var)) != null) {
                return o52VarO;
            }
        }
        return null;
    }

    @Override // defpackage.ej3
    public Object p(n52 n52Var, Object obj) {
        return g(n52Var, obj);
    }

    public void q(float f, boolean z, boolean z2) {
        a aVar = (a) this.a;
        float fB = nic.B(f, 0.0f, 1.0f);
        short s = (short) (fB == 0.0f ? 1 : fB == 1.0f ? 2 : 3);
        EventDispatcher reactEventDispatcher = aVar.getReactEventDispatcher();
        if (reactEventDispatcher != null) {
            reactEventDispatcher.a(new crd(dmc.h(aVar), aVar.getId(), fB, z, z2, s));
        }
    }

    public void r(ReactContext reactContext) {
        if (reactContext != null) {
            int iOrdinal = ((LifecycleState) this.a).ordinal();
            if (iOrdinal == 1) {
                s55.n("BridgelessReact", "ReactContext.onHostDestroy()");
                reactContext.onHostDestroy();
            } else if (iOrdinal == 2) {
                s55.n("BridgelessReact", "ReactContext.onHostPause()");
                reactContext.onHostPause();
                s55.n("BridgelessReact", "ReactContext.onHostDestroy()");
                reactContext.onHostDestroy();
            }
        }
        this.a = LifecycleState.a;
    }

    public void s(ReactContext reactContext, Activity activity) {
        if (reactContext != null) {
            int iOrdinal = ((LifecycleState) this.a).ordinal();
            if (iOrdinal == 0) {
                s55.n("BridgelessReact", "ReactContext.onHostResume()");
                reactContext.onHostResume(activity);
                s55.n("BridgelessReact", "ReactContext.onHostPause()");
                reactContext.onHostPause();
            } else if (iOrdinal == 2) {
                s55.n("BridgelessReact", "ReactContext.onHostPause()");
                reactContext.onHostPause();
            }
        }
        this.a = LifecycleState.b;
    }

    public void t() {
        if (((maf) this.a).i()) {
            return;
        }
        r6.g("Cannot cancel a completed task.");
    }

    public void u(Exception exc) {
        maf mafVar = (maf) this.a;
        synchronized (mafVar.a) {
            if (mafVar.b) {
                r6.g("Cannot set the error on a completed task.");
                return;
            }
            mafVar.b = true;
            mafVar.e = exc;
            mafVar.a.notifyAll();
            mafVar.h();
        }
    }

    public void v(Object obj) {
        if (((maf) this.a).j(obj)) {
            return;
        }
        r6.g("Cannot set the result of a completed task.");
    }

    public void w(String str) {
        i0i i0iVar = (i0i) this.a;
        Context context = i0iVar.a;
        a0i a0iVar = i0iVar.Y;
        ewh ewhVar = i0iVar.X;
        if (str == null || str.isEmpty()) {
            i0i.i(ewhVar);
            ewhVar.Y.b("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        i0i.i(a0iVar);
        a0iVar.b();
        if (!x()) {
            i0i.i(ewhVar);
            ewhVar.a0.b("Install Referrer Reporter is not available");
            return;
        }
        fzh fzhVar = new fzh(this, str);
        i0i.i(a0iVar);
        a0iVar.b();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            i0i.i(ewhVar);
            ewhVar.Y.b("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
            return;
        }
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            i0i.i(ewhVar);
            ewhVar.a0.b("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
        if (serviceInfo != null) {
            String str2 = serviceInfo.packageName;
            if (serviceInfo.name == null || !"com.android.vending".equals(str2) || !x()) {
                i0i.i(ewhVar);
                ewhVar.X.b("Play Store version 8.3.73 or higher required for Install Referrer");
                return;
            }
            try {
                boolean zA = zo2.b().a(context, new Intent(intent), fzhVar, 1);
                i0i.i(ewhVar);
                ewhVar.c0.a(zA ? "available" : "not available", "Install Referrer Service is");
            } catch (Exception e) {
                i0i.i(ewhVar);
                ewhVar.f.a(e.getMessage(), "Exception occurred while binding to Install Referrer Service");
            }
        }
    }

    @VisibleForTesting
    public boolean x() {
        i0i i0iVar = (i0i) this.a;
        ewh ewhVar = i0iVar.X;
        try {
            sya syaVarA = a5h.a(i0iVar.a);
            if (syaVarA != null) {
                return syaVarA.b(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, "com.android.vending").versionCode >= 80837300;
            }
            i0i.i(ewhVar);
            ewhVar.c0.b("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            i0i.i(ewhVar);
            ewhVar.c0.a(e, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }

    public /* synthetic */ hzh(Object obj) {
        this.a = obj;
    }
}
