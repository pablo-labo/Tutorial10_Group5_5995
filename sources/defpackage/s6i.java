package defpackage;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(ModuleDescriptor.MODULE_VERSION)
public final class s6i implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ m4i a;

    public s6i(m4i m4iVar) {
        this.a = m4iVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m4i m4iVar = this.a;
        try {
            try {
                m4iVar.zzr().c0.b("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    m4iVar.i().p(activity, bundle);
                    return;
                }
                Uri data = intent.getData();
                if (data != null && data.isHierarchical()) {
                    m4iVar.e();
                    m4iVar.zzq().m(new m7i(this, bundle == null, data, yei.J(intent) ? "gs" : "auto", data.getQueryParameter("referrer")));
                    m4iVar.i().p(activity, bundle);
                }
            } catch (Exception e) {
                m4iVar.zzr().f.a(e, "Throwable caught in onActivityCreated");
                m4iVar.i().p(activity, bundle);
            }
        } finally {
            m4iVar.i().p(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        c8i c8iVarI = this.a.i();
        synchronized (c8iVarI.a0) {
            try {
                if (activity == c8iVarI.V) {
                    c8iVarI.V = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c8iVarI.a.V.r().booleanValue()) {
            c8iVarI.f.remove(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c8i c8iVarI = this.a.i();
        if (c8iVarI.a.V.k(null, djh.C0)) {
            synchronized (c8iVarI.a0) {
                c8iVarI.Z = false;
                c8iVarI.W = true;
            }
        }
        c8iVarI.a.c0.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!c8iVarI.a.V.k(null, djh.B0) || c8iVarI.a.V.r().booleanValue()) {
            f8i f8iVarU = c8iVarI.u(activity);
            c8iVarI.d = c8iVarI.c;
            c8iVarI.c = null;
            c8iVarI.zzq().m(new v8i(c8iVarI, f8iVarU, jElapsedRealtime));
        } else {
            c8iVarI.c = null;
            c8iVarI.zzq().m(new p8i(c8iVarI, jElapsedRealtime));
        }
        mci mciVarJ = this.a.j();
        mciVarJ.a.c0.getClass();
        mciVarJ.zzq().m(new qci(mciVarJ, SystemClock.elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        mci mciVarJ = this.a.j();
        mciVarJ.a.c0.getClass();
        mciVarJ.zzq().m(new jci(mciVarJ, SystemClock.elapsedRealtime()));
        c8i c8iVarI = this.a.i();
        if (c8iVarI.a.V.k(null, djh.C0)) {
            synchronized (c8iVarI.a0) {
                int i = 1;
                c8iVarI.Z = true;
                if (activity != c8iVarI.V) {
                    synchronized (c8iVarI.a0) {
                        c8iVarI.V = activity;
                        c8iVarI.W = false;
                    }
                    if (c8iVarI.a.V.k(null, djh.B0) && c8iVarI.a.V.r().booleanValue()) {
                        c8iVarI.X = null;
                        c8iVarI.zzq().m(new l6i(c8iVarI, i));
                    }
                }
            }
        }
        if (c8iVarI.a.V.k(null, djh.B0) && !c8iVarI.a.V.r().booleanValue()) {
            c8iVarI.c = c8iVarI.X;
            c8iVarI.zzq().m(new s8i(c8iVarI));
            return;
        }
        c8iVarI.q(activity, c8iVarI.u(activity), false);
        lfh lfhVarP = c8iVarI.a.p();
        lfhVarP.a.c0.getClass();
        lfhVarP.zzq().m(new guh(lfhVarP, SystemClock.elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        f8i f8iVar;
        c8i c8iVarI = this.a.i();
        if (!c8iVarI.a.V.r().booleanValue() || bundle == null || (f8iVar = (f8i) c8iVarI.f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", f8iVar.c);
        bundle2.putString("name", f8iVar.a);
        bundle2.putString("referrer_name", f8iVar.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
