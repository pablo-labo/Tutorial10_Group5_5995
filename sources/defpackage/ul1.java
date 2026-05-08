package defpackage;

import defpackage.gs2;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ul1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu5 b;

    public /* synthetic */ ul1(int i, gu5 gu5Var) {
        this.a = i;
        this.b = gu5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        gu5 gu5Var = this.b;
        switch (i) {
            case 0:
                iw9 iw9Var = (iw9) obj;
                iw9Var.getClass();
                if (iw9Var == iw9.a) {
                    gu5Var.invoke();
                }
                return Boolean.TRUE;
            default:
                ((m74) obj).getClass();
                return new gs2.c(gu5Var);
        }
    }
}
