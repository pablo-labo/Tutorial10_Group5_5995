package defpackage;

import defpackage.iad;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class sp8 implements Function1 {
    public static final sp8 b = new sp8(0);
    public static final sp8 c = new sp8(1);
    public static final sp8 d = new sp8(2);
    public static final sp8 e = new sp8(3);
    public static final sp8 f = new sp8(4);
    public final /* synthetic */ int a;

    public /* synthetic */ sp8(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                int i = up8.p;
                v62 v62VarD = ((ui8) obj).M0().d();
                if (v62VarD instanceof t52) {
                    return (t52) v62VarD;
                }
                return null;
            case 1:
                lya lyaVar = (lya) obj;
                lyaVar.getClass();
                return lyaVar.h();
            case 2:
                ei8 ei8Var = (ei8) obj;
                iad.a aVar = iad.a.c;
                ei8Var.getClass();
                return ei8Var.t(bnb.BOOLEAN);
            case 3:
                v62 v62VarD2 = ((p7g) obj).M0().d();
                if (v62VarD2 == null) {
                    return Boolean.FALSE;
                }
                n8a name = v62VarD2.getName();
                mq5 mq5Var = iw7.f;
                return Boolean.valueOf(wl7.b(name, mq5Var.a.f()) && wl7.b(b04.c(v62VarD2), mq5Var));
            default:
                hv1 hv1Var = (hv1) obj;
                hv1Var.getClass();
                return Boolean.valueOf(nn2.p(b04.i(hv1Var)));
        }
    }
}
