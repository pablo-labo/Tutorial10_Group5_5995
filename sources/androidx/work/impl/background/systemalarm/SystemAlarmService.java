package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import defpackage.fw8;
import defpackage.j6g;
import defpackage.k2f;
import defpackage.ytg;
import defpackage.z39;
import defpackage.ztg;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends fw8 {
    public static final String d = z39.f("SystemAlarmService");
    public k2f b;
    public boolean c;

    public final void a() {
        this.c = true;
        z39.d().a(d, "All commands completed in dispatcher");
        String str = ytg.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (ztg.a) {
            linkedHashMap.putAll(ztg.b);
            j6g j6gVar = j6g.a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                z39.d().g(ytg.a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // defpackage.fw8, android.app.Service
    public final void onCreate() {
        super.onCreate();
        k2f k2fVar = new k2f(this);
        this.b = k2fVar;
        if (k2fVar.X != null) {
            z39.d().b(k2f.Y, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            k2fVar.X = this;
        }
        this.c = false;
    }

    @Override // defpackage.fw8, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.c = true;
        k2f k2fVar = this.b;
        k2fVar.getClass();
        z39.d().a(k2f.Y, "Destroying SystemAlarmDispatcher");
        k2fVar.d.e(k2fVar);
        k2fVar.X = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            z39.d().e(d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            k2f k2fVar = this.b;
            k2fVar.getClass();
            z39 z39VarD = z39.d();
            String str = k2f.Y;
            z39VarD.a(str, "Destroying SystemAlarmDispatcher");
            k2fVar.d.e(k2fVar);
            k2fVar.X = null;
            k2f k2fVar2 = new k2f(this);
            this.b = k2fVar2;
            if (k2fVar2.X != null) {
                z39.d().b(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                k2fVar2.X = this;
            }
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.b.a(intent, i2);
        return 3;
    }
}
