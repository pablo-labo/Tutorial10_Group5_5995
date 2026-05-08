package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ise {
    public rx4 a;
    public ise b;
    public nse c;
    public cse d;

    public final synchronized cse a() {
        cse cseVarJ;
        try {
            if (this.d == null && this.c != null) {
                ise iseVar = this.b;
                cse cseVarA = iseVar != null ? iseVar.a() : null;
                rx4 rx4Var = this.a;
                if (rx4Var != null) {
                    nse nseVar = this.c;
                    nseVar.getClass();
                    cseVarJ = nseVar.j(rx4Var, cseVarA);
                } else {
                    cseVarJ = null;
                }
                this.d = cseVarJ;
                this.a = null;
                this.b = null;
                this.c = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.d;
    }
}
