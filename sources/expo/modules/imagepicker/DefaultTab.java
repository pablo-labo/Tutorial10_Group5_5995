package expo.modules.imagepicker;

import defpackage.l;
import defpackage.ojh;
import defpackage.t8;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lexpo/modules/imagepicker/DefaultTab;", "Lexpo/modules/kotlin/types/Enumerable;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lt8$b;", "toDefaultTab", "()Lt8$b;", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "PHOTOS", "ALBUMS", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultTab implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DefaultTab[] $VALUES;
    private final String value;
    public static final DefaultTab PHOTOS = new DefaultTab("PHOTOS", 0, "photos");
    public static final DefaultTab ALBUMS = new DefaultTab("ALBUMS", 1, "albums");

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DefaultTab.values().length];
            try {
                iArr[DefaultTab.PHOTOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DefaultTab.ALBUMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    private static final /* synthetic */ DefaultTab[] $values() {
        return new DefaultTab[]{PHOTOS, ALBUMS};
    }

    static {
        DefaultTab[] defaultTabArr$values = $values();
        $VALUES = defaultTabArr$values;
        $ENTRIES = ojh.k(defaultTabArr$values);
    }

    private DefaultTab(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries<DefaultTab> getEntries() {
        return $ENTRIES;
    }

    public static DefaultTab valueOf(String str) {
        return (DefaultTab) Enum.valueOf(DefaultTab.class, str);
    }

    public static DefaultTab[] values() {
        return (DefaultTab[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final t8.b toDefaultTab() {
        int i = a.a[ordinal()];
        if (i == 1) {
            return t8.b.C0422b.a;
        }
        if (i == 2) {
            return t8.b.a.a;
        }
        l.g();
        return null;
    }
}
