package app.rive.runtime.kotlin.core;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModelNumberProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelProperty;", "", "", "unsafeCppPointer", "<init>", "(J)V", "cppPointer", "cppGetValue", "(J)F", "value", "Lj6g;", "cppSetValue", "(JF)V", "nativeGetValue", "()Ljava/lang/Float;", "nativeSetValue", "(F)V", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class ViewModelNumberProperty extends ViewModelProperty<Float> {
    public static final int $stable = 0;

    public ViewModelNumberProperty(long j) {
        super(j);
    }

    private final native float cppGetValue(long cppPointer);

    private final native void cppSetValue(long cppPointer, float value);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public Float nativeGetValue() {
        return Float.valueOf(cppGetValue(getCppPointer()));
    }

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public /* bridge */ /* synthetic */ void nativeSetValue(Float f) {
        nativeSetValue(f.floatValue());
    }

    public void nativeSetValue(float value) {
        cppSetValue(getCppPointer(), value);
    }
}
