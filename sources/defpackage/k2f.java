package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import defpackage.x2h;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class k2f implements l15 {
    public static final String Y = z39.f("SystemAlarmDispatcher");
    public final ArrayList V;
    public Intent W;
    public SystemAlarmService X;
    public final Context a;
    public final qaf b;
    public final d4h c;
    public final kob d;
    public final w2h e;
    public final hc2 f;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            x2h.a aVar;
            c cVar;
            synchronized (k2f.this.V) {
                k2f k2fVar = k2f.this;
                k2fVar.W = (Intent) k2fVar.V.get(0);
            }
            Intent intent = k2f.this.W;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = k2f.this.W.getIntExtra("KEY_START_ID", 0);
                z39 z39VarD = z39.d();
                String str = k2f.Y;
                z39VarD.a(str, "Processing command " + k2f.this.W + ", " + intExtra);
                PowerManager.WakeLock wakeLockA = ytg.a(k2f.this.a, action + " (" + intExtra + ")");
                try {
                    z39.d().a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockA);
                    wakeLockA.acquire();
                    k2f k2fVar2 = k2f.this;
                    k2fVar2.f.a(intExtra, k2fVar2, k2fVar2.W);
                    z39.d().a(str, "Releasing operation wake lock (" + action + ") " + wakeLockA);
                    wakeLockA.release();
                    k2f k2fVar3 = k2f.this;
                    aVar = ((x2h) k2fVar3.b).c;
                    cVar = new c(k2fVar3);
                } catch (Throwable th) {
                    try {
                        z39 z39VarD2 = z39.d();
                        String str2 = k2f.Y;
                        z39VarD2.c(str2, "Unexpected error in onHandleIntent", th);
                        z39.d().a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockA);
                        wakeLockA.release();
                        k2f k2fVar4 = k2f.this;
                        aVar = ((x2h) k2fVar4.b).c;
                        cVar = new c(k2fVar4);
                    } catch (Throwable th2) {
                        z39.d().a(k2f.Y, "Releasing operation wake lock (" + action + ") " + wakeLockA);
                        wakeLockA.release();
                        k2f k2fVar5 = k2f.this;
                        ((x2h) k2fVar5.b).c.execute(new c(k2fVar5));
                        throw th2;
                    }
                }
                aVar.execute(cVar);
            }
        }
    }

    public static class b implements Runnable {
        public final k2f a;
        public final Intent b;
        public final int c;

        public b(int i, k2f k2fVar, Intent intent) {
            this.a = k2fVar;
            this.b = intent;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.a(this.b, this.c);
        }
    }

    public static class c implements Runnable {
        public final k2f a;

        public c(k2f k2fVar) {
            this.a = k2fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0089 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:4:0x0015, B:6:0x0019, B:8:0x003f, B:11:0x0045, B:12:0x004c, B:13:0x004d, B:14:0x0057, B:18:0x0061, B:20:0x0069, B:21:0x006b, B:25:0x0075, B:27:0x0082, B:35:0x0094, B:31:0x0088, B:32:0x0089, B:34:0x0091, B:39:0x0098, B:22:0x006c, B:23:0x0072, B:15:0x0058, B:16:0x005e), top: B:42:0x0015, inners: #1, #2 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r5 = this;
                k2f r5 = r5.a
                java.lang.String r0 = "Removing command "
                z39 r1 = defpackage.z39.d()
                java.lang.String r2 = defpackage.k2f.Y
                java.lang.String r3 = "Checking if commands are complete."
                r1.a(r2, r3)
                defpackage.k2f.c()
                java.util.ArrayList r1 = r5.V
                monitor-enter(r1)
                android.content.Intent r3 = r5.W     // Catch: java.lang.Throwable -> L43
                if (r3 == 0) goto L4d
                z39 r3 = defpackage.z39.d()     // Catch: java.lang.Throwable -> L43
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
                r4.<init>(r0)     // Catch: java.lang.Throwable -> L43
                android.content.Intent r0 = r5.W     // Catch: java.lang.Throwable -> L43
                r4.append(r0)     // Catch: java.lang.Throwable -> L43
                java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L43
                r3.a(r2, r0)     // Catch: java.lang.Throwable -> L43
                java.util.ArrayList r0 = r5.V     // Catch: java.lang.Throwable -> L43
                r3 = 0
                java.lang.Object r0 = r0.remove(r3)     // Catch: java.lang.Throwable -> L43
                android.content.Intent r0 = (android.content.Intent) r0     // Catch: java.lang.Throwable -> L43
                android.content.Intent r3 = r5.W     // Catch: java.lang.Throwable -> L43
                boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L43
                if (r0 == 0) goto L45
                r0 = 0
                r5.W = r0     // Catch: java.lang.Throwable -> L43
                goto L4d
            L43:
                r5 = move-exception
                goto L99
            L45:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L43
                java.lang.String r0 = "Dequeue-d command is not the first."
                r5.<init>(r0)     // Catch: java.lang.Throwable -> L43
                throw r5     // Catch: java.lang.Throwable -> L43
            L4d:
                qaf r0 = r5.b     // Catch: java.lang.Throwable -> L43
                x2h r0 = (defpackage.x2h) r0     // Catch: java.lang.Throwable -> L43
                k7e r0 = r0.a     // Catch: java.lang.Throwable -> L43
                hc2 r3 = r5.f     // Catch: java.lang.Throwable -> L43
                java.lang.Object r4 = r3.c     // Catch: java.lang.Throwable -> L43
                monitor-enter(r4)     // Catch: java.lang.Throwable -> L43
                java.util.HashMap r3 = r3.b     // Catch: java.lang.Throwable -> L96
                boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L96
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L96
                if (r3 == 0) goto L89
                java.util.ArrayList r3 = r5.V     // Catch: java.lang.Throwable -> L43
                boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L43
                if (r3 == 0) goto L89
                java.lang.Object r3 = r0.d     // Catch: java.lang.Throwable -> L43
                monitor-enter(r3)     // Catch: java.lang.Throwable -> L43
                java.util.ArrayDeque<k7e$a> r0 = r0.a     // Catch: java.lang.Throwable -> L86
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L86
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L86
                if (r0 == 0) goto L89
                z39 r0 = defpackage.z39.d()     // Catch: java.lang.Throwable -> L43
                java.lang.String r3 = "No more commands & intents."
                r0.a(r2, r3)     // Catch: java.lang.Throwable -> L43
                androidx.work.impl.background.systemalarm.SystemAlarmService r5 = r5.X     // Catch: java.lang.Throwable -> L43
                if (r5 == 0) goto L94
                r5.a()     // Catch: java.lang.Throwable -> L43
                goto L94
            L86:
                r5 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L86
                throw r5     // Catch: java.lang.Throwable -> L43
            L89:
                java.util.ArrayList r0 = r5.V     // Catch: java.lang.Throwable -> L43
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L43
                if (r0 != 0) goto L94
                r5.d()     // Catch: java.lang.Throwable -> L43
            L94:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L43
                return
            L96:
                r5 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L96
                throw r5     // Catch: java.lang.Throwable -> L43
            L99:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L43
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: k2f.c.run():void");
        }
    }

    public k2f(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.a = applicationContext;
        this.f = new hc2(applicationContext, new ure());
        w2h w2hVarA = w2h.a(systemAlarmService);
        this.e = w2hVarA;
        this.c = new d4h(w2hVarA.b.e);
        kob kobVar = w2hVarA.f;
        this.d = kobVar;
        this.b = w2hVarA.d;
        kobVar.a(this);
        this.V = new ArrayList();
        this.W = null;
    }

    public static void c() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        r6.g("Needs to be invoked on the main thread.");
    }

    public final void a(Intent intent, int i) {
        z39 z39VarD = z39.d();
        String str = Y;
        z39VarD.a(str, "Adding command " + intent + " (" + i + ")");
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            z39.d().g(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.V) {
                try {
                    Iterator it = this.V.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.V) {
            try {
                boolean zIsEmpty = this.V.isEmpty();
                this.V.add(intent);
                if (zIsEmpty) {
                    d();
                }
            } finally {
            }
        }
    }

    @Override // defpackage.l15
    public final void b(r2h r2hVar, boolean z) {
        x2h.a aVar = ((x2h) this.b).c;
        String str = hc2.e;
        Intent intent = new Intent(this.a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        hc2.d(intent, r2hVar);
        aVar.execute(new b(0, this, intent));
    }

    public final void d() {
        c();
        PowerManager.WakeLock wakeLockA = ytg.a(this.a, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.e.d.a(new a());
        } finally {
            wakeLockA.release();
        }
    }
}
