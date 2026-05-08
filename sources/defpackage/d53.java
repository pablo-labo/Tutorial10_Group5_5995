package defpackage;

import defpackage.b53;
import defpackage.ha;
import defpackage.mb8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d53 implements ga<b53.a> {
    public static final d53 a = new d53();
    public static final List<String> b = u63.Z("pdf");

    @Override // defpackage.ga
    public final b53.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        while (mb8Var.D1(b) == 0) {
            ga gaVarE = lb3Var.e(owg.a);
            ha.g gVar = ha.a;
            if (gaVarE instanceof nma) {
                r6.g("The adapter is already nullable");
                return null;
            }
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = gaVarE.a(mb8Var, lb3Var);
            }
            str = (String) objA;
        }
        return new b53.a(str);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, b53.a aVar) {
        b53.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("pdf");
        ga gaVarE = lb3Var.e(owg.a);
        ha.g gVar = ha.a;
        if (gaVarE instanceof nma) {
            r6.g("The adapter is already nullable");
            return;
        }
        String str = aVar2.a;
        if (str == null) {
            hc8Var.H1();
        } else {
            gaVarE.b(hc8Var, lb3Var, str);
        }
    }
}
