package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d05 extends y03 {
    public static final /* synthetic */ int f = 0;
    public long c;
    public boolean d;
    public zs0<x64<?>> e;

    @Override // defpackage.y03
    public final y03 E1(int i) {
        h4.g(i);
        return this;
    }

    public final void J1(boolean z) {
        long j = this.c - (z ? 4294967296L : 1L);
        this.c = j;
        if (j <= 0 && this.d) {
            shutdown();
        }
    }

    public final void L1(x64<?> x64Var) {
        zs0<x64<?>> zs0Var = this.e;
        if (zs0Var == null) {
            zs0Var = new zs0<>();
            this.e = zs0Var;
        }
        zs0Var.addLast(x64Var);
    }

    public final void O1(boolean z) {
        this.c = (z ? 4294967296L : 1L) + this.c;
        if (z) {
            return;
        }
        this.d = true;
    }

    public long R1() {
        return !S1() ? Long.MAX_VALUE : 0L;
    }

    public final boolean S1() {
        zs0<x64<?>> zs0Var = this.e;
        if (zs0Var == null) {
            return false;
        }
        x64<?> x64VarRemoveFirst = zs0Var.isEmpty() ? null : zs0Var.removeFirst();
        if (x64VarRemoveFirst == null) {
            return false;
        }
        x64VarRemoveFirst.run();
        return true;
    }

    public void shutdown() {
    }
}
