package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzae;
import defpackage.a0i;
import defpackage.c4i;
import defpackage.c8i;
import defpackage.e3h;
import defpackage.ewh;
import defpackage.f6i;
import defpackage.f7i;
import defpackage.f8i;
import defpackage.fib;
import defpackage.g4i;
import defpackage.gdi;
import defpackage.gmi;
import defpackage.ht0;
import defpackage.i0i;
import defpackage.i6i;
import defpackage.igh;
import defpackage.j5i;
import defpackage.jaf;
import defpackage.m4i;
import defpackage.p6i;
import defpackage.pgh;
import defpackage.qli;
import defpackage.r6;
import defpackage.rs3;
import defpackage.s6i;
import defpackage.t1;
import defpackage.t9d;
import defpackage.tn6;
import defpackage.u4i;
import defpackage.u5i;
import defpackage.u6i;
import defpackage.u9i;
import defpackage.vna;
import defpackage.w4i;
import defpackage.y4i;
import defpackage.yei;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends qli {

    @VisibleForTesting
    public i0i a = null;
    public final ht0 b = new ht0();

    public class a implements g4i {
        public final igh a;

        public a(igh ighVar) {
            this.a = ighVar;
        }

        @Override // defpackage.g4i
        public final void a(long j, Bundle bundle, String str, String str2) {
            try {
                this.a.S(j, bundle, str, str2);
            } catch (RemoteException e) {
                ewh ewhVar = AppMeasurementDynamiteService.this.a.X;
                i0i.i(ewhVar);
                ewhVar.X.a(e, "Event listener threw exception");
            }
        }
    }

    public class b {
        public final igh a;

        public b(igh ighVar) {
            this.a = ighVar;
        }
    }

    @Override // defpackage.xli
    public void beginAdUnitExposure(String str, long j) {
        e();
        this.a.p().l(j, str);
    }

    @Override // defpackage.xli
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        e();
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        m4iVar.g();
        m4iVar.a.c0.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        fib.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        m4iVar.zzq().m(new rs3(1, m4iVar, bundle2));
    }

    public final void e() {
        if (this.a != null) {
            return;
        }
        r6.g("Attempting to perform action before initialize.");
    }

    @Override // defpackage.xli
    public void endAdUnitExposure(String str, long j) {
        e();
        this.a.p().p(j, str);
    }

    @Override // defpackage.xli
    public void generateEventId(gmi gmiVar) {
        e();
        yei yeiVar = this.a.a0;
        i0i.c(yeiVar);
        long jI0 = yeiVar.i0();
        yei yeiVar2 = this.a.a0;
        i0i.c(yeiVar2);
        yeiVar2.D(gmiVar, jI0);
    }

    @Override // defpackage.xli
    public void getAppInstanceId(gmi gmiVar) {
        e();
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.m(new c4i(this, gmiVar, 0));
    }

    @Override // defpackage.xli
    public void getCachedAppInstanceId(gmi gmiVar) {
        e();
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        m4iVar.g();
        String str = m4iVar.V.get();
        yei yeiVar = this.a.a0;
        i0i.c(yeiVar);
        yeiVar.A(str, gmiVar);
    }

    @Override // defpackage.xli
    public void getConditionalUserProperties(String str, String str2, gmi gmiVar) {
        e();
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.m(new e3h(this, gmiVar, str, str2, 1));
    }

    @Override // defpackage.xli
    public void getCurrentScreenClass(gmi gmiVar) {
        e();
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        c8i c8iVar = m4iVar.a.d0;
        i0i.h(c8iVar);
        c8iVar.g();
        f8i f8iVar = c8iVar.c;
        String str = f8iVar != null ? f8iVar.b : null;
        yei yeiVar = this.a.a0;
        i0i.c(yeiVar);
        yeiVar.A(str, gmiVar);
    }

    @Override // defpackage.xli
    public void getCurrentScreenName(gmi gmiVar) {
        e();
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        c8i c8iVar = m4iVar.a.d0;
        i0i.h(c8iVar);
        c8iVar.g();
        f8i f8iVar = c8iVar.c;
        String str = f8iVar != null ? f8iVar.a : null;
        yei yeiVar = this.a.a0;
        i0i.c(yeiVar);
        yeiVar.A(str, gmiVar);
    }

    @Override // defpackage.xli
    public void getGmpAppId(gmi gmiVar) {
        e();
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        String strW = m4iVar.w();
        yei yeiVar = this.a.a0;
        i0i.c(yeiVar);
        yeiVar.A(strW, gmiVar);
    }

    @Override // defpackage.xli
    public void getMaxUserProperties(String str, gmi gmiVar) {
        e();
        i0i.h(this.a.e0);
        fib.f(str);
        yei yeiVar = this.a.a0;
        i0i.c(yeiVar);
        yeiVar.C(gmiVar, 25);
    }

    @Override // defpackage.xli
    public void getTestFlag(gmi gmiVar, int i) {
        e();
        if (i == 0) {
            yei yeiVar = this.a.a0;
            i0i.c(yeiVar);
            m4i m4iVar = this.a.e0;
            i0i.h(m4iVar);
            AtomicReference atomicReference = new AtomicReference();
            yeiVar.A((String) m4iVar.zzq().j(atomicReference, 15000L, "String test flag value", new u5i(m4iVar, atomicReference)), gmiVar);
            return;
        }
        int i2 = 1;
        if (i == 1) {
            yei yeiVar2 = this.a.a0;
            i0i.c(yeiVar2);
            m4i m4iVar2 = this.a.e0;
            i0i.h(m4iVar2);
            AtomicReference atomicReference2 = new AtomicReference();
            yeiVar2.D(gmiVar, ((Long) m4iVar2.zzq().j(atomicReference2, 15000L, "long test flag value", new f6i(m4iVar2, atomicReference2))).longValue());
            return;
        }
        if (i == 2) {
            yei yeiVar3 = this.a.a0;
            i0i.c(yeiVar3);
            m4i m4iVar3 = this.a.e0;
            i0i.h(m4iVar3);
            AtomicReference atomicReference3 = new AtomicReference();
            double dDoubleValue = ((Double) m4iVar3.zzq().j(atomicReference3, 15000L, "double test flag value", new t9d(i2, m4iVar3, atomicReference3))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                gmiVar.a(bundle);
                return;
            } catch (RemoteException e) {
                ewh ewhVar = yeiVar3.a.X;
                i0i.i(ewhVar);
                ewhVar.X.a(e, "Error returning double value to wrapper");
                return;
            }
        }
        int i3 = 3;
        if (i == 3) {
            yei yeiVar4 = this.a.a0;
            i0i.c(yeiVar4);
            m4i m4iVar4 = this.a.e0;
            i0i.h(m4iVar4);
            AtomicReference atomicReference4 = new AtomicReference();
            yeiVar4.C(gmiVar, ((Integer) m4iVar4.zzq().j(atomicReference4, 15000L, "int test flag value", new jaf(i3, m4iVar4, atomicReference4))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        yei yeiVar5 = this.a.a0;
        i0i.c(yeiVar5);
        m4i m4iVar5 = this.a.e0;
        i0i.h(m4iVar5);
        AtomicReference atomicReference5 = new AtomicReference();
        yeiVar5.G(gmiVar, ((Boolean) m4iVar5.zzq().j(atomicReference5, 15000L, "boolean test flag value", new y4i(m4iVar5, atomicReference5))).booleanValue());
    }

    @Override // defpackage.xli
    public void getUserProperties(String str, String str2, boolean z, gmi gmiVar) {
        e();
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.m(new f7i(this, gmiVar, str, str2, z));
    }

    @Override // defpackage.xli
    public void initForTests(Map map) {
        e();
    }

    @Override // defpackage.xli
    public void initialize(tn6 tn6Var, zzae zzaeVar, long j) {
        Context context = (Context) vna.h(tn6Var);
        i0i i0iVar = this.a;
        if (i0iVar == null) {
            this.a = i0i.b(context, zzaeVar, Long.valueOf(j));
            return;
        }
        ewh ewhVar = i0iVar.X;
        i0i.i(ewhVar);
        ewhVar.X.b("Attempting to initialize multiple times");
    }

    @Override // defpackage.xli
    public void isDataCollectionEnabled(gmi gmiVar) {
        e();
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.m(new gdi(this, gmiVar));
    }

    @Override // defpackage.xli
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        e();
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        m4iVar.s(str, str2, bundle, z, z2, j);
    }

    @Override // defpackage.xli
    public void logEventAndBundle(String str, String str2, Bundle bundle, gmi gmiVar, long j) {
        e();
        fib.f(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", SessionEndedMetric.PROCESS_TYPE_VALUE);
        zzao zzaoVar = new zzao(str2, new zzan(bundle), SessionEndedMetric.PROCESS_TYPE_VALUE, j);
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.m(new u9i(this, gmiVar, zzaoVar, str));
    }

    @Override // defpackage.xli
    public void logHealthData(int i, String str, tn6 tn6Var, tn6 tn6Var2, tn6 tn6Var3) {
        e();
        Object objH = tn6Var == null ? null : vna.h(tn6Var);
        Object objH2 = tn6Var2 == null ? null : vna.h(tn6Var2);
        Object objH3 = tn6Var3 != null ? vna.h(tn6Var3) : null;
        ewh ewhVar = this.a.X;
        i0i.i(ewhVar);
        ewhVar.m(i, true, false, str, objH, objH2, objH3);
    }

    @Override // defpackage.xli
    public void onActivityCreated(tn6 tn6Var, Bundle bundle, long j) {
        e();
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        s6i s6iVar = m4iVar.c;
        if (s6iVar != null) {
            m4i m4iVar2 = this.a.e0;
            i0i.h(m4iVar2);
            m4iVar2.u();
            s6iVar.onActivityCreated((Activity) vna.h(tn6Var), bundle);
        }
    }

    @Override // defpackage.xli
    public void onActivityDestroyed(tn6 tn6Var, long j) {
        e();
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        s6i s6iVar = m4iVar.c;
        if (s6iVar != null) {
            m4i m4iVar2 = this.a.e0;
            i0i.h(m4iVar2);
            m4iVar2.u();
            s6iVar.onActivityDestroyed((Activity) vna.h(tn6Var));
        }
    }

    @Override // defpackage.xli
    public void onActivityPaused(tn6 tn6Var, long j) {
        e();
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        s6i s6iVar = m4iVar.c;
        if (s6iVar != null) {
            m4i m4iVar2 = this.a.e0;
            i0i.h(m4iVar2);
            m4iVar2.u();
            s6iVar.onActivityPaused((Activity) vna.h(tn6Var));
        }
    }

    @Override // defpackage.xli
    public void onActivityResumed(tn6 tn6Var, long j) {
        e();
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        s6i s6iVar = m4iVar.c;
        if (s6iVar != null) {
            m4i m4iVar2 = this.a.e0;
            i0i.h(m4iVar2);
            m4iVar2.u();
            s6iVar.onActivityResumed((Activity) vna.h(tn6Var));
        }
    }

    @Override // defpackage.xli
    public void onActivitySaveInstanceState(tn6 tn6Var, gmi gmiVar, long j) {
        e();
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        s6i s6iVar = m4iVar.c;
        Bundle bundle = new Bundle();
        if (s6iVar != null) {
            m4i m4iVar2 = this.a.e0;
            i0i.h(m4iVar2);
            m4iVar2.u();
            s6iVar.onActivitySaveInstanceState((Activity) vna.h(tn6Var), bundle);
        }
        try {
            gmiVar.a(bundle);
        } catch (RemoteException e) {
            ewh ewhVar = this.a.X;
            i0i.i(ewhVar);
            ewhVar.X.a(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // defpackage.xli
    public void onActivityStarted(tn6 tn6Var, long j) {
        e();
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        if (m4iVar.c != null) {
            m4i m4iVar2 = this.a.e0;
            i0i.h(m4iVar2);
            m4iVar2.u();
        }
    }

    @Override // defpackage.xli
    public void onActivityStopped(tn6 tn6Var, long j) {
        e();
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        if (m4iVar.c != null) {
            m4i m4iVar2 = this.a.e0;
            i0i.h(m4iVar2);
            m4iVar2.u();
        }
    }

    @Override // defpackage.xli
    public void performAction(Bundle bundle, gmi gmiVar, long j) {
        e();
        gmiVar.a(null);
    }

    @Override // defpackage.xli
    public void registerOnMeasurementEventListener(igh ighVar) {
        e();
        Integer numValueOf = Integer.valueOf(ighVar.zza());
        ht0 ht0Var = this.b;
        Object aVar = (g4i) ht0Var.get(numValueOf);
        if (aVar == null) {
            aVar = new a(ighVar);
            ht0Var.put(Integer.valueOf(ighVar.zza()), aVar);
        }
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        m4iVar.g();
        m4iVar.k();
        if (m4iVar.e.add(aVar)) {
            return;
        }
        m4iVar.zzr().X.b("OnEventListener already registered");
    }

    @Override // defpackage.xli
    public void resetAnalyticsData(long j) {
        e();
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        m4iVar.V.set(null);
        m4iVar.zzq().m(new j5i(m4iVar, j));
    }

    @Override // defpackage.xli
    public void setConditionalUserProperty(Bundle bundle, long j) {
        e();
        i0i i0iVar = this.a;
        if (bundle == null) {
            ewh ewhVar = i0iVar.X;
            i0i.i(ewhVar);
            ewhVar.f.b("Conditional user property must not be null");
        } else {
            m4i m4iVar = i0iVar.e0;
            i0i.h(m4iVar);
            m4iVar.p(bundle, j);
        }
    }

    @Override // defpackage.xli
    public void setCurrentScreen(tn6 tn6Var, String str, String str2, long j) {
        e();
        c8i c8iVar = this.a.d0;
        i0i.h(c8iVar);
        Activity activity = (Activity) vna.h(tn6Var);
        if (!c8iVar.a.V.r().booleanValue()) {
            c8iVar.zzr().Z.b("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        if (c8iVar.c == null) {
            c8iVar.zzr().Z.b("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (c8iVar.f.get(activity) == null) {
            c8iVar.zzr().Z.b("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = c8i.n(activity.getClass().getCanonicalName());
        }
        String str3 = str2;
        boolean zF0 = yei.f0(c8iVar.c.b, str3);
        boolean zF02 = yei.f0(c8iVar.c.a, str);
        if (zF0 && zF02) {
            c8iVar.zzr().Z.b("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > 100)) {
            c8iVar.zzr().Z.a(Integer.valueOf(str.length()), "Invalid screen name length in setCurrentScreen. Length");
            return;
        }
        if (str3.length() <= 0 || str3.length() > 100) {
            c8iVar.zzr().Z.a(Integer.valueOf(str3.length()), "Invalid class name length in setCurrentScreen. Length");
            return;
        }
        c8iVar.zzr().c0.c("Setting current screen to name, class", str == null ? "null" : str, str3);
        f8i f8iVar = new f8i(str, str3, c8iVar.e().i0(), false);
        c8iVar.f.put(activity, f8iVar);
        c8iVar.q(activity, f8iVar, true);
    }

    @Override // defpackage.xli
    public void setDataCollectionEnabled(boolean z) {
        e();
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        m4iVar.k();
        m4iVar.g();
        m4iVar.zzq().m(new p6i(m4iVar, z));
    }

    @Override // defpackage.xli
    public void setDefaultEventParameters(Bundle bundle) {
        e();
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        m4iVar.zzq().m(new u4i(m4iVar, bundle == null ? null : new Bundle(bundle)));
    }

    @Override // defpackage.xli
    public void setEventInterceptor(igh ighVar) {
        e();
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        b bVar = new b(ighVar);
        m4iVar.g();
        m4iVar.k();
        m4iVar.zzq().m(new t1(1, m4iVar, bVar));
    }

    @Override // defpackage.xli
    public void setInstanceIdProvider(pgh pghVar) {
        e();
    }

    @Override // defpackage.xli
    public void setMeasurementEnabled(boolean z, long j) {
        e();
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        m4iVar.k();
        m4iVar.g();
        m4iVar.zzq().m(new i6i(m4iVar, z));
    }

    @Override // defpackage.xli
    public void setMinimumSessionDuration(long j) {
        e();
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        m4iVar.g();
        m4iVar.zzq().m(new u6i(m4iVar, j));
    }

    @Override // defpackage.xli
    public void setSessionTimeoutDuration(long j) {
        e();
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        m4iVar.g();
        m4iVar.zzq().m(new w4i(m4iVar, j));
    }

    @Override // defpackage.xli
    public void setUserId(String str, long j) {
        e();
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        m4iVar.t(null, "_id", str, true, j);
    }

    @Override // defpackage.xli
    public void setUserProperty(String str, String str2, tn6 tn6Var, boolean z, long j) {
        e();
        Object objH = vna.h(tn6Var);
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        m4iVar.t(str, str2, objH, z, j);
    }

    @Override // defpackage.xli
    public void unregisterOnMeasurementEventListener(igh ighVar) {
        e();
        Object aVar = (g4i) this.b.remove(Integer.valueOf(ighVar.zza()));
        if (aVar == null) {
            aVar = new a(ighVar);
        }
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        m4iVar.g();
        m4iVar.k();
        if (m4iVar.e.remove(aVar)) {
            return;
        }
        m4iVar.zzr().X.b("OnEventListener had not been registered");
    }
}
