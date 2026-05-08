package defpackage;

import defpackage.grg;

/* JADX INFO: loaded from: classes2.dex */
public final class iud extends grg.d {
    public final qsc b;
    public final mga c;
    public final mfa d;
    public final wrb e;
    public final m19 f;
    public final ytd g;

    public iud(tga tgaVar, mga mgaVar, mfa mfaVar, qga qgaVar, m19 m19Var, ytd ytdVar) {
        tgaVar.getClass();
        mgaVar.getClass();
        qgaVar.getClass();
        this.b = tgaVar;
        this.c = mgaVar;
        this.d = mfaVar;
        this.e = qgaVar;
        this.f = m19Var;
        this.g = ytdVar;
    }

    @Override // grg.d, grg.c
    public final <T extends brg> T c(Class<T> cls) {
        return new cud(this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
