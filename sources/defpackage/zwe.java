package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import coil3.compose.internal.ContentPainterElement;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class zwe {
    public static final void a(final qv0 qv0Var, final e eVar, final Function1 function1, final Function1 function12, final c20 c20Var, final ft2 ft2Var, final ah2 ah2Var, b bVar, final int i, final int i2) {
        int i3;
        c cVarH = bVar.h(-205779950);
        int i4 = i | (cVarH.K(qv0Var) ? 4 : 2) | (cVarH.K(eVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(function1) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(function12) ? 16384 : 8192) | (cVarH.K(c20Var) ? 131072 : 65536) | (cVarH.K(ft2Var) ? 1048576 : 524288) | (cVarH.c(1.0f) ? 8388608 : 4194304) | (cVarH.K(null) ? 67108864 : 33554432) | (cVarH.d(1) ? 536870912 : 268435456);
        if ((i2 & 6) == 0) {
            i3 = i2 | (cVarH.a(true) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= cVarH.x(ah2Var) ? 32 : 16;
        }
        if ((306783379 & i4) == 306783378 && (i3 & 19) == 18 && cVarH.i()) {
            cVarH.D();
        } else {
            w27 w27VarD = mkg.d(qv0Var.a, ft2Var, cVarH);
            int i5 = i4 >> 6;
            int i6 = ((i4 >> 3) & 8064) | (i5 & 57344);
            int i7 = i4 >> 12;
            kv0 kv0VarA = mv0.a(w27VarD, qv0Var.c, function1, function12, ft2Var, cVarH, (458752 & i7) | i6, 0);
            rie rieVar = w27VarD.p;
            if (rieVar instanceof nq2) {
                cVarH.L(-636813091);
                rl1.a(eVar, c20Var, true, bh2.c(-374957172, new wwe(rieVar, ah2Var, kv0VarA, c20Var, ft2Var), cVarH), cVarH, (i5 & 14) | 3456 | (i7 & 112), 0);
                cVarH.U(false);
            } else {
                cVarH.L(-637501818);
                ag9 ag9VarD = hl1.d(c20Var, true);
                int iG = cVarH.G();
                t8b t8bVarP = cVarH.P();
                e eVarC = androidx.compose.ui.c.c(cVarH, eVar);
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
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                    ja.h(iG, cVarH, iG, c0251a);
                }
                ygg.y(cVarH, eVarC, gl2.a.d);
                ah2Var.q(new urc(androidx.compose.foundation.layout.b.a, kv0VarA, c20Var, ft2Var), cVarH, Integer.valueOf(i3 & 112));
                cVarH.U(true);
                cVarH.U(false);
            }
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(eVar, function1, function12, c20Var, ft2Var, ah2Var, i, i2) { // from class: uwe
                public final /* synthetic */ ah2 V;
                public final /* synthetic */ int W;
                public final /* synthetic */ e b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ c20 e;
                public final /* synthetic */ ft2 f;

                {
                    this.W = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zwe.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, (b) obj, ka2.L(49), ka2.L(this.W));
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(final axe axeVar, e eVar, x2b x2bVar, String str, c20 c20Var, ft2 ft2Var, float f, ga2 ga2Var, boolean z, b bVar, final int i) {
        axe axeVar2;
        int i2;
        x2b x2bVarB;
        String contentDescription;
        c20 c20VarI;
        ft2 ft2VarD;
        float fA;
        ga2 ga2VarG;
        boolean zE;
        e eVar2;
        final x2b x2bVar2;
        final e eVar3;
        final boolean z2;
        final ga2 ga2Var2;
        final float f2;
        final ft2 ft2Var2;
        final c20 c20Var2;
        final String str2;
        c cVarH = bVar.h(-1375825518);
        if ((i & 6) == 0) {
            axeVar2 = axeVar;
            i2 = (cVarH.K(axeVar2) ? 4 : 2) | i;
        } else {
            axeVar2 = axeVar;
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 = i2 | 176;
        }
        if ((i & 3072) == 0) {
            i3 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= 33554432;
        }
        if ((38347923 & i3) == 38347922 && cVarH.i()) {
            cVarH.D();
            eVar3 = eVar;
            x2bVar2 = x2bVar;
            str2 = str;
            c20Var2 = c20Var;
            ft2Var2 = ft2Var;
            f2 = f;
            ga2Var2 = ga2Var;
            z2 = z;
        } else {
            cVarH.v0();
            if ((i & 1) == 0 || cVarH.c0()) {
                x2bVarB = axeVar2.b();
                contentDescription = axeVar2.getContentDescription();
                c20VarI = axeVar2.i();
                ft2VarD = axeVar2.d();
                fA = axeVar2.a();
                ga2VarG = axeVar2.g();
                zE = axeVar2.e();
                eVar2 = e.a.b;
            } else {
                cVarH.D();
                eVar2 = eVar;
                x2bVarB = x2bVar;
                contentDescription = str;
                c20VarI = c20Var;
                ft2VarD = ft2Var;
                fA = f;
                ga2VarG = ga2Var;
                zE = z;
            }
            cVarH.V();
            y03 y03Var = mkg.a;
            e eVarB = contentDescription != null ? b5e.b(eVar2, false, new d12(contentDescription, 5)) : eVar2;
            if (zE) {
                eVarB = ygg.i(eVarB);
            }
            e eVarO = eVarB.o(new ContentPainterElement(x2bVarB, c20VarI, ft2VarD, fA, ga2VarG));
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = xwe.a;
                cVarH.p(objV);
            }
            ag9 ag9Var = (ag9) objV;
            int iG = cVarH.G();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarO);
            t8b t8bVarP = cVarH.P();
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9Var, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            ygg.y(cVarH, eVarC, gl2.a.d);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                ja.h(iG, cVarH, iG, c0251a);
            }
            cVarH.U(true);
            String str3 = contentDescription;
            x2bVar2 = x2bVarB;
            eVar3 = eVar2;
            z2 = zE;
            ga2Var2 = ga2VarG;
            f2 = fA;
            ft2Var2 = ft2VarD;
            c20Var2 = c20VarI;
            str2 = str3;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: vwe
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zwe.b(axeVar, eVar3, x2bVar2, str2, c20Var2, ft2Var2, f2, ga2Var2, z2, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }
}
