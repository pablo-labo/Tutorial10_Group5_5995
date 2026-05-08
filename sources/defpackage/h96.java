package defpackage;

import defpackage.j29;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h96 extends jn9 {
    public static final /* synthetic */ qf8<Object>[] d = {fwc.a.g(new l4c(h96.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0))};
    public final x0 b;
    public final fla c;

    public h96(j29 j29Var, x0 x0Var) {
        j29Var.getClass();
        this.b = x0Var;
        this.c = new j29.h(j29Var, new r04(this, 1));
    }

    @Override // defpackage.jn9, defpackage.in9
    public final Collection b(n8a n8aVar, dia diaVar) {
        Collection collection;
        n8aVar.getClass();
        List list = (List) zte.c(this.c, d[0]);
        if (list.isEmpty()) {
            collection = zr4.a;
        } else {
            lke lkeVar = new lke();
            for (Object obj : list) {
                if ((obj instanceof d4c) && wl7.b(((d4c) obj).getName(), n8aVar)) {
                    lkeVar.add(obj);
                }
            }
            collection = lkeVar;
        }
        return collection;
    }

    @Override // defpackage.jn9, defpackage.in9
    public final Collection<sfe> e(n8a n8aVar, dia diaVar) {
        Collection<sfe> collection;
        n8aVar.getClass();
        List list = (List) zte.c(this.c, d[0]);
        if (list.isEmpty()) {
            collection = zr4.a;
        } else {
            lke lkeVar = new lke();
            for (Object obj : list) {
                if ((obj instanceof sfe) && wl7.b(((sfe) obj).getName(), n8aVar)) {
                    lkeVar.add(obj);
                }
            }
            collection = lkeVar;
        }
        return collection;
    }

    @Override // defpackage.jn9, defpackage.z4d
    public final Collection<aj3> f(lz3 lz3Var, Function1<? super n8a, Boolean> function1) {
        lz3Var.getClass();
        if (!lz3Var.a(lz3.n.b)) {
            return zr4.a;
        }
        return (List) zte.c(this.c, d[0]);
    }

    public abstract List<kv5> h();
}
