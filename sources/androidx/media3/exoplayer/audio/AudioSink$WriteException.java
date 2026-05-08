package androidx.media3.exoplayer.audio;

import androidx.media3.common.a;
import defpackage.p6;

/* JADX INFO: loaded from: classes.dex */
public final class AudioSink$WriteException extends Exception {
    public final int errorCode;
    public final a format;
    public final boolean isRecoverable;

    public AudioSink$WriteException(int i, a aVar, boolean z) {
        super(p6.c(i, "AudioTrack write failed: "));
        this.isRecoverable = z;
        this.errorCode = i;
        this.format = aVar;
    }
}
