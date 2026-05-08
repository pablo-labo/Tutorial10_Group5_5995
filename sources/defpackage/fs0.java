package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fs0 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fs0(Context context, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = context;
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Context context = this.b;
        switch (i) {
            case 0:
                o97 o97Var = (o97) obj5;
                ude udeVar = (ude) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((xo8) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e.a aVar = e.a.b;
                    e eVarF = g.f(aVar, 1.0f);
                    ag9 ag9VarD = hl1.d(c20.a.e, false);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarF);
                    gl2.j.getClass();
                    pm8.a aVar2 = gl2.a.b;
                    if (bVar.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar.B();
                    if (bVar.f()) {
                        bVar.y(aVar2);
                    } else {
                        bVar.n();
                    }
                    ygg.y(bVar, ag9VarD, gl2.a.g);
                    ygg.y(bVar, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar, iHashCode, c0251a);
                    }
                    ygg.y(bVar, eVarC, gl2.a.d);
                    String string = context.getString(R.string.not_seeing_an_archived_application);
                    string.getClass();
                    o97.g gVar = o97Var.i;
                    e eVarJ = f.j(aVar, 0.0f, 16.0f, 0.0f, 24.0f, 5);
                    boolean zX = bVar.x(udeVar) | bVar.x(context);
                    Object objV = bVar.v();
                    if (zX || objV == b.a.a) {
                        objV = new pa0(2, udeVar, context);
                        bVar.p(objV);
                    }
                    cif.b(string, androidx.compose.foundation.b.d(eVarJ, false, null, null, (gu5) objV, 15), o97Var.c.b.g.g.a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.g, bVar, 0, 0, 65528);
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            default:
                androidx.fragment.app.g gVar2 = (androidx.fragment.app.g) context;
                wu5 wu5Var = (wu5) obj5;
                svb svbVar = (svb) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    q1c.d(bh2.c(1395426689, new wyb(gVar2, wu5Var, 1), bVar2), bVar2, 6);
                    q1c.d(bh2.c(377491242, new n0c(gVar2, svbVar, wu5Var), bVar2), bVar2, 6);
                    q1c.d(bh2.c(784518729, new n1c(1, gVar2, wu5Var), bVar2), bVar2, 6);
                } else {
                    bVar2.D();
                }
                return j6g.a;
        }
    }
}
