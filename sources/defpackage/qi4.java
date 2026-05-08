package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qi4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f51 b;

    public /* synthetic */ qi4(f51 f51Var, int i) {
        this.a = i;
        this.b = f51Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        f51 f51Var = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                f51Var.n(str);
                break;
            default:
                str.getClass();
                f51Var.p(str);
                break;
        }
        return j6g.a;
    }
}
