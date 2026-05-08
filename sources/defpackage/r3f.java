package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.af1;
import defpackage.c20;
import defpackage.fl1;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class r3f {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[fl1.c.values().length];
            try {
                fl1.c.a aVar = fl1.c.a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                fl1.c.a aVar2 = fl1.c.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                fl1.c.a aVar3 = fl1.c.a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final defpackage.tg2 r15, final fl1.c r16, final fl1.d r17, final java.lang.String r18, final defpackage.ah2 r19, androidx.compose.runtime.b r20, final int r21) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r3f.a(tg2, fl1$c, fl1$d, java.lang.String, ah2, androidx.compose.runtime.b, int):void");
    }

    public static final void b(final boolean z, final fl1.c cVar, final fl1.d dVar, final boolean z2, final ah2 ah2Var, b bVar, final int i) {
        int i2;
        c cVarH = bVar.h(1205952077);
        if ((i & 6) == 0) {
            i2 = (cVarH.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.d(cVar == null ? -1 : cVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.d(dVar == null ? -1 : dVar.ordinal()) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.a(z2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.x(ah2Var) ? 16384 : 8192;
        }
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z3 = dVar == fl1.d.c || cVar != null;
            cVarH.L(-721206748);
            ne4 ne4Var = p97.a;
            o97.g gVar = ((o97) cVarH.M(ne4Var)).i;
            e eVarJ = f.j(e.a.b, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            if (z2) {
                cVarH.L(198987837);
                o97.g gVar2 = ((o97) cVarH.M(ne4Var)).i;
                eVarJ = f.j(eVarJ, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            } else {
                cVarH.L(198989612);
            }
            cVarH.U(false);
            e eVar = eVarJ;
            cVarH.U(false);
            e eVarF = z ? g.f(eVar, 1.0f) : g.t(eVar, 0.0f, 367.0f, 1);
            af1.a aVar = c20.a.m;
            if (z3) {
                cVarH.L(-882321730);
                int i3 = cVar == null ? -1 : a.a[cVar.ordinal()];
                if (i3 != -1 && i3 != 1) {
                    if (i3 == 2) {
                        aVar = c20.a.n;
                    } else {
                        if (i3 != 3) {
                            l.g();
                            return;
                        }
                        aVar = c20.a.o;
                    }
                }
                zk5.a(eVarF, new vs0.i(8.0f, true, new xd(aVar, 4)), new vs0.i(8.0f, true, new us0(0)), null, 0, 0, bh2.c(1821576397, new n03(ah2Var, 3), cVarH), cVarH, 1573248, 56);
                cVarH.U(false);
            } else {
                e eVar2 = eVarF;
                cVarH.L(-881735179);
                ob2 ob2VarA = mb2.a(vs0.e, aVar, cVarH, 6);
                int iG = cVarH.G();
                t8b t8bVarP = cVarH.P();
                e eVarC = androidx.compose.ui.c.c(cVarH, eVar2);
                gl2.j.getClass();
                pm8.a aVar2 = gl2.a.b;
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar2);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ob2VarA, gl2.a.g);
                ygg.y(cVarH, t8bVarP, gl2.a.f);
                gl2.a.C0251a c0251a = gl2.a.j;
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                    ja.h(iG, cVarH, iG, c0251a);
                }
                ygg.y(cVarH, eVarC, gl2.a.d);
                ah2Var.invoke(cVarH, Integer.valueOf((i2 >> 12) & 14));
                cVarH.U(true);
                cVarH.U(false);
            }
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: q3f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    r3f.b(z, cVar, dVar, z2, ah2Var, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void c(ah2 ah2Var, b bVar, int i) {
        c cVarH = bVar.h(541154795);
        if (cVarH.o(i & 1, (i & 3) != 2)) {
            e eVarT = g.t(e.a.b, 0.0f, 367.0f, 1);
            ob2 ob2VarA = mb2.a(vs0.e, c20.a.m, cVarH, 6);
            int iG = cVarH.G();
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarT);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                ja.h(iG, cVarH, iG, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            ah2Var.invoke(cVarH, 6);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new rj4(ah2Var, i, 8);
        }
    }
}
