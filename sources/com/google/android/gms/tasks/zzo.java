package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzo implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzp zzb;

    public zzo(zzp zzpVar, Task task) {
        this.zzb = zzpVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task taskThen = this.zzb.zzb.then(this.zza.getResult());
            zzp zzpVar = this.zzb;
            if (taskThen == null) {
                zzpVar.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = TaskExecutors.zza;
            taskThen.addOnSuccessListener(executor, zzpVar);
            taskThen.addOnFailureListener(executor, this.zzb);
            taskThen.addOnCanceledListener(executor, this.zzb);
        } catch (RuntimeExecutionException e) {
            boolean z = e.getCause() instanceof Exception;
            zzp zzpVar2 = this.zzb;
            if (z) {
                zzpVar2.onFailure((Exception) e.getCause());
            } else {
                zzpVar2.onFailure(e);
            }
        } catch (CancellationException unused) {
            this.zzb.onCanceled();
        } catch (Exception e2) {
            this.zzb.onFailure(e2);
        }
    }
}
