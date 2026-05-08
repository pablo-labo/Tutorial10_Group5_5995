package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final class e7g<T> implements Lazy<T>, Serializable {
    private Object _value;
    private gu5<? extends T> initializer;

    public e7g(gu5<? extends T> gu5Var) {
        gu5Var.getClass();
        this.initializer = gu5Var;
        this._value = ygg.a0;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new md7(getValue());
    }

    @Override // kotlin.Lazy
    public final T getValue() {
        if (this._value == ygg.a0) {
            gu5<? extends T> gu5Var = this.initializer;
            gu5Var.getClass();
            this._value = gu5Var.invoke();
            this.initializer = null;
        }
        return (T) this._value;
    }

    public final String toString() {
        return this._value != ygg.a0 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
