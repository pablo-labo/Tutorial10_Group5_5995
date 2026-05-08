package expo.modules.speechrecognition;

import defpackage.ftc;
import defpackage.w85;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\f\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\u000eR\"\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\f\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\u000eR\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lexpo/modules/speechrecognition/AudioSourceOptions;", "Lftc;", "<init>", "()V", "", "uri", "Ljava/lang/String;", "getUri", "()Ljava/lang/String;", "getUri$annotations", "", "audioEncoding", "Ljava/lang/Integer;", "getAudioEncoding", "()Ljava/lang/Integer;", "getAudioEncoding$annotations", "sampleRate", "getSampleRate", "getSampleRate$annotations", "audioChannels", "getAudioChannels", "getAudioChannels$annotations", "", "chunkDelayMillis", "Ljava/lang/Long;", "getChunkDelayMillis", "()Ljava/lang/Long;", "getChunkDelayMillis$annotations", "expo-speech-recognition_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AudioSourceOptions implements ftc {
    private final Long chunkDelayMillis;
    private final String uri = "";
    private final Integer audioEncoding = 2;
    private final Integer sampleRate = 16000;
    private final Integer audioChannels = 1;

    @w85
    public static /* synthetic */ void getAudioChannels$annotations() {
    }

    @w85
    public static /* synthetic */ void getAudioEncoding$annotations() {
    }

    @w85
    public static /* synthetic */ void getChunkDelayMillis$annotations() {
    }

    @w85
    public static /* synthetic */ void getSampleRate$annotations() {
    }

    @w85
    public static /* synthetic */ void getUri$annotations() {
    }

    public final Integer getAudioChannels() {
        return this.audioChannels;
    }

    public final Integer getAudioEncoding() {
        return this.audioEncoding;
    }

    public final Long getChunkDelayMillis() {
        return this.chunkDelayMillis;
    }

    public final Integer getSampleRate() {
        return this.sampleRate;
    }

    public final String getUri() {
        return this.uri;
    }
}
