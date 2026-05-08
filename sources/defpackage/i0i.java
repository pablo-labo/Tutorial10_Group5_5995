package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzae;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class i0i implements f3i {
    public static volatile i0i v0;
    public final wmi V;
    public final eyh W;
    public final ewh X;
    public final a0i Y;
    public final mci Z;
    public final Context a;
    public final yei a0;
    public final String b;
    public final bwh b0;
    public final String c;
    public final jh2 c0;
    public final String d;
    public final c8i d0;
    public final boolean e;
    public final m4i e0;
    public final awd f;
    public final lfh f0;
    public final q7i g0;
    public xvh h0;
    public y8i i0;
    public zhh j0;
    public zvh k0;
    public hzh l0;
    public Boolean n0;
    public long o0;
    public volatile Boolean p0;

    @VisibleForTesting
    public final Boolean q0;

    @VisibleForTesting
    public final Boolean r0;
    public int s0;

    @VisibleForTesting
    public final long u0;
    public boolean m0 = false;
    public final AtomicInteger t0 = new AtomicInteger(0);

    public i0i(p4i p4iVar) {
        Context context;
        Bundle bundle;
        boolean z = false;
        Context context2 = p4iVar.a;
        awd awdVar = new awd();
        this.f = awdVar;
        zte.a = awdVar;
        this.a = context2;
        this.b = p4iVar.b;
        this.c = p4iVar.c;
        this.d = p4iVar.d;
        this.e = p4iVar.h;
        this.p0 = p4iVar.e;
        zzae zzaeVar = p4iVar.g;
        if (zzaeVar != null && (bundle = zzaeVar.V) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.q0 = (Boolean) obj;
            }
            Object obj2 = zzaeVar.V.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.r0 = (Boolean) obj2;
            }
        }
        synchronized (hrh.f) {
            Context applicationContext = context2.getApplicationContext();
            applicationContext = applicationContext == null ? context2 : applicationContext;
            if (hrh.g != applicationContext) {
                jqh.c();
                nsh.a();
                synchronized (brh.class) {
                    try {
                        brh brhVar = brh.c;
                        if (brhVar != null && (context = brhVar.a) != null && brhVar.b != null) {
                            context.getContentResolver().unregisterContentObserver(brh.c.b);
                        }
                        brh.c = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hrh.h = web.J(web.X);
                hrh.g = applicationContext;
                hrh.i.incrementAndGet();
            }
        }
        this.c0 = jh2.f;
        Long l = p4iVar.i;
        this.u0 = l != null ? l.longValue() : System.currentTimeMillis();
        wmi wmiVar = new wmi(this, 1);
        wmiVar.c = ee3.Y;
        this.V = wmiVar;
        eyh eyhVar = new eyh(this);
        eyhVar.h();
        this.W = eyhVar;
        ewh ewhVar = new ewh(this);
        ewhVar.h();
        this.X = ewhVar;
        yei yeiVar = new yei(this);
        yeiVar.h();
        this.a0 = yeiVar;
        bwh bwhVar = new bwh(this);
        bwhVar.h();
        this.b0 = bwhVar;
        this.f0 = new lfh(this);
        c8i c8iVar = new c8i(this);
        c8iVar.l();
        this.d0 = c8iVar;
        m4i m4iVar = new m4i(this);
        m4iVar.l();
        this.e0 = m4iVar;
        mci mciVar = new mci(this);
        mciVar.l();
        this.Z = mciVar;
        q7i q7iVar = new q7i(this);
        q7iVar.h();
        this.g0 = q7iVar;
        a0i a0iVar = new a0i(this);
        a0iVar.h();
        this.Y = a0iVar;
        zzae zzaeVar2 = p4iVar.g;
        if (zzaeVar2 != null && zzaeVar2.b != 0) {
            z = true;
        }
        if (context2.getApplicationContext() instanceof Application) {
            h(m4iVar);
            if (m4iVar.a.a.getApplicationContext() instanceof Application) {
                Application application = (Application) m4iVar.a.a.getApplicationContext();
                if (m4iVar.c == null) {
                    m4iVar.c = new s6i(m4iVar);
                }
                if (!z) {
                    application.unregisterActivityLifecycleCallbacks(m4iVar.c);
                    application.registerActivityLifecycleCallbacks(m4iVar.c);
                    m4iVar.zzr().c0.b("Registered activity lifecycle callback");
                }
            }
        } else {
            i(ewhVar);
            ewhVar.X.b("Application context is not an Application");
        }
        a0iVar.m(new aih(this, p4iVar));
    }

    public static i0i b(Context context, zzae zzaeVar, Long l) {
        Bundle bundle;
        if (zzaeVar != null && (zzaeVar.e == null || zzaeVar.f == null)) {
            zzaeVar = new zzae(zzaeVar.a, zzaeVar.b, zzaeVar.c, zzaeVar.d, null, null, zzaeVar.V);
        }
        fib.i(context);
        fib.i(context.getApplicationContext());
        if (v0 == null) {
            synchronized (i0i.class) {
                try {
                    if (v0 == null) {
                        v0 = new i0i(new p4i(context, zzaeVar, l));
                    }
                } finally {
                }
            }
        } else if (zzaeVar != null && (bundle = zzaeVar.V) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            v0.p0 = Boolean.valueOf(zzaeVar.V.getBoolean("dataCollectionDefaultEnabled"));
        }
        return v0;
    }

    public static void c(c1i c1iVar) {
        if (c1iVar != null) {
            return;
        }
        r6.g("Component not created");
    }

    public static void h(m0i m0iVar) {
        if (m0iVar == null) {
            r6.g("Component not created");
        } else {
            if (m0iVar.b) {
                return;
            }
            String strValueOf = String.valueOf(m0iVar.getClass());
            StringBuilder sb = new StringBuilder(strValueOf.length() + 27);
            sb.append("Component not initialized: ");
            sb.append(strValueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void i(j3i j3iVar) {
        if (j3iVar == null) {
            r6.g("Component not created");
        } else {
            if (j3iVar.b) {
                return;
            }
            String strValueOf = String.valueOf(j3iVar.getClass());
            StringBuilder sb = new StringBuilder(strValueOf.length() + 27);
            sb.append("Component not initialized: ");
            sb.append(strValueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    @Override // defpackage.f3i
    public final awd a() {
        return this.f;
    }

    public final boolean d() {
        return e() == 0;
    }

    public final int e() {
        a0i a0iVar = this.Y;
        i(a0iVar);
        a0iVar.b();
        if (this.V.p()) {
            return 1;
        }
        Boolean bool = this.r0;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        eyh eyhVar = this.W;
        c(eyhVar);
        eyhVar.b();
        Boolean boolValueOf = eyhVar.n().contains("measurement_enabled") ? Boolean.valueOf(eyhVar.n().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        wmi wmiVar = this.V;
        awd awdVar = wmiVar.a.f;
        Boolean boolM = wmiVar.m("firebase_analytics_collection_enabled");
        if (boolM != null) {
            return boolM.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.q0;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        if (cb6.a("isMeasurementExplicitlyDisabled").c) {
            return 6;
        }
        return (!this.V.k(null, djh.T) || this.p0 == null || this.p0.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f() {
        /*
            r7 = this;
            boolean r0 = r7.m0
            r1 = 0
            if (r0 == 0) goto Lbd
            a0i r0 = r7.Y
            i(r0)
            r0.b()
            java.lang.Boolean r0 = r7.n0
            jh2 r2 = r7.c0
            if (r0 == 0) goto L35
            long r3 = r7.o0
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L35
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lb6
            r2.getClass()
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r7.o0
            long r3 = r3 - r5
            long r3 = java.lang.Math.abs(r3)
            r5 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto Lb6
        L35:
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            r7.o0 = r2
            yei r0 = r7.a0
            c(r0)
            java.lang.String r2 = "android.permission.INTERNET"
            boolean r2 = r0.g0(r2)
            r3 = 1
            if (r2 == 0) goto L76
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r2 = r0.g0(r2)
            if (r2 == 0) goto L76
            android.content.Context r2 = r7.a
            sya r4 = defpackage.a5h.a(r2)
            boolean r4 = r4.c()
            if (r4 != 0) goto L74
            wmi r4 = r7.V
            boolean r4 = r4.s()
            if (r4 != 0) goto L74
            boolean r4 = defpackage.kzh.a(r2)
            if (r4 == 0) goto L76
            boolean r2 = defpackage.yei.U(r2)
            if (r2 == 0) goto L76
        L74:
            r2 = r3
            goto L77
        L76:
            r2 = r1
        L77:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            r7.n0 = r4
            if (r2 == 0) goto Lb6
            zvh r2 = r7.o()
            r2.k()
            java.lang.String r2 = r2.Z
            zvh r4 = r7.o()
            r4.k()
            java.lang.String r4 = r4.a0
            zvh r5 = r7.o()
            r5.k()
            java.lang.String r5 = r5.b0
            boolean r0 = r0.P(r2, r4, r5)
            if (r0 != 0) goto Laf
            zvh r0 = r7.o()
            r0.k()
            java.lang.String r0 = r0.a0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb0
        Laf:
            r1 = r3
        Lb0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r7.n0 = r0
        Lb6:
            java.lang.Boolean r7 = r7.n0
            boolean r7 = r7.booleanValue()
            return r7
        Lbd:
            java.lang.String r7 = "AppMeasurement is not initialized"
            defpackage.r6.g(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i0i.f():boolean");
    }

    public final wmi g() {
        return this.V;
    }

    public final yei j() {
        yei yeiVar = this.a0;
        c(yeiVar);
        return yeiVar;
    }

    public final bwh k() {
        bwh bwhVar = this.b0;
        c(bwhVar);
        return bwhVar;
    }

    public final xvh l() {
        h(this.h0);
        return this.h0;
    }

    public final y8i m() {
        h(this.i0);
        return this.i0;
    }

    public final zhh n() {
        i(this.j0);
        return this.j0;
    }

    public final zvh o() {
        h(this.k0);
        return this.k0;
    }

    public final lfh p() {
        lfh lfhVar = this.f0;
        if (lfhVar != null) {
            return lfhVar;
        }
        r6.g("Component not created");
        return null;
    }

    @Override // defpackage.f3i
    public final jh2 zzm() {
        return this.c0;
    }

    @Override // defpackage.f3i
    public final Context zzn() {
        return this.a;
    }

    @Override // defpackage.f3i
    public final a0i zzq() {
        a0i a0iVar = this.Y;
        i(a0iVar);
        return a0iVar;
    }

    @Override // defpackage.f3i
    public final ewh zzr() {
        ewh ewhVar = this.X;
        i(ewhVar);
        return ewhVar;
    }
}
