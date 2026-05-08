package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.a;
import defpackage.iob;
import defpackage.mef;
import defpackage.qjb;
import defpackage.w2h;
import defpackage.z39;

/* JADX INFO: loaded from: classes.dex */
public final class ForceStopRunnable implements Runnable {
    public static final String e = z39.f("ForceStopRunnable");
    public static final long f = 315360000000L;
    public final Context a;
    public final w2h b;
    public final qjb c;
    public int d = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        public static final String a = z39.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            if (((z39.a) z39.d()).c <= 2) {
                Log.v(a, "Rescheduling alarm that keeps track of force-stops.");
            }
            ForceStopRunnable.c(context);
        }
    }

    public ForceStopRunnable(Context context, w2h w2hVar) {
        this.a = context.getApplicationContext();
        this.b = w2hVar;
        this.c = w2hVar.g;
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.a():void");
    }

    public final boolean b() {
        a aVar = this.b.b;
        aVar.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = e;
        if (zIsEmpty) {
            z39.d().a(str, "The default process name was not specified.");
            return true;
        }
        boolean zA = iob.a(this.a, aVar);
        z39.d().a(str, "Is default app process = " + zA);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = e;
        w2h w2hVar = this.b;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    mef.b(this.a);
                    z39.d().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e2) {
                        int i = this.d + 1;
                        this.d = i;
                        if (i >= 3) {
                            z39.d().c(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                            w2hVar.b.getClass();
                            throw illegalStateException;
                        }
                        long j = ((long) i) * 300;
                        String str2 = "Retrying after " + j;
                        if (((z39.a) z39.d()).c <= 3) {
                            Log.d(str, str2, e2);
                        }
                        try {
                            Thread.sleep(((long) this.d) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e3) {
                    z39.d().b(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e3);
                    w2hVar.b.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            w2hVar.c();
        }
    }
}
