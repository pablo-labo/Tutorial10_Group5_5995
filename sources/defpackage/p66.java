package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p66 {
    public static final brg a(yd8 yd8Var, irg irgVar, p63 p63Var, a9c a9cVar, qpd qpdVar, gu5 gu5Var) {
        yd8Var.getClass();
        irgVar.getClass();
        p63Var.getClass();
        qpdVar.getClass();
        Class clsP = jh2.p(yd8Var);
        hrg hrgVar = new hrg(irgVar, new ci8(yd8Var, qpdVar, a9cVar, gu5Var), p63Var);
        if (a9cVar != null) {
            String value = a9cVar.getValue();
            value.getClass();
            return hrgVar.a(fwc.a.b(clsP), value);
        }
        yd8 yd8VarB = fwc.a.b(clsP);
        String strP = yd8VarB.p();
        if (strP != null) {
            return hrgVar.a(yd8VarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strP));
        }
        l5.q("Local and anonymous classes can not be ViewModels");
        return null;
    }
}
