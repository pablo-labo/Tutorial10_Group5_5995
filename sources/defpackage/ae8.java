package defpackage;

import defpackage.lf8;
import defpackage.te8;

/* JADX INFO: loaded from: classes3.dex */
public final class ae8 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ae8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ke8 ke8Var = (ke8) obj;
                in9 in9VarL0 = ke8Var.getDescriptor().l0();
                in9VarL0.getClass();
                return ke8Var.x(in9VarL0, te8.c.b);
            case 1:
                return new lf8.a((lf8) obj);
            default:
                yo8 yo8Var = (yo8) obj;
                mq5 mq5VarH = yo8Var.h();
                fu7 fu7Var = yo8Var.b;
                mp8 mp8Var = yo8Var.a;
                if (mq5VarH == null) {
                    return lx4.c(kx4.r0, fu7Var.toString());
                }
                sv7 sv7Var = mp8Var.a;
                xx9 xx9Var = sv7Var.o;
                ei8 ei8VarL = xx9Var.l();
                ei8VarL.getClass();
                String str = iw7.a;
                a62 a62VarF = iw7.f(mq5VarH);
                t52 t52VarJ = a62VarF != null ? ei8VarL.j(a62VarF.a()) : null;
                if (t52VarJ == null) {
                    t52VarJ = sv7Var.k.c(fu7Var.k());
                    if (t52VarJ == null) {
                        t52VarJ = rc5.c(xx9Var, new a62(mq5VarH.b(), mq5VarH.a.f()), sv7Var.d.c().l);
                    }
                }
                return t52VarJ.o();
        }
    }
}
