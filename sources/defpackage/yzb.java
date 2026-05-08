package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yzb implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wu5 b;

    public /* synthetic */ yzb(wu5 wu5Var, int i) {
        this.a = i;
        this.b = wu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        wu5 wu5Var = this.b;
        hs7 hs7Var = (hs7) obj;
        switch (i) {
            case 0:
                hs7Var.getClass();
                wu5Var.q(hs7Var, (ls7) obj2, "Relocation");
                break;
            default:
                hs7Var.getClass();
                wu5Var.q(hs7Var, (cs7) obj2, "Minimum Base Pay");
                break;
        }
        return j6g.a;
    }
}
