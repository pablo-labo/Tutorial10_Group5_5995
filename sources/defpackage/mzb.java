package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mzb implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wu5 b;

    public /* synthetic */ mzb(wu5 wu5Var, int i) {
        this.a = i;
        this.b = wu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        wu5 wu5Var = this.b;
        switch (i) {
            case 0:
                ps7 ps7Var = (ps7) obj;
                ps7Var.getClass();
                wu5Var.q(ps7Var, (List) obj2, "Skills List");
                break;
            case 1:
                ps7 ps7Var2 = (ps7) obj;
                ps7Var2.getClass();
                wu5Var.q(ps7Var2, (vs7) obj2, "Work Experience");
                break;
            default:
                hs7 hs7Var = (hs7) obj;
                hs7Var.getClass();
                wu5Var.q(hs7Var, (js7) obj2, "Job Type");
                break;
        }
        return j6g.a;
    }
}
