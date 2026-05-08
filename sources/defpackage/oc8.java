package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class oc8 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ oc8(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                pc8 pc8Var = (pc8) obj2;
                yx9 yx9VarL = pc8Var.l();
                yx9VarL.getClass();
                return new rc8(yx9VarL, (j29) obj, new x04(pc8Var, 1));
            default:
                ((Function1) obj2).invoke(((lsc) obj).a);
                return j6g.a;
        }
    }
}
