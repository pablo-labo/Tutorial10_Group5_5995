package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.draw.a;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class pcf {
    public static final pxc a = new pxc("^\\t(\\d+)\\.\\s");

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final jhf jhfVar, final Function1 function1, final Function1 function12, final lcf lcfVar, final Function1 function13, final boolean z, sm5 sm5Var, jcf jcfVar, b bVar, final int i) {
        final sm5 sm5Var2;
        final jcf jcfVar2;
        int i2;
        jcf jcfVar3;
        sm5 sm5Var3;
        Object oy4Var;
        char c;
        String str;
        int i3;
        int i4;
        gl2.a.C0251a c0251a;
        lcf lcfVar2;
        int i5;
        final jhf jhfVar2;
        jcf jcfVar4;
        Function1 function14;
        Function1 function15;
        final boolean z2;
        jhfVar.getClass();
        function1.getClass();
        function12.getClass();
        lcfVar.getClass();
        function13.getClass();
        c cVarH = bVar.h(-396979698);
        int i6 = i | (cVarH.K(jhfVar) ? 4 : 2);
        if ((i & 48) == 0) {
            i6 |= cVarH.x(function1) ? 32 : 16;
        }
        int i7 = i6 | (cVarH.d(lcfVar.ordinal()) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.a(z) ? 131072 : 65536) | 13107200;
        if (cVarH.o(i7 & 1, (4793491 & i7) != 4793490)) {
            cVarH.v0();
            if ((i & 1) == 0 || cVarH.c0()) {
                sm5 sm5Var4 = new sm5();
                i2 = i7 & (-3670017);
                jcfVar3 = jcf.a;
                sm5Var3 = sm5Var4;
            } else {
                cVarH.D();
                i2 = i7 & (-3670017);
                sm5Var3 = sm5Var;
                jcfVar3 = jcfVar;
            }
            cVarH.V();
            final o97 o97Var = (o97) cVarH.M(p97.a);
            String strI = ak2.I(R.string.desc_bulleted_list_mode_toggle, cVarH);
            String strI2 = ak2.I(R.string.desc_number_list_mode_toggle, cVarH);
            String strI3 = ak2.I(R.string.desc_clear_text_input, cVarH);
            e.a aVar = e.a.b;
            e eVarG = f.g(aVar, 0.5f, 8.0f);
            vs0.k kVar = vs0.c;
            af1.a aVar2 = c20.a.m;
            ob2 ob2VarA = mb2.a(kVar, aVar2, cVarH, 0);
            jcf jcfVar5 = jcfVar3;
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarG);
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
            gl2.a.C0251a c0251a2 = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a2);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            e eVarF = g.f(aVar, 1.0f);
            o97.a aVar4 = o97Var.c;
            o97.a.b bVar2 = aVar4.c;
            final long j = aVar4.c.a;
            Map<String, String> map = v1c.a;
            eVarF.getClass();
            final boolean z3 = false;
            final boolean z4 = true;
            e eVarF2 = f.f(eVarF.o(a.a(aVar, new Function1() { // from class: u1c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    gb4 gb4Var;
                    long j2;
                    gb4 gb4Var2 = (gb4) obj;
                    gb4Var2.getClass();
                    float fT1 = gb4Var2.t1(1.0f);
                    float fT12 = gb4Var2.t1(12.0f);
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (gb4Var2.c() >> 32));
                    boolean z5 = z4;
                    long j3 = j;
                    if (z5) {
                        gb4Var2.W(j3, (((long) Float.floatToRawIntBits(fT12)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat - fT12)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), fT1, (496 & 16) != 0 ? 0 : 0);
                        gb4Var2.W(j3, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fT12)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gb4Var2.c() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), fT1, (496 & 16) != 0 ? 0 : 0);
                        gb4Var2.W(j3, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fT12)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gb4Var2.c() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), fT1, (496 & 16) != 0 ? 0 : 0);
                        float f = 2.0f * fT12;
                        gb4Var2.Q(j3, 180.0f, 90.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (832 & 64) != 0 ? 1.0f : 0.0f, new bwe(fT1, 0.0f, 0, 0, null, 30));
                        gb4Var2.Q(j3, 270.0f, 90.0f, (((long) Float.floatToRawIntBits(fIntBitsToFloat - f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (832 & 64) != 0 ? 1.0f : 0.0f, new bwe(fT1, 0.0f, 0, 0, null, 30));
                    } else {
                        gb4Var2.W(j3, (((long) Float.floatToRawIntBits(fT12)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gb4Var2.c() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat - fT12)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gb4Var2.c() & 4294967295L)))) & 4294967295L), fT1, (496 & 16) != 0 ? 0 : 0);
                        if (z3) {
                            gb4Var = gb4Var2;
                            j2 = j3;
                            gb4Var.W(j2, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), fT1, (496 & 16) != 0 ? 0 : 0);
                        } else {
                            gb4Var = gb4Var2;
                            j2 = j3;
                        }
                        gb4Var.W(j2, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gb4Var.c() & 4294967295L)) - fT12)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), fT1, (496 & 16) != 0 ? 0 : 0);
                        gb4Var.W(j2, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gb4Var.c() & 4294967295L)) - fT12)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), fT1, (496 & 16) != 0 ? 0 : 0);
                        float f2 = fT12 * 2.0f;
                        gb4Var.Q(j2, 180.0f, -90.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gb4Var.c() & 4294967295L)) - f2)) & 4294967295L), (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (832 & 64) != 0 ? 1.0f : 0.0f, new bwe(fT1, 0.0f, 0, 0, null, 30));
                        gb4Var.Q(j2, 90.0f, -90.0f, (((long) Float.floatToRawIntBits(fIntBitsToFloat - f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gb4Var.c() & 4294967295L)) - f2)) & 4294967295L), (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (832 & 64) != 0 ? 1.0f : 0.0f, new bwe(fT1, 0.0f, 0, 0, null, 30));
                    }
                    return j6g.a;
                }
            })), 4.0f);
            vs0.g gVar = vs0.g;
            af1.b bVar3 = c20.a.j;
            ehd ehdVarA = chd.a(gVar, bVar3, cVarH, 6);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarF2);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a2);
            }
            ygg.y(cVarH, eVarC2, eVar);
            ehd ehdVarA2 = chd.a(vs0.a, bVar3, cVarH, 0);
            int iHashCode3 = Long.hashCode(cVarH.T);
            t8b t8bVarP3 = cVarH.P();
            e eVarC3 = androidx.compose.ui.c.c(cVarH, aVar);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA2, dVar);
            ygg.y(cVarH, t8bVarP3, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode3))) {
                ja.h(iHashCode3, cVarH, iHashCode3, c0251a2);
            }
            ygg.y(cVarH, eVarC3, eVar);
            fv6 fv6Var = fv6.w6;
            nq6 nq6VarE = e(lcfVar == lcf.b, cVarH, 0);
            e eVarA = androidx.compose.ui.platform.f.a(aVar, "NumberedListButton");
            boolean zK = cVarH.K(strI2);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zK || objV == c0020a) {
                objV = new jb8(strI2, 2);
                cVarH.p(objV);
            }
            e eVarB = b5e.b(eVarA, false, (Function1) objV);
            int i8 = i2 & 7168;
            int i9 = i2 & 112;
            int i10 = i2 & 14;
            boolean z5 = (i8 == 2048) | (i9 == 32) | (i10 == 4);
            Object objV2 = cVarH.v();
            if (z5 || objV2 == c0020a) {
                c = 4;
                str = strI;
                i3 = i8;
                i4 = i10;
                c0251a = c0251a2;
                lcfVar2 = lcfVar;
                i5 = 0;
                jhfVar2 = jhfVar;
                jcfVar4 = jcfVar5;
                oy4Var = new oy4(lcfVar2, function12, function1, jhfVar2, 1);
                function14 = function12;
                function15 = function1;
                cVarH.p(oy4Var);
            } else {
                str = strI;
                i4 = i10;
                i3 = i8;
                oy4Var = objV2;
                c0251a = c0251a2;
                c = 4;
                lcfVar2 = lcfVar;
                i5 = 0;
                jhfVar2 = jhfVar;
                function15 = function1;
                function14 = function12;
                jcfVar4 = jcfVar5;
            }
            jcf jcfVar6 = jcfVar4;
            int i11 = i5;
            du6.a(fv6Var, (gu5) oy4Var, eVarB, null, false, nq6VarE, cVarH, 6);
            fv6 fv6Var2 = fv6.e1;
            nq6 nq6VarE2 = e(lcfVar2 == lcf.a ? 1 : i11, cVarH, i11);
            e eVarA2 = androidx.compose.ui.platform.f.a(aVar, "BulletedListButton");
            String str2 = str;
            boolean zK2 = cVarH.K(str2);
            Object objV3 = cVarH.v();
            if (zK2 || objV3 == c0020a) {
                objV3 = new a23(str2, 4);
                cVarH.p(objV3);
            }
            e eVarB2 = b5e.b(eVarA2, false, (Function1) objV3);
            boolean z6 = (i9 == 32) | (i3 == 2048) | (i4 == 4);
            Object objV4 = cVarH.v();
            if (z6 || objV4 == c0020a) {
                objV4 = new jc(lcfVar2, function14, function15, jhfVar2);
                cVarH.p(objV4);
            }
            du6.a(fv6Var2, (gu5) objV4, eVarB2, null, false, nq6VarE2, cVarH, 6);
            cVarH.U(true);
            if (jhfVar2.a.b.length() > 0) {
                cVarH.L(1252448343);
                fv6 fv6Var3 = fv6.M9;
                nq6 nq6VarE3 = e(false, cVarH, 1);
                e eVarA3 = androidx.compose.ui.platform.f.a(aVar, "ClearListButton");
                boolean zK3 = cVarH.K(strI3);
                Object objV5 = cVarH.v();
                if (zK3 || objV5 == c0020a) {
                    objV5 = new b05(strI3, 2);
                    cVarH.p(objV5);
                }
                e eVarB3 = b5e.b(eVarA3, false, (Function1) objV5);
                boolean z7 = i9 == 32;
                Object objV6 = cVarH.v();
                if (z7 || objV6 == c0020a) {
                    objV6 = new ti(11, function14, function15);
                    cVarH.p(objV6);
                }
                du6.a(fv6Var3, (gu5) objV6, eVarB3, null, false, nq6VarE3, cVarH, 6);
                z2 = false;
            } else {
                z2 = false;
                cVarH.L(1246026042);
            }
            cVarH.U(z2);
            final boolean z8 = true;
            cVarH.U(true);
            e eVarF3 = g.f(aVar, 1.0f);
            final long j2 = z ? bVar2.d : bVar2.a;
            eVarF3.getClass();
            e eVarF4 = f.f(eVarF3.o(a.a(aVar, new Function1() { // from class: u1c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    gb4 gb4Var;
                    long j22;
                    gb4 gb4Var2 = (gb4) obj;
                    gb4Var2.getClass();
                    float fT1 = gb4Var2.t1(1.0f);
                    float fT12 = gb4Var2.t1(12.0f);
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (gb4Var2.c() >> 32));
                    boolean z52 = z2;
                    long j3 = j2;
                    if (z52) {
                        gb4Var2.W(j3, (((long) Float.floatToRawIntBits(fT12)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat - fT12)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), fT1, (496 & 16) != 0 ? 0 : 0);
                        gb4Var2.W(j3, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fT12)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gb4Var2.c() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), fT1, (496 & 16) != 0 ? 0 : 0);
                        gb4Var2.W(j3, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fT12)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gb4Var2.c() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), fT1, (496 & 16) != 0 ? 0 : 0);
                        float f = 2.0f * fT12;
                        gb4Var2.Q(j3, 180.0f, 90.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (832 & 64) != 0 ? 1.0f : 0.0f, new bwe(fT1, 0.0f, 0, 0, null, 30));
                        gb4Var2.Q(j3, 270.0f, 90.0f, (((long) Float.floatToRawIntBits(fIntBitsToFloat - f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (832 & 64) != 0 ? 1.0f : 0.0f, new bwe(fT1, 0.0f, 0, 0, null, 30));
                    } else {
                        gb4Var2.W(j3, (((long) Float.floatToRawIntBits(fT12)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gb4Var2.c() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat - fT12)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gb4Var2.c() & 4294967295L)))) & 4294967295L), fT1, (496 & 16) != 0 ? 0 : 0);
                        if (z8) {
                            gb4Var = gb4Var2;
                            j22 = j3;
                            gb4Var.W(j22, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), fT1, (496 & 16) != 0 ? 0 : 0);
                        } else {
                            gb4Var = gb4Var2;
                            j22 = j3;
                        }
                        gb4Var.W(j22, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gb4Var.c() & 4294967295L)) - fT12)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), fT1, (496 & 16) != 0 ? 0 : 0);
                        gb4Var.W(j22, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gb4Var.c() & 4294967295L)) - fT12)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), fT1, (496 & 16) != 0 ? 0 : 0);
                        float f2 = fT12 * 2.0f;
                        gb4Var.Q(j22, 180.0f, -90.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gb4Var.c() & 4294967295L)) - f2)) & 4294967295L), (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (832 & 64) != 0 ? 1.0f : 0.0f, new bwe(fT1, 0.0f, 0, 0, null, 30));
                        gb4Var.Q(j22, 90.0f, -90.0f, (((long) Float.floatToRawIntBits(fIntBitsToFloat - f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gb4Var.c() & 4294967295L)) - f2)) & 4294967295L), (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (832 & 64) != 0 ? 1.0f : 0.0f, new bwe(fT1, 0.0f, 0, 0, null, 30));
                    }
                    return j6g.a;
                }
            })), 16.0f);
            if (jcfVar6 == jcf.b) {
                eVarF4 = eVarF4.o(g.b(aVar, 206.0f, 1));
            }
            ob2 ob2VarA2 = mb2.a(new vs0.i(4.0f, true, new us0(0)), aVar2, cVarH, 0);
            int iHashCode4 = Long.hashCode(cVarH.T);
            t8b t8bVarP4 = cVarH.P();
            e eVarC4 = androidx.compose.ui.c.c(cVarH, eVarF4);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA2, dVar);
            ygg.y(cVarH, t8bVarP4, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode4))) {
                ja.h(iHashCode4, cVarH, iHashCode4, c0251a);
            }
            ygg.y(cVarH, eVarC4, eVar);
            ne4 ne4Var = rjf.a;
            long j3 = bVar2.f.b;
            i6c i6cVarA = ne4Var.a(new qjf(j3, da2.b(j3, 0.2f)));
            final lcf lcfVar3 = lcfVar2;
            final Function1 function16 = function14;
            final Function1 function17 = function15;
            final sm5 sm5Var5 = sm5Var3;
            rm2.a(i6cVarA, bh2.c(-979618630, new Function2() { // from class: mcf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    final jhf jhfVar3;
                    b bVar4 = (b) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (bVar4.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                        o97 o97Var2 = o97Var;
                        o97.h hVar = o97Var2.j;
                        o97.a.e eVar2 = o97Var2.c.a;
                        tjf tjfVarA = tjf.a(hVar.f, eVar2.c, 0L, null, null, e07.a, 0L, 0, 0L, null, null, 0, 16777182);
                        e eVarA4 = androidx.compose.ui.focus.c.a(g.f(androidx.compose.ui.platform.f.a(g.q(e.a.b, 0.0f, 0.0f, 488.0f, 0.0f, 11), "TextAreaWithBasicLists_TextField"), 1.0f), sm5Var5);
                        Function1 function18 = function13;
                        boolean zK4 = bVar4.K(function18);
                        Object objV7 = bVar4.v();
                        b.a.C0020a c0020a2 = b.a.a;
                        if (zK4 || objV7 == c0020a2) {
                            objV7 = new a3(function18, 24);
                            bVar4.p(objV7);
                        }
                        e eVarA5 = androidx.compose.ui.focus.a.a(eVarA4, (Function1) objV7);
                        kne kneVar = new kne(eVar2.g.c);
                        jhf jhfVar4 = jhfVar2;
                        boolean zK5 = bVar4.K(jhfVar4);
                        final boolean z9 = z;
                        boolean zA = zK5 | bVar4.a(z9);
                        final Function1 function19 = function17;
                        boolean zK6 = zA | bVar4.K(function19);
                        final lcf lcfVar4 = lcfVar3;
                        boolean zD = zK6 | bVar4.d(lcfVar4.ordinal());
                        final Function1 function110 = function16;
                        boolean zK7 = zD | bVar4.K(function110);
                        Object objV8 = bVar4.v();
                        if (zK7 || objV8 == c0020a2) {
                            jhfVar3 = jhfVar4;
                            Function1 function111 = new Function1() { // from class: ocf
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) throws IOException {
                                    jhf jhfVar5 = (jhf) obj3;
                                    jhfVar5.getClass();
                                    jhf jhfVar6 = jhfVar3;
                                    String str3 = jhfVar6.a.b;
                                    le0 le0Var = jhfVar5.a;
                                    String str4 = le0Var.b;
                                    long j4 = jhfVar5.b;
                                    int i12 = kjf.c;
                                    int i13 = (int) (j4 >> 32);
                                    boolean zB = wl7.b(str3, str4);
                                    Function1 function112 = function19;
                                    if (!zB) {
                                        boolean z10 = str4.length() > str3.length();
                                        Character chY0 = awe.y0(str4, i13 - 1);
                                        boolean z11 = chY0 != null && chY0.charValue() == '\n';
                                        Function1 function113 = function110;
                                        if (z10 && z11) {
                                            jhfVar5 = pcf.d(str4, i13, lcfVar4, function113);
                                        } else if (str4.length() < str3.length()) {
                                            String str5 = jhfVar6.a.b;
                                            int i14 = (int) (jhfVar6.b >> 32);
                                            String strG = pcf.g((String) new ArrayList(zve.k0(str5, new String[]{"\n"})).get(zve.k0(str5.substring(0, i14), new String[]{"\n"}).size() - 1));
                                            int iV = zve.V(str5.substring(0, i14), '\n', 0, 6) + 1;
                                            if (strG.length() > 0 && i14 == strG.length() + iV) {
                                                function113.invoke(lcf.c);
                                                String string = zve.c0(str5, iV, strG.length() + iV).toString();
                                                int length = i14 - strG.length();
                                                jhfVar5 = new jhf(string, cr8.c(length, length), 4);
                                            }
                                        }
                                        function112.invoke(jhfVar5);
                                    } else if (z9) {
                                        function112.invoke(jhfVar5);
                                    } else {
                                        int length2 = le0Var.b.length();
                                        function112.invoke(jhf.a(jhfVar5, null, cr8.c(length2, length2), 5));
                                    }
                                    return j6g.a;
                                }
                            };
                            bVar4.p(function111);
                            objV8 = function111;
                        } else {
                            jhfVar3 = jhfVar4;
                        }
                        cd1.a(jhfVar3, (Function1) objV8, eVarA5, false, false, tjfVarA, null, null, false, 0, 3, null, null, null, kneVar, null, bVar4, 0, 6, 48088);
                    } else {
                        bVar4.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, 56);
            cVarH.U(true);
            cVarH.U(true);
            sm5Var2 = sm5Var5;
            jcfVar2 = jcfVar6;
        } else {
            cVarH.D();
            sm5Var2 = sm5Var;
            jcfVar2 = jcfVar;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: ncf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pcf.a(jhfVar, function1, function12, lcfVar, function13, z, sm5Var2, jcfVar2, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(int i, String str, ArrayList arrayList) {
        Integer numF;
        int iIntValue = (i <= 0 || (numF = f(g((String) arrayList.get(i + (-1))))) == null) ? 0 : numF.intValue();
        if (f(g(str)) == null) {
            arrayList.set(i, v40.c(iIntValue + 1, "\t", ". ", str));
        }
    }

    public static final void c(Function1<? super jhf, j6g> function1, jhf jhfVar, lcf lcfVar, lcf lcfVar2) {
        String str = jhfVar.a.b;
        long j = jhfVar.b;
        int i = kjf.c;
        int i2 = (int) (j >> 32);
        int size = zve.k0(str.substring(0, i2), new String[]{"\n"}).size() - 1;
        if (size >= 0) {
            ArrayList arrayList = new ArrayList(zve.k0(str, new String[]{"\n"}));
            String str2 = (String) arrayList.get(size);
            lcf lcfVar3 = lcf.c;
            if (lcfVar2 == lcfVar3) {
                String strG = g(str2);
                arrayList.set(size, wve.I(str2, strG, ""));
                String strW0 = z92.W0(arrayList, "\n", null, null, null, 62);
                int iMax = Math.max(i2 - strG.length(), 0);
                function1.invoke(new jhf(strW0, cr8.c(iMax, iMax), 4));
                return;
            }
            lcf lcfVar4 = lcf.b;
            if (lcfVar == lcfVar3 && lcfVar2 == lcfVar4) {
                b(size, str2, arrayList);
                String strW02 = z92.W0(arrayList, "\n", null, null, null, 62);
                int length = (strW02.length() - str.length()) + i2;
                function1.invoke(new jhf(strW02, cr8.c(length, length), 4));
                return;
            }
            lcf lcfVar5 = lcf.a;
            if (lcfVar == lcfVar3 && lcfVar2 == lcfVar5) {
                if (!wve.K(str2, "\t• ", false)) {
                    arrayList.set(size, "\t• ".concat(str2));
                }
                String strW03 = z92.W0(arrayList, "\n", null, null, null, 62);
                int length2 = (strW03.length() - str.length()) + i2;
                function1.invoke(new jhf(strW03, cr8.c(length2, length2), 4));
                return;
            }
            if (lcfVar == lcfVar5 && lcfVar2 == lcfVar4) {
                arrayList.set(size, wve.I(str, g(str2), ""));
                b(size, str2, arrayList);
                String strW04 = z92.W0(arrayList, "\n", null, null, null, 62);
                int length3 = (strW04.length() - str.length()) + i2;
                function1.invoke(new jhf(strW04, cr8.c(length3, length3), 4));
                return;
            }
            if (lcfVar == lcfVar4 && lcfVar2 == lcfVar5) {
                arrayList.set(size, wve.I(str, g(str2), ""));
                if (!wve.K(str2, "\t• ", false)) {
                    arrayList.set(size, "\t• ".concat(str2));
                }
                String strW05 = z92.W0(arrayList, "\n", null, null, null, 62);
                int length4 = (strW05.length() - str.length()) + i2;
                function1.invoke(new jhf(strW05, cr8.c(length4, length4), 4));
            }
        }
    }

    public static final jhf d(String str, int i, lcf lcfVar, Function1<? super lcf, j6g> function1) throws IOException {
        int size = zve.k0(str.substring(0, i), new String[]{"\n"}).size();
        int i2 = size - 1;
        if (i2 < 0) {
            return new jhf(str, cr8.c(i, i), 4);
        }
        ArrayList arrayList = new ArrayList(zve.k0(str, new String[]{"\n"}));
        String str2 = (String) arrayList.get(i2);
        int iOrdinal = lcfVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                b(i2, str2, arrayList);
            } else if (i2 > 0) {
                String strG = g((String) arrayList.get(size - 2));
                Integer numF = f(strG);
                if (strG.equals("\t• ")) {
                    lcf lcfVar2 = lcf.a;
                    function1.invoke(lcfVar2);
                    return d(str, i, lcfVar2, function1);
                }
                if (numF != null) {
                    lcf lcfVar3 = lcf.b;
                    function1.invoke(lcfVar3);
                    return d(str, i, lcfVar3, function1);
                }
            }
        } else if (!wve.K(str2, "\t• ", false)) {
            arrayList.set(i2, "\t• ".concat(str2));
        }
        String strW0 = z92.W0(arrayList, "\n", null, null, null, 62);
        int length = (strW0.length() - str.length()) + i;
        return new jhf(strW0, cr8.c(length, length), 4);
    }

    public static final nq6 e(boolean z, b bVar, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        return pq6.a(0L, z ? eu6.c : eu6.k, 0L, 0L, bVar, 13);
    }

    public static final Integer f(String str) {
        String str2;
        ke9 ke9VarA = new pxc("^\\t(\\d+)\\.\\s").a(str, 0);
        if (ke9VarA == null || (str2 = (String) z92.Z0(ke9VarA.a())) == null) {
            return null;
        }
        return vve.B(10, str2);
    }

    public static final String g(String str) {
        if (wve.K(str, "\t• ", false)) {
            return "\t• ";
        }
        ke9 ke9VarA = a.a(str, 0);
        return (ke9VarA != null ? (String) z92.Z0(ke9VarA.a()) : null) != null ? zve.q0(str, " ").concat(" ") : "";
    }
}
