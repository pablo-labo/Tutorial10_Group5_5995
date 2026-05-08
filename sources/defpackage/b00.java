package defpackage;

import defpackage.cfe;
import defpackage.cla;
import defpackage.j29;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class b00 implements Function1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ b00(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((jjd) obj2).resumeWith((i00) obj);
                return j6g.a;
            case 1:
                ((hv1) obj).getClass();
                return Boolean.valueOf(qoe.i.containsKey(vs9.b((sfe) obj2)));
            case 2:
                n8a n8aVar = (n8a) obj;
                n8aVar.getClass();
                return ((gp8) obj2).O(n8aVar);
            case 3:
                cla claVar = (cla) obj2;
                cla.a aVar = (cla.a) obj;
                aVar.getClass();
                a62 a62Var = aVar.a;
                List<Integer> list = aVar.b;
                if (a62Var.c) {
                    l5.p(a62Var, "Unresolved local class: ");
                    return null;
                }
                a62 a62VarE = a62Var.e();
                f62 f62VarA = a62VarE != null ? claVar.a(a62VarE, z92.J0(list, 1)) : (f62) ((j29.k) claVar.c).invoke(a62Var.a);
                boolean zG = a62Var.g();
                j29 j29Var = claVar.a;
                n8a n8aVarF = a62Var.f();
                Integer num = (Integer) z92.Q0(list);
                return new cla.b(j29Var, f62VarA, n8aVarF, zG, num != null ? num.intValue() : 0);
            default:
                String str = (String) obj2;
                cfe.a.C0106a c0106a = (cfe.a.C0106a) obj;
                c0106a.getClass();
                rw7 rw7Var = zib.b;
                c0106a.a(str, rw7Var);
                c0106a.a(str, rw7Var);
                c0106a.c(str, zib.a);
                return j6g.a;
        }
    }
}
