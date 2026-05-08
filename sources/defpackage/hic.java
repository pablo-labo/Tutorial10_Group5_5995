package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class hic {
    public static final void a(o18 o18Var, Function1<? super o18, j6g> function1, b bVar, int i) {
        function1.getClass();
        c cVarH = bVar.h(522530049);
        int i2 = (cVarH.d(o18Var.ordinal()) ? 4 : 2) | i | (cVarH.x(function1) ? 32 : 16);
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            ak2.J(R.string.contact_information_employment_options_available_message, new Object[]{ak2.I(R.string.contact_information_employment_eligibility_label, cVarH), ak2.I(R.string.contact_information_employment_authorized_option, cVarH), ak2.I(R.string.contact_information_employment_sponsorship_required_option, cVarH), ak2.I(R.string.contact_information_employment_not_specified_option, cVarH)}, cVarH);
            zv6[] zv6VarArr = {new zv6(ak2.I(R.string.contact_information_employment_authorized_option, cVarH), o18Var == o18.d), new zv6(ak2.I(R.string.contact_information_employment_sponsorship_required_option, cVarH), o18Var == o18.e), new zv6(ak2.I(R.string.contact_information_employment_not_specified_option, cVarH), o18Var == o18.c)};
            String strI = ak2.I(R.string.contact_information_employment_eligibility_label, cVarH);
            boolean z = (i2 & 112) == 32;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new uw(function1, 9);
                cVarH.p(objV);
            }
            fw6.c(strI, null, null, null, false, zv6VarArr, (Function2) objV, null, cVarH, 0, 318);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new nn8(i, 4, function1, o18Var);
        }
    }

    public static final void b(final boolean z, final List list, final Function1 function1, final gu5 gu5Var, final Function1 function12, final Function1 function13, final List list2, final sm5 sm5Var, b bVar, final int i) {
        int i2;
        c cVar;
        c cVarH = bVar.h(-1491844664);
        if ((i & 6) == 0) {
            i2 = (cVarH.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.d(10) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.x(function1) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.x(gu5Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.x(function12) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= cVarH.x(function13) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= cVarH.x(list2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= cVarH.K(sm5Var) ? 67108864 : 33554432;
        }
        if (cVarH.o(i2 & 1, (38347923 & i2) != 38347922)) {
            cVarH.v0();
            if ((i & 1) != 0 && !cVarH.c0()) {
                cVarH.D();
            }
            cVarH.V();
            final o97 o97Var = (o97) cVarH.M(p97.a);
            o97.g gVar = o97Var.i;
            e eVarF = f.f(e.a.b, 12.0f);
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = new hs(13);
                cVarH.p(objV);
            }
            cVar = cVarH;
            fw6.a(ak2.I(R.string.job_title_preferences_sheet_question, cVarH), b5e.b(eVarF, false, (Function1) objV), null, null, true, "idlJobTitlePreferenceRadioInput", bh2.c(584884446, new Function2() { // from class: dic
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    b bVar2 = (b) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e.a aVar = e.a.b;
                        e eVarC = androidx.compose.ui.c.c(bVar2, aVar);
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
                        ygg.y(bVar2, ob2VarA, dVar);
                        gl2.a.f fVar = gl2.a.f;
                        ygg.y(bVar2, t8bVarM, fVar);
                        gl2.a.C0251a c0251a = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar2, iHashCode, c0251a);
                        }
                        gl2.a.e eVar = gl2.a.d;
                        ygg.y(bVar2, eVarC, eVar);
                        boolean z2 = z;
                        boolean z3 = !z2;
                        String strI = ak2.I(R.string.job_title_preferences_no_preference_label, bVar2);
                        Function1 function14 = function1;
                        boolean zK = bVar2.K(function14);
                        Object objV2 = bVar2.v();
                        b.a.C0020a c0020a = b.a.a;
                        if (zK || objV2 == c0020a) {
                            objV2 = new ar7(function14, 1);
                            bVar2.p(objV2);
                        }
                        fw6.b(z3, false, strI, (Function1) objV2, null, null, null, null, bVar2, 432, 480);
                        String strI2 = ak2.I(R.string.job_title_preferences_has_preference_label, bVar2);
                        String strI3 = ak2.I(R.string.job_title_preferences_has_preference_sublabel, bVar2);
                        boolean zK2 = bVar2.K(function14);
                        Object objV3 = bVar2.v();
                        if (zK2 || objV3 == c0020a) {
                            objV3 = new cb(function14, 1);
                            bVar2.p(objV3);
                        }
                        Function1 function15 = (Function1) objV3;
                        o97 o97Var2 = o97Var;
                        List list3 = list;
                        fw6.b(z2, false, strI2, function15, null, strI3, null, bh2.c(2034047712, new xy9(o97Var2, list3, function12, function13, list2), bVar2), bVar2, 100663728, 160);
                        if (list3.size() < 10) {
                            bVar2.L(-1765157555);
                            o97.a aVar3 = o97Var2.c;
                            e eVarJ = f.j(androidx.compose.foundation.layout.e.c(g.f(a.b(aVar, z2 ? aVar3.b.b : aVar3.b.a, ytc.a), 1.0f), 0.0f, -12.0f, 1), 64.0f, 0.0f, 0.0f, 0.0f, 14);
                            ag9 ag9VarD = hl1.d(c20.a.a, false);
                            int iHashCode2 = Long.hashCode(bVar2.k());
                            t8b t8bVarM2 = bVar2.m();
                            e eVarC2 = androidx.compose.ui.c.c(bVar2, eVarJ);
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
                            ygg.y(bVar2, ag9VarD, dVar);
                            ygg.y(bVar2, t8bVarM2, fVar);
                            if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                                uz.g(iHashCode2, bVar2, iHashCode2, c0251a);
                            }
                            ygg.y(bVar2, eVarC2, eVar);
                            mv.a(ak2.I(R.string.job_title_preferences_add_title_button_label, bVar2), gu5Var, false, 0, null, androidx.compose.foundation.c.b(androidx.compose.ui.focus.c.a(aVar, sm5Var), true, 2), null, bVar2, 0, 92);
                            bVar2 = bVar2;
                            bVar2.q();
                        } else {
                            bVar2.L(-1774512518);
                        }
                        bVar2.F();
                        bVar2.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVar, 1794048, 12);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: eic
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hic.b(z, list, function1, gu5Var, function12, function13, list2, sm5Var, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void c(final tzc tzcVar, final List list, final Function1 function1, final gu5 gu5Var, final Function1 function12, final Function1 function13, b bVar, int i) {
        c cVarH = bVar.h(12889975);
        int i2 = i | (cVarH.d(tzcVar.ordinal()) ? 4 : 2) | (cVarH.x(list) ? 32 : 16) | (cVarH.x(gu5Var) ? 16384 : 8192) | (cVarH.x(function12) ? 131072 : 65536);
        if (cVarH.o(i2 & 1, (599187 & i2) != 599186)) {
            final o97 o97Var = (o97) cVarH.M(p97.a);
            o97.g gVar = o97Var.i;
            fw6.a(ak2.I(R.string.relocation_radio_label, cVarH), f.f(e.a.b, 12.0f), null, null, true, "idlRelocationPreferenceRadioInput", bh2.c(110365069, new Function2() { // from class: fic
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    b bVar2 = (b) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e eVarC = androidx.compose.ui.c.c(bVar2, e.a.b);
                        gl2.j.getClass();
                        pm8.a aVar = gl2.a.b;
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
                        ygg.y(bVar2, ob2VarA, gl2.a.g);
                        ygg.y(bVar2, t8bVarM, gl2.a.f);
                        gl2.a.C0251a c0251a = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar2, iHashCode, c0251a);
                        }
                        ygg.y(bVar2, eVarC, gl2.a.d);
                        tzc tzcVar2 = tzc.a;
                        tzc tzcVar3 = tzcVar;
                        boolean z = tzcVar3 == tzcVar2;
                        String strI = ak2.I(R.string.relocation_radio_not_willing, bVar2);
                        Function1 function14 = function1;
                        boolean zK = bVar2.K(function14);
                        Object objV = bVar2.v();
                        b.a.C0020a c0020a = b.a.a;
                        if (zK || objV == c0020a) {
                            objV = new dn4(function14, 1);
                            bVar2.p(objV);
                        }
                        fw6.b(z, false, strI, (Function1) objV, null, null, null, null, bVar2, 432, 480);
                        boolean z2 = tzcVar3 == tzc.b;
                        String strI2 = ak2.I(R.string.relocation_radio_willing_anywhere, bVar2);
                        boolean zK2 = bVar2.K(function14);
                        Object objV2 = bVar2.v();
                        if (zK2 || objV2 == c0020a) {
                            objV2 = new wi(function14, 9);
                            bVar2.p(objV2);
                        }
                        fw6.b(z2, false, strI2, (Function1) objV2, null, null, null, null, bVar2, 432, 480);
                        boolean z3 = tzcVar3 == tzc.c;
                        String strI3 = ak2.I(R.string.relocation_radio_willing_limited, bVar2);
                        String strI4 = ak2.I(R.string.add_locations_tooltip, bVar2);
                        boolean zK3 = bVar2.K(function14);
                        Object objV3 = bVar2.v();
                        if (zK3 || objV3 == c0020a) {
                            objV3 = new s99(function14, 1);
                            bVar2.p(objV3);
                        }
                        final o97 o97Var2 = o97Var;
                        final List list2 = list;
                        final gu5 gu5Var2 = gu5Var;
                        final Function1 function15 = function12;
                        final Function1 function16 = function13;
                        fw6.b(z3, false, strI3, (Function1) objV3, null, strI4, null, bh2.c(1736041838, new Function2(o97Var2, list2, gu5Var2, function15, function16) { // from class: gic
                            public final /* synthetic */ List a;
                            public final /* synthetic */ gu5 b;
                            public final /* synthetic */ Function1 c;
                            public final /* synthetic */ Function1 d;

                            {
                                this.a = list2;
                                this.b = gu5Var2;
                                this.c = function15;
                                this.d = function16;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                b bVar3 = (b) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (bVar3.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    e eVarJ = f.j(e.a.b, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                                    ob2 ob2VarA2 = mb2.a(vs0.c, c20.a.m, bVar3, 0);
                                    int iHashCode2 = Long.hashCode(bVar3.k());
                                    t8b t8bVarM2 = bVar3.m();
                                    e eVarC2 = androidx.compose.ui.c.c(bVar3, eVarJ);
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
                                    ygg.y(bVar3, ob2VarA2, gl2.a.g);
                                    ygg.y(bVar3, t8bVarM2, gl2.a.f);
                                    gl2.a.C0251a c0251a2 = gl2.a.j;
                                    if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode2))) {
                                        uz.g(iHashCode2, bVar3, iHashCode2, c0251a2);
                                    }
                                    ygg.y(bVar3, eVarC2, gl2.a.d);
                                    bVar3.L(545918653);
                                    List<String> list3 = this.a;
                                    for (String str : list3) {
                                        py8.c(str, str, this.c, this.d, null, bVar3, 0);
                                    }
                                    bVar3.F();
                                    if (list3.size() < 3) {
                                        bVar3.L(-255959295);
                                        mv.a(ak2.I(R.string.add_locations_button_label, bVar3), this.b, false, 0, null, null, null, bVar3, 0, 124);
                                        bVar3 = bVar3;
                                    } else {
                                        bVar3.L(-271011190);
                                    }
                                    bVar3.F();
                                    bVar3.q();
                                } else {
                                    bVar3.D();
                                }
                                return j6g.a;
                            }
                        }, bVar2), bVar2, 100663728, 160);
                        bVar2.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, 1794048, 12);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new rm6(tzcVar, list, function1, gu5Var, function12, function13, i);
        }
    }

    public static final void d(final boolean z, final List list, final Function1 function1, final gu5 gu5Var, final Function1 function12, final Function1 function13, final List list2, final sm5 sm5Var, b bVar, final int i) {
        list.getClass();
        function1.getClass();
        gu5Var.getClass();
        function12.getClass();
        function13.getClass();
        c cVarH = bVar.h(1337030415);
        int i2 = i | (cVarH.a(z) ? 4 : 2) | (cVarH.x(list) ? 32 : 16) | (cVarH.x(gu5Var) ? 16384 : 8192) | (cVarH.x(function12) ? 131072 : 65536) | (cVarH.x(list2) ? 8388608 : 4194304);
        if (cVarH.o(i2 & 1, (38347923 & i2) != 38347922)) {
            cVarH.v0();
            if ((i & 1) != 0 && !cVarH.c0()) {
                cVarH.D();
            }
            cVarH.V();
            b(z, list, function1, gu5Var, function12, function13, list2, sm5Var, cVarH, i2 & 268435454);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z, list, function1, gu5Var, function12, function13, list2, sm5Var, i) { // from class: cic
                public final /* synthetic */ List V;
                public final /* synthetic */ sm5 W;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ List b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function1 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(102239617);
                    hic.d(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void e(tzc tzcVar, List list, Function1 function1, gu5 gu5Var, Function1 function12, Function1 function13, b bVar, int i) {
        tzcVar.getClass();
        list.getClass();
        function1.getClass();
        gu5Var.getClass();
        function12.getClass();
        function13.getClass();
        c cVarH = bVar.h(-336131528);
        int i2 = i | (cVarH.d(tzcVar.ordinal()) ? 4 : 2) | (cVarH.x(list) ? 32 : 16) | (cVarH.x(gu5Var) ? 16384 : 8192) | (cVarH.x(function12) ? 131072 : 65536);
        if (cVarH.o(i2 & 1, (599187 & i2) != 599186)) {
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, e.a.b);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            c(tzcVar, list, function1, gu5Var, function12, function13, cVarH, i2 & 4194302);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new sk4(tzcVar, list, function1, gu5Var, function12, function13, i, 1);
        }
    }
}
