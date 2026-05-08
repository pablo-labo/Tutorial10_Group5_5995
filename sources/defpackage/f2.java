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
public abstract class f2<V> implements hz8<V> {
    public static final Object V;
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(f2.class.getName());
    public static final a f;
    public volatile Object a;
    public volatile d b;
    public volatile h c;

    public static abstract class a {
        public abstract boolean a(f2<?> f2Var, d dVar, d dVar2);

        public abstract boolean b(f2<?> f2Var, Object obj, Object obj2);

        public abstract boolean c(f2<?> f2Var, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    public static final class b {
        public static final b c;
        public static final b d;
        public final boolean a;
        public final Throwable b;

        static {
            if (f2.d) {
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
        public static final c b = new c(new a("Failure occurred while trying to finish a future."));
        public final Throwable a;

        public class a extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public c(Throwable th) {
            boolean z = f2.d;
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
        public final AtomicReferenceFieldUpdater<f2, h> c;
        public final AtomicReferenceFieldUpdater<f2, d> d;
        public final AtomicReferenceFieldUpdater<f2, Object> e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<f2, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<f2, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<f2, Object> atomicReferenceFieldUpdater5) {
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // f2.a
        public final boolean a(f2<?> f2Var, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<f2, d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.d;
                if (atomicReferenceFieldUpdater.compareAndSet(f2Var, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(f2Var) == dVar);
            return false;
        }

        @Override // f2.a
        public final boolean b(f2<?> f2Var, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<f2, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.e;
                if (atomicReferenceFieldUpdater.compareAndSet(f2Var, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(f2Var) == obj);
            return false;
        }

        @Override // f2.a
        public final boolean c(f2<?> f2Var, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<f2, h> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.c;
                if (atomicReferenceFieldUpdater.compareAndSet(f2Var, hVar, hVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(f2Var) == hVar);
            return false;
        }

        @Override // f2.a
        public final void d(h hVar, h hVar2) {
            this.b.lazySet(hVar, hVar2);
        }

        @Override // f2.a
        public final void e(h hVar, Thread thread) {
            this.a.lazySet(hVar, thread);
        }
    }

    public static final class f<V> implements Runnable {
        public final fbe a;
        public final hz8<? extends V> b;

        public f(fbe fbeVar, hz8 hz8Var) {
            this.a = fbeVar;
            this.b = hz8Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.a.a != this) {
                return;
            }
            if (f2.f.b(this.a, this, f2.f(this.b))) {
                f2.c(this.a);
            }
        }
    }

    public static final class g extends a {
        @Override // f2.a
        public final boolean a(f2<?> f2Var, d dVar, d dVar2) {
            synchronized (f2Var) {
                try {
                    if (f2Var.b != dVar) {
                        return false;
                    }
                    f2Var.b = dVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // f2.a
        public final boolean b(f2<?> f2Var, Object obj, Object obj2) {
            synchronized (f2Var) {
                try {
                    if (f2Var.a != obj) {
                        return false;
                    }
                    f2Var.a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // f2.a
        public final boolean c(f2<?> f2Var, h hVar, h hVar2) {
            synchronized (f2Var) {
                try {
                    if (f2Var.c != hVar) {
                        return false;
                    }
                    f2Var.c = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // f2.a
        public final void d(h hVar, h hVar2) {
            hVar.b = hVar2;
        }

        @Override // f2.a
        public final void e(h hVar, Thread thread) {
            hVar.a = thread;
        }
    }

    public static final class h {
        public static final h c = new h();
        public volatile Thread a;
        public volatile h b;

        public h() {
            f2.f.e(this, Thread.currentThread());
        }
    }

    static {
        a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(f2.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(f2.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(f2.class, Object.class, "a"));
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

    public static void c(f2<?> f2Var) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = f2Var.c;
            if (f.c(f2Var, hVar, h.c)) {
                while (hVar != null) {
                    Thread thread = hVar.a;
                    if (thread != null) {
                        hVar.a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.b;
                }
                do {
                    dVar = f2Var.b;
                } while (!f.a(f2Var, dVar, d.d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.c;
                    dVar3.c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.c;
                    Runnable runnable = dVar2.a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        f2Var = fVar.a;
                        if (f2Var.a == fVar) {
                            if (f.b(f2Var, fVar, f(fVar.b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, dVar2.b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
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

    public static Object f(hz8<?> hz8Var) {
        Object obj;
        if (hz8Var instanceof f2) {
            Object obj2 = ((f2) hz8Var).a;
            if (!(obj2 instanceof b)) {
                return obj2;
            }
            b bVar = (b) obj2;
            return bVar.a ? bVar.b != null ? new b(bVar.b, false) : b.d : obj2;
        }
        boolean zIsCancelled = hz8Var.isCancelled();
        boolean z = true;
        if ((!d) && zIsCancelled) {
            return b.d;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = hz8Var.get();
                    break;
                } catch (CancellationException e2) {
                    if (zIsCancelled) {
                        return new b(e2, false);
                    }
                    return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + hz8Var, e2));
                } catch (ExecutionException e3) {
                    return new c(e3.getCause());
                } catch (Throwable th) {
                    return new c(th);
                }
            } catch (InterruptedException unused) {
                z2 = z;
            } catch (Throwable th2) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? V : obj;
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
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        V v;
        boolean z = false;
        while (true) {
            try {
                try {
                    v = get();
                    break;
                } catch (CancellationException unused) {
                    sb.append("CANCELLED");
                    return;
                } catch (RuntimeException e2) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e2.getClass());
                    sb.append(" thrown from get()]");
                    return;
                } catch (ExecutionException e3) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e3.getCause());
                    sb.append("]");
                    return;
                }
            } catch (InterruptedException unused2) {
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
        sb.append("SUCCESS, result=[");
        sb.append(v == this ? "this future" : String.valueOf(v));
        sb.append("]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean cancel(boolean r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            boolean r4 = r0 instanceof f2.f
            r3 = r3 | r4
            if (r3 == 0) goto L59
            boolean r3 = defpackage.f2.d
            if (r3 == 0) goto L1f
            f2$b r3 = new f2$b
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r4, r7)
            goto L26
        L1f:
            if (r7 == 0) goto L24
            f2$b r3 = f2.b.c
            goto L26
        L24:
            f2$b r3 = f2.b.d
        L26:
            r4 = r2
        L27:
            f2$a r5 = defpackage.f2.f
            boolean r5 = r5.b(r6, r0, r3)
            if (r5 == 0) goto L52
            c(r6)
            boolean r6 = r0 instanceof f2.f
            if (r6 == 0) goto L51
            f2$f r0 = (f2.f) r0
            hz8<? extends V> r6 = r0.b
            boolean r0 = r6 instanceof defpackage.f2
            if (r0 == 0) goto L4e
            f2 r6 = (defpackage.f2) r6
            java.lang.Object r0 = r6.a
            if (r0 != 0) goto L46
            r4 = r1
            goto L47
        L46:
            r4 = r2
        L47:
            boolean r5 = r0 instanceof f2.f
            r4 = r4 | r5
            if (r4 == 0) goto L51
            r4 = r1
            goto L27
        L4e:
            r6.cancel(r7)
        L51:
            return r1
        L52:
            java.lang.Object r0 = r6.a
            boolean r5 = r0 instanceof f2.f
            if (r5 != 0) goto L27
            return r4
        L59:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f2.cancel(boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String g() {
        Object obj = this.a;
        if (obj instanceof f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            hz8<? extends V> hz8Var = ((f) obj).b;
            return l6.i(sb, hz8Var == this ? "this future" : String.valueOf(hz8Var), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
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
            return (V) e(obj);
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
                                h(hVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return (V) e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(hVar3);
                    } else {
                        hVar2 = this.c;
                    }
                } while (hVar2 != hVar);
            }
            return (V) e(this.a);
        }
        z = true;
        while (nanos > 0) {
            Object obj3 = this.a;
            if ((obj3 != null ? z : false) && (!(obj3 instanceof f))) {
                return (V) e(obj3);
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

    public final void h(h hVar) {
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

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r2 instanceof f)) & (this.a != null);
    }

    public final String toString() {
        String strG;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof b) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                strG = g();
            } catch (RuntimeException e2) {
                strG = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strG != null && !strG.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strG);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
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
                return (V) e(obj2);
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
                                h(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return (V) e(obj);
                    }
                    hVar2 = this.c;
                } while (hVar2 != hVar);
            }
            return (V) e(this.a);
        }
        throw new InterruptedException();
    }
}
