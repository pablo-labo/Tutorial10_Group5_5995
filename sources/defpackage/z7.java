package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z7 extends y7 {
    public long G0;

    @Override // defpackage.qpg
    public final void U() {
        long j;
        synchronized (this) {
            j = this.G0;
            this.G0 = 0L;
        }
        oc9 oc9Var = this.E0;
        long j2 = j & 3;
        int i = (j2 == 0 || oc9Var == null) ? 0 : oc9Var.a;
        if (j2 != 0) {
            yog.a(this.D0, i);
        }
    }

    @Override // defpackage.qpg
    public final boolean V() {
        synchronized (this) {
            try {
                return this.G0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qpg
    public final boolean Y(Object obj, int i, int i2) {
        return false;
    }

    @Override // defpackage.y7
    public final void e0(oc9 oc9Var) {
        this.E0 = oc9Var;
        synchronized (this) {
            this.G0 |= 1;
        }
        K(1);
        a0();
    }
}
