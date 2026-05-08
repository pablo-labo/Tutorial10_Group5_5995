package expo.modules.speechrecognition;

import defpackage.ftc;
import defpackage.w85;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\f\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\u000eR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\f\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\u000e¨\u0006\u001c"}, d2 = {"Lexpo/modules/speechrecognition/RecordingOptions;", "Lftc;", "<init>", "()V", "", "persist", "Z", "getPersist", "()Z", "getPersist$annotations", "", "outputDirectory", "Ljava/lang/String;", "getOutputDirectory", "()Ljava/lang/String;", "getOutputDirectory$annotations", "outputFileName", "getOutputFileName", "getOutputFileName$annotations", "", "outputSampleRate", "Ljava/lang/Integer;", "getOutputSampleRate", "()Ljava/lang/Integer;", "getOutputSampleRate$annotations", "outputEncoding", "getOutputEncoding", "getOutputEncoding$annotations", "expo-speech-recognition_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RecordingOptions implements ftc {
    private final String outputDirectory;
    private final String outputEncoding;
    private final String outputFileName;
    private final Integer outputSampleRate;
    private final boolean persist;

    @w85
    public static /* synthetic */ void getOutputDirectory$annotations() {
    }

    @w85
    public static /* synthetic */ void getOutputEncoding$annotations() {
    }

    @w85
    public static /* synthetic */ void getOutputFileName$annotations() {
    }

    @w85
    public static /* synthetic */ void getOutputSampleRate$annotations() {
    }

    @w85
    public static /* synthetic */ void getPersist$annotations() {
    }

    public final String getOutputDirectory() {
        return this.outputDirectory;
    }

    public final String getOutputEncoding() {
        return this.outputEncoding;
    }

    public final String getOutputFileName() {
        return this.outputFileName;
    }

    public final Integer getOutputSampleRate() {
        return this.outputSampleRate;
    }

    public final boolean getPersist() {
        return this.persist;
    }
}
