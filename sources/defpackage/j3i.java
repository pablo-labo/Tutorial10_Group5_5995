package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j3i extends c1i {
    public boolean b;

    public j3i(i0i i0iVar) {
        super(i0iVar, 1);
        this.a.s0++;
    }

    public final void g() {
        if (this.b) {
            return;
        }
        r6.g("Not initialized");
    }

    public final void h() {
        if (this.b) {
            r6.g("Can't initialize twice");
        } else {
            if (i()) {
                return;
            }
            this.a.t0.incrementAndGet();
            this.b = true;
        }
    }

    public abstract boolean i();
}
