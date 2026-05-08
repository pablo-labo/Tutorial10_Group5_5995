package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j0c implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wu5 b;

    public /* synthetic */ j0c(wu5 wu5Var, int i) {
        this.a = i;
        this.b = wu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        wu5 wu5Var = this.b;
        ps7 ps7Var = (ps7) obj;
        switch (i) {
            case 0:
                ps7Var.getClass();
                wu5Var.q(ps7Var, (zr7) obj2, "Link");
                break;
            default:
                ps7Var.getClass();
                wu5Var.q(ps7Var, (pr7) obj2, "Award");
                break;
        }
        return j6g.a;
    }
}
