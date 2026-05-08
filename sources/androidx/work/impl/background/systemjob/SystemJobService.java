package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import defpackage.kob;
import defpackage.l15;
import defpackage.r2h;
import defpackage.r6;
import defpackage.tre;
import defpackage.ure;
import defpackage.w2h;
import defpackage.xte;
import defpackage.z39;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements l15 {
    public static final String d = z39.f("SystemJobService");
    public w2h a;
    public final HashMap b = new HashMap();
    public final ure c = new ure();

    public static class a {
        public static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        public static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    public static class b {
        public static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    public static r2h a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new r2h(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.l15
    public final void b(r2h r2hVar, boolean z) {
        JobParameters jobParameters;
        z39.d().a(d, r2hVar.a + " executed on JobScheduler");
        synchronized (this.b) {
            jobParameters = (JobParameters) this.b.remove(r2hVar);
        }
        this.c.b(r2hVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            w2h w2hVarA = w2h.a(getApplicationContext());
            this.a = w2hVarA;
            w2hVarA.f.a(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                z39.d().g(d, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
            } else {
                r6.g("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        w2h w2hVar = this.a;
        if (w2hVar != null) {
            w2hVar.f.e(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.a == null) {
            z39.d().a(d, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        r2h r2hVarA = a(jobParameters);
        if (r2hVarA == null) {
            z39.d().b(d, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.b) {
            try {
                if (this.b.containsKey(r2hVarA)) {
                    z39.d().a(d, "Job is already being executed by SystemJobService: " + r2hVarA);
                    return false;
                }
                z39.d().a(d, "onStartJob for " + r2hVarA);
                this.b.put(r2hVarA, jobParameters);
                WorkerParameters.a aVar = new WorkerParameters.a();
                if (a.b(jobParameters) != null) {
                    aVar.b = Arrays.asList(a.b(jobParameters));
                }
                if (a.a(jobParameters) != null) {
                    aVar.a = Arrays.asList(a.a(jobParameters));
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    aVar.c = b.a(jobParameters);
                }
                this.a.e(this.c.d(r2hVarA), aVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        if (this.a == null) {
            z39.d().a(d, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        r2h r2hVarA = a(jobParameters);
        if (r2hVarA == null) {
            z39.d().b(d, "WorkSpec id not found!");
            return false;
        }
        z39.d().a(d, "onStopJob for " + r2hVarA);
        synchronized (this.b) {
            this.b.remove(r2hVarA);
        }
        tre treVarB = this.c.b(r2hVarA);
        if (treVarB != null) {
            w2h w2hVar = this.a;
            w2hVar.d.a(new xte(w2hVar, treVarB, false));
        }
        kob kobVar = this.a.f;
        String str = r2hVarA.a;
        synchronized (kobVar.a0) {
            zContains = kobVar.Y.contains(str);
        }
        return !zContains;
    }
}
