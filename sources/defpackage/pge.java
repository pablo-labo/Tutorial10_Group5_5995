package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pge extends ot3 {
    public final gwf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pge(mge mgeVar, gwf gwfVar) {
        super(mgeVar);
        gwfVar.getClass();
        this.c = gwfVar;
    }

    @Override // defpackage.nt3, defpackage.ui8
    public final gwf L0() {
        return this.c;
    }

    @Override // defpackage.nt3
    public final nt3 X0(mge mgeVar) {
        return new pge(mgeVar, this.c);
    }
}
