package expo.modules.video.enums;

import defpackage.l;
import defpackage.ojh;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\f\u001a\u00020\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000e"}, d2 = {"Lexpo/modules/video/enums/ContentFit;", "Lexpo/modules/kotlin/types/Enumerable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CONTAIN", "FILL", "COVER", "toResizeMode", "", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContentFit implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ContentFit[] $VALUES;
    private final String value;
    public static final ContentFit CONTAIN = new ContentFit("CONTAIN", 0, "contain");
    public static final ContentFit FILL = new ContentFit("FILL", 1, "fill");
    public static final ContentFit COVER = new ContentFit("COVER", 2, "cover");

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ContentFit.values().length];
            try {
                iArr[ContentFit.CONTAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContentFit.FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContentFit.COVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    private static final /* synthetic */ ContentFit[] $values() {
        return new ContentFit[]{CONTAIN, FILL, COVER};
    }

    static {
        ContentFit[] contentFitArr$values = $values();
        $VALUES = contentFitArr$values;
        $ENTRIES = ojh.k(contentFitArr$values);
    }

    private ContentFit(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries<ContentFit> getEntries() {
        return $ENTRIES;
    }

    public static ContentFit valueOf(String str) {
        return (ContentFit) Enum.valueOf(ContentFit.class, str);
    }

    public static ContentFit[] values() {
        return (ContentFit[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final int toResizeMode() {
        int i = a.a[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        l.g();
        return 0;
    }
}
