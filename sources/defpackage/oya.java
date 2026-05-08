package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class oya implements pya {
    public final ArrayList a;

    public oya(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.pya
    public final boolean a(mq5 mq5Var) {
        mq5Var.getClass();
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (wl7.b(((lya) it.next()).h(), mq5Var)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.nya
    @sy3
    public final List<lya> b(mq5 mq5Var) {
        mq5Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            if (wl7.b(((lya) obj).h(), mq5Var)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.pya
    public final void c(mq5 mq5Var, ArrayList arrayList) {
        mq5Var.getClass();
        for (Object obj : this.a) {
            if (wl7.b(((lya) obj).h(), mq5Var)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // defpackage.nya
    public final Collection<mq5> q(mq5 mq5Var, Function1<? super n8a, Boolean> function1) {
        mq5Var.getClass();
        return a7e.W(new cc5(new xrf(new y92(this.a), sp8.c), true, new l4(mq5Var, 5)));
    }
}
