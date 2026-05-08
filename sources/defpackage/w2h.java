package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.ForceStopRunnable;
import com.indeed.android.jobsearch.R;
import defpackage.xed;
import defpackage.z39;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w2h extends v2h {
    public static w2h k;
    public static w2h l;
    public static final Object m;
    public final Context a;
    public final androidx.work.a b;
    public final WorkDatabase c;
    public final x2h d;
    public final List<god> e;
    public final kob f;
    public final qjb g;
    public boolean h;
    public BroadcastReceiver.PendingResult i;
    public final uqf j;

    public static class a {
        public static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    static {
        z39.f("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    public w2h(Context context, androidx.work.a aVar, x2h x2hVar) {
        xed.a aVarA;
        boolean z = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        k7e k7eVar = x2hVar.a;
        applicationContext.getClass();
        k7eVar.getClass();
        if (z) {
            aVarA = new xed.a(applicationContext, WorkDatabase.class, null);
            aVarA.i = true;
        } else {
            aVarA = ued.a(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            aVarA.h = new q20(applicationContext, 12);
        }
        aVarA.f = k7eVar;
        y62 y62Var = y62.a;
        y62Var.getClass();
        aVarA.d.add(y62Var);
        aVarA.a(ct9.c);
        aVarA.a(new t4d(applicationContext, 2, 3));
        aVarA.a(dt9.c);
        aVarA.a(et9.c);
        aVarA.a(new t4d(applicationContext, 5, 6));
        aVarA.a(ft9.c);
        aVarA.a(gt9.c);
        aVarA.a(ht9.c);
        aVarA.a(new y2h(applicationContext));
        aVarA.a(new t4d(applicationContext, 10, 11));
        aVarA.a(zs9.c);
        aVarA.a(at9.c);
        aVarA.a(bt9.c);
        aVarA.p = false;
        aVarA.q = true;
        WorkDatabase workDatabase = (WorkDatabase) aVarA.b();
        Context applicationContext2 = context.getApplicationContext();
        z39.a aVar2 = new z39.a(aVar.f);
        synchronized (z39.a) {
            z39.b = aVar2;
        }
        uqf uqfVar = new uqf(applicationContext2, x2hVar);
        this.j = uqfVar;
        String str = iod.a;
        b3f b3fVar = new b3f(applicationContext2, this);
        rya.a(applicationContext2, SystemJobService.class, true);
        z39.d().a(iod.a, "Created SystemJobScheduler and enabled SystemJobService");
        List<god> listAsList = Arrays.asList(b3fVar, new id6(applicationContext2, aVar, uqfVar, this));
        kob kobVar = new kob(context, aVar, x2hVar, workDatabase, listAsList);
        Context applicationContext3 = context.getApplicationContext();
        this.a = applicationContext3;
        this.b = aVar;
        this.d = x2hVar;
        this.c = workDatabase;
        this.e = listAsList;
        this.f = kobVar;
        this.g = new qjb(workDatabase);
        this.h = false;
        if (a.a(applicationContext3)) {
            r6.g("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        this.d.a(new ForceStopRunnable(applicationContext3, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static w2h a(Context context) {
        w2h w2hVarA;
        Object obj = m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    w2hVarA = k;
                    if (w2hVarA == null) {
                        w2hVarA = l;
                    }
                }
                return w2hVarA;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (w2hVarA == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof a.b)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            b(applicationContext, ((a.b) applicationContext).a());
            w2hVarA = a(applicationContext);
        }
        return w2hVarA;
    }

    public static void b(Context context, androidx.work.a aVar) {
        synchronized (m) {
            try {
                w2h w2hVar = k;
                if (w2hVar != null && l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (w2hVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (l == null) {
                        l = new w2h(applicationContext, aVar, new x2h(aVar.b));
                    }
                    k = l;
                }
            } finally {
            }
        }
    }

    public final void c() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        ArrayList arrayListB;
        String str = b3f.e;
        Context context = this.a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListB = b3f.b(context, jobScheduler)) != null && !arrayListB.isEmpty()) {
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                b3f.a(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        WorkDatabase workDatabase = this.c;
        workDatabase.D().m();
        iod.a(this.b, workDatabase, this.e);
    }

    public final void e(tre treVar, WorkerParameters.a aVar) {
        vre vreVar = new vre();
        vreVar.a = this;
        vreVar.b = treVar;
        vreVar.c = aVar;
        this.d.a(vreVar);
    }
}
