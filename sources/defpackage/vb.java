package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.navigation.d;
import androidx.navigation.s;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class vb {

    public static final class a implements l74 {
        public final /* synthetic */ iba a;
        public final /* synthetic */ sb b;

        public a(iba ibaVar, sb sbVar) {
            this.a = ibaVar;
            this.b = sbVar;
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
            vb.c(wb.b);
        }
    }

    public static final class c implements l74 {
        @Override // defpackage.l74
        public final void dispose() {
            vb.c(wb.c);
        }
    }

    public static final class d implements l74 {
        @Override // defpackage.l74
        public final void dispose() {
            vb.c(wb.d);
        }
    }

    public static final void a(final List<g51> list, final Function1<? super String, j6g> function1, final Function1<? super av8, j6g> function12, final gu5<j6g> gu5Var, final b5g b5gVar, final hw9 hw9Var, androidx.compose.runtime.b bVar, int i) {
        iba ibaVar;
        list.getClass();
        function1.getClass();
        function12.getClass();
        gu5Var.getClass();
        b5gVar.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(486041215);
        int i2 = i | (cVarH.x(list) ? 4 : 2) | (cVarH.x(function1) ? 32 : 16) | (cVarH.x(function12) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.d(b5gVar.ordinal()) ? 16384 : 8192) | (cVarH.x(hw9Var) ? 131072 : 65536);
        int i3 = 0;
        if (cVarH.o(i2 & 1, (74899 & i2) != 74898)) {
            final iba ibaVarB = q92.B(new s[0], cVarH);
            boolean zX = cVarH.x(ibaVarB);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new sa(ibaVarB, i3);
                cVarH.p(objV);
            }
            to4.b(ibaVarB, (Function1) objV, cVarH);
            final String strI = ak2.I(R.string.add_accounting_license, cVarH);
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f("");
                cVarH.p(objV2);
            }
            final g4a g4aVar = (g4a) objV2;
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = r.f(v1c.b);
                cVarH.p(objV3);
            }
            final g4a g4aVar2 = (g4a) objV3;
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                objV4 = r.f("");
                cVarH.p(objV4);
            }
            final g4a g4aVar3 = (g4a) objV4;
            boolean zK = cVarH.K(strI) | cVarH.x(list) | ((i2 & 112) == 32) | ((i2 & 7168) == 2048) | cVarH.x(ibaVarB) | ((458752 & i2) == 131072 || cVarH.x(hw9Var)) | ((57344 & i2) == 16384) | ((i2 & 896) == 256);
            Object objV5 = cVarH.v();
            if (zK || objV5 == c0020a) {
                Function1 function13 = new Function1() { // from class: db
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        gba gbaVar = (gba) obj;
                        gbaVar.getClass();
                        final String str = strI;
                        List list2 = list;
                        Function1 function14 = function1;
                        final gu5 gu5Var2 = gu5Var;
                        final iba ibaVar2 = ibaVarB;
                        hw9 hw9Var2 = hw9Var;
                        final g4a g4aVar4 = g4aVar;
                        hba.a(gbaVar, "TITLE", new ah2(-1677019332, new ob(str, list2, function14, gu5Var2, ibaVar2, hw9Var2, g4aVar4), true));
                        final b5g b5gVar2 = b5gVar;
                        final g4a g4aVar5 = g4aVar3;
                        hba.a(gbaVar, "LOCATION", new ah2(-161384923, new xu5() { // from class: pb
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                b bVar2 = (b) obj4;
                                s6.g((Integer) obj5, (bd0) obj2, (d) obj3);
                                j6g j6gVar = j6g.a;
                                Object objV6 = bVar2.v();
                                int i4 = 0;
                                b.a.C0020a c0020a2 = b.a.a;
                                if (objV6 == c0020a2) {
                                    objV6 = new wa(0);
                                    bVar2.p(objV6);
                                }
                                to4.b(j6gVar, (Function1) objV6, bVar2);
                                float fB = i3c.b(jv8.b.c(), wh.h);
                                gu5 gu5Var3 = gu5Var2;
                                boolean zK2 = bVar2.K(gu5Var3);
                                Object objV7 = bVar2.v();
                                if (zK2 || objV7 == c0020a2) {
                                    objV7 = new xa(0, gu5Var3);
                                    bVar2.p(objV7);
                                }
                                gu5 gu5Var4 = (gu5) objV7;
                                iba ibaVar3 = ibaVar2;
                                boolean zX2 = bVar2.x(ibaVar3);
                                Object objV8 = bVar2.v();
                                if (zX2 || objV8 == c0020a2) {
                                    objV8 = new ya(ibaVar3, 0);
                                    bVar2.p(objV8);
                                }
                                gu5 gu5Var5 = (gu5) objV8;
                                boolean zX3 = bVar2.x(ibaVar3);
                                Object objV9 = bVar2.v();
                                g4a g4aVar6 = g4aVar5;
                                if (zX3 || objV9 == c0020a2) {
                                    objV9 = new za(0, ibaVar3, g4aVar6);
                                    bVar2.p(objV9);
                                }
                                gu5 gu5Var6 = (gu5) objV9;
                                boolean zX4 = bVar2.x(ibaVar3);
                                Object objV10 = bVar2.v();
                                if (zX4 || objV10 == c0020a2) {
                                    objV10 = new ab(ibaVar3, 0);
                                    bVar2.p(objV10);
                                }
                                Float fValueOf = Float.valueOf(fB);
                                ah2 ah2VarC = bh2.c(-1201810585, new bb(i4, ibaVar3, g4aVar6), bVar2);
                                sb1.a(str, gu5Var4, gu5Var5, 0, gu5Var6, 0, (gu5) objV10, fValueOf, b5gVar2, true, false, false, false, null, 0, ah2VarC, bVar2, 805306368, 196608, 31784);
                                return j6gVar;
                            }
                        }, true));
                        final g4a g4aVar6 = g4aVar2;
                        final Function1 function15 = function12;
                        hba.a(gbaVar, "TIME_PERIOD", new ah2(-1210756924, new xu5() { // from class: qb
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
                            @Override // defpackage.xu5
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final java.lang.Object j(java.lang.Object r24, java.lang.Object r25, java.lang.Object r26, java.lang.Object r27) {
                                /*
                                    Method dump skipped, instruction units count: 246
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.qb.j(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                            }
                        }, true));
                        hba.a(gbaVar, "STATE_SELECTOR", new ah2(2034838371, new xu5() { // from class: rb
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                b bVar2 = (b) obj4;
                                s6.g((Integer) obj5, (bd0) obj2, (d) obj3);
                                j6g j6gVar = j6g.a;
                                Object objV6 = bVar2.v();
                                b.a.C0020a c0020a2 = b.a.a;
                                if (objV6 == c0020a2) {
                                    objV6 = new gb(0);
                                    bVar2.p(objV6);
                                }
                                to4.b(j6gVar, (Function1) objV6, bVar2);
                                List<String> list3 = p23.a;
                                String strI2 = ak2.I(R.string.state, bVar2);
                                iba ibaVar3 = ibaVar2;
                                boolean zX2 = bVar2.x(ibaVar3);
                                Object objV7 = bVar2.v();
                                if (zX2 || objV7 == c0020a2) {
                                    objV7 = new hb(ibaVar3, g4aVar5, 0);
                                    bVar2.p(objV7);
                                }
                                Function1 function16 = (Function1) objV7;
                                boolean zX3 = bVar2.x(ibaVar3);
                                Object objV8 = bVar2.v();
                                if (zX3 || objV8 == c0020a2) {
                                    objV8 = new ib(ibaVar3, 0);
                                    bVar2.p(objV8);
                                }
                                gu5 gu5Var3 = (gu5) objV8;
                                boolean zX4 = bVar2.x(ibaVar3);
                                Object objV9 = bVar2.v();
                                if (zX4 || objV9 == c0020a2) {
                                    objV9 = new jb(ibaVar3, 0);
                                    bVar2.p(objV9);
                                }
                                tzd.a(list3, strI2, function16, gu5Var3, (gu5) objV9, bVar2, 0);
                                return j6gVar;
                            }
                        }, true));
                        return j6g.a;
                    }
                };
                ibaVar = ibaVarB;
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
            iVarW.d = new nb(list, function1, function12, gu5Var, b5gVar, hw9Var, i);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final wb b(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1612138515:
                if (str.equals("STATE_SELECTOR")) {
                    return wb.d;
                }
                return null;
            case -1611296843:
                if (str.equals("LOCATION")) {
                    return wb.b;
                }
                return null;
            case 79833656:
                if (str.equals("TITLE")) {
                    return wb.a;
                }
                return null;
            case 1244187507:
                if (str.equals("TIME_PERIOD")) {
                    return wb.c;
                }
                return null;
            default:
                return null;
        }
    }

    public static final void c(wb wbVar) {
        dg3.i(dg3.b(rxb.a, "profile-tab-add-accounting-license", wbVar, null, 8));
    }
}
