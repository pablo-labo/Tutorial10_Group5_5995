package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.e;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.saa;
import defpackage.vs0;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qy4 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qy4(o97 o97Var, x1e x1eVar, FragmentManager fragmentManager, e eVar) {
        this.a = 0;
        this.b = x1eVar;
        this.c = fragmentManager;
        this.d = eVar;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        b bVar;
        int i = this.a;
        af1.a aVar = c20.a.m;
        vs0.k kVar = vs0.c;
        vs0.j jVar = vs0.a;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                x1e x1eVar = (x1e) obj6;
                FragmentManager fragmentManager = (FragmentManager) obj5;
                e eVar = (e) obj4;
                b bVar2 = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((xo8) obj).getClass();
                if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ob2 ob2VarA = mb2.a(kVar, aVar, bVar2, 0);
                    int iHashCode = Long.hashCode(bVar2.k());
                    t8b t8bVarM = bVar2.m();
                    e.a aVar2 = e.a.b;
                    androidx.compose.ui.e eVarC = c.c(bVar2, aVar2);
                    gl2.j.getClass();
                    pm8.a aVar3 = gl2.a.b;
                    if (bVar2.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar2.B();
                    if (bVar2.f()) {
                        bVar2.y(aVar3);
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
                    jh2.f(bVar2, g.h(aVar2, 16.0f));
                    mx7.a(x1eVar.a, fragmentManager, eVar, bVar2, 0);
                    jh2.f(bVar2, g.h(aVar2, 16.0f));
                    if (x1eVar.a.isExisting()) {
                        bVar = bVar2;
                        bVar.L(685944564);
                    } else {
                        bVar2.L(696507535);
                        yy4.f(System.currentTimeMillis(), bVar2, 0);
                        jh2.f(bVar2, g.h(aVar2, 16.0f));
                        tr6.b(b20.INFO, null, null, ak2.I(R.string.messaging_pajim_conversation_title, bVar2), ak2.I(R.string.messaging_pajim_conversation_message, bVar2), null, bVar2, 6, 38);
                        bVar = bVar2;
                    }
                    bVar.F();
                    bVar.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 1:
                o97 o97Var = (o97) obj6;
                gu5 gu5Var = (gu5) obj5;
                gu5 gu5Var2 = (gu5) obj4;
                b bVar3 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar3.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e.a aVar4 = e.a.b;
                    androidx.compose.ui.e eVarJ = f.j(a.a(g.f(aVar4, 1.0f), new kx8((((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), u63.a0(new da2(pa2.a(R.color.utility_ai_weak_start, bVar3)), new da2(pa2.a(R.color.utility_ai_weak_end, bVar3)))), null, 6), 16.0f, 16.0f, 16.0f, 0.0f, 8);
                    ag9 ag9VarD = hl1.d(c20.a.a, false);
                    int iHashCode2 = Long.hashCode(bVar3.k());
                    t8b t8bVarM2 = bVar3.m();
                    androidx.compose.ui.e eVarC2 = c.c(bVar3, eVarJ);
                    gl2.j.getClass();
                    pm8.a aVar5 = gl2.a.b;
                    if (bVar3.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar3.B();
                    if (bVar3.f()) {
                        bVar3.y(aVar5);
                    } else {
                        bVar3.n();
                    }
                    gl2.a.d dVar = gl2.a.g;
                    ygg.y(bVar3, ag9VarD, dVar);
                    gl2.a.f fVar = gl2.a.f;
                    ygg.y(bVar3, t8bVarM2, fVar);
                    gl2.a.C0251a c0251a2 = gl2.a.j;
                    if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode2))) {
                        uz.g(iHashCode2, bVar3, iHashCode2, c0251a2);
                    }
                    gl2.a.e eVar2 = gl2.a.d;
                    ygg.y(bVar3, eVarC2, eVar2);
                    ob2 ob2VarA2 = mb2.a(kVar, aVar, bVar3, 0);
                    int iHashCode3 = Long.hashCode(bVar3.k());
                    t8b t8bVarM3 = bVar3.m();
                    androidx.compose.ui.e eVarC3 = c.c(bVar3, aVar4);
                    if (bVar3.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar3.B();
                    if (bVar3.f()) {
                        bVar3.y(aVar5);
                    } else {
                        bVar3.n();
                    }
                    ygg.y(bVar3, ob2VarA2, dVar);
                    ygg.y(bVar3, t8bVarM3, fVar);
                    if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode3))) {
                        uz.g(iHashCode3, bVar3, iHashCode3, c0251a2);
                    }
                    ygg.y(bVar3, eVarC3, eVar2);
                    androidx.compose.ui.e eVarJ2 = f.j(g.f(aVar4, 1.0f), 0.0f, 0.0f, 0.0f, 27.0f, 7);
                    ehd ehdVarA = chd.a(jVar, c20.a.j, bVar3, 48);
                    int iHashCode4 = Long.hashCode(bVar3.k());
                    t8b t8bVarM4 = bVar3.m();
                    androidx.compose.ui.e eVarC4 = c.c(bVar3, eVarJ2);
                    if (bVar3.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar3.B();
                    if (bVar3.f()) {
                        bVar3.y(aVar5);
                    } else {
                        bVar3.n();
                    }
                    ygg.y(bVar3, ehdVarA, dVar);
                    ygg.y(bVar3, t8bVarM4, fVar);
                    if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode4))) {
                        uz.g(iHashCode4, bVar3, iHashCode4, c0251a2);
                    }
                    ygg.y(bVar3, eVarC4, eVar2);
                    cif.b(ak2.I(R.string.mock_interview_banner_description, bVar3), f.j(new LayoutWeightElement(1.0f, true), 0.0f, 0.0f, 8.0f, 0.0f, 11), o97Var.c.a.c, 0L, null, o97Var.f.c, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.f, bVar3, 0, 0, 65496);
                    rq6.b(gu5Var2, g.n(aVar4, 20.0f), false, null, null, bh2.c(-1503491838, new z9(o97Var, 1), bVar3), bVar3, 196656, 28);
                    bVar3.q();
                    gt6.h(ak2.I(R.string.mock_interview_banner_cta, bVar3), gu5Var, f.j(aVar4, 0.0f, 0.0f, 0.0f, 16.0f, 7), null, false, false, null, null, null, bVar3, 0, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
                    bVar3.q();
                    f17.a(z2b.a(R.drawable.ai_interview_spot_ai_color, 0, bVar3), null, androidx.compose.foundation.layout.b.a.h(aVar4, c20.a.i), null, null, 0.0f, null, bVar3, 48, 120);
                    bVar3.q();
                } else {
                    bVar3.D();
                }
                return j6g.a;
            default:
                o97 o97Var2 = (o97) obj6;
                List<raa> list = (List) obj5;
                Function1 function1 = (Function1) obj4;
                b bVar4 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar4.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    o97.g gVar = o97Var2.i;
                    androidx.compose.ui.e eVarJ3 = f.j(e.a.b, 0.0f, 0.0f, 4.0f, 0.0f, 11);
                    ehd ehdVarA2 = chd.a(jVar, c20.a.k, bVar4, 48);
                    int iG = bVar4.G();
                    t8b t8bVarM5 = bVar4.m();
                    androidx.compose.ui.e eVarC5 = c.c(bVar4, eVarJ3);
                    gl2.j.getClass();
                    pm8.a aVar6 = gl2.a.b;
                    if (bVar4.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar4.B();
                    if (bVar4.f()) {
                        bVar4.y(aVar6);
                    } else {
                        bVar4.n();
                    }
                    ygg.y(bVar4, ehdVarA2, gl2.a.g);
                    ygg.y(bVar4, t8bVarM5, gl2.a.f);
                    gl2.a.C0251a c0251a3 = gl2.a.j;
                    if (bVar4.f() || !wl7.b(bVar4.v(), Integer.valueOf(iG))) {
                        uz.g(iG, bVar4, iG, c0251a3);
                    }
                    ygg.y(bVar4, eVarC5, gl2.a.d);
                    b4g.i(list, bVar4, 0);
                    if (list == null) {
                        bVar4.L(2092930560);
                    } else {
                        bVar4.L(2092930561);
                        for (raa raaVar : list) {
                            if (wl7.b(raaVar.a, saa.a.a)) {
                                bVar4.L(-1380289410);
                                bVar4.F();
                                function1.invoke("Back button can only be in leading items, ignoring trailing back button");
                            } else {
                                bVar4.L(-1380145539);
                                b4g.j(raaVar, bVar4, 0);
                                bVar4.F();
                            }
                        }
                    }
                    bVar4.F();
                    bVar4.q();
                } else {
                    bVar4.D();
                }
                return j6g.a;
        }
    }

    public /* synthetic */ qy4(o97 o97Var, Object obj, vu5 vu5Var, int i) {
        this.a = i;
        this.b = o97Var;
        this.c = obj;
        this.d = vu5Var;
    }
}
