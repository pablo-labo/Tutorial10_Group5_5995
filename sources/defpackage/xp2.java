package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class xp2<T> implements aq2<T> {
    public final bq2<T> a;
    public final ArrayList b;
    public final ArrayList c;
    public T d;
    public a e;

    public interface a {
        void a(ArrayList arrayList);

        void b(ArrayList arrayList);
    }

    public xp2(bq2<T> bq2Var) {
        bq2Var.getClass();
        this.a = bq2Var;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    @Override // defpackage.aq2
    public final void a(T t) {
        this.d = t;
        e(this.e, t);
    }

    public abstract boolean b(r3h r3hVar);

    public abstract boolean c(T t);

    public final void d(Iterable<r3h> iterable) {
        iterable.getClass();
        this.b.clear();
        this.c.clear();
        ArrayList arrayList = this.b;
        for (r3h r3hVar : iterable) {
            if (b(r3hVar)) {
                arrayList.add(r3hVar);
            }
        }
        ArrayList arrayList2 = this.b;
        ArrayList arrayList3 = this.c;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((r3h) it.next()).a);
        }
        boolean zIsEmpty = this.b.isEmpty();
        bq2<T> bq2Var = this.a;
        if (zIsEmpty) {
            bq2Var.b(this);
        } else {
            bq2Var.getClass();
            synchronized (bq2Var.c) {
                try {
                    if (bq2Var.d.add(this)) {
                        if (bq2Var.d.size() == 1) {
                            bq2Var.e = bq2Var.a();
                            z39.d().a(cq2.a, bq2Var.getClass().getSimpleName() + ": initial state = " + bq2Var.e);
                            bq2Var.d();
                        }
                        a(bq2Var.e);
                    }
                    j6g j6gVar = j6g.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        e(this.e, this.d);
    }

    public final void e(a aVar, T t) {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty() || aVar == null) {
            return;
        }
        if (t == null || c(t)) {
            aVar.a(arrayList);
        } else {
            aVar.b(arrayList);
        }
    }
}
