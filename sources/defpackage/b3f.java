package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class b3f implements god {
    public static final String e = z39.f("SystemJobScheduler");
    public final Context a;
    public final JobScheduler b;
    public final w2h c;
    public final a3f d;

    public b3f(Context context, w2h w2hVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a3f a3fVar = new a3f(context);
        this.a = context;
        this.c = w2hVar;
        this.b = jobScheduler;
        this.d = a3fVar;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            z39.d().c(e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList b(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            z39.d().c(e, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static r2h f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new r2h(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.god
    public final void c(String str) {
        ArrayList arrayList;
        Context context = this.a;
        JobScheduler jobScheduler = this.b;
        ArrayList<JobInfo> arrayListB = b(context, jobScheduler);
        if (arrayListB == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : arrayListB) {
                r2h r2hVarF = f(jobInfo);
                if (r2hVarF != null && str.equals(r2hVarF.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a(jobScheduler, ((Integer) it.next()).intValue());
        }
        this.c.c.A().e(str);
    }

    @Override // defpackage.god
    public final void d(r3h... r3hVarArr) throws Throwable {
        int iIntValue;
        w2h w2hVar = this.c;
        WorkDatabase workDatabase = w2hVar.c;
        final wy3 wy3Var = new wy3(workDatabase);
        for (r3h r3hVar : r3hVarArr) {
            workDatabase.c();
            try {
                s3h s3hVarD = workDatabase.D();
                String str = r3hVar.a;
                r3h r3hVarI = s3hVarD.i(str);
                String str2 = e;
                if (r3hVarI == null) {
                    z39.d().g(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.w();
                } else if (r3hVarI.b != s2h.a) {
                    z39.d().g(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.w();
                } else {
                    r2h r2hVarD = yid.d(r3hVar);
                    u2f u2fVarC = workDatabase.A().c(r2hVarD);
                    if (u2fVarC != null) {
                        iIntValue = u2fVarC.c;
                    } else {
                        w2hVar.b.getClass();
                        final int i = w2hVar.b.g;
                        Object objV = ((WorkDatabase) wy3Var.b).v(new Callable() { // from class: mr6
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                WorkDatabase workDatabase2 = (WorkDatabase) wy3Var.b;
                                Long lB = workDatabase2.z().b("next_job_scheduler_id");
                                int i2 = 0;
                                int iLongValue = lB != null ? (int) lB.longValue() : 0;
                                workDatabase2.z().c(new ijb("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                                if (iLongValue < 0 || iLongValue > i) {
                                    workDatabase2.z().c(new ijb("next_job_scheduler_id", 1L));
                                } else {
                                    i2 = iLongValue;
                                }
                                return Integer.valueOf(i2);
                            }
                        });
                        objV.getClass();
                        iIntValue = ((Number) objV).intValue();
                    }
                    if (u2fVarC == null) {
                        w2hVar.c.A().d(new u2f(r2hVarD.a, r2hVarD.b, iIntValue));
                    }
                    g(r3hVar, iIntValue);
                    workDatabase.w();
                }
            } finally {
                workDatabase.s();
            }
        }
    }

    @Override // defpackage.god
    public final boolean e() {
        return true;
    }

    public final void g(r3h r3hVar, int i) {
        JobScheduler jobScheduler = this.b;
        JobInfo jobInfoA = this.d.a(r3hVar, i);
        z39 z39VarD = z39.d();
        StringBuilder sb = new StringBuilder("Scheduling work ID ");
        String str = r3hVar.a;
        sb.append(str);
        sb.append("Job ID ");
        sb.append(i);
        String string = sb.toString();
        String str2 = e;
        z39VarD.a(str2, string);
        try {
            if (jobScheduler.schedule(jobInfoA) == 0) {
                z39.d().g(str2, "Unable to schedule work ID " + str);
                if (r3hVar.q && r3hVar.r == iwa.a) {
                    r3hVar.q = false;
                    z39.d().a(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                    g(r3hVar, i);
                }
            }
        } catch (IllegalStateException e2) {
            ArrayList arrayListB = b(this.a, jobScheduler);
            int size = arrayListB != null ? arrayListB.size() : 0;
            Locale locale = Locale.getDefault();
            Integer numValueOf = Integer.valueOf(size);
            w2h w2hVar = this.c;
            String str3 = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", numValueOf, Integer.valueOf(w2hVar.c.D().f().size()), Integer.valueOf(w2hVar.b.h));
            z39.d().b(str2, str3);
            IllegalStateException illegalStateException = new IllegalStateException(str3, e2);
            w2hVar.b.getClass();
            throw illegalStateException;
        } catch (Throwable th) {
            z39.d().c(str2, "Unable to schedule " + r3hVar, th);
        }
    }
}
