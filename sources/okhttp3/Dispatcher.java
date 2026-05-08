package okhttp3;

import defpackage.j6g;
import defpackage.ujg;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Dispatcher;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Dispatcher {
    public ThreadPoolExecutor b;
    public int a = 5;
    public final ArrayDeque<RealCall.AsyncCall> c = new ArrayDeque<>();
    public final ArrayDeque<RealCall.AsyncCall> d = new ArrayDeque<>();
    public final ArrayDeque<RealCall> e = new ArrayDeque<>();

    public final synchronized ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (this.b == null) {
                this.b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ujg(Util.g + " Dispatcher", false));
            }
            threadPoolExecutor = this.b;
            threadPoolExecutor.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public final void b(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            j6g j6gVar = j6g.a;
        }
        d();
    }

    public final void c(RealCall.AsyncCall asyncCall) {
        asyncCall.b.decrementAndGet();
        b(this.d, asyncCall);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r8 = this;
            byte[] r0 = okhttp3.internal.Util.a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r8)
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r1 = r8.c     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L42
            r1.getClass()     // Catch: java.lang.Throwable -> L42
        L11:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L44
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L42
            okhttp3.internal.connection.RealCall$AsyncCall r2 = (okhttp3.internal.connection.RealCall.AsyncCall) r2     // Catch: java.lang.Throwable -> L42
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r3 = r8.d     // Catch: java.lang.Throwable -> L42
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L42
            r4 = 64
            if (r3 >= r4) goto L44
            java.util.concurrent.atomic.AtomicInteger r3 = r2.b     // Catch: java.lang.Throwable -> L42
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L42
            int r4 = r8.a     // Catch: java.lang.Throwable -> L42
            if (r3 >= r4) goto L11
            r1.remove()     // Catch: java.lang.Throwable -> L42
            java.util.concurrent.atomic.AtomicInteger r3 = r2.b     // Catch: java.lang.Throwable -> L42
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L42
            r0.add(r2)     // Catch: java.lang.Throwable -> L42
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r3 = r8.d     // Catch: java.lang.Throwable -> L42
            r3.add(r2)     // Catch: java.lang.Throwable -> L42
            goto L11
        L42:
            r0 = move-exception
            goto L9f
        L44:
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L42
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r1 = r8.d     // Catch: java.lang.Throwable -> L9c
            r1.size()     // Catch: java.lang.Throwable -> L9c
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall> r1 = r8.e     // Catch: java.lang.Throwable -> L9c
            r1.size()     // Catch: java.lang.Throwable -> L9c
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L42
            j6g r1 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L42
            monitor-exit(r8)
            int r1 = r0.size()
            r2 = 0
        L58:
            if (r2 >= r1) goto L9b
            java.lang.Object r3 = r0.get(r2)
            okhttp3.internal.connection.RealCall$AsyncCall r3 = (okhttp3.internal.connection.RealCall.AsyncCall) r3
            java.util.concurrent.ExecutorService r4 = r8.a()
            r3.getClass()
            okhttp3.internal.connection.RealCall r5 = r3.c
            okhttp3.OkHttpClient r6 = r5.a
            okhttp3.Dispatcher r6 = r6.a
            byte[] r6 = okhttp3.internal.Util.a
            java.util.concurrent.ThreadPoolExecutor r4 = (java.util.concurrent.ThreadPoolExecutor) r4     // Catch: java.util.concurrent.RejectedExecutionException -> L75 java.lang.Throwable -> L92
            r4.execute(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L75 java.lang.Throwable -> L92
            goto L8f
        L75:
            r4 = move-exception
            java.io.InterruptedIOException r6 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L92
            java.lang.String r7 = "executor rejected"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L92
            r6.initCause(r4)     // Catch: java.lang.Throwable -> L92
            r5.i(r6)     // Catch: java.lang.Throwable -> L92
            okhttp3.Callback r4 = r3.a     // Catch: java.lang.Throwable -> L92
            r4.h(r5, r6)     // Catch: java.lang.Throwable -> L92
            okhttp3.OkHttpClient r4 = r5.a
            okhttp3.Dispatcher r4 = r4.a
            r4.c(r3)
        L8f:
            int r2 = r2 + 1
            goto L58
        L92:
            r8 = move-exception
            okhttp3.OkHttpClient r0 = r5.a
            okhttp3.Dispatcher r0 = r0.a
            r0.c(r3)
            throw r8
        L9b:
            return
        L9c:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L9c
            throw r0     // Catch: java.lang.Throwable -> L42
        L9f:
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Dispatcher.d():void");
    }
}
