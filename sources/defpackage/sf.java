package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.navigation.d;
import androidx.navigation.s;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class sf {
    public static final void a(final boolean z, final List list, final Function1 function1, final Function1 function12, final gu5 gu5Var, final b5g b5gVar, final hw9 hw9Var, final hz1 hz1Var, b bVar, final int i) {
        int i2;
        int i3;
        final iba ibaVar;
        String str;
        ig3 ig3Var;
        list.getClass();
        function1.getClass();
        function12.getClass();
        gu5Var.getClass();
        b5gVar.getClass();
        c cVarH = bVar.h(-1813236394);
        int i4 = i | (cVarH.a(z) ? 4 : 2) | (cVarH.x(list) ? 32 : 16) | (cVarH.x(function1) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(function12) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(gu5Var) ? 16384 : 8192) | (cVarH.d(b5gVar.ordinal()) ? 131072 : 65536) | (cVarH.x(hw9Var) ? 1048576 : 524288) | (cVarH.K(hz1Var) ? 8388608 : 4194304);
        if (cVarH.o(i4 & 1, (4793491 & i4) != 4793490)) {
            if (z) {
                i2 = -321303471;
                i3 = R.string.edit_certification;
            } else {
                i2 = -321239022;
                i3 = R.string.add_certification;
            }
            final String strK = z3.k(cVarH, i2, i3, cVarH, false);
            Object objV = cVarH.v();
            String str2 = "";
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                String str3 = hz1Var != null ? hz1Var.b : null;
                if (str3 == null) {
                    str3 = "";
                }
                objV = r.f(str3);
                cVarH.p(objV);
            }
            final g4a g4aVar = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                if (hz1Var == null || (ig3Var = hz1Var.c) == null) {
                    ig3Var = v1c.b;
                }
                objV2 = r.f(ig3Var);
                cVarH.p(objV2);
            }
            final g4a g4aVar2 = (g4a) objV2;
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                if (hz1Var != null && (str = hz1Var.d) != null) {
                    str2 = str;
                }
                objV3 = r.f(str2);
                cVarH.p(objV3);
            }
            final g4a g4aVar3 = (g4a) objV3;
            iba ibaVarB = q92.B(new s[0], cVarH);
            boolean zX = cVarH.x(ibaVarB);
            Object objV4 = cVarH.v();
            if (zX || objV4 == c0020a) {
                objV4 = new se(ibaVarB, 0);
                cVarH.p(objV4);
            }
            to4.b(ibaVarB, (Function1) objV4, cVarH);
            boolean zK = ((i4 & 896) == 256) | cVarH.K(strK) | cVarH.x(list) | ((57344 & i4) == 16384) | cVarH.x(ibaVarB) | ((3670016 & i4) == 1048576 || cVarH.x(hw9Var)) | ((i4 & 7168) == 2048) | ((458752 & i4) == 131072);
            Object objV5 = cVarH.v();
            if (zK || objV5 == c0020a) {
                ibaVar = ibaVarB;
                Function1 function13 = new Function1() { // from class: cf
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        gba gbaVar = (gba) obj;
                        gbaVar.getClass();
                        final String str4 = strK;
                        final List list2 = list;
                        final Function1 function14 = function1;
                        final gu5 gu5Var2 = gu5Var;
                        final iba ibaVar2 = ibaVar;
                        final hw9 hw9Var2 = hw9Var;
                        final g4a g4aVar4 = g4aVar;
                        hba.a(gbaVar, "TITLE", new ah2(-1311129671, new xu5() { // from class: kf
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                b bVar2 = (b) obj4;
                                ((Integer) obj5).getClass();
                                ((bd0) obj2).getClass();
                                ((d) obj3).getClass();
                                rz1 rz1Var = rz1.a;
                                String strI = ak2.I(rz1Var.a(), bVar2);
                                String strI2 = ak2.I(R.string.subtext_certification_title, bVar2);
                                g4a g4aVar5 = g4aVar4;
                                String str5 = (String) g4aVar5.getValue();
                                float fB = i3c.b(rz1Var.c(), wh.c);
                                Function1 function15 = function14;
                                boolean zK2 = bVar2.K(function15);
                                Object objV6 = bVar2.v();
                                int i5 = 0;
                                b.a.C0020a c0020a2 = b.a.a;
                                if (zK2 || objV6 == c0020a2) {
                                    objV6 = new ze(function15, i5);
                                    bVar2.p(objV6);
                                }
                                Function1 function16 = (Function1) objV6;
                                gu5 gu5Var3 = gu5Var2;
                                boolean zK3 = bVar2.K(gu5Var3);
                                Object objV7 = bVar2.v();
                                if (zK3 || objV7 == c0020a2) {
                                    objV7 = new af(i5, gu5Var3);
                                    bVar2.p(objV7);
                                }
                                gu5 gu5Var4 = (gu5) objV7;
                                iba ibaVar3 = ibaVar2;
                                boolean zX2 = bVar2.x(ibaVar3);
                                Object objV8 = bVar2.v();
                                if (zX2 || objV8 == c0020a2) {
                                    objV8 = new bf(i5, ibaVar3, g4aVar5);
                                    bVar2.p(objV8);
                                }
                                Float fValueOf = Float.valueOf(fB);
                                e51.b(str4, strI, strI2, null, true, false, str5, list2, function16, gu5Var4, (Function1) objV8, null, null, fValueOf, null, hw9Var2, R.string.next_button_label, null, null, false, false, bVar2, 221184, 262528, 1984520);
                                return j6g.a;
                            }
                        }, true));
                        final g4a g4aVar5 = g4aVar2;
                        hba.a(gbaVar, "TIME_PERIOD", new ah2(-2117844112, new xu5() { // from class: lf
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                b bVar2 = (b) obj4;
                                s6.g((Integer) obj5, (bd0) obj2, (d) obj3);
                                j6g j6gVar = j6g.a;
                                Object objV6 = bVar2.v();
                                int i5 = 0;
                                b.a.C0020a c0020a2 = b.a.a;
                                if (objV6 == c0020a2) {
                                    objV6 = new ue(i5);
                                    bVar2.p(objV6);
                                }
                                to4.b(j6gVar, (Function1) objV6, bVar2);
                                g4a g4aVar6 = g4aVar5;
                                ig3 ig3Var2 = (ig3) g4aVar6.getValue();
                                Object objV7 = bVar2.v();
                                if (objV7 == c0020a2) {
                                    objV7 = new ve(i5, g4aVar6);
                                    bVar2.p(objV7);
                                }
                                Function1 function15 = (Function1) objV7;
                                iba ibaVar3 = ibaVar2;
                                boolean zX2 = bVar2.x(ibaVar3);
                                Object objV8 = bVar2.v();
                                if (zX2 || objV8 == c0020a2) {
                                    objV8 = new we(ibaVar3, i5);
                                    bVar2.p(objV8);
                                }
                                gu5 gu5Var3 = (gu5) objV8;
                                boolean zX3 = bVar2.x(ibaVar3);
                                Object objV9 = bVar2.v();
                                if (zX3 || objV9 == c0020a2) {
                                    objV9 = new xe(ibaVar3, i5);
                                    bVar2.p(objV9);
                                }
                                gu5 gu5Var4 = (gu5) objV9;
                                boolean zX4 = bVar2.x(ibaVar3);
                                Object objV10 = bVar2.v();
                                if (zX4 || objV10 == c0020a2) {
                                    objV10 = new ye(ibaVar3, i5);
                                    bVar2.p(objV10);
                                }
                                xf.a(str4, ig3Var2, function15, gu5Var2, gu5Var3, gu5Var4, (gu5) objV10, bVar2, 384);
                                return j6gVar;
                            }
                        }, true));
                        final g4a g4aVar6 = g4aVar3;
                        final b5g b5gVar2 = b5gVar;
                        final Function1 function15 = function12;
                        hba.a(gbaVar, "DESCRIPTION", new ah2(430105393, new xu5() { // from class: mf
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                gu5 gu5Var3;
                                b bVar2 = (b) obj4;
                                s6.g((Integer) obj5, (bd0) obj2, (d) obj3);
                                j6g j6gVar = j6g.a;
                                Object objV6 = bVar2.v();
                                b.a.C0020a c0020a2 = b.a.a;
                                if (objV6 == c0020a2) {
                                    objV6 = new nf(0);
                                    bVar2.p(objV6);
                                }
                                to4.b(j6gVar, (Function1) objV6, bVar2);
                                float fB = i3c.b(rz1.c.c(), wh.c);
                                g4a g4aVar7 = g4aVar4;
                                boolean zU = zve.U((String) g4aVar7.getValue());
                                Function1 function16 = function15;
                                g4a g4aVar8 = g4aVar6;
                                g4a g4aVar9 = g4aVar5;
                                if (zU) {
                                    bVar2.L(1383567205);
                                    bVar2.F();
                                    gu5Var3 = null;
                                } else {
                                    bVar2.L(1383004431);
                                    boolean zK2 = bVar2.K(function16);
                                    Object objV7 = bVar2.v();
                                    if (zK2 || objV7 == c0020a2) {
                                        of ofVar = new of(function16, g4aVar7, g4aVar8, g4aVar9, 0);
                                        bVar2.p(ofVar);
                                        objV7 = ofVar;
                                    }
                                    gu5Var3 = (gu5) objV7;
                                    bVar2.F();
                                }
                                gu5 gu5Var4 = gu5Var3;
                                gu5 gu5Var5 = gu5Var2;
                                boolean zK3 = bVar2.K(gu5Var5);
                                Object objV8 = bVar2.v();
                                int i5 = 1;
                                if (zK3 || objV8 == c0020a2) {
                                    objV8 = new ec(i5, gu5Var5);
                                    bVar2.p(objV8);
                                }
                                gu5 gu5Var6 = (gu5) objV8;
                                iba ibaVar3 = ibaVar2;
                                boolean zX2 = bVar2.x(ibaVar3);
                                Object objV9 = bVar2.v();
                                if (zX2 || objV9 == c0020a2) {
                                    objV9 = new ib(ibaVar3, i5);
                                    bVar2.p(objV9);
                                }
                                Float fValueOf = Float.valueOf(fB);
                                b5g b5gVar3 = b5gVar2;
                                ah2 ah2VarC = bh2.c(1049862447, new te(b5gVar3, function16, g4aVar8, g4aVar7, g4aVar9), bVar2);
                                sb1.a(str4, gu5Var6, gu5Var4, R.string.done_button_label, null, 0, (gu5) objV9, fValueOf, b5gVar3, true, false, false, false, null, 0, ah2VarC, bVar2, 805306368, 196608, 31792);
                                return j6gVar;
                            }
                        }, true));
                        return j6g.a;
                    }
                };
                cVarH.p(function13);
                objV5 = function13;
            } else {
                ibaVar = ibaVarB;
            }
            nba.c(ibaVar, "TITLE", null, null, null, null, null, null, null, null, (Function1) objV5, cVarH, 0, 0, 1020);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z, list, function1, function12, gu5Var, b5gVar, hw9Var, hz1Var, i) { // from class: hf
                public final /* synthetic */ hw9 V;
                public final /* synthetic */ hz1 W;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ List b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ gu5 e;
                public final /* synthetic */ b5g f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(2097153);
                    sf.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final tf b(String str) {
        if (str == null) {
            return null;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == 79833656) {
            if (str.equals("TITLE")) {
                return tf.a;
            }
            return null;
        }
        if (iHashCode == 428414940) {
            if (str.equals("DESCRIPTION")) {
                return tf.c;
            }
            return null;
        }
        if (iHashCode == 1244187507 && str.equals("TIME_PERIOD")) {
            return tf.b;
        }
        return null;
    }

    public static final void c(tf tfVar) {
        dg3.i(dg3.b(rxb.a, "profile-tab-add-certification", tfVar, null, 8));
    }
}
