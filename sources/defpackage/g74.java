package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.jo4;
import defpackage.pm8;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class g74 {
    public static final void a(final Function1 function1, final Locale locale, final svb svbVar, Function2 function2, Function1 function12, b bVar, int i) {
        int i2;
        Function2 function22;
        Function1 function13;
        function1.getClass();
        svbVar.getClass();
        c cVarH = bVar.h(2043190285);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(locale) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(svbVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            function22 = function2;
            i2 |= cVarH.x(function22) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        } else {
            function22 = function2;
        }
        if ((i & 24576) == 0) {
            function13 = function12;
            i2 |= cVarH.x(function13) ? 16384 : 8192;
        } else {
            function13 = function12;
        }
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            String strI = ak2.I(R.string.education_item_title, cVarH);
            String strI2 = ak2.I(R.string.education_item_desc, cVarH);
            boolean z = (i2 & 14) == 4;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new d74(function1, 0);
                cVarH.p(objV);
            }
            final Function2 function23 = function22;
            final Function1 function14 = function13;
            uub.b(strI, strI2, (gu5) objV, null, false, !svbVar.z.isEmpty(), false, bh2.c(846139402, new Function2() { // from class: e74
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    b bVar2 = (b) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i3 = 1;
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
                        bVar2.L(-766181628);
                        for (jo4 jo4Var : svbVar.z.values()) {
                            List<jo4.b> list = jo4Var.c;
                            String str = jo4Var.a;
                            jo4.b bVar3 = (jo4.b) z92.Q0(list);
                            if (v1c.h(bVar3 != null ? bVar3.a : null)) {
                                bVar2.L(-930789270);
                                List<jo4.b> list2 = jo4Var.c;
                                jo4.b bVar4 = (jo4.b) z92.Q0(list2);
                                boolean zH = v1c.h(bVar4 != null ? bVar4.a : null);
                                jo4.b bVar5 = (jo4.b) z92.Q0(list2);
                                boolean z2 = (zH || v1c.h(bVar5 != null ? bVar5.b : null)) ? false : true;
                                Function1 function15 = function1;
                                boolean zK = bVar2.K(function15) | bVar2.x(jo4Var);
                                Object objV2 = bVar2.v();
                                b.a.C0020a c0020a = b.a.a;
                                if (zK || objV2 == c0020a) {
                                    objV2 = new ro2(i3, function15, jo4Var);
                                    bVar2.p(objV2);
                                }
                                gu5 gu5Var = (gu5) objV2;
                                boolean zBooleanValue = ((Boolean) function23.invoke(str, Boolean.valueOf(z2))).booleanValue();
                                Function1 function16 = function14;
                                boolean zK2 = bVar2.K(function16) | bVar2.x(jo4Var);
                                Object objV3 = bVar2.v();
                                if (zK2 || objV3 == c0020a) {
                                    objV3 = new q61(3, function16, jo4Var);
                                    bVar2.p(objV3);
                                }
                                uub.a(gu5Var, zBooleanValue, "EDUCATION", str, (gu5) objV3, bh2.c(2013140210, new tn0(4, jo4Var, locale), bVar2), bVar2, 196608, 0);
                            } else {
                                bVar2.L(-932292646);
                            }
                            bVar2.F();
                        }
                        bVar2.F();
                        bVar2.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, 12582912, 88);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new f74(function1, locale, svbVar, function2, function12, i);
        }
    }
}
