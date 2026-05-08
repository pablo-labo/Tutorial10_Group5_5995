package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cn8<T> implements j6c<T> {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile j6c<T> b;

    public cn8(j6c<T> j6cVar) {
        this.b = j6cVar;
    }

    @Override // defpackage.j6c
    public final T get() {
        T t;
        T t2 = (T) this.a;
        Object obj = c;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            try {
                t = (T) this.a;
                if (t == obj) {
                    t = this.b.get();
                    this.a = t;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }
}
