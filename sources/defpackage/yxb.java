package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class yxb implements caa {
    @Override // defpackage.caa
    public final void a(int i, b bVar) {
        int i2;
        c cVar;
        int i3;
        c cVarH = bVar.h(-2092652343);
        if ((i & 6) == 0) {
            i2 = (cVarH.a(true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            aub aubVar = m2c.c;
            if (aubVar == null) {
                i iVarW = cVarH.W();
                if (iVarW != null) {
                    iVarW.d = new t60(this, i);
                    return;
                }
                return;
            }
            e eVarF = g.f(e.a.b, 1.0f);
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarF);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
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
            int i4 = i2;
            vsb vsbVarL = aubVar.l();
            tzc tzcVarM = aubVar.m();
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            int i5 = 12;
            if (objV == c0020a) {
                objV = new dp0(12);
                cVarH.p(objV);
            }
            gu5 gu5Var = (gu5) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = new pl0(11);
                cVarH.p(objV2);
            }
            gu5 gu5Var2 = (gu5) objV2;
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = new ao0(16);
                cVarH.p(objV3);
            }
            gu5 gu5Var3 = (gu5) objV3;
            Object objV4 = cVarH.v();
            int i6 = 18;
            if (objV4 == c0020a) {
                objV4 = new bo0(18);
                cVarH.p(objV4);
            }
            gu5 gu5Var4 = (gu5) objV4;
            Object objV5 = cVarH.v();
            if (objV5 == c0020a) {
                objV5 = new vm1(i6);
                cVarH.p(objV5);
            }
            gu5 gu5Var5 = (gu5) objV5;
            Object objV6 = cVarH.v();
            if (objV6 == c0020a) {
                objV6 = new pd1(17);
                cVarH.p(objV6);
            }
            gu5 gu5Var6 = (gu5) objV6;
            Object objV7 = cVarH.v();
            if (objV7 == c0020a) {
                objV7 = new jr(21);
                cVarH.p(objV7);
            }
            gu5 gu5Var7 = (gu5) objV7;
            Object objV8 = cVarH.v();
            if (objV8 == c0020a) {
                objV8 = new kr(i5);
                cVarH.p(objV8);
            }
            gu5 gu5Var8 = (gu5) objV8;
            Object objV9 = cVarH.v();
            if (objV9 == c0020a) {
                objV9 = new fc2(11);
                cVarH.p(objV9);
            }
            i3 = 1;
            klb.b(vsbVarL, tzcVarM, gu5Var, gu5Var2, gu5Var3, gu5Var4, gu5Var5, gu5Var6, gu5Var7, gu5Var8, (gu5) objV9, false, false, true, cVarH, 920350080, ((i4 << 9) & 7168) | 6);
            cVar = cVarH;
            cVar.U(true);
        } else {
            cVar = cVarH;
            i3 = 1;
            cVar.D();
        }
        i iVarW2 = cVar.W();
        if (iVarW2 != null) {
            iVarW2.d = new gl1(this, i, i3);
        }
    }

    @Override // defpackage.caa
    public final boolean b() {
        return m2c.c != null;
    }

    @Override // defpackage.caa
    public final void c(final int i, b bVar) {
        int i2;
        c cVar;
        int i3;
        int i4;
        gu5 gu5Var;
        Function1 function1;
        Function1 function12;
        Function1 function13;
        Function1 function14;
        gu5 gu5Var2;
        gu5 gu5Var3;
        gu5 gu5Var4;
        Function1 function15;
        Function1 function16;
        b.a.C0020a c0020a = b.a.a;
        c cVarH = bVar.h(594709560);
        if ((i & 6) == 0) {
            i2 = (cVarH.a(true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            x1c x1cVar = m2c.a;
            if (x1cVar == null) {
                i iVarW = cVarH.W();
                if (iVarW != null) {
                    iVarW.d = new Function2() { // from class: txb
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iL = ka2.L(i | 1);
                            this.a.c(iL, (b) obj);
                            return j6g.a;
                        }
                    };
                    return;
                }
                return;
            }
            yvb yvbVar = m2c.b;
            if (yvbVar == null) {
                i iVarW2 = cVarH.W();
                if (iVarW2 != null) {
                    iVarW2.d = new Function2() { // from class: uxb
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iL = ka2.L(i | 1);
                            this.a.c(iL, (b) obj);
                            return j6g.a;
                        }
                    };
                    return;
                }
                return;
            }
            Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            r8 r8Var = new r8();
            boolean zX = cVarH.x(x1cVar) | cVarH.x(context);
            Object objV = cVarH.v();
            if (zX || objV == c0020a) {
                objV = new ed1(6, x1cVar, context);
                cVarH.p(objV);
            }
            ra9 ra9VarL = ypd.L(r8Var, (Function1) objV, cVarH);
            Locale localeE = nn2.E(x1cVar.d);
            svb svbVarV = yvbVar.v();
            boolean z = x1cVar.o().i;
            boolean zX2 = cVarH.x(ra9VarL);
            Object objV2 = cVarH.v();
            int i5 = 20;
            if (zX2 || objV2 == c0020a) {
                objV2 = new nj(ra9VarL, i5);
                cVarH.p(objV2);
            }
            gu5 gu5Var5 = (gu5) objV2;
            Object objV3 = cVarH.v();
            int i6 = 12;
            if (objV3 == c0020a) {
                objV3 = new j7(i6);
                cVarH.p(objV3);
            }
            gu5 gu5Var6 = (gu5) objV3;
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                objV4 = new k7(14);
                cVarH.p(objV4);
            }
            gu5 gu5Var7 = (gu5) objV4;
            Object objV5 = cVarH.v();
            int i7 = 16;
            if (objV5 == c0020a) {
                objV5 = new l7(i7);
                cVarH.p(objV5);
            }
            gu5 gu5Var8 = (gu5) objV5;
            Object objV6 = cVarH.v();
            int i8 = 13;
            if (objV6 == c0020a) {
                objV6 = new ue(i8);
                cVarH.p(objV6);
            }
            Function1 function17 = (Function1) objV6;
            Object objV7 = cVarH.v();
            int i9 = 9;
            if (objV7 == c0020a) {
                objV7 = new bh(i9);
                cVarH.p(objV7);
            }
            Function1 function18 = (Function1) objV7;
            Object objV8 = cVarH.v();
            if (objV8 == c0020a) {
                objV8 = new zw(i5);
                cVarH.p(objV8);
            }
            gu5 gu5Var9 = (gu5) objV8;
            Object objV9 = cVarH.v();
            if (objV9 == c0020a) {
                i4 = i2;
                objV9 = new kd(15);
                cVarH.p(objV9);
            } else {
                i4 = i2;
            }
            Function1 function19 = (Function1) objV9;
            Object objV10 = cVarH.v();
            if (objV10 == c0020a) {
                gu5Var = gu5Var8;
                objV10 = new lt(5);
                cVarH.p(objV10);
            } else {
                gu5Var = gu5Var8;
            }
            Function1 function110 = (Function1) objV10;
            Object objV11 = cVarH.v();
            int i10 = 11;
            if (objV11 == c0020a) {
                objV11 = new rg(i10);
                cVarH.p(objV11);
            }
            Function1 function111 = (Function1) objV11;
            Object objV12 = cVarH.v();
            int i11 = 7;
            if (objV12 == c0020a) {
                objV12 = new gb(i11);
                cVarH.p(objV12);
            }
            Function1 function112 = (Function1) objV12;
            Object objV13 = cVarH.v();
            if (objV13 == c0020a) {
                function1 = function112;
                objV13 = new zg(7);
                cVarH.p(objV13);
            } else {
                function1 = function112;
            }
            Function1 function113 = (Function1) objV13;
            Object objV14 = cVarH.v();
            if (objV14 == c0020a) {
                function12 = function113;
                objV14 = new od2(7);
                cVarH.p(objV14);
            } else {
                function12 = function113;
            }
            Function1 function114 = (Function1) objV14;
            Object objV15 = cVarH.v();
            if (objV15 == c0020a) {
                function13 = function114;
                objV15 = new mc(9);
                cVarH.p(objV15);
            } else {
                function13 = function114;
            }
            Function1 function115 = (Function1) objV15;
            Object objV16 = cVarH.v();
            if (objV16 == c0020a) {
                function14 = function115;
                objV16 = new n7(8);
                cVarH.p(objV16);
            } else {
                function14 = function115;
            }
            gu5 gu5Var10 = (gu5) objV16;
            Object objV17 = cVarH.v();
            if (objV17 == c0020a) {
                gu5Var2 = gu5Var10;
                objV17 = new o7(13);
                cVarH.p(objV17);
            } else {
                gu5Var2 = gu5Var10;
            }
            gu5 gu5Var11 = (gu5) objV17;
            Object objV18 = cVarH.v();
            if (objV18 == c0020a) {
                gu5Var3 = gu5Var11;
                objV18 = new kr(11);
                cVarH.p(objV18);
            } else {
                gu5Var3 = gu5Var11;
            }
            gu5 gu5Var12 = (gu5) objV18;
            Object objV19 = cVarH.v();
            if (objV19 == c0020a) {
                gu5Var4 = gu5Var12;
                objV19 = new vy2(12);
                cVarH.p(objV19);
            } else {
                gu5Var4 = gu5Var12;
            }
            gu5 gu5Var13 = (gu5) objV19;
            Object objV20 = cVarH.v();
            int i12 = 10;
            if (objV20 == c0020a) {
                objV20 = new rg(i12);
                cVarH.p(objV20);
            }
            Function1 function116 = (Function1) objV20;
            Object objV21 = cVarH.v();
            if (objV21 == c0020a) {
                function15 = function116;
                function16 = function17;
                objV21 = new gm0(10, (byte) 0);
                cVarH.p(objV21);
            } else {
                function15 = function116;
                function16 = function17;
            }
            Function2 function2 = (Function2) objV21;
            Object objV22 = cVarH.v();
            if (objV22 == c0020a) {
                objV22 = new nf(22);
                cVarH.p(objV22);
            }
            Function1 function117 = (Function1) objV22;
            boolean zX3 = cVarH.x(yvbVar);
            Object objV23 = cVarH.v();
            if (zX3 || objV23 == c0020a) {
                objV23 = new k1(yvbVar, 12);
                cVarH.p(objV23);
            }
            Function1 function118 = (Function1) objV23;
            boolean zX4 = cVarH.x(yvbVar) | cVarH.x(x1cVar);
            Object objV24 = cVarH.v();
            if (zX4 || objV24 == c0020a) {
                objV24 = new bb(2, yvbVar, x1cVar);
                cVarH.p(objV24);
            }
            Function2 function22 = (Function2) objV24;
            boolean zX5 = cVarH.x(yvbVar);
            Object objV25 = cVarH.v();
            if (zX5 || objV25 == c0020a) {
                objV25 = new me(yvbVar, 16);
                cVarH.p(objV25);
            }
            Function1 function119 = function16;
            i3 = 2;
            Function1 function120 = function14;
            gu5 gu5Var14 = gu5Var3;
            Function1 function121 = function1;
            gu5 gu5Var15 = gu5Var;
            cVar = cVarH;
            qxb.h(gu5Var5, gu5Var6, gu5Var7, false, gu5Var15, function119, function18, gu5Var9, function19, function110, function111, function121, function12, function13, function120, gu5Var2, gu5Var14, gu5Var4, gu5Var13, function15, function2, function117, function118, localeE, svbVarV, z, true, function22, (Function1) objV25, cVar, 920350128, 920350134, ((i4 << 18) & 3670016) | 54);
        } else {
            cVar = cVarH;
            i3 = 2;
            cVar.D();
        }
        i iVarW3 = cVar.W();
        if (iVarW3 != null) {
            iVarW3.d = new ns4(this, i, i3);
        }
    }

    @Override // defpackage.caa
    public final boolean d() {
        return (m2c.a == null || m2c.b == null) ? false : true;
    }

    public final void e(int i, gu5 gu5Var, b bVar, Function1 function1) {
        boolean z;
        Object obj;
        b.a.C0020a c0020a = b.a.a;
        function1.getClass();
        gu5Var.getClass();
        c cVarH = bVar.h(351043999);
        int i2 = (cVarH.x(gu5Var) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | i;
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            x1c x1cVar = m2c.a;
            if (x1cVar == null) {
                i iVarW = cVarH.W();
                if (iVarW != null) {
                    iVarW.d = new psb(this, function1, gu5Var, i);
                    return;
                }
                return;
            }
            p9d p9dVar = m2c.d;
            if (p9dVar == null) {
                i iVarW2 = cVarH.W();
                if (iVarW2 != null) {
                    iVarW2.d = new vxb(this, function1, gu5Var, i);
                    return;
                }
                return;
            }
            Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            r8 r8Var = new r8();
            boolean zX = cVarH.x(x1cVar) | cVarH.x(context);
            Object objV = cVarH.v();
            Object obj2 = objV;
            if (zX || objV == c0020a) {
                mz4 mz4Var = new mz4(4, x1cVar, context);
                cVarH.p(mz4Var);
                obj2 = mz4Var;
            }
            ra9 ra9VarL = ypd.L(r8Var, (Function1) obj2, cVarH);
            String[] strArr = {"application/pdf", "application/msword", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "text/plain", "text/rtf"};
            Boolean boolValueOf = Boolean.valueOf(x1cVar.p().a);
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object objV2 = cVarH.v();
            Object obj3 = objV2;
            if (z2 || objV2 == c0020a) {
                wxb wxbVar = new wxb(gu5Var, null);
                cVarH.p(wxbVar);
                obj3 = wxbVar;
            }
            to4.d(cVarH, boolValueOf, (Function2) obj3);
            Boolean boolValueOf2 = Boolean.valueOf(x1cVar.n().b != null);
            boolean z3 = i3 == 256;
            Object objV3 = cVarH.v();
            Object obj4 = objV3;
            if (z3 || objV3 == c0020a) {
                xxb xxbVar = new xxb(gu5Var, null);
                cVarH.p(xxbVar);
                obj4 = xxbVar;
            }
            to4.d(cVarH, boolValueOf2, (Function2) obj4);
            e eVarF = g.f(e.a.b, 1.0f);
            boolean zX2 = cVarH.x(p9dVar);
            Object objV4 = cVarH.v();
            Object obj5 = objV4;
            if (zX2 || objV4 == c0020a) {
                k1 k1Var = new k1(p9dVar, 13);
                cVarH.p(k1Var);
                obj5 = k1Var;
            }
            e eVarA = s.a(eVarF, (Function1) obj5);
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarA);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
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
            s88 s88VarN = x1cVar.n();
            n9d n9dVarG = p9dVar.g();
            boolean zX3 = cVarH.x(p9dVar);
            Object objV5 = cVarH.v();
            Object obj6 = objV5;
            if (zX3 || objV5 == c0020a) {
                z9a z9aVar = new z9a(1, p9dVar, function1);
                cVarH.p(z9aVar);
                obj6 = z9aVar;
            }
            Function1 function12 = (Function1) obj6;
            boolean zX4 = cVarH.x(ra9VarL) | cVarH.x(strArr);
            Object objV6 = cVarH.v();
            Object obj7 = objV6;
            if (zX4 || objV6 == c0020a) {
                np0 np0Var = new np0(6, ra9VarL, strArr);
                cVarH.p(np0Var);
                obj7 = np0Var;
            }
            gu5 gu5Var2 = (gu5) obj7;
            Object objV7 = cVarH.v();
            Object obj8 = objV7;
            if (objV7 == c0020a) {
                as0 as0Var = new as0(14);
                cVarH.p(as0Var);
                obj8 = as0Var;
            }
            gu5 gu5Var3 = (gu5) obj8;
            boolean zX5 = cVarH.x(x1cVar);
            Object objV8 = cVarH.v();
            if (zX5 || objV8 == c0020a) {
                z = true;
                wub wubVar = new wub(x1cVar, true ? 1 : 0);
                cVarH.p(wubVar);
                obj = wubVar;
            } else {
                z = true;
                obj = objV8;
            }
            aad.a(s88VarN, n9dVarG, function12, gu5Var2, gu5Var3, (gu5) obj, true, cVarH, 12607552);
            cVarH.U(z);
        } else {
            cVarH.D();
        }
        i iVarW3 = cVarH.W();
        if (iVarW3 != null) {
            iVarW3.d = new ic(this, function1, gu5Var, i, 3);
        }
    }
}
