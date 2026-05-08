package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.le0;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fhb implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fhb(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        Object obj8 = this.b;
        switch (i) {
            case 0:
                nhb nhbVar = (nhb) obj8;
                gu5 gu5Var = (gu5) obj7;
                gu5 gu5Var2 = (gu5) obj6;
                gu5 gu5Var3 = (gu5) obj5;
                gu5 gu5Var4 = (gu5) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zK = bVar.K(gu5Var) | bVar.e(10000L) | bVar.K(gu5Var2);
                    Object objV = bVar.v();
                    if (zK || objV == c0020a) {
                        objV = new hhb(gu5Var, 10000L, gu5Var2, null);
                        bVar.p(objV);
                    }
                    to4.d(bVar, nhbVar, (Function2) objV);
                    vs0.i iVar = new vs0.i(12.0f, true, new us0(0));
                    sl7 sl7Var = sl7.b;
                    e.a aVar = e.a.b;
                    e eVarA = d.a(aVar, sl7Var);
                    ehd ehdVarA = chd.a(iVar, c20.a.j, bVar, 6);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarA);
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
                    ygg.y(bVar, ehdVarA, gl2.a.g);
                    ygg.y(bVar, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar, iHashCode, c0251a);
                    }
                    ygg.y(bVar, eVarC, gl2.a.d);
                    long j = eu6.y;
                    hl1.a(g.c(g.r(a.b(aVar, j, ytc.a), 8.0f), 1.0f), bVar, 0);
                    vq6.b(z2b.a(2131231407, 0, bVar), null, g.n(f.j(aVar, 0.0f, 12.0f, 0.0f, 0.0f, 13), 24.0f), j, bVar, 432, 0);
                    boolean zK2 = bVar.K(nhbVar.b);
                    Object objV2 = bVar.v();
                    if (zK2 || objV2 == c0020a) {
                        String str = nhbVar.b;
                        if (str == null) {
                            objV2 = null;
                        } else {
                            Spanned spannedFromHtml = Html.fromHtml(str, 63);
                            spannedFromHtml.getClass();
                            String string = spannedFromHtml.toString();
                            le0.b bVar2 = new le0.b();
                            bVar2.g(string);
                            for (Object obj9 : spannedFromHtml.getSpans(0, spannedFromHtml.length(), Object.class)) {
                                int spanStart = spannedFromHtml.getSpanStart(obj9);
                                int spanEnd = spannedFromHtml.getSpanEnd(obj9);
                                if (obj9 instanceof StyleSpan) {
                                    int style = ((StyleSpan) obj9).getStyle();
                                    if (style == 1) {
                                        bVar2.b(new foe(0L, 0L, to5.d0, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, (odf) null, (vbe) null, 65531), spanStart, spanEnd);
                                    } else if (style == 2) {
                                        bVar2.b(new foe(0L, 0L, (to5) null, new mo5(1), (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, (odf) null, (vbe) null, 65527), spanStart, spanEnd);
                                    } else if (style == 3) {
                                        bVar2.b(new foe(0L, 0L, to5.d0, new mo5(1), (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, (odf) null, (vbe) null, 65523), spanStart, spanEnd);
                                    }
                                } else if (obj9 instanceof UnderlineSpan) {
                                    bVar2.b(new foe(0L, 0L, (to5) null, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, odf.c, (vbe) null, 61439), spanStart, spanEnd);
                                } else if (obj9 instanceof ForegroundColorSpan) {
                                    bVar2.b(new foe(pnb.d(((ForegroundColorSpan) obj9).getForegroundColor()), 0L, (to5) null, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, (odf) null, (vbe) null, 65534), spanStart, spanEnd);
                                }
                            }
                            objV2 = bVar2.l();
                        }
                        bVar.p(objV2);
                    }
                    le0 le0Var = (le0) objV2;
                    vs0.i iVar2 = new vs0.i(12.0f, true, new us0(0));
                    e eVarO = f.j(aVar, 0.0f, 12.0f, 0.0f, 12.0f, 5).o(new LayoutWeightElement(1.0f, true));
                    ob2 ob2VarA = mb2.a(iVar2, c20.a.m, bVar, 6);
                    int iHashCode2 = Long.hashCode(bVar.k());
                    t8b t8bVarM2 = bVar.m();
                    e eVarC2 = c.c(bVar, eVarO);
                    gl2.j.getClass();
                    pm8.a aVar3 = gl2.a.b;
                    if (bVar.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar.B();
                    if (bVar.f()) {
                        bVar.y(aVar3);
                    } else {
                        bVar.n();
                    }
                    ygg.y(bVar, ob2VarA, gl2.a.g);
                    ygg.y(bVar, t8bVarM2, gl2.a.f);
                    gl2.a.C0251a c0251a2 = gl2.a.j;
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode2))) {
                        uz.g(iHashCode2, bVar, iHashCode2, c0251a2);
                    }
                    ygg.y(bVar, eVarC2, gl2.a.d);
                    if (le0Var != null) {
                        bVar.L(1431314844);
                        cif.c(le0Var, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, hz6.c, bVar, 0, 0, 131070);
                    } else {
                        bVar.L(1426397562);
                    }
                    bVar.F();
                    if (nhbVar.c != null) {
                        bVar.L(1431526264);
                        boolean zK3 = bVar.K(gu5Var4);
                        Object objV3 = bVar.v();
                        if (zK3 || objV3 == c0020a) {
                            objV3 = new u9(9, gu5Var4);
                            bVar.p(objV3);
                        }
                        nq1.a((gu5) objV3, null, false, null, null, null, null, null, null, uj2.a, bVar, 805306368, 510);
                    } else {
                        bVar.L(1426397562);
                    }
                    bVar.F();
                    bVar.q();
                    boolean zK4 = bVar.K(gu5Var3);
                    Object objV4 = bVar.v();
                    if (zK4 || objV4 == c0020a) {
                        objV4 = new vr(8, gu5Var3);
                        bVar.p(objV4);
                    }
                    rq6.b((gu5) objV4, f.f(g.n(aVar, 48.0f), 12.0f), false, null, null, uj2.b, bVar, 196656, 28);
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            default:
                final wu5 wu5Var = (wu5) obj8;
                String str2 = (String) obj7;
                final g4a g4aVar = (g4a) obj6;
                final g4a g4aVar2 = (g4a) obj5;
                final g4a g4aVar3 = (g4a) obj4;
                b bVar3 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar3.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zK5 = bVar3.K(wu5Var);
                    Object objV5 = bVar3.v();
                    if (zK5 || objV5 == c0020a) {
                        objV5 = new gu5() { // from class: l9f
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.gu5
                            public final Object invoke() {
                                String str3 = (String) g4aVar.getValue();
                                String str4 = (String) g4aVar2.getValue();
                                if (zve.U(str4)) {
                                    str4 = null;
                                }
                                Boolean bool = (Boolean) g4aVar3.getValue();
                                bool.booleanValue();
                                wu5Var.q(str3, str4, bool);
                                return j6g.a;
                            }
                        };
                        bVar3.p(objV5);
                    }
                    q9f.e(6, (gu5) objV5, bVar3, "openModal(interviewScheduling)");
                    String str3 = (String) g4aVar.getValue();
                    Object objV6 = bVar3.v();
                    if (objV6 == c0020a) {
                        objV6 = new ls(5, g4aVar);
                        bVar3.p(objV6);
                    }
                    q9f.g("URL", str3, str2, (Function1) objV6, false, bVar3, 3078, 16);
                    String str4 = (String) g4aVar2.getValue();
                    Object objV7 = bVar3.v();
                    if (objV7 == c0020a) {
                        objV7 = new lc(4, g4aVar2);
                        bVar3.p(objV7);
                    }
                    q9f.g("Title", str4, "(optional)", (Function1) objV7, false, bVar3, 3462, 16);
                    e eVarH = f.h(g.f(e.a.b, 1.0f), 0.0f, 8.0f, 1);
                    ehd ehdVarA2 = chd.a(vs0.a, c20.a.k, bVar3, 48);
                    int iHashCode3 = Long.hashCode(bVar3.k());
                    t8b t8bVarM3 = bVar3.m();
                    e eVarC3 = c.c(bVar3, eVarH);
                    gl2.j.getClass();
                    pm8.a aVar4 = gl2.a.b;
                    if (bVar3.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar3.B();
                    if (bVar3.f()) {
                        bVar3.y(aVar4);
                    } else {
                        bVar3.n();
                    }
                    ygg.y(bVar3, ehdVarA2, gl2.a.g);
                    ygg.y(bVar3, t8bVarM3, gl2.a.f);
                    gl2.a.C0251a c0251a3 = gl2.a.j;
                    if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode3))) {
                        uz.g(iHashCode3, bVar3, iHashCode3, c0251a3);
                    }
                    ygg.y(bVar3, eVarC3, gl2.a.d);
                    boolean zBooleanValue = ((Boolean) g4aVar3.getValue()).booleanValue();
                    Object objV8 = bVar3.v();
                    if (objV8 == c0020a) {
                        objV8 = new ns(7, g4aVar3);
                        bVar3.p(objV8);
                    }
                    u32.a(zBooleanValue, (Function1) objV8, null, false, null, null, bVar3, 48, 60);
                    cif.b("Prefer Full Screen", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar3, 6, 0, 131070);
                    bVar3.q();
                } else {
                    bVar3.D();
                }
                return j6g.a;
        }
    }
}
