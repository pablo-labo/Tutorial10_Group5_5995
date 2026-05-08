package defpackage;

import defpackage.j29;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class kte extends jn9 {
    public static final /* synthetic */ qf8<Object>[] f;
    public final v04 b;
    public final boolean c;
    public final fla d;
    public final fla e;

    static {
        l4c l4cVar = new l4c(kte.class, "functions", "getFunctions()Ljava/util/List;", 0);
        iwc iwcVar = fwc.a;
        f = new qf8[]{iwcVar.g(l4cVar), z3.i(kte.class, "properties", "getProperties()Ljava/util/List;", 0, iwcVar)};
    }

    public kte(j29 j29Var, v04 v04Var, boolean z) {
        j29Var.getClass();
        this.b = v04Var;
        this.c = z;
        this.d = new j29.h(j29Var, new ce8(this, 3));
        this.e = new j29.h(j29Var, new de8(this, 1));
    }

    @Override // defpackage.jn9, defpackage.in9
    public final Collection b(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        List list = (List) zte.c(this.e, f[1]);
        lke lkeVar = new lke();
        for (Object obj : list) {
            if (wl7.b(((d4c) obj).getName(), n8aVar)) {
                lkeVar.add(obj);
            }
        }
        return lkeVar;
    }

    @Override // defpackage.jn9, defpackage.z4d
    public final v62 d(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        diaVar.getClass();
        return null;
    }

    @Override // defpackage.jn9, defpackage.in9
    public final Collection e(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        List list = (List) zte.c(this.d, f[0]);
        lke lkeVar = new lke();
        for (Object obj : list) {
            if (wl7.b(((sfe) obj).getName(), n8aVar)) {
                lkeVar.add(obj);
            }
        }
        return lkeVar;
    }

    @Override // defpackage.jn9, defpackage.z4d
    public final Collection f(lz3 lz3Var, Function1 function1) {
        lz3Var.getClass();
        qf8<Object>[] qf8VarArr = f;
        return z92.h1((List) zte.c(this.d, qf8VarArr[0]), (List) zte.c(this.e, qf8VarArr[1]));
    }
}
