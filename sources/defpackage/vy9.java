package defpackage;

import androidx.compose.animation.a;
import androidx.compose.animation.i;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.s38;
import defpackage.vs0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vy9 implements Function2 {
    public final /* synthetic */ Object V;
    public final /* synthetic */ Serializable W;
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ gu5 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vy9(gu5 gu5Var, Function1 function1, s8c s8cVar, r8c r8cVar, q8c q8cVar, String str, String str2, int i, int i2) {
        this.b = gu5Var;
        this.d = function1;
        this.e = s8cVar;
        this.f = r8cVar;
        this.V = q8cVar;
        this.W = str;
        this.X = str2;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.X;
        Serializable serializable = this.W;
        Object obj4 = this.V;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        switch (i) {
            case 0:
                final o97 o97Var = (o97) obj7;
                final g4a g4aVar = (g4a) obj6;
                final Locale locale = (Locale) serializable;
                final g4a g4aVar2 = (g4a) obj5;
                final g4a g4aVar3 = (g4a) obj4;
                final Function2 function2 = (Function2) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e eVarC = g.c(g.f(e.a.b, 1.0f), 0.55f);
                    o97.g gVar = o97Var.i;
                    e eVarF = f.f(eVarC, 8.0f);
                    fgd fgdVarA = ggd.a(16.0f);
                    final int i2 = this.c;
                    final gu5 gu5Var = this.b;
                    by1.a(eVarF, fgdVarA, 0L, bh2.c(-1862831300, new Function2() { // from class: py9
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj8, Object obj9) {
                            pm8.a aVar;
                            gl2.a.C0251a c0251a;
                            g4a g4aVar4;
                            py9 py9Var;
                            b.a.C0020a c0020a;
                            int i3;
                            g4a g4aVar5;
                            final g4a g4aVar6;
                            b bVar2 = (b) obj8;
                            int iIntValue2 = ((Integer) obj9).intValue();
                            if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                vs0.k kVar = vs0.c;
                                af1.a aVar2 = c20.a.m;
                                ob2 ob2VarA = mb2.a(kVar, aVar2, bVar2, 0);
                                int iHashCode = Long.hashCode(bVar2.k());
                                t8b t8bVarM = bVar2.m();
                                e.a aVar3 = e.a.b;
                                e eVarC2 = c.c(bVar2, aVar3);
                                gl2.j.getClass();
                                pm8.a aVar4 = gl2.a.b;
                                if (bVar2.j() == null) {
                                    pg8.B();
                                    throw null;
                                }
                                bVar2.B();
                                if (bVar2.f()) {
                                    bVar2.y(aVar4);
                                } else {
                                    bVar2.n();
                                }
                                gl2.a.d dVar = gl2.a.g;
                                ygg.y(bVar2, ob2VarA, dVar);
                                gl2.a.f fVar = gl2.a.f;
                                ygg.y(bVar2, t8bVarM, fVar);
                                gl2.a.C0251a c0251a2 = gl2.a.j;
                                if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                                    uz.g(iHashCode, bVar2, iHashCode, c0251a2);
                                }
                                gl2.a.e eVar = gl2.a.d;
                                ygg.y(bVar2, eVarC2, eVar);
                                ob2 ob2VarA2 = mb2.a(kVar, aVar2, bVar2, 0);
                                int iHashCode2 = Long.hashCode(bVar2.k());
                                t8b t8bVarM2 = bVar2.m();
                                e eVarC3 = c.c(bVar2, aVar3);
                                if (bVar2.j() == null) {
                                    pg8.B();
                                    throw null;
                                }
                                bVar2.B();
                                if (bVar2.f()) {
                                    bVar2.y(aVar4);
                                } else {
                                    bVar2.n();
                                }
                                ygg.y(bVar2, ob2VarA2, dVar);
                                ygg.y(bVar2, t8bVarM2, fVar);
                                if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                                    uz.g(iHashCode2, bVar2, iHashCode2, c0251a2);
                                }
                                ygg.y(bVar2, eVarC3, eVar);
                                e eVarF2 = g.f(aVar3, 1.0f);
                                final o97 o97Var2 = o97Var;
                                o97.g gVar2 = o97Var2.i;
                                e eVarH = f.h(eVarF2, 0.0f, 24.0f, 1);
                                vs0.f fVar2 = vs0.h;
                                af1.b bVar3 = c20.a.k;
                                ehd ehdVarA = chd.a(fVar2, bVar3, bVar2, 54);
                                int iHashCode3 = Long.hashCode(bVar2.k());
                                t8b t8bVarM3 = bVar2.m();
                                e eVarC4 = c.c(bVar2, eVarH);
                                if (bVar2.j() == null) {
                                    pg8.B();
                                    throw null;
                                }
                                bVar2.B();
                                if (bVar2.f()) {
                                    bVar2.y(aVar4);
                                } else {
                                    bVar2.n();
                                }
                                ygg.y(bVar2, ehdVarA, dVar);
                                ygg.y(bVar2, t8bVarM3, fVar);
                                if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode3))) {
                                    uz.g(iHashCode3, bVar2, iHashCode3, c0251a2);
                                }
                                ygg.y(bVar2, eVarC4, eVar);
                                vs0.j jVar = vs0.a;
                                af1.b bVar4 = c20.a.j;
                                ehd ehdVarA2 = chd.a(jVar, bVar4, bVar2, 0);
                                int iHashCode4 = Long.hashCode(bVar2.k());
                                t8b t8bVarM4 = bVar2.m();
                                e eVarC5 = c.c(bVar2, aVar3);
                                if (bVar2.j() == null) {
                                    pg8.B();
                                    throw null;
                                }
                                bVar2.B();
                                if (bVar2.f()) {
                                    bVar2.y(aVar4);
                                } else {
                                    bVar2.n();
                                }
                                ygg.y(bVar2, ehdVarA2, dVar);
                                ygg.y(bVar2, t8bVarM4, fVar);
                                if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode4))) {
                                    uz.g(iHashCode4, bVar2, iHashCode4, c0251a2);
                                }
                                ygg.y(bVar2, eVarC5, eVar);
                                Object objV = bVar2.v();
                                final g4a g4aVar7 = g4aVar;
                                b.a.C0020a c0020a2 = b.a.a;
                                if (objV == c0020a2) {
                                    objV = new pg0(6, g4aVar7);
                                    bVar2.p(objV);
                                }
                                e eVarA = androidx.compose.ui.platform.f.a(aVar3, "MonthYearPickerMonthButton");
                                final Locale locale2 = locale;
                                final g4a g4aVar8 = g4aVar2;
                                g4a g4aVar9 = g4aVar8;
                                Locale locale3 = locale2;
                                int i4 = 0;
                                v1c.a((gu5) objV, eVarA, false, null, 0L, null, null, null, null, bh2.c(81432438, new wu5() { // from class: yy9
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // defpackage.wu5
                                    public final Object q(Object obj10, Object obj11, Object obj12) {
                                        String strA;
                                        b bVar5 = (b) obj11;
                                        int iIntValue3 = ((Integer) obj12).intValue();
                                        ((fhd) obj10).getClass();
                                        if (bVar5.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                            ehd ehdVarA3 = chd.a(vs0.a, c20.a.k, bVar5, 48);
                                            int iHashCode5 = Long.hashCode(bVar5.k());
                                            t8b t8bVarM5 = bVar5.m();
                                            e eVarC6 = c.c(bVar5, e.a.b);
                                            gl2.j.getClass();
                                            pm8.a aVar5 = gl2.a.b;
                                            String strE = null;
                                            if (bVar5.j() == null) {
                                                pg8.B();
                                                throw null;
                                            }
                                            bVar5.B();
                                            if (bVar5.f()) {
                                                bVar5.y(aVar5);
                                            } else {
                                                bVar5.n();
                                            }
                                            ygg.y(bVar5, ehdVarA3, gl2.a.g);
                                            ygg.y(bVar5, t8bVarM5, gl2.a.f);
                                            gl2.a.C0251a c0251a3 = gl2.a.j;
                                            if (bVar5.f() || !wl7.b(bVar5.v(), Integer.valueOf(iHashCode5))) {
                                                uz.g(iHashCode5, bVar5, iHashCode5, c0251a3);
                                            }
                                            ygg.y(bVar5, eVarC6, gl2.a.d);
                                            o97 o97Var3 = o97Var2;
                                            long j = o97Var3.c.a.b;
                                            g4a g4aVar10 = g4aVar7;
                                            oy9 oy9Var = (oy9) g4aVar10.getValue();
                                            oy9 oy9Var2 = oy9.a;
                                            if (oy9Var == oy9Var2) {
                                                j = o97Var3.c.a.c;
                                            }
                                            long j2 = j;
                                            s38 s38Var = (s38) g4aVar8.getValue();
                                            if (s38Var != null && (strA = s38Var.a()) != null) {
                                                strE = v1c.b(strA, locale2);
                                            }
                                            if (strE == null) {
                                                strE = l.e(bVar5, 630598596, R.string.placeholder_month, bVar5);
                                            } else {
                                                bVar5.L(630594008);
                                                bVar5.F();
                                            }
                                            String str = strE;
                                            tjf tjfVar = o97Var3.j.f;
                                            long j3 = o97Var3.e.g;
                                            oy9 oy9Var3 = (oy9) g4aVar10.getValue();
                                            o97.c cVar = o97Var3.f;
                                            cif.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(tjfVar, j2, j3, oy9Var3 == oy9Var2 ? cVar.c : cVar.a, null, null, 0L, 0, 0L, null, null, 0, 16777208), bVar5, 0, 0, 65534);
                                            i.d(ghd.a, ((oy9) g4aVar10.getValue()) == oy9Var2, null, null, null, null, rj2.a, bVar5, 1572870, 30);
                                            bVar5.q();
                                        } else {
                                            bVar5.D();
                                        }
                                        return j6g.a;
                                    }
                                }, bVar2), bVar2, 54, 1020);
                                bVar2.q();
                                ehd ehdVarA3 = chd.a(jVar, bVar4, bVar2, 0);
                                int iHashCode5 = Long.hashCode(bVar2.k());
                                t8b t8bVarM5 = bVar2.m();
                                e eVarC6 = c.c(bVar2, aVar3);
                                if (bVar2.j() == null) {
                                    pg8.B();
                                    throw null;
                                }
                                bVar2.B();
                                if (bVar2.f()) {
                                    aVar = aVar4;
                                    bVar2.y(aVar);
                                } else {
                                    aVar = aVar4;
                                    bVar2.n();
                                }
                                ygg.y(bVar2, ehdVarA3, dVar);
                                ygg.y(bVar2, t8bVarM5, fVar);
                                if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode5))) {
                                    c0251a = c0251a2;
                                    uz.g(iHashCode5, bVar2, iHashCode5, c0251a);
                                } else {
                                    c0251a = c0251a2;
                                }
                                ygg.y(bVar2, eVarC6, eVar);
                                Object objV2 = bVar2.v();
                                if (objV2 == c0020a2) {
                                    g4aVar4 = g4aVar7;
                                    objV2 = new zm4(1, g4aVar4);
                                    bVar2.p(objV2);
                                } else {
                                    g4aVar4 = g4aVar7;
                                }
                                e eVarA2 = androidx.compose.ui.platform.f.a(aVar3, "MonthYearPickerYearButton");
                                g4a g4aVar10 = g4aVar3;
                                g4a g4aVar11 = g4aVar10;
                                gl2.a.C0251a c0251a3 = c0251a;
                                pm8.a aVar5 = aVar;
                                g4a g4aVar12 = g4aVar4;
                                b.a.C0020a c0020a3 = c0020a2;
                                v1c.a((gu5) objV2, eVarA2, false, null, 0L, null, null, null, null, bh2.c(1994808863, new zy9(i4, o97Var2, g4aVar4, g4aVar10), bVar2), bVar2, 54, 1020);
                                bVar2.q();
                                bVar2.q();
                                b84.a(0.0f, 0, 15, 0L, bVar2, null);
                                bVar2.q();
                                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                                ob2 ob2VarA3 = mb2.a(kVar, aVar2, bVar2, 0);
                                int iHashCode6 = Long.hashCode(bVar2.k());
                                t8b t8bVarM6 = bVar2.m();
                                e eVarC7 = c.c(bVar2, layoutWeightElement);
                                if (bVar2.j() == null) {
                                    pg8.B();
                                    throw null;
                                }
                                bVar2.B();
                                if (bVar2.f()) {
                                    bVar2.y(aVar5);
                                } else {
                                    bVar2.n();
                                }
                                ygg.y(bVar2, ob2VarA3, dVar);
                                ygg.y(bVar2, t8bVarM6, fVar);
                                if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode6))) {
                                    uz.g(iHashCode6, bVar2, iHashCode6, c0251a3);
                                }
                                ygg.y(bVar2, eVarC7, eVar);
                                int iOrdinal = ((oy9) g4aVar12.getValue()).ordinal();
                                if (iOrdinal == 0) {
                                    py9Var = this;
                                    c0020a = c0020a3;
                                    bVar2.L(-209630053);
                                    bVar2.L(-1253682012);
                                    s38.a.getClass();
                                    s38[] s38VarArrA = s38.a.a();
                                    ArrayList arrayList = new ArrayList();
                                    for (s38 s38Var : s38VarArrA) {
                                        if (!wl7.b(s38Var.a(), s38.c.a())) {
                                            arrayList.add(s38Var);
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
                                    Iterator it = arrayList.iterator();
                                    while (true) {
                                        i3 = 12;
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        s38 s38Var2 = (s38) it.next();
                                        boolean z = ((s38) g4aVar9.getValue()) == s38Var2;
                                        Locale locale4 = locale3;
                                        String strB = v1c.b(s38Var2.a(), locale4);
                                        boolean zD = bVar2.d(s38Var2.ordinal());
                                        Object objV3 = bVar2.v();
                                        if (zD || objV3 == c0020a) {
                                            g4aVar5 = g4aVar9;
                                            objV3 = new x9(12, s38Var2, g4aVar5);
                                            bVar2.p(objV3);
                                        } else {
                                            g4aVar5 = g4aVar9;
                                        }
                                        arrayList2.add(new ax6(strB, (gu5) objV3, z ? fv6.A1 : null, z, false, 484));
                                        g4aVar9 = g4aVar5;
                                        locale3 = locale4;
                                    }
                                    g4a g4aVar13 = g4aVar9;
                                    bVar2.F();
                                    e eVarA3 = androidx.compose.ui.platform.f.a(aVar3, "MonthYearPickerMonthItems");
                                    Object objV4 = bVar2.v();
                                    if (objV4 == c0020a) {
                                        objV4 = new ue(i3);
                                        bVar2.p(objV4);
                                    }
                                    g4aVar9 = g4aVar13;
                                    a.b(arrayList2, eVarA3, (Function1) objV4, null, "AnimatedContentMonthItems", null, rj2.c, bVar2, 1597872, 40);
                                    bVar2.F();
                                    j6g j6gVar = j6g.a;
                                } else {
                                    if (iOrdinal != 1) {
                                        bVar2.L(-1253689231);
                                        bVar2.F();
                                        l.g();
                                        return null;
                                    }
                                    bVar2.L(-207657492);
                                    int i5 = Calendar.getInstance().get(1);
                                    py9Var = this;
                                    List listZ1 = z92.z1(new mh7(i2 + i5, i5 - 150, -1));
                                    bVar2.L(-1253617696);
                                    List list = listZ1;
                                    ArrayList arrayList3 = new ArrayList(t92.r0(list, 10));
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        final int iIntValue3 = ((Number) it2.next()).intValue();
                                        Integer num = (Integer) g4aVar11.getValue();
                                        boolean z2 = num != null && num.intValue() == iIntValue3;
                                        String strValueOf = String.valueOf(iIntValue3);
                                        boolean zD2 = bVar2.d(iIntValue3);
                                        Object objV5 = bVar2.v();
                                        b.a.C0020a c0020a4 = c0020a3;
                                        if (zD2 || objV5 == c0020a4) {
                                            g4aVar6 = g4aVar11;
                                            objV5 = new gu5() { // from class: az9
                                                @Override // defpackage.gu5
                                                public final Object invoke() {
                                                    g4aVar6.setValue(Integer.valueOf(iIntValue3));
                                                    return j6g.a;
                                                }
                                            };
                                            bVar2.p(objV5);
                                        } else {
                                            g4aVar6 = g4aVar11;
                                        }
                                        arrayList3.add(new ax6(strValueOf, (gu5) objV5, z2 ? fv6.A1 : null, z2, false, 484));
                                        g4aVar11 = g4aVar6;
                                        c0020a3 = c0020a4;
                                    }
                                    g4a g4aVar14 = g4aVar11;
                                    c0020a = c0020a3;
                                    bVar2.F();
                                    e eVarA4 = androidx.compose.ui.platform.f.a(aVar3, "MonthYearPickerYearItems");
                                    Object objV6 = bVar2.v();
                                    if (objV6 == c0020a) {
                                        objV6 = new uz7(2);
                                        bVar2.p(objV6);
                                    }
                                    g4aVar11 = g4aVar14;
                                    a.b(arrayList3, eVarA4, (Function1) objV6, null, "AnimatedContentYearItems", null, rj2.d, bVar2, 1597872, 40);
                                    bVar2.F();
                                    j6g j6gVar2 = j6g.a;
                                }
                                bVar2.q();
                                ob2 ob2VarA4 = mb2.a(vs0.e, aVar2, bVar2, 6);
                                int iHashCode7 = Long.hashCode(bVar2.k());
                                t8b t8bVarM7 = bVar2.m();
                                e eVarC8 = c.c(bVar2, aVar3);
                                gl2.j.getClass();
                                pm8.a aVar6 = gl2.a.b;
                                if (bVar2.j() == null) {
                                    pg8.B();
                                    throw null;
                                }
                                bVar2.B();
                                if (bVar2.f()) {
                                    bVar2.y(aVar6);
                                } else {
                                    bVar2.n();
                                }
                                gl2.a.d dVar2 = gl2.a.g;
                                ygg.y(bVar2, ob2VarA4, dVar2);
                                gl2.a.f fVar3 = gl2.a.f;
                                ygg.y(bVar2, t8bVarM7, fVar3);
                                gl2.a.C0251a c0251a4 = gl2.a.j;
                                if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode7))) {
                                    uz.g(iHashCode7, bVar2, iHashCode7, c0251a4);
                                }
                                gl2.a.e eVar2 = gl2.a.d;
                                ygg.y(bVar2, eVarC8, eVar2);
                                b84.a(0.0f, 0, 15, 0L, bVar2, null);
                                e eVarF3 = f.f(g.f(aVar3, 1.0f), 8.0f);
                                ehd ehdVarA4 = chd.a(vs0.g, bVar4, bVar2, 6);
                                int iHashCode8 = Long.hashCode(bVar2.k());
                                t8b t8bVarM8 = bVar2.m();
                                e eVarC9 = c.c(bVar2, eVarF3);
                                if (bVar2.j() == null) {
                                    pg8.B();
                                    throw null;
                                }
                                bVar2.B();
                                if (bVar2.f()) {
                                    bVar2.y(aVar6);
                                } else {
                                    bVar2.n();
                                }
                                ygg.y(bVar2, ehdVarA4, dVar2);
                                ygg.y(bVar2, t8bVarM8, fVar3);
                                if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode8))) {
                                    uz.g(iHashCode8, bVar2, iHashCode8, c0251a4);
                                }
                                ygg.y(bVar2, eVarC9, eVar2);
                                jh2.f(bVar2, aVar3);
                                ehd ehdVarA5 = chd.a(new vs0.i(16.0f, true, new us0(0)), bVar3, bVar2, 48);
                                int iHashCode9 = Long.hashCode(bVar2.k());
                                t8b t8bVarM9 = bVar2.m();
                                e eVarC10 = c.c(bVar2, aVar3);
                                if (bVar2.j() == null) {
                                    pg8.B();
                                    throw null;
                                }
                                bVar2.B();
                                if (bVar2.f()) {
                                    bVar2.y(aVar6);
                                } else {
                                    bVar2.n();
                                }
                                ygg.y(bVar2, ehdVarA5, dVar2);
                                ygg.y(bVar2, t8bVarM9, fVar3);
                                if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode9))) {
                                    uz.g(iHashCode9, bVar2, iHashCode9, c0251a4);
                                }
                                ygg.y(bVar2, eVarC10, eVar2);
                                String strI = ak2.I(R.string.month_year_picker_cancel, bVar2);
                                gu5 gu5Var2 = gu5Var;
                                gt6.m(strI, gu5Var2, null, null, false, null, null, bVar2, 0, 508);
                                String strI2 = ak2.I(R.string.month_year_picker_ok, bVar2);
                                boolean z3 = ((oy9) g4aVar12.getValue()) != oy9.a && (((s38) g4aVar9.getValue()) == null || ((Integer) g4aVar11.getValue()) == null);
                                Function2 function22 = function2;
                                boolean zK = bVar2.K(function22) | bVar2.K(gu5Var2);
                                Object objV7 = bVar2.v();
                                if (zK || objV7 == c0020a) {
                                    objV7 = new dh(function22, gu5Var2, g4aVar12, g4aVar9, g4aVar11);
                                    bVar2.p(objV7);
                                }
                                gt6.m(strI2, (gu5) objV7, null, null, z3, null, null, bVar2, 0, 492);
                                bVar2.q();
                                bVar2.q();
                                bVar2.q();
                                bVar2.q();
                            } else {
                                bVar2.D();
                            }
                            return j6g.a;
                        }
                    }, bVar), bVar, 1572864, 60);
                } else {
                    bVar.D();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                n8c.a(this.b, (Function1) obj7, (s8c) obj6, (r8c) obj5, (q8c) obj4, (String) serializable, (String) obj3, (b) obj, ka2.L(1), this.c);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ vy9(o97 o97Var, g4a g4aVar, Locale locale, g4a g4aVar2, g4a g4aVar3, int i, gu5 gu5Var, Function2 function2) {
        this.d = o97Var;
        this.e = g4aVar;
        this.W = locale;
        this.f = g4aVar2;
        this.V = g4aVar3;
        this.c = i;
        this.b = gu5Var;
        this.X = function2;
    }
}
