package defpackage;

import androidx.compose.material.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class za3 implements gu5 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ hw9 b;
    public final /* synthetic */ e13 c;

    public /* synthetic */ za3(e13 e13Var, hw9 hw9Var) {
        this.c = e13Var;
        this.b = hw9Var;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        e13 e13Var = this.c;
        hw9 hw9Var = this.b;
        switch (i) {
            case 0:
                u63.Y(e13Var, null, null, new cb3(hw9Var, null), 3);
                break;
            default:
                if (hw9Var.c.d.invoke(iw9.a).booleanValue()) {
                    u63.Y(e13Var, null, null, new a.C0016a(hw9Var, null), 3);
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ za3(hw9 hw9Var, e13 e13Var) {
        this.b = hw9Var;
        this.c = e13Var;
    }
}
