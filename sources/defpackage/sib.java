package defpackage;

import defpackage.cfe;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class sib implements Function1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ sib(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                cfe.a.C0106a c0106a = (cfe.a.C0106a) obj;
                c0106a.getClass();
                c0106a.c((String) obj2, zib.b);
                return j6g.a;
            case 1:
                cfe.a.C0106a c0106a2 = (cfe.a.C0106a) obj;
                c0106a2.getClass();
                rw7 rw7Var = zib.b;
                c0106a2.a((String) obj2, rw7Var, rw7Var);
                return j6g.a;
            default:
                ap8 ap8Var = (ap8) obj2;
                ((bj8) obj).getClass();
                return new gp8(ap8Var.Y, ap8Var, ap8Var.W, ap8Var.X != null, ap8Var.f0);
        }
    }
}
