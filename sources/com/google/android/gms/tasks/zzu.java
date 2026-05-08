package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import defpackage.kfh;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzu implements Executor {
    private final Handler zza = new kfh(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}
