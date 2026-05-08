package defpackage;

import androidx.fragment.app.g;
import defpackage.gs7;
import defpackage.ls7;
import defpackage.os7;
import defpackage.ur7;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pyb implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ wu5 c;

    public /* synthetic */ pyb(g gVar, wu5 wu5Var, int i) {
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
                vr7Var.a(lr5VarU, new gs7.e(new ls7(u63.Z("Atlanta, GA"), ls7.a.c), new qzb(wu5Var, 0)));
                break;
            default:
                vr7 vr7Var2 = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU2 = gVar.u();
                lr5VarU2.getClass();
                vr7Var2.b(lr5VarU2, new os7.b(null, new lr(wu5Var, 9)), ur7.a.a);
                break;
        }
        return j6g.a;
    }
}
