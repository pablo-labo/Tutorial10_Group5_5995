package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g5e {
    public final w4e a;
    public final b3a b;

    public g5e(f5e f5eVar, jh7<i5e> jh7Var) {
        this.a = f5eVar.d;
        this.b = new b3a(f5e.j(4, f5eVar).size());
        List listJ = f5e.j(4, f5eVar);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            f5e f5eVar2 = (f5e) listJ.get(i);
            if (jh7Var.a(f5eVar2.g)) {
                this.b.a(f5eVar2.g);
            }
        }
    }
}
