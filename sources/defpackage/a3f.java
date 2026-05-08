package defpackage;

import android.annotation.SuppressLint;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import defpackage.jq2;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ClassVerificationFailure"})
public final class a3f {
    public static final String b = z39.f("SystemJobInfoConverter");
    public final ComponentName a;

    public a3f(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JobInfo a(r3h r3hVar, int i) {
        int i2;
        jq2 jq2Var = r3hVar.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", r3hVar.a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", r3hVar.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", r3hVar.c());
        JobInfo.Builder builder = new JobInfo.Builder(i, this.a);
        boolean z = jq2Var.b;
        Set<jq2.a> set = jq2Var.h;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z);
        boolean z2 = jq2Var.c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z2).setExtras(persistableBundle);
        dha dhaVar = jq2Var.a;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30 || dhaVar != dha.f) {
            int iOrdinal = dhaVar.ordinal();
            if (iOrdinal == 0) {
                i2 = 0;
            } else if (iOrdinal != 1) {
                i2 = 2;
                if (iOrdinal != 2) {
                    i2 = 3;
                    if (iOrdinal != 3) {
                        i2 = 4;
                        if (iOrdinal != 4) {
                            z39.d().a(b, "API version too low. Cannot convert network type value " + dhaVar);
                            i2 = 1;
                        }
                    }
                }
            } else {
                i2 = 1;
            }
            extras.setRequiredNetworkType(i2);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!z2) {
            extras.setBackoffCriteria(r3hVar.m, r3hVar.l == b81.b ? 0 : 1);
        }
        long jMax = Math.max(r3hVar.a() - System.currentTimeMillis(), 0L);
        if (i3 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!r3hVar.q) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (jq2.a aVar : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(aVar.a, aVar.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(jq2Var.f);
            extras.setTriggerContentMaxDelay(jq2Var.g);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(jq2Var.d);
        extras.setRequiresStorageNotLow(jq2Var.e);
        byte b2 = r3hVar.k > 0;
        boolean z3 = jMax > 0;
        if (Build.VERSION.SDK_INT >= 31 && r3hVar.q && b2 == false && !z3) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
