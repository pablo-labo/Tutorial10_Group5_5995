package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.source.h;
import defpackage.bg;
import defpackage.ka2;
import defpackage.vjg;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {
    final boolean isRecoverable;
    public final h.b mediaPeriodId;
    public final androidx.media3.common.a rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final String rendererName;
    public final int type;

    /* JADX WARN: Illegal instructions before constructor call */
    public ExoPlaybackException(int i, Exception exc, int i2, String str, int i3, androidx.media3.common.a aVar, int i4, h.b bVar, boolean z) {
        String str2;
        int i5;
        androidx.media3.common.a aVar2;
        String string;
        String str3;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            aVar2 = aVar;
            string = "Source error";
        } else if (i != 1) {
            string = i != 3 ? "Unexpected runtime error" : "Remote error";
            str2 = str;
            i5 = i3;
            aVar2 = aVar;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            aVar2 = aVar;
            sb.append(aVar2);
            sb.append(", format_supported=");
            String str4 = vjg.a;
            if (i4 == 0) {
                str3 = "NO";
            } else if (i4 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    bg.h();
                    throw null;
                }
                str3 = "YES";
            }
            sb.append(str3);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : string.concat(": null"), exc, i2, i, str2, i5, aVar2, i4, bVar, SystemClock.elapsedRealtime(), z);
    }

    @Override // androidx.media3.common.PlaybackException
    public final boolean a(PlaybackException playbackException) {
        if (!super.a(playbackException)) {
            return false;
        }
        String str = vjg.a;
        ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
        return this.type == exoPlaybackException.type && Objects.equals(this.rendererName, exoPlaybackException.rendererName) && this.rendererIndex == exoPlaybackException.rendererIndex && Objects.equals(this.rendererFormat, exoPlaybackException.rendererFormat) && this.rendererFormatSupport == exoPlaybackException.rendererFormatSupport && Objects.equals(this.mediaPeriodId, exoPlaybackException.mediaPeriodId) && this.isRecoverable == exoPlaybackException.isRecoverable;
    }

    public final ExoPlaybackException b(h.b bVar) {
        String message = getMessage();
        String str = vjg.a;
        return new ExoPlaybackException(message, getCause(), this.errorCode, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, bVar, this.timestampMs, this.isRecoverable);
    }

    public ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, androidx.media3.common.a aVar, int i4, h.b bVar, long j, boolean z) {
        super(str, th, i, Bundle.EMPTY, j);
        ka2.l(!z || i2 == 1);
        ka2.l(th != null || i2 == 3);
        this.type = i2;
        this.rendererName = str2;
        this.rendererIndex = i3;
        this.rendererFormat = aVar;
        this.rendererFormatSupport = i4;
        this.mediaPeriodId = bVar;
        this.isRecoverable = z;
    }

    public ExoPlaybackException(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }
}
