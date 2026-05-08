package app.rive.runtime.kotlin.core;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.fse;
import defpackage.gse;
import defpackage.h4a;
import defpackage.hh2;
import defpackage.wg2;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00028\u0000H$¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H$¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u0011R\u0014\u0010!\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModelProperty;", "T", "Lapp/rive/runtime/kotlin/core/NativeObject;", "", "unsafeCppPointer", "<init>", "(J)V", "cppPointer", "", "cppHasChanged", "(J)Z", "cppFlushChanges", "nativeGetValue", "()Ljava/lang/Object;", "value", "Lj6g;", "nativeSetValue", "(Ljava/lang/Object;)V", "pollChanges$kotlin_release", "()V", "pollChanges", "Lh4a;", "_valueFlow", "Lh4a;", "Lfse;", "valueFlow", "Lfse;", "getValueFlow", "()Lfse;", "getValue", "setValue", "isSubscribed$kotlin_release", "()Z", "isSubscribed", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public abstract class ViewModelProperty<T> extends NativeObject {
    public static final int $stable = 8;
    private final h4a<T> _valueFlow;
    private final fse<T> valueFlow;

    public ViewModelProperty(long j) {
        super(j);
        gse gseVarE = hh2.e(nativeGetValue());
        this._valueFlow = gseVarE;
        this.valueFlow = wg2.j(gseVarE);
    }

    private final native boolean cppFlushChanges(long cppPointer);

    private final native boolean cppHasChanged(long cppPointer);

    public final T getValue() {
        return this._valueFlow.getValue();
    }

    public final fse<T> getValueFlow() {
        return this.valueFlow;
    }

    public final boolean isSubscribed$kotlin_release() {
        return ((Number) this._valueFlow.f().getValue()).intValue() > 0;
    }

    public abstract T nativeGetValue();

    public abstract void nativeSetValue(T value);

    public final void pollChanges$kotlin_release() {
        if (cppHasChanged(getCppPointer())) {
            this._valueFlow.setValue(nativeGetValue());
            cppFlushChanges(getCppPointer());
        }
    }

    public final void setValue(T t) {
        nativeSetValue(t);
        this._valueFlow.setValue(t);
    }
}
