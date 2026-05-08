package defpackage;

import defpackage.e05;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes3.dex */
public final class en3 extends e05 implements Runnable {
    public static final en3 Y;
    public static final long Z;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        en3 en3Var = new en3();
        Y = en3Var;
        en3Var.O1(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        Z = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.e05, defpackage.js3
    public final o74 R0(long j, lmf lmfVar, v03 v03Var) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return jja.a;
        }
        long jNanoTime = System.nanoTime();
        e05.b bVar = new e05.b(j2 + jNanoTime, lmfVar);
        Z1(jNanoTime, bVar);
        return bVar;
    }

    @Override // defpackage.f05
    public final Thread T1() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(Y.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.f05
    public final void U1(long j, e05.c cVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.e05
    public final void V1(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.V1(runnable);
    }

    public final synchronized void a2() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            e05.V.set(this, null);
            e05.W.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zY1;
        ukf.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zY1) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jR1 = R1();
                    if (jR1 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = Z + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            a2();
                            if (Y1()) {
                                return;
                            }
                            T1();
                            return;
                        }
                        if (jR1 > j2) {
                            jR1 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jR1 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            a2();
                            if (Y1()) {
                                return;
                            }
                            T1();
                            return;
                        }
                        LockSupport.parkNanos(this, jR1);
                    }
                }
            }
        } finally {
            _thread = null;
            a2();
            if (!Y1()) {
                T1();
            }
        }
    }

    @Override // defpackage.e05, defpackage.d05
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.y03
    public final String toString() {
        return "DefaultExecutor";
    }
}
