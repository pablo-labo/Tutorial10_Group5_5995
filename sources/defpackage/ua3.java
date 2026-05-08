package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ua3 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e13 b;
    public final /* synthetic */ hw9 c;

    public /* synthetic */ ua3(e13 e13Var, hw9 hw9Var, int i) {
        this.a = i;
        this.b = e13Var;
        this.c = hw9Var;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        hw9 hw9Var = this.c;
        e13 e13Var = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                u63.Y(e13Var, null, null, new tc7(hw9Var, null), 3);
                break;
            case 2:
                u63.Y(e13Var, null, null, new a7a(hw9Var, null), 3);
                break;
            default:
                u63.Y(e13Var, null, null, new t6d(hw9Var, null), 3);
                break;
        }
        return j6g.a;
    }
}
