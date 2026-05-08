package defpackage;

import defpackage.cng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class p14 extends j14 {
    public final lya g;
    public final String h;
    public final mq5 i;

    public p14(lya lyaVar, e5c e5cVar, o8a o8aVar, xf1 xf1Var, jd8 jd8Var, g04 g04Var, String str, gu5 gu5Var) {
        o8aVar.getClass();
        xf1Var.getClass();
        g04Var.getClass();
        m5c m5cVarF = e5cVar.F();
        m5cVarF.getClass();
        hyf hyfVar = new hyf(m5cVarF);
        cng cngVar = cng.b;
        p5c p5cVarG = e5cVar.G();
        p5cVarG.getClass();
        h04 h04Var = new h04(g04Var, o8aVar, lyaVar, hyfVar, cng.a.a(p5cVarG), xf1Var, jd8Var, null, zr4.a);
        List<b5c> listC = e5cVar.C();
        listC.getClass();
        List<g5c> listD = e5cVar.D();
        listD.getClass();
        List<k5c> listE = e5cVar.E();
        listE.getClass();
        super(h04Var, listC, listD, listE, gu5Var);
        this.g = lyaVar;
        this.h = str;
        this.i = lyaVar.h();
    }

    @Override // defpackage.j14, defpackage.jn9, defpackage.z4d
    public final v62 d(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        diaVar.getClass();
        rkg.a(this.b.a.i, diaVar, this.g, n8aVar);
        return super.d(n8aVar, diaVar);
    }

    @Override // defpackage.jn9, defpackage.z4d
    public final Collection f(lz3 lz3Var, Function1 function1) {
        lz3Var.getClass();
        Collection collectionI = i(lz3Var, function1);
        Iterable<v52> iterable = this.b.a.k;
        ArrayList arrayList = new ArrayList();
        Iterator<v52> it = iterable.iterator();
        while (it.hasNext()) {
            w92.w0(arrayList, it.next().b(this.i));
        }
        return z92.h1(collectionI, arrayList);
    }

    @Override // defpackage.j14
    public final void h(ArrayList arrayList, Function1 function1) {
    }

    @Override // defpackage.j14
    public final a62 l(n8a n8aVar) {
        n8aVar.getClass();
        return new a62(this.i, n8aVar);
    }

    @Override // defpackage.j14
    public final Set<n8a> n() {
        return is4.a;
    }

    @Override // defpackage.j14
    public final Set<n8a> o() {
        return is4.a;
    }

    @Override // defpackage.j14
    public final Set<n8a> p() {
        return is4.a;
    }

    @Override // defpackage.j14
    public final boolean q(n8a n8aVar) {
        n8aVar.getClass();
        if (m().contains(n8aVar)) {
            return true;
        }
        Iterable<v52> iterable = this.b.a.k;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator<v52> it = iterable.iterator();
        while (it.hasNext()) {
            if (it.next().c(this.i, n8aVar)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.h;
    }
}
