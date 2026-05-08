package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import androidx.work.c;
import defpackage.f2;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class o2h implements Runnable {
    public static final String V = z39.f("WorkForegroundRunnable");
    public final fbe<Void> a = new fbe<>();
    public final Context b;
    public final r3h c;
    public final c d;
    public final q2h e;
    public final qaf f;

    public class a implements Runnable {
        public final /* synthetic */ fbe a;

        public a(fbe fbeVar) {
            this.a = fbeVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            if (o2h.this.a.a instanceof f2.b) {
                return;
            }
            try {
                hp5 hp5Var = (hp5) this.a.get();
                if (hp5Var == null) {
                    throw new IllegalStateException("Worker was marked important (" + o2h.this.c.c + ") but did not provide ForegroundInfo");
                }
                z39.d().a(o2h.V, "Updating notification for " + o2h.this.c.c);
                o2h o2hVar = o2h.this;
                fbe<Void> fbeVar = o2hVar.a;
                q2h q2hVar = o2hVar.e;
                Context context = o2hVar.b;
                UUID id = o2hVar.d.getId();
                q2hVar.getClass();
                fbe fbeVar2 = new fbe();
                q2hVar.a.a(new p2h(q2hVar, fbeVar2, id, hp5Var, context));
                fbeVar.k(fbeVar2);
            } catch (Throwable th) {
                o2h.this.a.j(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public o2h(Context context, r3h r3hVar, c cVar, q2h q2hVar, x2h x2hVar) {
        this.b = context;
        this.c = r3hVar;
        this.d = cVar;
        this.e = q2hVar;
        this.f = x2hVar;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public final void run() {
        if (!this.c.q || Build.VERSION.SDK_INT >= 31) {
            this.a.i(null);
            return;
        }
        fbe fbeVar = new fbe();
        x2h x2hVar = (x2h) this.f;
        x2hVar.c.execute(new gy0(6, this, fbeVar));
        fbeVar.a(new a(fbeVar), x2hVar.c);
    }
}
