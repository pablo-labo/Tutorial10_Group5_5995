package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import defpackage.d3a;
import defpackage.e3a;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.lg8;
import defpackage.pa7;
import defpackage.pg8;
import defpackage.qed;
import defpackage.tf7;
import defpackage.ua7;
import defpackage.wu5;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    public static final class a implements wu5<androidx.compose.ui.e, androidx.compose.runtime.b, Integer, androidx.compose.ui.e> {
        public final /* synthetic */ pa7 a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ String c;
        public final /* synthetic */ qed d;
        public final /* synthetic */ gu5 e;

        public a(pa7 pa7Var, boolean z, String str, qed qedVar, gu5 gu5Var) {
            this.a = pa7Var;
            this.b = z;
            this.c = str;
            this.d = qedVar;
            this.e = gu5Var;
        }

        @Override // defpackage.wu5
        public final androidx.compose.ui.e q(androidx.compose.ui.e eVar, androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            num.intValue();
            bVar2.L(-1525724089);
            Object objV = bVar2.v();
            if (objV == b.a.a) {
                objV = new e3a();
                bVar2.p(objV);
            }
            d3a d3aVar = (d3a) objV;
            androidx.compose.ui.e eVarO = e.a(e.a.b, d3aVar, this.a).o(new ClickableElement(d3aVar, null, false, this.b, this.c, this.d, this.e));
            bVar2.F();
            return eVarO;
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, d3a d3aVar, pa7 pa7Var, boolean z, String str, qed qedVar, gu5<j6g> gu5Var) {
        androidx.compose.ui.e eVarA;
        if (pa7Var instanceof ua7) {
            eVarA = new ClickableElement(d3aVar, (ua7) pa7Var, false, z, str, qedVar, gu5Var);
        } else if (pa7Var == null) {
            eVarA = new ClickableElement(d3aVar, null, false, z, str, qedVar, gu5Var);
        } else {
            e.a aVar = e.a.b;
            if (d3aVar != null) {
                eVarA = e.a(aVar, d3aVar, pa7Var).o(new ClickableElement(d3aVar, null, false, z, str, qedVar, gu5Var));
            } else {
                eVarA = androidx.compose.ui.c.a(aVar, tf7.a, new a(pa7Var, z, str, qedVar, gu5Var));
            }
        }
        return eVar.o(eVarA);
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, d3a d3aVar, pa7 pa7Var, boolean z, String str, qed qedVar, gu5 gu5Var, int i) {
        qed qedVar2;
        androidx.compose.ui.e eVar2;
        d3a d3aVar2;
        pa7 pa7Var2;
        gu5 gu5Var2;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        String str2 = (i & 8) != 0 ? null : str;
        if ((i & 16) != 0) {
            qedVar2 = null;
            d3aVar2 = d3aVar;
            pa7Var2 = pa7Var;
            gu5Var2 = gu5Var;
            eVar2 = eVar;
        } else {
            qedVar2 = qedVar;
            eVar2 = eVar;
            d3aVar2 = d3aVar;
            pa7Var2 = pa7Var;
            gu5Var2 = gu5Var;
        }
        return a(eVar2, d3aVar2, pa7Var2, z2, str2, qedVar2, gu5Var2);
    }

    public static androidx.compose.ui.e d(androidx.compose.ui.e eVar, boolean z, String str, qed qedVar, gu5 gu5Var, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        return eVar.o(new ClickableElement(null, null, true, z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : qedVar, gu5Var));
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, d3a d3aVar, gu5 gu5Var) {
        return eVar.o(new CombinedClickableElement(d3aVar, false, gu5Var, null));
    }

    public static androidx.compose.ui.e f(androidx.compose.ui.e eVar, gu5 gu5Var, gu5 gu5Var2) {
        return eVar.o(new CombinedClickableElement(null, true, gu5Var2, gu5Var));
    }

    public static final boolean g(KeyEvent keyEvent) {
        long jY = pg8.y(keyEvent);
        int i = lg8.p;
        return lg8.a(jY, lg8.h) || lg8.a(jY, lg8.k) || lg8.a(jY, lg8.o) || lg8.a(jY, lg8.j);
    }
}
