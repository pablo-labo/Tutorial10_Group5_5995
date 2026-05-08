package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bo1<T> extends x2<T> {
    public final T[] c;

    public bo1(T[] tArr, int i, int i2) {
        super(i, i2);
        this.c = tArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            k20.p();
            return null;
        }
        int i = this.a;
        this.a = i + 1;
        return this.c[i];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            k20.p();
            return null;
        }
        int i = this.a - 1;
        this.a = i;
        return this.c[i];
    }
}
