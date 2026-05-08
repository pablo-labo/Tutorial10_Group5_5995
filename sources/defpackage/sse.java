package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class sse<T> implements Iterator<T>, ze8 {
    public final SnapshotStateSet<T> a;
    public final Iterator<T> b;
    public T c;
    public T d;
    public int e;

    /* JADX WARN: Multi-variable type inference failed */
    public sse(SnapshotStateSet<T> snapshotStateSet, Iterator<? extends T> it) {
        this.a = snapshotStateSet;
        this.b = it;
        tse tseVar = snapshotStateSet.a;
        tseVar.getClass();
        this.e = ((tse) ame.h(tseVar)).d;
        this.c = this.d;
        this.d = it.hasNext() ? (T) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        tse tseVar = this.a.a;
        tseVar.getClass();
        if (((tse) ame.h(tseVar)).d != this.e) {
            q6.h();
            return null;
        }
        this.c = this.d;
        Iterator<T> it = this.b;
        this.d = it.hasNext() ? it.next() : null;
        T t = this.c;
        if (t != null) {
            return t;
        }
        bg.h();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        SnapshotStateSet<T> snapshotStateSet = this.a;
        tse tseVar = snapshotStateSet.a;
        tseVar.getClass();
        if (((tse) ame.h(tseVar)).d != this.e) {
            q6.h();
            return;
        }
        T t = this.c;
        if (t == null) {
            bg.h();
            return;
        }
        snapshotStateSet.remove(t);
        this.c = null;
        j6g j6gVar = j6g.a;
        tse tseVar2 = snapshotStateSet.a;
        tseVar2.getClass();
        this.e = ((tse) ame.h(tseVar2)).d;
    }
}
