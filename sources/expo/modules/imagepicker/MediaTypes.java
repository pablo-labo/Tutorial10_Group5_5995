package expo.modules.imagepicker;

import defpackage.ojh;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lexpo/modules/imagepicker/MediaTypes;", "Lexpo/modules/kotlin/types/Enumerable;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toFileExtension", "()Ljava/lang/String;", "toCameraIntentAction", "Ljava/lang/String;", "getValue", "Companion", "a", "IMAGES", "VIDEOS", "ALL", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MediaTypes implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MediaTypes[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String value;
    public static final MediaTypes IMAGES = new MediaTypes("IMAGES", 0, "Images");
    public static final MediaTypes VIDEOS = new MediaTypes("VIDEOS", 1, "Videos");
    public static final MediaTypes ALL = new MediaTypes("ALL", 2, "All");

    /* JADX INFO: renamed from: expo.modules.imagepicker.MediaTypes$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MediaTypes.values().length];
            try {
                iArr[MediaTypes.VIDEOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    private static final /* synthetic */ MediaTypes[] $values() {
        return new MediaTypes[]{IMAGES, VIDEOS, ALL};
    }

    static {
        MediaTypes[] mediaTypesArr$values = $values();
        $VALUES = mediaTypesArr$values;
        $ENTRIES = ojh.k(mediaTypesArr$values);
        INSTANCE = new Companion();
    }

    private MediaTypes(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries<MediaTypes> getEntries() {
        return $ENTRIES;
    }

    public static MediaTypes valueOf(String str) {
        return (MediaTypes) Enum.valueOf(MediaTypes.class, str);
    }

    public static MediaTypes[] values() {
        return (MediaTypes[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final String toCameraIntentAction() {
        return b.a[ordinal()] == 1 ? "android.media.action.VIDEO_CAPTURE" : "android.media.action.IMAGE_CAPTURE";
    }

    public final String toFileExtension() {
        return b.a[ordinal()] == 1 ? ".mp4" : ".jpeg";
    }
}
