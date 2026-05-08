package defpackage;

import com.datadog.android.api.InternalLogger;
import defpackage.vc2;
import java.io.Closeable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class x7b extends LinkedList<rc3> {
    public static final AtomicReference<a> a = new AtomicReference<>();
    private final InternalLogger internalLogger;
    private final BigInteger traceId;
    private final uc3 tracer;
    private final ReferenceQueue referenceQueue = new ReferenceQueue();
    private final Set<WeakReference<?>> weakReferences = Collections.newSetFromMap(new ConcurrentHashMap());
    private final AtomicInteger pendingReferenceCount = new AtomicInteger(0);
    private final AtomicInteger completedSpanCount = new AtomicInteger(0);
    private final AtomicReference<WeakReference<rc3>> rootSpan = new AtomicReference<>();
    private final AtomicBoolean isWritten = new AtomicBoolean(false);
    private final long startTimeNano = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    private final long startNanoTicks = System.nanoTime();

    public static class a implements Runnable, Closeable {
        public final Set<x7b> a = Collections.newSetFromMap(new ConcurrentHashMap());

        public a() {
            vc2 vc2Var = vc2.b;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            vc2Var.getClass();
            if (vc2Var.a.isShutdown()) {
                return;
            }
            try {
                new WeakReference(this);
                vc2Var.a.scheduleWithFixedDelay(new vc2.a(this), 0L, 1L, timeUnit);
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            run();
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator<x7b> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().q();
            }
        }
    }

    public static class b {
        public static final b a = new b();
    }

    public x7b(uc3 uc3Var, BigInteger bigInteger, InternalLogger internalLogger) {
        this.tracer = uc3Var;
        this.traceId = bigInteger;
        this.internalLogger = internalLogger;
        a aVar = a.get();
        if (aVar != null) {
            aVar.a.add(this);
        }
    }

    public static String c(x7b x7bVar, rc3 rc3Var, BigInteger bigInteger) {
        return "Span " + rc3Var.b.j + " not registered because of traceId mismatch; spanId:" + rc3Var.b.e + " span.traceid:" + bigInteger + " traceid:" + x7bVar.traceId;
    }

    public static String d(x7b x7bVar, rc3 rc3Var) {
        return "Span " + rc3Var.b.j + " not expired because it's not registered; spanId:" + rc3Var.b.e + " traceid:" + x7bVar.traceId;
    }

    public static String e(x7b x7bVar, rc3 rc3Var) {
        return "Span " + rc3Var.b.j + " not registered because of null traceId or context; spanId:" + rc3Var.b.e + " traceid:" + x7bVar.traceId;
    }

    public static String f(x7b x7bVar, rc3 rc3Var) {
        x7bVar.getClass();
        return "Span " + rc3Var.b.j + " not added because of null traceId or context; spanId:" + rc3Var.b.e + " traceid:" + x7bVar.traceId;
    }

    public static String g(x7b x7bVar, rc3 rc3Var) {
        return "Span " + rc3Var.b.j + " not registered because it is already registered; spanId:" + rc3Var.b.e + " traceid:" + x7bVar.traceId;
    }

    public static /* synthetic */ String i(x7b x7bVar) {
        return "Trace " + x7bVar.traceId + " write ignored: isWritten already true";
    }

    public static String j(x7b x7bVar, rc3 rc3Var, BigInteger bigInteger) {
        return "Span " + rc3Var.b.j + " not expired because of traceId mismatch; spanId:" + rc3Var.b.e + " span.traceid:" + bigInteger + " traceid:" + x7bVar.traceId;
    }

    public static String k(x7b x7bVar, rc3 rc3Var) {
        x7bVar.getClass();
        return "Span " + rc3Var.b.j + " not added because trace already written; spanId:" + rc3Var.b.e + " traceid:" + x7bVar.traceId;
    }

    public static String l(x7b x7bVar, rc3 rc3Var) {
        return "Span " + rc3Var.b.j + " not expired because of null traceId or context; spanId:" + rc3Var.b.e + " traceid:" + x7bVar.traceId;
    }

    public static String m(x7b x7bVar, rc3 rc3Var) {
        x7bVar.getClass();
        return "Span " + rc3Var.b.j + " not added because of traceId mismatch; spanId:" + rc3Var.b.e + " traceid:" + x7bVar.traceId;
    }

    public static String n(x7b x7bVar, rc3 rc3Var) {
        x7bVar.getClass();
        return "Span " + rc3Var.b.j + " not added because duration is zero; spanId:" + rc3Var.b.e + " traceid:" + x7bVar.traceId;
    }

    @Override // java.util.LinkedList, java.util.Deque
    public final void addFirst(Object obj) {
        rc3 rc3Var = (rc3) obj;
        synchronized (this) {
            super.addFirst(rc3Var);
        }
        this.completedSpanCount.incrementAndGet();
    }

    public final void o(rc3 rc3Var) {
        sc3 sc3Var;
        synchronized (this) {
            try {
                if (rc3Var.e.get() == 0) {
                    this.internalLogger.log(InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5<String>) new ro2(6, this, rc3Var), (Throwable) null, false, (Map<String, ? extends Object>) new HashMap());
                    return;
                }
                BigInteger bigInteger = this.traceId;
                if (bigInteger != null && (sc3Var = rc3Var.b) != null) {
                    if (!bigInteger.equals(sc3Var.d)) {
                        this.internalLogger.log(InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5<String>) new yp0(8, this, rc3Var), (Throwable) null, false, (Map<String, ? extends Object>) new HashMap());
                        return;
                    }
                    if (this.isWritten.get()) {
                        this.internalLogger.log(InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5<String>) new qe(12, this, rc3Var), (Throwable) null, false, (Map<String, ? extends Object>) new HashMap());
                    } else {
                        synchronized (this) {
                            super.addFirst(rc3Var);
                            this.completedSpanCount.incrementAndGet();
                        }
                    }
                    t(rc3Var, true);
                    return;
                }
                this.internalLogger.log(InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5<String>) new q61(7, this, rc3Var), (Throwable) null, false, (Map<String, ? extends Object>) new HashMap());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void q() {
        while (true) {
            try {
                Reference referencePoll = this.referenceQueue.poll();
                if (referencePoll != null) {
                    this.weakReferences.remove(referencePoll);
                    if (this.isWritten.compareAndSet(false, true)) {
                        a aVar = a.get();
                        if (aVar != null) {
                            aVar.a.remove(this);
                        }
                        this.tracer.incrementTraceCount();
                    }
                    r();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        if (this.pendingReferenceCount.decrementAndGet() == 0) {
            synchronized (this) {
                try {
                    if (this.isWritten.compareAndSet(false, true)) {
                        a aVar = a.get();
                        if (aVar != null) {
                            aVar.a.remove(this);
                        }
                        if (!isEmpty()) {
                            this.tracer.write(this);
                        }
                    } else {
                        this.internalLogger.log(InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5<String>) new zh(this, 17), (Throwable) null, false, (Map<String, ? extends Object>) new HashMap());
                    }
                } finally {
                }
            }
            return;
        }
        if (this.tracer.getPartialFlushMinSpans() <= 0 || this.completedSpanCount.get() <= this.tracer.getPartialFlushMinSpans()) {
            return;
        }
        synchronized (this) {
            try {
                if (this.completedSpanCount.get() > this.tracer.getPartialFlushMinSpans()) {
                    rc3 rc3VarW = w();
                    ArrayList arrayList = new ArrayList(this.completedSpanCount.get());
                    Iterator<rc3> it = iterator();
                    while (it.hasNext()) {
                        rc3 next = it.next();
                        if (next != rc3VarW) {
                            arrayList.add(next);
                            this.completedSpanCount.decrementAndGet();
                            it.remove();
                        }
                    }
                    this.tracer.write(arrayList);
                }
            } finally {
            }
        }
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final int size() {
        return this.completedSpanCount.get();
    }

    public final void t(rc3 rc3Var, boolean z) {
        sc3 sc3Var;
        BigInteger bigInteger = this.traceId;
        if (bigInteger == null || (sc3Var = rc3Var.b) == null) {
            this.internalLogger.log(InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5<String>) new ai(7, this, rc3Var), (Throwable) null, false, (Map<String, ? extends Object>) new HashMap());
            return;
        }
        BigInteger bigInteger2 = sc3Var.d;
        if (!bigInteger.equals(bigInteger2)) {
            this.internalLogger.log(InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5<String>) new wf4(3, this, rc3Var, bigInteger2), (Throwable) null, false, (Map<String, ? extends Object>) new HashMap());
            return;
        }
        synchronized (rc3Var) {
            try {
                if (rc3Var.g == null) {
                    this.internalLogger.log(InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5<String>) new x9(14, this, rc3Var), (Throwable) null, false, (Map<String, ? extends Object>) new HashMap());
                    return;
                }
                this.weakReferences.remove(rc3Var.g);
                rc3Var.g.clear();
                rc3Var.g = null;
                if (z) {
                    r();
                } else {
                    this.pendingReferenceCount.decrementAndGet();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final long u() {
        return Math.max(0L, System.nanoTime() - this.startNanoTicks) + this.startTimeNano;
    }

    public final rc3 w() {
        WeakReference<rc3> weakReference = this.rootSpan.get();
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final void x(rc3 rc3Var) {
        sc3 sc3Var;
        BigInteger bigInteger = this.traceId;
        if (bigInteger == null || (sc3Var = rc3Var.b) == null) {
            this.internalLogger.log(InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5<String>) new qj(10, this, rc3Var), (Throwable) null, false, (Map<String, ? extends Object>) new HashMap());
            return;
        }
        BigInteger bigInteger2 = sc3Var.d;
        if (!bigInteger.equals(bigInteger2)) {
            this.internalLogger.log(InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5<String>) new q6a(1, this, rc3Var, bigInteger2), (Throwable) null, false, (Map<String, ? extends Object>) new HashMap());
            return;
        }
        AtomicReference<WeakReference<rc3>> atomicReference = this.rootSpan;
        WeakReference<rc3> weakReference = new WeakReference<>(rc3Var);
        while (!atomicReference.compareAndSet(null, weakReference) && atomicReference.get() == null) {
        }
        synchronized (rc3Var) {
            try {
                if (rc3Var.g == null) {
                    rc3Var.g = new WeakReference<>(rc3Var, this.referenceQueue);
                    this.weakReferences.add(rc3Var.g);
                    this.pendingReferenceCount.incrementAndGet();
                } else {
                    this.internalLogger.log(InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5<String>) new qv(8, this, rc3Var), (Throwable) null, false, (Map<String, ? extends Object>) new HashMap());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
