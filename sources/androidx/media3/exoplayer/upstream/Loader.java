package androidx.media3.exoplayer.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import defpackage.d09;
import defpackage.h5;
import defpackage.ka2;
import defpackage.sjg;
import defpackage.vjg;
import defpackage.yyc;
import defpackage.zkd;
import java.io.IOException;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class Loader implements d09 {
    public static final b d = new b(0, -9223372036854775807L);
    public static final b e = new b(2, -9223372036854775807L);
    public static final b f = new b(3, -9223372036854775807L);
    public final yyc a;
    public c<? extends d> b;
    public IOException c;

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            String str;
            StringBuilder sb = new StringBuilder("Unexpected ");
            sb.append(th.getClass().getSimpleName());
            if (th.getMessage() != null) {
                str = ": " + th.getMessage();
            } else {
                str = "";
            }
            sb.append(str);
            super(sb.toString(), th);
        }
    }

    public interface a<T extends d> {
        b g(T t, long j, long j2, IOException iOException, int i);

        default void n(T t, long j, long j2, int i) {
        }

        void r(T t, long j, long j2);

        void v(T t, long j, long j2, boolean z);
    }

    public static final class b {
        public final int a;
        public final long b;

        public b(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public final boolean a() {
            int i = this.a;
            return i == 0 || i == 1;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public final class c<T extends d> extends Handler implements Runnable {
        public Thread V;
        public boolean W;
        public volatile boolean X;
        public final int a;
        public final T b;
        public final long c;
        public a<T> d;
        public IOException e;
        public int f;

        public c(Looper looper, T t, a<T> aVar, int i, long j) {
            super(looper);
            this.b = t;
            this.d = aVar;
            this.a = i;
            this.c = j;
        }

        public final void a(boolean z) {
            this.X = z;
            this.e = null;
            if (hasMessages(1)) {
                this.W = true;
                removeMessages(1);
                if (!z) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.W = true;
                        this.b.b();
                        Thread thread = this.V;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                Loader.this.b = null;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                a<T> aVar = this.d;
                aVar.getClass();
                aVar.v(this.b, jElapsedRealtime, jElapsedRealtime - this.c, true);
                this.d = null;
            }
        }

        public final void b() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.c;
            a<T> aVar = this.d;
            aVar.getClass();
            aVar.n(this.b, jElapsedRealtime, j, this.f);
            this.e = null;
            Loader loader = Loader.this;
            yyc yycVar = loader.a;
            c<? extends d> cVar = loader.b;
            cVar.getClass();
            yycVar.execute(cVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.X) {
                return;
            }
            int i = message.what;
            if (i == 1) {
                b();
                return;
            }
            if (i == 4) {
                throw ((Error) message.obj);
            }
            Loader.this.b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.c;
            a<T> aVar = this.d;
            aVar.getClass();
            if (this.W) {
                aVar.v(this.b, jElapsedRealtime, j, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 2) {
                try {
                    aVar.r(this.b, jElapsedRealtime, j);
                    return;
                } catch (RuntimeException e) {
                    zkd.x("LoadTask", "Unexpected exception handling load completed", e);
                    Loader.this.c = new UnexpectedLoaderException(e);
                    return;
                }
            }
            if (i2 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.e = iOException;
            int i3 = this.f + 1;
            this.f = i3;
            b bVarG = aVar.g(this.b, jElapsedRealtime, j, iOException, i3);
            int i4 = bVarG.a;
            if (i4 == 3) {
                Loader.this.c = this.e;
                return;
            }
            if (i4 != 2) {
                if (i4 == 1) {
                    this.f = 1;
                }
                long jMin = bVarG.b;
                if (jMin == -9223372036854775807L) {
                    jMin = Math.min((this.f - 1) * 1000, 5000);
                }
                Loader loader = Loader.this;
                ka2.q(loader.b == null);
                loader.b = this;
                if (jMin > 0) {
                    sendEmptyMessageDelayed(1, jMin);
                } else {
                    b();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = this.W;
                    this.V = Thread.currentThread();
                }
                if (!z) {
                    Trace.beginSection("load:".concat(this.b.getClass().getSimpleName()));
                    try {
                        this.b.a();
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.V = null;
                    Thread.interrupted();
                }
                if (this.X) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e) {
                if (this.X) {
                    return;
                }
                obtainMessage(3, e).sendToTarget();
            } catch (Exception e2) {
                if (this.X) {
                    return;
                }
                zkd.x("LoadTask", "Unexpected exception loading stream", e2);
                obtainMessage(3, new UnexpectedLoaderException(e2)).sendToTarget();
            } catch (OutOfMemoryError e3) {
                if (this.X) {
                    return;
                }
                zkd.x("LoadTask", "OutOfMemory error loading stream", e3);
                obtainMessage(3, new UnexpectedLoaderException(e3)).sendToTarget();
            } catch (Error e4) {
                if (!this.X) {
                    zkd.x("LoadTask", "Unexpected error loading stream", e4);
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            }
        }
    }

    public interface d {
        void a();

        void b();
    }

    public interface e {
        void k();
    }

    public static final class f implements Runnable {
        public final e a;

        public f(e eVar) {
            this.a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.k();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Loader(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        String str2 = vjg.a;
        this(new yyc(Executors.newSingleThreadExecutor(new sjg(strConcat)), new h5(14)));
    }

    @Override // defpackage.d09
    public final void a() throws IOException {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        c<? extends d> cVar = this.b;
        if (cVar != null) {
            int i = cVar.a;
            IOException iOException2 = cVar.e;
            if (iOException2 != null && cVar.f > i) {
                throw iOException2;
            }
        }
    }

    public final void b() {
        c<? extends d> cVar = this.b;
        ka2.r(cVar);
        cVar.a(false);
    }

    public final boolean c() {
        return this.c != null;
    }

    public final boolean d() {
        return this.b != null;
    }

    public final void e(e eVar) {
        c<? extends d> cVar = this.b;
        if (cVar != null) {
            cVar.a(true);
        }
        yyc yycVar = this.a;
        if (eVar != null) {
            yycVar.execute(new f(eVar));
        }
        yycVar.b.accept(yycVar.a);
    }

    public final void f(d dVar, a aVar, int i) {
        Looper looperMyLooper = Looper.myLooper();
        ka2.r(looperMyLooper);
        this.c = null;
        c<? extends d> cVar = new c<>(looperMyLooper, dVar, aVar, i, SystemClock.elapsedRealtime());
        ka2.q(this.b == null);
        this.b = cVar;
        cVar.b();
    }

    public Loader(yyc yycVar) {
        this.a = yycVar;
    }
}
