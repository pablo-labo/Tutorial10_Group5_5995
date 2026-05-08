package com.facebook.common.time;

import defpackage.h84;
import defpackage.my9;

/* JADX INFO: loaded from: classes2.dex */
@h84
public class AwakeTimeSinceBootClock implements my9 {

    @h84
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @h84
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // defpackage.my9, defpackage.jy9
    @h84
    public /* bridge */ /* synthetic */ long now() {
        return super.now();
    }

    @Override // defpackage.my9, defpackage.jy9
    @h84
    public long nowNanos() {
        return System.nanoTime();
    }
}
