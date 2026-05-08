package defpackage;

import androidx.core.util.Pools$SimplePool;

/* JADX INFO: loaded from: classes.dex */
public final class pgb<T> extends Pools$SimplePool<T> {
    public final Object c;

    public pgb(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // androidx.core.util.Pools$SimplePool, defpackage.ngb
    public final boolean a(T t) {
        boolean zA;
        t.getClass();
        synchronized (this.c) {
            zA = super.a(t);
        }
        return zA;
    }

    @Override // androidx.core.util.Pools$SimplePool, defpackage.ngb
    public final T acquire() {
        T t;
        synchronized (this.c) {
            t = (T) super.acquire();
        }
        return t;
    }
}
