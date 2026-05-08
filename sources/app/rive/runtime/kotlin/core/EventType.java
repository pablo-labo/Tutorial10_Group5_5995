package app.rive.runtime.kotlin.core;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.kc9;
import defpackage.ojh;
import defpackage.t92;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\n\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lapp/rive/runtime/kotlin/core/EventType;", "", "value", "", "(Ljava/lang/String;IS)V", "getValue", "()S", "OpenURLEvent", "GeneralEvent", "Companion", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class EventType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EventType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Map<Short, EventType> map;
    private final short value;
    public static final EventType OpenURLEvent = new EventType("OpenURLEvent", 0, 131);
    public static final EventType GeneralEvent = new EventType("GeneralEvent", 1, 128);

    private static final /* synthetic */ EventType[] $values() {
        return new EventType[]{OpenURLEvent, GeneralEvent};
    }

    static {
        EventType[] eventTypeArr$values = $values();
        $VALUES = eventTypeArr$values;
        $ENTRIES = ojh.k(eventTypeArr$values);
        INSTANCE = new Companion(null);
        EnumEntries<EventType> entries = getEntries();
        int iV = kc9.V(t92.r0(entries, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iV < 16 ? 16 : iV);
        for (EventType eventType : entries) {
            linkedHashMap.put(Short.valueOf(eventType.value), eventType);
        }
        map = linkedHashMap;
    }

    private EventType(String str, int i, short s) {
        this.value = s;
    }

    public static EnumEntries<EventType> getEntries() {
        return $ENTRIES;
    }

    public static EventType valueOf(String str) {
        return (EventType) Enum.valueOf(EventType.class, str);
    }

    public static EventType[] values() {
        return (EventType[]) $VALUES.clone();
    }

    public final short getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lapp/rive/runtime/kotlin/core/EventType$Companion;", "", "()V", "map", "", "", "Lapp/rive/runtime/kotlin/core/EventType;", "fromInt", "type", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EventType fromInt(short type) {
            return (EventType) EventType.map.get(Short.valueOf(type));
        }

        private Companion() {
        }
    }
}
