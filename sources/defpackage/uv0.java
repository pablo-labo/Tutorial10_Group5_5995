package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import defpackage.f09;
import defpackage.jx9;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class uv0<D> extends c09<D> {
    public final Executor f;
    public volatile uv0<D>.a g;
    public volatile uv0<D>.a h;

    public final class a extends jx9<Void, Void, D> implements Runnable {
        public final CountDownLatch X = new CountDownLatch(1);

        public a() {
        }

        @Override // defpackage.jx9
        public final void a() {
            uv0 uv0Var = uv0.this;
            uv0Var.getClass();
            qdh qdhVar = (qdh) uv0Var;
            Iterator it = qdhVar.j.iterator();
            if (it.hasNext()) {
                ((pa6) it.next()).getClass();
                b0.l();
                return;
            }
            try {
                qdhVar.i.tryAcquire(0, 5L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
                Thread.currentThread().interrupt();
            }
        }

        @Override // defpackage.jx9
        public final void b(D d) {
            CountDownLatch countDownLatch = this.X;
            try {
                uv0 uv0Var = uv0.this;
                if (uv0Var.h == this) {
                    SystemClock.uptimeMillis();
                    uv0Var.h = null;
                    uv0Var.b();
                }
            } finally {
                countDownLatch.countDown();
            }
        }

        @Override // defpackage.jx9
        public final void c(D d) {
            try {
                uv0 uv0Var = uv0.this;
                if (uv0Var.g != this) {
                    if (uv0Var.h == this) {
                        SystemClock.uptimeMillis();
                        uv0Var.h = null;
                        uv0Var.b();
                    }
                } else if (!uv0Var.c) {
                    SystemClock.uptimeMillis();
                    uv0Var.g = null;
                    f09.a aVar = uv0Var.a;
                    if (aVar != null) {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            aVar.j(d);
                        } else {
                            aVar.k(d);
                        }
                    }
                }
            } finally {
                this.X.countDown();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            uv0.this.b();
        }
    }

    public uv0(SignInHubActivity signInHubActivity) {
        ThreadPoolExecutor threadPoolExecutor = jx9.f;
        this.b = false;
        this.c = false;
        this.d = true;
        this.e = false;
        signInHubActivity.getApplicationContext();
        this.f = threadPoolExecutor;
    }

    public final void b() {
        if (this.h != null || this.g == null) {
            return;
        }
        this.g.getClass();
        uv0<D>.a aVar = this.g;
        Executor executor = this.f;
        if (aVar.c == jx9.f.a) {
            aVar.c = jx9.f.b;
            aVar.a.getClass();
            executor.execute(aVar.b);
            return;
        }
        int iOrdinal = aVar.c.ordinal();
        if (iOrdinal == 1) {
            r6.g("Cannot execute task: the task is already running.");
        } else if (iOrdinal != 2) {
            r6.g("We should never reach this state");
        } else {
            r6.g("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
    }
}
