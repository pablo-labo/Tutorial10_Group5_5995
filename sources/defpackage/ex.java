package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ex implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ ex(int i, g4a g4aVar) {
        this.a = i;
        this.b = g4aVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        g4a g4aVar = this.b;
        switch (i) {
            case 0:
                g4aVar.setValue(null);
                return j6g.a;
            case 1:
                g4aVar.setValue(Boolean.FALSE);
                return j6g.a;
            default:
                sl8 sl8Var = (sl8) g4aVar.getValue();
                if (sl8Var != null) {
                    return sl8Var;
                }
                de7.d("Required value was null.");
                r40.e();
                return null;
        }
    }
}
