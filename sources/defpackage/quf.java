package defpackage;

import defpackage.j2;
import defpackage.jj7;
import defpackage.ll5;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public final class quf<V> extends ll5.a<V> implements RunnableFuture<V> {
    public volatile a W;

    public final class a extends jj7<V> {
        private final Callable<V> callable;

        public a(Callable<V> callable) {
            callable.getClass();
            this.callable = callable;
        }

        @Override // defpackage.jj7
        public final V a() {
            return this.callable.call();
        }

        @Override // defpackage.jj7
        public final String b() {
            return this.callable.toString();
        }
    }

    public quf(Callable<V> callable) {
        this.W = new a(callable);
    }

    @Override // defpackage.j2
    public final void d() {
        a aVar;
        Object obj = this.a;
        if ((obj instanceof j2.b) && ((j2.b) obj).a && (aVar = this.W) != null) {
            jj7.b bVar = jj7.b;
            jj7.b bVar2 = jj7.a;
            Runnable runnable = (Runnable) aVar.get();
            if (runnable instanceof Thread) {
                jj7.a aVar2 = new jj7.a(aVar);
                jj7.a.a(aVar2, Thread.currentThread());
                if (aVar.compareAndSet(runnable, aVar2)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) aVar.getAndSet(bVar2)) == bVar) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.W = null;
    }

    @Override // defpackage.j2
    public final String j() {
        a aVar = this.W;
        if (aVar == null) {
            return super.j();
        }
        return "task=[" + aVar + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        a aVar = this.W;
        if (aVar != null) {
            aVar.run();
        }
        this.W = null;
    }
}
