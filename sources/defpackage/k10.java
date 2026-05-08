package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* JADX INFO: loaded from: classes.dex */
public final class k10 {
    public static final String a = z39.f("Alarms");

    public static class a {
        public static void a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setExact(i, j, pendingIntent);
        }
    }

    public static void a(Context context, r2h r2hVar, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = hc2.e;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        hc2.d(intent, r2hVar);
        PendingIntent service = PendingIntent.getService(context, i, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        z39.d().a(a, "Cancelling existing alarm with (workSpecId, systemId) (" + r2hVar + ", " + i + ")");
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, r2h r2hVar, long j) throws Throwable {
        v2f v2fVarA = workDatabase.A();
        u2f u2fVarC = v2fVarA.c(r2hVar);
        int i = 0;
        if (u2fVarC != null) {
            int i2 = u2fVarC.c;
            a(context, r2hVar, i2);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = hc2.e;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            hc2.d(intent, r2hVar);
            PendingIntent service = PendingIntent.getService(context, i2, intent, 201326592);
            if (alarmManager != null) {
                a.a(alarmManager, 0, j, service);
                return;
            }
            return;
        }
        Object objV = workDatabase.v(new lr6(new wy3(workDatabase), i));
        objV.getClass();
        int iIntValue = ((Number) objV).intValue();
        v2fVarA.d(new u2f(r2hVar.a, r2hVar.b, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = hc2.e;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        hc2.d(intent2, r2hVar);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            a.a(alarmManager2, 0, j, service2);
        }
    }
}
