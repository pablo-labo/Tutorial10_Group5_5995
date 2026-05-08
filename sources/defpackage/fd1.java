package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fd1 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pif b;

    public /* synthetic */ fd1(pif pifVar, int i) {
        this.a = i;
        this.b = pifVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        kif kifVar;
        int i = this.a;
        pif pifVar = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(pifVar != null ? ((Boolean) new fd1(pifVar, 1).invoke()).booleanValue() : false);
            default:
                le0 le0Var = pifVar.b;
                mif mifVar = (mif) ((gme) pifVar.a).getValue();
                return Boolean.valueOf(wl7.b(le0Var, (mifVar == null || (kifVar = mifVar.a) == null) ? null : kifVar.a));
        }
    }
}
