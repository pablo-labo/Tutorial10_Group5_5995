package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d4h {
    public static final String e = z39.f("WorkTimer");
    public final md2 a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final Object d = new Object();

    public interface a {
        void b(r2h r2hVar);
    }

    public static class b implements Runnable {
        public final d4h a;
        public final r2h b;

        public b(d4h d4hVar, r2h r2hVar) {
            this.a = d4hVar;
            this.b = r2hVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.a.d) {
                try {
                    if (((b) this.a.b.remove(this.b)) != null) {
                        a aVar = (a) this.a.c.remove(this.b);
                        if (aVar != null) {
                            aVar.b(this.b);
                        }
                    } else {
                        z39.d().a("WrkTimerRunnable", "Timer with " + this.b + " is already marked as complete.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public d4h(md2 md2Var) {
        this.a = md2Var;
    }

    public final void a(r2h r2hVar) {
        synchronized (this.d) {
            try {
                if (((b) this.b.remove(r2hVar)) != null) {
                    z39.d().a(e, "Stopping timer for " + r2hVar);
                    this.c.remove(r2hVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
