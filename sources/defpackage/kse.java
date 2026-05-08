package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class kse<T> implements ListIterator<T>, ze8 {
    public final SnapshotStateList<T> a;
    public int b;
    public int c = -1;
    public int d;

    public kse(SnapshotStateList<T> snapshotStateList, int i) {
        this.a = snapshotStateList;
        this.b = i - 1;
        this.d = ak2.r(snapshotStateList);
    }

    public final void a() {
        if (ak2.r(this.a) == this.d) {
            return;
        }
        q6.h();
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        a();
        int i = this.b + 1;
        SnapshotStateList<T> snapshotStateList = this.a;
        snapshotStateList.add(i, t);
        this.c = -1;
        this.b++;
        this.d = ak2.r(snapshotStateList);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        a();
        int i = this.b + 1;
        this.c = i;
        SnapshotStateList<T> snapshotStateList = this.a;
        ak2.f(i, snapshotStateList.size());
        T t = snapshotStateList.get(i);
        this.b = i;
        return t;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b + 1;
    }

    @Override // java.util.ListIterator
    public final T previous() {
        a();
        int i = this.b;
        SnapshotStateList<T> snapshotStateList = this.a;
        ak2.f(i, snapshotStateList.size());
        int i2 = this.b;
        this.c = i2;
        this.b--;
        return snapshotStateList.get(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.c;
        SnapshotStateList<T> snapshotStateList = this.a;
        snapshotStateList.remove(i);
        this.b--;
        this.c = -1;
        this.d = ak2.r(snapshotStateList);
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        a();
        int i = this.c;
        if (i < 0) {
            r6.g("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
            return;
        }
        SnapshotStateList<T> snapshotStateList = this.a;
        snapshotStateList.set(i, t);
        this.d = ak2.r(snapshotStateList);
    }
}
