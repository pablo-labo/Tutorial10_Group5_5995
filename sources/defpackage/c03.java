package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c03 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ese b;

    public /* synthetic */ c03(ese eseVar, int i) {
        this.a = i;
        this.b = eseVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        ese eseVar = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) eseVar.getValue();
                bool.booleanValue();
                return bool;
            default:
                de0 de0Var = a4e.a;
                return new ooa(((ooa) eseVar.getValue()).a);
        }
    }
}
