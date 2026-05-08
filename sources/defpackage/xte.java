package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class xte implements Runnable {
    public static final String d = z39.f("StopWorkRunnable");
    public final w2h a;
    public final tre b;
    public final boolean c;

    public xte(w2h w2hVar, tre treVar, boolean z) {
        this.a = w2hVar;
        this.b = treVar;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zC;
        t4h t4hVar;
        boolean z = this.c;
        w2h w2hVar = this.a;
        if (z) {
            kob kobVar = w2hVar.f;
            tre treVar = this.b;
            kobVar.getClass();
            String str = treVar.a.a;
            synchronized (kobVar.a0) {
                try {
                    z39.d().a(kob.b0, "Processor stopping foreground work " + str);
                    t4hVar = (t4h) kobVar.f.remove(str);
                    if (t4hVar != null) {
                        kobVar.W.remove(str);
                    }
                } finally {
                }
            }
            zC = kob.c(t4hVar, str);
        } else {
            kob kobVar2 = w2hVar.f;
            tre treVar2 = this.b;
            kobVar2.getClass();
            String str2 = treVar2.a.a;
            synchronized (kobVar2.a0) {
                try {
                    t4h t4hVar2 = (t4h) kobVar2.V.remove(str2);
                    if (t4hVar2 == null) {
                        z39.d().a(kob.b0, "WorkerWrapper could not be found for " + str2);
                    } else {
                        Set set = (Set) kobVar2.W.get(str2);
                        if (set != null && set.contains(treVar2)) {
                            z39.d().a(kob.b0, "Processor stopping background work " + str2);
                            kobVar2.W.remove(str2);
                            zC = kob.c(t4hVar2, str2);
                        }
                    }
                    zC = false;
                } finally {
                }
            }
        }
        z39.d().a(d, "StopWorkRunnable for " + this.b.a.a + "; Processor.stopWork = " + zC);
    }
}
