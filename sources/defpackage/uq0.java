package defpackage;

import defpackage.cfe;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class uq0 implements Function1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ uq0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ArrayList) obj2).get(((Number) obj).intValue());
                return null;
            case 1:
                n8a n8aVar = (n8a) obj;
                yx9 yx9VarL = ((ei8) obj2).l();
                mq5 mq5Var = ere.l;
                in9 in9VarN = yx9VarL.S(mq5Var).n();
                if (in9VarN == null) {
                    ei8.a(11);
                    throw null;
                }
                v62 v62VarD = ((d4) in9VarN).d(n8aVar, dia.a);
                if (v62VarD == null) {
                    ja.p("Built-in class ", mq5Var.a(n8aVar), " is not found");
                    return null;
                }
                if (v62VarD instanceof t52) {
                    return (t52) v62VarD;
                }
                throw new AssertionError("Must be a class descriptor " + n8aVar + ", but was " + v62VarD);
            case 2:
                cfe.a.C0106a c0106a = (cfe.a.C0106a) obj;
                c0106a.getClass();
                rw7 rw7Var = zib.b;
                c0106a.a((String) obj2, rw7Var, rw7Var, rw7Var, rw7Var);
                return j6g.a;
            default:
                hv1 hv1Var = (hv1) obj;
                hv1Var.getClass();
                ui8 type = hv1Var.i().get(((rlg) obj2).getIndex()).getType();
                type.getClass();
                return type;
        }
    }
}
