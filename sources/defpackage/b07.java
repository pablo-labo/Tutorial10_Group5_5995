package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class b07 {
    public static final void a(final String str, pnf pnfVar, final float f, e eVar, final String str2, b bVar, final int i) {
        af1.a aVar;
        pnf pnfVar2;
        float f2;
        float f3;
        e eVar2;
        c cVarH = bVar.h(258919078);
        int i2 = i | (cVarH.K(str) ? 4 : 2) | (cVarH.d(pnfVar.ordinal()) ? 32 : 16) | (cVarH.d(1) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.c(f) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | 24576 | (cVarH.K(str2) ? 131072 : 65536);
        if ((74899 & i2) == 74898 && cVarH.i()) {
            cVarH.D();
            pnfVar2 = pnfVar;
            eVar2 = eVar;
        } else {
            o97 o97Var = (o97) cVarH.M(p97.a);
            String str3 = str2 == null ? "IdlTooltip" : str2;
            e.a aVar2 = e.a.b;
            e eVarA = f.a(aVar2, str3);
            cVarH.L(5004770);
            boolean z = (i2 & 112) == 32;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                int iOrdinal = pnfVar.ordinal();
                if (iOrdinal == 0) {
                    aVar = c20.a.n;
                } else if (iOrdinal == 1) {
                    aVar = c20.a.m;
                } else {
                    if (iOrdinal != 2) {
                        l.g();
                        return;
                    }
                    aVar = c20.a.o;
                }
                objV = aVar;
                cVarH.p(objV);
            }
            c20.b bVar2 = (c20.b) objV;
            cVarH.U(false);
            pnfVar2 = pnfVar;
            float f4 = pnfVar2 == pnf.a ? 0.0f : 20.0f;
            e eVarS = g.s(eVarA, 0.0f, f);
            ob2 ob2VarA = mb2.a(vs0.c, bVar2, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarS);
            gl2.j.getClass();
            pm8.a aVar3 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ob2VarA, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            gl2.a.e eVar3 = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar3);
            cVarH.L(-488685020);
            c(androidx.compose.foundation.layout.f.h(f.a(aVar2, str3.concat("_TriangleEnd")), f4, 0.0f, 2), (((long) Float.floatToRawIntBits(8.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(12.0f)) << 32), cVarH, 48);
            cVarH.U(false);
            ehd ehdVarA = chd.a(vs0.a, c20.a.k, cVarH, 48);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, aVar2);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar3);
            cVarH.L(-378912996);
            cVarH.U(false);
            e eVarB = a.b(f.a(aVar2, str3.concat("_Text")), o97Var.c.b.h.a, ggd.a(o97Var.h.b));
            if (o97Var.a >= 7) {
                f2 = 16.0f;
                f3 = 8.0f;
            } else {
                f2 = 8.0f;
                f3 = 8.0f;
            }
            eVar2 = aVar2;
            cif.b(str, androidx.compose.foundation.layout.f.g(eVarB, f2, f3), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.g, o97Var.c.a.f, 0L, o97Var.f.a, null, o97Var.d.a, 0L, 0, 0L, null, null, 0, 16777178), cVarH, i2 & 14, 0, 65532);
            cVarH.L(-378876191);
            cVarH.U(false);
            cVarH.U(true);
            cVarH.L(-488624662);
            cVarH.U(false);
            cVarH.U(true);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            final pnf pnfVar3 = pnfVar2;
            final e eVar4 = eVar2;
            iVarW.d = new Function2(str, pnfVar3, f, eVar4, str2, i) { // from class: zz6
                public final /* synthetic */ String a;
                public final /* synthetic */ pnf b;
                public final /* synthetic */ float c;
                public final /* synthetic */ e d;
                public final /* synthetic */ String e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    b07.a(this.a, this.b, this.c, this.d, this.e, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final java.lang.String r15, final defpackage.pnf r16, final defpackage.fe1 r17, androidx.compose.ui.e r18, float r19, java.lang.String r20, defpackage.ah2 r21, androidx.compose.runtime.b r22, final int r23, final int r24) {
        /*
            r2 = r16
            r15.getClass()
            r17.getClass()
            r0 = -371582464(0xffffffffe9da1a00, float:-3.2958576E25)
            r1 = r22
            androidx.compose.runtime.c r10 = r1.h(r0)
            boolean r0 = r10.K(r15)
            if (r0 == 0) goto L19
            r0 = 4
            goto L1a
        L19:
            r0 = 2
        L1a:
            r0 = r23 | r0
            r3 = r17
            boolean r1 = r10.K(r3)
            if (r1 == 0) goto L27
            r1 = 2048(0x800, float:2.87E-42)
            goto L29
        L27:
            r1 = 1024(0x400, float:1.435E-42)
        L29:
            r0 = r0 | r1
            r1 = 221184(0x36000, float:3.09945E-40)
            r1 = r1 | r0
            r4 = r24 & 64
            if (r4 == 0) goto L39
            r1 = 1794048(0x1b6000, float:2.513997E-39)
            r1 = r1 | r0
        L36:
            r0 = r20
            goto L4d
        L39:
            r0 = 1572864(0x180000, float:2.204052E-39)
            r0 = r23 & r0
            if (r0 != 0) goto L36
            r0 = r20
            boolean r5 = r10.K(r0)
            if (r5 == 0) goto L4a
            r5 = 1048576(0x100000, float:1.469368E-39)
            goto L4c
        L4a:
            r5 = 524288(0x80000, float:7.34684E-40)
        L4c:
            r1 = r1 | r5
        L4d:
            r5 = 4793491(0x492493, float:6.717112E-39)
            r5 = r5 & r1
            r6 = 4793490(0x492492, float:6.71711E-39)
            if (r5 != r6) goto L68
            boolean r5 = r10.i()
            if (r5 != 0) goto L5d
            goto L68
        L5d:
            r10.D()
            r4 = r18
            r5 = r19
            r14 = r21
        L66:
            r6 = r0
            goto Lab
        L68:
            if (r4 == 0) goto L6b
            r0 = 0
        L6b:
            if (r0 != 0) goto L70
            java.lang.String r4 = "IdlTooltipBox"
            goto L71
        L70:
            r4 = r0
        L71:
            androidx.compose.ui.e$a r12 = androidx.compose.ui.e.a.b
            androidx.compose.ui.e r6 = androidx.compose.ui.platform.f.a(r12, r4)
            v r3 = new v
            r3.<init>(r2)
            a07 r5 = new a07
            r13 = 1132593152(0x43820000, float:260.0)
            r5.<init>(r15, r2, r13, r4)
            r4 = 281518902(0x10c7a336, float:7.8743126E-29)
            ah2 r4 = defpackage.bh2.c(r4, r5, r10)
            nl2 r5 = new nl2
            r14 = r21
            r5.<init>(r14)
            r7 = 391336699(0x175352fb, float:6.8282513E-25)
            ah2 r9 = defpackage.bh2.c(r7, r5, r10)
            int r1 = r1 >> 3
            r1 = r1 & 896(0x380, float:1.256E-42)
            r5 = 1572912(0x180030, float:2.204119E-39)
            r11 = r1 | r5
            r7 = 0
            r8 = 0
            r5 = r17
            defpackage.ee1.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r4 = r12
            r5 = r13
            goto L66
        Lab:
            androidx.compose.runtime.i r10 = r10.W()
            if (r10 == 0) goto Lc0
            yz6 r0 = new yz6
            r1 = r15
            r3 = r17
            r8 = r23
            r9 = r24
            r7 = r14
            r0.<init>()
            r10.d = r0
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b07.b(java.lang.String, pnf, fe1, androidx.compose.ui.e, float, java.lang.String, ah2, androidx.compose.runtime.b, int, int):void");
    }

    public static final void c(final e eVar, final long j, b bVar, final int i) {
        c cVarH = bVar.h(-1389020163);
        if ((((cVarH.K(eVar) ? 4 : 2) | i) & 19) == 18 && cVarH.i()) {
            cVarH.D();
        } else {
            final o97 o97Var = (o97) cVarH.M(p97.a);
            e eVarO = g.o(eVar, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)));
            cVarH.L(-1633490746);
            boolean zX = cVarH.x(o97Var);
            Object objV = cVarH.v();
            if (zX || objV == b.a.a) {
                objV = new Function1() { // from class: wz6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        gb4 gb4Var = (gb4) obj;
                        gb4Var.getClass();
                        long j2 = j;
                        float fT1 = gb4Var.t1(Float.intBitsToFloat((int) (j2 >> 32)));
                        float fT12 = gb4Var.t1(Float.intBitsToFloat((int) (j2 & 4294967295L)));
                        m80 m80VarA = p80.a();
                        float f = fT1 / 2.0f;
                        m80VarA.j(f, 0.0f);
                        m80VarA.n(0.0f, fT12);
                        m80VarA.n(fT1, fT12);
                        m80VarA.n(f, 0.0f);
                        m80VarA.close();
                        gb4.E0(gb4Var, m80VarA, o97Var.c.b.h.a, 0.0f, null, 60);
                        return j6g.a;
                    }
                };
                cVarH.p(objV);
            }
            cVarH.U(false);
            w74.a(eVarO, (Function1) objV, cVarH, 0);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(j, i) { // from class: xz6
                public final /* synthetic */ long b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(49);
                    b07.c(this.a, this.b, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
