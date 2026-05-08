package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class k9h extends kch {
    public final ot0 e;
    public final qa6 f;

    public k9h(vv8 vv8Var, qa6 qa6Var, na6 na6Var) {
        super(vv8Var, na6Var);
        this.e = new ot0(0);
        this.f = qa6Var;
        this.mLifecycleFragment.c("ConnectionlessLifecycleHelper", this);
    }

    @Override // defpackage.nv8
    public final void onResume() {
        super.onResume();
        if (this.e.isEmpty()) {
            return;
        }
        this.f.a(this);
    }

    @Override // defpackage.kch, defpackage.nv8
    public final void onStart() {
        super.onStart();
        if (this.e.isEmpty()) {
            return;
        }
        this.f.a(this);
    }

    @Override // defpackage.kch, defpackage.nv8
    public final void onStop() {
        super.onStop();
        qa6 qa6Var = this.f;
        qa6Var.getClass();
        synchronized (qa6.g0) {
            try {
                if (qa6Var.Z == this) {
                    qa6Var.Z = null;
                    qa6Var.a0.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
