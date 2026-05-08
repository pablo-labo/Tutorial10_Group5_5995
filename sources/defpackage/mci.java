package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class mci extends m0i {
    public kki c;
    public final tdi d;
    public final mdi e;
    public final de6 f;

    public mci(i0i i0iVar) {
        super(i0iVar);
        this.d = new tdi(this);
        this.e = new mdi(this);
        this.f = new de6(this);
    }

    @Override // defpackage.m0i
    public final boolean m() {
        return false;
    }

    public final void n() {
        b();
        if (this.c == null) {
            this.c = new kki(Looper.getMainLooper());
        }
    }
}
