package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.ft2;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pi2 implements wu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ pi2(int i) {
        this.a = i;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        gl2.a.C0251a c0251a;
        pm8.a aVar;
        gl2.a.C0251a c0251a2;
        gl2.a.C0251a c0251a3;
        int i;
        switch (this.a) {
            case 0:
                boolean z = false;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if ((iIntValue & 17) != 16) {
                    z = true;
                }
                if (!bVar.o(iIntValue & 1, z)) {
                    bVar.D();
                }
                return j6g.a;
            default:
                gza gzaVar = (gza) obj;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                gzaVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= bVar2.K(gzaVar) ? 4 : 2;
                }
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    e.a aVar2 = e.a.b;
                    e eVarD = g.d(aVar2, 1.0f);
                    af1 af1Var = c20.a.a;
                    ag9 ag9VarD = hl1.d(af1Var, false);
                    int iG = bVar2.G();
                    t8b t8bVarM = bVar2.m();
                    e eVarC = c.c(bVar2, eVarD);
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
                    gl2.a.d dVar = gl2.a.g;
                    ygg.y(bVar2, ag9VarD, dVar);
                    gl2.a.f fVar = gl2.a.f;
                    ygg.y(bVar2, t8bVarM, fVar);
                    gl2.a.C0251a c0251a4 = gl2.a.j;
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG))) {
                        uz.g(iG, bVar2, iG, c0251a4);
                    }
                    gl2.a.e eVar = gl2.a.d;
                    ygg.y(bVar2, eVarC, eVar);
                    f17.a(z2b.a(R.drawable.madl_push_primer_background, 0, bVar2), "background_image", g.d(aVar2, 1.0f), null, ft2.a.g, 0.0f, null, bVar2, 25008, 104);
                    bVar2.q();
                    e eVarA = f.a(pnb.M(androidx.compose.foundation.layout.f.e(g.d(aVar2, 1.0f), gzaVar), pnb.L(0, 1, bVar2), true), "OnboardingPushPrimerScreen");
                    vs0.k kVar = vs0.c;
                    af1.a aVar4 = c20.a.m;
                    ob2 ob2VarA = mb2.a(kVar, aVar4, bVar2, 0);
                    int iG2 = bVar2.G();
                    t8b t8bVarM2 = bVar2.m();
                    e eVarC2 = c.c(bVar2, eVarA);
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
                    ygg.y(bVar2, ob2VarA, dVar);
                    ygg.y(bVar2, t8bVarM2, fVar);
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG2))) {
                        c0251a = c0251a4;
                        uz.g(iG2, bVar2, iG2, c0251a);
                    } else {
                        c0251a = c0251a4;
                    }
                    ygg.y(bVar2, eVarC2, eVar);
                    jh2.f(bVar2, g.h(aVar2, 16.0f));
                    af1.a aVar5 = c20.a.n;
                    HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(aVar5);
                    ag9 ag9VarD2 = hl1.d(af1Var, false);
                    int iG3 = bVar2.G();
                    t8b t8bVarM3 = bVar2.m();
                    e eVarC3 = c.c(bVar2, horizontalAlignElement);
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
                    ygg.y(bVar2, ag9VarD2, dVar);
                    ygg.y(bVar2, t8bVarM3, fVar);
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG3))) {
                        uz.g(iG3, bVar2, iG3, c0251a);
                    }
                    ygg.y(bVar2, eVarC3, eVar);
                    String strI = ak2.I(R.string.onboarding_notifications_title, bVar2);
                    e eVarF = g.f(aVar2, 0.8f);
                    Object objV = bVar2.v();
                    b.a.C0020a c0020a = b.a.a;
                    if (objV == c0020a) {
                        objV = new lg(3);
                        bVar2.p(objV);
                    }
                    gl2.a.C0251a c0251a5 = c0251a;
                    cif.b(strI, b5e.b(eVarF, false, (Function1) objV), 0L, 0L, null, null, null, 0L, null, null, 0L, 3, false, 4, 0, null, tjf.a(hz6.j, pnb.g(4284626721L), 0L, null, null, null, 0L, 3, 0L, null, null, 0, 16744446), bVar2, 0, 3120, 55292);
                    bVar2.q();
                    jh2.f(bVar2, g.h(aVar2, 24.0f));
                    HorizontalAlignElement horizontalAlignElement2 = new HorizontalAlignElement(aVar5);
                    ag9 ag9VarD3 = hl1.d(af1Var, false);
                    int iG4 = bVar2.G();
                    t8b t8bVarM4 = bVar2.m();
                    e eVarC4 = c.c(bVar2, horizontalAlignElement2);
                    if (bVar2.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar2.B();
                    if (bVar2.f()) {
                        aVar = aVar3;
                        bVar2.y(aVar);
                    } else {
                        aVar = aVar3;
                        bVar2.n();
                    }
                    ygg.y(bVar2, ag9VarD3, dVar);
                    ygg.y(bVar2, t8bVarM4, fVar);
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG4))) {
                        c0251a2 = c0251a5;
                        uz.g(iG4, bVar2, iG4, c0251a2);
                    } else {
                        c0251a2 = c0251a5;
                    }
                    ygg.y(bVar2, eVarC4, eVar);
                    gl2.a.C0251a c0251a6 = c0251a2;
                    f17.a(z2b.a(R.drawable.onboarding_push_primer_image, 0, bVar2), null, g.h(g.r(aVar2, 200.0f), 145.0f), null, null, 0.0f, null, bVar2, 432, 120);
                    bVar2.q();
                    jh2.f(bVar2, g.h(aVar2, 24.0f));
                    Object objV2 = bVar2.v();
                    if (objV2 == c0020a) {
                        objV2 = new bj(1);
                        bVar2.p(objV2);
                    }
                    e eVarB = b5e.b(aVar2, false, (Function1) objV2);
                    ob2 ob2VarA2 = mb2.a(kVar, aVar4, bVar2, 0);
                    int iG5 = bVar2.G();
                    t8b t8bVarM5 = bVar2.m();
                    e eVarC5 = c.c(bVar2, eVarB);
                    if (bVar2.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar2.B();
                    if (bVar2.f()) {
                        bVar2.y(aVar);
                    } else {
                        bVar2.n();
                    }
                    ygg.y(bVar2, ob2VarA2, dVar);
                    ygg.y(bVar2, t8bVarM5, fVar);
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG5))) {
                        c0251a3 = c0251a6;
                        uz.g(iG5, bVar2, iG5, c0251a3);
                    } else {
                        c0251a3 = c0251a6;
                    }
                    ygg.y(bVar2, eVarC5, eVar);
                    HorizontalAlignElement horizontalAlignElement3 = new HorizontalAlignElement(aVar5);
                    Object objV3 = bVar2.v();
                    if (objV3 == c0020a) {
                        i = 4;
                        objV3 = new li(4);
                        bVar2.p(objV3);
                    } else {
                        i = 4;
                    }
                    e eVarB2 = b5e.b(horizontalAlignElement3, false, (Function1) objV3);
                    ag9 ag9VarD4 = hl1.d(af1Var, false);
                    int iG6 = bVar2.G();
                    t8b t8bVarM6 = bVar2.m();
                    e eVarC6 = c.c(bVar2, eVarB2);
                    if (bVar2.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar2.B();
                    if (bVar2.f()) {
                        bVar2.y(aVar);
                    } else {
                        bVar2.n();
                    }
                    ygg.y(bVar2, ag9VarD4, dVar);
                    ygg.y(bVar2, t8bVarM6, fVar);
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG6))) {
                        uz.g(iG6, bVar2, iG6, c0251a3);
                    }
                    ygg.y(bVar2, eVarC6, eVar);
                    xra.a(ak2.I(R.string.onboarding_notifications_content_upper, bVar2), bVar2, 0);
                    bVar2.q();
                    jh2.f(bVar2, g.h(aVar2, 8.0f));
                    e eVarC7 = g.c(new HorizontalAlignElement(aVar5), 0.25f);
                    Object objV4 = bVar2.v();
                    if (objV4 == c0020a) {
                        objV4 = new yb(i);
                        bVar2.p(objV4);
                    }
                    e eVarB3 = b5e.b(eVarC7, false, (Function1) objV4);
                    ag9 ag9VarD5 = hl1.d(af1Var, false);
                    int iG7 = bVar2.G();
                    t8b t8bVarM7 = bVar2.m();
                    e eVarC8 = c.c(bVar2, eVarB3);
                    if (bVar2.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar2.B();
                    if (bVar2.f()) {
                        bVar2.y(aVar);
                    } else {
                        bVar2.n();
                    }
                    ygg.y(bVar2, ag9VarD5, dVar);
                    ygg.y(bVar2, t8bVarM7, fVar);
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG7))) {
                        uz.g(iG7, bVar2, iG7, c0251a3);
                    }
                    ygg.y(bVar2, eVarC8, eVar);
                    xra.a(ak2.I(R.string.onboarding_notifications_content_lower, bVar2), bVar2, 0);
                    bVar2.q();
                    bVar2.q();
                    jh2.f(bVar2, g.h(aVar2, 16.0f));
                    bVar2.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
        }
    }
}
