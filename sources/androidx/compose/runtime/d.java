package androidx.compose.runtime;

import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import defpackage.a3a;
import defpackage.gke;
import defpackage.im7;
import defpackage.j6g;
import defpackage.jm7;
import defpackage.l5;
import defpackage.nr0;
import defpackage.ol2;
import defpackage.p0a;
import defpackage.q0a;
import defpackage.rta;
import defpackage.su2;
import defpackage.wl7;
import defpackage.wsc;
import defpackage.x20;
import defpackage.z92;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final rta a = new rta("provider");
    public static final rta b = new rta("provider");
    public static final rta c = new rta("compositionLocalMap");
    public static final rta d = new rta("providers");
    public static final rta e = new rta("reference");
    public static final ol2 f = new ol2(0);

    public static final class a implements wsc {
        public final /* synthetic */ su2 a;
        public final /* synthetic */ q0a b;

        public a(su2 su2Var, q0a q0aVar) {
            this.a = su2Var;
            this.b = q0aVar;
        }

        @Override // defpackage.wsc
        public final void a(Object obj) {
        }

        @Override // defpackage.wsc
        public final void d() {
        }

        @Override // defpackage.wsc
        public final jm7 p(i iVar, Object obj) {
            jm7 jm7VarP;
            su2 su2Var = this.a;
            wsc wscVar = su2Var instanceof wsc ? (wsc) su2Var : null;
            jm7 jm7Var = jm7.a;
            if (wscVar == null || (jm7VarP = wscVar.p(iVar, obj)) == null) {
                jm7VarP = jm7Var;
            }
            if (jm7VarP != jm7Var) {
                return jm7VarP;
            }
            q0a q0aVar = this.b;
            q0aVar.f = z92.g1(new Pair(iVar, obj), q0aVar.f);
            return jm7.b;
        }
    }

    public static final void a(ArrayList arrayList, int i, int i2) {
        int iF = f(i, arrayList);
        if (iF < 0) {
            iF = -(iF + 1);
        }
        while (iF < arrayList.size() && ((im7) arrayList.get(iF)).b < i2) {
        }
    }

    public static final void b(l lVar, ArrayList arrayList, int i) {
        boolean zL = lVar.l(i);
        int[] iArr = lVar.b;
        if (zL) {
            arrayList.add(lVar.n(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            b(lVar, arrayList, i3);
        }
    }

    public static final void c(String str) {
        throw new ComposeRuntimeError(l5.m("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void d(String str) {
        throw new ComposeRuntimeError(l5.m("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final p0a e(su2 su2Var, q0a q0aVar, n nVar, nr0<?> nr0Var) {
        b.a.C0020a c0020a = b.a.a;
        m mVar = new m();
        if (nVar.e != null) {
            mVar.b();
        }
        if (nVar.f != null) {
            mVar.Z = new a3a<>();
        }
        int i = nVar.t;
        if (nr0Var != null && nVar.E(i) > 0) {
            int iF = nVar.v;
            while (iF > 0 && !nVar.x(iF)) {
                iF = nVar.F(iF, nVar.b);
            }
            if (iF >= 0 && nVar.x(iF)) {
                Object objD = nVar.D(iF);
                int i2 = iF + 1;
                int iT = nVar.t(iF) + iF;
                int iE = 0;
                while (i2 < iT) {
                    int iT2 = nVar.t(i2) + i2;
                    if (iT2 > i) {
                        break;
                    }
                    iE += nVar.x(i2) ? 1 : nVar.E(i2);
                    i2 = iT2;
                }
                int iE2 = nVar.x(i) ? 1 : nVar.E(i);
                nr0Var.m(objD);
                nr0Var.f(iE, iE2);
                nr0Var.p();
            }
        }
        n nVarF = mVar.f();
        try {
            nVarF.d();
            nVarF.R(126665345, q0aVar.a, c0020a, false);
            n.y(nVarF);
            nVarF.T(q0aVar.b);
            List listC = nVar.C(q0aVar.e, nVarF);
            nVarF.M();
            nVarF.j();
            nVarF.k();
            nVarF.e(true);
            p0a p0aVar = new p0a(mVar);
            List list = listC;
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    x20 x20Var = (x20) listC.get(i3);
                    if (mVar.g(x20Var)) {
                        int iA = mVar.a(x20Var);
                        int iB = gke.b(iA, mVar.a);
                        int i4 = iA + 1;
                        if (((i4 < mVar.b ? mVar.a[(i4 * 5) + 4] : mVar.c.length) - iB > 0 ? mVar.c[iB] : c0020a) instanceof i) {
                            a aVar = new a(su2Var, q0aVar);
                            nVarF = mVar.f();
                            try {
                                i.a.a(nVarF, listC, aVar);
                                j6g j6gVar = j6g.a;
                                nVarF.e(true);
                                return p0aVar;
                            } finally {
                            }
                        }
                    }
                }
            }
            return p0aVar;
        } finally {
        }
    }

    public static final int f(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iC = wl7.c(((im7) list.get(i3)).b, i);
            if (iC < 0) {
                i2 = i3 + 1;
            } else {
                if (iC <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void g(n nVar, int i, Object obj) {
        int iH = nVar.h(i);
        Object[] objArr = nVar.c;
        Object obj2 = objArr[iH];
        objArr[iH] = b.a.a;
        if (obj == obj2) {
            return;
        }
        c("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }
}
