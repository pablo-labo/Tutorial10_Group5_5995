package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.sp7;
import defpackage.vs0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class g1d {
    public static final List<sjb> a = u63.a0(new sjb("DSQF7", "Remote"), new sjb("PAXZC", "Hybrid work"), new sjb("SWG7T", "In-person"));

    /* JADX WARN: Type inference failed for: r15v0, types: [T, java.util.ArrayList] */
    public static final void a(final List list, ArrayList arrayList, final gu5 gu5Var, final Function1 function1, final b5g b5gVar, b bVar, int i) {
        c cVar;
        list.getClass();
        gu5Var.getClass();
        function1.getClass();
        b5gVar.getClass();
        c cVarH = bVar.h(754629077);
        int i2 = i | (cVarH.x(list) ? 4 : 2) | (cVarH.x(arrayList) ? 32 : 16) | (cVarH.x(gu5Var) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(function1) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.d(b5gVar.ordinal()) ? 16384 : 8192);
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(arrayList);
                cVarH.p(objV);
            }
            final g4a g4aVar = (g4a) objV;
            final luc lucVar = new luc();
            List list2 = (List) g4aVar.getValue();
            ?? arrayList2 = new ArrayList(t92.r0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((sjb) it.next()).a);
            }
            lucVar.element = arrayList2;
            final o97 o97Var = (o97) cVarH.M(p97.a);
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(Boolean.FALSE);
                cVarH.p(objV2);
            }
            final g4a g4aVar2 = (g4a) objV2;
            boolean z = (((List) g4aVar.getValue()).size() == arrayList.size() && wl7.b((List) g4aVar.getValue(), arrayList)) ? false : true;
            String strI = ak2.I(R.string.remote_work_sheet_header, cVarH);
            boolean zA = cVarH.a(z) | ((i2 & 896) == 256);
            Object objV3 = cVarH.v();
            if (zA || objV3 == c0020a) {
                objV3 = new k78(z, gu5Var, g4aVar2, 2);
                cVarH.p(objV3);
            }
            gu5 gu5Var2 = (gu5) objV3;
            boolean z2 = (i2 & 7168) == 2048;
            Object objV4 = cVarH.v();
            if (z2 || objV4 == c0020a) {
                objV4 = new x78(function1, g4aVar, 1);
                cVarH.p(objV4);
            }
            cVar = cVarH;
            sb1.a(strI, gu5Var2, (gu5) objV4, 0, null, 0, null, null, b5gVar, false, false, false, false, null, 0, bh2.c(609630291, new Function2() { // from class: e1d
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    g4a g4aVar3;
                    int i3;
                    b bVar2 = (b) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                        e.a aVar = e.a.b;
                        e eVarF = g.f(aVar, 1.0f);
                        o97 o97Var2 = o97Var;
                        o97.g gVar = o97Var2.i;
                        e eVarM = pnb.M(f.h(eVarF, 16.0f, 0.0f, 2), pnb.L(0, 1, bVar2), true);
                        ob2 ob2VarA = mb2.a(new vs0.i(16.0f, true, new us0(0)), c20.a.m, bVar2, 0);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e eVarC = androidx.compose.ui.c.c(bVar2, eVarM);
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
                        ygg.y(bVar2, ob2VarA, gl2.a.g);
                        ygg.y(bVar2, t8bVarM, gl2.a.f);
                        gl2.a.C0251a c0251a = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar2, iHashCode, c0251a);
                        }
                        ygg.y(bVar2, eVarC, gl2.a.d);
                        String strI2 = ak2.I(R.string.remote_work_options_list_header, bVar2);
                        tjf tjfVarA = tjf.a(o97Var2.j.f, 0L, 0L, o97Var2.f.c, null, null, 0L, 0, 0L, null, null, 0, 16777211);
                        e eVarJ = f.j(aVar, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                        Object objV5 = bVar2.v();
                        b.a.C0020a c0020a2 = b.a.a;
                        if (objV5 == c0020a2) {
                            objV5 = new ue(15);
                            bVar2.p(objV5);
                        }
                        b.a.C0020a c0020a3 = c0020a2;
                        fif.b(strI2, b5e.b(eVarJ, false, (Function1) objV5), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVarA, bVar2, 0, 0, 65532);
                        bVar2.L(-51909034);
                        List list3 = list;
                        List list4 = list3;
                        ArrayList arrayList3 = new ArrayList(t92.r0(list4, 10));
                        Iterator it2 = list4.iterator();
                        while (true) {
                            boolean zHasNext = it2.hasNext();
                            g4aVar3 = g4aVar;
                            int i4 = 6;
                            if (!zHasNext) {
                                break;
                            }
                            sjb sjbVar = (sjb) it2.next();
                            boolean zContains = ((List) lucVar.element).contains(sjbVar.a);
                            String str = sjbVar.a;
                            String str2 = sjbVar.b;
                            boolean zX = bVar2.x(list3);
                            Object objV6 = bVar2.v();
                            b.a.C0020a c0020a4 = c0020a3;
                            if (zX || objV6 == c0020a4) {
                                objV6 = new qa3(i4, list3, g4aVar3);
                                bVar2.p(objV6);
                            }
                            o32.b(zContains, (Function2) objV6, str2, str, null, null, null, bVar2, 0, 496);
                            arrayList3.add(j6g.a);
                            c0020a3 = c0020a4;
                        }
                        b.a.C0020a c0020a5 = c0020a3;
                        bVar2.F();
                        bVar2.q();
                        g4a g4aVar4 = g4aVar2;
                        if (((Boolean) g4aVar4.getValue()).booleanValue()) {
                            bVar2.L(-1919700687);
                            ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-tab-edit-language", "confirmation-alert", sp7.c.a.a, null, null, 24));
                            Object objV7 = bVar2.v();
                            if (objV7 == c0020a5) {
                                objV7 = new qu(4, g4aVar4);
                                bVar2.p(objV7);
                            }
                            gu5 gu5Var3 = (gu5) objV7;
                            gu5 gu5Var4 = gu5Var;
                            boolean zK = bVar2.K(gu5Var4);
                            Object objV8 = bVar2.v();
                            if (zK || objV8 == c0020a5) {
                                objV8 = new ro2(9, gu5Var4, g4aVar4);
                                bVar2.p(objV8);
                            }
                            r03.e(gu5Var3, (gu5) objV8, bVar2, 6);
                        } else {
                            bVar2.L(-1924703281);
                        }
                        bVar2.F();
                        if (b5gVar == b5g.c) {
                            bVar2.L(-1919140114);
                            ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-preferences-tab-remote-preference", "error-toast", sp7.c.a.c, null, null, 24));
                            Function1 function12 = function1;
                            boolean zK2 = bVar2.K(function12);
                            Object objV9 = bVar2.v();
                            if (zK2 || objV9 == c0020a5) {
                                i3 = 0;
                                objV9 = new f1d(function12, g4aVar3, 0);
                                bVar2.p(objV9);
                            } else {
                                i3 = 0;
                            }
                            rg0.a((gu5) objV9, bVar2, i3);
                            bVar2.F();
                        } else {
                            bVar2.L(-1918600497);
                            jh2.f(bVar2, g.h(aVar, v1c.d));
                            bVar2.F();
                        }
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVar, (i2 << 12) & 234881024, 196608, 32504);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new te(list, arrayList, gu5Var, function1, b5gVar, i, 4);
        }
    }

    public static final List<sjb> b() {
        return a;
    }
}
