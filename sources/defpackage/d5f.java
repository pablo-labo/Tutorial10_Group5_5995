package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.le0;
import defpackage.o97;
import defpackage.pm8;
import defpackage.sx8;
import defpackage.tq6;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class d5f {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[sx8.c.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final defpackage.tg2 r24, final java.lang.String r25, final defpackage.n3f r26, final tq6.c r27, final sx8.c r28, final java.lang.String r29, final java.lang.String r30, androidx.compose.runtime.b r31, final int r32) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d5f.a(tg2, java.lang.String, n3f, tq6$c, sx8$c, java.lang.String, java.lang.String, androidx.compose.runtime.b, int):void");
    }

    public static final void b(final String str, final tjf tjfVar, final gu5<j6g> gu5Var, tq6.c cVar, final sx8.c cVar2, final boolean z, b bVar, final int i, final int i2) {
        int i3;
        c cVar3;
        final long j;
        str.getClass();
        tjfVar.getClass();
        foe foeVar = tjfVar.a;
        gu5Var.getClass();
        c cVarH = bVar.h(1513302157);
        if ((i & 6) == 0) {
            i3 = (cVarH.K(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cVarH.K(tjfVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cVarH.x(gu5Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= cVarH.d(cVar == null ? -1 : cVar.ordinal()) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i3 |= cVarH.d(cVar2 == null ? -1 : cVar2.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= cVarH.a(z) ? 131072 : 65536;
        }
        if (cVarH.o(i3 & 1, (74899 & i3) != 74898)) {
            final tq6.c cVar4 = i4 != 0 ? null : cVar;
            o97 o97Var = (o97) cVarH.M(p97.a);
            iy3 iy3Var = (iy3) cVarH.M(um2.h);
            int i5 = cVar2 == null ? -1 : a.a[cVar2.ordinal()];
            if (i5 == -1) {
                j = o97Var.c.b.f.a;
            } else if (i5 == 1) {
                j = o97Var.c.a.g.f.a;
            } else if (i5 == 2) {
                j = o97Var.c.a.g.a;
            } else {
                if (i5 != 3) {
                    l.g();
                    return;
                }
                j = o97Var.c.a.g.e.a;
            }
            final luc lucVar = new luc();
            e eVarJ = e.a.b;
            if (z) {
                o97.g gVar = o97Var.i;
                eVarJ = f.j(eVarJ, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            }
            e eVarA = androidx.compose.ui.draw.a.a(androidx.compose.ui.c.a(eVarJ, tf7.a, new i72(gu5Var)), new Function1() { // from class: a5f
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    gb4 gb4Var = (gb4) obj;
                    gb4Var.getClass();
                    mif mifVar = (mif) lucVar.element;
                    if (mifVar != null) {
                        q1a q1aVar = mifVar.b;
                        int i6 = q1aVar.f;
                        for (int i7 = 0; i7 < i6; i7++) {
                            float fE = mifVar.e(i7);
                            float f = mifVar.f(i7);
                            float fB = q1aVar.b(i7) - gb4Var.t1(1.0f);
                            gb4Var.W(j, (((long) Float.floatToRawIntBits(fE)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L), (((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), gb4Var.t1(0.5f), (496 & 16) != 0 ? 0 : 0);
                        }
                    }
                    return j6g.a;
                }
            });
            le0.b bVar2 = new le0.b();
            bVar2.g(str);
            if (cVar4 != null) {
                ne7.a(bVar2, "imageId", "�");
            }
            cVar3 = cVarH;
            cVar = cVar4;
            cif.c(bVar2.l(), eVarA, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, kc9.W(new Pair("imageId", new me7(new sab(hh2.y(4294967296L, bkf.c(iy3Var.H(4.0f)) + bkf.c(foeVar.b)), 7, foeVar.b), bh2.c(1410923596, new wu5() { // from class: b5f
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    b bVar3 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((String) obj).getClass();
                    if (bVar3.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        tq6.c cVar5 = cVar4;
                        fv6 fv6VarC = cVar5 != null ? u4f.c(cVar5) : null;
                        if (fv6VarC == null) {
                            bVar3.L(-2020017003);
                        } else {
                            bVar3.L(-2020017002);
                            e.a aVar = e.a.b;
                            e eVarD = g.d(aVar, 1.0f);
                            ag9 ag9VarD = hl1.d(c20.a.a, false);
                            int iG = bVar3.G();
                            t8b t8bVarM = bVar3.m();
                            e eVarC = androidx.compose.ui.c.c(bVar3, eVarD);
                            gl2.j.getClass();
                            pm8.a aVar2 = gl2.a.b;
                            if (bVar3.j() == null) {
                                pg8.B();
                                throw null;
                            }
                            bVar3.B();
                            if (bVar3.f()) {
                                bVar3.y(aVar2);
                            } else {
                                bVar3.n();
                            }
                            ygg.y(bVar3, ag9VarD, gl2.a.g);
                            ygg.y(bVar3, t8bVarM, gl2.a.f);
                            gl2.a.C0251a c0251a = gl2.a.j;
                            if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iG))) {
                                uz.g(iG, bVar3, iG, c0251a);
                            }
                            ygg.y(bVar3, eVarC, gl2.a.d);
                            ev6.b(fv6VarC, g.n(androidx.compose.foundation.layout.b.a.h(aVar, c20.a.f), ((iy3) bVar3.M(um2.h)).S(tjfVar.a.b)), ar6.Filled, null, j, null, bVar3, 384, 40);
                            bVar3.q();
                        }
                        bVar3.F();
                    } else {
                        bVar3.D();
                    }
                    return j6g.a;
                }
            }, cVarH)))), new rlb(lucVar, 1), tjf.a(tjfVar, j, 0L, null, null, o97Var.d.a, 0L, 0, 0L, null, null, 0, 16777182), cVar3, 0, 0, 32764);
        } else {
            cVar3 = cVarH;
            cVar3.D();
        }
        final tq6.c cVar5 = cVar;
        i iVarW = cVar3.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: c5f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d5f.b(str, tjfVar, gu5Var, cVar5, cVar2, z, (b) obj, ka2.L(i | 1), i2);
                    return j6g.a;
                }
            };
        }
    }
}
