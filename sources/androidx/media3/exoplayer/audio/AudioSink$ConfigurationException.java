package androidx.media3.exoplayer.audio;

import androidx.media3.common.a;
import androidx.media3.common.audio.AudioProcessor;

/* JADX INFO: loaded from: classes.dex */
public final class AudioSink$ConfigurationException extends Exception {
    public final a format;

    public AudioSink$ConfigurationException(AudioProcessor.UnhandledAudioFormatException unhandledAudioFormatException, a aVar) {
        super(unhandledAudioFormatException);
        this.format = aVar;
    }

    public AudioSink$ConfigurationException(String str, a aVar) {
        super(str);
        this.format = aVar;
    }
}
