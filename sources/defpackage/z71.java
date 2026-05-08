package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class z71<T> {
    public final sf6 a;
    public final sf6 b;
    public final a<T> c;
    public T d;
    public T e;
    public int f;

    public interface a<T> {
        void b(T t, T t2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z71(Object obj, Looper looper, Looper looper2, n2f n2fVar, a aVar) {
        this.a = n2fVar.c(looper, null);
        this.b = n2fVar.c(looper2, null);
        this.d = obj;
        this.e = obj;
        this.c = aVar;
    }

    public final void a(Runnable runnable) {
        sf6 sf6Var = this.a;
        if (sf6Var.f().getThread().isAlive()) {
            sf6Var.i(runnable);
        }
    }

    public final void b(T t) {
        T t2 = this.d;
        this.d = t;
        if (t2.equals(t)) {
            return;
        }
        this.c.b(t2, t);
    }
}
