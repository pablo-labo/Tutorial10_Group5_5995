package app.rive.runtime.kotlin.core;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lapp/rive/runtime/kotlin/core/SMITrigger;", "Lapp/rive/runtime/kotlin/core/SMIInput;", "", "unsafeCppPointer", "<init>", "(J)V", "cppPointer", "Lj6g;", "cppFire", "fire$kotlin_release", "()V", "fire", "", "toString", "()Ljava/lang/String;", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class SMITrigger extends SMIInput {
    public static final int $stable = 0;

    public SMITrigger(long j) {
        super(j);
    }

    private final native void cppFire(long cppPointer);

    public final void fire$kotlin_release() {
        cppFire(getCppPointer());
    }

    @Override // app.rive.runtime.kotlin.core.SMIInput
    public String toString() {
        return "SMITrigger " + getName() + '\n';
    }
}
