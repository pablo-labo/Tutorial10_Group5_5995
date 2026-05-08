package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.material.MinimumInteractiveModifier;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.h;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.wlappdebug.k0;
import defpackage.c20;
import defpackage.ftg;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ywa {
    public static final long a = hh2.t(8);
    public static final /* synthetic */ int b = 0;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[vl8.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final k0 k0Var, e eVar, boolean z, tjf tjfVar, final Function2 function2, ftg ftgVar, fh8 fh8Var, yg8 yg8Var, int i, int i2, dce dceVar, ar3 ar3Var, b bVar, final int i3) {
        c cVar;
        final e eVar2;
        final boolean z2;
        final tjf tjfVar2;
        final ftg ftgVar2;
        final fh8 fh8Var2;
        final yg8 yg8Var2;
        final int i4;
        final int i5;
        final dce dceVar2;
        final ar3 ar3Var2;
        fh8 fh8Var3;
        c cVar2;
        int i6;
        ar3 ar3Var3;
        int i7;
        tjf tjfVar3;
        e eVar3;
        dce dceVar3;
        yg8 yg8Var3;
        boolean z3;
        ftg ftgVar3;
        int i8;
        boolean z4;
        long j;
        c cVarH = bVar.h(801000036);
        int i9 = i3 | (cVarH.K(str) ? 4 : 2) | (cVarH.x(k0Var) ? 32 : 16) | 918646144;
        if (cVarH.o(i9 & 1, (306783379 & i9) != 306783378)) {
            cVarH.v0();
            int i10 = i3 & 1;
            e eVarJ = e.a.b;
            if (i10 == 0 || cVarH.c0()) {
                tjf tjfVar4 = (tjf) cVarH.M(fif.a);
                fh8Var3 = fh8.e;
                p03 p03Var = ((ede) cVarH.M(gde.a)).a;
                ar3 ar3VarD = ief.d(0L, 0L, 0L, cVarH, 2097151);
                cVar2 = cVarH;
                s6 s6Var = ftg.a.a;
                i6 = Integer.MAX_VALUE;
                ar3Var3 = ar3VarD;
                i7 = i9 & (-458753);
                tjfVar3 = tjfVar4;
                eVar3 = eVarJ;
                dceVar3 = p03Var;
                yg8Var3 = yg8.g;
                z3 = true;
                ftgVar3 = s6Var;
                i8 = 1;
            } else {
                cVarH.D();
                z3 = z;
                ftgVar3 = ftgVar;
                fh8Var3 = fh8Var;
                yg8Var3 = yg8Var;
                i6 = i;
                i8 = i2;
                dceVar3 = dceVar;
                ar3Var3 = ar3Var;
                cVar2 = cVarH;
                i7 = i9 & (-458753);
                eVar3 = eVar;
                tjfVar3 = tjfVar;
            }
            cVar2.V();
            cVar2.L(-245169385);
            Object objV = cVar2.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = v40.a(cVar2);
            }
            d3a d3aVar = (d3a) objV;
            cVar2.U(false);
            cVar2.L(961927730);
            long jB = tjfVar3.b();
            if (jB != 16) {
                z4 = z3;
                j = jB;
            } else {
                z4 = z3;
                j = ((da2) ar3Var3.c(z3, cVar2).getValue()).a;
            }
            cVar2.U(false);
            tjf tjfVarD = tjfVar3.d(new tjf(j, 0L, null, null, 0L, 0, 0L, 16777214));
            iy3 iy3Var = (iy3) cVar2.M(um2.h);
            if (function2 != null) {
                cVar2.L(-244698123);
                Object objV2 = cVar2.v();
                if (objV2 == c0020a) {
                    objV2 = new wd(6);
                    cVar2.p(objV2);
                }
                eVarJ = f.j(b5e.b(eVarJ, true, (Function1) objV2), 0.0f, iy3Var.S(a), 0.0f, 0.0f, 13);
                cVar2.U(false);
            } else {
                cVar2.L(-244312762);
                cVar2.U(false);
            }
            e eVarO = eVar3.o(eVarJ);
            ewa.u(3, cVar2);
            dce dceVar4 = dceVar3;
            ar3 ar3Var4 = ar3Var3;
            boolean z5 = z4;
            fh8 fh8Var4 = fh8Var3;
            yg8 yg8Var4 = yg8Var3;
            cVar = cVar2;
            int i11 = i6;
            cd1.b(str, k0Var, g.a(eVarO, 280.0f, 56.0f), z5, false, tjfVarD, fh8Var4, yg8Var4, false, i11, i8, ftgVar3, null, d3aVar, new kne(((da2) ar3Var3.a(cVar2).getValue()).a), bh2.c(-591103097, new xwa(str, z4, ftgVar3, d3aVar, function2, dceVar4, ar3Var4), cVar2), cVar, (i7 & 64638) | 114819072, 196662, 4096);
            yg8Var2 = yg8Var4;
            ftgVar2 = ftgVar3;
            i5 = i8;
            i4 = i11;
            z2 = z5;
            fh8Var2 = fh8Var4;
            ar3Var2 = ar3Var4;
            dceVar2 = dceVar4;
            tjfVar2 = tjfVar3;
            eVar2 = eVar3;
        } else {
            cVar = cVarH;
            cVar.D();
            eVar2 = eVar;
            z2 = z;
            tjfVar2 = tjfVar;
            ftgVar2 = ftgVar;
            fh8Var2 = fh8Var;
            yg8Var2 = yg8Var;
            i4 = i;
            i5 = i2;
            dceVar2 = dceVar;
            ar3Var2 = ar3Var;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(str, k0Var, eVar2, z2, tjfVar2, function2, ftgVar2, fh8Var2, yg8Var2, i4, i5, dceVar2, ar3Var2, i3) { // from class: pwa
                public final /* synthetic */ ftg V;
                public final /* synthetic */ fh8 W;
                public final /* synthetic */ yg8 X;
                public final /* synthetic */ int Y;
                public final /* synthetic */ int Z;
                public final /* synthetic */ String a;
                public final /* synthetic */ dce a0;
                public final /* synthetic */ k0 b;
                public final /* synthetic */ ar3 b0;
                public final /* synthetic */ e c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ tjf e;
                public final /* synthetic */ Function2 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1572865);
                    ywa.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, this.X, this.Y, this.Z, this.a0, this.b0, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(final e eVar, Function2 function2, wu5 wu5Var, Function2 function22, final Function2 function23, final Function2 function24, final float f, final Function1 function1, final ah2 ah2Var, gza gzaVar, b bVar, final int i) {
        int i2;
        Function2 function25;
        wu5 wu5Var2;
        boolean z;
        boolean z2;
        final Function2 function26 = function22;
        final gza gzaVar2 = gzaVar;
        c cVarH = bVar.h(36320288);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(wu5Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.x(function26) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.x(function23) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.x(function24) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= cVarH.a(false) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= cVarH.c(f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= cVarH.x(function1) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= cVarH.x(ah2Var) ? 536870912 : 268435456;
        }
        char c = cVarH.K(gzaVar2) ? (char) 4 : (char) 2;
        if (cVarH.o(i2 & 1, ((i2 & 306783379) == 306783378 && (c & 3) == 2) ? false : true)) {
            boolean z3 = ((3670016 & i2) == 1048576) | ((234881024 & i2) == 67108864) | ((29360128 & i2) == 8388608) | ((c & 14) == 4);
            Object objV = cVarH.v();
            if (z3 || objV == b.a.a) {
                objV = new cxa(function1, f, gzaVar2);
                cVarH.p(objV);
            }
            cxa cxaVar = (cxa) objV;
            vl8 vl8Var = (vl8) cVarH.M(um2.n);
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
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, cxaVar, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            int i3 = i2;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                ja.h(iG, cVarH, iG, c0251a);
            }
            gl2.a.e eVar2 = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar2);
            ah2Var.invoke(cVarH, Integer.valueOf((i3 >> 27) & 14));
            e.a aVar2 = e.a.b;
            af1 af1Var = c20.a.e;
            if (function23 != null) {
                cVarH.L(1336978507);
                e eVarB = h.b(aVar2, "Leading");
                jte jteVar = gi7.a;
                e eVarO = eVarB.o(MinimumInteractiveModifier.b);
                ag9 ag9VarD = hl1.d(af1Var, false);
                int iG2 = cVarH.G();
                t8b t8bVarP2 = cVarH.P();
                e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarO);
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ag9VarD, dVar);
                ygg.y(cVarH, t8bVarP2, fVar);
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG2))) {
                    ja.h(iG2, cVarH, iG2, c0251a);
                }
                ygg.y(cVarH, eVarC2, eVar2);
                function23.invoke(cVarH, Integer.valueOf((i3 >> 12) & 14));
                cVarH.U(true);
                z = false;
                cVarH.U(false);
            } else {
                z = false;
                cVarH.L(1337224523);
                cVarH.U(false);
            }
            if (function24 != null) {
                cVarH.L(1337267241);
                e eVarB2 = h.b(aVar2, "Trailing");
                jte jteVar2 = gi7.a;
                e eVarO2 = eVarB2.o(MinimumInteractiveModifier.b);
                ag9 ag9VarD2 = hl1.d(af1Var, z);
                int iG3 = cVarH.G();
                t8b t8bVarP3 = cVarH.P();
                e eVarC3 = androidx.compose.ui.c.c(cVarH, eVarO2);
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ag9VarD2, dVar);
                ygg.y(cVarH, t8bVarP3, fVar);
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG3))) {
                    ja.h(iG3, cVarH, iG3, c0251a);
                }
                ygg.y(cVarH, eVarC3, eVar2);
                function24.invoke(cVarH, Integer.valueOf((i3 >> 15) & 14));
                cVarH.U(true);
                cVarH.U(false);
            } else {
                cVarH.L(1337515179);
                cVarH.U(z);
            }
            gzaVar2 = gzaVar;
            float fD = f.d(gzaVar2, vl8Var);
            float fC = f.c(gzaVar2, vl8Var);
            if (function23 != null) {
                fD -= 12.0f;
                if (fD < 0.0f) {
                    fD = 0.0f;
                }
            }
            float f2 = fD;
            if (function24 != null) {
                fC -= 12.0f;
                if (fC < 0.0f) {
                    fC = 0.0f;
                }
            }
            e eVarJ = f.j(aVar2, f2, 0.0f, fC, 0.0f, 10);
            if (wu5Var != null) {
                cVarH.L(1338367152);
                wu5Var2 = wu5Var;
                wu5Var2.q(h.b(aVar2, "Hint").o(eVarJ), cVarH, Integer.valueOf((i3 >> 3) & 112));
                cVarH.U(false);
            } else {
                wu5Var2 = wu5Var;
                cVarH.L(1338454603);
                cVarH.U(false);
            }
            e eVarO3 = h.b(aVar2, "TextField").o(eVarJ);
            af1 af1Var2 = c20.a.a;
            ag9 ag9VarD3 = hl1.d(af1Var2, true);
            int iG4 = cVarH.G();
            t8b t8bVarP4 = cVarH.P();
            e eVarC4 = androidx.compose.ui.c.c(cVarH, eVarO3);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD3, dVar);
            ygg.y(cVarH, t8bVarP4, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG4))) {
                ja.h(iG4, cVarH, iG4, c0251a);
            }
            ygg.y(cVarH, eVarC4, eVar2);
            function25 = function2;
            function25.invoke(cVarH, Integer.valueOf((i3 >> 3) & 14));
            cVarH.U(true);
            if (function22 != null) {
                cVarH.L(1338685429);
                e eVarB3 = h.b(aVar2, "Label");
                ag9 ag9VarD4 = hl1.d(af1Var2, false);
                int iG5 = cVarH.G();
                t8b t8bVarP5 = cVarH.P();
                e eVarC5 = androidx.compose.ui.c.c(cVarH, eVarB3);
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ag9VarD4, dVar);
                ygg.y(cVarH, t8bVarP5, fVar);
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG5))) {
                    ja.h(iG5, cVarH, iG5, c0251a);
                }
                ygg.y(cVarH, eVarC5, eVar2);
                function26 = function22;
                function26.invoke(cVarH, Integer.valueOf((i3 >> 9) & 14));
                z2 = true;
                cVarH.U(true);
                cVarH.U(false);
            } else {
                function26 = function22;
                z2 = true;
                cVarH.L(1338768075);
                cVarH.U(false);
            }
            cVarH.U(z2);
        } else {
            function25 = function2;
            wu5Var2 = wu5Var;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            final Function2 function27 = function25;
            final wu5 wu5Var3 = wu5Var2;
            iVarW.d = new Function2() { // from class: rwa
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ywa.b(eVar, function27, wu5Var3, function26, function23, function24, f, function1, ah2Var, gzaVar2, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final int c(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, gza gzaVar) {
        int iMax = Math.max(i3, Math.max(i5, w74.u(i4, f, 0)));
        float fD = gzaVar.d() * f2;
        return mq2.f(Math.max(i, Math.max(i2, gf9.b(w74.t(fD, Math.max(fD, i4 / 2.0f), f) + iMax + (gzaVar.a() * f2)))), j);
    }

    public static final int d(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, gza gzaVar) {
        int iMax = Math.max(i3, Math.max(w74.u(i4, f, 0), i5)) + i + i2;
        vl8 vl8Var = vl8.a;
        return mq2.g(Math.max(iMax, gf9.b((i4 + ((gzaVar.c(vl8Var) + gzaVar.b(vl8Var)) * f2)) * f)), j);
    }
}
