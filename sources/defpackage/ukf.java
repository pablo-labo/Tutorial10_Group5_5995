package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ukf {
    public static final ThreadLocal<d05> a = new ThreadLocal<>();

    public static d05 a() {
        ThreadLocal<d05> threadLocal = a;
        d05 d05Var = threadLocal.get();
        if (d05Var != null) {
            return d05Var;
        }
        xh1 xh1Var = new xh1(Thread.currentThread());
        threadLocal.set(xh1Var);
        return xh1Var;
    }
}
