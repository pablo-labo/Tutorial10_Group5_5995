package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.ui.ZIndexElement;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import defpackage.ytc;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class fw6 {
    public static final ne4 a = new ne4(new j7(5));

    public static final class a implements Function2<b, Integer, j6g> {
        public final /* synthetic */ String V;
        public final /* synthetic */ Function2<b, Integer, j6g> W;
        public final /* synthetic */ e a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ boolean f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e eVar, String str, boolean z, String str2, String str3, boolean z2, String str4, Function2<? super b, ? super Integer, j6g> function2) {
            this.a = eVar;
            this.b = str;
            this.c = z;
            this.d = str2;
            this.e = str3;
            this.f = z2;
            this.V = str4;
            this.W = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(b bVar, Integer num) {
            b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                int i = 0;
                e eVarO = b5e.b(e.a.b, false, new gb(11)).o(this.a);
                bVar2.L(-1224400529);
                boolean zK = bVar2.K(this.b) | bVar2.a(this.c) | bVar2.K(this.d) | bVar2.K(this.e) | bVar2.a(this.f) | bVar2.K(this.V);
                Object objV = bVar2.v();
                if (zK || objV == b.a.a) {
                    final boolean z = this.f;
                    final String str = this.V;
                    final String str2 = this.b;
                    final boolean z2 = this.c;
                    final String str3 = this.d;
                    final String str4 = this.e;
                    Function1 function1 = new Function1() { // from class: ew6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            s5e s5eVar = (s5e) obj;
                            s5eVar.getClass();
                            iy8 iy8VarS = u63.s();
                            iy8VarS.add(str2);
                            if (z2) {
                                iy8VarS.add(str3);
                            }
                            String str5 = str4;
                            if (str5 != null) {
                                iy8VarS.add(str5);
                            }
                            o5e.f(s5eVar, z92.W0(iy8VarS.l(), "\n", null, null, null, 62));
                            if (z) {
                                o5e.a(s5eVar, str);
                            }
                            return j6g.a;
                        }
                    };
                    bVar2.p(function1);
                    objV = function1;
                }
                bVar2.F();
                e eVarB = b5e.b(eVarO, false, (Function1) objV);
                ob2 ob2VarA = mb2.a(new vs0.i(0.0f, true, new us0(i)), c20.a.m, bVar2, 6);
                int iHashCode = Long.hashCode(bVar2.k());
                t8b t8bVarM = bVar2.m();
                e eVarC = c.c(bVar2, eVarB);
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
                bVar2.L(46269189);
                Function2<b, Integer, j6g> function2 = this.W;
                if (function2 != null) {
                    function2.invoke(bVar2, 0);
                }
                bVar2.F();
                bVar2.q();
            }
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final java.lang.String r25, final androidx.compose.ui.e r26, java.lang.String r27, java.lang.String r28, boolean r29, java.lang.String r30, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r31, androidx.compose.runtime.b r32, final int r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw6.a(java.lang.String, androidx.compose.ui.e, java.lang.String, java.lang.String, boolean, java.lang.String, kotlin.jvm.functions.Function2, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final boolean r56, final boolean r57, final java.lang.String r58, final kotlin.jvm.functions.Function1 r59, androidx.compose.ui.e r60, java.lang.String r61, java.lang.String r62, kotlin.jvm.functions.Function2 r63, androidx.compose.runtime.b r64, final int r65, final int r66) {
        /*
            Method dump skipped, instruction units count: 961
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw6.b(boolean, boolean, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.e, java.lang.String, java.lang.String, kotlin.jvm.functions.Function2, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final java.lang.String r21, androidx.compose.ui.e r22, java.lang.String r23, java.lang.String r24, boolean r25, final defpackage.zv6[] r26, final kotlin.jvm.functions.Function2 r27, java.lang.String r28, androidx.compose.runtime.b r29, final int r30, final int r31) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw6.c(java.lang.String, androidx.compose.ui.e, java.lang.String, java.lang.String, boolean, zv6[], kotlin.jvm.functions.Function2, java.lang.String, androidx.compose.runtime.b, int, int):void");
    }

    public static final void d(final boolean z, final boolean z2, e eVar, final String str, b bVar, final int i) {
        int i2;
        long j;
        final e eVar2;
        androidx.compose.runtime.c cVarH = bVar.h(514743938);
        if ((i & 6) == 0) {
            i2 = (cVarH.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.a(z2) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= cVarH.K(str) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i3 & 1171) == 1170 && cVarH.i()) {
            cVarH.D();
            eVar2 = eVar;
        } else {
            o97 o97Var = (o97) cVarH.M(p97.a);
            String str2 = str == null ? "RadioSelector" : str;
            e.a aVar = e.a.b;
            e eVarA = f.a(aVar, str2);
            float f = z ? 2.0f : 1.0f;
            if (z2) {
                j = o97Var.c.c.g.c.b;
            } else if (z) {
                int i4 = o97Var.a;
                o97.a aVar2 = o97Var.c;
                j = i4 >= 7 ? aVar2.c.f.c : aVar2.a.g.f.a;
            } else {
                j = o97Var.c.c.f.a;
            }
            ag9 ag9VarD = hl1.d(c20.a.e, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = c.c(cVarH, eVarA);
            gl2.j.getClass();
            pm8.a aVar3 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
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
            e eVarN = g.n(aVar, 24.0f);
            long j2 = da2.h;
            ytc.a aVar4 = ytc.a;
            e eVarB = androidx.compose.foundation.a.b(eVarN, j2, aVar4);
            fgd fgdVar = ggd.a;
            hl1.a(ti1.a(ygg.h(eVarB, fgdVar), f, j, fgdVar).o(new ZIndexElement(1.0f)), cVarH, 0);
            cVarH.L(-1836873028);
            if (z) {
                hl1.a(androidx.compose.foundation.a.b(ygg.h(g.n(aVar, 12.0f), fgdVar), j, aVar4).o(new ZIndexElement(2.0f)), cVarH, 0);
            }
            cVarH.U(false);
            cVarH.U(true);
            eVar2 = aVar;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: dw6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fw6.d(z, z2, eVar2, str, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }
}
