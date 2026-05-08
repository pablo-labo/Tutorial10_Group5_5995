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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lapp/rive/runtime/kotlin/core/Direction;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "BACKWARDS", "FORWARDS", "AUTO", "Companion", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class Direction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Direction[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Map<Integer, Direction> map;
    private final int value;
    public static final Direction BACKWARDS = new Direction("BACKWARDS", 0, -1);
    public static final Direction FORWARDS = new Direction("FORWARDS", 1, 1);
    public static final Direction AUTO = new Direction("AUTO", 2, 0);

    private static final /* synthetic */ Direction[] $values() {
        return new Direction[]{BACKWARDS, FORWARDS, AUTO};
    }

    static {
        Direction[] directionArr$values = $values();
        $VALUES = directionArr$values;
        $ENTRIES = ojh.k(directionArr$values);
        INSTANCE = new Companion(null);
        EnumEntries<Direction> entries = getEntries();
        int iV = kc9.V(t92.r0(entries, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iV < 16 ? 16 : iV);
        for (Direction direction : entries) {
            linkedHashMap.put(Integer.valueOf(direction.value), direction);
        }
        map = linkedHashMap;
    }

    private Direction(String str, int i, int i2) {
        this.value = i2;
    }

    public static EnumEntries<Direction> getEntries() {
        return $ENTRIES;
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lapp/rive/runtime/kotlin/core/Direction$Companion;", "", "()V", "map", "", "", "Lapp/rive/runtime/kotlin/core/Direction;", "fromInt", "type", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Direction fromInt(int type) {
            return (Direction) Direction.map.get(Integer.valueOf(type));
        }

        private Companion() {
        }
    }
}
