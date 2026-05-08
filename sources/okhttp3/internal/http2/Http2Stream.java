package okhttp3.internal.http2;

import defpackage.fie;
import defpackage.j6g;
import defpackage.kmf;
import defpackage.l6;
import defpackage.pne;
import defpackage.r40;
import defpackage.r6;
import defpackage.vv0;
import defpackage.zn1;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/http2/Http2Stream;", "", "Companion", "FramingSink", "FramingSource", "StreamTimeout", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Http2Stream {
    public final int a;
    public final Http2Connection b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final ArrayDeque<Headers> g;
    public boolean h;
    public final FramingSource i;
    public final FramingSink j;
    public final StreamTimeout k;
    public final StreamTimeout l;
    public ErrorCode m;
    public IOException n;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lfie;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class FramingSink implements fie {
        public final boolean a;
        public final zn1 b = new zn1();
        public boolean c;

        public FramingSink(boolean z) {
            this.a = z;
        }

        @Override // defpackage.fie
        public final void I1(zn1 zn1Var, long j) throws SocketTimeoutException {
            zn1Var.getClass();
            byte[] bArr = Util.a;
            zn1 zn1Var2 = this.b;
            zn1Var2.I1(zn1Var, j);
            while (zn1Var2.b >= 16384) {
                a(false);
            }
        }

        /* JADX WARN: Finally extract failed */
        public final void a(boolean z) throws SocketTimeoutException {
            long jMin;
            boolean z2;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                try {
                    http2Stream.l.i();
                    while (http2Stream.e >= http2Stream.f && !this.a && !this.c) {
                        try {
                            synchronized (http2Stream) {
                                ErrorCode errorCode = http2Stream.m;
                                if (errorCode != null) {
                                    break;
                                }
                                try {
                                    http2Stream.wait();
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                    throw new InterruptedIOException();
                                }
                            }
                        } catch (Throwable th) {
                            http2Stream.l.l();
                            throw th;
                        }
                    }
                    http2Stream.l.l();
                    http2Stream.b();
                    jMin = Math.min(http2Stream.f - http2Stream.e, this.b.b);
                    http2Stream.e += jMin;
                    z2 = z && jMin == this.b.b;
                    j6g j6gVar = j6g.a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Http2Stream.this.l.i();
            try {
                Http2Stream http2Stream2 = Http2Stream.this;
                http2Stream2.b.N(http2Stream2.a, z2, this.b, jMin);
            } finally {
                Http2Stream.this.l.l();
            }
        }

        @Override // defpackage.fie, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean z;
            Http2Stream http2Stream = Http2Stream.this;
            byte[] bArr = Util.a;
            synchronized (http2Stream) {
                if (this.c) {
                    return;
                }
                synchronized (http2Stream) {
                    z = http2Stream.m == null;
                    j6g j6gVar = j6g.a;
                }
                Http2Stream http2Stream2 = Http2Stream.this;
                if (!http2Stream2.j.a) {
                    if (this.b.b > 0) {
                        while (this.b.b > 0) {
                            a(true);
                        }
                    } else if (z) {
                        http2Stream2.b.N(http2Stream2.a, true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    this.c = true;
                    j6g j6gVar2 = j6g.a;
                }
                Http2Stream.this.b.flush();
                Http2Stream.this.a();
            }
        }

        @Override // defpackage.fie, java.io.Flushable
        public final void flush() throws SocketTimeoutException {
            Http2Stream http2Stream = Http2Stream.this;
            byte[] bArr = Util.a;
            synchronized (http2Stream) {
                http2Stream.b();
                j6g j6gVar = j6g.a;
            }
            while (this.b.b > 0) {
                a(false);
                Http2Stream.this.b.flush();
            }
        }

        @Override // defpackage.fie
        public final kmf g() {
            return Http2Stream.this.l;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lpne;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class FramingSource implements pne {
        public final long a;
        public boolean b;
        public final zn1 c = new zn1();
        public final zn1 d = new zn1();
        public boolean e;

        public FramingSource(long j, boolean z) {
            this.a = j;
            this.b = z;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long j;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                this.e = true;
                zn1 zn1Var = this.d;
                j = zn1Var.b;
                zn1Var.h();
                http2Stream.notifyAll();
                j6g j6gVar = j6g.a;
            }
            if (j > 0) {
                Http2Stream http2Stream2 = Http2Stream.this;
                byte[] bArr = Util.a;
                http2Stream2.b.G(j);
            }
            Http2Stream.this.a();
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x009e A[LOOP:0: B:4:0x000d->B:47:0x009e, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00a2 A[SYNTHETIC] */
        @Override // defpackage.pne
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long f1(defpackage.zn1 r19, long r20) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 204
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSource.f1(zn1, long):long");
        }

        @Override // defpackage.pne
        public final kmf g() {
            return Http2Stream.this.k;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lvv0;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class StreamTimeout extends vv0 {
        public StreamTimeout() {
        }

        @Override // defpackage.vv0
        public final void k() {
            Http2Stream.this.e(ErrorCode.CANCEL);
            final Http2Connection http2Connection = Http2Stream.this.b;
            synchronized (http2Connection) {
                long j = http2Connection.d0;
                long j2 = http2Connection.c0;
                if (j < j2) {
                    return;
                }
                http2Connection.c0 = j2 + 1;
                http2Connection.e0 = System.nanoTime() + 1000000000;
                j6g j6gVar = j6g.a;
                TaskQueue taskQueue = http2Connection.W;
                final String strI = l6.i(new StringBuilder(), http2Connection.c, " ping");
                taskQueue.c(new Task(strI) { // from class: okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public final long a() {
                        Http2Connection http2Connection2 = http2Connection;
                        http2Connection2.getClass();
                        try {
                            http2Connection2.m0.G(2, 0, false);
                            return -1L;
                        } catch (IOException e) {
                            http2Connection2.h(e);
                            return -1L;
                        }
                    }
                }, 0L);
            }
        }

        public final void l() throws SocketTimeoutException {
            if (j()) {
                throw new SocketTimeoutException("timeout");
            }
        }
    }

    static {
        new Companion(0);
    }

    public Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, Headers headers) {
        http2Connection.getClass();
        this.a = i;
        this.b = http2Connection;
        this.f = http2Connection.g0.a();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.g = arrayDeque;
        this.i = new FramingSource(http2Connection.f0.a(), z2);
        this.j = new FramingSink(z);
        this.k = new StreamTimeout();
        this.l = new StreamTimeout();
        if (headers == null) {
            if (g()) {
                return;
            }
            r6.g("remotely-initiated streams should have headers");
            throw null;
        }
        if (g()) {
            r6.g("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(headers);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r3 = this;
            byte[] r0 = okhttp3.internal.Util.a
            monitor-enter(r3)
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r3.i     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.b     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1c
            boolean r0 = r0.e     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r3.j     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.a     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            boolean r0 = r0.c     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            goto L1a
        L18:
            r0 = move-exception
            goto L37
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            boolean r1 = r3.h()     // Catch: java.lang.Throwable -> L18
            j6g r2 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L18
            monitor-exit(r3)
            if (r0 == 0) goto L2d
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.CANCEL
            r1 = 0
            r3.c(r0, r1)
            return
        L2d:
            if (r1 != 0) goto L36
            okhttp3.internal.http2.Http2Connection r0 = r3.b
            int r3 = r3.a
            r0.s(r3)
        L36:
            return
        L37:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.a():void");
    }

    public final void b() throws IOException {
        FramingSink framingSink = this.j;
        if (framingSink.c) {
            r40.h("stream closed");
            return;
        }
        if (framingSink.a) {
            r40.h("stream finished");
            return;
        }
        ErrorCode errorCode = this.m;
        if (errorCode != null) {
            IOException iOException = this.n;
            if (iOException == null) {
                throw new StreamResetException(errorCode);
            }
        }
    }

    public final void c(ErrorCode errorCode, IOException iOException) {
        if (d(errorCode, iOException)) {
            Http2Connection http2Connection = this.b;
            http2Connection.getClass();
            http2Connection.m0.N(this.a, errorCode);
        }
    }

    public final boolean d(ErrorCode errorCode, IOException iOException) {
        byte[] bArr = Util.a;
        synchronized (this) {
            if (this.m != null) {
                return false;
            }
            this.m = errorCode;
            this.n = iOException;
            notifyAll();
            if (this.i.b && this.j.a) {
                return false;
            }
            j6g j6gVar = j6g.a;
            this.b.s(this.a);
            return true;
        }
    }

    public final void e(ErrorCode errorCode) {
        if (d(errorCode, null)) {
            this.b.P(this.a, errorCode);
        }
    }

    public final FramingSink f() {
        synchronized (this) {
            try {
                if (!this.h && !g()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.j;
    }

    public final boolean g() {
        boolean z = (this.a & 1) == 1;
        this.b.getClass();
        return true == z;
    }

    public final synchronized boolean h() {
        try {
            if (this.m != null) {
                return false;
            }
            FramingSource framingSource = this.i;
            if (framingSource.b || framingSource.e) {
                FramingSink framingSink = this.j;
                if (framingSink.a || framingSink.c) {
                    if (this.h) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void i(Headers headers, boolean z) {
        boolean zH;
        headers.getClass();
        byte[] bArr = Util.a;
        synchronized (this) {
            try {
                if (this.h && z) {
                    this.i.getClass();
                } else {
                    this.h = true;
                    this.g.add(headers);
                }
                if (z) {
                    this.i.b = true;
                }
                zH = h();
                notifyAll();
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zH) {
            return;
        }
        this.b.s(this.a);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$Companion;", "", "()V", "EMIT_BUFFER_SIZE", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
