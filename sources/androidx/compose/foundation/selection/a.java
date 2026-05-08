package androidx.compose.foundation.selection;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import defpackage.d3a;
import defpackage.e3a;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.pa7;
import defpackage.qed;
import defpackage.tf7;
import defpackage.ua7;
import defpackage.wu5;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: androidx.compose.foundation.selection.a$a, reason: collision with other inner class name */
    public static final class C0015a implements wu5<e, androidx.compose.runtime.b, Integer, e> {
        public final /* synthetic */ pa7 a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ qed d;
        public final /* synthetic */ gu5 e;

        public C0015a(pa7 pa7Var, boolean z, boolean z2, qed qedVar, gu5 gu5Var) {
            this.a = pa7Var;
            this.b = z;
            this.c = z2;
            this.d = qedVar;
            this.e = gu5Var;
        }

        @Override // defpackage.wu5
        public final e q(e eVar, androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            num.intValue();
            bVar2.L(-1525724089);
            Object objV = bVar2.v();
            if (objV == b.a.a) {
                objV = new e3a();
                bVar2.p(objV);
            }
            d3a d3aVar = (d3a) objV;
            e eVarO = androidx.compose.foundation.e.a(e.a.b, d3aVar, this.a).o(new SelectableElement(this.b, d3aVar, null, false, this.c, this.d, this.e));
            bVar2.F();
            return eVarO;
        }
    }

    public static final e a(e eVar, boolean z, d3a d3aVar, pa7 pa7Var, boolean z2, qed qedVar, gu5<j6g> gu5Var) {
        e eVarA;
        if (pa7Var instanceof ua7) {
            eVarA = new SelectableElement(z, d3aVar, (ua7) pa7Var, false, z2, qedVar, gu5Var);
        } else if (pa7Var == null) {
            eVarA = new SelectableElement(z, d3aVar, null, false, z2, qedVar, gu5Var);
        } else {
            e.a aVar = e.a.b;
            if (d3aVar != null) {
                eVarA = androidx.compose.foundation.e.a(aVar, d3aVar, pa7Var).o(new SelectableElement(z, d3aVar, null, false, z2, qedVar, gu5Var));
            } else {
                eVarA = androidx.compose.ui.c.a(aVar, tf7.a, new C0015a(pa7Var, z, z2, qedVar, gu5Var));
            }
        }
        return eVar.o(eVarA);
    }

    public static e b(e eVar, boolean z, boolean z2, qed qedVar, gu5 gu5Var, int i) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        return eVar.o(new SelectableElement(z, null, null, true, z2, qedVar, gu5Var));
    }
}
