package defpackage;

import defpackage.hh5;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sl2 implements lf0 {
    public final List<lf0> a;

    public sl2(lf0... lf0VarArr) {
        this.a = ut0.E0(lf0VarArr);
    }

    @Override // defpackage.lf0
    public final boolean P0(mq5 mq5Var) {
        mq5Var.getClass();
        Iterator it = z92.G0(this.a).a.iterator();
        while (it.hasNext()) {
            if (((lf0) it.next()).P0(mq5Var)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lf0
    public final boolean isEmpty() {
        List<lf0> list = this.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((lf0) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator<af0> iterator() {
        return new hh5.a(new hh5(z92.G0(this.a), rl2.b, z6e.a));
    }

    @Override // defpackage.lf0
    public final af0 p(mq5 mq5Var) {
        mq5Var.getClass();
        return (af0) a7e.S(a7e.V(z92.G0(this.a), new ql2(mq5Var, 0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sl2(List<? extends lf0> list) {
        this.a = list;
    }
}
