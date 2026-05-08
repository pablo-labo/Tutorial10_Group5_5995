package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface vw5<T> extends List<T>, xw5 {
    T peek();

    default void r0() {
    }

    default void reset() {
        clear();
    }
}
