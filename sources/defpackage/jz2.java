package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jz2<T> {
    public final T a;
    public boolean b;

    public jz2(T t) {
        this.a = t;
    }

    public final T a() {
        if (this.b) {
            return null;
        }
        this.b = true;
        return this.a;
    }
}
