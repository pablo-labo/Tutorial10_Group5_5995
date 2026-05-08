package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.navigation.s;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class st {

    public static final class a implements l74 {
        public final /* synthetic */ iba a;
        public final /* synthetic */ rt b;

        public a(iba ibaVar, rt rtVar) {
            this.a = ibaVar;
            this.b = rtVar;
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
            st.c(tt.b);
        }
    }

    public static final class c implements l74 {
        @Override // defpackage.l74
        public final void dispose() {
            st.c(tt.c);
        }
    }

    public static final class d implements l74 {
        @Override // defpackage.l74
        public final void dispose() {
            st.c(tt.e);
        }
    }

    public static final class e implements l74 {
        @Override // defpackage.l74
        public final void dispose() {
            st.c(tt.d);
        }
    }

    public static final void a(final Function1<? super av8, j6g> function1, final gu5<j6g> gu5Var, final b5g b5gVar, androidx.compose.runtime.b bVar, int i) {
        Object obj;
        iba ibaVar;
        function1.getClass();
        gu5Var.getClass();
        b5gVar.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(-126502825);
        int i2 = i | (cVarH.x(function1) ? 4 : 2) | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.d(b5gVar.ordinal()) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        int i3 = 0;
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            final iba ibaVarB = q92.B(new s[0], cVarH);
            boolean zX = cVarH.x(ibaVarB);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new et(ibaVarB, i3);
                cVarH.p(objV);
            }
            to4.b(ibaVarB, (Function1) objV, cVarH);
            final String strI = ak2.I(R.string.add_nursing_license, cVarH);
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
            boolean zK = ((i2 & 112) == 32) | cVarH.K(strI) | cVarH.x(ibaVarB) | ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object objV5 = cVarH.v();
            if (zK || objV5 == c0020a) {
                obj = new Function1() { // from class: ht
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        gba gbaVar = (gba) obj2;
                        gbaVar.getClass();
                        final String str = strI;
                        final gu5 gu5Var2 = gu5Var;
                        final iba ibaVar2 = ibaVarB;
                        final b5g b5gVar2 = b5gVar;
                        final g4a g4aVar4 = g4aVar;
                        hba.a(gbaVar, "TITLE", new ah2(-25650220, new ph(str, gu5Var2, ibaVar2, b5gVar2, g4aVar4, 1), true));
                        final g4a g4aVar5 = g4aVar3;
                        hba.a(gbaVar, "LOCATION", new ah2(2138610301, new qh(str, gu5Var2, ibaVar2, b5gVar2, g4aVar5), true));
                        final g4a g4aVar6 = g4aVar2;
                        final Function1 function12 = function1;
                        hba.a(gbaVar, "TIME_PERIOD", new ah2(481502044, new xu5() { // from class: qt
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
                            @Override // defpackage.xu5
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final java.lang.Object j(java.lang.Object r24, java.lang.Object r25, java.lang.Object r26, java.lang.Object r27) {
                                /*
                                    Method dump skipped, instruction units count: 249
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.qt.j(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                            }
                        }, true));
                        hba.a(gbaVar, "STATE_SELECTOR", new ah2(-1175606213, new sh(ibaVar2, g4aVar5, 1), true));
                        hba.a(gbaVar, "LICENSE_TYPE_SELECTOR", new ah2(1462252826, new th(ibaVar2, g4aVar4, 1), true));
                        return j6g.a;
                    }
                };
                ibaVar = ibaVarB;
                cVarH.p(obj);
            } else {
                obj = objV5;
                ibaVar = ibaVarB;
            }
            nba.c(ibaVar, "TITLE", null, null, null, null, null, null, null, null, (Function1) obj, cVarH, 0, 0, 1020);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ot(i, 0, gu5Var, function1, b5gVar);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final tt b(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1612138515:
                if (str.equals("STATE_SELECTOR")) {
                    return tt.e;
                }
                return null;
            case -1611296843:
                if (str.equals("LOCATION")) {
                    return tt.b;
                }
                return null;
            case 79833656:
                if (str.equals("TITLE")) {
                    return tt.a;
                }
                return null;
            case 587965350:
                if (str.equals("LICENSE_TYPE_SELECTOR")) {
                    return tt.d;
                }
                return null;
            case 1244187507:
                if (str.equals("TIME_PERIOD")) {
                    return tt.c;
                }
                return null;
            default:
                return null;
        }
    }

    public static final void c(tt ttVar) {
        dg3.i(dg3.b(rxb.a, "profile-tab-add-accounting-license", ttVar, null, 8));
    }
}
