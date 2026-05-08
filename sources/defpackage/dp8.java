package defpackage;

import defpackage.cfe;
import defpackage.qu7;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class dp8 implements Function1 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ dp8(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                gp8 gp8Var = (gp8) obj3;
                mp8 mp8Var = (mp8) obj2;
                n8a n8aVar = (n8a) obj;
                n8aVar.getClass();
                fla<Set<n8a>> flaVar = gp8Var.r;
                t52 t52Var = gp8Var.n;
                if (flaVar.invoke().contains(n8aVar)) {
                    qu7 qu7Var = mp8Var.a.b;
                    a62 a62VarF = b04.f(t52Var);
                    a62VarF.getClass();
                    hvc hvcVarC = qu7Var.c(new qu7.a(a62VarF.d(n8aVar), gp8Var.o, 2));
                    if (hvcVarC == null) {
                        return null;
                    }
                    ap8 ap8Var = new ap8(mp8Var, t52Var, hvcVarC, null);
                    mp8Var.a.s.a(ap8Var);
                    return ap8Var;
                }
                if (!gp8Var.s.invoke().contains(n8aVar)) {
                    bv7 bv7Var = gp8Var.t.invoke().get(n8aVar);
                    if (bv7Var == null) {
                        return null;
                    }
                    sv7 sv7Var = mp8Var.a;
                    return yv4.K0(sv7Var.a, gp8Var.n, n8aVar, sv7Var.a.f(new s04(gp8Var, 3)), ee3.v(mp8Var, bv7Var), sv7Var.j.a(bv7Var));
                }
                iy8 iy8VarS = u63.s();
                mp8Var.a.x.l(t52Var, n8aVar, iy8VarS, mp8Var);
                iy8 iy8VarL = iy8VarS.l();
                int iA = iy8VarL.a();
                if (iA == 0) {
                    return null;
                }
                if (iA == 1) {
                    return (t52) z92.k1(iy8VarL);
                }
                ja.i(iy8VarL, "Multiple classes with same name are generated: ");
                return null;
            default:
                String str = (String) obj3;
                cfe.a.C0106a c0106a = (cfe.a.C0106a) obj;
                c0106a.getClass();
                rw7 rw7Var = zib.b;
                c0106a.a(str, rw7Var);
                rw7 rw7Var2 = zib.a;
                c0106a.a((String) obj2, rw7Var, rw7Var, rw7Var2, rw7Var2);
                c0106a.c(str, rw7Var2);
                return j6g.a;
        }
    }
}
