package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class zl2 implements pya {
    public final List<nya> a;
    public final String b;

    /* JADX WARN: Multi-variable type inference failed */
    public zl2(List<? extends nya> list, String str) {
        this.a = list;
        this.b = str;
        list.size();
        z92.E1(list).size();
    }

    @Override // defpackage.pya
    public final boolean a(mq5 mq5Var) {
        mq5Var.getClass();
        List<nya> list = this.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!boa.B((nya) it.next(), mq5Var)) {
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
        Iterator<nya> it = this.a.iterator();
        while (it.hasNext()) {
            boa.j(it.next(), mq5Var, arrayList);
        }
        return z92.z1(arrayList);
    }

    @Override // defpackage.pya
    public final void c(mq5 mq5Var, ArrayList arrayList) {
        mq5Var.getClass();
        Iterator<nya> it = this.a.iterator();
        while (it.hasNext()) {
            boa.j(it.next(), mq5Var, arrayList);
        }
    }

    @Override // defpackage.nya
    public final Collection<mq5> q(mq5 mq5Var, Function1<? super n8a, Boolean> function1) {
        mq5Var.getClass();
        HashSet hashSet = new HashSet();
        Iterator<nya> it = this.a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().q(mq5Var, function1));
        }
        return hashSet;
    }

    public final String toString() {
        return this.b;
    }
}
