package defpackage;

import defpackage.uc7;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qc7 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e13 b;
    public final /* synthetic */ hw9 c;
    public final /* synthetic */ gu5 d;

    public /* synthetic */ qc7(e13 e13Var, hw9 hw9Var, gu5 gu5Var, int i) {
        this.a = i;
        this.b = e13Var;
        this.c = hw9Var;
        this.d = gu5Var;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        switch (this.a) {
            case 0:
                u63.Y(this.b, null, null, new uc7.a(this.c, this.d, null), 3);
                break;
            default:
                u63.Y(this.b, null, null, new u6d(this.c, this.d, null), 3);
                break;
        }
        return j6g.a;
    }
}
