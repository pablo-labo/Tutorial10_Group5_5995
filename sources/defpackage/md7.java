package defpackage;

import java.io.Serializable;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final class md7<T> implements Lazy<T>, Serializable {
    private final T value;

    public md7(T t) {
        this.value = t;
    }

    @Override // kotlin.Lazy
    public final T getValue() {
        return this.value;
    }

    public final String toString() {
        return String.valueOf(this.value);
    }
}
