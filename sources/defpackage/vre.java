package defpackage;

import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes.dex */
public final class vre implements Runnable {
    public w2h a;
    public tre b;
    public WorkerParameters.a c;

    @Override // java.lang.Runnable
    public final void run() {
        this.a.f.h(this.b, this.c);
    }
}
