package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cr2 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o97 b;
    public final /* synthetic */ Serializable c;

    public /* synthetic */ cr2(o97 o97Var, Serializable serializable, int i) {
        this.a = i;
        this.b = o97Var;
        this.c = serializable;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        af1.b bVar = c20.a.j;
        e.a aVar = e.a.b;
        Serializable serializable = this.c;
        o97 o97Var = this.b;
        switch (i) {
            case 0:
                String str = (String) serializable;
                b bVar2 = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ml1) obj).getClass();
                if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    fif.b(str, f.h(aVar, 8.0f, 0.0f, 2), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.d, 0L, 0L, o97Var.f.c, null, null, 0L, 3, 0L, null, null, 0, 16744443), bVar2, 48, 0, 65532);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 1:
                String str2 = (String) serializable;
                b bVar3 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar3.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    o97.g gVar = o97Var.i;
                    e eVarF = f.f(aVar, 16.0f);
                    ehd ehdVarA = chd.a(new vs0.i(16.0f, true, new us0(0)), bVar, bVar3, 0);
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
                    mwe.a(androidx.compose.ui.platform.f.a(aVar, "DeleteIcon"), fv6.M9, null, z2b.a(R.drawable.ic_idl_trash_can_24, 0, bVar3), null, new da2(o97Var.c.a.g.g.a), bVar3, 24630, 4);
                    cif.b(str2, null, eu6.m0, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, hz6.g, bVar3, 0, 0, 65530);
                    bVar3.q();
                } else {
                    bVar3.D();
                }
                return j6g.a;
            default:
                ArrayList arrayList = (ArrayList) serializable;
                b bVar4 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar4.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e eVarF2 = f.f(aVar, 16.0f);
                    ehd ehdVarA2 = chd.a(new vs0.i(16.0f, true, new us0(0)), bVar, bVar4, 0);
                    int iHashCode2 = Long.hashCode(bVar4.k());
                    t8b t8bVarM2 = bVar4.m();
                    e eVarC2 = c.c(bVar4, eVarF2);
                    gl2.j.getClass();
                    pm8.a aVar3 = gl2.a.b;
                    if (bVar4.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar4.B();
                    if (bVar4.f()) {
                        bVar4.y(aVar3);
                    } else {
                        bVar4.n();
                    }
                    ygg.y(bVar4, ehdVarA2, gl2.a.g);
                    ygg.y(bVar4, t8bVarM2, gl2.a.f);
                    gl2.a.C0251a c0251a2 = gl2.a.j;
                    if (bVar4.f() || !wl7.b(bVar4.v(), Integer.valueOf(iHashCode2))) {
                        uz.g(iHashCode2, bVar4, iHashCode2, c0251a2);
                    }
                    ygg.y(bVar4, eVarC2, gl2.a.d);
                    cif.b(ak2.J(R.string.delete_all, new Object[]{Integer.valueOf(arrayList.size())}, bVar4), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.f, o97Var.c.a.g.g.a, 0L, o97Var.f.c, null, o97Var.d.a, 0L, 0, 0L, null, null, 0, 16777178), bVar4, 0, 0, 65534);
                    bVar4.q();
                } else {
                    bVar4.D();
                }
                return j6g.a;
        }
    }
}
