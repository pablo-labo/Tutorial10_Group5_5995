package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h0c implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wu5 b;

    public /* synthetic */ h0c(wu5 wu5Var, int i) {
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
                wu5Var.q(ps7Var, (es7) obj2, "Patent");
                break;
            default:
                ps7Var.getClass();
                wu5Var.q(ps7Var, (bs7) obj2, "Military Service");
                break;
        }
        return j6g.a;
    }
}
