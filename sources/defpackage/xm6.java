package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jsmappservices.components.hybridactionoverflow.HybridActionOverflowRow;
import defpackage.c20;
import defpackage.ft2;
import defpackage.gl2;
import defpackage.pm8;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class xm6 {
    public static final void a(final String str, final String str2, final String str3, final ArrayList arrayList, final Integer num, final Function1 function1, b bVar, int i) {
        function1.getClass();
        c cVarH = bVar.h(-1759181357);
        int i2 = i | (cVarH.K(str) ? 4 : 2) | (cVarH.K(str2) ? 32 : 16) | (cVarH.K(str3) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(arrayList) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.K(num) ? 16384 : 8192) | (cVarH.x(function1) ? 131072 : 65536);
        if (cVarH.o(i2 & 1, (74899 & i2) != 74898)) {
            e eVarF = g.f(e.a.b, 1.0f);
            boolean zX = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | cVarH.x(arrayList) | ((57344 & i2) == 16384) | ((i2 & 458752) == 131072);
            Object objV = cVarH.v();
            if (zX || objV == b.a.a) {
                Function1 function12 = new Function1() { // from class: qm6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ls8 ls8Var = (ls8) obj;
                        ls8Var.getClass();
                        final String str4 = str;
                        if (str4 != null && !zve.U(str4)) {
                            final String str5 = str2;
                            final String str6 = str3;
                            ls8.e(ls8Var, null, new ah2(-2067136861, new wu5() { // from class: sm6
                                @Override // defpackage.wu5
                                public final Object q(Object obj2, Object obj3, Object obj4) {
                                    int i3;
                                    jte jteVar;
                                    boolean z;
                                    b bVar2 = (b) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    ((xo8) obj2).getClass();
                                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        e.a aVar = e.a.b;
                                        e eVarG = f.g(g.f(aVar, 1.0f), 16.0f, 22.0f);
                                        ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                                        int iHashCode = Long.hashCode(bVar2.k());
                                        t8b t8bVarM = bVar2.m();
                                        e eVarC = androidx.compose.ui.c.c(bVar2, eVarG);
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
                                        e eVarA = androidx.compose.ui.platform.f.a(aVar, "headerText");
                                        jte jteVar2 = AndroidCompositionLocals_androidKt.b;
                                        fif.b(str4, eVarA, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, xm6.d((Context) bVar2.M(jteVar2)), bVar2, 48, 0, 65532);
                                        b bVar3 = bVar2;
                                        String str7 = str5;
                                        if (str7 == null || zve.U(str7)) {
                                            i3 = 0;
                                            bVar3.L(963084085);
                                        } else {
                                            bVar3.L(969004434);
                                            jh2.f(bVar3, g.h(aVar, 4.0f));
                                            e eVarA2 = androidx.compose.ui.platform.f.a(g.f(aVar, 1.0f), "subheadingText");
                                            ehd ehdVarA = chd.a(vs0.a, c20.a.k, bVar3, 48);
                                            int iHashCode2 = Long.hashCode(bVar3.k());
                                            t8b t8bVarM2 = bVar3.m();
                                            e eVarC2 = androidx.compose.ui.c.c(bVar3, eVarA2);
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
                                            ygg.y(bVar3, ehdVarA, dVar);
                                            ygg.y(bVar3, t8bVarM2, fVar);
                                            if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode2))) {
                                                uz.g(iHashCode2, bVar3, iHashCode2, c0251a);
                                            }
                                            ygg.y(bVar3, eVarC2, eVar);
                                            String str8 = str6;
                                            if (str8 == null || zve.U(str8)) {
                                                jteVar = jteVar2;
                                                i3 = 0;
                                                z = true;
                                                bVar3.L(-371432684);
                                            } else {
                                                bVar3.L(-365118232);
                                                jteVar = jteVar2;
                                                Resources resources = ((Context) bVar3.M(jteVar)).getResources();
                                                resources.getClass();
                                                int iIntValue2 = R.drawable.ic_idl_placeholder_24;
                                                String resourcePackageName = resources.getResourcePackageName(R.drawable.ic_idl_placeholder_24);
                                                String lowerCase = str8.toLowerCase(Locale.ROOT);
                                                lowerCase.getClass();
                                                int identifier = resources.getIdentifier("ic_idl_" + lowerCase + "_24", "drawable", resourcePackageName);
                                                Integer numValueOf = identifier != 0 ? Integer.valueOf(identifier) : ym6.a.get(str8);
                                                if (numValueOf != null) {
                                                    iIntValue2 = numValueOf.intValue();
                                                }
                                                e eVarA3 = androidx.compose.ui.platform.f.a(g.r(g.h(aVar, 20.0f), 20.0f), "Subheading Icon");
                                                i3 = 0;
                                                x2b x2bVarA = z2b.a(iIntValue2, 0, bVar3);
                                                Context context = (Context) bVar3.M(jteVar);
                                                context.getClass();
                                                TypedValue typedValue = new TypedValue();
                                                z = true;
                                                context.getTheme().resolveAttribute(R.attr.colorOnSurface, typedValue, true);
                                                wq6.b(x2bVarA, "", eVarA3, pnb.d(eb2.e(typedValue.data, 136)), bVar3, 432, 0);
                                                jh2.f(bVar3, g.r(aVar, 8.0f));
                                            }
                                            bVar3.F();
                                            fif.b(str7, new LayoutWeightElement(1.0f, z), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, xm6.e((Context) bVar3.M(jteVar)), bVar3, 0, 0, 65532);
                                            bVar3 = bVar3;
                                            bVar3.q();
                                        }
                                        bVar3.F();
                                        bVar3.q();
                                        xm6.b(i3, bVar3);
                                    } else {
                                        bVar2.D();
                                    }
                                    return j6g.a;
                                }
                            }, true), 3);
                        }
                        ArrayList arrayList2 = arrayList;
                        ls8Var.c(arrayList2.size(), null, new vm6(arrayList2, 0), new ah2(2039820996, new wm6(arrayList2, num, function1), true));
                        return j6g.a;
                    }
                };
                cVarH.p(function12);
                objV = function12;
            }
            hn8.b(eVarF, null, null, false, null, null, null, false, null, (Function1) objV, cVarH, 6, 510);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new rm6(str, str2, str3, arrayList, num, function1, i);
        }
    }

    public static final void b(int i, b bVar) {
        c cVarH = bVar.h(463947861);
        if (cVarH.o(i & 1, i != 0)) {
            b84.a(1.0f, 390, 8, pa2.a(R.color.idl_aurora_neutral_300, cVarH), cVarH, androidx.compose.ui.platform.f.a(e.a.b, "Divider"));
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ph2(i, 5);
        }
    }

    public static final void c(final int i, final HybridActionOverflowRow hybridActionOverflowRow, final Integer num, final Function1<? super Integer, j6g> function1, b bVar, final int i2) {
        int i3;
        e eVarB;
        e eVar;
        Integer numValueOf;
        boolean z;
        hybridActionOverflowRow.getClass();
        function1.getClass();
        c cVarH = bVar.h(-630605076);
        if ((i2 & 6) == 0) {
            i3 = (cVarH.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? cVarH.K(hybridActionOverflowRow) : cVarH.x(hybridActionOverflowRow) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= cVarH.K(num) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i2 & 3072) == 0) {
            i3 |= cVarH.x(function1) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if (cVarH.o(i3 & 1, (i3 & 1171) != 1170)) {
            e.a aVar = e.a.b;
            e eVarF = g.f(aVar, 1.0f);
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 7168) == 2048);
            Object objV = cVarH.v();
            if (z2 || objV == b.a.a) {
                objV = new gu5() { // from class: tm6
                    @Override // defpackage.gu5
                    public final Object invoke() {
                        function1.invoke(Integer.valueOf(i));
                        return j6g.a;
                    }
                };
                cVarH.p(objV);
            }
            e eVarD = androidx.compose.foundation.b.d(eVarF, false, null, null, (gu5) objV, 15);
            if (num != null && i == num.intValue()) {
                cVarH.L(-421076710);
                bj1 bj1VarF = ee3.f(pa2.a(R.color.idl_aurora_primary_800, cVarH), 1.0f);
                eVarB = ti1.b(aVar, bj1VarF.a, bj1VarF.b, ytc.a);
                cVarH.U(false);
            } else {
                cVarH.L(-421073580);
                cVarH.U(false);
                eVarB = aVar;
            }
            e eVarO = eVarD.o(eVarB);
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarO);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ag9VarD, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            gl2.a.e eVar2 = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar2);
            e eVarG = f.g(g.f(aVar, 1.0f), 16.0f, 16.0f);
            ehd ehdVarA = chd.a(vs0.a, c20.a.k, cVarH, 48);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarG);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar2);
            e eVarA = androidx.compose.ui.platform.f.a(g.r(g.h(aVar, 24.0f), 24.0f), "Selectable Item Image");
            jte jteVar = AndroidCompositionLocals_androidKt.b;
            Resources resources = ((Context) cVarH.M(jteVar)).getResources();
            resources.getClass();
            String str = hybridActionOverflowRow.a;
            if (str == null) {
                numValueOf = null;
                eVar = eVarA;
            } else {
                eVar = eVarA;
                String resourcePackageName = resources.getResourcePackageName(R.drawable.ic_idl_placeholder_24);
                String lowerCase = str.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                int identifier = resources.getIdentifier("ic_idl_" + lowerCase + "_24", "drawable", resourcePackageName);
                numValueOf = identifier != 0 ? Integer.valueOf(identifier) : ym6.a.get(str);
            }
            f17.a(z2b.a(numValueOf != null ? numValueOf.intValue() : R.drawable.ic_idl_placeholder_24, 0, cVarH), "", eVar, null, ft2.a.b, 0.0f, null, cVarH, 25008, 104);
            jh2.f(cVarH, g.r(aVar, 16.0f));
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode3 = Long.hashCode(cVarH.T);
            t8b t8bVarP3 = cVarH.P();
            e eVarC3 = androidx.compose.ui.c.c(cVarH, layoutWeightElement);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, dVar);
            ygg.y(cVarH, t8bVarP3, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode3))) {
                ja.h(iHashCode3, cVarH, iHashCode3, c0251a);
            }
            ygg.y(cVarH, eVarC3, eVar2);
            e eVarF2 = g.f(aVar, 1.0f);
            String str2 = hybridActionOverflowRow.b;
            if (str2 == null) {
                str2 = "";
            }
            fif.b(str2, eVarF2, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, d((Context) cVarH.M(jteVar)), cVarH, 48, 0, 65532);
            cVarH = cVarH;
            String str3 = hybridActionOverflowRow.c;
            if (str3 == null || str3.length() == 0) {
                z = false;
                cVarH.L(551273494);
            } else {
                cVarH.L(560616584);
                fif.b(hybridActionOverflowRow.c, g.f(aVar, 1.0f), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, e((Context) cVarH.M(jteVar)), cVarH, 48, 0, 65532);
                cVarH = cVarH;
                z = false;
            }
            cVarH.U(z);
            o6.j(cVarH, true, true, true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: um6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    xm6.c(i, hybridActionOverflowRow, num, function1, (b) obj, ka2.L(i2 | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final tjf d(Context context) {
        context.getClass();
        vn5 vn5Var = hz6.a;
        to5 to5Var = to5.d0;
        long jT = hh2.t(16);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorOnSurface, typedValue, true);
        return new tjf(pnb.d(typedValue.data), jT, to5Var, vn5Var, 0L, 0, 0L, 16777176);
    }

    public static final tjf e(Context context) {
        context.getClass();
        vn5 vn5Var = hz6.a;
        long jT = hh2.t(16);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorOnSurface, typedValue, true);
        return new tjf(pnb.d(eb2.e(typedValue.data, 136)), jT, null, vn5Var, 0L, 0, 0L, 16777180);
    }
}
