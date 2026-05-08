package okhttp3.internal.http2;

import defpackage.gu5;
import defpackage.j6g;
import defpackage.juc;
import defpackage.l6;
import defpackage.tqc;
import defpackage.uqc;
import defpackage.wl7;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.PushObserver;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/http2/Http2Connection;", "Ljava/io/Closeable;", "Builder", "Companion", "Listener", "ReaderRunnable", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Http2Connection implements Closeable {
    public static final Companion p0 = new Companion(0);
    public static final Settings q0;
    public final TaskRunner V;
    public final TaskQueue W;
    public final TaskQueue X;
    public final TaskQueue Y;
    public final PushObserver Z;
    public final Listener a;
    public long a0;
    public final LinkedHashMap b = new LinkedHashMap();
    public long b0;
    public final String c;
    public long c0;
    public int d;
    public long d0;
    public int e;
    public long e0;
    public boolean f;
    public final Settings f0;
    public Settings g0;
    public long h0;
    public long i0;
    public long j0;
    public long k0;
    public final Socket l0;
    public final Http2Writer m0;
    public final ReaderRunnable n0;
    public final LinkedHashSet o0;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Builder;", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public final TaskRunner a;
        public Socket b;
        public String c;
        public uqc d;
        public tqc e;
        public Listener f;
        public final PushObserver g;

        public Builder(TaskRunner taskRunner) {
            taskRunner.getClass();
            this.a = taskRunner;
            this.f = Listener.a;
            this.g = PushObserver.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "Lokhttp3/internal/http2/Http2Reader$Handler;", "Lkotlin/Function0;", "Lj6g;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ReaderRunnable implements Http2Reader.Handler, gu5<j6g> {
        public final Http2Reader a;

        public ReaderRunnable(Http2Reader http2Reader) {
            this.a = http2Reader;
        }

        /* JADX WARN: Code restructure failed: missing block: B:56:0x00e6, code lost:
        
            if (r19 == false) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00e8, code lost:
        
            r2.i(okhttp3.internal.Util.b, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00ed, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(final boolean r19, final int r20, defpackage.to1 r21, final int r22) throws java.io.EOFException {
            /*
                Method dump skipped, instruction units count: 238
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.ReaderRunnable.a(boolean, int, to1, int):void");
        }

        public final void b(final int i, final List list, final boolean z) {
            final Http2Connection http2Connection = Http2Connection.this;
            Companion companion = Http2Connection.p0;
            if (i != 0 && (i & 1) == 0) {
                TaskQueue taskQueue = http2Connection.X;
                final String str = http2Connection.c + '[' + i + "] onHeaders";
                taskQueue.c(new Task(str, http2Connection, i, list, z) { // from class: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1
                    public final /* synthetic */ Http2Connection e;
                    public final /* synthetic */ int f;
                    public final /* synthetic */ List g;

                    @Override // okhttp3.internal.concurrent.Task
                    public final long a() {
                        ((PushObserver.Companion.PushObserverCancel) this.e.Z).getClass();
                        try {
                            this.e.m0.N(this.f, ErrorCode.CANCEL);
                            synchronized (this.e) {
                                this.e.o0.remove(Integer.valueOf(this.f));
                            }
                            return -1L;
                        } catch (IOException unused) {
                            return -1L;
                        }
                    }
                }, 0L);
                return;
            }
            synchronized (http2Connection) {
                Http2Stream http2StreamP = http2Connection.p(i);
                if (http2StreamP != null) {
                    j6g j6gVar = j6g.a;
                    http2StreamP.i(Util.v(list), z);
                    return;
                }
                if (http2Connection.f) {
                    return;
                }
                if (i <= http2Connection.d) {
                    return;
                }
                if (i % 2 == http2Connection.e % 2) {
                    return;
                }
                final Http2Stream http2Stream = new Http2Stream(i, http2Connection, false, z, Util.v(list));
                http2Connection.d = i;
                http2Connection.b.put(Integer.valueOf(i), http2Stream);
                TaskQueue taskQueueE = http2Connection.V.e();
                final String str2 = http2Connection.c + '[' + i + "] onStream";
                taskQueueE.c(new Task(str2) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public final long a() {
                        try {
                            http2Connection.a.b(http2Stream);
                            return -1L;
                        } catch (IOException e) {
                            Platform.a.getClass();
                            Platform platform = Platform.b;
                            String str3 = "Http2Connection.Listener failure for " + http2Connection.c;
                            platform.getClass();
                            Platform.i(4, str3, e);
                            try {
                                http2Stream.c(ErrorCode.PROTOCOL_ERROR, e);
                                return -1L;
                            } catch (IOException unused) {
                                return -1L;
                            }
                        }
                    }
                }, 0L);
            }
        }

        public final void d(final int i, final int i2, boolean z) {
            Http2Connection http2Connection = Http2Connection.this;
            if (!z) {
                TaskQueue taskQueue = http2Connection.W;
                final String strI = l6.i(new StringBuilder(), Http2Connection.this.c, " ping");
                final Http2Connection http2Connection2 = Http2Connection.this;
                taskQueue.c(new Task(strI) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public final long a() {
                        Http2Connection http2Connection3 = http2Connection2;
                        try {
                            http2Connection3.m0.G(i, i2, true);
                            return -1L;
                        } catch (IOException e) {
                            http2Connection3.h(e);
                            return -1L;
                        }
                    }
                }, 0L);
                return;
            }
            synchronized (http2Connection) {
                try {
                    if (i == 1) {
                        http2Connection.b0++;
                    } else if (i != 2) {
                        if (i == 3) {
                            http2Connection.notifyAll();
                        }
                        j6g j6gVar = j6g.a;
                    } else {
                        http2Connection.d0++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void f(final int i, final List list) {
            final Http2Connection http2Connection = Http2Connection.this;
            synchronized (http2Connection) {
                if (http2Connection.o0.contains(Integer.valueOf(i))) {
                    http2Connection.P(i, ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                http2Connection.o0.add(Integer.valueOf(i));
                TaskQueue taskQueue = http2Connection.X;
                final String str = http2Connection.c + '[' + i + "] onRequest";
                taskQueue.c(new Task(str) { // from class: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public final long a() {
                        ((PushObserver.Companion.PushObserverCancel) http2Connection.Z).getClass();
                        try {
                            http2Connection.m0.N(i, ErrorCode.CANCEL);
                            synchronized (http2Connection) {
                                http2Connection.o0.remove(Integer.valueOf(i));
                            }
                            return -1L;
                        } catch (IOException unused) {
                            return -1L;
                        }
                    }
                }, 0L);
            }
        }

        public final void g(final int i, final ErrorCode errorCode) {
            final Http2Connection http2Connection = Http2Connection.this;
            Companion companion = Http2Connection.p0;
            if (i == 0 || (i & 1) != 0) {
                Http2Stream http2StreamS = http2Connection.s(i);
                if (http2StreamS != null) {
                    synchronized (http2StreamS) {
                        if (http2StreamS.m == null) {
                            http2StreamS.m = errorCode;
                            http2StreamS.notifyAll();
                        }
                    }
                    return;
                }
                return;
            }
            TaskQueue taskQueue = http2Connection.X;
            final String str = http2Connection.c + '[' + i + "] onReset";
            taskQueue.c(new Task(str, http2Connection, i, errorCode) { // from class: okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1
                public final /* synthetic */ Http2Connection e;
                public final /* synthetic */ int f;

                @Override // okhttp3.internal.concurrent.Task
                public final long a() {
                    ((PushObserver.Companion.PushObserverCancel) this.e.Z).getClass();
                    synchronized (this.e) {
                        this.e.o0.remove(Integer.valueOf(this.f));
                        j6g j6gVar = j6g.a;
                    }
                    return -1L;
                }
            }, 0L);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v12 */
        /* JADX WARN: Type inference failed for: r5v13 */
        /* JADX WARN: Type inference failed for: r5v8 */
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
        @Override // defpackage.gu5
        public final j6g invoke() throws Throwable {
            Throwable th;
            Http2Connection http2Connection = Http2Connection.this;
            Http2Reader http2Reader = this.a;
            ErrorCode errorCode = ErrorCode.INTERNAL_ERROR;
            IOException iOException = null;
            try {
                try {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e) {
                    iOException = e;
                }
                if (!http2Reader.a(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                do {
                    try {
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } while (http2Reader.a(false, this));
                ErrorCode errorCode2 = ErrorCode.NO_ERROR;
                try {
                    errorCode = ErrorCode.CANCEL;
                    http2Connection.a(errorCode2, errorCode, null);
                    this = errorCode2;
                } catch (IOException e2) {
                    iOException = e2;
                    ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                    http2Connection.a(errorCode3, errorCode3, iOException);
                    this = errorCode3;
                }
                Util.c(http2Reader);
                return j6g.a;
                this = errorCode;
            } catch (Throwable th4) {
                th = th4;
            }
            http2Connection.a(this, errorCode, iOException);
            Util.c(http2Reader);
            throw th;
        }
    }

    static {
        Settings settings = new Settings();
        settings.b(7, 65535);
        settings.b(5, 16384);
        q0 = settings;
    }

    public Http2Connection(Builder builder) {
        this.a = builder.f;
        String str = builder.c;
        if (str == null) {
            wl7.g("connectionName");
            throw null;
        }
        this.c = str;
        this.e = 3;
        TaskRunner taskRunner = builder.a;
        this.V = taskRunner;
        this.W = taskRunner.e();
        this.X = taskRunner.e();
        this.Y = taskRunner.e();
        this.Z = builder.g;
        Settings settings = new Settings();
        settings.b(7, 16777216);
        this.f0 = settings;
        this.g0 = q0;
        this.k0 = r0.a();
        Socket socket = builder.b;
        if (socket == null) {
            wl7.g("socket");
            throw null;
        }
        this.l0 = socket;
        tqc tqcVar = builder.e;
        if (tqcVar == null) {
            wl7.g("sink");
            throw null;
        }
        this.m0 = new Http2Writer(tqcVar);
        uqc uqcVar = builder.d;
        if (uqcVar == null) {
            wl7.g("source");
            throw null;
        }
        this.n0 = new ReaderRunnable(new Http2Reader(uqcVar));
        this.o0 = new LinkedHashSet();
    }

    public final synchronized void G(long j) {
        long j2 = this.h0 + j;
        this.h0 = j2;
        long j3 = j2 - this.i0;
        if (j3 >= this.f0.a() / 2) {
            Q(0, j3);
            this.i0 += j3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.m0.c);
        r6 = r2;
        r8.j0 += r6;
        r4 = defpackage.j6g.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N(int r9, boolean r10, defpackage.zn1 r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            okhttp3.internal.http2.Http2Writer r8 = r8.m0
            r8.h(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L6a
            monitor-enter(r8)
        L12:
            long r4 = r8.j0     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            long r6 = r8.k0     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.b     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            goto L12
        L2a:
            r9 = move-exception
            goto L68
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            okhttp3.internal.http2.Http2Writer r4 = r8.m0     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.c     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.j0     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.j0 = r4     // Catch: java.lang.Throwable -> L2a
            j6g r4 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            okhttp3.internal.http2.Http2Writer r4 = r8.m0
            if (r10 == 0) goto L56
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L56
            r5 = 1
            goto L57
        L56:
            r5 = r3
        L57:
            r4.h(r5, r9, r11, r2)
            goto Ld
        L5b:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L68:
            monitor-exit(r8)
            throw r9
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.N(int, boolean, zn1, long):void");
    }

    public final void P(final int i, final ErrorCode errorCode) {
        final String str = this.c + '[' + i + "] writeSynReset";
        this.W.c(new Task(str) { // from class: okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() {
                Http2Connection http2Connection = this;
                try {
                    http2Connection.m0.N(i, errorCode);
                    return -1L;
                } catch (IOException e) {
                    Http2Connection.Companion companion = Http2Connection.p0;
                    http2Connection.h(e);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void Q(final int i, final long j) {
        final String str = this.c + '[' + i + "] windowUpdate";
        this.W.c(new Task(str) { // from class: okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() {
                Http2Connection http2Connection = this;
                try {
                    http2Connection.m0.P(i, j);
                    return -1L;
                } catch (IOException e) {
                    Http2Connection.Companion companion = Http2Connection.p0;
                    http2Connection.h(e);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void a(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        int i;
        Object[] array;
        byte[] bArr = Util.a;
        try {
            v(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.b.isEmpty()) {
                    array = null;
                } else {
                    array = this.b.values().toArray(new Http2Stream[0]);
                    this.b.clear();
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) array;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.c(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.m0.close();
        } catch (IOException unused3) {
        }
        try {
            this.l0.close();
        } catch (IOException unused4) {
        }
        this.W.f();
        this.X.f();
        this.Y.f();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void flush() {
        this.m0.flush();
    }

    public final void h(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        a(errorCode, errorCode, iOException);
    }

    public final synchronized Http2Stream p(int i) {
        return (Http2Stream) this.b.get(Integer.valueOf(i));
    }

    public final synchronized Http2Stream s(int i) {
        Http2Stream http2Stream;
        http2Stream = (Http2Stream) this.b.remove(Integer.valueOf(i));
        notifyAll();
        return http2Stream;
    }

    public final void v(ErrorCode errorCode) {
        synchronized (this.m0) {
            juc jucVar = new juc();
            synchronized (this) {
                if (this.f) {
                    return;
                }
                this.f = true;
                int i = this.d;
                jucVar.element = i;
                j6g j6gVar = j6g.a;
                this.m0.s(i, errorCode, Util.a);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener;", "", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Listener {
        public static final Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1 a;

        /* JADX WARN: Type inference failed for: r0v1, types: [okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1] */
        static {
            new Companion(0);
            a = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
                @Override // okhttp3.internal.http2.Http2Connection.Listener
                public final void b(Http2Stream http2Stream) {
                    http2Stream.c(ErrorCode.REFUSED_STREAM, null);
                }
            };
        }

        public void a(Http2Connection http2Connection, Settings settings) {
            settings.getClass();
        }

        public abstract void b(Http2Stream http2Stream);

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener$Companion;", "", "()V", "REFUSE_INCOMING_STREAMS", "Lokhttp3/internal/http2/Http2Connection$Listener;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(int i) {
                this();
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Companion;", "", "<init>", "()V", "", "AWAIT_PING", "I", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
