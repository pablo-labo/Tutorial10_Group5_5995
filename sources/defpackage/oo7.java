package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oo7<T> extends r6g<T> {
    public final T a;
    public boolean b;

    public oo7(T t) {
        this.a = t;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.b;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this.b) {
            k20.p();
            return null;
        }
        this.b = true;
        return this.a;
    }
}
