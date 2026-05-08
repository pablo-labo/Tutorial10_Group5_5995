package app.rive.runtime.kotlin.core;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.k20;
import defpackage.l5;
import defpackage.ojh;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lapp/rive/runtime/kotlin/core/Fit;", "", "(Ljava/lang/String;I)V", "FILL", "CONTAIN", "COVER", "FIT_WIDTH", "FIT_HEIGHT", "NONE", "SCALE_DOWN", "LAYOUT", "Companion", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class Fit {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Fit[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Fit FILL = new Fit("FILL", 0);
    public static final Fit CONTAIN = new Fit("CONTAIN", 1);
    public static final Fit COVER = new Fit("COVER", 2);
    public static final Fit FIT_WIDTH = new Fit("FIT_WIDTH", 3);
    public static final Fit FIT_HEIGHT = new Fit("FIT_HEIGHT", 4);
    public static final Fit NONE = new Fit("NONE", 5);
    public static final Fit SCALE_DOWN = new Fit("SCALE_DOWN", 6);
    public static final Fit LAYOUT = new Fit("LAYOUT", 7);

    private static final /* synthetic */ Fit[] $values() {
        return new Fit[]{FILL, CONTAIN, COVER, FIT_WIDTH, FIT_HEIGHT, NONE, SCALE_DOWN, LAYOUT};
    }

    static {
        Fit[] fitArr$values = $values();
        $VALUES = fitArr$values;
        $ENTRIES = ojh.k(fitArr$values);
        INSTANCE = new Companion(null);
    }

    private Fit(String str, int i) {
    }

    public static EnumEntries<Fit> getEntries() {
        return $ENTRIES;
    }

    public static Fit valueOf(String str) {
        return (Fit) Enum.valueOf(Fit.class, str);
    }

    public static Fit[] values() {
        return (Fit[]) $VALUES.clone();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lapp/rive/runtime/kotlin/core/Fit$Companion;", "", "()V", "fromIndex", "Lapp/rive/runtime/kotlin/core/Fit;", "index", "", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Fit fromIndex(int index) {
            int size = Fit.getEntries().size();
            if (index >= 0 && index <= size) {
                return Fit.getEntries().get(index);
            }
            l5.s(k20.l("Invalid Fit index value ", index, size, ". It must be between 0 and "));
            return null;
        }

        private Companion() {
        }
    }
}
