package defpackage;

import androidx.fragment.app.g;
import defpackage.gs7;
import defpackage.js7;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class syb implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ wu5 c;

    public /* synthetic */ syb(g gVar, wu5 wu5Var, int i) {
        this.a = i;
        this.b = gVar;
        this.c = wu5Var;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        wu5 wu5Var = this.c;
        g gVar = this.b;
        switch (i) {
            case 0:
                vr7 vr7Var = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU = gVar.u();
                lr5VarU.getClass();
                vr7Var.a(lr5VarU, new gs7.d(null, new g0c(wu5Var, 0)));
                break;
            default:
                vr7 vr7Var2 = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU2 = gVar.u();
                lr5VarU2.getClass();
                vr7Var2.a(lr5VarU2, new gs7.d(new js7(ut0.I0(new js7.a[]{js7.a.b, js7.a.a})), new mzb(wu5Var, 2)));
                break;
        }
        return j6g.a;
    }
}
