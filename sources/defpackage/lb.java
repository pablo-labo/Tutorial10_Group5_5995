package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jobsearch.R;
import com.indeed.android.profile.screens.sheets.profilesubtab.award.a;
import defpackage.af1;
import defpackage.c20;
import defpackage.ft2;
import defpackage.gl2;
import defpackage.ig3;
import defpackage.pm8;
import defpackage.vs0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lb implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Boolean bool = Boolean.FALSE;
                ((g4a) obj3).setValue(new ig3(null, bool, new ig3.b(bool, (s38) obj, (Integer) obj2)));
                return j6g.a;
            case 1:
                ((Integer) obj2).getClass();
                wo0.d((xo0) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 2:
                ((Integer) obj2).getClass();
                ((e23) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case 3:
                tg2 tg2Var = (tg2) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Iterator<T> it = tg2Var.c.iterator();
                    while (it.hasNext()) {
                        le4.b((tg2) it.next(), null, bVar, 0, 2);
                    }
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 4:
                ((Integer) obj2).getClass();
                ((a) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case 5:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                ((f51) ((com.indeed.android.profile.screens.sheets.profilesubtab.militaryservice.a) obj3).j0.getValue()).z(str, str2);
                return j6g.a;
            case 6:
                ((Integer) obj2).getClass();
                ((lk4) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case 7:
                ah2 ah2Var = (ah2) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ah2Var.invoke(bVar2, 0);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 8:
                ((Integer) obj2).getClass();
                vj7.f((wj7) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((Integer) obj2).getClass();
                ny7.a((vnd) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 10:
                twg twgVar = (twg) obj3;
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e.a aVar = e.a.b;
                    e eVarF = g.f(aVar, 1.0f);
                    vs0.c cVar = vs0.e;
                    af1.b bVar4 = c20.a.j;
                    ehd ehdVarA = chd.a(cVar, bVar4, bVar3, 6);
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
                    gl2.a.d dVar = gl2.a.g;
                    ygg.y(bVar3, ehdVarA, dVar);
                    gl2.a.f fVar = gl2.a.f;
                    ygg.y(bVar3, t8bVarM, fVar);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar3, iHashCode, c0251a);
                    }
                    gl2.a.e eVar = gl2.a.d;
                    ygg.y(bVar3, eVarC, eVar);
                    f17.a(z2b.a(R.drawable.ic_grabber, 0, bVar3), null, f.a(ygg.g(androidx.compose.foundation.layout.e.b(aVar, 16.0f, -10.0f), twgVar.g().d), "Grabber"), null, ft2.a.b, 0.0f, null, bVar3, 24624, 104);
                    bVar3.q();
                    e eVarF2 = g.f(aVar, 1.0f);
                    ehd ehdVarA2 = chd.a(cVar, bVar4, bVar3, 6);
                    int iHashCode2 = Long.hashCode(bVar3.k());
                    t8b t8bVarM2 = bVar3.m();
                    e eVarC2 = c.c(bVar3, eVarF2);
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
                    ygg.y(bVar3, ehdVarA2, dVar);
                    ygg.y(bVar3, t8bVarM2, fVar);
                    if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode2))) {
                        uz.g(iHashCode2, bVar3, iHashCode2, c0251a);
                    }
                    ygg.y(bVar3, eVarC2, eVar);
                    String str3 = twgVar.g().a;
                    if (str3 == null) {
                        bVar3.L(1075218150);
                    } else {
                        bVar3.L(1075218151);
                        Object objV = bVar3.v();
                        if (objV == b.a.a) {
                            objV = new xr(8);
                            bVar3.p(objV);
                        }
                        cif.b(str3, b5e.b(aVar, false, (Function1) objV), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, bVar3, 0, 3120, 120828);
                        bVar3 = bVar3;
                    }
                    bVar3.F();
                    bVar3.q();
                } else {
                    bVar3.D();
                }
                return j6g.a;
            default:
                ((Integer) obj2).getClass();
                cka.a((ArrayList) obj3, (b) obj, ka2.L(1));
                return j6g.a;
        }
    }

    public /* synthetic */ lb(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
