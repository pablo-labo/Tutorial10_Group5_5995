package defpackage;

import defpackage.s5c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l0<A> implements df0<A> {
    public final e8e a;

    public l0(e8e e8eVar) {
        e8eVar.getClass();
        this.a = e8eVar;
    }

    @Override // defpackage.df0
    public final ArrayList a(j5c j5cVar, o8a o8aVar) {
        j5cVar.getClass();
        o8aVar.getClass();
        Iterable iterable = (List) j5cVar.l(this.a.k);
        if (iterable == null) {
            iterable = zr4.a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(t92.r0(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((se0) this).l((t4c) it.next(), o8aVar));
        }
        return arrayList;
    }

    @Override // defpackage.df0
    public final ArrayList b(l5c l5cVar, o8a o8aVar) {
        l5cVar.getClass();
        o8aVar.getClass();
        Iterable iterable = (List) l5cVar.l(this.a.l);
        if (iterable == null) {
            iterable = zr4.a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(t92.r0(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((se0) this).l((t4c) it.next(), o8aVar));
        }
        return arrayList;
    }

    @Override // defpackage.df0
    public final List<A> c(s5c s5cVar, z4c z4cVar) {
        s5cVar.getClass();
        Iterable iterable = (List) z4cVar.l(this.a.h);
        if (iterable == null) {
            iterable = zr4.a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(t92.r0(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((se0) this).l((t4c) it.next(), s5cVar.a));
        }
        return arrayList;
    }

    @Override // defpackage.df0
    public final List<A> d(s5c s5cVar, g5c g5cVar) {
        g5cVar.getClass();
        this.a.getClass();
        zr4 zr4Var = zr4.a;
        ArrayList arrayList = new ArrayList(t92.r0(zr4Var, 10));
        Iterator<E> it = zr4Var.iterator();
        while (it.hasNext()) {
            arrayList.add(((se0) this).l((t4c) it.next(), s5cVar.a));
        }
        return arrayList;
    }

    @Override // defpackage.df0
    public final List<A> e(s5c s5cVar, rp9 rp9Var, je0 je0Var) {
        rp9Var.getClass();
        boolean z = rp9Var instanceof b5c;
        e8e e8eVar = this.a;
        if (z) {
            e8eVar.getClass();
        } else {
            if (!(rp9Var instanceof g5c)) {
                ja.i(rp9Var, "Unknown message: ");
                return null;
            }
            int iOrdinal = je0Var.ordinal();
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                ja.i(je0Var, "Unsupported callable kind with property proto for receiver annotations: ");
                return null;
            }
            e8eVar.getClass();
        }
        zr4 zr4Var = zr4.a;
        ArrayList arrayList = new ArrayList(t92.r0(zr4Var, 10));
        Iterator<E> it = zr4Var.iterator();
        while (it.hasNext()) {
            arrayList.add(((se0) this).l((t4c) it.next(), s5cVar.a));
        }
        return arrayList;
    }

    @Override // defpackage.df0
    public final ArrayList f(s5c.a aVar) {
        aVar.getClass();
        Iterable iterable = (List) aVar.d.l(this.a.c);
        if (iterable == null) {
            iterable = zr4.a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(t92.r0(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((se0) this).l((t4c) it.next(), aVar.a));
        }
        return arrayList;
    }

    @Override // defpackage.df0
    public final List<A> g(s5c s5cVar, rp9 rp9Var, je0 je0Var) {
        List list;
        rp9Var.getClass();
        boolean z = rp9Var instanceof w4c;
        e8e e8eVar = this.a;
        if (z) {
            list = (List) ((w4c) rp9Var).l(e8eVar.b);
        } else if (rp9Var instanceof b5c) {
            list = (List) ((b5c) rp9Var).l(e8eVar.d);
        } else {
            if (!(rp9Var instanceof g5c)) {
                ja.i(rp9Var, "Unknown message: ");
                return null;
            }
            int iOrdinal = je0Var.ordinal();
            if (iOrdinal == 1) {
                list = (List) ((g5c) rp9Var).l(e8eVar.e);
            } else if (iOrdinal == 2) {
                list = (List) ((g5c) rp9Var).l(e8eVar.f);
            } else {
                if (iOrdinal != 3) {
                    r6.g("Unsupported callable kind with property proto");
                    return null;
                }
                list = (List) ((g5c) rp9Var).l(e8eVar.g);
            }
        }
        if (list == null) {
            list = zr4.a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((se0) this).l((t4c) it.next(), s5cVar.a));
        }
        return arrayList;
    }

    @Override // defpackage.df0
    public final List<A> i(s5c s5cVar, g5c g5cVar) {
        g5cVar.getClass();
        this.a.getClass();
        zr4 zr4Var = zr4.a;
        ArrayList arrayList = new ArrayList(t92.r0(zr4Var, 10));
        Iterator<E> it = zr4Var.iterator();
        while (it.hasNext()) {
            arrayList.add(((se0) this).l((t4c) it.next(), s5cVar.a));
        }
        return arrayList;
    }

    @Override // defpackage.df0
    public final List<A> k(s5c s5cVar, rp9 rp9Var, je0 je0Var, int i, n5c n5cVar) {
        rp9Var.getClass();
        Iterable iterable = (List) n5cVar.l(this.a.j);
        if (iterable == null) {
            iterable = zr4.a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(t92.r0(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((se0) this).l((t4c) it.next(), s5cVar.a));
        }
        return arrayList;
    }
}
