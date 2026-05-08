package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import defpackage.d4h;
import defpackage.k2f;
import defpackage.x2h;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ms3 implements y1h, d4h.a {
    public static final String b0 = z39.f("DelayMetCommandHandler");
    public int V;
    public final k7e W;
    public final x2h.a X;
    public PowerManager.WakeLock Y;
    public boolean Z;
    public final Context a;
    public final tre a0;
    public final int b;
    public final r2h c;
    public final k2f d;
    public final yd3 e;
    public final Object f;

    public ms3(Context context, int i, k2f k2fVar, tre treVar) {
        this.a = context;
        this.b = i;
        this.d = k2fVar;
        this.c = treVar.a;
        this.a0 = treVar;
        uqf uqfVar = k2fVar.e.j;
        x2h x2hVar = (x2h) k2fVar.b;
        this.W = x2hVar.a;
        this.X = x2hVar.c;
        this.e = new yd3(uqfVar, this);
        this.Z = false;
        this.V = 0;
        this.f = new Object();
    }

    public static void c(ms3 ms3Var) {
        int i = ms3Var.b;
        x2h.a aVar = ms3Var.X;
        Context context = ms3Var.a;
        k2f k2fVar = ms3Var.d;
        r2h r2hVar = ms3Var.c;
        String str = r2hVar.a;
        int i2 = ms3Var.V;
        String str2 = b0;
        if (i2 >= 2) {
            z39.d().a(str2, "Already stopped work for " + str);
            return;
        }
        ms3Var.V = 2;
        z39.d().a(str2, "Stopping work for WorkSpec " + str);
        String str3 = hc2.e;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        hc2.d(intent, r2hVar);
        aVar.execute(new k2f.b(i, k2fVar, intent));
        if (!k2fVar.d.d(str)) {
            z39.d().a(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        z39.d().a(str2, "WorkSpec " + str + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        hc2.d(intent2, r2hVar);
        aVar.execute(new k2f.b(i, k2fVar, intent2));
    }

    @Override // defpackage.y1h
    public final void a(List<r3h> list) {
        this.W.execute(new qx0(this, 3));
    }

    @Override // d4h.a
    public final void b(r2h r2hVar) {
        z39.d().a(b0, "Exceeded time limits on execution for " + r2hVar);
        this.W.execute(new qx0(this, 3));
    }

    public final void d() {
        synchronized (this.f) {
            try {
                this.e.e();
                this.d.c.a(this.c);
                PowerManager.WakeLock wakeLock = this.Y;
                if (wakeLock != null && wakeLock.isHeld()) {
                    z39.d().a(b0, "Releasing wakelock " + this.Y + "for WorkSpec " + this.c);
                    this.Y.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        String str = this.c.a;
        StringBuilder sbG = h5.g(str, " (");
        sbG.append(this.b);
        sbG.append(")");
        this.Y = ytg.a(this.a, sbG.toString());
        z39 z39VarD = z39.d();
        String str2 = "Acquiring wakelock " + this.Y + "for WorkSpec " + str;
        String str3 = b0;
        z39VarD.a(str3, str2);
        this.Y.acquire();
        r3h r3hVarI = this.d.e.c.D().i(str);
        if (r3hVarI == null) {
            this.W.execute(new qx0(this, 3));
            return;
        }
        boolean zB = r3hVarI.b();
        this.Z = zB;
        if (zB) {
            this.e.d(Collections.singletonList(r3hVarI));
            return;
        }
        z39.d().a(str3, "No constraints for " + str);
        f(Collections.singletonList(r3hVarI));
    }

    @Override // defpackage.y1h
    public final void f(List<r3h> list) {
        Iterator<r3h> it = list.iterator();
        while (it.hasNext()) {
            if (yid.d(it.next()).equals(this.c)) {
                this.W.execute(new rx0(this, 3));
                return;
            }
        }
    }

    public final void g(boolean z) {
        z39 z39VarD = z39.d();
        StringBuilder sb = new StringBuilder("onExecuted ");
        r2h r2hVar = this.c;
        sb.append(r2hVar);
        sb.append(", ");
        sb.append(z);
        z39VarD.a(b0, sb.toString());
        d();
        int i = this.b;
        k2f k2fVar = this.d;
        x2h.a aVar = this.X;
        Context context = this.a;
        if (z) {
            String str = hc2.e;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            hc2.d(intent, r2hVar);
            aVar.execute(new k2f.b(i, k2fVar, intent));
        }
        if (this.Z) {
            String str2 = hc2.e;
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            aVar.execute(new k2f.b(i, k2fVar, intent2));
        }
    }
}
