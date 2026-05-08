package app.rive.runtime.kotlin.core;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import kotlin.Metadata;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lapp/rive/runtime/kotlin/core/AudioAsset;", "Lapp/rive/runtime/kotlin/core/FileAsset;", "", "address", "", "rendererTypeIdx", "<init>", "(JI)V", "cppAsset", "cppAudio", "Lj6g;", "cppSetAudio", "(JJ)V", "cppGetAudio", "(J)J", "Lapp/rive/runtime/kotlin/core/RiveAudio;", "value", "getAudio", "()Lapp/rive/runtime/kotlin/core/RiveAudio;", "setAudio", "(Lapp/rive/runtime/kotlin/core/RiveAudio;)V", MediaStreamTrack.AUDIO_TRACK_KIND, "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class AudioAsset extends FileAsset {
    public static final int $stable = 0;

    public AudioAsset(long j, int i) {
        super(j, i, null);
    }

    private final native long cppGetAudio(long cppAsset);

    private final native void cppSetAudio(long cppAsset, long cppAudio);

    public final RiveAudio getAudio() {
        return new RiveAudio(cppGetAudio(getCppPointer()));
    }

    public final void setAudio(RiveAudio riveAudio) {
        riveAudio.getClass();
        cppSetAudio(getCppPointer(), riveAudio.getCppPointer());
    }
}
