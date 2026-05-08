package expo.modules.video.records;

import androidx.media3.common.a;
import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import defpackage.ftc;
import defpackage.w85;
import java.io.Serializable;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\u0013B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\t\u0012\u0004\b\u000f\u0010\r\u001a\u0004\b\u000e\u0010\u000bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\t\u0012\u0004\b\u0011\u0010\r\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0014"}, d2 = {"Lexpo/modules/video/records/AudioTrack;", "Lftc;", "Ljava/io/Serializable;", "", "id", "language", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", "getLanguage", "getLanguage$annotations", "getLabel", "getLabel$annotations", "Companion", "a", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AudioTrack implements ftc, Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final String id;
    private final String label;
    private final String language;

    /* JADX INFO: renamed from: expo.modules.video.records.AudioTrack$a, reason: from kotlin metadata */
    public static final class Companion {
        public static AudioTrack a(a aVar) {
            String str;
            String displayLanguage;
            if (aVar == null || (str = aVar.a) == null) {
                return null;
            }
            String str2 = aVar.d;
            if (str2 == null || (displayLanguage = new Locale(str2).getDisplayLanguage()) == null) {
                displayLanguage = ViewUtilsKt.UNKNOWN_DESTINATION_URL;
            }
            return new AudioTrack(str, str2, displayLanguage);
        }
    }

    public AudioTrack(String str, String str2, String str3) {
        str.getClass();
        this.id = str;
        this.language = str2;
        this.label = str3;
    }

    @w85
    public static /* synthetic */ void getId$annotations() {
    }

    @w85
    public static /* synthetic */ void getLabel$annotations() {
    }

    @w85
    public static /* synthetic */ void getLanguage$annotations() {
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLanguage() {
        return this.language;
    }
}
