package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class y32 implements Function1 {
    public static final y32 b = new y32(0);
    public static final y32 c = new y32(1);
    public static final y32 d = new y32(2);
    public static final y32 e = new y32(3);
    public static final y32 f = new y32(4);
    public final /* synthetic */ int a;

    public /* synthetic */ y32(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((kv5) obj).getClass();
                return null;
            case 1:
                hv1 hv1Var = (hv1) obj;
                hv1Var.getClass();
                return Boolean.valueOf(nn2.p(hv1Var));
            case 2:
                ((Number) obj).intValue();
                return null;
            case 3:
                String simpleName = ((Class) obj).getSimpleName();
                if (!n8a.m(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return n8a.h(simpleName);
                }
                return null;
            default:
                hv1 hv1Var2 = (hv1) obj;
                hv1Var2.getClass();
                ui8 returnType = hv1Var2.getReturnType();
                returnType.getClass();
                return returnType;
        }
    }
}
