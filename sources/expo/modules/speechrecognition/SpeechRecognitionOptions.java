package expo.modules.speechrecognition;

import defpackage.ftc;
import defpackage.w85;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\u00020\n8\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017R0\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010!\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b!\u0010\u0006\u0012\u0004\b%\u0010\u0003\u001a\u0004\b\"\u0010\b\"\u0004\b#\u0010$R*\u0010&\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b&\u0010\u0006\u0012\u0004\b)\u0010\u0003\u001a\u0004\b'\u0010\b\"\u0004\b(\u0010$R6\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020+\u0018\u00010*8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b,\u0010-\u0012\u0004\b2\u0010\u0003\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00103\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010\f\u0012\u0004\b5\u0010\u0003\u001a\u0004\b4\u0010\u000eR\"\u00107\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u0010\u0003\u001a\u0004\b9\u0010:R\"\u0010=\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u0010>\u0012\u0004\bA\u0010\u0003\u001a\u0004\b?\u0010@R\"\u0010B\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u0010\f\u0012\u0004\bD\u0010\u0003\u001a\u0004\bC\u0010\u000eR\"\u0010E\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bE\u0010\f\u0012\u0004\bG\u0010\u0003\u001a\u0004\bF\u0010\u000eR.\u0010H\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020+\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bH\u0010-\u0012\u0004\bJ\u0010\u0003\u001a\u0004\bI\u0010/R\"\u0010L\u001a\u0004\u0018\u00010K8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bL\u0010M\u0012\u0004\bP\u0010\u0003\u001a\u0004\bN\u0010OR\"\u0010Q\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bQ\u0010\u0006\u0012\u0004\bS\u0010\u0003\u001a\u0004\bR\u0010\b¨\u0006T"}, d2 = {"Lexpo/modules/speechrecognition/SpeechRecognitionOptions;", "Lftc;", "<init>", "()V", "", "interimResults", "Ljava/lang/Boolean;", "getInterimResults", "()Ljava/lang/Boolean;", "getInterimResults$annotations", "", "lang", "Ljava/lang/String;", "getLang", "()Ljava/lang/String;", "getLang$annotations", "continuous", "getContinuous", "getContinuous$annotations", "", "maxAlternatives", "Ljava/lang/Integer;", "getMaxAlternatives", "()Ljava/lang/Integer;", "getMaxAlternatives$annotations", "", "contextualStrings", "Ljava/util/List;", "getContextualStrings", "()Ljava/util/List;", "setContextualStrings", "(Ljava/util/List;)V", "getContextualStrings$annotations", "requiresOnDeviceRecognition", "getRequiresOnDeviceRecognition", "setRequiresOnDeviceRecognition", "(Ljava/lang/Boolean;)V", "getRequiresOnDeviceRecognition$annotations", "addsPunctuation", "getAddsPunctuation", "setAddsPunctuation", "getAddsPunctuation$annotations", "", "", "androidIntentOptions", "Ljava/util/Map;", "getAndroidIntentOptions", "()Ljava/util/Map;", "setAndroidIntentOptions", "(Ljava/util/Map;)V", "getAndroidIntentOptions$annotations", "androidRecognitionServicePackage", "getAndroidRecognitionServicePackage", "getAndroidRecognitionServicePackage$annotations", "Lexpo/modules/speechrecognition/AudioSourceOptions;", "audioSource", "Lexpo/modules/speechrecognition/AudioSourceOptions;", "getAudioSource", "()Lexpo/modules/speechrecognition/AudioSourceOptions;", "getAudioSource$annotations", "Lexpo/modules/speechrecognition/RecordingOptions;", "recordingOptions", "Lexpo/modules/speechrecognition/RecordingOptions;", "getRecordingOptions", "()Lexpo/modules/speechrecognition/RecordingOptions;", "getRecordingOptions$annotations", "androidIntent", "getAndroidIntent", "getAndroidIntent$annotations", "iosTaskHint", "getIosTaskHint", "getIosTaskHint$annotations", "iosCategory", "getIosCategory", "getIosCategory$annotations", "Lexpo/modules/speechrecognition/VolumeChangeEventOptions;", "volumeChangeEventOptions", "Lexpo/modules/speechrecognition/VolumeChangeEventOptions;", "getVolumeChangeEventOptions", "()Lexpo/modules/speechrecognition/VolumeChangeEventOptions;", "getVolumeChangeEventOptions$annotations", "iosVoiceProcessingEnabled", "getIosVoiceProcessingEnabled", "getIosVoiceProcessingEnabled$annotations", "expo-speech-recognition_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SpeechRecognitionOptions implements ftc {
    private Boolean addsPunctuation;
    private final String androidIntent;
    private Map<String, ? extends Object> androidIntentOptions;
    private final String androidRecognitionServicePackage;
    private final AudioSourceOptions audioSource;
    private List<String> contextualStrings;
    private final Boolean continuous;
    private final Boolean interimResults;
    private final Map<String, Object> iosCategory;
    private final String iosTaskHint;
    private final Boolean iosVoiceProcessingEnabled;
    private final String lang;
    private final Integer maxAlternatives;
    private final RecordingOptions recordingOptions;
    private Boolean requiresOnDeviceRecognition;
    private final VolumeChangeEventOptions volumeChangeEventOptions;

    public SpeechRecognitionOptions() {
        Boolean bool = Boolean.FALSE;
        this.interimResults = bool;
        this.lang = "en-US";
        this.continuous = bool;
        this.maxAlternatives = 5;
        this.requiresOnDeviceRecognition = bool;
        this.addsPunctuation = bool;
        this.androidIntent = "android.speech.action.RECOGNIZE_SPEECH";
        this.iosVoiceProcessingEnabled = bool;
    }

    @w85
    public static /* synthetic */ void getAddsPunctuation$annotations() {
    }

    @w85
    public static /* synthetic */ void getAndroidIntent$annotations() {
    }

    @w85
    public static /* synthetic */ void getAndroidIntentOptions$annotations() {
    }

    @w85
    public static /* synthetic */ void getAndroidRecognitionServicePackage$annotations() {
    }

    @w85
    public static /* synthetic */ void getAudioSource$annotations() {
    }

    @w85
    public static /* synthetic */ void getContextualStrings$annotations() {
    }

    @w85
    public static /* synthetic */ void getContinuous$annotations() {
    }

    @w85
    public static /* synthetic */ void getInterimResults$annotations() {
    }

    @w85
    public static /* synthetic */ void getIosCategory$annotations() {
    }

    @w85
    public static /* synthetic */ void getIosTaskHint$annotations() {
    }

    @w85
    public static /* synthetic */ void getIosVoiceProcessingEnabled$annotations() {
    }

    @w85
    public static /* synthetic */ void getLang$annotations() {
    }

    @w85
    public static /* synthetic */ void getMaxAlternatives$annotations() {
    }

    @w85
    public static /* synthetic */ void getRecordingOptions$annotations() {
    }

    @w85
    public static /* synthetic */ void getRequiresOnDeviceRecognition$annotations() {
    }

    @w85
    public static /* synthetic */ void getVolumeChangeEventOptions$annotations() {
    }

    public final Boolean getAddsPunctuation() {
        return this.addsPunctuation;
    }

    public final String getAndroidIntent() {
        return this.androidIntent;
    }

    public final Map<String, Object> getAndroidIntentOptions() {
        return this.androidIntentOptions;
    }

    public final String getAndroidRecognitionServicePackage() {
        return this.androidRecognitionServicePackage;
    }

    public final AudioSourceOptions getAudioSource() {
        return this.audioSource;
    }

    public final List<String> getContextualStrings() {
        return this.contextualStrings;
    }

    public final Boolean getContinuous() {
        return this.continuous;
    }

    public final Boolean getInterimResults() {
        return this.interimResults;
    }

    public final Map<String, Object> getIosCategory() {
        return this.iosCategory;
    }

    public final String getIosTaskHint() {
        return this.iosTaskHint;
    }

    public final Boolean getIosVoiceProcessingEnabled() {
        return this.iosVoiceProcessingEnabled;
    }

    public final String getLang() {
        return this.lang;
    }

    public final Integer getMaxAlternatives() {
        return this.maxAlternatives;
    }

    public final RecordingOptions getRecordingOptions() {
        return this.recordingOptions;
    }

    public final Boolean getRequiresOnDeviceRecognition() {
        return this.requiresOnDeviceRecognition;
    }

    public final VolumeChangeEventOptions getVolumeChangeEventOptions() {
        return this.volumeChangeEventOptions;
    }

    public final void setAddsPunctuation(Boolean bool) {
        this.addsPunctuation = bool;
    }

    public final void setAndroidIntentOptions(Map<String, ? extends Object> map) {
        this.androidIntentOptions = map;
    }

    public final void setContextualStrings(List<String> list) {
        this.contextualStrings = list;
    }

    public final void setRequiresOnDeviceRecognition(Boolean bool) {
        this.requiresOnDeviceRecognition = bool;
    }
}
