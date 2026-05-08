package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qzb implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wu5 b;

    public /* synthetic */ qzb(wu5 wu5Var, int i) {
        this.a = i;
        this.b = wu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        wu5 wu5Var = this.b;
        switch (i) {
            case 0:
                hs7 hs7Var = (hs7) obj;
                hs7Var.getClass();
                wu5Var.q(hs7Var, (ls7) obj2, "Relocation");
                break;
            case 1:
                ps7 ps7Var = (ps7) obj;
                ps7Var.getClass();
                wu5Var.q(ps7Var, (xr7) obj2, "Group");
                break;
            default:
                ps7 ps7Var2 = (ps7) obj;
                ps7Var2.getClass();
                wu5Var.q(ps7Var2, (fs7) obj2, "Contact Information");
                break;
        }
        return j6g.a;
    }
}
