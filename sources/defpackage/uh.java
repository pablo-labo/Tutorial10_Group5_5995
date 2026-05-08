package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.navigation.d;
import androidx.navigation.s;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class uh {

    public static final class a implements l74 {
        public final /* synthetic */ iba a;
        public final /* synthetic */ de b;

        public a(iba ibaVar, de deVar) {
            this.a = ibaVar;
            this.b = deVar;
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
            uh.c(vh.b);
        }
    }

    public static final class c implements l74 {
        @Override // defpackage.l74
        public final void dispose() {
            uh.c(vh.c);
        }
    }

    public static final class d implements l74 {
        @Override // defpackage.l74
        public final void dispose() {
            uh.c(vh.d);
        }
    }

    public static final class e implements l74 {
        @Override // defpackage.l74
        public final void dispose() {
            uh.c(vh.f);
        }
    }

    public static final class f implements l74 {
        @Override // defpackage.l74
        public final void dispose() {
            uh.c(vh.e);
        }
    }

    public static final void a(final Function1<? super av8, j6g> function1, final gu5<j6g> gu5Var, final b5g b5gVar, androidx.compose.runtime.b bVar, int i) {
        Object obj;
        iba ibaVar;
        function1.getClass();
        gu5Var.getClass();
        b5gVar.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(1399081374);
        int i2 = i | (cVarH.x(function1) ? 4 : 2) | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.d(b5gVar.ordinal()) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        int i3 = 0;
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            final iba ibaVarB = q92.B(new s[0], cVarH);
            boolean zX = cVarH.x(ibaVarB);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new kg(ibaVarB, i3);
                cVarH.p(objV);
            }
            to4.b(ibaVarB, (Function1) objV, cVarH);
            final String strI = ak2.I(R.string.add_driver_license, cVarH);
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
            Object objV5 = cVarH.v();
            if (objV5 == c0020a) {
                objV5 = r.f(zr4.a);
                cVarH.p(objV5);
            }
            final g4a g4aVar4 = (g4a) objV5;
            boolean zK = cVarH.K(strI) | ((i2 & 112) == 32) | cVarH.x(ibaVarB) | ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object objV6 = cVarH.v();
            if (zK || objV6 == c0020a) {
                obj = new Function1() { // from class: tg
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        gba gbaVar = (gba) obj2;
                        gbaVar.getClass();
                        final String str = strI;
                        final gu5 gu5Var2 = gu5Var;
                        final iba ibaVar2 = ibaVarB;
                        final b5g b5gVar2 = b5gVar;
                        final g4a g4aVar5 = g4aVar;
                        hba.a(gbaVar, "TITLE", new ah2(1499933979, new xu5() { // from class: oh
                            @Override // defpackage.xu5
                            public final Object j(Object obj3, Object obj4, Object obj5, Object obj6) {
                                b bVar2 = (b) obj5;
                                ((Integer) obj6).getClass();
                                ((bd0) obj3).getClass();
                                ((d) obj4).getClass();
                                gu5 gu5Var3 = gu5Var2;
                                boolean zK2 = bVar2.K(gu5Var3);
                                Object objV7 = bVar2.v();
                                b.a.C0020a c0020a2 = b.a.a;
                                if (zK2 || objV7 == c0020a2) {
                                    objV7 = new hh(0, gu5Var3);
                                    bVar2.p(objV7);
                                }
                                gu5 gu5Var4 = (gu5) objV7;
                                iba ibaVar3 = ibaVar2;
                                boolean zX2 = bVar2.x(ibaVar3);
                                Object objV8 = bVar2.v();
                                if (zX2 || objV8 == c0020a2) {
                                    objV8 = new ih(ibaVar3, 0);
                                    bVar2.p(objV8);
                                }
                                Float fValueOf = Float.valueOf(i3c.b(wc4.a.c(), wh.i));
                                ah2 ah2VarC = bh2.c(1933563485, new jh(0, ibaVar3, g4aVar5), bVar2);
                                sb1.a(str, gu5Var4, (gu5) objV8, 0, null, 0, null, fValueOf, b5gVar2, false, false, false, false, null, 0, ah2VarC, bVar2, 0, 196608, 32376);
                                return j6g.a;
                            }
                        }, true));
                        final g4a g4aVar6 = g4aVar3;
                        hba.a(gbaVar, "LOCATION", new ah2(-630772796, new ph(str, gu5Var2, ibaVar2, b5gVar2, g4aVar6, 0), true));
                        final g4a g4aVar7 = g4aVar2;
                        hba.a(gbaVar, "TIME_PERIOD", new ah2(2007086243, new qh(ibaVar2, str, gu5Var2, b5gVar2, g4aVar7), true));
                        final g4a g4aVar8 = g4aVar4;
                        final Function1 function12 = function1;
                        hba.a(gbaVar, "ENDORSEMENTS", new ah2(349977986, new xu5() { // from class: rh
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj3, Object obj4, Object obj5, Object obj6) {
                                gu5 gu5Var3;
                                b bVar2 = (b) obj5;
                                s6.g((Integer) obj6, (bd0) obj3, (d) obj4);
                                j6g j6gVar = j6g.a;
                                Object objV7 = bVar2.v();
                                b.a.C0020a c0020a2 = b.a.a;
                                if (objV7 == c0020a2) {
                                    objV7 = new bh(0);
                                    bVar2.p(objV7);
                                }
                                to4.b(j6gVar, (Function1) objV7, bVar2);
                                g4a g4aVar9 = g4aVar5;
                                boolean zU = zve.U((String) g4aVar9.getValue());
                                g4a g4aVar10 = g4aVar8;
                                if (zU) {
                                    bVar2.L(-1984615884);
                                    bVar2.F();
                                    gu5Var3 = null;
                                } else {
                                    bVar2.L(-1985830216);
                                    Function1 function13 = function12;
                                    boolean zK2 = bVar2.K(function13);
                                    Object objV8 = bVar2.v();
                                    if (zK2 || objV8 == c0020a2) {
                                        objV8 = new dh(function13, g4aVar9, g4aVar6, g4aVar7, g4aVar10, 0);
                                        bVar2.p(objV8);
                                    }
                                    gu5Var3 = (gu5) objV8;
                                    bVar2.F();
                                }
                                float fB = i3c.b(wc4.c.c(), wh.i);
                                gu5 gu5Var4 = gu5Var2;
                                boolean zK3 = bVar2.K(gu5Var4);
                                Object objV9 = bVar2.v();
                                if (zK3 || objV9 == c0020a2) {
                                    objV9 = new eh(0, gu5Var4);
                                    bVar2.p(objV9);
                                }
                                gu5 gu5Var5 = (gu5) objV9;
                                iba ibaVar3 = ibaVar2;
                                boolean zX2 = bVar2.x(ibaVar3);
                                Object objV10 = bVar2.v();
                                if (zX2 || objV10 == c0020a2) {
                                    objV10 = new fh(ibaVar3, 0);
                                    bVar2.p(objV10);
                                }
                                Float fValueOf = Float.valueOf(fB);
                                b5g b5gVar3 = b5gVar2;
                                ah2 ah2VarC = bh2.c(456105540, new gh(0, b5gVar3, g4aVar10), bVar2);
                                sb1.a(str, gu5Var5, gu5Var3, 0, null, 0, (gu5) objV10, fValueOf, b5gVar3, true, false, false, false, null, 0, ah2VarC, bVar2, 805306368, 196608, 31800);
                                return j6gVar;
                            }
                        }, true));
                        hba.a(gbaVar, "STATE_SELECTOR", new ah2(-1307130271, new sh(ibaVar2, g4aVar6, 0), true));
                        hba.a(gbaVar, "LICENSE_TYPE_SELECTOR", new ah2(1330728768, new th(ibaVar2, g4aVar5, 0), true));
                        return j6g.a;
                    }
                };
                ibaVar = ibaVarB;
                cVarH.p(obj);
            } else {
                obj = objV6;
                ibaVar = ibaVarB;
            }
            nba.c(ibaVar, "TITLE", null, null, null, null, null, null, null, null, (Function1) obj, cVarH, 0, 0, 1020);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ch(i, 0, function1, gu5Var, b5gVar);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final vh b(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1612138515:
                if (str.equals("STATE_SELECTOR")) {
                    return vh.f;
                }
                return null;
            case -1611296843:
                if (str.equals("LOCATION")) {
                    return vh.b;
                }
                return null;
            case -65933819:
                if (str.equals("ENDORSEMENTS")) {
                    return vh.d;
                }
                return null;
            case 79833656:
                if (str.equals("TITLE")) {
                    return vh.a;
                }
                return null;
            case 587965350:
                if (str.equals("LICENSE_TYPE_SELECTOR")) {
                    return vh.e;
                }
                return null;
            case 1244187507:
                if (str.equals("TIME_PERIOD")) {
                    return vh.c;
                }
                return null;
            default:
                return null;
        }
    }

    public static final void c(vh vhVar) {
        dg3.i(dg3.b(rxb.a, "profile-tab-add-accounting-license", vhVar, null, 8));
    }
}
