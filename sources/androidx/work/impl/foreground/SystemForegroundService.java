package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import defpackage.fw8;
import defpackage.iw1;
import defpackage.p2f;
import defpackage.q2f;
import defpackage.w2h;
import defpackage.z39;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends fw8 {
    public static final String f = z39.f("SystemFgService");
    public Handler b;
    public boolean c;
    public q2f d;
    public NotificationManager e;

    public static class a {
        public static void a(Service service, int i, Notification notification, int i2) {
            service.startForeground(i, notification, i2);
        }
    }

    public static class b {
        public static void a(Service service, int i, Notification notification, int i2) {
            try {
                service.startForeground(i, notification, i2);
            } catch (ForegroundServiceStartNotAllowedException e) {
                z39 z39VarD = z39.d();
                String str = SystemForegroundService.f;
                if (((z39.a) z39VarD).c <= 5) {
                    Log.w(str, "Unable to start foreground service", e);
                }
            }
        }
    }

    public final void a() {
        this.b = new Handler(Looper.getMainLooper());
        this.e = (NotificationManager) getApplicationContext().getSystemService("notification");
        q2f q2fVar = new q2f(getApplicationContext());
        this.d = q2fVar;
        if (q2fVar.X != null) {
            z39.d().b(q2f.Y, "A callback already exists.");
        } else {
            q2fVar.X = this;
        }
    }

    @Override // defpackage.fw8, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // defpackage.fw8, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.d.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.c;
        int i3 = 0;
        String str = f;
        if (z) {
            z39.d().e(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.d.g();
            a();
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        q2f q2fVar = this.d;
        q2fVar.getClass();
        String str2 = q2f.Y;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            z39.d().e(str2, "Started foreground service " + intent);
            q2fVar.b.a(new p2f(i3, q2fVar, intent.getStringExtra("KEY_WORKSPEC_ID")));
            q2fVar.e(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            q2fVar.e(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            z39.d().e(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = q2fVar.X;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.c = true;
            z39.d().a(str, "All commands completed.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf();
            return 3;
        }
        z39.d().e(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        w2h w2hVar = q2fVar.a;
        UUID uuidFromString = UUID.fromString(stringExtra);
        w2hVar.getClass();
        w2hVar.d.a(new iw1(w2hVar, uuidFromString));
        return 3;
    }
}
