package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k4a {
    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            c(i, size);
        }
    }

    public static final void b(List<?> list, int i, int i2) {
        if (i > i2) {
            f(i, i2);
        }
        if (i < 0) {
            d(i);
        }
        if (i2 > list.size()) {
            e(i2, list.size());
        }
    }

    private static final void c(int i, int i2) {
        throw new IndexOutOfBoundsException(w40.e("Index ", i, " is out of bounds. The list has ", i2, " elements."));
    }

    private static final void d(int i) {
        throw new IndexOutOfBoundsException(bg.d(i, "fromIndex (", ") is less than 0."));
    }

    private static final void e(int i, int i2) {
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i2 + ')');
    }

    private static final void f(int i, int i2) {
        throw new IllegalArgumentException(w40.e("Indices are out of order. fromIndex (", i, ") is greater than toIndex (", i2, ")."));
    }
}
