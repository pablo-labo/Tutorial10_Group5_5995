package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class a4<V> implements hz8<V> {
    public static final Object V;
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(a4.class.getName());
    public static final a f;
    public volatile Object a;
    public volatile d b;
    public volatile h c;

    public static abstract class a {
        public abstract boolean a(a4<?> a4Var, d dVar, d dVar2);

        public abstract boolean b(a4<?> a4Var, Object obj, Object obj2);

        public abstract boolean c(a4<?> a4Var, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    public static final class b {
        public static final b c;
        public static final b d;
        public final boolean a;
        public final Throwable b;

        static {
            if (a4.d) {
                d = null;
                c = null;
            } else {
                d = new b(null, false);
                c = new b(null, true);
            }
        }

        public b(Throwable th, boolean z) {
            this.a = z;
            this.b = th;
        }
    }

    public static final class c {
        public final Throwable a;

        public class a extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new c(new a("Failure occurred while trying to finish a future."));
        }

        public c(Throwable th) {
            boolean z = a4.d;
            th.getClass();
            this.a = th;
        }
    }

    public static final class d {
        public static final d d = new d(null, null);
        public final Runnable a;
        public final Executor b;
        public d c;

        public d(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }
    }

    public static final class e extends a {
        public final AtomicReferenceFieldUpdater<h, Thread> a;
        public final AtomicReferenceFieldUpdater<h, h> b;
        public final AtomicReferenceFieldUpdater<a4, h> c;
        public final AtomicReferenceFieldUpdater<a4, d> d;
        public final AtomicReferenceFieldUpdater<a4, Object> e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a4, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a4, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a4, Object> atomicReferenceFieldUpdater5) {
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // a4.a
        public final boolean a(a4<?> a4Var, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<a4, d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.d;
                if (atomicReferenceFieldUpdater.compareAndSet(a4Var, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(a4Var) == dVar);
            return false;
        }

        @Override // a4.a
        public final boolean b(a4<?> a4Var, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<a4, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.e;
                if (atomicReferenceFieldUpdater.compareAndSet(a4Var, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(a4Var) == obj);
            return false;
        }

        @Override // a4.a
        public final boolean c(a4<?> a4Var, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<a4, h> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.c;
                if (atomicReferenceFieldUpdater.compareAndSet(a4Var, hVar, hVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(a4Var) == hVar);
            return false;
        }

        @Override // a4.a
        public final void d(h hVar, h hVar2) {
            this.b.lazySet(hVar, hVar2);
        }

        @Override // a4.a
        public final void e(h hVar, Thread thread) {
            this.a.lazySet(hVar, thread);
        }
    }

    public static final class f<V> implements Runnable {
    }

    public static final class g extends a {
        @Override // a4.a
        public final boolean a(a4<?> a4Var, d dVar, d dVar2) {
            synchronized (a4Var) {
                try {
                    if (a4Var.b != dVar) {
                        return false;
                    }
                    a4Var.b = dVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // a4.a
        public final boolean b(a4<?> a4Var, Object obj, Object obj2) {
            synchronized (a4Var) {
                try {
                    if (a4Var.a != obj) {
                        return false;
                    }
                    a4Var.a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // a4.a
        public final boolean c(a4<?> a4Var, h hVar, h hVar2) {
            synchronized (a4Var) {
                try {
                    if (a4Var.c != hVar) {
                        return false;
                    }
                    a4Var.c = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // a4.a
        public final void d(h hVar, h hVar2) {
            hVar.b = hVar2;
        }

        @Override // a4.a
        public final void e(h hVar, Thread thread) {
            hVar.a = thread;
        }
    }

    public static final class h {
        public static final h c = new h();
        public volatile Thread a;
        public volatile h b;

        public h() {
            a4.f.e(this, Thread.currentThread());
        }
    }

    static {
        a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a4.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a4.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a4.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f = gVar;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        V = new Object();
    }

    public static void f(a4<?> a4Var) {
        h hVar;
        d dVar;
        do {
            hVar = a4Var.c;
        } while (!f.c(a4Var, hVar, h.c));
        while (hVar != null) {
            Thread thread = hVar.a;
            if (thread != null) {
                hVar.a = null;
                LockSupport.unpark(thread);
            }
            hVar = hVar.b;
        }
        a4Var.e();
        do {
            dVar = a4Var.b;
        } while (!f.a(a4Var, dVar, d.d));
        d dVar2 = null;
        while (dVar != null) {
            d dVar3 = dVar.c;
            dVar.c = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        while (dVar2 != null) {
            d dVar4 = dVar2.c;
            Runnable runnable = dVar2.a;
            if (runnable instanceof f) {
                throw null;
            }
            h(runnable, dVar2.b);
            dVar2 = dVar4;
        }
    }

    public static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object m(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            Throwable th = ((b) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).a);
        }
        if (obj == V) {
            return null;
        }
        return obj;
    }

    public static Object n(a4 a4Var) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = a4Var.get();
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
        return obj;
    }

    @Override // defpackage.hz8
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.b;
        d dVar2 = d.d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.c = dVar;
                if (f.a(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.b;
                }
            } while (dVar != dVar2);
        }
        h(runnable, executor);
    }

    public final void c(StringBuilder sb) {
        try {
            Object objN = n(this);
            sb.append("SUCCESS, result=[");
            sb.append(objN == this ? "this future" : String.valueOf(objN));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.a;
        if ((obj == null) | (obj instanceof f)) {
            b bVar = d ? new b(new CancellationException("Future.cancel() was called."), z) : z ? b.c : b.d;
            while (!f.b(this, obj, bVar)) {
                obj = this.a;
                if (!(obj instanceof f)) {
                }
            }
            f(this);
            if (obj instanceof f) {
                throw null;
            }
            return true;
        }
        return false;
    }

    public void e() {
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        h hVar = h.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if ((obj != null) && (!(obj instanceof f))) {
            return (V) m(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar2 = this.c;
            if (hVar2 != hVar) {
                h hVar3 = new h();
                z = true;
                do {
                    a aVar = f;
                    aVar.d(hVar3, hVar2);
                    if (aVar.c(this, hVar2, hVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                p(hVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return (V) m(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        p(hVar3);
                    } else {
                        hVar2 = this.c;
                    }
                } while (hVar2 != hVar);
            }
            return (V) m(this.a);
        }
        z = true;
        while (nanos > 0) {
            Object obj3 = this.a;
            if ((obj3 != null ? z : false) && (!(obj3 instanceof f))) {
                return (V) m(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbI = w40.i(j, "Waited ", " ");
        sbI.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbI.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == 0 || nanos2 > 1000) ? z : false;
            if (jConvert > 0) {
                String strConcat2 = strConcat + jConvert + " " + lowerCase;
                if (z2) {
                    strConcat2 = strConcat2.concat(",");
                }
                strConcat = strConcat2.concat(" ");
            }
            if (z2) {
                strConcat = strConcat + nanos2 + " nanoseconds ";
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(z3.m(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r2 instanceof f)) & (this.a != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String o() {
        if (this.a instanceof f) {
            return l5.m("setFuture=[", "null", "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void p(h hVar) {
        hVar.a = null;
        while (true) {
            h hVar2 = this.c;
            if (hVar2 == h.c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.b;
                if (hVar2.a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.b = hVar4;
                    if (hVar3.a == null) {
                        break;
                    }
                } else if (!f.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    public final String toString() {
        String strO;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof b) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            c(sb);
        } else {
            try {
                strO = o();
            } catch (RuntimeException e2) {
                strO = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strO != null && !strO.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strO);
                sb.append("]");
            } else if (isDone()) {
                c(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException {
        Object obj;
        h hVar = h.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return (V) m(obj2);
            }
            h hVar2 = this.c;
            if (hVar2 != hVar) {
                h hVar3 = new h();
                do {
                    a aVar = f;
                    aVar.d(hVar3, hVar2);
                    if (aVar.c(this, hVar2, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                p(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return (V) m(obj);
                    }
                    hVar2 = this.c;
                } while (hVar2 != hVar);
            }
            return (V) m(this.a);
        }
        throw new InterruptedException();
    }
}
