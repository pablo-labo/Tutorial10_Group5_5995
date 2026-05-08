package defpackage;

import defpackage.gwf;
import defpackage.lf0;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class pf0 {
    public static final /* synthetic */ qf8<Object>[] a;
    public static final oma b;

    static {
        l4c l4cVar = new l4c(pf0.class, "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;", 1);
        iwc iwcVar = fwc.a;
        a = new qf8[]{iwcVar.g(l4cVar)};
        gwf.a aVar = gwf.b;
        yd8 yd8VarB = iwcVar.b(of0.class);
        aVar.getClass();
        String strP = yd8VarB.p();
        strP.getClass();
        b = new oma(aVar.f((ConcurrentHashMap) aVar.a, strP, new vm6(aVar, 2)));
    }

    public static final lf0 a(gwf gwfVar) {
        lf0 lf0Var;
        gwfVar.getClass();
        of0 of0Var = (of0) b.a(a[0], gwfVar);
        return (of0Var == null || (lf0Var = of0Var.a) == null) ? lf0.a.a : lf0Var;
    }
}
