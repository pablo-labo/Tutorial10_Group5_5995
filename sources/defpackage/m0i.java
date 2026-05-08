package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m0i extends srh {
    public boolean b;

    public m0i(i0i i0iVar) {
        super(i0iVar, 1);
        this.a.s0++;
    }

    public final void k() {
        if (this.b) {
            return;
        }
        r6.g("Not initialized");
    }

    public final void l() {
        if (this.b) {
            r6.g("Can't initialize twice");
        } else {
            if (m()) {
                return;
            }
            this.a.t0.incrementAndGet();
            this.b = true;
        }
    }

    public abstract boolean m();
}
