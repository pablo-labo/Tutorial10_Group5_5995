package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class le7 {
    public static final void a(int i, gu5 gu5Var, b bVar, e eVar, String str) {
        int i2;
        c cVar;
        c cVarF = q6.f(1421039171, gu5Var, bVar, str);
        if ((i & 6) == 0) {
            i2 = (cVarF.K(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarF.K(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarF.x(gu5Var) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (cVarF.o(i2 & 1, (i2 & 147) != 146)) {
            boolean zO = i6a.o();
            b.a.C0020a c0020a = b.a.a;
            if (zO) {
                cVarF.L(-1314537727);
                boolean z = (i2 & 896) == 256;
                Object objV = cVarF.v();
                if (z || objV == c0020a) {
                    objV = new zv(3, gu5Var);
                    cVarF.p(objV);
                }
                gt6.j(str, (gu5) objV, eVar, null, false, false, null, null, null, cVarF, ((i2 >> 3) & 14) | ((i2 << 6) & 896), DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
                cVarF.U(false);
            } else {
                cVarF.L(-1314413727);
                vs0.i iVar = new vs0.i(8.0f, true, new xd(c20.a.n, 4));
                e eVarB = a.b(ygg.h(eVar, ggd.a(8.0f)), eu6.u, ytc.a);
                bj1 bj1VarF = ee3.f(eu6.q, 1.0f);
                e eVarG = f.g(ti1.b(eVarB, bj1VarF.a, bj1VarF.b, ggd.a(8.0f)), 16.0f, 10.0f);
                boolean z2 = (i2 & 896) == 256;
                Object objV2 = cVarF.v();
                if (z2 || objV2 == c0020a) {
                    objV2 = new js(3, gu5Var);
                    cVar = cVarF;
                    cVar.p(objV2);
                } else {
                    cVar = cVarF;
                }
                e eVarD = androidx.compose.foundation.b.d(eVarG, false, null, null, (gu5) objV2, 15);
                ehd ehdVarA = chd.a(iVar, c20.a.k, cVar, 54);
                int iHashCode = Long.hashCode(cVar.T);
                t8b t8bVarP = cVar.P();
                e eVarC = androidx.compose.ui.c.c(cVar, eVarD);
                gl2.j.getClass();
                pm8.a aVar = gl2.a.b;
                cVar.B();
                if (cVar.S) {
                    cVar.y(aVar);
                } else {
                    cVar.n();
                }
                ygg.y(cVar, ehdVarA, gl2.a.g);
                ygg.y(cVar, t8bVarP, gl2.a.f);
                gl2.a.C0251a c0251a = gl2.a.j;
                if (cVar.S || !wl7.b(cVar.v(), Integer.valueOf(iHashCode))) {
                    ja.h(iHashCode, cVar, iHashCode, c0251a);
                }
                ygg.y(cVar, eVarC, gl2.a.d);
                c cVar2 = cVar;
                cif.b(str, null, eu6.c, 0L, null, null, null, 0L, null, null, hh2.r(9.38d), 0, false, 0, 0, null, new tjf(0L, hh2.t(16), to5.d0, null, 0L, 0, 0L, 16777209), cVar2, (i2 >> 3) & 14, 1572870, 64506);
                cVarF = cVar2;
                cVarF.U(true);
                cVarF.U(false);
            }
        } else {
            cVarF.D();
        }
        i iVarW = cVarF.W();
        if (iVarW != null) {
            iVarW.d = new ke7(eVar, str, gu5Var, i, 0);
        }
    }

    public static final void b(e eVar, final String str, final String str2, final String str3, final gu5 gu5Var, final String str4, final gu5 gu5Var2, final gu5 gu5Var3, final gu5 gu5Var4, b bVar, final int i) {
        c cVar;
        final e eVar2;
        c cVar2;
        long j;
        boolean z;
        str.getClass();
        str2.getClass();
        gu5Var.getClass();
        str4.getClass();
        gu5Var2.getClass();
        c cVarC = ja.c(gu5Var3, gu5Var4, bVar, -672041818);
        int i2 = i | 6 | (cVarC.K(str) ? 32 : 16) | (cVarC.K(str2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarC.K(str3) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarC.x(gu5Var) ? 16384 : 8192) | (cVarC.K(str4) ? 131072 : 65536) | (cVarC.x(gu5Var2) ? 1048576 : 524288) | (cVarC.x(gu5Var3) ? 8388608 : 4194304) | (cVarC.x(gu5Var4) ? 67108864 : 33554432);
        if (cVarC.o(i2 & 1, (i2 & 38347923) != 38347922)) {
            o97 o97Var = (o97) cVarC.M(p97.a);
            e.a aVar = e.a.b;
            e eVarF = g.f(aVar, 1.0f);
            if (i6a.o()) {
                cVar2 = cVarC;
                j = o97Var.c.b.f.b;
            } else {
                cVar2 = cVarC;
                j = eu6.i;
            }
            e eVarB = a.b(eVarF, j, ggd.a(8.0f));
            o97.b bVar2 = o97Var.e;
            o97.a.e eVar3 = o97Var.c.a;
            o97.h hVar = o97Var.j;
            e eVarG = f.g(eVarB, bkf.c(bVar2.g), bkf.c(bVar2.h));
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            c cVar3 = cVar2;
            int iHashCode = Long.hashCode(cVar3.T);
            t8b t8bVarP = cVar3.P();
            e eVarC = androidx.compose.ui.c.c(cVar3, eVarG);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVar3.B();
            if (cVar3.S) {
                cVar3.y(aVar2);
            } else {
                cVar3.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVar3, ag9VarD, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVar3, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVar3.S || !wl7.b(cVar3.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVar3, iHashCode, c0251a);
            }
            gl2.a.e eVar4 = gl2.a.d;
            ygg.y(cVar3, eVarC, eVar4);
            ob2 ob2VarA = mb2.a(new vs0.i(2.0f, true, new us0(0)), c20.a.m, cVar3, 6);
            int iHashCode2 = Long.hashCode(cVar3.T);
            t8b t8bVarP2 = cVar3.P();
            e eVarC2 = androidx.compose.ui.c.c(cVar3, aVar);
            cVar3.B();
            if (cVar3.S) {
                cVar3.y(aVar2);
            } else {
                cVar3.n();
            }
            ygg.y(cVar3, ob2VarA, dVar);
            ygg.y(cVar3, t8bVarP2, fVar);
            if (cVar3.S || !wl7.b(cVar3.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVar3, iHashCode2, c0251a);
            }
            ygg.y(cVar3, eVarC2, eVar4);
            e eVarF2 = g.f(aVar, 1.0f);
            ehd ehdVarA = chd.a(vs0.g, c20.a.j, cVar3, 54);
            int iHashCode3 = Long.hashCode(cVar3.T);
            t8b t8bVarP3 = cVar3.P();
            e eVarC3 = androidx.compose.ui.c.c(cVar3, eVarF2);
            cVar3.B();
            if (cVar3.S) {
                cVar3.y(aVar2);
            } else {
                cVar3.n();
            }
            ygg.y(cVar3, ehdVarA, dVar);
            ygg.y(cVar3, t8bVarP3, fVar);
            if (cVar3.S || !wl7.b(cVar3.v(), Integer.valueOf(iHashCode3))) {
                ja.h(iHashCode3, cVar3, iHashCode3, c0251a);
            }
            ygg.y(cVar3, eVarC3, eVar4);
            int i3 = i2 >> 3;
            cif.b(str, null, eVar3.c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, hVar.f, cVar3, i3 & 14, 0, 65530);
            rq6.b(gu5Var3, androidx.compose.ui.platform.f.a(g.n(aVar, bkf.c(bVar2.f)), "CloseButton"), false, null, null, bh2.c(503652963, new fs(2, gu5Var3, o97Var), cVar3), cVar3, ((i2 >> 21) & 14) | 196608, 28);
            cVar = cVar3;
            cVar.U(true);
            jh2.f(cVar, g.h(aVar, 8.0f));
            a((i3 & 112) | 6 | ((i2 >> 6) & 896), gu5Var, cVar, g.f(aVar, 1.0f), str2);
            jh2.f(cVar, g.h(aVar, 6.0f));
            int i4 = i2 >> 12;
            a((i4 & 896) | (i4 & 112) | 6, gu5Var2, cVar, g.f(aVar, 1.0f), str4);
            if (str3 == null) {
                cVar.L(831672088);
                cVar.U(false);
                z = true;
            } else {
                cVar.L(831672089);
                jh2.f(cVar, g.h(aVar, 4.0f));
                HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(c20.a.n);
                boolean z2 = (i2 & 234881024) == 67108864;
                Object objV = cVar.v();
                if (z2 || objV == b.a.a) {
                    objV = new gd(3, gu5Var4);
                    cVar.p(objV);
                }
                e eVarD = androidx.compose.foundation.b.d(horizontalAlignElement, false, null, null, (gu5) objV, 15);
                long j2 = eVar3.a;
                z = true;
                cif.b(str3, eVarD, j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(hVar.g, j2, 0L, null, null, null, 0L, 0, 0L, null, null, 0, 16773118), cVar, (i2 >> 9) & 14, 0, 65528);
                cVar = cVar;
                j6g j6gVar = j6g.a;
                cVar.U(false);
            }
            cVar.U(z);
            cVar.U(z);
            eVar2 = aVar;
        } else {
            cVar = cVarC;
            cVar.D();
            eVar2 = eVar;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(str, str2, str3, gu5Var, str4, gu5Var2, gu5Var3, gu5Var4, i) { // from class: je7
                public final /* synthetic */ gu5 V;
                public final /* synthetic */ gu5 W;
                public final /* synthetic */ gu5 X;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ gu5 e;
                public final /* synthetic */ String f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    le7.b(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, this.X, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
