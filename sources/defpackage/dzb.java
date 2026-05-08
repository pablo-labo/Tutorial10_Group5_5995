package defpackage;

import androidx.fragment.app.g;
import defpackage.gs7;
import defpackage.ns7;
import defpackage.ur7;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dzb implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ wu5 c;

    public /* synthetic */ dzb(g gVar, wu5 wu5Var, int i) {
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
                ds7 ds7Var = ds7.a;
                vr7Var.e(lr5VarU, "ProfileUIPlatformDebugScreen", new ns7.f(new bs7("US", "AI BRANCH", "AI RANK", new sr7(new rr7(ds7Var, 2022), Boolean.FALSE, new rr7(ds7Var, 2023)), "AI DESCRIPTION"), new zzb(wu5Var, 1)), ur7.b.a);
                break;
            default:
                vr7 vr7Var2 = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU2 = gVar.u();
                lr5VarU2.getClass();
                vr7Var2.a(lr5VarU2, new gs7.i(null, new l0c(wu5Var, 0)));
                break;
        }
        return j6g.a;
    }
}
