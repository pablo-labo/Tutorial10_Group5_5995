package defpackage;

import defpackage.ad3;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class tp8 extends ad3.b<t52, j6g> {
    public final /* synthetic */ t52 a;
    public final /* synthetic */ Set<Object> b;
    public final /* synthetic */ Function1<in9, Collection<Object>> c;

    /* JADX WARN: Multi-variable type inference failed */
    public tp8(t52 t52Var, Set<Object> set, Function1<? super in9, ? extends Collection<Object>> function1) {
        this.a = t52Var;
        this.b = set;
        this.c = function1;
    }

    @Override // ad3.d
    public final /* bridge */ /* synthetic */ Object a() {
        return j6g.a;
    }

    @Override // ad3.d
    public final boolean c(Object obj) {
        t52 t52Var = (t52) obj;
        t52Var.getClass();
        if (t52Var == this.a) {
            return true;
        }
        in9 in9VarL0 = t52Var.l0();
        in9VarL0.getClass();
        if (!(in9VarL0 instanceof vp8)) {
            return true;
        }
        this.b.addAll(this.c.invoke(in9VarL0));
        return false;
    }
}
