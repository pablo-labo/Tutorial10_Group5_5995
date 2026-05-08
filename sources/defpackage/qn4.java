package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qn4 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ gu5 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qn4(boolean z, gu5 gu5Var, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = gu5Var;
        this.d = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        gu5 gu5Var = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                g4a g4aVar = (g4a) obj;
                if (z) {
                    g4aVar.setValue(Boolean.TRUE);
                } else {
                    gu5Var.invoke();
                }
                break;
            case 1:
                g4a g4aVar2 = (g4a) obj;
                if (z) {
                    g4aVar2.setValue(Boolean.TRUE);
                } else {
                    gu5Var.invoke();
                }
                break;
            default:
                gu5 gu5Var2 = (gu5) obj;
                if (z) {
                    gu5Var.invoke();
                } else {
                    gu5Var2.invoke();
                }
                break;
        }
        return j6g.a;
    }
}
