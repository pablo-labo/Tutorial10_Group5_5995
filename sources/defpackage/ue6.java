package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class ue6 {
    public static final void a(final zba zbaVar, final Function1 function1, final boolean z, b bVar, final int i) {
        e.a aVar;
        int i2;
        zbaVar.getClass();
        bca bcaVar = zbaVar.a;
        function1.getClass();
        c cVarH = bVar.h(296742706);
        int i3 = i | (cVarH.K(zbaVar) ? 4 : 2) | (cVarH.x(function1) ? 32 : 16);
        if (cVarH.o(i3 & 1, (i3 & 147) != 146)) {
            String strName = bcaVar.name();
            o97 o97Var = (o97) cVarH.M(p97.a);
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (z2 || objV == c0020a) {
                objV = new rr(5, function1, zbaVar);
                cVarH.p(objV);
            }
            e.a aVar2 = e.a.b;
            e eVarD = androidx.compose.foundation.b.d(aVar2, false, null, null, (gu5) objV, 15);
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = new kd(8);
                cVarH.p(objV2);
            }
            e eVarA = f.a(b5e.b(eVarD, false, (Function1) objV2), "HMB_" + strName);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarA);
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
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            o97.g gVar = o97Var.i;
            o97.a.e eVar2 = o97Var.c.a;
            o97.h hVar = o97Var.j;
            e eVarJ = androidx.compose.foundation.layout.f.j(aVar2, 16.0f, 0.0f, 0.0f, 0.0f, 14);
            ehd ehdVarA = chd.a(vs0.a, c20.a.j, cVarH, 0);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarJ);
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
            ygg.y(cVarH, eVarC2, eVar);
            String str = zbaVar.c;
            tjf tjfVarA = tjf.a(hVar.f, 0L, 0L, to5.d0, null, null, 0L, 0, 0L, null, null, 0, 16777211);
            bca bcaVar2 = bca.Z;
            fif.b(str, f.a(androidx.compose.foundation.layout.f.j(aVar2, 0.0f, (z && bcaVar == bcaVar2) ? 32.0f : 16.0f, 0.0f, 0.0f, 13).o(new LayoutWeightElement(1.0f, true)), "HMB_Label_" + strName), eVar2.c, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVarA, cVarH, 0, 0, 65528);
            cVarH = cVarH;
            if (bcaVar != bcaVar2) {
                cVarH.L(-2068281083);
                aVar = aVar2;
                ev6.b(fv6.I1, f.a(androidx.compose.foundation.layout.f.j(aVar, 16.0f, 16.0f, 16.0f, 0.0f, 8), "HMB_Chevron_" + strName), ar6.Filled, zq6.Md, 0L, null, cVarH, 3462, 48);
            } else {
                aVar = aVar2;
                cVarH.L(-2070875690);
            }
            cVarH.U(false);
            cVarH.U(true);
            String strM = bcaVar == bca.Y ? z3.m(nn0.a.b(d93.a()), " ", d93.f().getDisplayCountry()) : zbaVar.d;
            if (strM != null) {
                cVarH.L(18693244);
                tjf tjfVar = hVar.h;
                i2 = 15360186;
                fif.b(strM, f.a(androidx.compose.foundation.layout.f.j(aVar, 16.0f, 4.0f, 0.0f, (z && bcaVar == bcaVar2) ? 16.0f : 0.0f, 4), "HMB_Subtitle_" + strName), eVar2.c, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar, cVarH, 0, 0, 65528);
                cVarH = cVarH;
            } else {
                i2 = 15360186;
                cVarH.L(15360186);
            }
            cVarH.U(false);
            if (z && bcaVar == bcaVar2) {
                cVarH.L(i2);
            } else {
                cVarH.L(19296318);
                b((bcaVar != bca.d || z) ? 1.0f : 8.0f, l5.l("HMB_Divider_", strName), null, cVarH, 0, 4);
            }
            cVarH.U(false);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(function1, z, i) { // from class: se6
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ boolean c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(385);
                    ue6.a(this.a, this.b, this.c, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final float r17, final java.lang.String r18, defpackage.j94 r19, androidx.compose.runtime.b r20, final int r21, final int r22) {
        /*
            r2 = r18
            r4 = r21
            r0 = -407755776(0xffffffffe7b22400, float:-1.6824906E24)
            r1 = r20
            androidx.compose.runtime.c r10 = r1.h(r0)
            r0 = r4 & 6
            r1 = r17
            if (r0 != 0) goto L1e
            boolean r0 = r10.c(r1)
            if (r0 == 0) goto L1b
            r0 = 4
            goto L1c
        L1b:
            r0 = 2
        L1c:
            r0 = r0 | r4
            goto L1f
        L1e:
            r0 = r4
        L1f:
            boolean r3 = r10.K(r2)
            if (r3 == 0) goto L28
            r3 = 32
            goto L2a
        L28:
            r3 = 16
        L2a:
            r0 = r0 | r3
            r3 = r22 & 4
            if (r3 == 0) goto L34
            r0 = r0 | 384(0x180, float:5.38E-43)
        L31:
            r5 = r19
            goto L46
        L34:
            r5 = r4 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L31
            r5 = r19
            boolean r6 = r10.K(r5)
            if (r6 == 0) goto L43
            r6 = 256(0x100, float:3.59E-43)
            goto L45
        L43:
            r6 = 128(0x80, float:1.794E-43)
        L45:
            r0 = r0 | r6
        L46:
            r6 = r0 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r6 == r7) goto L4e
            r6 = 1
            goto L4f
        L4e:
            r6 = 0
        L4f:
            r7 = r0 & 1
            boolean r6 = r10.o(r7, r6)
            if (r6 == 0) goto L8f
            if (r3 == 0) goto L5b
            r3 = 0
            goto L5c
        L5b:
            r3 = r5
        L5c:
            ne4 r5 = defpackage.p97.a
            java.lang.Object r5 = r10.M(r5)
            o97 r5 = (defpackage.o97) r5
            if (r3 == 0) goto L6a
            float r6 = r3.a
        L68:
            r13 = r6
            goto L6f
        L6a:
            o97$g r6 = r5.i
            r6 = 1098907648(0x41800000, float:16.0)
            goto L68
        L6f:
            r15 = 0
            r16 = 13
            androidx.compose.ui.e$a r11 = androidx.compose.ui.e.a.b
            r12 = 0
            r14 = 0
            androidx.compose.ui.e r6 = androidx.compose.foundation.layout.f.j(r11, r12, r13, r14, r15, r16)
            androidx.compose.ui.e r11 = androidx.compose.ui.platform.f.a(r6, r2)
            o97$a r5 = r5.c
            o97$a$a r5 = r5.b
            long r8 = r5.d
            int r0 = r0 << 6
            r6 = r0 & 896(0x380, float:1.256E-42)
            r7 = 8
            r5 = r1
            defpackage.b84.a(r5, r6, r7, r8, r10, r11)
            goto L93
        L8f:
            r10.D()
            r3 = r5
        L93:
            androidx.compose.runtime.i r6 = r10.W()
            if (r6 == 0) goto La4
            te6 r0 = new te6
            r1 = r17
            r5 = r22
            r0.<init>()
            r6.d = r0
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue6.b(float, java.lang.String, j94, androidx.compose.runtime.b, int, int):void");
    }

    public static final void c(String str, b bVar, int i) {
        c cVarH = bVar.h(-50171710);
        int i2 = i | (cVarH.K(str) ? 4 : 2);
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            String strConcat = "HM_Header_".concat(str);
            e.a aVar = e.a.b;
            e eVarA = f.a(aVar, strConcat);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarA);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
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
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            o97.g gVar = o97Var.i;
            e eVarJ = androidx.compose.foundation.layout.f.j(aVar, 16.0f, 0.0f, 0.0f, 0.0f, 14);
            ehd ehdVarA = chd.a(vs0.a, c20.a.j, cVarH, 0);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarJ);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar);
            fif.b(str, f.a(androidx.compose.foundation.layout.f.j(aVar, 0.0f, 48.0f, 0.0f, 12.0f, 5).o(new LayoutWeightElement(1.0f, true)), "HM_Header_Text_".concat(str)), o97Var.c.a.b, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.g, 0L, 0L, to5.b0, null, null, 0L, 0, 0L, null, null, 0, 16777211), cVarH, i2 & 14, 0, 65528);
            cVarH = cVarH;
            cVarH.U(true);
            b(1.0f, "HM_Header_Divider_".concat(str), new j94(0.0f), cVarH, 390, 0);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new s5(str, i, 6);
        }
    }
}
