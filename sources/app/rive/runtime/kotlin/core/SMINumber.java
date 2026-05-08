package app.rive.runtime.kotlin.core;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\n\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00078F@@X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lapp/rive/runtime/kotlin/core/SMINumber;", "Lapp/rive/runtime/kotlin/core/SMIInput;", "", "unsafeCppPointer", "<init>", "(J)V", "cppPointer", "", "cppValue", "(J)F", "value", "Lj6g;", "cppSetValue", "(JF)V", "", "toString", "()Ljava/lang/String;", "getValue", "()F", "setValue$kotlin_release", "(F)V", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class SMINumber extends SMIInput {
    public static final int $stable = 0;

    public SMINumber(long j) {
        super(j);
    }

    private final native void cppSetValue(long cppPointer, float value);

    private final native float cppValue(long cppPointer);

    public final float getValue() {
        return cppValue(getCppPointer());
    }

    public final void setValue$kotlin_release(float f) {
        cppSetValue(getCppPointer(), f);
    }

    @Override // app.rive.runtime.kotlin.core.SMIInput
    public String toString() {
        return "SMINumber " + getName() + '\n';
    }
}
