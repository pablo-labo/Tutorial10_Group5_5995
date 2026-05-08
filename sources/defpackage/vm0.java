package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vm0 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu5 b;
    public final /* synthetic */ g4a c;

    public /* synthetic */ vm0(gu5 gu5Var, g4a g4aVar, int i) {
        this.a = i;
        this.b = gu5Var;
        this.c = g4aVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        g4a g4aVar = this.c;
        gu5 gu5Var = this.b;
        switch (i) {
            case 0:
                gu5Var.invoke();
                g4aVar.setValue(dqd.a);
                break;
            default:
                g4aVar.setValue(Boolean.FALSE);
                gu5Var.invoke();
                break;
        }
        return j6g.a;
    }
}
