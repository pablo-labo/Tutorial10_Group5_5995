package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import defpackage.hod;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes2.dex */
public final class uy7 implements p3h {
    public final Context a;
    public final q05 b;
    public final hod c;

    public uy7(Context context, q05 q05Var, hod hodVar) {
        this.a = context;
        this.b = q05Var;
        this.c = hodVar;
    }

    @Override // defpackage.p3h
    public final void a(atf atfVar, int i) {
        b(atfVar, i, false);
    }

    @Override // defpackage.p3h
    public final void b(atf atfVar, int i, boolean z) {
        Context context = this.a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(atfVar.a().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(mnb.a(atfVar.c())).array());
        if (atfVar.b() != null) {
            adler32.update(atfVar.b());
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        i49.a(atfVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        long jY0 = this.b.Y0(atfVar);
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        jnb jnbVarC = atfVar.c();
        hod hodVar = this.c;
        builder.setMinimumLatency(hodVar.b(jnbVarC, jY0, i));
        Set<hod.b> setB = hodVar.c().get(jnbVarC).b();
        if (setB.contains(hod.b.a)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (setB.contains(hod.b.c)) {
            builder.setRequiresCharging(true);
        }
        if (setB.contains(hod.b.b)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", atfVar.a());
        persistableBundle.putInt("priority", mnb.a(atfVar.c()));
        if (atfVar.b() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(atfVar.b(), 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {atfVar, Integer.valueOf(value), Long.valueOf(hodVar.b(atfVar.c(), jY0, i)), Long.valueOf(jY0), Integer.valueOf(i)};
        String strConcat = "TRuntime.".concat("JobInfoScheduler");
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
        }
        jobScheduler.schedule(builder.build());
    }
}
