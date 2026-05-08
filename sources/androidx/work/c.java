package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import defpackage.e3h;
import defpackage.f3h;
import defpackage.fbe;
import defpackage.hp5;
import defpackage.hz8;
import defpackage.l5;
import defpackage.p2h;
import defpackage.q2h;
import defpackage.qaf;
import defpackage.r4h;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public c(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            l5.q("Application Context is null");
            throw null;
        }
        if (workerParameters == null) {
            l5.q("WorkerParameters is null");
            throw null;
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f;
    }

    public hz8<hp5> getForegroundInfoAsync() {
        fbe fbeVar = new fbe();
        fbeVar.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return fbeVar;
    }

    public final UUID getId() {
        return this.mWorkerParams.a;
    }

    public final b getInputData() {
        return this.mWorkerParams.b;
    }

    public final Network getNetwork() {
        return this.mWorkerParams.d.c;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.c;
    }

    public qaf getTaskExecutor() {
        return this.mWorkerParams.g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.d.a;
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.d.b;
    }

    public r4h getWorkerFactory() {
        return this.mWorkerParams.h;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final hz8<Void> setForegroundAsync(hp5 hp5Var) {
        q2h q2hVar = this.mWorkerParams.j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        q2hVar.getClass();
        fbe fbeVar = new fbe();
        q2hVar.a.a(new p2h(q2hVar, fbeVar, id, hp5Var, applicationContext));
        return fbeVar;
    }

    public hz8<Void> setProgressAsync(b bVar) {
        f3h f3hVar = this.mWorkerParams.i;
        getApplicationContext();
        UUID id = getId();
        f3hVar.getClass();
        fbe fbeVar = new fbe();
        f3hVar.b.a(new e3h(f3hVar, id, bVar, fbeVar, 0));
        return fbeVar;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract hz8<a> startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    public static abstract class a {

        /* JADX INFO: renamed from: androidx.work.c$a$a, reason: collision with other inner class name */
        public static final class C0078a extends a {
            public final androidx.work.b a = androidx.work.b.c;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0078a.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((C0078a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode() + (C0078a.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Failure {mOutputData=" + this.a + '}';
            }
        }

        public static final class b extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public final int hashCode() {
                return b.class.getName().hashCode();
            }

            public final String toString() {
                return "Retry";
            }
        }

        /* JADX INFO: renamed from: androidx.work.c$a$c, reason: collision with other inner class name */
        public static final class C0079c extends a {
            public final androidx.work.b a;

            public C0079c() {
                this(androidx.work.b.c);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0079c.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((C0079c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode() + (C0079c.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Success {mOutputData=" + this.a + '}';
            }

            public C0079c(androidx.work.b bVar) {
                this.a = bVar;
            }
        }
    }
}
