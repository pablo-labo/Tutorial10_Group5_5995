package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class np1 implements Function1 {
    public static final np1 b = new np1(0);
    public static final np1 c = new np1(1);
    public static final np1 d = new np1(2);
    public final /* synthetic */ int a;

    public /* synthetic */ np1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                hv1 hv1Var = (hv1) obj;
                int i = pp1.l;
                hv1Var.getClass();
                return Boolean.valueOf(z92.I0(qoe.f, vs9.b(hv1Var)));
            case 1:
                p7g p7gVar = (p7g) obj;
                p7gVar.getClass();
                return Boolean.valueOf(p7gVar.M0() instanceof lx1);
            default:
                pz3 pz3Var = lwc.a;
                ui8 type = ((rlg) obj).getType();
                type.getClass();
                return lwc.a.X(type);
        }
    }
}
