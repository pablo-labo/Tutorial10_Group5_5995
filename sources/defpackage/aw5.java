package defpackage;

import defpackage.jz9;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public final class aw5 extends ka6 {

    public static final class a<V> implements Runnable {
        public final Future<V> a;
        public final yv5<? super V> b;

        public a(hz8 hz8Var, yv5 yv5Var) {
            this.a = hz8Var;
            this.b = yv5Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Throwable thB;
            Future<V> future = this.a;
            boolean z = future instanceof ti7;
            yv5<? super V> yv5Var = this.b;
            if (z && (thB = ((ti7) future).b()) != null) {
                yv5Var.t(thB);
                return;
            }
            try {
                yv5Var.onSuccess((Object) aw5.J1(future));
            } catch (ExecutionException e) {
                yv5Var.t(e.getCause());
            } catch (Throwable th) {
                yv5Var.t(th);
            }
        }

        public final String toString() {
            jz9 jz9Var = new jz9(a.class.getSimpleName());
            jz9.a aVar = new jz9.a();
            jz9Var.c.b = aVar;
            jz9Var.c = aVar;
            aVar.a = this.b;
            return jz9Var.toString();
        }
    }

    public static <V> V J1(Future<V> future) {
        V v;
        if (!future.isDone()) {
            r6.g(hh1.H("Future was expected to be done: %s", future));
            return null;
        }
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    public static u37 K1(Object obj) {
        return obj == null ? u37.b : new u37(obj);
    }
}
