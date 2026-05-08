package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.impl.foreground.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q2f implements y1h, l15 {
    public static final String Y = z39.f("SystemFgDispatcher");
    public final HashSet V;
    public final yd3 W;
    public SystemForegroundService X;
    public final w2h a;
    public final qaf b;
    public final Object c = new Object();
    public r2h d;
    public final LinkedHashMap e;
    public final HashMap f;

    public q2f(Context context) {
        w2h w2hVarA = w2h.a(context);
        this.a = w2hVarA;
        this.b = w2hVarA.d;
        this.d = null;
        this.e = new LinkedHashMap();
        this.V = new HashSet();
        this.f = new HashMap();
        this.W = new yd3(w2hVarA.j, this);
        w2hVarA.f.a(this);
    }

    public static Intent c(Context context, r2h r2hVar, hp5 hp5Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", hp5Var.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hp5Var.b);
        intent.putExtra("KEY_NOTIFICATION", hp5Var.c);
        intent.putExtra("KEY_WORKSPEC_ID", r2hVar.a);
        intent.putExtra("KEY_GENERATION", r2hVar.b);
        return intent;
    }

    public static Intent d(Context context, r2h r2hVar, hp5 hp5Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", r2hVar.a);
        intent.putExtra("KEY_GENERATION", r2hVar.b);
        intent.putExtra("KEY_NOTIFICATION_ID", hp5Var.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hp5Var.b);
        intent.putExtra("KEY_NOTIFICATION", hp5Var.c);
        return intent;
    }

    @Override // defpackage.y1h
    public final void a(List<r3h> list) {
        if (list.isEmpty()) {
            return;
        }
        for (r3h r3hVar : list) {
            String str = r3hVar.a;
            z39.d().a(Y, "Constraints unmet for WorkSpec " + str);
            r2h r2hVarD = yid.d(r3hVar);
            w2h w2hVar = this.a;
            w2hVar.d.a(new xte(w2hVar, new tre(r2hVarD), true));
        }
    }

    @Override // defpackage.l15
    public final void b(r2h r2hVar, boolean z) {
        Map.Entry entry;
        synchronized (this.c) {
            try {
                r3h r3hVar = (r3h) this.f.remove(r2hVar);
                if (r3hVar != null ? this.V.remove(r3hVar) : false) {
                    this.W.d(this.V);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        hp5 hp5Var = (hp5) this.e.remove(r2hVar);
        if (r2hVar.equals(this.d) && this.e.size() > 0) {
            Iterator it = this.e.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.d = (r2h) entry.getKey();
            if (this.X != null) {
                hp5 hp5Var2 = (hp5) entry.getValue();
                SystemForegroundService systemForegroundService = this.X;
                systemForegroundService.b.post(new a(systemForegroundService, hp5Var2.a, hp5Var2.c, hp5Var2.b));
                SystemForegroundService systemForegroundService2 = this.X;
                systemForegroundService2.b.post(new s2f(systemForegroundService2, hp5Var2.a));
            }
        }
        SystemForegroundService systemForegroundService3 = this.X;
        if (hp5Var == null || systemForegroundService3 == null) {
            return;
        }
        z39.d().a(Y, "Removing Notification (id: " + hp5Var.a + ", workSpecId: " + r2hVar + ", notificationType: " + hp5Var.b);
        systemForegroundService3.b.post(new s2f(systemForegroundService3, hp5Var.a));
    }

    public final void e(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        r2h r2hVar = new r2h(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        z39 z39VarD = z39.d();
        StringBuilder sbJ = m6.j(intExtra, "Notifying with (id:", ", workSpecId: ", stringExtra, ", notificationType :");
        sbJ.append(intExtra2);
        sbJ.append(")");
        z39VarD.a(Y, sbJ.toString());
        if (notification == null || this.X == null) {
            return;
        }
        hp5 hp5Var = new hp5(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.e;
        linkedHashMap.put(r2hVar, hp5Var);
        if (this.d == null) {
            this.d = r2hVar;
            SystemForegroundService systemForegroundService = this.X;
            systemForegroundService.b.post(new a(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.X;
        systemForegroundService2.b.post(new r2f(systemForegroundService2, intExtra, notification));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i |= ((hp5) ((Map.Entry) it.next()).getValue()).b;
        }
        hp5 hp5Var2 = (hp5) linkedHashMap.get(this.d);
        if (hp5Var2 != null) {
            SystemForegroundService systemForegroundService3 = this.X;
            systemForegroundService3.b.post(new a(systemForegroundService3, hp5Var2.a, hp5Var2.c, i));
        }
    }

    @Override // defpackage.y1h
    public final void f(List<r3h> list) {
    }

    public final void g() {
        this.X = null;
        synchronized (this.c) {
            this.W.e();
        }
        this.a.f.e(this);
    }
}
