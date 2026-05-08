package defpackage;

import android.content.Context;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bq0 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bq0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                Context context = (Context) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((xo8) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String string = context.getString(R.string.notifications);
                    string.getClass();
                    qq0.f(string, bVar, 0);
                } else {
                    bVar.D();
                }
                return j6g.a;
            default:
                o97 o97Var = (o97) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e.a aVar = e.a.b;
                    e eVarI = f.i(a.b(g.f(aVar, 1.0f), eu6.u, ytc.a), 16.0f, 20.0f, 16.0f, 24.0f);
                    ob2 ob2VarA = mb2.a(vs0.e, c20.a.n, bVar2, 54);
                    int iHashCode = Long.hashCode(bVar2.k());
                    t8b t8bVarM = bVar2.m();
                    e eVarC = c.c(bVar2, eVarI);
                    gl2.j.getClass();
                    pm8.a aVar2 = gl2.a.b;
                    if (bVar2.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar2.B();
                    if (bVar2.f()) {
                        bVar2.y(aVar2);
                    } else {
                        bVar2.n();
                    }
                    ygg.y(bVar2, ob2VarA, gl2.a.g);
                    ygg.y(bVar2, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar2, iHashCode, c0251a);
                    }
                    ygg.y(bVar2, eVarC, gl2.a.d);
                    tx6.a(androidx.compose.ui.platform.f.a(aVar, "LoadingIndicator"), "", false, null, bVar2, 54, 12);
                    e eVarJ = f.j(aVar, 0.0f, 8.0f, 0.0f, 8.0f, 5);
                    String strI = ak2.I(R.string.proctor_refresh_fetching_account_details, bVar2);
                    tjf tjfVar = o97Var.j.f;
                    vn5 vn5Var = e07.a;
                    to5 to5Var = d07.a;
                    cif.b(strI, eVarJ, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(tjfVar, eu6.k, 0L, to5Var, null, vn5Var, 0L, 0, 0L, null, null, 0, 16777178), bVar2, 48, 0, 65532);
                    cif.b(ak2.I(R.string.proctor_refresh_fetching_may_take_few_seconds, bVar2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.g, eu6.m, 0L, to5Var, null, vn5Var, 0L, 0, 0L, null, null, 0, 16777178), bVar2, 0, 0, 65534);
                    bVar2.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
        }
    }
}
