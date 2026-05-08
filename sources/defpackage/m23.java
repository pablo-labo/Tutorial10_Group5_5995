package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.vs0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class m23 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final List<Locale> list, final Locale locale, final Function1<? super Locale, j6g> function1, final gu5<j6g> gu5Var, final gu5<j6g> gu5Var2, b bVar, final int i) {
        Pair pair;
        list.getClass();
        function1.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        c cVarH = bVar.h(1681173330);
        int i2 = i | (cVarH.x(list) ? 4 : 2) | (cVarH.x(locale) ? 32 : 16) | (cVarH.x(function1) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(gu5Var2) ? 16384 : 8192);
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(new jhf("", 0L, 6));
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            hne hneVar = (hne) cVarH.M(um2.p);
            Iterator<Locale> it = list.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                } else {
                    if (wl7.b(it.next().getCountry(), locale != null ? locale.getCountry() : null)) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            int i4 = i3;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(Boolean.FALSE);
                cVarH.p(objV2);
            }
            g4a g4aVar2 = (g4a) objV2;
            if (!((Boolean) g4aVar2.getValue()).booleanValue() && ((jhf) g4aVar.getValue()).a.b.length() > 0) {
                g4aVar.setValue(new jhf("", 0L, 6));
            }
            cVarH.L(699888362);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            int i5 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    u63.o0();
                    throw null;
                }
                Locale locale2 = (Locale) next;
                String country = locale2.getCountry();
                country.getClass();
                Iterator it3 = it2;
                String strA = p23.a(country);
                String displayCountry = locale2.getDisplayCountry();
                displayCountry.getClass();
                g4a g4aVar3 = g4aVar;
                g4a g4aVar4 = g4aVar2;
                if (zve.L(displayCountry, ((jhf) g4aVar.getValue()).a.b, true)) {
                    cVarH.L(-772672375);
                    Integer numValueOf = Integer.valueOf(i5);
                    String strM = z3.m(strA, "   ", locale2.getDisplayCountry());
                    boolean zX = ((i2 & 896) == 256) | cVarH.x(locale2);
                    Object objV3 = cVarH.v();
                    if (zX || objV3 == c0020a) {
                        objV3 = new mr(2, function1, locale2);
                        cVarH.p(objV3);
                    }
                    pair = new Pair(numValueOf, new ax6(strM, (gu5) objV3, null, i5 == i4, false, 492));
                    cVarH.U(false);
                } else {
                    cVarH.L(-772404908);
                    cVarH.U(false);
                    pair = null;
                }
                if (pair != null) {
                    arrayList.add(pair);
                }
                i5 = i6;
                g4aVar2 = g4aVar4;
                it2 = it3;
                g4aVar = g4aVar3;
            }
            g4a g4aVar5 = g4aVar;
            g4a g4aVar6 = g4aVar2;
            cVarH.U(false);
            vs0.k kVar = vs0.c;
            af1.a aVar = c20.a.m;
            ob2 ob2VarA = mb2.a(kVar, aVar, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e.a aVar2 = e.a.b;
            e eVarC = androidx.compose.ui.c.c(cVarH, aVar2);
            gl2.j.getClass();
            pm8.a aVar3 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ob2VarA, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            nx6.c(ak2.I(R.string.contact_information_country_label, cVarH), null, false, false, false, null, bh2.c(910550643, new i23(0, gu5Var), cVarH), bh2.c(968532916, new j23(0, hneVar, gu5Var2), cVarH), null, null, cVarH, 14155776, 830);
            cVarH = cVarH;
            jhf jhfVar = (jhf) g4aVar5.getValue();
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                objV4 = new vy(1, g4aVar5);
                cVarH.p(objV4);
            }
            Function1 function12 = (Function1) objV4;
            Object objV5 = cVarH.v();
            if (objV5 == c0020a) {
                objV5 = new k23(0, g4aVar6);
                cVarH.p(objV5);
            }
            ftd.a(jhfVar, function12, (Function1) objV5, null, cVarH, 3504);
            e eVarD = g.d(aVar2, 1.0f);
            ob2 ob2VarA2 = mb2.a(new vs0.i(16.0f, true, new us0(0)), aVar, cVarH, 54);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarD);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA2, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar);
            ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                arrayList2.add((ax6) ((Pair) it4.next()).e());
            }
            fx6.a(arrayList2, null, false, null, cVarH, 0, 14);
            cVarH.U(true);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(list, locale, function1, gu5Var, gu5Var2, i) { // from class: l23
                public final /* synthetic */ List a;
                public final /* synthetic */ Locale b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ gu5 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    m23.a(this.a, this.b, this.c, this.d, this.e, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
