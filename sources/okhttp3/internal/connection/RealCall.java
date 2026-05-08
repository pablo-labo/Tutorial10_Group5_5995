package okhttp3.internal.connection;

import defpackage.boa;
import defpackage.j6g;
import defpackage.r6;
import defpackage.vv0;
import defpackage.w92;
import defpackage.wl7;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/RealCall;", "Lokhttp3/Call;", "AsyncCall", "CallReference", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RealCall implements Call {
    public final AtomicBoolean V;
    public Object W;
    public ExchangeFinder X;
    public RealConnection Y;
    public boolean Z;
    public final OkHttpClient a;
    public Exchange a0;
    public final Request b;
    public boolean b0;
    public final boolean c;
    public boolean c0;
    public final RealConnectionPool d;
    public boolean d0;
    public final EventListener e;
    public volatile boolean e0;
    public final RealCall$timeout$1 f;
    public volatile Exchange f0;
    public volatile RealConnection g0;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/RealCall$AsyncCall;", "Ljava/lang/Runnable;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class AsyncCall implements Runnable {
        public final Callback a;
        public volatile AtomicInteger b;
        public final /* synthetic */ RealCall c;

        public AsyncCall(RealCall realCall, Callback callback) {
            callback.getClass();
            this.c = realCall;
            this.a = callback;
            this.b = new AtomicInteger(0);
        }

        @Override // java.lang.Runnable
        public final void run() {
            OkHttpClient okHttpClient;
            String strConcat = "OkHttp ".concat(this.c.b.a.g());
            RealCall realCall = this.c;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(strConcat);
            try {
                realCall.f.i();
                boolean z = false;
                try {
                    try {
                        try {
                            this.a.p(realCall, realCall.g());
                            okHttpClient = realCall.a;
                        } catch (IOException e) {
                            e = e;
                            z = true;
                            if (z) {
                                Platform.a.getClass();
                                Platform platform = Platform.b;
                                String strConcat2 = "Callback failure for ".concat(RealCall.c(realCall));
                                platform.getClass();
                                Platform.i(4, strConcat2, e);
                            } else {
                                this.a.h(realCall, e);
                            }
                            okHttpClient = realCall.a;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            realCall.cancel();
                            if (!z) {
                                IOException iOException = new IOException("canceled due to " + th);
                                boa.h(iOException, th);
                                this.a.h(realCall, iOException);
                            }
                            throw th;
                        }
                    } catch (IOException e2) {
                        e = e2;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    okHttpClient.a.c(this);
                } catch (Throwable th3) {
                    realCall.a.a.c(this);
                    throw th3;
                }
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/connection/RealCall$CallReference;", "Ljava/lang/ref/WeakReference;", "Lokhttp3/internal/connection/RealCall;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CallReference extends WeakReference<RealCall> {
        public final Object a;

        public CallReference(RealCall realCall, Object obj) {
            super(realCall);
            this.a = obj;
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [kmf, okhttp3.internal.connection.RealCall$timeout$1] */
    public RealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        okHttpClient.getClass();
        request.getClass();
        this.a = okHttpClient;
        this.b = request;
        this.c = z;
        this.d = okHttpClient.b.a;
        EventListener eventListener = (EventListener) okHttpClient.e.b;
        byte[] bArr = Util.a;
        eventListener.getClass();
        this.e = eventListener;
        ?? r4 = new vv0() { // from class: okhttp3.internal.connection.RealCall$timeout$1
            @Override // defpackage.vv0
            public final void k() {
                this.m.cancel();
            }
        };
        r4.g(okHttpClient.m0, TimeUnit.MILLISECONDS);
        this.f = r4;
        this.V = new AtomicBoolean();
        this.d0 = true;
    }

    public static final String c(RealCall realCall) {
        StringBuilder sb = new StringBuilder();
        sb.append(realCall.e0 ? "canceled " : "");
        sb.append(realCall.c ? "web socket" : "call");
        sb.append(" to ");
        sb.append(realCall.b.a.g());
        return sb.toString();
    }

    @Override // okhttp3.Call
    public final void R0(Callback callback) {
        AsyncCall next;
        callback.getClass();
        if (!this.V.compareAndSet(false, true)) {
            r6.g("Already Executed");
            return;
        }
        Platform.a.getClass();
        this.W = Platform.b.g();
        this.e.callStart(this);
        Dispatcher dispatcher = this.a.a;
        AsyncCall asyncCall = new AsyncCall(this, callback);
        dispatcher.getClass();
        synchronized (dispatcher) {
            dispatcher.c.add(asyncCall);
            if (!this.c) {
                String str = this.b.a.d;
                Iterator<AsyncCall> it = dispatcher.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator<AsyncCall> it2 = dispatcher.c.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = it2.next();
                                if (wl7.b(next.c.b.a.d, str)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        next = it.next();
                        if (wl7.b(next.c.b.a.d, str)) {
                            break;
                        }
                    }
                }
                if (next != null) {
                    asyncCall.b = next.b;
                }
            }
            j6g j6gVar = j6g.a;
        }
        dispatcher.d();
    }

    @Override // okhttp3.Call
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Request getB() {
        return this.b;
    }

    @Override // okhttp3.Call
    public final Response b() {
        if (!this.V.compareAndSet(false, true)) {
            r6.g("Already Executed");
            return null;
        }
        i();
        Platform.a.getClass();
        this.W = Platform.b.g();
        this.e.callStart(this);
        try {
            Dispatcher dispatcher = this.a.a;
            synchronized (dispatcher) {
                dispatcher.e.add(this);
            }
            return g();
        } finally {
            Dispatcher dispatcher2 = this.a.a;
            dispatcher2.getClass();
            dispatcher2.b(dispatcher2.e, this);
        }
    }

    @Override // okhttp3.Call
    public final void cancel() {
        Socket socket;
        if (this.e0) {
            return;
        }
        this.e0 = true;
        Exchange exchange = this.f0;
        if (exchange != null) {
            exchange.d.cancel();
        }
        RealConnection realConnection = this.g0;
        if (realConnection != null && (socket = realConnection.c) != null) {
            Util.d(socket);
        }
        this.e.canceled(this);
    }

    public final Object clone() {
        return new RealCall(this.a, this.b, this.c);
    }

    public final void d(RealConnection realConnection) {
        byte[] bArr = Util.a;
        if (this.Y != null) {
            r6.g("Check failed.");
        } else {
            this.Y = realConnection;
            realConnection.p.add(new CallReference(this, this.W));
        }
    }

    public final <E extends IOException> E e(E e) {
        E interruptedIOException;
        Socket socketJ;
        byte[] bArr = Util.a;
        RealConnection realConnection = this.Y;
        if (realConnection != null) {
            synchronized (realConnection) {
                socketJ = j();
            }
            if (this.Y == null) {
                if (socketJ != null) {
                    Util.d(socketJ);
                }
                this.e.connectionReleased(this, realConnection);
            } else if (socketJ != null) {
                r6.g("Check failed.");
                return null;
            }
        }
        if (!this.Z && j()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (e != null) {
                interruptedIOException.initCause(e);
            }
        } else {
            interruptedIOException = e;
        }
        EventListener eventListener = this.e;
        if (e == null) {
            eventListener.callEnd(this);
            return interruptedIOException;
        }
        interruptedIOException.getClass();
        eventListener.callFailed(this, interruptedIOException);
        return interruptedIOException;
    }

    public final void f(boolean z) {
        Exchange exchange;
        synchronized (this) {
            if (!this.d0) {
                throw new IllegalStateException("released");
            }
            j6g j6gVar = j6g.a;
        }
        if (z && (exchange = this.f0) != null) {
            exchange.d.cancel();
            exchange.a.h(exchange, true, true, null);
        }
        this.a0 = null;
    }

    public final Response g() {
        ArrayList arrayList = new ArrayList();
        w92.w0(arrayList, this.a.c);
        arrayList.add(new RetryAndFollowUpInterceptor(this.a));
        arrayList.add(new BridgeInterceptor(this.a.Y));
        arrayList.add(new CacheInterceptor(this.a.Z));
        arrayList.add(ConnectInterceptor.a);
        if (!this.c) {
            w92.w0(arrayList, this.a.d);
        }
        arrayList.add(new CallServerInterceptor(this.c));
        Request request = this.b;
        OkHttpClient okHttpClient = this.a;
        try {
            try {
                Response responseB = new RealInterceptorChain(this, arrayList, 0, null, request, okHttpClient.n0, okHttpClient.o0, okHttpClient.p0).b(this.b);
                if (this.e0) {
                    Util.c(responseB);
                    throw new IOException("Canceled");
                }
                i(null);
                return responseB;
            } catch (IOException e) {
                IOException iOExceptionI = i(e);
                iOExceptionI.getClass();
                throw iOExceptionI;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                i(null);
            }
            throw th;
        }
    }

    public final <E extends IOException> E h(Exchange exchange, boolean z, boolean z2, E e) {
        boolean z3;
        boolean z4;
        exchange.getClass();
        if (exchange.equals(this.f0)) {
            synchronized (this) {
                z3 = false;
                if (z) {
                    try {
                        if (!this.b0) {
                            if (z2 || !this.c0) {
                                z4 = false;
                            }
                            j6g j6gVar = j6g.a;
                        }
                        if (z) {
                            this.b0 = false;
                        }
                        if (z2) {
                            this.c0 = false;
                        }
                        boolean z5 = this.b0;
                        boolean z6 = (z5 || this.c0) ? false : true;
                        if (!z5 && !this.c0 && !this.d0) {
                            z3 = true;
                        }
                        z4 = z3;
                        z3 = z6;
                        j6g j6gVar2 = j6g.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z2) {
                    }
                    z4 = false;
                    j6g j6gVar22 = j6g.a;
                }
            }
            if (z3) {
                this.f0 = null;
                RealConnection realConnection = this.Y;
                if (realConnection != null) {
                    synchronized (realConnection) {
                        realConnection.m++;
                    }
                }
            }
            if (z4) {
                return (E) e(e);
            }
        }
        return e;
    }

    public final IOException i(IOException iOException) {
        boolean z;
        synchronized (this) {
            try {
                z = false;
                if (this.d0) {
                    this.d0 = false;
                    if (!this.b0 && !this.c0) {
                        z = true;
                    }
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z ? e(iOException) : iOException;
    }

    public final Socket j() {
        RealConnection realConnection = this.Y;
        realConnection.getClass();
        byte[] bArr = Util.a;
        ArrayList arrayList = realConnection.p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (wl7.b(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            r6.g("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.Y = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        realConnection.q = System.nanoTime();
        RealConnectionPool realConnectionPool = this.d;
        ConcurrentLinkedQueue<RealConnection> concurrentLinkedQueue = realConnectionPool.d;
        TaskQueue taskQueue = realConnectionPool.b;
        byte[] bArr2 = Util.a;
        if (!realConnection.j) {
            taskQueue.c(realConnectionPool.c, 0L);
            return null;
        }
        realConnection.j = true;
        concurrentLinkedQueue.remove(realConnection);
        if (concurrentLinkedQueue.isEmpty()) {
            taskQueue.a();
        }
        Socket socket = realConnection.d;
        socket.getClass();
        return socket;
    }

    public final void k() {
        if (this.Z) {
            r6.g("Check failed.");
        } else {
            this.Z = true;
            j();
        }
    }

    @Override // okhttp3.Call
    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getE0() {
        return this.e0;
    }
}
