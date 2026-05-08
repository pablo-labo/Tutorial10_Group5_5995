package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s4c implements p52 {
    public final p8a a;
    public final xf1 b;
    public final a04 c;
    public final LinkedHashMap d;

    public s4c(f5c f5cVar, p8a p8aVar, xf1 xf1Var, a04 a04Var) {
        xf1Var.getClass();
        this.a = p8aVar;
        this.b = xf1Var;
        this.c = a04Var;
        List<u4c> listZ = f5cVar.z();
        listZ.getClass();
        List<u4c> list = listZ;
        int iV = kc9.V(t92.r0(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iV < 16 ? 16 : iV);
        for (Object obj : list) {
            linkedHashMap.put(q8a.a(this.a, ((u4c) obj).q0()), obj);
        }
        this.d = linkedHashMap;
    }

    @Override // defpackage.p52
    public final o52 o(a62 a62Var) {
        a62Var.getClass();
        u4c u4cVar = (u4c) this.d.get(a62Var);
        if (u4cVar == null) {
            return null;
        }
        return new o52(this.a, u4cVar, this.b, (qne) this.c.invoke(a62Var));
    }
}
