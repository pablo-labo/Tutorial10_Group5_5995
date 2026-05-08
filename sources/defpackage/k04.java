package defpackage;

import defpackage.lf0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class k04 implements lf0 {
    public static final /* synthetic */ qf8<Object>[] b = {fwc.a.g(new l4c(k04.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};
    public final fla a;

    public k04(aue aueVar, gu5<? extends List<? extends af0>> gu5Var) {
        aueVar.getClass();
        this.a = aueVar.f(gu5Var);
    }

    @Override // defpackage.lf0
    public final boolean P0(mq5 mq5Var) {
        return lf0.b.b(this, mq5Var);
    }

    @Override // defpackage.lf0
    public boolean isEmpty() {
        return ((List) zte.c(this.a, b[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<af0> iterator() {
        return ((List) zte.c(this.a, b[0])).iterator();
    }

    @Override // defpackage.lf0
    public final af0 p(mq5 mq5Var) {
        return lf0.b.a(this, mq5Var);
    }
}
