package defpackage;

import defpackage.hv1;
import defpackage.j29;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class up8 extends vp8 {
    public static final /* synthetic */ int p = 0;
    public final hvc n;
    public final ap8 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up8(mp8 mp8Var, hvc hvcVar, ap8 ap8Var) {
        super(null, mp8Var);
        hvcVar.getClass();
        this.n = hvcVar;
        this.o = ap8Var;
    }

    public static d4c v(d4c d4cVar) {
        hv1.a aVarF = d4cVar.f();
        aVarF.getClass();
        if (aVarF != hv1.a.b) {
            return d4cVar;
        }
        Collection<? extends hv1> collectionM = d4cVar.m();
        collectionM.getClass();
        Collection<? extends hv1> collection = collectionM;
        ArrayList arrayList = new ArrayList(t92.r0(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            d4c d4cVar2 = (d4c) it.next();
            d4cVar2.getClass();
            arrayList.add(v(d4cVar2));
        }
        return (d4c) z92.k1(z92.z1(z92.D1(arrayList)));
    }

    @Override // defpackage.jn9, defpackage.z4d
    public final v62 d(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        diaVar.getClass();
        return null;
    }

    @Override // defpackage.qp8
    public final Set<n8a> h(lz3 lz3Var, Function1<? super n8a, Boolean> function1) {
        lz3Var.getClass();
        return is4.a;
    }

    @Override // defpackage.qp8
    public final Set i(lz3 lz3Var, zz3 zz3Var) {
        lz3Var.getClass();
        Set setD1 = z92.D1(this.e.invoke().a());
        ap8 ap8Var = this.o;
        up8 up8VarD = vfd.d(ap8Var);
        Set<n8a> setA = up8VarD != null ? up8VarD.a() : null;
        if (setA == null) {
            setA = is4.a;
        }
        setD1.addAll(setA);
        if (this.n.x()) {
            setD1.addAll(u63.a0(ere.c, ere.a));
        }
        mp8 mp8Var = this.b;
        setD1.addAll(mp8Var.a.x.i(ap8Var, mp8Var));
        return setD1;
    }

    @Override // defpackage.qp8
    public final void j(n8a n8aVar, ArrayList arrayList) {
        n8aVar.getClass();
        mp8 mp8Var = this.b;
        mp8Var.a.x.e(this.o, n8aVar, arrayList, mp8Var);
    }

    @Override // defpackage.qp8
    public final gj3 k() {
        return new r52(this.n, rp8.b);
    }

    @Override // defpackage.qp8
    public final void m(LinkedHashSet linkedHashSet, n8a n8aVar) {
        Collection collectionE1;
        n8aVar.getClass();
        ap8 ap8Var = this.o;
        up8 up8VarD = vfd.d(ap8Var);
        if (up8VarD == null) {
            collectionE1 = is4.a;
        } else {
            collectionE1 = z92.E1(!up8VarD.a().contains(n8aVar) ? zr4.a : (Collection) ((j29.k) up8VarD.h).invoke(n8aVar));
        }
        Collection collection = collectionE1;
        sv7 sv7Var = this.b.a;
        linkedHashSet.addAll(ygg.x(n8aVar, collection, linkedHashSet, this.o, sv7Var.f, sv7Var.u.a()));
        if (this.n.x()) {
            if (n8aVar.equals(ere.c)) {
                linkedHashSet.add(jz3.f(ap8Var));
            } else if (n8aVar.equals(ere.a)) {
                linkedHashSet.add(jz3.g(ap8Var));
            }
        }
    }

    @Override // defpackage.vp8, defpackage.qp8
    public final void n(n8a n8aVar, ArrayList arrayList) {
        ArrayList arrayList2;
        n8a n8aVar2;
        e4c e4cVarE;
        n8aVar.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        vm6 vm6Var = new vm6(n8aVar, 1);
        ap8 ap8Var = this.o;
        ad3.b(u63.Z(ap8Var), nn2.c, new tp8(ap8Var, linkedHashSet, vm6Var));
        boolean zIsEmpty = arrayList.isEmpty();
        mp8 mp8Var = this.b;
        if (zIsEmpty) {
            n8a n8aVar3 = n8aVar;
            arrayList2 = arrayList;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                d4c d4cVarV = v((d4c) obj);
                Object arrayList3 = linkedHashMap.get(d4cVarV);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap.put(d4cVarV, arrayList3);
                }
                ((List) arrayList3).add(obj);
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                sv7 sv7Var = mp8Var.a;
                n8a n8aVar4 = n8aVar3;
                w92.w0(arrayList4, ygg.x(n8aVar4, collection, arrayList2, this.o, sv7Var.f, sv7Var.u.a()));
                n8aVar3 = n8aVar4;
            }
            n8aVar2 = n8aVar3;
            arrayList2.addAll(arrayList4);
        } else {
            sv7 sv7Var2 = mp8Var.a;
            arrayList2 = arrayList;
            arrayList2.addAll(ygg.x(n8aVar, linkedHashSet, arrayList, this.o, sv7Var2.f, sv7Var2.u.a()));
            n8aVar2 = n8aVar;
        }
        if (this.n.x() && n8aVar2.equals(ere.b) && (e4cVarE = jz3.e(ap8Var)) != null) {
            arrayList2.add(e4cVarE);
        }
    }

    @Override // defpackage.qp8
    public final Set o(lz3 lz3Var) {
        lz3Var.getClass();
        Set setD1 = z92.D1(this.e.invoke().d());
        x32 x32Var = x32.e;
        ap8 ap8Var = this.o;
        ad3.b(u63.Z(ap8Var), nn2.c, new tp8(ap8Var, setD1, x32Var));
        if (this.n.x()) {
            setD1.add(ere.b);
        }
        return setD1;
    }

    @Override // defpackage.qp8
    public final aj3 q() {
        return this.o;
    }
}
