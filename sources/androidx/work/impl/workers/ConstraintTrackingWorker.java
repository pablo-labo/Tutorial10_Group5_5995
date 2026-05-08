package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import defpackage.dq2;
import defpackage.fbe;
import defpackage.fq2;
import defpackage.hz8;
import defpackage.j6g;
import defpackage.r3h;
import defpackage.y1h;
import defpackage.z39;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/c;", "Ly1h;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ConstraintTrackingWorker extends c implements y1h {
    public final WorkerParameters a;
    public final Object b;
    public volatile boolean c;
    public final fbe<c.a> d;
    public c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.a = workerParameters;
        this.b = new Object();
        this.d = new fbe<>();
    }

    @Override // defpackage.y1h
    public final void a(List<r3h> list) {
        list.getClass();
        z39.d().a(fq2.a, "Constraints changed for " + list);
        synchronized (this.b) {
            this.c = true;
            j6g j6gVar = j6g.a;
        }
    }

    @Override // defpackage.y1h
    public final void f(List<r3h> list) {
    }

    @Override // androidx.work.c
    public final void onStopped() {
        super.onStopped();
        c cVar = this.e;
        if (cVar == null || cVar.isStopped()) {
            return;
        }
        cVar.stop();
    }

    @Override // androidx.work.c
    public final hz8<c.a> startWork() {
        getBackgroundExecutor().execute(new dq2(this, 0));
        fbe<c.a> fbeVar = this.d;
        fbeVar.getClass();
        return fbeVar;
    }
}
