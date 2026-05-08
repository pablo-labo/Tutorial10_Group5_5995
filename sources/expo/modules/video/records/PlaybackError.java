package expo.modules.video.records;

import androidx.media3.common.PlaybackException;
import defpackage.ftc;
import defpackage.w85;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0011B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tR*\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\n\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0006¨\u0006\u0012"}, d2 = {"Lexpo/modules/video/records/PlaybackError;", "Lftc;", "Ljava/io/Serializable;", "", "message", "<init>", "(Ljava/lang/String;)V", "Landroidx/media3/common/PlaybackException;", "exception", "(Landroidx/media3/common/PlaybackException;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "setMessage", "getMessage$annotations", "()V", "Companion", "a", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlaybackError implements ftc, Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private String message;

    /* JADX INFO: renamed from: expo.modules.video.records.PlaybackError$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PlaybackError(PlaybackException playbackException) {
        String localizedMessage;
        playbackException.getClass();
        INSTANCE.getClass();
        String localizedMessage2 = playbackException.getLocalizedMessage();
        Throwable cause = playbackException.getCause();
        this("A playback exception has occurred: ".concat(localizedMessage2 + " " + ((cause == null || (localizedMessage = cause.getLocalizedMessage()) == null) ? "" : localizedMessage)));
    }

    @w85
    public static /* synthetic */ void getMessage$annotations() {
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public PlaybackError(String str) {
        this.message = str;
    }

    public /* synthetic */ PlaybackError(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public PlaybackError() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
