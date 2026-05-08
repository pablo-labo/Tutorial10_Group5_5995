package defpackage;

import defpackage.cfe;
import defpackage.v04;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class w04 implements Function1 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ w04(int i, Object obj, Object obj2) {
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
                v04.c cVar = (v04.c) obj3;
                v04 v04Var = (v04) obj2;
                h04 h04Var = v04Var.a0;
                n8a n8aVar = (n8a) obj;
                n8aVar.getClass();
                z4c z4cVar = (z4c) cVar.a.get(n8aVar);
                if (z4cVar != null) {
                    return yv4.K0(h04Var.a.a, v04Var, n8aVar, cVar.c, new k04(h04Var.a.a, new y04(0, v04Var, z4cVar)), qne.p);
                }
                return null;
            default:
                cfe.a.C0106a c0106a = (cfe.a.C0106a) obj;
                c0106a.getClass();
                rw7 rw7Var = zib.c;
                c0106a.a((String) obj3, rw7Var);
                c0106a.c((String) obj2, zib.b, rw7Var);
                return j6g.a;
        }
    }
}
