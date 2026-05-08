package defpackage;

import androidx.fragment.app.g;
import defpackage.ns7;
import defpackage.ur7;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bzb implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ svb c;
    public final /* synthetic */ wu5 d;

    public /* synthetic */ bzb(int i, wu5 wu5Var, svb svbVar, g gVar) {
        this.a = i;
        this.b = gVar;
        this.c = svbVar;
        this.d = wu5Var;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        wu5 wu5Var = this.d;
        svb svbVar = this.c;
        g gVar = this.b;
        switch (i) {
            case 0:
                vr7 vr7Var = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU = gVar.u();
                lr5VarU.getClass();
                ns7.c cVar = new ns7.c(null, new f0c(wu5Var, 0));
                jo4 jo4Var = (jo4) z92.P0(svbVar.z.values());
                vr7Var.e(lr5VarU, "ProfileUIPlatformDebugScreen", cVar, new ur7.c(jo4Var != null ? jo4Var.a : ""));
                break;
            default:
                vr7 vr7Var2 = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU2 = gVar.u();
                lr5VarU2.getClass();
                ns7.e eVar = new ns7.e(null, new tzb(wu5Var, 0));
                ux8 ux8Var = (ux8) z92.P0(svbVar.b0.values());
                vr7Var2.e(lr5VarU2, "ProfileUIPlatformDebugScreen", eVar, new ur7.c(ux8Var != null ? ux8Var.a : ""));
                break;
        }
        return j6g.a;
    }
}
