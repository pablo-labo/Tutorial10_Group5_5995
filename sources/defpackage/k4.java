package defpackage;

import defpackage.cfe;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class k4 implements Function1 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ k4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rw7 rw7Var;
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ixf ixfVar = (ixf) obj3;
                rw7[] rw7VarArr = (rw7[]) obj2;
                int iIntValue = ((Number) obj).intValue();
                return (ixfVar == null || (rw7Var = (rw7) ixfVar.a.get(Integer.valueOf(iIntValue))) == null) ? (iIntValue < 0 || iIntValue >= rw7VarArr.length) ? rw7.e : rw7VarArr[iIntValue] : rw7Var;
            case 1:
                sfe sfeVar = (sfe) obj3;
                gp8 gp8Var = (gp8) obj2;
                n8a n8aVar = (n8a) obj;
                n8aVar.getClass();
                return wl7.b(sfeVar.getName(), n8aVar) ? u63.Z(sfeVar) : z92.h1(gp8Var.N(n8aVar), gp8Var.O(n8aVar));
            default:
                String str = (String) obj3;
                cfe.a.C0106a c0106a = (cfe.a.C0106a) obj;
                c0106a.getClass();
                rw7 rw7Var2 = zib.b;
                c0106a.a(str, rw7Var2);
                rw7 rw7Var3 = zib.c;
                rw7 rw7Var4 = zib.a;
                c0106a.a((String) obj2, rw7Var2, rw7Var2, rw7Var3, rw7Var4);
                c0106a.c(str, rw7Var4);
                return j6g.a;
        }
    }
}
