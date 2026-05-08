package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import defpackage.esf;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public class js5 extends is5 {

    public class a extends esf.c {
    }

    public class b implements esf.d {
        public final /* synthetic */ View a;
        public final /* synthetic */ ArrayList b;

        public b(View view, ArrayList arrayList) {
            this.a = view;
            this.b = arrayList;
        }

        @Override // esf.d
        public final void a() {
        }

        @Override // esf.d
        public final void b() {
        }

        @Override // esf.d
        public final void c() {
        }

        @Override // esf.d
        public final void d(esf esfVar) {
            esfVar.x(this);
            this.a.setVisibility(8);
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((View) arrayList.get(i)).setVisibility(0);
            }
        }

        @Override // esf.d
        public final void e(esf esfVar) {
            esfVar.x(this);
            esfVar.c(this);
        }
    }

    public class c extends esf.c {
    }

    @Override // defpackage.is5
    public final void a(View view, Object obj) {
        ((esf) obj).d(view);
    }

    @Override // defpackage.is5
    public final void b(Object obj, ArrayList<View> arrayList) {
        esf esfVar = (esf) obj;
        if (esfVar == null) {
            return;
        }
        int i = 0;
        if (esfVar instanceof qsf) {
            qsf qsfVar = (qsf) esfVar;
            int size = qsfVar.m0.size();
            while (i < size) {
                b((i < 0 || i >= qsfVar.m0.size()) ? null : qsfVar.m0.get(i), arrayList);
                i++;
            }
            return;
        }
        if (is5.h(esfVar.e) && is5.h(esfVar.f)) {
            int size2 = arrayList.size();
            while (i < size2) {
                esfVar.d(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.is5
    public final void c(ViewGroup viewGroup, Object obj) {
        osf.a(viewGroup, (esf) obj);
    }

    @Override // defpackage.is5
    public final boolean e(Object obj) {
        return obj instanceof esf;
    }

    @Override // defpackage.is5
    public final Object f(Object obj) {
        if (obj != null) {
            return ((esf) obj).clone();
        }
        return null;
    }

    @Override // defpackage.is5
    public final Object i(Object obj, Object obj2, Object obj3) {
        esf esfVar = (esf) obj;
        esf esfVar2 = (esf) obj2;
        esf esfVar3 = (esf) obj3;
        if (esfVar != null && esfVar2 != null) {
            qsf qsfVar = new qsf();
            qsfVar.J(esfVar);
            qsfVar.J(esfVar2);
            qsfVar.M(1);
            esfVar = qsfVar;
        } else if (esfVar == null) {
            esfVar = esfVar2 != null ? esfVar2 : null;
        }
        if (esfVar3 == null) {
            return esfVar;
        }
        qsf qsfVar2 = new qsf();
        if (esfVar != null) {
            qsfVar2.J(esfVar);
        }
        qsfVar2.J(esfVar3);
        return qsfVar2;
    }

    @Override // defpackage.is5
    public final Object j(Object obj, Object obj2) {
        qsf qsfVar = new qsf();
        if (obj != null) {
            qsfVar.J((esf) obj);
        }
        qsfVar.J((esf) obj2);
        return qsfVar;
    }

    @Override // defpackage.is5
    public final void k(Object obj, View view, ArrayList<View> arrayList) {
        ((esf) obj).c(new b(view, arrayList));
    }

    @Override // defpackage.is5
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((esf) obj).c(new ks5(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.is5
    public final void m(View view, Object obj) {
        if (view != null) {
            is5.g(new Rect(), view);
            ((esf) obj).C(new a());
        }
    }

    @Override // defpackage.is5
    public final void n(Object obj, Rect rect) {
        ((esf) obj).C(new c());
    }

    @Override // defpackage.is5
    public final void o(Object obj, tw1 tw1Var, tm1 tm1Var) {
        esf esfVar = (esf) obj;
        tw1Var.a(new ls5(esfVar));
        esfVar.c(new ms5(tm1Var));
    }

    @Override // defpackage.is5
    public final void p(Object obj, View view, ArrayList<View> arrayList) {
        qsf qsfVar = (qsf) obj;
        ArrayList<View> arrayList2 = qsfVar.f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            is5.d(arrayList.get(i), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(qsfVar, arrayList);
    }

    @Override // defpackage.is5
    public final void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        qsf qsfVar = (qsf) obj;
        if (qsfVar != null) {
            ArrayList<View> arrayList3 = qsfVar.f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            s(qsfVar, arrayList, arrayList2);
        }
    }

    @Override // defpackage.is5
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        qsf qsfVar = new qsf();
        qsfVar.J((esf) obj);
        return qsfVar;
    }

    public final void s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        esf esfVar = (esf) obj;
        int i = 0;
        if (esfVar instanceof qsf) {
            qsf qsfVar = (qsf) esfVar;
            int size = qsfVar.m0.size();
            while (i < size) {
                s((i < 0 || i >= qsfVar.m0.size()) ? null : qsfVar.m0.get(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (is5.h(esfVar.e)) {
            ArrayList<View> arrayList3 = esfVar.f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    esfVar.d(arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    esfVar.y(arrayList.get(size3));
                }
            }
        }
    }
}
