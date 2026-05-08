package com.facebook.common.time;

import android.os.SystemClock;
import defpackage.h84;
import defpackage.jy9;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
@h84
public class RealtimeSinceBootClock implements jy9 {
    public static final RealtimeSinceBootClock a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @h84
    public static RealtimeSinceBootClock get() {
        return a;
    }

    @Override // defpackage.jy9
    public final long now() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.jy9
    public final long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
    }
}
