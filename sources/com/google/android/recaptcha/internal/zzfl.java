package com.google.android.recaptcha.internal;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzfl implements Executor {
    public static final zzfl zza = new zzfl();

    private zzfl() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
