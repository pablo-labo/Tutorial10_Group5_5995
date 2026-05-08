package app.rive.runtime.kotlin.core;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModelTriggerProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelTriggerProperty$TriggerUnit;", "", "unsafeCppPointer", "<init>", "(J)V", "cppPointer", "Lj6g;", "cppTrigger", "nativeGetValue", "()Lapp/rive/runtime/kotlin/core/ViewModelTriggerProperty$TriggerUnit;", "value", "nativeSetValue", "(Lapp/rive/runtime/kotlin/core/ViewModelTriggerProperty$TriggerUnit;)V", "trigger", "()V", "TriggerUnit", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class ViewModelTriggerProperty extends ViewModelProperty<TriggerUnit> {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModelTriggerProperty$TriggerUnit;", "", "()V", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
    public static final class TriggerUnit {
        public static final int $stable = 0;
    }

    public ViewModelTriggerProperty(long j) {
        super(j);
    }

    private final native void cppTrigger(long cppPointer);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public TriggerUnit nativeGetValue() {
        return new TriggerUnit();
    }

    public final void trigger() {
        cppTrigger(getCppPointer());
    }

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public void nativeSetValue(TriggerUnit value) {
        value.getClass();
    }
}
