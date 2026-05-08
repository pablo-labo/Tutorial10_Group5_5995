package defpackage;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import defpackage.esf;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class qsf extends esf {
    public int o0;
    public ArrayList<esf> m0 = new ArrayList<>();
    public boolean n0 = true;
    public boolean p0 = false;
    public int q0 = 0;

    public class a extends nsf {
        public final /* synthetic */ esf a;

        public a(esf esfVar) {
            this.a = esfVar;
        }

        @Override // esf.d
        public final void d(esf esfVar) {
            this.a.A();
            esfVar.x(this);
        }
    }

    public static class b extends nsf {
        public qsf a;

        @Override // esf.d
        public final void d(esf esfVar) {
            qsf qsfVar = this.a;
            int i = qsfVar.o0 - 1;
            qsfVar.o0 = i;
            if (i == 0) {
                qsfVar.p0 = false;
                qsfVar.o();
            }
            esfVar.x(this);
        }

        @Override // defpackage.nsf, esf.d
        public final void e(esf esfVar) {
            qsf qsfVar = this.a;
            if (qsfVar.p0) {
                return;
            }
            qsfVar.H();
            qsfVar.p0 = true;
        }
    }

    @Override // defpackage.esf
    public final void A() {
        ArrayList<esf> arrayList;
        if (this.m0.isEmpty()) {
            H();
            o();
            return;
        }
        b bVar = new b();
        bVar.a = this;
        Iterator<esf> it = this.m0.iterator();
        while (it.hasNext()) {
            it.next().c(bVar);
        }
        this.o0 = this.m0.size();
        if (this.n0) {
            Iterator<esf> it2 = this.m0.iterator();
            while (it2.hasNext()) {
                it2.next().A();
            }
            return;
        }
        int i = 1;
        while (true) {
            int size = this.m0.size();
            arrayList = this.m0;
            if (i >= size) {
                break;
            }
            arrayList.get(i - 1).c(new a(this.m0.get(i)));
            i++;
        }
        esf esfVar = arrayList.get(0);
        if (esfVar != null) {
            esfVar.A();
        }
    }

    @Override // defpackage.esf
    public final void C(esf.c cVar) {
        this.h0 = cVar;
        this.q0 |= 8;
        int size = this.m0.size();
        for (int i = 0; i < size; i++) {
            this.m0.get(i).C(cVar);
        }
    }

    @Override // defpackage.esf
    public final void E(v1 v1Var) {
        super.E(v1Var);
        this.q0 |= 4;
        if (this.m0 != null) {
            for (int i = 0; i < this.m0.size(); i++) {
                this.m0.get(i).E(v1Var);
            }
        }
    }

    @Override // defpackage.esf
    public final void F() {
        this.q0 |= 2;
        int size = this.m0.size();
        for (int i = 0; i < size; i++) {
            this.m0.get(i).F();
        }
    }

    @Override // defpackage.esf
    public final void G(long j) {
        this.b = j;
    }

    @Override // defpackage.esf
    public final String I(String str) {
        String strI = super.I(str);
        for (int i = 0; i < this.m0.size(); i++) {
            StringBuilder sbG = h5.g(strI, "\n");
            sbG.append(this.m0.get(i).I(str.concat("  ")));
            strI = sbG.toString();
        }
        return strI;
    }

    public final void J(esf esfVar) {
        this.m0.add(esfVar);
        esfVar.X = this;
        long j = this.c;
        if (j >= 0) {
            esfVar.B(j);
        }
        if ((this.q0 & 1) != 0) {
            esfVar.D(this.d);
        }
        if ((this.q0 & 2) != 0) {
            esfVar.F();
        }
        if ((this.q0 & 4) != 0) {
            esfVar.E(this.i0);
        }
        if ((this.q0 & 8) != 0) {
            esfVar.C(this.h0);
        }
    }

    @Override // defpackage.esf
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final void B(long j) {
        ArrayList<esf> arrayList;
        this.c = j;
        if (j < 0 || (arrayList = this.m0) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.m0.get(i).B(j);
        }
    }

    @Override // defpackage.esf
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void D(TimeInterpolator timeInterpolator) {
        this.q0 |= 1;
        ArrayList<esf> arrayList = this.m0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.m0.get(i).D(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    public final void M(int i) {
        if (i == 0) {
            this.n0 = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(p6.c(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.n0 = false;
        }
    }

    @Override // defpackage.esf
    public final void cancel() {
        super.cancel();
        int size = this.m0.size();
        for (int i = 0; i < size; i++) {
            this.m0.get(i).cancel();
        }
    }

    @Override // defpackage.esf
    public final void d(View view) {
        for (int i = 0; i < this.m0.size(); i++) {
            this.m0.get(i).d(view);
        }
        this.f.add(view);
    }

    @Override // defpackage.esf
    public final void f(usf usfVar) {
        View view = usfVar.b;
        if (v(view)) {
            for (esf esfVar : this.m0) {
                if (esfVar.v(view)) {
                    esfVar.f(usfVar);
                    usfVar.c.add(esfVar);
                }
            }
        }
    }

    @Override // defpackage.esf
    public final void h(usf usfVar) {
        int size = this.m0.size();
        for (int i = 0; i < size; i++) {
            this.m0.get(i).h(usfVar);
        }
    }

    @Override // defpackage.esf
    public final void i(usf usfVar) {
        View view = usfVar.b;
        if (v(view)) {
            for (esf esfVar : this.m0) {
                if (esfVar.v(view)) {
                    esfVar.i(usfVar);
                    usfVar.c.add(esfVar);
                }
            }
        }
    }

    @Override // defpackage.esf
    /* JADX INFO: renamed from: l */
    public final esf clone() {
        qsf qsfVar = (qsf) super.clone();
        qsfVar.m0 = new ArrayList<>();
        int size = this.m0.size();
        for (int i = 0; i < size; i++) {
            esf esfVarClone = this.m0.get(i).clone();
            qsfVar.m0.add(esfVarClone);
            esfVarClone.X = qsfVar;
        }
        return qsfVar;
    }

    @Override // defpackage.esf
    public final void n(ViewGroup viewGroup, vsf vsfVar, vsf vsfVar2, ArrayList<usf> arrayList, ArrayList<usf> arrayList2) {
        long j = this.b;
        int size = this.m0.size();
        for (int i = 0; i < size; i++) {
            esf esfVar = this.m0.get(i);
            if (j > 0 && (this.n0 || i == 0)) {
                long j2 = esfVar.b;
                if (j2 > 0) {
                    esfVar.G(j2 + j);
                } else {
                    esfVar.G(j);
                }
            }
            esfVar.n(viewGroup, vsfVar, vsfVar2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.esf
    public final void w(View view) {
        super.w(view);
        int size = this.m0.size();
        for (int i = 0; i < size; i++) {
            this.m0.get(i).w(view);
        }
    }

    @Override // defpackage.esf
    public final void y(View view) {
        for (int i = 0; i < this.m0.size(); i++) {
            this.m0.get(i).y(view);
        }
        this.f.remove(view);
    }

    @Override // defpackage.esf
    public final void z(View view) {
        super.z(view);
        int size = this.m0.size();
        for (int i = 0; i < size; i++) {
            this.m0.get(i).z(view);
        }
    }
}
