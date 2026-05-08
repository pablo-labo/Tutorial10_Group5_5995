package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.locationselector.LocationSelectorFragment;
import defpackage.c20;
import defpackage.cd4;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n19 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n19(Function1 function1, String str, gu5 gu5Var, int i) {
        this.a = 2;
        this.b = function1;
        this.c = str;
        this.d = gu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 2;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                LocationSelectorFragment locationSelectorFragment = (LocationSelectorFragment) obj5;
                List list = (List) obj4;
                List list2 = (List) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                qf8<Object>[] qf8VarArr = LocationSelectorFragment.f;
                if (bVar.o(1 & iIntValue, (iIntValue & 3) != 2)) {
                    ne4 ne4Var = p97.a;
                    dd4 dd4Var = dd4.a;
                    ad4 ad4Var = dd4.n().a;
                    ad4Var.getClass();
                    ad4Var.e(cd4.a.D0);
                    cd4.i3.a.getClass();
                    rm2.a(ne4Var.a(h07.a), bh2.c(1010016884, new om4(i2, locationSelectorFragment, list, list2), bVar), bVar, 56);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                o97 o97Var = (o97) obj5;
                aje ajeVar = (aje) obj4;
                String str = (String) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e.a aVar = e.a.b;
                    e eVarF = g.f(aVar, 1.0f);
                    o97.g gVar = o97Var.i;
                    e eVarG = f.g(eVarF, 12.0f, 8.0f);
                    ehd ehdVarA = chd.a(vs0.g, c20.a.k, bVar2, 54);
                    int iHashCode = Long.hashCode(bVar2.k());
                    t8b t8bVarM = bVar2.m();
                    e eVarC = c.c(bVar2, eVarG);
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
                    gl2.a.d dVar = gl2.a.g;
                    ygg.y(bVar2, ehdVarA, dVar);
                    gl2.a.f fVar = gl2.a.f;
                    ygg.y(bVar2, t8bVarM, fVar);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar2, iHashCode, c0251a);
                    }
                    gl2.a.e eVar = gl2.a.d;
                    ygg.y(bVar2, eVarC, eVar);
                    ob2 ob2VarA = mb2.a(new vs0.i(4.0f, true, new us0(0)), c20.a.m, bVar2, 0);
                    int iHashCode2 = Long.hashCode(bVar2.k());
                    t8b t8bVarM2 = bVar2.m();
                    e eVarC2 = c.c(bVar2, aVar);
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
                    ygg.y(bVar2, ob2VarA, dVar);
                    ygg.y(bVar2, t8bVarM2, fVar);
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                        uz.g(iHashCode2, bVar2, iHashCode2, c0251a);
                    }
                    ygg.y(bVar2, eVarC2, eVar);
                    kv6.a(ajeVar.b, null, null, null, false, null, bVar2, 0, 126);
                    cif.b(ajeVar.c.size() + " " + str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, v1c.d(o97Var, false), bVar2, 0, 0, 65534);
                    bVar2.q();
                    ev6.b(fv6.I1, null, null, null, o97Var.c.a.a, null, bVar2, 6, 46);
                    bVar2.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
            default:
                ((Integer) obj2).getClass();
                b9g.a((Function1) obj5, (String) obj4, (gu5) obj3, (b) obj, ka2.L(55));
                return j6g.a;
        }
    }

    public /* synthetic */ n19(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
