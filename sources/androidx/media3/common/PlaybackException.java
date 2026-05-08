package androidx.media3.common;

import android.os.Bundle;
import defpackage.vjg;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class PlaybackException extends Exception {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public final int errorCode;
    public final Bundle extras;
    public final long timestampMs;

    static {
        String str = vjg.a;
        a = Integer.toString(0, 36);
        b = Integer.toString(1, 36);
        c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        e = Integer.toString(4, 36);
        f = Integer.toString(5, 36);
    }

    public PlaybackException(String str, Throwable th, int i, Bundle bundle, long j) {
        super(str, th);
        this.errorCode = i;
        this.extras = bundle;
        this.timestampMs = j;
    }

    public boolean a(PlaybackException playbackException) {
        if (this == playbackException) {
            return true;
        }
        if (playbackException != null && getClass() == playbackException.getClass()) {
            Throwable cause = getCause();
            Throwable cause2 = playbackException.getCause();
            if (cause == null || cause2 == null) {
                if (cause == null && cause2 == null) {
                }
            } else if (!Objects.equals(cause.getMessage(), cause2.getMessage()) || !cause.getClass().equals(cause2.getClass())) {
                return false;
            }
            if (this.errorCode == playbackException.errorCode && Objects.equals(getMessage(), playbackException.getMessage()) && this.timestampMs == playbackException.timestampMs) {
                return true;
            }
        }
        return false;
    }
}
