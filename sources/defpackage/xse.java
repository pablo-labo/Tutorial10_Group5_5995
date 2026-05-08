package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xse<T> implements Runnable {
    public final AtomicInteger a;
    public final xq2<T> b;
    public final tpb c;
    public final ppb d;
    public final String e;

    public xse(xq2<T> xq2Var, tpb tpbVar, ppb ppbVar, String str) {
        xq2Var.getClass();
        tpbVar.getClass();
        ppbVar.getClass();
        str.getClass();
        this.a = new AtomicInteger(0);
        this.b = xq2Var;
        this.c = tpbVar;
        this.d = ppbVar;
        this.e = str;
        tpbVar.k(ppbVar, str);
    }

    public final void a() {
        if (this.a.compareAndSet(0, 2)) {
            e();
        }
    }

    public abstract void b(Object obj);

    public Map<String, String> c(T t) {
        return null;
    }

    public abstract Object d();

    public void e() {
        tpb tpbVar = this.c;
        ppb ppbVar = this.d;
        String str = this.e;
        tpbVar.j(ppbVar, str);
        tpbVar.f(ppbVar, str);
        this.b.u();
    }

    public void f(Exception exc) {
        tpb tpbVar = this.c;
        ppb ppbVar = this.d;
        String str = this.e;
        tpbVar.j(ppbVar, str);
        tpbVar.h(ppbVar, str, exc, null);
        this.b.t(exc);
    }

    public void g(T t) {
        tpb tpbVar = this.c;
        ppb ppbVar = this.d;
        String str = this.e;
        tpbVar.a(ppbVar, str, tpbVar.j(ppbVar, str) ? c(t) : null);
        this.b.v(1, t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        AtomicInteger atomicInteger = this.a;
        if (atomicInteger.compareAndSet(0, 1)) {
            try {
                Object objD = d();
                atomicInteger.set(3);
                try {
                    g(objD);
                } finally {
                    b(objD);
                }
            } catch (Exception e) {
                atomicInteger.set(4);
                f(e);
            }
        }
    }
}
