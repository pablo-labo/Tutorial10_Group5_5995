package defpackage;

import androidx.compose.material.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pc7 implements gu5 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ hw9 b;
    public final /* synthetic */ e13 c;

    public /* synthetic */ pc7(e13 e13Var, hw9 hw9Var) {
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
                u63.Y(e13Var, null, null, new sc7(hw9Var, null), 3);
                return j6g.a;
            default:
                if (hw9Var.c.d.invoke(iw9.c).booleanValue()) {
                    u63.Y(e13Var, null, null, new a.d(hw9Var, null), 3);
                }
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ pc7(hw9 hw9Var, e13 e13Var) {
        this.b = hw9Var;
        this.c = e13Var;
    }
}
