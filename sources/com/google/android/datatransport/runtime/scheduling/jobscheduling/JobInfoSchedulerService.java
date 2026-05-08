package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import defpackage.ed3;
import defpackage.etf;
import defpackage.fhg;
import defpackage.ihg;
import defpackage.ja;
import defpackage.jnb;
import defpackage.mnb;
import defpackage.v31;

/* JADX INFO: loaded from: classes2.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        etf.b(getApplicationContext());
        if (string == null) {
            ja.k("Null backendName");
            return false;
        }
        jnb jnbVarB = mnb.b(i);
        byte[] bArrDecode = string2 != null ? Base64.decode(string2, 0) : null;
        ihg ihgVar = etf.a().d;
        ihgVar.e.execute(new fhg(ihgVar, new v31(string, bArrDecode, jnbVarB), i2, new ed3(1, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
