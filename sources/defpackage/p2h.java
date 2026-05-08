package defpackage;

import android.content.Context;
import defpackage.f2;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class p2h implements Runnable {
    public final /* synthetic */ fbe a;
    public final /* synthetic */ UUID b;
    public final /* synthetic */ hp5 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ q2h e;

    public p2h(q2h q2hVar, fbe fbeVar, UUID uuid, hp5 hp5Var, Context context) {
        this.e = q2hVar;
        this.a = fbeVar;
        this.b = uuid;
        this.c = hp5Var;
        this.d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.a.a instanceof f2.b)) {
                String string = this.b.toString();
                r3h r3hVarI = this.e.c.i(string);
                if (r3hVarI == null || r3hVarI.b.a()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ((kob) this.e.b).g(string, this.c);
                this.d.startService(q2f.c(this.d, yid.d(r3hVarI), this.c));
            }
            this.a.i(null);
        } catch (Throwable th) {
            this.a.j(th);
        }
    }
}
