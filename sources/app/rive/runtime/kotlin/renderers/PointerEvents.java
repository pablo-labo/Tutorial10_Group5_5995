package app.rive.runtime.kotlin.renderers;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.ojh;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lapp/rive/runtime/kotlin/renderers/PointerEvents;", "", "(Ljava/lang/String;I)V", "POINTER_DOWN", "POINTER_UP", "POINTER_MOVE", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class PointerEvents {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PointerEvents[] $VALUES;
    public static final PointerEvents POINTER_DOWN = new PointerEvents("POINTER_DOWN", 0);
    public static final PointerEvents POINTER_UP = new PointerEvents("POINTER_UP", 1);
    public static final PointerEvents POINTER_MOVE = new PointerEvents("POINTER_MOVE", 2);

    private static final /* synthetic */ PointerEvents[] $values() {
        return new PointerEvents[]{POINTER_DOWN, POINTER_UP, POINTER_MOVE};
    }

    static {
        PointerEvents[] pointerEventsArr$values = $values();
        $VALUES = pointerEventsArr$values;
        $ENTRIES = ojh.k(pointerEventsArr$values);
    }

    private PointerEvents(String str, int i) {
    }

    public static EnumEntries<PointerEvents> getEntries() {
        return $ENTRIES;
    }

    public static PointerEvents valueOf(String str) {
        return (PointerEvents) Enum.valueOf(PointerEvents.class, str);
    }

    public static PointerEvents[] values() {
        return (PointerEvents[]) $VALUES.clone();
    }
}
