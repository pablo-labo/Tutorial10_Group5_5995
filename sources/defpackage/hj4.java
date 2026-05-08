package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.navigation.d;
import androidx.navigation.s;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class hj4 {

    public static final class a implements l74 {
        public final /* synthetic */ iba a;
        public final /* synthetic */ zq b;

        public a(iba ibaVar, zq zqVar) {
            this.a = ibaVar;
            this.b = zqVar;
        }

        @Override // defpackage.l74
        public final void dispose() {
            iba ibaVar = this.a;
            ibaVar.getClass();
            ibaVar.q.remove(this.b);
        }
    }

    public static final class b implements l74 {
        @Override // defpackage.l74
        public final void dispose() {
            dg3.i(dg3.b(rxb.a, "profile-tab-edit-language", qj4.b, null, 8));
        }
    }

    public static final void a(final List<wj8> list, final t41 t41Var, final Function1<? super wj8, j6g> function1, final gu5<j6g> gu5Var, final Function1<? super String, j6g> function12, final b5g b5gVar, final hw9 hw9Var, String str, wj8 wj8Var, androidx.compose.runtime.b bVar, int i) {
        c cVar;
        c cVar2;
        final iba ibaVar;
        list.getClass();
        t41Var.getClass();
        function1.getClass();
        gu5Var.getClass();
        function12.getClass();
        b5gVar.getClass();
        c cVarH = bVar.h(-1149097056);
        int i2 = i | (cVarH.x(list) ? 4 : 2) | (cVarH.x(t41Var) ? 32 : 16) | (cVarH.x(function1) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(function12) ? 16384 : 8192) | (cVarH.d(b5gVar.ordinal()) ? 131072 : 65536) | (cVarH.x(hw9Var) ? 1048576 : 524288) | (cVarH.K(str) ? 8388608 : 4194304) | (cVarH.K(wj8Var) ? 67108864 : 33554432);
        if (cVarH.o(i2 & 1, (38347923 & i2) != 38347922)) {
            final String strI = ak2.I(R.string.edit_language, cVarH);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(str == null ? "" : str);
                cVarH.p(objV);
            }
            final g4a g4aVar = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                String str2 = wj8Var != null ? wj8Var.b : null;
                objV2 = r.f(str2 != null ? str2 : "");
                cVarH.p(objV2);
            }
            final g4a g4aVar2 = (g4a) objV2;
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = r.f(wj8Var != null ? wj8Var.c : null);
                cVarH.p(objV3);
            }
            final g4a g4aVar3 = (g4a) objV3;
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                objV4 = r.f(wj8Var != null ? wj8Var.d : null);
                cVarH.p(objV4);
            }
            final g4a g4aVar4 = (g4a) objV4;
            Object objV5 = cVarH.v();
            if (objV5 == c0020a) {
                objV5 = r.f(wj8Var != null ? wj8Var.e : null);
                cVarH.p(objV5);
            }
            final g4a g4aVar5 = (g4a) objV5;
            iba ibaVarB = q92.B(new s[0], cVarH);
            boolean zX = cVarH.x(ibaVarB);
            Object objV6 = cVarH.v();
            if (zX || objV6 == c0020a) {
                objV6 = new et(ibaVarB, 1);
                cVarH.p(objV6);
            }
            to4.b(ibaVarB, (Function1) objV6, cVarH);
            boolean zK = cVarH.K(strI) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256) | ((57344 & i2) == 16384) | cVarH.x(list) | cVarH.x(ibaVarB) | ((458752 & i2) == 131072) | cVarH.x(t41Var) | ((i2 & 3670016) == 1048576 || cVarH.x(hw9Var));
            Object objV7 = cVarH.v();
            if (zK || objV7 == c0020a) {
                cVar2 = cVarH;
                ibaVar = ibaVarB;
                Function1 function13 = new Function1() { // from class: fj4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        gba gbaVar = (gba) obj;
                        gbaVar.getClass();
                        final gu5 gu5Var2 = gu5Var;
                        final g4a g4aVar6 = g4aVar;
                        final g4a g4aVar7 = g4aVar2;
                        final g4a g4aVar8 = g4aVar3;
                        final g4a g4aVar9 = g4aVar4;
                        final g4a g4aVar10 = g4aVar5;
                        final iba ibaVar2 = ibaVar;
                        final b5g b5gVar2 = b5gVar;
                        final String str3 = strI;
                        final List list2 = list;
                        final Function1 function14 = function1;
                        final Function1 function15 = function12;
                        hba.a(gbaVar, "LANGUAGE_EDIT_HOME", new ah2(2110803139, new xu5() { // from class: gj4
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                final gu5 gu5Var3;
                                Object next;
                                String str4;
                                b bVar2 = (b) obj4;
                                ((Integer) obj5).getClass();
                                ((bd0) obj2).getClass();
                                ((d) obj3).getClass();
                                gu5 gu5Var4 = gu5Var2;
                                boolean zK2 = bVar2.K(gu5Var4);
                                Object objV8 = bVar2.v();
                                final g4a g4aVar11 = g4aVar6;
                                final g4a g4aVar12 = g4aVar7;
                                final g4a g4aVar13 = g4aVar8;
                                final g4a g4aVar14 = g4aVar9;
                                b.a.C0020a c0020a2 = b.a.a;
                                if (zK2 || objV8 == c0020a2) {
                                    gu5Var3 = gu5Var4;
                                    gu5 gu5Var5 = new gu5() { // from class: dj4
                                        @Override // defpackage.gu5
                                        public final Object invoke() {
                                            g4aVar11.setValue("");
                                            g4aVar12.setValue("");
                                            g4aVar13.setValue("");
                                            g4aVar14.setValue("");
                                            gu5Var3.invoke();
                                            return j6g.a;
                                        }
                                    };
                                    bVar2.p(gu5Var5);
                                    objV8 = gu5Var5;
                                } else {
                                    gu5Var3 = gu5Var4;
                                }
                                gu5 gu5Var6 = (gu5) objV8;
                                Function1 function16 = function14;
                                boolean zK3 = bVar2.K(function16);
                                Object objV9 = bVar2.v();
                                if (zK3 || objV9 == c0020a2) {
                                    objV9 = new ej4(function16, 0);
                                    bVar2.p(objV9);
                                }
                                Function1 function17 = (Function1) objV9;
                                Function1 function18 = function15;
                                boolean zK4 = bVar2.K(function18);
                                Object objV10 = bVar2.v();
                                if (zK4 || objV10 == c0020a2) {
                                    objV10 = new t9(function18, 1);
                                    bVar2.p(objV10);
                                }
                                Function1 function19 = (Function1) objV10;
                                Iterator it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    if (wl7.b(((wj8) next).a, (String) g4aVar11.getValue())) {
                                        break;
                                    }
                                }
                                wj8 wj8Var2 = (wj8) next;
                                if (wj8Var2 == null) {
                                    wj8Var2 = new wj8(63, (String) null, (String) null, (String) null, (String) null, (String) null);
                                }
                                String str5 = (String) g4aVar12.getValue();
                                String str6 = (String) g4aVar13.getValue();
                                String str7 = (String) g4aVar14.getValue();
                                g4a g4aVar15 = g4aVar10;
                                String str8 = (String) g4aVar15.getValue();
                                Object objV11 = bVar2.v();
                                if (objV11 == c0020a2) {
                                    str4 = str5;
                                    objV11 = new ks(g4aVar12, g4aVar13, 1);
                                    bVar2.p(objV11);
                                } else {
                                    str4 = str5;
                                }
                                Function1 function110 = (Function1) objV11;
                                iba ibaVar3 = ibaVar2;
                                boolean zX2 = bVar2.x(ibaVar3);
                                Object objV12 = bVar2.v();
                                if (zX2 || objV12 == c0020a2) {
                                    objV12 = new nd(ibaVar3, 7);
                                    bVar2.p(objV12);
                                }
                                gu5 gu5Var7 = (gu5) objV12;
                                Object objV13 = bVar2.v();
                                if (objV13 == c0020a2) {
                                    objV13 = new gt(g4aVar14, g4aVar15);
                                    bVar2.p(objV13);
                                }
                                wj8 wj8Var3 = wj8Var2;
                                pj4.a(str3, gu5Var6, gu5Var3, function17, function19, wj8Var3, str4, str6, str7, str8, function110, gu5Var7, (Function2) objV13, b5gVar2, bVar2, 0);
                                return j6g.a;
                            }
                        }, true));
                        hba.a(gbaVar, "LANGUAGE_NAME", new ah2(-1351449542, new ag4(t41Var, str3, gu5Var2, ibaVar2, hw9Var, g4aVar7, g4aVar8), true));
                        return j6g.a;
                    }
                };
                cVar2.p(function13);
                objV7 = function13;
            } else {
                cVar2 = cVarH;
                ibaVar = ibaVarB;
            }
            cVar = cVar2;
            nba.c(ibaVar, "LANGUAGE_EDIT_HOME", null, null, null, null, null, null, null, null, (Function1) objV7, cVar, 0, 0, 1020);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new yf4(list, t41Var, function1, gu5Var, function12, b5gVar, hw9Var, str, wj8Var, i);
        }
    }
}
