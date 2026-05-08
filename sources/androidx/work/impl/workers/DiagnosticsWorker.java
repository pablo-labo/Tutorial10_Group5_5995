package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.a3h;
import defpackage.a4h;
import defpackage.c44;
import defpackage.s3h;
import defpackage.v2f;
import defpackage.w2h;
import defpackage.z39;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final c.a doWork() {
        w2h w2hVarA = w2h.a(getApplicationContext());
        w2hVarA.getClass();
        WorkDatabase workDatabase = w2hVarA.c;
        workDatabase.getClass();
        s3h s3hVarD = workDatabase.D();
        a3h a3hVarB = workDatabase.B();
        a4h a4hVarE = workDatabase.E();
        v2f v2fVarA = workDatabase.A();
        ArrayList arrayListD = s3hVarD.d(System.currentTimeMillis() - 86400000);
        ArrayList arrayListS = s3hVarD.s();
        ArrayList arrayListN = s3hVarD.n();
        if (!arrayListD.isEmpty()) {
            z39 z39VarD = z39.d();
            String str = c44.a;
            z39VarD.e(str, "Recently completed work:\n\n");
            z39.d().e(str, c44.a(a3hVarB, a4hVarE, v2fVarA, arrayListD));
        }
        if (!arrayListS.isEmpty()) {
            z39 z39VarD2 = z39.d();
            String str2 = c44.a;
            z39VarD2.e(str2, "Running work:\n\n");
            z39.d().e(str2, c44.a(a3hVarB, a4hVarE, v2fVarA, arrayListS));
        }
        if (!arrayListN.isEmpty()) {
            z39 z39VarD3 = z39.d();
            String str3 = c44.a;
            z39VarD3.e(str3, "Enqueued work:\n\n");
            z39.d().e(str3, c44.a(a3hVarB, a4hVarE, v2fVarA, arrayListN));
        }
        return new c.a.C0079c();
    }
}
