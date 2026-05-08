package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uc1 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ uc1(int i, g4a g4aVar) {
        this.a = i;
        this.b = g4aVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        g4a g4aVar = this.b;
        switch (i) {
            case 0:
                sl8 sl8Var = (sl8) g4aVar.getValue();
                if (sl8Var == null) {
                    de7.d("Required value was null.");
                    r40.e();
                    break;
                }
                break;
            case 1:
                g4aVar.setValue(Boolean.TRUE);
                break;
            case 2:
                g4aVar.setValue(Boolean.TRUE);
                break;
            case 3:
                g4aVar.setValue(Boolean.TRUE);
                break;
            case 4:
                g4aVar.setValue(Boolean.FALSE);
                break;
            default:
                g4aVar.setValue(Boolean.FALSE);
                break;
        }
        return j6g.a;
    }
}
