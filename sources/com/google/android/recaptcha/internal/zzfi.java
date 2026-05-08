package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.j6g;
import defpackage.xr3;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfi {
    public static final Task zza(final xr3 xr3Var) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        xr3Var.d0(new Function1() { // from class: com.google.android.recaptcha.internal.zzfh
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Throwable th = (Throwable) obj;
                boolean z = th instanceof CancellationException;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (z) {
                    taskCompletionSource2.setException((Exception) th);
                } else {
                    xr3 xr3Var2 = xr3Var;
                    Throwable thS = xr3Var2.s();
                    if (thS == null) {
                        taskCompletionSource2.setResult(xr3Var2.p());
                    } else {
                        Exception runtimeExecutionException = thS instanceof Exception ? (Exception) thS : null;
                        if (runtimeExecutionException == null) {
                            runtimeExecutionException = new RuntimeExecutionException(thS);
                        }
                        taskCompletionSource2.setException(runtimeExecutionException);
                    }
                }
                return j6g.a;
            }
        });
        return taskCompletionSource.getTask();
    }
}
