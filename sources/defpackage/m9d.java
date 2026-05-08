package defpackage;

import android.net.Uri;
import androidx.compose.animation.i;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.ytc;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class m9d {
    public static final void a(final boolean z, final List list, final String str, final Uri uri, final gu5 gu5Var, final Function1 function1, final gu5 gu5Var2, final gu5 gu5Var3, final boolean z2, final String str2, final Long l, b bVar, final int i) {
        c cVar;
        list.getClass();
        gu5Var.getClass();
        function1.getClass();
        gu5Var3.getClass();
        c cVarH = bVar.h(1630278083);
        int i2 = i | (cVarH.a(z) ? 4 : 2) | (cVarH.x(list) ? 32 : 16) | (cVarH.K(str) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(uri) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(gu5Var) ? 16384 : 8192) | (cVarH.x(function1) ? 131072 : 65536) | 1572864 | (cVarH.x(gu5Var2) ? 8388608 : 4194304) | (cVarH.a(z2) ? 536870912 : 268435456);
        if (cVarH.o(i2 & 1, ((306783379 & i2) == 306783378 && (((cVarH.K(str2) ? (char) 4 : (char) 2) | (cVarH.K(l) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            final o97 o97Var = (o97) cVarH.M(p97.a);
            cVar = cVarH;
            dmd.a(null, bh2.c(941366663, new wra(gu5Var, gu5Var2), cVarH), null, null, null, 0, da2.h, 0L, null, bh2.c(-734976110, new wu5() { // from class: j9d
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    gza gzaVar = (gza) obj;
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    gzaVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= bVar2.K(gzaVar) ? 4 : 2;
                    }
                    if (bVar2.o(iIntValue & 1, (iIntValue & 19) != 18)) {
                        e eVarD = g.d(e.a.b, 1.0f);
                        final o97 o97Var2 = o97Var;
                        e eVarA = f.a(androidx.compose.foundation.layout.f.e(a.b(eVarD, o97Var2.c.b.a, ytc.a), gzaVar), "ResumePreviewScreenContent");
                        Function1 function12 = function1;
                        boolean zK = bVar2.K(function12);
                        Object objV = bVar2.v();
                        b.a.C0020a c0020a = b.a.a;
                        if (zK || objV == c0020a) {
                            objV = new ej4(function12, 3);
                            bVar2.p(objV);
                        }
                        e eVarA2 = s.a(eVarA, (Function1) objV);
                        Object objV2 = bVar2.v();
                        if (objV2 == c0020a) {
                            objV2 = new e3a();
                            bVar2.p(objV2);
                        }
                        d3a d3aVar = (d3a) objV2;
                        final gu5 gu5Var4 = gu5Var3;
                        boolean zK2 = bVar2.K(gu5Var4);
                        Object objV3 = bVar2.v();
                        if (zK2 || objV3 == c0020a) {
                            objV3 = new ld(11, gu5Var4);
                            bVar2.p(objV3);
                        }
                        e eVarB = androidx.compose.foundation.b.b(eVarA2, d3aVar, null, false, null, null, (gu5) objV3, 28);
                        final boolean z3 = z;
                        final Uri uri2 = uri;
                        final List list2 = list;
                        final String str3 = str;
                        final boolean z4 = z2;
                        final String str4 = str2;
                        final Long l2 = l;
                        l0f.a(eVarB, null, 0L, 0L, 0.0f, 0.0f, null, bh2.c(-553405481, new Function2() { // from class: l9d
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                b bVar3 = (b) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (bVar3.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    long j = o97Var2.c.b.c;
                                    ytc.a aVar = ytc.a;
                                    e.a aVar2 = e.a.b;
                                    e eVarB2 = a.b(aVar2, j, aVar);
                                    af1 af1Var = c20.a.a;
                                    ag9 ag9VarD = hl1.d(af1Var, false);
                                    int iHashCode = Long.hashCode(bVar3.k());
                                    t8b t8bVarM = bVar3.m();
                                    e eVarC = androidx.compose.ui.c.c(bVar3, eVarB2);
                                    gl2.j.getClass();
                                    pm8.a aVar3 = gl2.a.b;
                                    if (bVar3.j() == null) {
                                        pg8.B();
                                        throw null;
                                    }
                                    bVar3.B();
                                    if (bVar3.f()) {
                                        bVar3.y(aVar3);
                                    } else {
                                        bVar3.n();
                                    }
                                    gl2.a.d dVar = gl2.a.g;
                                    ygg.y(bVar3, ag9VarD, dVar);
                                    gl2.a.f fVar = gl2.a.f;
                                    ygg.y(bVar3, t8bVarM, fVar);
                                    gl2.a.C0251a c0251a = gl2.a.j;
                                    if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode))) {
                                        uz.g(iHashCode, bVar3, iHashCode, c0251a);
                                    }
                                    gl2.a.e eVar = gl2.a.d;
                                    ygg.y(bVar3, eVarC, eVar);
                                    e eVarD2 = g.d(aVar2, 1.0f);
                                    ob2 ob2VarA = mb2.a(vs0.e, c20.a.m, bVar3, 6);
                                    int iHashCode2 = Long.hashCode(bVar3.k());
                                    t8b t8bVarM2 = bVar3.m();
                                    e eVarC2 = androidx.compose.ui.c.c(bVar3, eVarD2);
                                    if (bVar3.j() == null) {
                                        pg8.B();
                                        throw null;
                                    }
                                    bVar3.B();
                                    if (bVar3.f()) {
                                        bVar3.y(aVar3);
                                    } else {
                                        bVar3.n();
                                    }
                                    ygg.y(bVar3, ob2VarA, dVar);
                                    ygg.y(bVar3, t8bVarM2, fVar);
                                    if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode2))) {
                                        uz.g(iHashCode2, bVar3, iHashCode2, c0251a);
                                    }
                                    ygg.y(bVar3, eVarC2, eVar);
                                    boolean z5 = z3;
                                    b.a.C0020a c0020a2 = b.a.a;
                                    if (z5) {
                                        bVar3.L(562226186);
                                        la5.a(0, bVar3);
                                        bVar3.F();
                                    } else {
                                        Uri uri3 = uri2;
                                        if (uri3 != null) {
                                            bVar3.L(562228378);
                                            rmb.a(uri3, bVar3, 0);
                                            bVar3.F();
                                        } else {
                                            List list3 = list2;
                                            if (list3.isEmpty()) {
                                                String str5 = str3;
                                                if (str5 != null) {
                                                    bVar3.L(562239837);
                                                    Object objV4 = bVar3.v();
                                                    if (objV4 == c0020a2) {
                                                        objV4 = new cn0(21);
                                                        bVar3.p(objV4);
                                                    }
                                                    pmb.b(390, (gu5) objV4, bVar3, str5);
                                                    bVar3.F();
                                                } else {
                                                    bVar3.L(562247183);
                                                    e9d.a(0, bVar3);
                                                    bVar3.F();
                                                }
                                            } else {
                                                bVar3.L(562231398);
                                                Object objV5 = bVar3.v();
                                                if (objV5 == c0020a2) {
                                                    objV5 = new ym0(14);
                                                    bVar3.p(objV5);
                                                }
                                                pmb.a(false, list3, (gu5) objV5, bVar3, 390);
                                                bVar3.F();
                                            }
                                        }
                                    }
                                    bVar3.q();
                                    e eVarH = androidx.compose.foundation.layout.b.a.h(aVar2, c20.a.h);
                                    ag9 ag9VarD2 = hl1.d(af1Var, false);
                                    int iHashCode3 = Long.hashCode(bVar3.k());
                                    t8b t8bVarM3 = bVar3.m();
                                    e eVarC3 = androidx.compose.ui.c.c(bVar3, eVarH);
                                    if (bVar3.j() == null) {
                                        pg8.B();
                                        throw null;
                                    }
                                    bVar3.B();
                                    if (bVar3.f()) {
                                        bVar3.y(aVar3);
                                    } else {
                                        bVar3.n();
                                    }
                                    ygg.y(bVar3, ag9VarD2, dVar);
                                    ygg.y(bVar3, t8bVarM3, fVar);
                                    if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode3))) {
                                        uz.g(iHashCode3, bVar3, iHashCode3, c0251a);
                                    }
                                    ygg.y(bVar3, eVarC3, eVar);
                                    Object objV6 = bVar3.v();
                                    if (objV6 == c0020a2) {
                                        objV6 = new kd(9);
                                        bVar3.p(objV6);
                                    }
                                    mv4 mv4VarK = ku4.k((Function1) objV6, 1);
                                    Object objV7 = bVar3.v();
                                    if (objV7 == c0020a2) {
                                        objV7 = new kd(9);
                                        bVar3.p(objV7);
                                    }
                                    i.e(z4, null, mv4VarK, ku4.m((Function1) objV7, 1), null, bh2.c(-796072133, new mlb(2, str4, l2, gu5Var4), bVar3), bVar3, 200064, 18);
                                    bVar3.q();
                                    bVar3.q();
                                } else {
                                    bVar3.D();
                                }
                                return j6g.a;
                            }
                        }, bVar2), bVar2, 12582912, 126);
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVar, 806879280, 445);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        androidx.compose.runtime.i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z, list, str, uri, gu5Var, function1, gu5Var2, gu5Var3, z2, str2, l, i) { // from class: k9d
                public final /* synthetic */ gu5 V;
                public final /* synthetic */ gu5 W;
                public final /* synthetic */ boolean X;
                public final /* synthetic */ String Y;
                public final /* synthetic */ Long Z;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ List b;
                public final /* synthetic */ String c;
                public final /* synthetic */ Uri d;
                public final /* synthetic */ gu5 e;
                public final /* synthetic */ Function1 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(100663297);
                    m9d.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, this.X, this.Y, this.Z, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(gu5 gu5Var, gu5 gu5Var2, b bVar, int i) {
        gu5Var.getClass();
        c cVarH = bVar.h(-1435291110);
        int i2 = (cVarH.x(gu5Var) ? 4 : 2) | i | (cVarH.x(gu5Var2) ? 32 : 16);
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            iv6.a(bh2.c(2039107364, new nq0((o97) cVarH.M(p97.a), 3), cVarH), f.a(e.a.b, "ResumePreviewTopNav"), false, null, false, null, bh2.c(-475134083, new x00(3, gu5Var2), cVarH), bh2.c(-220744676, new vr2(2, gu5Var), cVarH), cVarH, 113246262, 124);
        } else {
            cVarH.D();
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new e8c(i, 1, gu5Var, gu5Var2);
        }
    }
}
