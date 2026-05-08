package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import defpackage.k2f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hc2 implements l15 {
    public static final String e = z39.f("CommandHandler");
    public final Context a;
    public final HashMap b = new HashMap();
    public final Object c = new Object();
    public final ure d;

    public hc2(Context context, ure ureVar) {
        this.a = context;
        this.d = ureVar;
    }

    public static r2h c(Intent intent) {
        return new r2h(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void d(Intent intent, r2h r2hVar) {
        intent.putExtra("KEY_WORKSPEC_ID", r2hVar.a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", r2hVar.b);
    }

    public final void a(int i, k2f k2fVar, Intent intent) throws Throwable {
        List<tre> listC;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            z39.d().a(e, "Handling constraints changed " + intent);
            Context context = this.a;
            lq2 lq2Var = new lq2(context, i, k2fVar);
            yd3 yd3Var = lq2Var.b;
            ArrayList<r3h> arrayListF = k2fVar.e.c.D().f();
            String str = ConstraintProxy.a;
            Iterator it = arrayListF.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            while (it.hasNext()) {
                jq2 jq2Var = ((r3h) it.next()).j;
                z |= jq2Var.d;
                z2 |= jq2Var.b;
                z3 |= jq2Var.e;
                z4 |= jq2Var.a != dha.a;
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            yd3Var.d(arrayListF);
            ArrayList<r3h> arrayList = new ArrayList(arrayListF.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (r3h r3hVar : arrayListF) {
                String str3 = r3hVar.a;
                if (jCurrentTimeMillis >= r3hVar.a() && (!r3hVar.b() || yd3Var.c(str3))) {
                    arrayList.add(r3hVar);
                }
            }
            for (r3h r3hVar2 : arrayList) {
                String str4 = r3hVar2.a;
                r2h r2hVarD = yid.d(r3hVar2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                d(intent3, r2hVarD);
                z39.d().a(lq2.c, "Creating a delay_met command for workSpec with id (" + str4 + ")");
                ((x2h) k2fVar.b).c.execute(new k2f.b(lq2Var.a, k2fVar, intent3));
            }
            yd3Var.e();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            z39.d().a(e, "Handling reschedule " + intent + ", " + i);
            k2fVar.e.d();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            z39.d().b(e, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            Context context2 = this.a;
            r2h r2hVarC = c(intent);
            z39 z39VarD = z39.d();
            String str5 = e;
            z39VarD.a(str5, "Handling schedule work for " + r2hVarC);
            WorkDatabase workDatabase = k2fVar.e.c;
            workDatabase.c();
            try {
                r3h r3hVarI = workDatabase.D().i(r2hVarC.a);
                if (r3hVarI == null) {
                    z39.d().g(str5, "Skipping scheduling " + r2hVarC + " because it's no longer in the DB");
                    return;
                }
                if (r3hVarI.b.a()) {
                    z39.d().g(str5, "Skipping scheduling " + r2hVarC + "because it is finished.");
                    return;
                }
                long jA = r3hVarI.a();
                if (r3hVarI.b()) {
                    z39.d().a(str5, "Opportunistically setting an alarm for " + r2hVarC + "at " + jA);
                    k10.b(context2, workDatabase, r2hVarC, jA);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    ((x2h) k2fVar.b).c.execute(new k2f.b(i, k2fVar, intent4));
                } else {
                    z39.d().a(str5, "Setting up Alarms for " + r2hVarC + "at " + jA);
                    k10.b(context2, workDatabase, r2hVarC, jA);
                }
                workDatabase.w();
                return;
            } finally {
                workDatabase.s();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.c) {
                try {
                    r2h r2hVarC2 = c(intent);
                    z39 z39VarD2 = z39.d();
                    String str6 = e;
                    z39VarD2.a(str6, "Handing delay met for " + r2hVarC2);
                    if (this.b.containsKey(r2hVarC2)) {
                        z39.d().a(str6, "WorkSpec " + r2hVarC2 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        ms3 ms3Var = new ms3(this.a, i, k2fVar, this.d.d(r2hVarC2));
                        this.b.put(r2hVarC2, ms3Var);
                        ms3Var.e();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                z39.d().g(e, "Ignoring intent " + intent);
                return;
            }
            r2h r2hVarC3 = c(intent);
            boolean z5 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            z39.d().a(e, "Handling onExecutionCompleted " + intent + ", " + i);
            b(r2hVarC3, z5);
            return;
        }
        ure ureVar = this.d;
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i2 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            tre treVarB = ureVar.b(new r2h(string, i2));
            listC = arrayList2;
            if (treVarB != null) {
                arrayList2.add(treVarB);
                listC = arrayList2;
            }
        } else {
            listC = ureVar.c(string);
        }
        for (tre treVar : listC) {
            z39.d().a(e, "Handing stopWork work for " + string);
            w2h w2hVar = k2fVar.e;
            w2hVar.d.a(new xte(w2hVar, treVar, false));
            Context context3 = this.a;
            WorkDatabase workDatabase2 = k2fVar.e.c;
            r2h r2hVar = treVar.a;
            String str7 = k10.a;
            v2f v2fVarA = workDatabase2.A();
            u2f u2fVarC = v2fVarA.c(r2hVar);
            if (u2fVarC != null) {
                k10.a(context3, r2hVar, u2fVarC.c);
                z39.d().a(k10.a, "Removing SystemIdInfo for workSpecId (" + r2hVar + ")");
                v2fVarA.a(r2hVar);
            }
            k2fVar.b(treVar.a, false);
        }
    }

    @Override // defpackage.l15
    public final void b(r2h r2hVar, boolean z) {
        synchronized (this.c) {
            try {
                ms3 ms3Var = (ms3) this.b.remove(r2hVar);
                this.d.b(r2hVar);
                if (ms3Var != null) {
                    ms3Var.g(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
