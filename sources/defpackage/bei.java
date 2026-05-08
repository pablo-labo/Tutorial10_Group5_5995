package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bei extends c1i {
    public final fei b;
    public boolean c;

    public bei(fei feiVar) {
        super(feiVar.X, 1);
        this.b = feiVar;
        feiVar.c0++;
    }

    public final void g() {
        if (this.c) {
            return;
        }
        r6.g("Not initialized");
    }

    public final void h() {
        if (this.c) {
            r6.g("Can't initialize twice");
            return;
        }
        i();
        this.b.d0++;
        this.c = true;
    }

    public abstract boolean i();

    public final nei j() {
        nei neiVar = this.b.V;
        fei.v(neiVar);
        return neiVar;
    }

    public final szh k() {
        szh szhVar = this.b.a;
        fei.v(szhVar);
        return szhVar;
    }
}
