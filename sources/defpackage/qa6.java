package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes2.dex */
public final class qa6 implements Handler.Callback {
    public static final Status e0 = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status f0 = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object g0 = new Object();
    public static qa6 h0;
    public final xbh V;
    public TelemetryData c;

    @NotOnlyInitialized
    public final och c0;
    public dch d;
    public volatile boolean d0;
    public final Context e;
    public final na6 f;
    public long a = 10000;
    public boolean b = false;
    public final AtomicInteger W = new AtomicInteger(1);
    public final AtomicInteger X = new AtomicInteger(0);
    public final ConcurrentHashMap Y = new ConcurrentHashMap(5, 0.75f, 1);
    public k9h Z = null;
    public final ot0 a0 = new ot0(0);
    public final ot0 b0 = new ot0(0);

    public qa6(Context context, Looper looper, na6 na6Var) {
        this.d0 = true;
        this.e = context;
        och ochVar = new och(looper, this);
        Looper.getMainLooper();
        this.c0 = ochVar;
        this.f = na6Var;
        this.V = new xbh(na6Var);
        PackageManager packageManager = context.getPackageManager();
        if (pnb.a0 == null) {
            pnb.a0 = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (pnb.a0.booleanValue()) {
            this.d0 = false;
        }
        ochVar.sendMessage(ochVar.obtainMessage(6));
    }

    public static Status d(vg0 vg0Var, ConnectionResult connectionResult) {
        return new Status(17, t40.l("API: ", vg0Var.b.b, " is not available on this device. Connection failed with: ", String.valueOf(connectionResult)), connectionResult.c, connectionResult);
    }

    @ResultIgnorabilityUnspecified
    public static qa6 f(Context context) {
        qa6 qa6Var;
        HandlerThread handlerThread;
        synchronized (g0) {
            if (h0 == null) {
                synchronized (ka6.a) {
                    try {
                        handlerThread = ka6.c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            ka6.c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = ka6.c;
                        }
                    } finally {
                    }
                }
                h0 = new qa6(context.getApplicationContext(), handlerThread.getLooper(), na6.d);
            }
            qa6Var = h0;
        }
        return qa6Var;
    }

    public final void a(k9h k9hVar) {
        synchronized (g0) {
            try {
                if (this.Z != k9hVar) {
                    this.Z = k9hVar;
                    this.a0.clear();
                }
                this.a0.addAll(k9hVar.e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        if (this.b) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = pfd.a().a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.b) {
            return false;
        }
        int i = this.V.a.get(203400000, -1);
        return i == -1 || i == 0;
    }

    @ResultIgnorabilityUnspecified
    public final boolean c(ConnectionResult connectionResult, int i) {
        na6 na6Var = this.f;
        na6Var.getClass();
        Context context = this.e;
        if (!mg7.a(context)) {
            int i2 = connectionResult.b;
            PendingIntent activity = connectionResult.c;
            if (!((i2 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentA = na6Var.a(context, null, i2);
                if (intentA != null) {
                    activity = PendingIntent.getActivity(context, 0, intentA, 201326592);
                }
            }
            if (activity != null) {
                int i3 = GoogleApiActivity.b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                na6Var.g(context, i2, PendingIntent.getActivity(context, 0, intent, jch.a | 134217728));
                return true;
            }
        }
        return false;
    }

    @ResultIgnorabilityUnspecified
    public final y9h e(ma6 ma6Var) {
        vg0 vg0Var = ma6Var.e;
        ConcurrentHashMap concurrentHashMap = this.Y;
        y9h y9hVar = (y9h) concurrentHashMap.get(vg0Var);
        if (y9hVar == null) {
            y9hVar = new y9h(this, ma6Var);
            concurrentHashMap.put(vg0Var, y9hVar);
        }
        if (y9hVar.b.t0()) {
            this.b0.add(vg0Var);
        }
        y9hVar.n();
        return y9hVar;
    }

    public final void g(ConnectionResult connectionResult, int i) {
        if (c(connectionResult, i)) {
            return;
        }
        och ochVar = this.c0;
        ochVar.sendMessage(ochVar.obtainMessage(5, i, 0, connectionResult));
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0340  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r23) {
        /*
            Method dump skipped, instruction units count: 1126
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qa6.handleMessage(android.os.Message):boolean");
    }
}
