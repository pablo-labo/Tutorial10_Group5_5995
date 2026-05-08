package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class xb5 implements lf0 {
    public final lf0 a;
    public final eyf b;

    public xb5(lf0 lf0Var, eyf eyfVar) {
        this.a = lf0Var;
        this.b = eyfVar;
    }

    @Override // defpackage.lf0
    public final boolean P0(mq5 mq5Var) {
        mq5Var.getClass();
        if (((Boolean) this.b.invoke(mq5Var)).booleanValue()) {
            return this.a.P0(mq5Var);
        }
        return false;
    }

    @Override // defpackage.lf0
    public final boolean isEmpty() {
        lf0 lf0Var = this.a;
        if ((lf0Var instanceof Collection) && ((Collection) lf0Var).isEmpty()) {
            return false;
        }
        Iterator<af0> it = lf0Var.iterator();
        while (it.hasNext()) {
            mq5 mq5VarH = it.next().h();
            if (mq5VarH != null && ((Boolean) this.b.invoke(mq5VarH)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<af0> iterator() {
        ArrayList arrayList = new ArrayList();
        for (af0 af0Var : this.a) {
            mq5 mq5VarH = af0Var.h();
            if (mq5VarH != null && ((Boolean) this.b.invoke(mq5VarH)).booleanValue()) {
                arrayList.add(af0Var);
            }
        }
        return arrayList.iterator();
    }

    @Override // defpackage.lf0
    public final af0 p(mq5 mq5Var) {
        mq5Var.getClass();
        if (((Boolean) this.b.invoke(mq5Var)).booleanValue()) {
            return this.a.p(mq5Var);
        }
        return null;
    }
}
