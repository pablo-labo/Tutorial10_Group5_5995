package defpackage;

import java.io.Serializable;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final class d2f<T> implements Lazy<T>, Serializable {
    private volatile Object _value;
    private gu5<? extends T> initializer;
    private final Object lock;

    public d2f(gu5 gu5Var) {
        gu5Var.getClass();
        this.initializer = gu5Var;
        this._value = ygg.a0;
        this.lock = this;
    }

    private final Object writeReplace() {
        return new md7(getValue());
    }

    public final boolean a() {
        return this._value != ygg.a0;
    }

    @Override // kotlin.Lazy
    public final T getValue() {
        T tInvoke;
        T t = (T) this._value;
        ygg yggVar = ygg.a0;
        if (t != yggVar) {
            return t;
        }
        synchronized (this.lock) {
            tInvoke = (T) this._value;
            if (tInvoke == yggVar) {
                gu5<? extends T> gu5Var = this.initializer;
                gu5Var.getClass();
                tInvoke = gu5Var.invoke();
                this._value = tInvoke;
                this.initializer = null;
            }
        }
        return tInvoke;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
