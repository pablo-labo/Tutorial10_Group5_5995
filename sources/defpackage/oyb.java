package defpackage;

import androidx.fragment.app.g;
import defpackage.cs7;
import defpackage.gs7;
import defpackage.ns7;
import defpackage.ur7;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oyb implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ wu5 c;

    public /* synthetic */ oyb(g gVar, wu5 wu5Var, int i) {
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
                vr7Var.e(lr5VarU, "ProfileUIPlatformDebugScreen", new ns7.a(new pr7("AI TITLE", new rr7(ds7.a, 2024), "AI DESCRIPTION"), new ozb(wu5Var, 2)), ur7.b.a);
                break;
            default:
                vr7 vr7Var2 = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU2 = gVar.u();
                lr5VarU2.getClass();
                vr7Var2.a(lr5VarU2, new gs7.b(new cs7(Double.valueOf(30.0d), "US", cs7.a.a), new c0c(wu5Var, 0)));
                break;
        }
        return j6g.a;
    }
}
