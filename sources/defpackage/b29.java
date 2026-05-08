package defpackage;

import android.icu.text.LocaleDisplayNames;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.locationselector.a;
import defpackage.c20;
import defpackage.ft2;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class b29 {

    @uh3(c = "com.indeed.android.jobsearch.locationselector.LocationSelectorScreenKt$LocationSelectorScreen$5$1$1", f = "LocationSelectorScreen.kt", l = {125}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ hw9 $countrySelectorSheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(hw9 hw9Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$countrySelectorSheetState = hw9Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$countrySelectorSheetState, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                hw9 hw9Var = this.$countrySelectorSheetState;
                this.label = 1;
                Object objB = hw9Var.b(this);
                g13 g13Var = g13.a;
                if (objB == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.jobsearch.locationselector.LocationSelectorScreenKt$LocationSelectorScreen$7$1$1$3$1$1", f = "LocationSelectorScreen.kt", l = {310}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ hw9 $countrySelectorSheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(hw9 hw9Var, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$countrySelectorSheetState = hw9Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$countrySelectorSheetState, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                hw9 hw9Var = this.$countrySelectorSheetState;
                this.label = 1;
                Object objD = hw9Var.d(this);
                g13 g13Var = g13.a;
                if (objD == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    public static final void a(final String str, final List<String> list, final String str2, final List<String> list2, gu5<j6g> gu5Var, gu5<j6g> gu5Var2, wu5<? super String, ? super String, ? super String, j6g> wu5Var, androidx.compose.runtime.b bVar, final int i, final int i2) {
        final gu5<j6g> gu5Var3;
        int i3;
        gu5<j6g> gu5Var4;
        int i4;
        wu5<? super String, ? super String, ? super String, j6g> wu5Var2;
        int i5;
        final gu5<j6g> gu5Var5;
        final wu5<? super String, ? super String, ? super String, j6g> wu5Var3;
        c cVar;
        gu5<j6g> gu5Var6;
        final wu5<? super String, ? super String, ? super String, j6g> wu5Var4;
        int i6;
        Object obj;
        gu5<j6g> gu5Var7;
        c cVarH = bVar.h(586895155);
        int i7 = (i & 6) == 0 ? (cVarH.K(str) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i7 |= cVarH.x(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i7 |= cVarH.K(str2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i7 |= cVarH.x(list2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 = i7 | 24576;
            gu5Var3 = gu5Var;
        } else {
            gu5Var3 = gu5Var;
            i3 = i7 | (cVarH.x(gu5Var3) ? 16384 : 8192);
        }
        int i9 = i2 & 32;
        if (i9 != 0) {
            i4 = i3 | 196608;
            gu5Var4 = gu5Var2;
        } else {
            gu5Var4 = gu5Var2;
            i4 = i3 | (cVarH.x(gu5Var4) ? 131072 : 65536);
        }
        int i10 = i2 & 64;
        if (i10 != 0) {
            i5 = i4 | 1572864;
            wu5Var2 = wu5Var;
        } else {
            wu5Var2 = wu5Var;
            i5 = i4 | (cVarH.x(wu5Var2) ? 1048576 : 524288);
        }
        if (cVarH.o(i5 & 1, (i5 & 599187) != 599186)) {
            b.a.C0020a c0020a = b.a.a;
            if (i8 != 0) {
                Object objV = cVarH.v();
                if (objV == c0020a) {
                    objV = new qr0(7);
                    cVarH.p(objV);
                }
                gu5Var6 = (gu5) objV;
            } else {
                gu5Var6 = gu5Var3;
            }
            if (i9 != 0) {
                Object objV2 = cVarH.v();
                if (objV2 == c0020a) {
                    objV2 = new l7(13);
                    cVarH.p(objV2);
                }
                gu5Var4 = (gu5) objV2;
            }
            if (i10 != 0) {
                Object objV3 = cVarH.v();
                if (objV3 == c0020a) {
                    objV3 = new v19(0);
                    cVarH.p(objV3);
                }
                wu5Var4 = (wu5) objV3;
            } else {
                wu5Var4 = wu5Var2;
            }
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                objV4 = LocaleDisplayNames.getInstance(Locale.getDefault());
                cVarH.p(objV4);
            }
            LocaleDisplayNames localeDisplayNames = (LocaleDisplayNames) objV4;
            int i11 = i5 & 14;
            boolean z = i11 == 4;
            Object objV5 = cVarH.v();
            if (z || objV5 == c0020a) {
                objV5 = localeDisplayNames.regionDisplayName(str);
                cVarH.p(objV5);
            }
            final String str3 = (String) objV5;
            boolean zK = (i11 == 4) | cVarH.K(list);
            Object objV6 = cVarH.v();
            Object obj2 = objV6;
            if (zK || objV6 == c0020a) {
                List<String> list3 = list;
                ArrayList arrayList = new ArrayList(t92.r0(list3, 10));
                for (String str4 : list3) {
                    arrayList.add(LocaleDisplayNames.getInstance(new Locale(str4, str)).languageDisplayName(str4));
                }
                cVarH.p(arrayList);
                obj2 = arrayList;
            }
            final List list4 = (List) obj2;
            int i12 = i5 & 896;
            boolean z2 = i12 == 256;
            Object objV7 = cVarH.v();
            if (z2 || objV7 == c0020a) {
                objV7 = localeDisplayNames.regionDisplayName(str2);
                cVarH.p(objV7);
            }
            final String str5 = (String) objV7;
            boolean zK2 = (i12 == 256) | cVarH.K(list2);
            Object objV8 = cVarH.v();
            if (zK2 || objV8 == c0020a) {
                i6 = i5;
                ArrayList arrayList2 = new ArrayList(t92.r0(list2, 10));
                for (Iterator it = r1.iterator(); it.hasNext(); it = it) {
                    String str6 = (String) it.next();
                    arrayList2.add(LocaleDisplayNames.getInstance(new Locale(str6, str2)).languageDisplayName(str6));
                }
                cVarH.p(arrayList2);
                obj = arrayList2;
            } else {
                i6 = i5;
                obj = objV8;
            }
            final List list5 = (List) obj;
            Object objV9 = cVarH.v();
            if (objV9 == c0020a) {
                localeDisplayNames.getClass();
                objV9 = new mb5(localeDisplayNames);
                cVarH.p(objV9);
            }
            final mb5 mb5Var = (mb5) objV9;
            Object objV10 = cVarH.v();
            if (objV10 == c0020a) {
                m74 m74Var = to4.a;
                objV10 = v40.b(cVarH.l(), cVarH);
            }
            final e13 e13Var = (e13) objV10;
            final hw9 hw9VarC = androidx.compose.material.a.c(iw9.a, null, cVarH, 6, 14);
            Object objV11 = cVarH.v();
            if (objV11 == c0020a) {
                gu5Var7 = gu5Var4;
                objV11 = r.f(new jhf((String) null, 0L, 7));
                cVarH.p(objV11);
            } else {
                gu5Var7 = gu5Var4;
            }
            final g4a g4aVar = (g4a) objV11;
            final o97 o97Var = (o97) cVarH.M(p97.a);
            boolean z3 = (i6 & 57344) == 16384;
            Object objV12 = cVarH.v();
            if (z3 || objV12 == c0020a) {
                objV12 = new hh(9, gu5Var6);
                cVarH.p(objV12);
            }
            g71.a(false, (gu5) objV12, cVarH, 0, 1);
            boolean zC = hw9VarC.c();
            boolean zX = cVarH.x(e13Var) | cVarH.x(hw9VarC);
            Object objV13 = cVarH.v();
            if (zX || objV13 == c0020a) {
                objV13 = new as(11, e13Var, hw9VarC);
                cVarH.p(objV13);
            }
            g71.a(zC, (gu5) objV13, cVarH, 0, 0);
            gu5<j6g> gu5Var8 = gu5Var6;
            final gu5<j6g> gu5Var9 = gu5Var7;
            final wu5<? super String, ? super String, ? super String, j6g> wu5Var5 = wu5Var4;
            c cVar2 = cVarH;
            androidx.compose.material.a.a(bh2.c(1422985797, new wu5() { // from class: w19
                @Override // defpackage.wu5
                public final Object q(Object obj3, Object obj4, Object obj5) {
                    pb2 pb2Var = (pb2) obj3;
                    b bVar2 = (b) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    pb2Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= bVar2.K(pb2Var) ? 4 : 2;
                    }
                    if (bVar2.o(iIntValue & 1, (iIntValue & 19) != 18)) {
                        if (hw9VarC.c()) {
                            bVar2.L(842815337);
                            e eVarA = pb2Var.a(e.a.b, true);
                            final o97 o97Var2 = o97Var;
                            boolean zX2 = bVar2.x(o97Var2);
                            final mb5 mb5Var2 = mb5Var;
                            boolean zX3 = zX2 | bVar2.x(mb5Var2);
                            final wu5 wu5Var6 = wu5Var4;
                            boolean zK3 = zX3 | bVar2.K(wu5Var6);
                            Object objV14 = bVar2.v();
                            if (zK3 || objV14 == b.a.a) {
                                final g4a g4aVar2 = g4aVar;
                                objV14 = new Function1() { // from class: t19
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj6) {
                                        ls8 ls8Var = (ls8) obj6;
                                        ls8Var.getClass();
                                        o97 o97Var3 = o97Var2;
                                        ls8.e(ls8Var, null, new ah2(607238229, new jq0(o97Var3, 1), true), 3);
                                        g4a g4aVar3 = g4aVar2;
                                        ls8.e(ls8Var, "search_bar", new ah2(-649239490, new ox2(2, o97Var3, g4aVar3), true), 2);
                                        String str7 = ((jhf) g4aVar3.getValue()).a.b;
                                        mb5 mb5Var3 = mb5Var2;
                                        mb5Var3.getClass();
                                        str7.getClass();
                                        iy8 iy8VarS = u63.s();
                                        List<String> listG = new pxc("\\s+").g(str7, 0);
                                        a aVar = a.a;
                                        for (String str8 : a.b.isEmpty() ? ((Map) a.c.getValue()).keySet() : a.b.keySet()) {
                                            a aVar2 = a.a;
                                            for (String str9 : a.a(str8)) {
                                                Locale locale = new Locale(str9, str8);
                                                if (!zve.U(str7)) {
                                                    List<String> list6 = listG;
                                                    if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                                                        for (String str10 : list6) {
                                                            if (zve.L(mb5Var3.a(str8, null), str10, true) || zve.L(mb5Var3.a(str8, locale), str10, true) || zve.L(mb5Var3.b(str9, null), str10, true) || zve.L(mb5Var3.b(str9, locale), str10, true)) {
                                                            }
                                                        }
                                                    }
                                                }
                                                iy8VarS.add(new bhd(str8, mb5Var3.a(str8, null), mb5Var3.a(str8, locale), str9, mb5Var3.b(str9, null), mb5Var3.b(str9, locale)));
                                            }
                                        }
                                        iy8 iy8VarL = iy8VarS.l();
                                        final so0 so0Var = new so0(5);
                                        final List listP1 = z92.p1(iy8VarL, new Comparator() { // from class: lb5
                                            @Override // java.util.Comparator
                                            public final int compare(Object obj7, Object obj8) {
                                                return ((Number) so0Var.invoke(obj7, obj8)).intValue();
                                            }
                                        });
                                        int size = listP1.size();
                                        cu cuVar = new cu(listP1, 7);
                                        final wu5 wu5Var7 = wu5Var6;
                                        ls8.d(ls8Var, size, cuVar, new ah2(1370537196, new xu5() { // from class: u19
                                            @Override // defpackage.xu5
                                            public final Object j(Object obj7, Object obj8, Object obj9, Object obj10) {
                                                int iIntValue2 = ((Integer) obj8).intValue();
                                                b bVar3 = (b) obj9;
                                                int iIntValue3 = ((Integer) obj10).intValue();
                                                ((xo8) obj7).getClass();
                                                if ((iIntValue3 & 48) == 0) {
                                                    iIntValue3 |= bVar3.d(iIntValue2) ? 32 : 16;
                                                }
                                                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                                                    bhd bhdVar = (bhd) listP1.get(iIntValue2);
                                                    wu5 wu5Var8 = wu5Var7;
                                                    boolean zK4 = bVar3.K(wu5Var8) | bVar3.K(bhdVar);
                                                    Object objV15 = bVar3.v();
                                                    if (zK4 || objV15 == b.a.a) {
                                                        objV15 = new qv(7, wu5Var8, bhdVar);
                                                        bVar3.p(objV15);
                                                    }
                                                    uy8.b(androidx.compose.foundation.b.d(e.a.b, false, null, null, (gu5) objV15, 15), bh2.c(456812909, new he4(bhdVar, 4), bVar3), bh2.c(-574648308, new vz2(bhdVar, 3), bVar3), false, bh2.c(-405525880, new rj4(bhdVar, 5), bVar3), bVar3, 1573296);
                                                } else {
                                                    bVar3.D();
                                                }
                                                return j6g.a;
                                            }
                                        }, true), 4);
                                        return j6g.a;
                                    }
                                };
                                bVar2.p(objV14);
                            }
                            hn8.b(eVarA, null, null, false, null, null, null, false, null, (Function1) objV14, bVar2, 0, 510);
                        } else {
                            bVar2.L(837375581);
                        }
                        bVar2.F();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), null, hw9VarC, false, null, 0.0f, 0L, 0L, 0L, bh2.c(-900185300, new Function2() { // from class: x19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    b bVar2 = (b) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                        e.a aVar = e.a.b;
                        e eVarC = g.c(aVar, 1.0f);
                        ag9 ag9VarD = hl1.d(c20.a.a, false);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e eVarC2 = androidx.compose.ui.c.c(bVar2, eVarC);
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
                        ygg.y(bVar2, ag9VarD, dVar);
                        gl2.a.f fVar = gl2.a.f;
                        ygg.y(bVar2, t8bVarM, fVar);
                        gl2.a.C0251a c0251a = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar2, iHashCode, c0251a);
                        }
                        gl2.a.e eVar = gl2.a.d;
                        ygg.y(bVar2, eVarC2, eVar);
                        e eVarM = pnb.M(g.c(aVar, 1.0f), pnb.L(0, 1, bVar2), true);
                        o97 o97Var2 = o97Var;
                        o97.g gVar = o97Var2.i;
                        o97.a aVar3 = o97Var2.c;
                        o97.c cVar3 = o97Var2.f;
                        o97.h hVar = o97Var2.j;
                        tjf tjfVar = hVar.f;
                        e eVarF = f.f(eVarM, 24.0f);
                        ob2 ob2VarA = mb2.a(vs0.e, c20.a.n, bVar2, 54);
                        int iHashCode2 = Long.hashCode(bVar2.k());
                        t8b t8bVarM2 = bVar2.m();
                        e eVarC3 = androidx.compose.ui.c.c(bVar2, eVarF);
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
                        ygg.y(bVar2, eVarC3, eVar);
                        f17.a(z2b.a(R.drawable.location_selector_hero, 0, bVar2), null, androidx.compose.ui.platform.f.a(g.h(g.r(aVar, 100.0f), 80.0f), "LocationSelectorImage"), null, ft2.a.g, 0.0f, null, bVar2, 24624, 104);
                        String str7 = str5;
                        str7.getClass();
                        fif.b(ak2.J(R.string.location_selector_full_screen_title, new Object[]{str7}, bVar2), androidx.compose.ui.platform.f.a(f.j(aVar, 0.0f, 32.0f, 0.0f, 0.0f, 13), "LocationSelectorTitle"), 0L, 0L, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, tjf.a(hVar.e, 0L, 0L, cVar3.c, null, null, 0L, 0, 0L, null, null, 0, 16777211), bVar2, 0, 0, 65020);
                        fif.b(ak2.I(R.string.location_selector_full_screen_subtitle, bVar2), f.j(aVar, 0.0f, 4.0f, 0.0f, 32.0f, 5), 0L, 0L, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, tjfVar, bVar2, 0, 0, 65020);
                        o97.a.e eVar2 = aVar3.a;
                        o97.a.C0340a c0340a = aVar3.b;
                        b84.a(0.0f, 6, 12, eVar2.c, bVar2, androidx.compose.ui.platform.f.a(g.f(g.h(aVar, 2.0f), 1.0f), "DividerTop"));
                        fif.b(ak2.J(R.string.location_selector_full_screen_move_title, new Object[]{str7}, bVar2), androidx.compose.ui.platform.f.a(f.j(aVar, 0.0f, 32.0f, 0.0f, 0.0f, 13), "LocationSelectorMoveTitle"), 0L, 0L, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, tjf.a(tjfVar, 0L, 0L, cVar3.c, null, null, 0L, 0, 0L, null, null, 0, 16777211), bVar2, 0, 0, 65020);
                        j89 j89Var = j89.Center;
                        e eVarA = androidx.compose.ui.platform.f.a(f.j(aVar, 0.0f, 12.0f, 0.0f, 0.0f, 13), "MoveLanguagesRow");
                        final List list6 = list2;
                        final List list7 = list5;
                        final wu5 wu5Var6 = wu5Var5;
                        final String str8 = str2;
                        ej5.b(eVarA, null, j89Var, 12.0f, null, 0.0f, null, bh2.c(-1685676554, new Function2() { // from class: z19
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                b bVar3 = (b) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                if (bVar3.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    for (Pair pair : z92.H1(list6, list7)) {
                                        String str9 = (String) pair.a();
                                        String str10 = (String) pair.b();
                                        str10.getClass();
                                        wu5 wu5Var7 = wu5Var6;
                                        boolean zK3 = bVar3.K(wu5Var7);
                                        String str11 = str8;
                                        boolean zK4 = zK3 | bVar3.K(str11) | bVar3.K(str9);
                                        Object objV14 = bVar3.v();
                                        if (zK4 || objV14 == b.a.a) {
                                            objV14 = new nw0(5, wu5Var7, str11, str9);
                                            bVar3.p(objV14);
                                        }
                                        gt6.h(str10, (gu5) objV14, null, null, false, false, null, null, null, bVar3, 0, 508);
                                    }
                                } else {
                                    bVar3.D();
                                }
                                return j6g.a;
                            }
                        }, bVar2), bVar2, 12583296, 114);
                        b84.a(0.0f, 0, 12, c0340a.c, bVar2, androidx.compose.ui.platform.f.a(g.r(g.h(f.h(aVar, 0.0f, 32.0f, 1), 2.0f), 80.0f), "DividerMiddle"));
                        String str9 = str3;
                        str9.getClass();
                        fif.b(ak2.J(R.string.location_selector_full_screen_stay_title, new Object[]{str9}, bVar2), androidx.compose.ui.platform.f.a(aVar, "LocationSelectorStayTitle"), 0L, 0L, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, tjf.a(tjfVar, 0L, 0L, cVar3.c, null, null, 0L, 0, 0L, null, null, 0, 16777211), bVar2, 48, 0, 65020);
                        ej5.b(androidx.compose.ui.platform.f.a(f.j(aVar, 0.0f, 12.0f, 0.0f, 0.0f, 13), "StayLanguagesRow"), null, j89Var, 12.0f, null, 0.0f, null, bh2.c(313764831, new a29(list, list4, wu5Var6, str, 0), bVar2), bVar2, 12583296, 114);
                        b84.a(0.0f, 0, 12, c0340a.c, bVar2, androidx.compose.ui.platform.f.a(g.r(g.h(f.h(aVar, 0.0f, 32.0f, 1), 2.0f), 80.0f), "DividerBottom"));
                        String strI = ak2.I(R.string.location_selector_full_screen_change_country_button, bVar2);
                        e13 e13Var2 = e13Var;
                        boolean zX2 = bVar2.x(e13Var2);
                        hw9 hw9Var = hw9VarC;
                        boolean zX3 = zX2 | bVar2.x(hw9Var);
                        Object objV14 = bVar2.v();
                        b.a.C0020a c0020a2 = b.a.a;
                        if (zX3 || objV14 == c0020a2) {
                            objV14 = new za(8, e13Var2, hw9Var);
                            bVar2.p(objV14);
                        }
                        gt6.j(strI, (gu5) objV14, null, null, false, false, null, null, null, bVar2, 0, 508);
                        bVar2.q();
                        gu5 gu5Var10 = gu5Var9;
                        boolean zK3 = bVar2.K(gu5Var10);
                        Object objV15 = bVar2.v();
                        if (zK3 || objV15 == c0020a2) {
                            objV15 = new gd(5, gu5Var10);
                            bVar2.p(objV15);
                        }
                        sq6.a((gu5) objV15, g.n(androidx.compose.foundation.layout.b.a.h(f.f(aVar, 4.0f), c20.a.c), 48.0f), false, bh2.c(-632223286, new pr(o97Var2, 4), bVar2), bVar2, 24576, 12);
                        bVar2.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVar2, 805306886, 506);
            gu5Var5 = gu5Var9;
            wu5Var3 = wu5Var5;
            gu5Var3 = gu5Var8;
            cVar = cVar2;
        } else {
            c cVar3 = cVarH;
            cVar3.D();
            gu5Var5 = gu5Var4;
            wu5Var3 = wu5Var2;
            cVar = cVar3;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: y19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    b29.a(str, list, str2, list2, gu5Var3, gu5Var5, wu5Var3, (b) obj3, ka2.L(i | 1), i2);
                    return j6g.a;
                }
            };
        }
    }
}
