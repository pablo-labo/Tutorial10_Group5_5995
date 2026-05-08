package expo.modules.imagepicker;

import com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper;
import defpackage.ojh;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/imagepicker/CameraType;", "Lexpo/modules/kotlin/types/Enumerable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BACK", "FRONT", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraType implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CameraType[] $VALUES;
    public static final CameraType BACK = new CameraType("BACK", 0, WindowCallbackWrapper.BACK_DEFAULT_TARGET_NAME);
    public static final CameraType FRONT = new CameraType("FRONT", 1, "front");
    private final String value;

    private static final /* synthetic */ CameraType[] $values() {
        return new CameraType[]{BACK, FRONT};
    }

    static {
        CameraType[] cameraTypeArr$values = $values();
        $VALUES = cameraTypeArr$values;
        $ENTRIES = ojh.k(cameraTypeArr$values);
    }

    private CameraType(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries<CameraType> getEntries() {
        return $ENTRIES;
    }

    public static CameraType valueOf(String str) {
        return (CameraType) Enum.valueOf(CameraType.class, str);
    }

    public static CameraType[] values() {
        return (CameraType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
