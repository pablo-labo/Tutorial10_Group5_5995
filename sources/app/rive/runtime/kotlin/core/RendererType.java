package app.rive.runtime.kotlin.core;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.ojh;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lapp/rive/runtime/kotlin/core/RendererType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "Rive", "Canvas", "Companion", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class RendererType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RendererType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final RendererType Rive = new RendererType("Rive", 0, 0);
    public static final RendererType Canvas = new RendererType("Canvas", 1, 1);

    private static final /* synthetic */ RendererType[] $values() {
        return new RendererType[]{Rive, Canvas};
    }

    static {
        RendererType[] rendererTypeArr$values = $values();
        $VALUES = rendererTypeArr$values;
        $ENTRIES = ojh.k(rendererTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private RendererType(String str, int i, int i2) {
        this.value = i2;
    }

    public static EnumEntries<RendererType> getEntries() {
        return $ENTRIES;
    }

    public static RendererType valueOf(String str) {
        return (RendererType) Enum.valueOf(RendererType.class, str);
    }

    public static RendererType[] values() {
        return (RendererType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lapp/rive/runtime/kotlin/core/RendererType$Companion;", "", "()V", "fromIndex", "Lapp/rive/runtime/kotlin/core/RendererType;", "index", "", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RendererType fromIndex(int index) {
            int size = RendererType.getEntries().size();
            if (index >= 0 && index <= size) {
                return RendererType.getEntries().get(index);
            }
            throw new IndexOutOfBoundsException("Invalid " + Companion.class + " index value " + index + ". It must be between 0 and " + size);
        }

        private Companion() {
        }
    }
}
