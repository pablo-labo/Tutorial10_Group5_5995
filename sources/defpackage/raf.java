package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class raf extends naf {
    public final Runnable c;

    public raf(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(pi3.f(runnable));
        sb.append(", ");
        sb.append(this.a);
        sb.append(", ");
        return w40.f(sb, this.b ? "Blocking" : "Non-blocking", ']');
    }
}
