package androidx.media3.exoplayer.audio;

import androidx.media3.common.a;
import defpackage.uz;

/* JADX INFO: loaded from: classes.dex */
public final class AudioSink$InitializationException extends Exception {
    public final int audioTrackState;
    public final a format;
    public final boolean isRecoverable;

    /* JADX WARN: Illegal instructions before constructor call */
    public AudioSink$InitializationException(int i, int i2, int i3, int i4, int i5, a aVar, boolean z, RuntimeException runtimeException) {
        StringBuilder sbF = uz.f("AudioTrack init failed ", i, " Config(", i2, ", ");
        uz.i(sbF, i3, ", ", i4, ", ");
        sbF.append(i5);
        sbF.append(") ");
        sbF.append(aVar);
        sbF.append(z ? " (recoverable)" : "");
        super(sbF.toString(), runtimeException);
        this.audioTrackState = i;
        this.isRecoverable = z;
        this.format = aVar;
    }
}
