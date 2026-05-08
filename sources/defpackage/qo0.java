package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qo0 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e13 b;
    public final /* synthetic */ hw9 c;

    public /* synthetic */ qo0(e13 e13Var, hw9 hw9Var, int i) {
        this.a = i;
        this.b = e13Var;
        this.c = hw9Var;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        switch (this.a) {
            case 0:
                u63.Y(this.b, null, null, new vo0(this.c, null), 3);
                break;
            default:
                u63.Y(this.b, null, null, new uja(this.c, null), 3);
                break;
        }
        return j6g.a;
    }
}
