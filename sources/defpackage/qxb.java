package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.k38;
import defpackage.le0;
import defpackage.o97;
import defpackage.pm8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class qxb {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[k38.values().length];
            try {
                k38.a aVar = k38.a;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                k38.a aVar2 = k38.a;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                k38.a aVar3 = k38.a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final void a(gu5<j6g> gu5Var, b bVar, int i) {
        gu5<j6g> gu5Var2;
        c cVarH = bVar.h(-437419792);
        int i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            String strI = ak2.I(R.string.add_another_section, cVarH);
            o97 o97Var = (o97) cVarH.M(p97.a);
            o97.g gVar = o97Var.i;
            fgd fgdVarA = ggd.a(8.0f);
            e.a aVar = e.a.b;
            e eVarH = f.h(androidx.compose.foundation.a.b(ygg.h(aVar, fgdVarA), o97Var.c.b.a, ytc.a), 16.0f, 0.0f, 2);
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarH);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            gu5Var2 = gu5Var;
            gt6.m(strI, gu5Var2, androidx.compose.ui.platform.f.a(aVar, "AddAnotherSectionButton"), null, false, null, fv6.q1, cVarH, ((i2 << 3) & 112) | 12583296, 376);
            cVarH.U(true);
        } else {
            gu5Var2 = gu5Var;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new rq(gu5Var2, i, 8);
        }
    }

    public static final void b(String str, String str2, b bVar, int i) {
        str.getClass();
        str2.getClass();
        c cVarH = bVar.h(-1927881973);
        int i2 = (cVarH.K(str) ? 4 : 2) | i | (cVarH.K(str2) ? 32 : 16);
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            ne4 ne4Var = p97.a;
            o97 o97Var = (o97) cVarH.M(ne4Var);
            le0.b bVar2 = new le0.b();
            int iK = bVar2.k(new foe(o97Var.c.c.f.b, 0L, (to5) null, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, odf.c, (vbe) null, 61438));
            try {
                bVar2.g(str);
                j6g j6gVar = j6g.a;
                bVar2.i(iK);
                le0 le0VarL = bVar2.l();
                tjf tjfVarA = tjf.a((tjf) cVarH.M(fif.a), 0L, 0L, null, null, ((o97) cVarH.M(ne4Var)).d.a, 0L, 0, 0L, null, null, 0, 16777183);
                boolean zX = cVarH.x(context) | ((i2 & 112) == 32);
                Object objV = cVarH.v();
                if (zX || objV == b.a.a) {
                    objV = new qs0(11, str2, context);
                    cVarH.p(objV);
                }
                p72.a(le0VarL, null, tjfVarA, false, 0, 0, null, (Function1) objV, cVarH, 0, 122);
            } catch (Throwable th) {
                bVar2.i(iK);
                throw th;
            }
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new gh(str, i, 6, str2);
        }
    }

    public static final void c(final gu5<j6g> gu5Var, final svb svbVar, b bVar, final int i) {
        int i2;
        c cVar;
        c cVarH = bVar.h(851192062);
        if ((i & 6) == 0) {
            i2 = i | (cVarH.x(gu5Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(svbVar) ? 32 : 16;
        }
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e.a aVar = e.a.b;
            e eVarF = g.f(aVar, 1.0f);
            o97.g gVar = o97Var.i;
            e eVarH = f.h(eVarF, 0.0f, 12.0f, 1);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarH);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
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
            e eVarF2 = g.f(aVar, 1.0f);
            ehd ehdVarA = chd.a(vs0.g, c20.a.k, cVarH, 54);
            int i3 = i2;
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarF2);
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
            ygg.y(cVarH, eVarC2, eVar);
            cif.b(ak2.I(R.string.label_additional_information, cVarH), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.g, o97Var.c.a.c, 0L, o97Var.f.c, null, o97Var.d.a, 0L, 0, 0L, null, null, 0, 16777178), cVarH, 0, 0, 65534);
            cVarH.U(true);
            cVarH.U(true);
            boolean z = (i3 & 14) == 4;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new sd(11, gu5Var);
                cVarH.p(objV);
            }
            uub.a((gu5) objV, false, null, null, null, bh2.c(1051467725, new td(3, o97Var, svbVar), cVarH), cVarH, 196608, 30);
            cVar = cVarH;
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: ixb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iL = ka2.L(i | 1);
                    qxb.c(gu5Var, svbVar, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void d(gu5<j6g> gu5Var, gu5<j6g> gu5Var2, svb svbVar, b bVar, int i) {
        int i2;
        c cVarH = bVar.h(1705507932);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(gu5Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(svbVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            String strI = ak2.I(R.string.label_languages, cVarH);
            boolean z = (i2 & 14) == 4;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new ib1(5, gu5Var);
                cVarH.p(objV);
            }
            uub.b(strI, "", (gu5) objV, null, false, !svbVar.N.isEmpty(), false, bh2.c(-930791489, new ir4(5, svbVar, gu5Var2), cVarH), cVarH, 12582960, 88);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new hxb(gu5Var, gu5Var2, svbVar, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    public static final void e(final gu5 gu5Var, final Function1 function1, final ArrayList arrayList, final ArrayList arrayList2, final boolean z, b bVar, final int i) {
        int i2;
        int i3;
        c cVarH = bVar.h(-985673528);
        int i4 = 32;
        int i5 = i | (cVarH.x(gu5Var) ? 4 : 2) | (cVarH.x(function1) ? 32 : 16) | (cVarH.x(arrayList) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(arrayList2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.a(z) ? 16384 : 8192);
        boolean z2 = false;
        int i6 = 1;
        if (cVarH.o(i5 & 1, (i5 & 9363) != 9362)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            b.a.C0020a c0020a = b.a.a;
            if (z) {
                cVarH.L(491668595);
                for (Iterator it = arrayList2.iterator(); it.hasNext(); it = it) {
                    aje ajeVar = (aje) it.next();
                    if (ajeVar.c.size() == i6) {
                        i2 = 491723217;
                        i3 = R.string.skill_label;
                    } else {
                        i2 = 491801771;
                        i3 = R.string.skills_item_title;
                    }
                    String strK = z3.k(cVarH, i2, i3, cVarH, z2);
                    int i7 = ((i5 & 112) == i4 ? i6 : z2) | (cVarH.x(ajeVar) ? 1 : 0);
                    Object objV = cVarH.v();
                    if (i7 != 0 || objV == c0020a) {
                        objV = new yi(11, function1, ajeVar);
                        cVarH.p(objV);
                    }
                    uub.a((gu5) objV, false, null, null, null, bh2.c(823800340, new n19(i6, o97Var, ajeVar, strK), cVarH), cVarH, 196608, 30);
                    c0020a = c0020a;
                    z2 = false;
                    i6 = i6;
                    o97Var = o97Var;
                    i4 = 32;
                }
                cVarH.U(z2);
            } else {
                cVarH.L(493119488);
                Object objV2 = cVarH.v();
                Object obj = objV2;
                if (objV2 == c0020a) {
                    tb tbVar = new tb(9);
                    cVarH.p(tbVar);
                    obj = tbVar;
                }
                String strW0 = z92.W0(arrayList, null, null, null, (Function1) obj, 31);
                boolean z3 = (i5 & 14) == 4;
                Object objV3 = cVarH.v();
                Object obj2 = objV3;
                if (z3 || objV3 == c0020a) {
                    mg mgVar = new mg(8, gu5Var);
                    cVarH.p(mgVar);
                    obj2 = mgVar;
                }
                uub.a((gu5) obj2, false, null, null, null, bh2.c(28131131, new xb(4, o97Var, strW0, false), cVarH), cVarH, 196608, 30);
                cVarH.U(false);
            }
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(function1, arrayList, arrayList2, z, i) { // from class: jxb
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ ArrayList c;
                public final /* synthetic */ ArrayList d;
                public final /* synthetic */ boolean e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iL = ka2.L(1);
                    qxb.e(this.a, this.b, this.c, this.d, this.e, (b) obj3, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void f(List list, Function2 function2, Locale locale, b bVar, int i) {
        c cVarH = bVar.h(1052979885);
        int i2 = i | (cVarH.x(list) ? 4 : 2) | (cVarH.x(function2) ? 32 : 16) | (cVarH.x(locale) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | 3072;
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                av8 av8Var = (av8) it.next();
                String str = av8Var.b;
                if (str == null || zve.U(str)) {
                    cVarH.L(-842394152);
                } else {
                    cVarH.L(-810064345);
                    boolean zX = cVarH.x(av8Var) | ((i2 & 112) == 32);
                    Object objV = cVarH.v();
                    if (zX || objV == b.a.a) {
                        objV = new za(11, av8Var, function2);
                        cVarH.p(objV);
                    }
                    uub.a((gu5) objV, false, null, null, null, bh2.c(-322420876, new jx7(3, av8Var, o97Var, locale), cVarH), cVarH, 196608, 30);
                }
                cVarH.U(false);
            }
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new jz1(i, 3, list, function2, locale);
        }
    }

    public static final void g(gu5<j6g> gu5Var, b bVar, int i) {
        int i2;
        gu5<j6g> gu5Var2;
        c cVarH = bVar.h(1007759115);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            gu5Var2 = gu5Var;
            gt6.o(fv6.I5, gu5Var2, androidx.compose.ui.platform.f.a(e.a.b, "ProfileOptionsButton"), null, null, null, cVarH, ((i2 << 3) & 112) | 390, 248);
        } else {
            gu5Var2 = gu5Var;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new yja(gu5Var2, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:246:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0951  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0965  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0985  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0993  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x09b8  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x09cc  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x09dc  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0a00  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0a23  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0a7f  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0a90  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0aa8  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0ab6  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0b58  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(final defpackage.gu5 r56, final defpackage.gu5 r57, defpackage.gu5 r58, final boolean r59, final defpackage.gu5 r60, final kotlin.jvm.functions.Function1 r61, final kotlin.jvm.functions.Function1 r62, defpackage.gu5 r63, kotlin.jvm.functions.Function1 r64, kotlin.jvm.functions.Function1 r65, kotlin.jvm.functions.Function1 r66, kotlin.jvm.functions.Function1 r67, final kotlin.jvm.functions.Function1 r68, final kotlin.jvm.functions.Function1 r69, kotlin.jvm.functions.Function1 r70, defpackage.gu5 r71, defpackage.gu5 r72, final defpackage.gu5 r73, final defpackage.gu5 r74, final kotlin.jvm.functions.Function1 r75, final kotlin.jvm.functions.Function2 r76, final kotlin.jvm.functions.Function1 r77, final kotlin.jvm.functions.Function1 r78, final java.util.Locale r79, defpackage.svb r80, final boolean r81, final boolean r82, final kotlin.jvm.functions.Function2 r83, final kotlin.jvm.functions.Function1 r84, androidx.compose.runtime.b r85, final int r86, final int r87, final int r88) {
        /*
            Method dump skipped, instruction units count: 3017
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qxb.h(gu5, gu5, gu5, boolean, gu5, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, gu5, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, gu5, gu5, gu5, gu5, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, java.util.Locale, svb, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, androidx.compose.runtime.b, int, int, int):void");
    }

    public static final void i(final gu5<j6g> gu5Var, final gu5<j6g> gu5Var2, final Function1<? super String, j6g> function1, final svb svbVar, b bVar, final int i) {
        c cVar;
        Object obj;
        boolean z;
        String strK;
        int i2;
        Iterator it;
        ArrayList arrayList;
        Object objValueOf;
        String str;
        c cVarH = bVar.h(-2127865302);
        int i3 = (i & 6) == 0 ? (cVarH.x(gu5Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= cVarH.x(gu5Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cVarH.x(function1) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i3 |= cVarH.x(svbVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if (cVarH.o(i3 & 1, (i3 & 1171) != 1170)) {
            Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            List<zie> list = svbVar.Q;
            ArrayList arrayListY = ka2.y(list);
            context.getClass();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayListY2 = ka2.y(arrayListY);
            ArrayList arrayList4 = new ArrayList(t92.r0(arrayListY2, 10));
            Iterator it2 = arrayListY2.iterator();
            while (true) {
                obj = null;
                if (!it2.hasNext()) {
                    break;
                }
                zie zieVar = (zie) it2.next();
                yie yieVar = zieVar.j;
                if (yieVar == null || (str = yieVar.a) == null) {
                    i2 = i3;
                    it = it2;
                    arrayList = arrayListY;
                    objValueOf = Boolean.valueOf(arrayList3.add(zieVar));
                } else {
                    String string = yieVar.b;
                    i2 = i3;
                    if (string == null) {
                        string = context.getString(R.string.additional_skills);
                        string.getClass();
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj2 : arrayListY2) {
                        Iterator it3 = it2;
                        ArrayList arrayList6 = arrayListY;
                        yie yieVar2 = ((zie) obj2).j;
                        if (wl7.b(yieVar2 != null ? yieVar2.a : null, zieVar.j.a)) {
                            arrayList5.add(obj2);
                        }
                        it2 = it3;
                        arrayListY = arrayList6;
                    }
                    it = it2;
                    arrayList = arrayListY;
                    aje ajeVar = new aje(str, string, z92.p1(arrayList5, new mn0()));
                    if (!arrayList2.contains(ajeVar)) {
                        arrayList2.add(ajeVar);
                    }
                    objValueOf = j6g.a;
                }
                arrayList4.add(objValueOf);
                i3 = i2;
                it2 = it;
                arrayListY = arrayList;
            }
            int i4 = i3;
            ArrayList arrayList7 = arrayListY;
            if (arrayList3.isEmpty()) {
                Iterator it4 = arrayList2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (wl7.b(((aje) next).a, "DEFAULT_GROUP_ID")) {
                        obj = next;
                        break;
                    }
                }
                aje ajeVar2 = (aje) obj;
                pxf.a(arrayList2).remove(ajeVar2);
                if (arrayList2.size() > 1) {
                    w92.E0(new kn0(), arrayList2);
                }
                if (ajeVar2 != null) {
                    arrayList2.add(ajeVar2);
                }
            } else {
                String string2 = context.getString(R.string.additional_skills);
                string2.getClass();
                arrayList2.add(new aje("", string2, z92.p1(arrayList3, new ln0())));
            }
            boolean z2 = c0h.H() && arrayList7.size() > 9 && arrayList2.size() > 1;
            if (z2) {
                z = false;
                strK = z3.k(cVarH, -1812294086, R.string.skill_sets_title, cVarH, false);
            } else {
                z = false;
                strK = z3.k(cVarH, -1812226599, R.string.skills_item_title, cVarH, false);
            }
            String strI = ak2.I(R.string.skills_item_desc, cVarH);
            boolean z3 = (i4 & 14) == 4 ? true : z;
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (z3 || objV == c0020a) {
                objV = new zv(5, gu5Var);
                cVarH.p(objV);
            }
            gu5 gu5Var3 = (gu5) objV;
            boolean z4 = (i4 & 112) == 32 ? true : z;
            Object objV2 = cVarH.v();
            if (z4 || objV2 == c0020a) {
                objV2 = new js(6, gu5Var2);
                cVarH.p(objV2);
            }
            cVar = cVarH;
            uub.b(strK, strI, gu5Var3, (gu5) objV2, false, !list.isEmpty(), (!c0h.H() || list.size() <= 9) ? z : true, bh2.c(1240560717, new fy6(gu5Var2, function1, arrayList7, arrayList2, z2), cVarH), cVar, 12582912, 16);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: fxb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    qxb.i(gu5Var, gu5Var2, function1, svbVar, (b) obj3, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void j(gu5<j6g> gu5Var, b bVar, final int i) {
        int i2;
        final gu5<j6g> gu5Var2;
        c cVarH = bVar.h(-1923264649);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            gu5Var2 = gu5Var;
            gt6.m(ak2.I(R.string.upload_resume, cVarH), gu5Var2, null, null, false, fv6.W9, null, cVarH, ((i2 << 3) & 112) | 1572864, 444);
        } else {
            gu5Var2 = gu5Var;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: gxb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iL = ka2.L(i | 1);
                    qxb.j(gu5Var2, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
