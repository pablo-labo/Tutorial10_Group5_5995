package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w81<T> implements xq2<T> {
    public boolean a = false;

    public static boolean a(int i) {
        return (i & 1) == 1;
    }

    public static boolean b(int i) {
        return !a(i);
    }

    public static boolean h(int i, int i2) {
        return (i & i2) == i2;
    }

    public abstract void c();

    public abstract void d(Throwable th);

    public abstract void e(int i, Object obj);

    public abstract void f(float f);

    public final void g(Exception exc) {
        Class<?> cls = getClass();
        s55.a.getClass();
        if (wab.p(6)) {
            wab.u(6, cls.getSimpleName(), "unhandled exception", exc);
        }
    }

    @Override // defpackage.xq2
    public final synchronized void t(Throwable th) {
        if (this.a) {
            return;
        }
        this.a = true;
        try {
            d(th);
        } catch (Exception e) {
            g(e);
        }
    }

    @Override // defpackage.xq2
    public final synchronized void u() {
        if (this.a) {
            return;
        }
        this.a = true;
        try {
            c();
        } catch (Exception e) {
            g(e);
        }
    }

    @Override // defpackage.xq2
    public final synchronized void v(int i, Object obj) {
        if (this.a) {
            return;
        }
        this.a = a(i);
        try {
            e(i, obj);
        } catch (Exception e) {
            g(e);
        }
    }

    @Override // defpackage.xq2
    public final synchronized void w(float f) {
        if (this.a) {
            return;
        }
        try {
            f(f);
        } catch (Exception e) {
            g(e);
        }
    }
}
