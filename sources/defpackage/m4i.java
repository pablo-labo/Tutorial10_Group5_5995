package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzn;
import com.indeed.android.jobsearch.R;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class m4i extends m0i {
    public final AtomicReference<String> V;
    public final aki W;

    @VisibleForTesting
    public boolean X;

    @VisibleForTesting
    public s6i c;
    public AppMeasurementDynamiteService.b d;
    public final CopyOnWriteArraySet e;
    public boolean f;

    public m4i(i0i i0iVar) {
        super(i0iVar);
        this.e = new CopyOnWriteArraySet();
        this.X = true;
        this.V = new AtomicReference<>();
        this.W = new aki(i0iVar);
    }

    @Override // defpackage.m0i
    public final boolean m() {
        return false;
    }

    public final void n(long j, Bundle bundle, String str, String str2) {
        g();
        b();
        q(str, str2, j, bundle, true, this.d == null || yei.h0(str2), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(long r9, java.lang.Object r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m4i.o(long, java.lang.Object, java.lang.String, java.lang.String):void");
    }

    public final void p(Bundle bundle, long j) {
        fib.i(bundle);
        g();
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            zzr().X.b("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        mxg.f(bundle2, "app_id", String.class, null);
        mxg.f(bundle2, "origin", String.class, null);
        mxg.f(bundle2, "name", String.class, null);
        mxg.f(bundle2, "value", Object.class, null);
        mxg.f(bundle2, "trigger_event_name", String.class, null);
        mxg.f(bundle2, "trigger_timeout", Long.class, 0L);
        mxg.f(bundle2, "timed_out_event_name", String.class, null);
        mxg.f(bundle2, "timed_out_event_params", Bundle.class, null);
        mxg.f(bundle2, "triggered_event_name", String.class, null);
        mxg.f(bundle2, "triggered_event_params", Bundle.class, null);
        mxg.f(bundle2, "time_to_live", Long.class, 0L);
        mxg.f(bundle2, "expired_event_name", String.class, null);
        mxg.f(bundle2, "expired_event_params", Bundle.class, null);
        fib.f(bundle2.getString("name"));
        fib.f(bundle2.getString("origin"));
        fib.i(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (e().c0(string) != 0) {
            zzr().f.a(d().p(string), "Invalid conditional user property name");
            return;
        }
        if (e().V(obj, string) != 0) {
            zzr().f.c("Invalid conditional user property value", d().p(string), obj);
            return;
        }
        Object objD0 = e().d0(obj, string);
        if (objD0 == null) {
            zzr().f.c("Unable to normalize conditional user property value", d().p(string), obj);
            return;
        }
        mxg.g(bundle2, objD0);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            zzr().f.c("Invalid conditional user property timeout", d().p(string), Long.valueOf(j2));
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 > 15552000000L || j3 < 1) {
            zzr().f.c("Invalid conditional user property time to live", d().p(string), Long.valueOf(j3));
        } else {
            zzq().m(new zs1(2, this, bundle2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(java.lang.String r34, java.lang.String r35, long r36, android.os.Bundle r38, boolean r39, boolean r40, boolean r41) {
        /*
            Method dump skipped, instruction units count: 1382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m4i.q(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean):void");
    }

    public final void r(String str, String str2, Bundle bundle) {
        this.a.c0.getClass();
        s(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    public final void s(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        g();
        if (str == null) {
            str = SessionEndedMetric.PROCESS_TYPE_VALUE;
        }
        String str3 = str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        wmi wmiVar = this.a.V;
        svh<Boolean> svhVar = djh.C0;
        if (!wmiVar.k(null, svhVar) || !yei.f0(str2, "screen_view")) {
            boolean z3 = !z2 || this.d == null || yei.h0(str2);
            boolean z4 = !z;
            Bundle bundle3 = new Bundle(bundle2);
            for (String str4 : bundle3.keySet()) {
                Object obj = bundle3.get(str4);
                if (obj instanceof Bundle) {
                    bundle3.putBundle(str4, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (int i = 0; i < parcelableArr.length; i++) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
            zzq().m(new f5i(this, str3, str2, j, bundle3, z2, z3, z4));
            return;
        }
        c8i c8iVarI = i();
        if (!c8iVarI.a.V.k(null, svhVar)) {
            c8iVarI.zzr().Z.b("Manual screen reporting is disabled.");
            return;
        }
        synchronized (c8iVarI.a0) {
            try {
                if (!c8iVarI.Z) {
                    c8iVarI.zzr().Z.b("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle2.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > 100)) {
                    c8iVarI.zzr().Z.a(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
                    return;
                }
                String string2 = bundle2.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > 100)) {
                    c8iVarI.zzr().Z.a(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
                    return;
                }
                if (string2 == null) {
                    Activity activity = c8iVarI.V;
                    string2 = activity != null ? c8i.n(activity.getClass().getCanonicalName()) : "Activity";
                }
                if (c8iVarI.W && c8iVarI.c != null) {
                    c8iVarI.W = false;
                    boolean zF0 = yei.f0(c8iVarI.c.b, string2);
                    boolean zF02 = yei.f0(c8iVarI.c.a, string);
                    if (zF0 && zF02) {
                        c8iVarI.zzr().Z.b("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                c8iVarI.zzr().c0.c("Logging screen view with name, class", string == null ? "null" : string, string2);
                f8i f8iVar = c8iVarI.c == null ? c8iVarI.d : c8iVarI.c;
                f8i f8iVar2 = new f8i(string, string2, c8iVarI.e().i0(), true);
                c8iVarI.c = f8iVar2;
                c8iVarI.d = f8iVar;
                c8iVarI.X = f8iVar2;
                c8iVarI.a.c0.getClass();
                c8iVarI.zzq().m(new m8i(c8iVarI, bundle2, f8iVar2, f8iVar, SystemClock.elapsedRealtime()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(java.lang.String r8, java.lang.String r9, java.lang.Object r10, boolean r11, long r12) {
        /*
            r7 = this;
            if (r8 != 0) goto L4
            java.lang.String r8 = "app"
        L4:
            r2 = r8
            r8 = 0
            r0 = 24
            if (r11 == 0) goto L13
            yei r11 = r7.e()
            int r11 = r11.c0(r9)
            goto L35
        L13:
            yei r11 = r7.e()
            java.lang.String r1 = "user property"
            boolean r3 = r11.N(r1, r9)
            r4 = 6
            if (r3 != 0) goto L22
        L20:
            r11 = r4
            goto L35
        L22:
            java.lang.String[] r3 = defpackage.ak2.f0
            boolean r3 = r11.S(r3, r1, r9)
            if (r3 != 0) goto L2d
            r11 = 15
            goto L35
        L2d:
            boolean r11 = r11.I(r0, r1, r9)
            if (r11 != 0) goto L34
            goto L20
        L34:
            r11 = r8
        L35:
            java.lang.String r1 = "_ev"
            i0i r3 = r7.a
            r4 = 1
            if (r11 == 0) goto L52
            r7.e()
            java.lang.String r7 = defpackage.yei.t(r0, r9, r4)
            if (r9 == 0) goto L49
            int r8 = r9.length()
        L49:
            yei r9 = r3.a0
            defpackage.i0i.c(r9)
            r9.y(r1, r11, r8, r7)
            return
        L52:
            if (r10 == 0) goto L98
            yei r11 = r7.e()
            int r11 = r11.V(r10, r9)
            if (r11 == 0) goto L7e
            r7.e()
            java.lang.String r7 = defpackage.yei.t(r0, r9, r4)
            boolean r9 = r10 instanceof java.lang.String
            if (r9 != 0) goto L6d
            boolean r9 = r10 instanceof java.lang.CharSequence
            if (r9 == 0) goto L75
        L6d:
            java.lang.String r8 = java.lang.String.valueOf(r10)
            int r8 = r8.length()
        L75:
            yei r9 = r3.a0
            defpackage.i0i.c(r9)
            r9.y(r1, r11, r8, r7)
            return
        L7e:
            yei r8 = r7.e()
            java.lang.Object r4 = r8.d0(r10, r9)
            if (r4 == 0) goto L97
            a0i r8 = r7.zzq()
            d5i r0 = new d5i
            r1 = r7
            r3 = r9
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r8.m(r0)
        L97:
            return
        L98:
            r1 = r7
            r3 = r9
            r5 = r12
            a0i r7 = r1.zzq()
            d5i r0 = new d5i
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            r7.m(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m4i.t(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    public final void u() {
        i0i i0iVar = this.a;
        if (i0iVar.a.getApplicationContext() instanceof Application) {
            ((Application) i0iVar.a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.c);
        }
    }

    public final void v() {
        b();
        g();
        k();
        i0i i0iVar = this.a;
        boolean zF = i0iVar.f();
        wmi wmiVar = i0iVar.V;
        if (zF) {
            if (wmiVar.k(null, djh.g0)) {
                awd awdVar = wmiVar.a.f;
                Boolean boolM = wmiVar.m("google_analytics_deferred_deep_link_enabled");
                if (boolM != null && boolM.booleanValue()) {
                    zzr().b0.b("Deferred Deep Link feature enabled.");
                    zzq().m(new s4i(this));
                }
            }
            y8i y8iVarM = i0iVar.m();
            y8iVarM.b();
            y8iVarM.k();
            zzn zznVarN = y8iVarM.n(true);
            y8iVarM.a.l().o(3, new byte[0]);
            y8iVarM.p(new i9i(y8iVarM, zznVarN));
            this.X = false;
            eyh eyhVarF = f();
            eyhVarF.b();
            String string = eyhVarF.n().getString("previous_os_version", null);
            eyhVarF.a.n().g();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = eyhVarF.n().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            i0iVar.n().g();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            r("auto", "_ou", bundle);
        }
    }

    public final String w() {
        i0i i0iVar = this.a;
        String str = i0iVar.b;
        if (str != null) {
            return str;
        }
        try {
            Context context = i0iVar.a;
            fib.i(context);
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("google_app_id", "string", resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue));
            if (identifier == 0) {
                return null;
            }
            return resources.getString(identifier);
        } catch (IllegalStateException e) {
            ewh ewhVar = i0iVar.X;
            i0i.i(ewhVar);
            ewhVar.f.a(e, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void x() {
        b();
        String strA = f().h0.a();
        i0i i0iVar = this.a;
        if (strA != null) {
            if ("unset".equals(strA)) {
                i0iVar.c0.getClass();
                o(System.currentTimeMillis(), null, SessionEndedMetric.PROCESS_TYPE_VALUE, "_npa");
            } else {
                Long lValueOf = Long.valueOf("true".equals(strA) ? 1L : 0L);
                i0iVar.c0.getClass();
                o(System.currentTimeMillis(), lValueOf, SessionEndedMetric.PROCESS_TYPE_VALUE, "_npa");
            }
        }
        boolean zD = i0iVar.d();
        wmi wmiVar = i0iVar.V;
        if (!zD || !this.X) {
            zzr().b0.b("Updating Scion state (FE)");
            y8i y8iVarM = i0iVar.m();
            y8iVarM.b();
            y8iVarM.k();
            y8iVarM.p(new uai(y8iVarM, y8iVarM.n(true)));
            return;
        }
        zzr().b0.b("Recording app launch after enabling measurement for the first time (FE)");
        v();
        ((cgi) zfi.b.zza()).getClass();
        if (wmiVar.k(null, djh.v0)) {
            j().d.a();
        }
        ((xei) pei.b.zza()).getClass();
        if (wmiVar.k(null, djh.A0)) {
            eyh eyhVar = ((i0i) i0iVar.l0.a).W;
            i0i.c(eyhVar);
            if (eyhVar.Z.a() <= 0) {
                hzh hzhVar = i0iVar.l0;
                hzhVar.w(((i0i) hzhVar.a).a.getPackageName());
            }
        }
        if (wmiVar.k(null, djh.P0)) {
            zzq().m(new l6i(this, 0));
        }
    }
}
