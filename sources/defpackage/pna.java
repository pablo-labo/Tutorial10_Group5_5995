package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pna {
    public static final Object[] a = new Object[0];
    public static final p3a b = new p3a(0);

    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            l5.s(w40.e("Index ", i, " is out of bounds. The list has ", size, " elements."));
        }
    }

    public static final void b(List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            l5.q(w40.e("Indices are out of order. fromIndex (", i, ") is greater than toIndex (", i2, ")."));
            return;
        }
        if (i < 0) {
            l5.s(bg.d(i, "fromIndex (", ") is less than 0."));
            return;
        }
        if (i2 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
    }
}
