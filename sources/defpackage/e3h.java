package defpackage;

import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class e3h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e3h(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        r3h r3hVarI;
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                fbe fbeVar = (fbe) obj;
                UUID uuid = (UUID) obj3;
                String string = uuid.toString();
                z39 z39VarD = z39.d();
                String str = f3h.c;
                StringBuilder sb = new StringBuilder("Updating progress for ");
                sb.append(uuid);
                sb.append(" (");
                b bVar = (b) obj2;
                sb.append(bVar);
                sb.append(")");
                z39VarD.a(str, sb.toString());
                f3h f3hVar = (f3h) obj4;
                WorkDatabase workDatabase = f3hVar.a;
                WorkDatabase workDatabase2 = f3hVar.a;
                workDatabase.c();
                try {
                    r3hVarI = workDatabase2.D().i(string);
                } finally {
                    try {
                    } finally {
                    }
                    break;
                }
                if (r3hVarI == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (r3hVarI.b == s2h.b) {
                    workDatabase2.C().b(new b3h(string, bVar));
                } else {
                    z39.d().g(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
                }
                fbeVar.i(null);
                workDatabase2.w();
                return;
            default:
                y8i y8iVarM = ((AppMeasurementDynamiteService) obj4).a.m();
                y8iVarM.b();
                y8iVarM.k();
                y8iVarM.p(new gbi(y8iVarM, (String) obj2, (String) obj, y8iVarM.n(false), (gmi) obj3));
                return;
        }
    }
}
