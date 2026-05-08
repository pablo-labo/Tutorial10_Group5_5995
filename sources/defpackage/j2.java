package defpackage;

import com.google.j2objc.annotations.ReflectionSupport;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
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
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
@ReflectionSupport(ReflectionSupport.Level.FULL)
public abstract class j2<V> extends ti7 implements hz8<V> {
    public static final Object V;
    public static final boolean d;
    public static final vs8 e;
    public static final a f;
    public volatile Object a;
    public volatile d b;
    public volatile k c;

    public static abstract class a {
        public abstract boolean a(j2<?> j2Var, d dVar, d dVar2);

        public abstract boolean b(j2<?> j2Var, Object obj, Object obj2);

        public abstract boolean c(j2<?> j2Var, k kVar, k kVar2);

        public abstract d d(j2<?> j2Var, d dVar);

        public abstract k e(j2 j2Var);

        public abstract void f(k kVar, k kVar2);

        public abstract void g(k kVar, Thread thread);
    }

    public static final class b {
        public static final b c;
        public static final b d;
        public final boolean a;
        public final Throwable b;

        static {
            if (j2.d) {
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
            th.getClass();
            this.a = th;
        }
    }

    public static final class e extends a {
        public final AtomicReferenceFieldUpdater<k, Thread> a;
        public final AtomicReferenceFieldUpdater<k, k> b;
        public final AtomicReferenceFieldUpdater<? super j2<?>, k> c;
        public final AtomicReferenceFieldUpdater<? super j2<?>, d> d;
        public final AtomicReferenceFieldUpdater<? super j2<?>, Object> e;

