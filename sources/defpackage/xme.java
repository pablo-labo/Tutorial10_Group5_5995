package defpackage;

import android.os.SystemClock;
import com.datadog.android.core.internal.time.LoggingSyncListener;
import com.lyft.kronos.internal.ntp.NTPSyncException;
import com.lyft.kronos.internal.ntp.SntpClient;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class xme {
    public final AtomicReference<a> a = new AtomicReference<>(a.a);
    public final AtomicLong b = new AtomicLong(0);
    public final ExecutorService c = Executors.newSingleThreadExecutor(yme.a);
    public final SntpClient d;
    public final ws9 e;
    public final LoggingSyncListener f;
    public final List<String> g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("IDLE", 0);
            a = aVar;
            a aVar2 = new a("SYNCING", 1);
            b = aVar2;
            a aVar3 = new a("STOPPED", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    public static final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            xme xmeVar;
            Iterator<String> it;
            xme xmeVar2 = xme.this;
            xmeVar2.a();
            Iterator<String> it2 = xmeVar2.g.iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                long j = xmeVar2.k;
                AtomicLong atomicLong = xmeVar2.b;
                a aVar = a.a;
                LoggingSyncListener loggingSyncListener = xmeVar2.f;
                AtomicReference<a> atomicReference = xmeVar2.a;
                a aVar2 = a.b;
                if (atomicReference.getAndSet(aVar2) != aVar2) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    loggingSyncListener.onStartSync(next);
                    try {
                        SntpClient.a aVarD = xmeVar2.d.d(next, Long.valueOf(xmeVar2.h));
                        if ((SystemClock.elapsedRealtime() - aVarD.b) + aVarD.a + aVarD.c >= 0) {
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            if (jElapsedRealtime2 <= j) {
                                xmeVar2.e.a(aVarD);
                                loggingSyncListener.onSuccess(aVarD.c, jElapsedRealtime2);
                                return;
                            }
                            throw new NTPSyncException("Ignoring response from " + next + " because the network latency (" + jElapsedRealtime2 + " ms) is longer than the required value (" + j + " ms");
                        }
                        StringBuilder sb = new StringBuilder("Invalid time ");
                        xmeVar = xmeVar2;
                        it = it2;
                        try {
                            sb.append((SystemClock.elapsedRealtime() - aVarD.b) + aVarD.a + aVarD.c);
                            sb.append(" received from ");
                            sb.append(next);
                            throw new NTPSyncException(sb.toString());
                        } catch (Throwable th) {
                            th = th;
                            try {
                                loggingSyncListener.onError(next, th);
                                it2 = it;
                                xmeVar2 = xmeVar;
                            } finally {
                                atomicReference.set(aVar);
                                atomicLong.set(SystemClock.elapsedRealtime());
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        xmeVar = xmeVar2;
                        it = it2;
                    }
                } else {
                    xmeVar = xmeVar2;
                    it = it2;
                }
                it2 = it;
                xmeVar2 = xmeVar;
            }
        }
    }

    public xme(SntpClient sntpClient, ypd ypdVar, ws9 ws9Var, LoggingSyncListener loggingSyncListener, List list, long j, long j2, long j3, long j4) {
        this.d = sntpClient;
        this.e = ws9Var;
        this.f = loggingSyncListener;
        this.g = list;
        this.h = j;
        this.i = j2;
        this.j = j3;
        this.k = j4;
    }

    public final void a() {
        if (this.a.get() != a.c) {
            return;
        }
        r6.g("Service already shutdown");
    }

    public final void b() {
        a();
        if (this.a.get() != a.b) {
            this.c.submit(new b());
        }
    }
}
