package defpackage;

import androidx.fragment.app.g;
import defpackage.gs7;
import defpackage.os7;
import defpackage.ur7;
import defpackage.xs7;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fzb implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ wu5 c;

    public /* synthetic */ fzb(g gVar, wu5 wu5Var, int i) {
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
                vr7Var.b(lr5VarU, new os7.d(new qs7("TEST SKILL", 5, new ts7(null, null, "TEST SKILL", "TEST SKILL", null)), new kzb(wu5Var, 0)), ur7.b.a);
                break;
            default:
                vr7 vr7Var2 = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU2 = gVar.u();
                lr5VarU2.getClass();
                vr7Var2.a(lr5VarU2, new gs7.f(new xs7(pi3.k(xs7.a.c)), new xzb(wu5Var, 1)));
                break;
        }
        return j6g.a;
    }
}