        public e(AtomicReferenceFieldUpdater<k, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<k, k> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<? super j2<?>, k> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<? super j2<?>, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<? super j2<?>, Object> atomicReferenceFieldUpdater5) {
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // j2.a
        public final boolean a(j2<?> j2Var, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<? super j2<?>, d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.d;
                if (atomicReferenceFieldUpdater.compareAndSet(j2Var, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(j2Var) == dVar);
            return false;
        }

        @Override // j2.a
        public final boolean b(j2<?> j2Var, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<? super j2<?>, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.e;
                if (atomicReferenceFieldUpdater.compareAndSet(j2Var, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(j2Var) == obj);
            return false;
        }

        @Override // j2.a
        public final boolean c(j2<?> j2Var, k kVar, k kVar2) {
            AtomicReferenceFieldUpdater<? super j2<?>, k> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.c;
                if (atomicReferenceFieldUpdater.compareAndSet(j2Var, kVar, kVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(j2Var) == kVar);
            return false;
        }

        @Override // j2.a
        public final d d(j2<?> j2Var, d dVar) {
            return this.d.getAndSet(j2Var, dVar);
        }

        @Override // j2.a
        public final k e(j2 j2Var) {
            return this.c.getAndSet(j2Var, k.c);
        }

        @Override // j2.a
        public final void f(k kVar, k kVar2) {
            this.b.lazySet(kVar, kVar2);
        }

        @Override // j2.a
        public final void g(k kVar, Thread thread) {
            this.a.lazySet(kVar, thread);
        }
    }

    public static final class f<V> implements Runnable {
        public final ebe a;
        public final hz8<? extends V> b;

        public f(ebe ebeVar, hz8 hz8Var) {
            this.a = ebeVar;
            this.b = hz8Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.a.a != this) {
                return;
            }
            if (j2.f.b(this.a, this, j2.i(this.b))) {
                j2.f(this.a, false);
            }
        }
    }

    public static final class g extends a {
        @Override // j2.a
        public final boolean a(j2<?> j2Var, d dVar, d dVar2) {
            synchronized (j2Var) {
                try {
                    if (j2Var.b != dVar) {
                        return false;
                    }
                    j2Var.b = dVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // j2.a
        public final boolean b(j2<?> j2Var, Object obj, Object obj2) {
            synchronized (j2Var) {
                try {
                    if (j2Var.a != obj) {
                        return false;
                    }
                    j2Var.a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // j2.a
        public final boolean c(j2<?> j2Var, k kVar, k kVar2) {
            synchronized (j2Var) {
                try {
                    if (j2Var.c != kVar) {
                        return false;
                    }
                    j2Var.c = kVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // j2.a
        public final d d(j2<?> j2Var, d dVar) {
            d dVar2;
            synchronized (j2Var) {
                try {
                    dVar2 = j2Var.b;
                    if (dVar2 != dVar) {
                        j2Var.b = dVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return dVar2;
        }

        @Override // j2.a
        public final k e(j2 j2Var) {
            k kVar;
            k kVar2 = k.c;
            synchronized (j2Var) {
                try {
                    kVar = j2Var.c;
                    if (kVar != kVar2) {
                        j2Var.c = kVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return kVar;
        }

        @Override // j2.a
        public final void f(k kVar, k kVar2) {
            kVar.b = kVar2;
        }

        @Override // j2.a
        public final void g(k kVar, Thread thread) {
            kVar.a = thread;
        }
    }

    public interface h<V> extends hz8<V> {
    }

    public static abstract class i<V> extends j2<V> implements h<V> {
        @Override // defpackage.j2, java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.a instanceof b;
        }
    }

    public static final class j extends a {
        public static final Unsafe a;
        public static final long b;
        public static final long c;
        public static final long d;
        public static final long e;
        public static final long f;

        public class a implements PrivilegedExceptionAction<Unsafe> {
            public static Unsafe a() throws IllegalAccessException {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }

            @Override // java.security.PrivilegedExceptionAction
            public final /* bridge */ /* synthetic */ Unsafe run() {
                return a();
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e2) {
                    l6.p("Could not initialize intrinsics", e2.getCause());
                    return;
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                c = unsafe.objectFieldOffset(j2.class.getDeclaredField("c"));
                b = unsafe.objectFieldOffset(j2.class.getDeclaredField("b"));
                d = unsafe.objectFieldOffset(j2.class.getDeclaredField("a"));
                e = unsafe.objectFieldOffset(k.class.getDeclaredField("a"));
                f = unsafe.objectFieldOffset(k.class.getDeclaredField("b"));
                a = unsafe;
            } catch (NoSuchFieldException e3) {
                l5.r(e3);
            }
        }

        @Override // j2.a
        public final boolean a(j2<?> j2Var, d dVar, d dVar2) {
            return h2.a(a, j2Var, b, dVar, dVar2);
        }

        @Override // j2.a
        public final boolean b(j2<?> j2Var, Object obj, Object obj2) {
            return i2.a(a, j2Var, d, obj, obj2);
        }

        @Override // j2.a
        public final boolean c(j2<?> j2Var, k kVar, k kVar2) {
            return g2.a(a, j2Var, c, kVar, kVar2);
        }

        @Override // j2.a
        public final d d(j2<?> j2Var, d dVar) {
            d dVar2;
            do {
                dVar2 = j2Var.b;
                if (dVar == dVar2) {
                    break;
                }
            } while (!a(j2Var, dVar2, dVar));
            return dVar2;
        }

        @Override // j2.a
        public final k e(j2 j2Var) {
            k kVar;
            k kVar2 = k.c;
            do {
                kVar = j2Var.c;
                if (kVar2 == kVar) {
                    break;
                }
            } while (!c(j2Var, kVar, kVar2));
            return kVar;
        }

        @Override // j2.a
        public final void f(k kVar, k kVar2) {
            a.putObject(kVar, f, kVar2);
        }

        @Override // j2.a
        public final void g(k kVar, Thread thread) {
            a.putObject(kVar, e, thread);
        }
    }

    public static final class k {
        public static final k c = new k();
        public volatile Thread a;
        public volatile k b;

        public k() {
            j2.f.g(this, Thread.currentThread());
        }
    }

    static {
        boolean z;
        Throwable th;
        a gVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = new vs8(j2.class);
        Throwable th2 = null;
        try {
            gVar = new j();
            th = null;
        } catch (Error | Exception e2) {
            th = e2;
            try {
                gVar = new e(AtomicReferenceFieldUpdater.newUpdater(k.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(k.class, k.class, "b"), AtomicReferenceFieldUpdater.newUpdater(j2.class, k.class, "c"), AtomicReferenceFieldUpdater.newUpdater(j2.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(j2.class, Object.class, "a"));
            } catch (Error | Exception e3) {
                th2 = e3;
                gVar = new g();
            }
        }
        f = gVar;
        if (th2 != null) {
            vs8 vs8Var = e;
            Logger loggerA = vs8Var.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th);
            vs8Var.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        V = new Object();
    }

    public static void f(j2<?> j2Var, boolean z) {
        d dVar = null;
        while (true) {
            for (k kVarE = f.e(j2Var); kVarE != null; kVarE = kVarE.b) {
                Thread thread = kVarE.a;
                if (thread != null) {
                    kVarE.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                z = false;
            }
            j2Var.d();
            d dVar2 = dVar;
            d dVarD = f.d(j2Var, d.d);
            d dVar3 = dVar2;
            while (dVarD != null) {
                d dVar4 = dVarD.c;
                dVarD.c = dVar3;
                dVar3 = dVarD;
                dVarD = dVar4;
            }
            while (dVar3 != null) {
                dVar = dVar3.c;
                Runnable runnable = dVar3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof f) {
                    f fVar = (f) runnable;
                    j2Var = fVar.a;
                    if (j2Var.a == fVar) {
                        if (f.b(j2Var, fVar, i(fVar.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = dVar3.b;
                    Objects.requireNonNull(executor);
                    g(runnable, executor);
                }
                dVar3 = dVar;
            }
            return;
        }
    }

    public static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object h(Object obj) throws ExecutionException {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static Object i(hz8<?> hz8Var) {
        Object obj;
        Throwable thB;
        if (hz8Var instanceof h) {
            Object bVar = ((j2) hz8Var).a;
            if (bVar instanceof b) {
                b bVar2 = (b) bVar;
                if (bVar2.a) {
                    bVar = bVar2.b != null ? new b(bVar2.b, false) : b.d;
                }
            }
            Objects.requireNonNull(bVar);
            return bVar;
        }
        if ((hz8Var instanceof ti7) && (thB = ((ti7) hz8Var).b()) != null) {
            return new c(thB);
        }
        boolean zIsCancelled = hz8Var.isCancelled();
        boolean z = true;
        if ((!d) && zIsCancelled) {
            b bVar3 = b.d;
            Objects.requireNonNull(bVar3);
            return bVar3;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = hz8Var.get();
                        break;
                    } catch (Error | Exception e2) {
                        e = e2;
                        return new c(e);
                    } catch (CancellationException e3) {
                        if (zIsCancelled) {
                            return new b(e3, false);
                        }
                        return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + hz8Var, e3));
                    } catch (ExecutionException e4) {
                        if (!zIsCancelled) {
                            return new c(e4.getCause());
                        }
                        return new b(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + hz8Var, e4), false);
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error e5) {
                e = e5;
                return new c(e);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? V : obj;
        }
        return new b(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + hz8Var), false);
    }

    @Override // defpackage.hz8
    public void a(Runnable runnable, Executor executor) {
        d dVar;
        pnb.t(executor, "Executor was null.");
        if (!isDone() && (dVar = this.b) != d.d) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.c = dVar;
                if (f.a(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.b;
                }
            } while (dVar != d.d);
        }
        g(runnable, executor);
    }

    @Override // defpackage.ti7
    public final Throwable b() {
        if (!(this instanceof h)) {
            return null;
        }
        Object obj = this.a;
        if (obj instanceof c) {
            return ((c) obj).a;
        }
        return null;
    }

    public final void c(StringBuilder sb) {
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
                } catch (ExecutionException e2) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e2.getCause());
                    sb.append("]");
                    return;
                } catch (Exception e3) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e3.getClass());
                    sb.append(" thrown from get()]");
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
        e(sb, v);
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        b bVar;
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        if (d) {
            bVar = new b(new CancellationException("Future.cancel() was called."), z);
        } else {
            bVar = z ? b.c : b.d;
            Objects.requireNonNull(bVar);
        }
        boolean z2 = false;
        while (true) {
            if (f.b(this, obj, bVar)) {
                f(this, z);
                if (!(obj instanceof f)) {
                    break;
                }
                hz8<? extends V> hz8Var = ((f) obj).b;
                if (!(hz8Var instanceof h)) {
                    hz8Var.cancel(z);
                    break;
                }
                this = (j2) hz8Var;
                obj = this.a;
                if (!(obj == null) && !(obj instanceof f)) {
                    break;
                }
                z2 = true;
            } else {
                obj = this.a;
                if (!(obj instanceof f)) {
                    return z2;
                }
            }
        }
        return true;
    }

    public void d() {
    }

    public final void e(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public V get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        long j3;
        k kVar = k.c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if ((obj != null) && (!(obj instanceof f))) {
            return (V) h(obj);
        }
        long j4 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            k kVar2 = this.c;
            if (kVar2 != kVar) {
                k kVar3 = new k();
                z = true;
                while (true) {
                    a aVar = f;
                    aVar.f(kVar3, kVar2);
                    if (aVar.c(this, kVar2, kVar3)) {
                        j3 = j4;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                k(kVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return (V) h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        k(kVar3);
                    } else {
                        long j5 = j4;
                        kVar2 = this.c;
                        if (kVar2 == kVar) {
                            break;
                        }
                        j4 = j5;
                    }
                }
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return (V) h(obj3);
        }
        z = true;
        j3 = 0;
        while (nanos > j3) {
            Object obj4 = this.a;
            if ((obj4 != null ? z : false) && (!(obj4 instanceof f))) {
                return (V) h(obj4);
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
        StringBuilder sbI = w40.i(j2, "Waited ", " ");
        sbI.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbI.toString();
        if (nanos + 1000 < j3) {
            String strConcat = string3.concat(" (plus ");
            long j6 = -nanos;
            long jConvert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
            long nanos2 = j6 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == j3 || nanos2 > 1000) ? z : false;
            if (jConvert > j3) {
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
    public boolean isCancelled() {
        return this.a instanceof b;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r2 instanceof f)) & (this.a != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String j() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void k(k kVar) {
        kVar.a = null;
        while (true) {
            k kVar2 = this.c;
            if (kVar2 == k.c) {
                return;
            }
            k kVar3 = null;
            while (kVar2 != null) {
                k kVar4 = kVar2.b;
                if (kVar2.a != null) {
                    kVar3 = kVar2;
                } else if (kVar3 != null) {
                    kVar3.b = kVar4;
                    if (kVar3.a == null) {
                        break;
                    }
                } else if (!f.c(this, kVar2, kVar4)) {
                    break;
                }
                kVar2 = kVar4;
            }
            return;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean l(V v) {
        if (v == null) {
            v = (V) V;
        }
        if (!f.b(this, null, v)) {
            return false;
        }
        f(this, false);
        return true;
    }

    public boolean m(Throwable th) {
        if (!f.b(this, null, new c(th))) {
            return false;
        }
        f(this, false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j2.toString():java.lang.String");
    }

    public static final class d {
        public static final d d = new d();
        public final Runnable a;
        public final Executor b;
        public d c;

        public d() {
            this.a = null;
            this.b = null;
        }

        public d(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException {
        Object obj;
        k kVar = k.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return (V) h(obj2);
            }
            k kVar2 = this.c;
            if (kVar2 != kVar) {
                k kVar3 = new k();
                do {
                    a aVar = f;
                    aVar.f(kVar3, kVar2);
                    if (aVar.c(this, kVar2, kVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                k(kVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return (V) h(obj);
                    }
                    kVar2 = this.c;
                } while (kVar2 != kVar);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return (V) h(obj3);
        }
        throw new InterruptedException();
    }
}
