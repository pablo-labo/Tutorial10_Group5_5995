package okhttp3.internal.connection;

import defpackage.j6g;
import defpackage.l6;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool;", "", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RealConnectionPool {
    public final long a;
    public final TaskQueue b;
    public final RealConnectionPool$cleanupTask$1 c;
    public final ConcurrentLinkedQueue<RealConnection> d;

    static {
        new Companion(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
    public RealConnectionPool(TaskRunner taskRunner) {
        taskRunner.getClass();
        TimeUnit.MINUTES.getClass();
        this.a = 300000000000L;
        this.b = taskRunner.e();
        final String strI = l6.i(new StringBuilder(), Util.g, " ConnectionPool");
        this.c = new Task(strI) { // from class: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() {
                RealConnectionPool realConnectionPool = this.e;
                long jNanoTime = System.nanoTime();
                int i = 0;
                long j = Long.MIN_VALUE;
                RealConnection realConnection = null;
                int i2 = 0;
                for (RealConnection realConnection2 : realConnectionPool.d) {
                    realConnection2.getClass();
                    synchronized (realConnection2) {
                        if (realConnectionPool.b(realConnection2, jNanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j2 = jNanoTime - realConnection2.q;
                            if (j2 > j) {
                                realConnection = realConnection2;
                                j = j2;
                            }
                            j6g j6gVar = j6g.a;
                        }
                    }
                }
                long j3 = realConnectionPool.a;
                if (j < j3 && i <= 5) {
                    if (i > 0) {
                        return j3 - j;
                    }
                    if (i2 > 0) {
                        return j3;
                    }
                    return -1L;
                }
                realConnection.getClass();
                synchronized (realConnection) {
                    if (!realConnection.p.isEmpty()) {
                        return 0L;
                    }
                    if (realConnection.q + j != jNanoTime) {
                        return 0L;
                    }
                    realConnection.j = true;
                    realConnectionPool.d.remove(realConnection);
                    Socket socket = realConnection.d;
                    socket.getClass();
                    Util.d(socket);
                    if (realConnectionPool.d.isEmpty()) {
                        realConnectionPool.b.a();
                    }
                    return 0L;
                }
            }
        };
        this.d = new ConcurrentLinkedQueue<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(okhttp3.Address r5, okhttp3.internal.connection.RealCall r6, java.util.ArrayList r7, boolean r8) {
        /*
            r4 = this;
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r4 = r4.d
            java.util.Iterator r4 = r4.iterator()
        L6:
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 == 0) goto L35
            java.lang.Object r0 = r4.next()
            okhttp3.internal.connection.RealConnection r0 = (okhttp3.internal.connection.RealConnection) r0
            r0.getClass()
            monitor-enter(r0)
            r2 = 1
            if (r8 == 0) goto L24
            okhttp3.internal.http2.Http2Connection r3 = r0.g     // Catch: java.lang.Throwable -> L22
            if (r3 == 0) goto L1f
            r1 = r2
        L1f:
            if (r1 == 0) goto L2f
            goto L24
        L22:
            r4 = move-exception
            goto L33
        L24:
            boolean r1 = r0.h(r5, r7)     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L2f
            r6.d(r0)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)
            return r2
        L2f:
            j6g r1 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)
            goto L6
        L33:
            monitor-exit(r0)
            throw r4
        L35:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnectionPool.a(okhttp3.Address, okhttp3.internal.connection.RealCall, java.util.ArrayList, boolean):boolean");
    }

    public final int b(RealConnection realConnection, long j) {
        byte[] bArr = Util.a;
        ArrayList arrayList = realConnection.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + realConnection.b.a.i + " was leaked. Did you forget to close a response body?";
                Platform.a.getClass();
                Platform.b.k(((RealCall.CallReference) reference).a, str);
                arrayList.remove(i);
                realConnection.j = true;
                if (arrayList.isEmpty()) {
                    realConnection.q = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
