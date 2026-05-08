package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k7e implements Executor {
    public final Executor b;
    public Runnable c;
    public final ArrayDeque<a> a = new ArrayDeque<>();
    public final Object d = new Object();

    public static class a implements Runnable {
        public final k7e a;
        public final Runnable b;

        public a(k7e k7eVar, Runnable runnable) {
            this.a = k7eVar;
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.b.run();
                synchronized (this.a.d) {
                    this.a.a();
                }
            } catch (Throwable th) {
                synchronized (this.a.d) {
                    this.a.a();
                    throw th;
                }
            }
        }
    }

    public k7e(Executor executor) {
        this.b = executor;
    }

    public final void a() {
        a aVarPoll = this.a.poll();
        this.c = aVarPoll;
        if (aVarPoll != null) {
            this.b.execute(aVarPoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.d) {
            try {
                this.a.add(new a(this, runnable));
                if (this.c == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
