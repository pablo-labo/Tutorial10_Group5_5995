package defpackage;

import android.os.Bundle;
import androidx.navigation.d;
import androidx.navigation.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public abstract class nea {
    public final ReentrantLock a = new ReentrantLock(true);
    public final gse b;
    public final gse c;
    public boolean d;
    public final rqc e;
    public final rqc f;

    public nea() {
        gse gseVarE = hh2.e(zr4.a);
        this.b = gseVarE;
        gse gseVarE2 = hh2.e(is4.a);
        this.c = gseVarE2;
        this.e = wg2.j(gseVarE);
        this.f = wg2.j(gseVarE2);
    }

    public abstract d a(k kVar, Bundle bundle);

    public void b(d dVar) {
        dVar.getClass();
        gse gseVar = this.c;
        LinkedHashSet linkedHashSetM = bbe.m((Set) gseVar.getValue(), dVar);
        gseVar.getClass();
        gseVar.m(null, linkedHashSetM);
    }

    public final void c(d dVar) {
        int iNextIndex;
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            ArrayList arrayListB1 = z92.B1((Collection) this.e.a.getValue());
            ListIterator listIterator = arrayListB1.listIterator(arrayListB1.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (wl7.b(((d) listIterator.previous()).f, dVar.f)) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            arrayListB1.set(iNextIndex, dVar);
            gse gseVar = this.b;
            gseVar.getClass();
            gseVar.m(null, arrayListB1);
            j6g j6gVar = j6g.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void d(d dVar, boolean z) {
        dVar.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            gse gseVar = this.b;
            Iterable iterable = (Iterable) gseVar.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (wl7.b((d) obj, dVar)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            gseVar.getClass();
            gseVar.m(null, arrayList);
            j6g j6gVar = j6g.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void e(d dVar, boolean z) {
        Object objPrevious;
        dVar.getClass();
        gse gseVar = this.c;
        Iterable iterable = (Iterable) gseVar.getValue();
        boolean z2 = iterable instanceof Collection;
        rqc rqcVar = this.e;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((d) it.next()) == dVar) {
                    Iterable iterable2 = (Iterable) rqcVar.a.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((d) it2.next()) == dVar) {
                        }
                    }
                    return;
                }
            }
        }
        LinkedHashSet linkedHashSetP = bbe.p((Set) gseVar.getValue(), dVar);
        gseVar.getClass();
        gseVar.m(null, linkedHashSetP);
        List list = (List) rqcVar.a.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            d dVar2 = (d) objPrevious;
            if (!wl7.b(dVar2, dVar) && ((List) rqcVar.a.getValue()).lastIndexOf(dVar2) < ((List) rqcVar.a.getValue()).lastIndexOf(dVar)) {
                break;
            }
        }
        d dVar3 = (d) objPrevious;
        if (dVar3 != null) {
            LinkedHashSet linkedHashSetP2 = bbe.p((Set) gseVar.getValue(), dVar3);
            gseVar.getClass();
            gseVar.m(null, linkedHashSetP2);
        }
        d(dVar, z);
    }

    public void f(d dVar) {
        dVar.getClass();
        gse gseVar = this.c;
        LinkedHashSet linkedHashSetP = bbe.p((Set) gseVar.getValue(), dVar);
        gseVar.getClass();
        gseVar.m(null, linkedHashSetP);
    }

    public void g(d dVar) {
        dVar.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            gse gseVar = this.b;
            ArrayList arrayListG1 = z92.g1(dVar, (Collection) gseVar.getValue());
            gseVar.getClass();
            gseVar.m(null, arrayListG1);
            j6g j6gVar = j6g.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void h(d dVar) {
        dVar.getClass();
        gse gseVar = this.c;
        Iterable iterable = (Iterable) gseVar.getValue();
        boolean z = iterable instanceof Collection;
        rqc rqcVar = this.e;
        if (!z || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((d) it.next()) == dVar) {
                    Iterable iterable2 = (Iterable) rqcVar.a.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((d) it2.next()) == dVar) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        d dVar2 = (d) z92.Z0((List) rqcVar.a.getValue());
        if (dVar2 != null) {
            LinkedHashSet linkedHashSetP = bbe.p((Set) gseVar.getValue(), dVar2);
            gseVar.getClass();
            gseVar.m(null, linkedHashSetP);
        }
        LinkedHashSet linkedHashSetP2 = bbe.p((Set) gseVar.getValue(), dVar);
        gseVar.getClass();
        gseVar.m(null, linkedHashSetP2);
        g(dVar);
    }
}
