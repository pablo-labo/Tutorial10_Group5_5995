package app.rive.runtime.kotlin.core;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.ojh;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lapp/rive/runtime/kotlin/core/AdvanceResult;", "", "(Ljava/lang/String;I)V", "ADVANCED", "ONESHOT", "LOOP", "PINGPONG", "NONE", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class AdvanceResult {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdvanceResult[] $VALUES;
    public static final AdvanceResult ADVANCED = new AdvanceResult("ADVANCED", 0);
    public static final AdvanceResult ONESHOT = new AdvanceResult("ONESHOT", 1);
    public static final AdvanceResult LOOP = new AdvanceResult("LOOP", 2);
    public static final AdvanceResult PINGPONG = new AdvanceResult("PINGPONG", 3);
    public static final AdvanceResult NONE = new AdvanceResult("NONE", 4);

    private static final /* synthetic */ AdvanceResult[] $values() {
        return new AdvanceResult[]{ADVANCED, ONESHOT, LOOP, PINGPONG, NONE};
    }

    static {
        AdvanceResult[] advanceResultArr$values = $values();
        $VALUES = advanceResultArr$values;
        $ENTRIES = ojh.k(advanceResultArr$values);
    }

    private AdvanceResult(String str, int i) {
    }

    public static EnumEntries<AdvanceResult> getEntries() {
        return $ENTRIES;
    }

    public static AdvanceResult valueOf(String str) {
        return (AdvanceResult) Enum.valueOf(AdvanceResult.class, str);
    }

    public static AdvanceResult[] values() {
        return (AdvanceResult[]) $VALUES.clone();
    }
}
