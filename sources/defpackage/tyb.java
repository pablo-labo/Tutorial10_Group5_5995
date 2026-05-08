package defpackage;

import androidx.fragment.app.g;
import defpackage.ns7;
import defpackage.os7;
import defpackage.ur7;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tyb implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ wu5 c;

    public /* synthetic */ tyb(g gVar, wu5 wu5Var, int i) {
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
                vr7Var.e(lr5VarU, "ProfileUIPlatformDebugScreen", new ns7.h(new ks7("AI TITLE", "www.aigenerated.com", new rr7(ds7.a, 2024), "AI DESCRIPTION"), new nzb(wu5Var, 0)), ur7.b.a);
                break;
            default:
                vr7 vr7Var2 = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU2 = gVar.u();
                lr5VarU2.getClass();
                vr7Var2.b(lr5VarU2, new os7.g(null, new kzb(wu5Var, 1)), ur7.a.a);
                break;
        }
        return j6g.a;
    }
}
