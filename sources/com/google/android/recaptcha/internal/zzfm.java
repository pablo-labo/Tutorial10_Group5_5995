package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import defpackage.hh1;
import defpackage.xd2;
import defpackage.xr3;
import defpackage.yd2;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfm {
    public static final xr3 zza(Task task) {
        final yd2 yd2VarE = hh1.e();
        task.addOnCompleteListener(zzfl.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzfk
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                xd2 xd2Var = yd2VarE;
                Exception exception = task2.getException();
                if (exception != null) {
                    xd2Var.h0(exception);
                } else if (task2.isCanceled()) {
                    xd2Var.h(null);
                } else {
                    xd2Var.j0(task2.getResult());
                }
            }
        });
        return yd2VarE;
    }
}
