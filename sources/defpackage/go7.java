package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class go7<T> extends w2<T> {
    public final int a;
    public final int b;
    public final ArrayList c;

    public go7(ArrayList arrayList, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = arrayList;
    }

    @Override // defpackage.l1
    public final int a() {
        return this.c.size() + this.a + this.b;
    }

    @Override // java.util.List
    public final T get(int i) {
        int i2 = this.a;
        if (i < 0 || i >= i2) {
            ArrayList arrayList = this.c;
            if (i < arrayList.size() + i2 && i2 <= i) {
                return (T) arrayList.get(i - i2);
            }
            int size = arrayList.size() + i2;
            if (i >= a() || size > i) {
                v40.k(a(), o6.g(i, "Illegal attempt to access index ", " in ItemSnapshotList of size "));
                return null;
            }
        }
        return null;
    }
}
