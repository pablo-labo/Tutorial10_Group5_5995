package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final class qjd<T> implements Lazy<T>, Serializable {
    public static final AtomicReferenceFieldUpdater<qjd<?>, Object> a = AtomicReferenceFieldUpdater.newUpdater(qjd.class, Object.class, "_value");
    private volatile Object _value;

    /* JADX INFO: renamed from: final, reason: not valid java name */
    private final Object f18final;
    private volatile gu5<? extends T> initializer;

    public qjd(gu5<? extends T> gu5Var) {
        gu5Var.getClass();
        this.initializer = gu5Var;
        ygg yggVar = ygg.a0;
        this._value = yggVar;
        this.f18final = yggVar;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new md7(getValue());
    }

    @Override // kotlin.Lazy
    public final T getValue() {
        T t = (T) this._value;
        ygg yggVar = ygg.a0;
        if (t != yggVar) {
            return t;
        }
        gu5<? extends T> gu5Var = this.initializer;
        if (gu5Var != null) {
            T tInvoke = gu5Var.invoke();
            AtomicReferenceFieldUpdater<qjd<?>, Object> atomicReferenceFieldUpdater = a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, yggVar, tInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != yggVar) {
                }
            }
            this.initializer = null;
            return tInvoke;
        }
        return (T) this._value;
    }

    public final String toString() {
        return this._value != ygg.a0 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
