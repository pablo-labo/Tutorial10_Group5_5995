package androidx.media3.common;

import defpackage.emf;

/* JADX INFO: loaded from: classes.dex */
public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final emf timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(emf emfVar, int i, long j) {
        this.timeline = emfVar;
        this.windowIndex = i;
        this.positionMs = j;
    }
}
