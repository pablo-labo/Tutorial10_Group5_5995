package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r9b<T> extends x2<T> {
    public final T[] c;
    public final rtf<T> d;

    /* JADX WARN: Multi-variable type inference failed */
    public r9b(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        super(i, i2);
        this.c = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.d = new rtf<>(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            k20.p();
            return null;
        }
        rtf<T> rtfVar = this.d;
        if (rtfVar.hasNext()) {
            this.a++;
            return rtfVar.next();
        }
        int i = this.a;
        this.a = i + 1;
        return this.c[i - rtfVar.b];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            k20.p();
            return null;
        }
        int i = this.a;
        rtf<T> rtfVar = this.d;
        int i2 = rtfVar.b;
        if (i <= i2) {
            this.a = i - 1;
            return rtfVar.previous();
        }
        int i3 = i - 1;
        this.a = i3;
        return this.c[i3 - i2];
    }
}
