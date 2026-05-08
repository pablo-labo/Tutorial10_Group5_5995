package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.fragment.app.g;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uzb implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uzb(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        byte b = 0;
        switch (i) {
            case 0:
                g gVar = (g) obj5;
                wu5 wu5Var = (wu5) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    q1c.d(bh2.c(-331747969, new zq2(2, gVar, wu5Var), bVar), bVar, 6);
                    q1c.d(bh2.c(1117427510, new g1c(wu5Var, gVar, b == true ? 1 : 0), bVar), bVar, 6);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                g gVar2 = (g) obj5;
                wu5 wu5Var2 = (wu5) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    q1c.d(bh2.c(-1385840580, new l1c(gVar2, wu5Var2, 1), bVar2), bVar2, 6);
                    q1c.d(bh2.c(-369261659, new x0c(gVar2, wu5Var2, 1), bVar2), bVar2, 6);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            default:
                o97 o97Var = (o97) obj5;
                String str = (String) obj4;
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e.a aVar = e.a.b;
                    e eVarF = androidx.compose.foundation.layout.g.f(aVar, 1.0f);
                    ehd ehdVarA = chd.a(vs0.e, c20.a.k, bVar3, 54);
                    int iHashCode = Long.hashCode(bVar3.k());
                    t8b t8bVarM = bVar3.m();
                    e eVarC = c.c(bVar3, eVarF);
                    gl2.j.getClass();
                    pm8.a aVar2 = gl2.a.b;
                    if (bVar3.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar3.B();
                    if (bVar3.f()) {
                        bVar3.y(aVar2);
                    } else {
                        bVar3.n();
                    }
                    ygg.y(bVar3, ehdVarA, gl2.a.g);
                    ygg.y(bVar3, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar3, iHashCode, c0251a);
                    }
                    ygg.y(bVar3, eVarC, gl2.a.d);
                    f17.a(z2b.a(R.drawable.ai_interview_mic, 0, bVar3), null, null, null, null, 0.0f, null, bVar3, 48, 124);
                    jh2.f(bVar3, androidx.compose.foundation.layout.g.r(aVar, 8.0f));
                    cif.b(str, null, 0L, 0L, null, o97Var.f.c, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.f, bVar3, 0, 0, 65502);
                    bVar3.q();
                } else {
                    bVar3.D();
                }
                return j6g.a;
        }
    }
}
