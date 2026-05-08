package defpackage;

import android.os.Bundle;
import androidx.compose.animation.i;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.f;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.d;
import androidx.navigation.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.wl7;
import defpackage.xz8;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class w1e {
    public static final void a(final x1e x1eVar, final at8 at8Var, final fnf fnfVar, final jta jtaVar, final gu5 gu5Var, final gu5 gu5Var2, final Function2 function2, final Function1 function1, final Function1 function12, final gu5 gu5Var3, final gu5 gu5Var4, final gu5 gu5Var5, final gu5 gu5Var6, final Function1 function13, final Function1 function14, final Function1 function15, final gu5 gu5Var7, final Function1 function16, final gu5 gu5Var8, final Function1 function17, final Function1 function18, final FragmentManager fragmentManager, final e eVar, final i7d i7dVar, final Function2 function22, final gu5 gu5Var9, final gu5 gu5Var10, final gu5 gu5Var11, final gu5 gu5Var12, final Function1 function19, final gu5 gu5Var13, b bVar, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        c cVar;
        int i7;
        c cVarH = bVar.h(378676505);
        if ((i & 6) == 0) {
            i4 = (cVarH.x(x1eVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? cVarH.K(at8Var) : cVarH.x(at8Var) ? 32 : 16;
        }
        int i8 = i & 384;
        int i9 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i8 == 0) {
            i4 |= cVarH.x(fnfVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        int i10 = i & 3072;
        int i11 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        if (i10 == 0) {
            i4 |= cVarH.x(jtaVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= cVarH.x(gu5Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i4 |= cVarH.x(gu5Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= cVarH.x(function2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= cVarH.x(function1) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= cVarH.x(function12) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= cVarH.x(gu5Var3) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (cVarH.x(gu5Var4) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= cVarH.x(gu5Var5) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= cVarH.x(gu5Var6) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= cVarH.x(function13) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= cVarH.x(function14) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= cVarH.x(function15) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= cVarH.x(gu5Var7) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= cVarH.x(function16) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= cVarH.x(gu5Var8) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= cVarH.x(function17) ? 536870912 : 268435456;
        }
        int i12 = i5;
        if ((i3 & 6) == 0) {
            i6 = i3 | (cVarH.x(function18) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= cVarH.x(fragmentManager) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            if (cVarH.x(eVar)) {
                i9 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            }
            i6 |= i9;
        }
        if ((i3 & 3072) == 0) {
            if ((i3 & 4096) == 0 ? cVarH.K(i7dVar) : cVarH.x(i7dVar)) {
                i11 = 2048;
            }
            i6 |= i11;
        }
        if ((i3 & 24576) == 0) {
            i6 |= cVarH.x(function22) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i6 |= cVarH.x(gu5Var9) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i6 |= cVarH.x(gu5Var10) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i6 |= cVarH.x(gu5Var11) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i6 |= cVarH.x(gu5Var12) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i6 |= cVarH.x(function19) ? 536870912 : 268435456;
        }
        if (cVarH.o(i4 & 1, ((i4 & 306783379) == 306783378 && (i12 & 306783379) == 306783378 && (i6 & 306783379) == 306783378 && ((cVarH.x(gu5Var13) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            cVarH.v0();
            if ((i & 1) != 0 && !cVarH.c0()) {
                cVarH.D();
            }
            cVarH.V();
            final o97 o97Var = (o97) cVarH.M(p97.a);
            final fm5 fm5Var = (fm5) cVarH.M(um2.i);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                m74 m74Var = to4.a;
                objV = v40.b(cVarH.l(), cVarH);
            }
            e13 e13Var = (e13) objV;
            List<EventRecord.Attachment> list = x1eVar.b;
            ConversationRecord conversationRecord = x1eVar.a;
            List<EventRecord.Attachment> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                i7 = 0;
            } else {
                Iterator it = list2.iterator();
                int i13 = 0;
                while (it.hasNext()) {
                    Iterator it2 = it;
                    if ((((EventRecord.Attachment) it.next()).getStatus() == EventRecord.AttachmentSentStatus.FAILURE) && (i13 = i13 + 1) < 0) {
                        u63.n0();
                        throw null;
                    }
                    it = it2;
                }
                i7 = i13;
            }
            final boolean z = (conversationRecord == null || conversationRecord.getFolder() == w47.INBOX) ? false : true;
            final boolean z2 = (conversationRecord != null ? conversationRecord.getLockReason() : null) != null;
            final hee heeVarF = hv9.f(true, cVarH, 6, 2);
            final hee heeVarF2 = hv9.f(true, cVarH, 6, 2);
            boolean zX = ((i12 & 896) == 256) | ((i12 & 234881024) == 67108864) | cVarH.x(fnfVar) | ((i12 & 1879048192) == 536870912);
            Object objV2 = cVarH.v();
            if (zX || objV2 == c0020a) {
                objV2 = new gu5() { // from class: t0e
                    @Override // defpackage.gu5
                    public final Object invoke() {
                        if (!((Boolean) gu5Var8.invoke()).booleanValue()) {
                            gu5Var6.invoke();
                            fnf.h(fnfVar, cnf.c0, null, new e1e(2, function17, wl7.a.class, "suspendConversion0", "InternalSelectedConversationScreen$lambda$40$lambda$39$suspendConversion0(Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), 2);
                        }
                        return j6g.a;
                    }
                };
                cVarH.p(objV2);
            }
            final gu5 gu5Var14 = (gu5) objV2;
            final f7d f7dVarB = e7d.b(cVarH);
            Boolean boolValueOf = Boolean.valueOf(x1eVar.h);
            boolean zX2 = cVarH.x(e13Var) | cVarH.x(x1eVar) | cVarH.K(heeVarF);
            Object objV3 = cVarH.v();
            if (zX2 || objV3 == c0020a) {
                objV3 = new c1e(e13Var, x1eVar, heeVarF, null);
                cVarH.p(objV3);
            }
            to4.d(cVarH, boolValueOf, (Function2) objV3);
            Integer numValueOf = Integer.valueOf(x1eVar.b.size());
            Boolean boolValueOf2 = Boolean.valueOf(x1eVar.c);
            Integer numValueOf2 = Integer.valueOf(i7);
            boolean zX3 = cVarH.x(x1eVar) | cVarH.x(fnfVar) | cVarH.d(i7);
            Object objV4 = cVarH.v();
            if (zX3 || objV4 == c0020a) {
                objV4 = new d1e(x1eVar, fnfVar, i7, null);
                cVarH.p(objV4);
            }
            to4.e(numValueOf, boolValueOf2, numValueOf2, (Function2) objV4, cVarH);
            w6d.a(i7dVar, cVarH, (i6 >> 9) & 14);
            cVar = cVarH;
            kr9.a(bh2.c(-2145664443, new wu5() { // from class: u0e
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((ml1) obj).getClass();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        final x1e x1eVar2 = x1eVar;
                        if (x1eVar2.h) {
                            bVar2.L(508904818);
                            mw0.a(heeVarF, gu5Var5, function13, gu5Var6, gu5Var14, bVar2, 0);
                        } else {
                            bVar2.L(495823965);
                        }
                        bVar2.F();
                        if (x1eVar2.n) {
                            bVar2.L(509300068);
                            t00.a(gu5Var9, heeVarF2, bVar2, 0);
                        } else {
                            bVar2.L(495823965);
                        }
                        bVar2.F();
                        if (x1eVar2.r) {
                            bVar2.L(509492361);
                            i10.a(gu5Var11, function19, x1eVar2.q, x1eVar2.s, x1eVar2.v, x1eVar2.t, gu5Var12, bVar2, 0);
                            bVar2 = bVar2;
                        } else {
                            bVar2.L(495823965);
                        }
                        bVar2.F();
                        ah2 ah2VarC = bh2.c(-1356645111, new nt9(x1eVar2, gu5Var, jtaVar, gu5Var2, 3), bVar2);
                        final at8 at8Var2 = at8Var;
                        final boolean z3 = z;
                        final boolean z4 = z2;
                        final gu5 gu5Var15 = gu5Var7;
                        final f7d f7dVar = f7dVarB;
                        final o97 o97Var2 = o97Var;
                        final Function1 function110 = function12;
                        final gu5 gu5Var16 = gu5Var3;
                        final gu5 gu5Var17 = gu5Var4;
                        final Function1 function111 = function14;
                        final Function1 function112 = function15;
                        final gu5 gu5Var18 = gu5Var10;
                        final i7d i7dVar2 = i7dVar;
                        ah2 ah2VarC2 = bh2.c(-745501558, new Function2() { // from class: w0e
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                b bVar3 = (b) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (bVar3.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    x1e x1eVar3 = x1eVar2;
                                    if (x1eVar3.g) {
                                        bVar3.L(39037782);
                                        bVar3.F();
                                    } else if (x1eVar3.e && at8Var2.b().a() == 0) {
                                        bVar3.L(39122288);
                                        ip9.a(0, bVar3);
                                        bVar3.F();
                                    } else if (z3 || z4) {
                                        bVar3.L(39265415);
                                        ap9.c(x1eVar3, gu5Var15, bVar3, 0);
                                        bVar3.F();
                                    } else {
                                        bVar3.L(39556102);
                                        androidx.compose.ui.e eVarG = e.a.b;
                                        androidx.compose.ui.e eVarA = f.a(eVarG, "ConversationBottomBar");
                                        ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar3, 0);
                                        int iHashCode = Long.hashCode(bVar3.k());
                                        t8b t8bVarM = bVar3.m();
                                        androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(bVar3, eVarA);
                                        gl2.j.getClass();
                                        pm8.a aVar = gl2.a.b;
                                        if (bVar3.j() == null) {
                                            pg8.B();
                                            throw null;
                                        }
                                        bVar3.B();
                                        if (bVar3.f()) {
                                            bVar3.y(aVar);
                                        } else {
                                            bVar3.n();
                                        }
                                        gl2.a.d dVar = gl2.a.g;
                                        ygg.y(bVar3, ob2VarA, dVar);
                                        gl2.a.f fVar = gl2.a.f;
                                        ygg.y(bVar3, t8bVarM, fVar);
                                        gl2.a.C0251a c0251a = gl2.a.j;
                                        if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode))) {
                                            uz.g(iHashCode, bVar3, iHashCode, c0251a);
                                        }
                                        gl2.a.e eVar2 = gl2.a.d;
                                        ygg.y(bVar3, eVarC, eVar2);
                                        ConversationRecord conversationRecord2 = x1eVar3.a;
                                        if (conversationRecord2 == null || !conversationRecord2.getAwaitingJobSeekerResponse()) {
                                            bVar3.L(-1485844383);
                                        } else {
                                            bVar3.L(-1470088912);
                                            androidx.compose.ui.e eVarF = g.f(eVarG, 1.0f);
                                            f7d f7dVar2 = f7dVar;
                                            if (f7dVar2.a()) {
                                                o97.g gVar = o97Var2.i;
                                                eVarG = androidx.compose.foundation.layout.f.g(eVarG, 16.0f, 12.0f);
                                            }
                                            androidx.compose.ui.e eVarO = eVarF.o(eVarG);
                                            ehd ehdVarA = chd.a(vs0.a, c20.a.j, bVar3, 0);
                                            int iHashCode2 = Long.hashCode(bVar3.k());
                                            t8b t8bVarM2 = bVar3.m();
                                            androidx.compose.ui.e eVarC2 = androidx.compose.ui.c.c(bVar3, eVarO);
                                            if (bVar3.j() == null) {
                                                pg8.B();
                                                throw null;
                                            }
                                            bVar3.B();
                                            if (bVar3.f()) {
                                                bVar3.y(aVar);
                                            } else {
                                                bVar3.n();
                                            }
                                            ygg.y(bVar3, ehdVarA, dVar);
                                            ygg.y(bVar3, t8bVarM2, fVar);
                                            if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode2))) {
                                                uz.g(iHashCode2, bVar3, iHashCode2, c0251a);
                                            }
                                            ygg.y(bVar3, eVarC2, eVar2);
                                            e7d.a(i7dVar2, false, f7dVar2, bVar3, 48, 0);
                                            bVar3.q();
                                        }
                                        bVar3.F();
                                        hp9.d(x1eVar3, function110, gu5Var16, gu5Var17, function111, function112, jh2.y() && x1eVar3.o, gu5Var18, bVar3, 0, 0);
                                        bVar3.q();
                                        bVar3.F();
                                    }
                                } else {
                                    bVar3.D();
                                }
                                return j6g.a;
                            }
                        }, bVar2);
                        ah2 ah2VarC3 = bh2.c(-134358005, new zw4(fnfVar, 5), bVar2);
                        final fm5 fm5Var2 = fm5Var;
                        final Function1 function113 = function16;
                        final Function1 function114 = function1;
                        final Function2 function23 = function2;
                        final FragmentManager fragmentManager2 = fragmentManager;
                        final androidx.navigation.e eVar2 = eVar;
                        final Function2 function24 = function22;
                        final Function1 function115 = function18;
                        ah2 ah2VarC4 = bh2.c(-685323180, new wu5() { // from class: x0e
                            @Override // defpackage.wu5
                            public final Object q(Object obj4, Object obj5, Object obj6) {
                                gza gzaVar = (gza) obj4;
                                b bVar3 = (b) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                gzaVar.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= bVar3.K(gzaVar) ? 4 : 2;
                                }
                                if (bVar3.o(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    e.a aVar = e.a.b;
                                    androidx.compose.ui.e eVarB = a.b(g.d(aVar, 1.0f), o97Var2.c.b.a, ytc.a);
                                    j6g j6gVar = j6g.a;
                                    fm5 fm5Var3 = fm5Var2;
                                    boolean zX4 = bVar3.x(fm5Var3);
                                    Object objV5 = bVar3.v();
                                    b.a.C0020a c0020a2 = b.a.a;
                                    if (zX4 || objV5 == c0020a2) {
                                        objV5 = new y0e(fm5Var3);
                                        bVar3.p(objV5);
                                    }
                                    androidx.compose.ui.e eVarB2 = f1f.b(eVarB, j6gVar, (PointerInputEventHandler) objV5);
                                    ob2 ob2VarA = mb2.a(vs0.d, c20.a.m, bVar3, 6);
                                    int iHashCode = Long.hashCode(bVar3.k());
                                    t8b t8bVarM = bVar3.m();
                                    androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(bVar3, eVarB2);
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
                                    gl2.a.d dVar = gl2.a.g;
                                    ygg.y(bVar3, ob2VarA, dVar);
                                    gl2.a.f fVar = gl2.a.f;
                                    ygg.y(bVar3, t8bVarM, fVar);
                                    gl2.a.C0251a c0251a = gl2.a.j;
                                    if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode))) {
                                        uz.g(iHashCode, bVar3, iHashCode, c0251a);
                                    }
                                    gl2.a.e eVar3 = gl2.a.d;
                                    ygg.y(bVar3, eVarC, eVar3);
                                    x1e x1eVar3 = x1eVar2;
                                    boolean z5 = x1eVar3.g;
                                    boolean z6 = x1eVar3.o;
                                    if (z5) {
                                        bVar3.L(1878329457);
                                        Object objV6 = bVar3.v();
                                        if (objV6 == c0020a2) {
                                            objV6 = new z0e(2, null);
                                            bVar3.p(objV6);
                                        }
                                        to4.d(bVar3, j6gVar, (Function2) objV6);
                                        boolean zX5 = bVar3.x(x1eVar3);
                                        Function1 function116 = function113;
                                        boolean zK = zX5 | bVar3.K(function116);
                                        Object objV7 = bVar3.v();
                                        if (zK || objV7 == c0020a2) {
                                            objV7 = new ry(11, x1eVar3, function116);
                                            bVar3.p(objV7);
                                        }
                                        lg0.a((gu5) objV7, bVar3, 0);
                                        bVar3.F();
                                    } else {
                                        boolean z7 = x1eVar3.e;
                                        at8 at8Var3 = at8Var2;
                                        if (z7 && at8Var3.b().a() == 0) {
                                            bVar3.L(1878900136);
                                            Object objV8 = bVar3.v();
                                            if (objV8 == c0020a2) {
                                                objV8 = new a1e(2, null);
                                                bVar3.p(objV8);
                                            }
                                            to4.d(bVar3, j6gVar, (Function2) objV8);
                                            az4.a(androidx.compose.foundation.layout.f.e(aVar, gzaVar), bVar3, 0);
                                            bVar3.F();
                                        } else {
                                            bVar3.L(1879342041);
                                            ConversationRecord conversationRecord2 = x1eVar3.a;
                                            String id = conversationRecord2 != null ? conversationRecord2.getId() : null;
                                            boolean zX6 = bVar3.x(x1eVar3);
                                            Object objV9 = bVar3.v();
                                            if (zX6 || objV9 == c0020a2) {
                                                objV9 = new b1e(x1eVar3, null);
                                                bVar3.p(objV9);
                                            }
                                            to4.d(bVar3, id, (Function2) objV9);
                                            androidx.compose.ui.e eVarE = androidx.compose.foundation.layout.f.e(g.d(aVar, 1.0f), gzaVar);
                                            ag9 ag9VarD = hl1.d(c20.a.a, false);
                                            int iHashCode2 = Long.hashCode(bVar3.k());
                                            t8b t8bVarM2 = bVar3.m();
                                            androidx.compose.ui.e eVarC2 = androidx.compose.ui.c.c(bVar3, eVarE);
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
                                            ygg.y(bVar3, ag9VarD, dVar);
                                            ygg.y(bVar3, t8bVarM2, fVar);
                                            if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode2))) {
                                                uz.g(iHashCode2, bVar3, iHashCode2, c0251a);
                                            }
                                            ygg.y(bVar3, eVarC2, eVar3);
                                            float f = (!z6 || jh2.y()) ? 0.0f : 44.0f;
                                            boolean zX7 = bVar3.x(x1eVar3);
                                            Function1 function117 = function115;
                                            boolean zK2 = zX7 | bVar3.K(function117);
                                            Object objV10 = bVar3.v();
                                            if (zK2 || objV10 == c0020a2) {
                                                objV10 = new s71(7, x1eVar3, function117);
                                                bVar3.p(objV10);
                                            }
                                            yy4.a(x1eVar3, at8Var3, function114, function23, null, fragmentManager2, eVar2, function24, (gu5) objV10, androidx.compose.foundation.layout.f.b(0.0f, 0.0f, 0.0f, f, 7), bVar3, 64);
                                            boolean z8 = z6 && !jh2.y();
                                            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.b.a.h(aVar, c20.a.h), 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                            mv4 mv4VarD = ku4.d(zd0.d(300, 0, null, 6), 2);
                                            dvf dvfVarD = zd0.d(300, 0, null, 6);
                                            Object objV11 = bVar3.v();
                                            if (objV11 == c0020a2) {
                                                objV11 = new yb(11);
                                                bVar3.p(objV11);
                                            }
                                            mv4 mv4VarB = mv4VarD.b(new mv4(new gsf((k65) null, new bke(new gv4((Function1) objV11), dvfVarD), (t12) null, (vmd) null, (LinkedHashMap) null, 61)));
                                            s25 s25VarE = ku4.e(zd0.d(250, 0, null, 6), 2);
                                            dvf dvfVarD2 = zd0.d(250, 0, null, 6);
                                            Object objV12 = bVar3.v();
                                            if (objV12 == c0020a2) {
                                                objV12 = new ju(10);
                                                bVar3.p(objV12);
                                            }
                                            i.e(z8, eVarJ, mv4VarB, s25VarE.b(new s25(new gsf((k65) null, new bke(new jv4((Function1) objV12), dvfVarD2), (t12) null, (vmd) null, (LinkedHashMap) null, 61))), null, bh2.c(1141395167, new cl4(3, x1eVar3, gu5Var18), bVar3), bVar3, 200064, 16);
                                            bVar3.q();
                                            bVar3.F();
                                        }
                                    }
                                    bVar3.q();
                                } else {
                                    bVar3.D();
                                }
                                return j6g.a;
                            }
                        }, bVar2);
                        b bVar3 = bVar2;
                        dmd.a(null, ah2VarC, ah2VarC2, ah2VarC3, null, 0, 0L, 0L, null, ah2VarC4, bVar3, 805309872, 497);
                        if (x1eVar2.y) {
                            bVar3.L(-398922930);
                            Integer num = x1eVar2.z;
                            if (num == null) {
                                bVar3.L(518337838);
                            } else {
                                bVar3.L(518337839);
                                int iIntValue2 = num.intValue();
                                fv6 fv6Var = fv6.q4;
                                String strI = ak2.I(iIntValue2, bVar3);
                                gu5 gu5Var19 = gu5Var13;
                                boolean zK = bVar3.K(gu5Var19);
                                Object objV5 = bVar3.v();
                                if (zK || objV5 == b.a.a) {
                                    objV5 = new ld(12, gu5Var19);
                                    bVar3.p(objV5);
                                }
                                tz6.b(strI, null, fv6Var, null, (gu5) objV5, bVar3, 24630, 40);
                            }
                            bVar3.F();
                        } else {
                            bVar3.L(495823965);
                        }
                        bVar3.F();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVar), cVar, 6);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        androidx.compose.runtime.i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: v0e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i | 1);
                    int iL2 = ka2.L(i2);
                    int iL3 = ka2.L(i3);
                    w1e.a(x1eVar, at8Var, fnfVar, jtaVar, gu5Var, gu5Var2, function2, function1, function12, gu5Var3, gu5Var4, gu5Var5, gu5Var6, function13, function14, function15, gu5Var7, function16, gu5Var8, function17, function18, fragmentManager, eVar, i7dVar, function22, gu5Var9, gu5Var10, gu5Var11, gu5Var12, function19, gu5Var13, (b) obj, iL, iL2, iL3);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final y1e y1eVar, final fnf fnfVar, final jta jtaVar, final gu5 gu5Var, final gu5 gu5Var2, final gu5 gu5Var3, final Function2 function2, final gu5 gu5Var4, final Function1 function1, final FragmentManager fragmentManager, final androidx.navigation.e eVar, final Function2 function22, b bVar, final int i) {
        c cVar;
        at8 at8Var;
        int i2;
        b.a.C0020a c0020a;
        b.a.C0020a c0020a2;
        Bundle bundleA;
        y1eVar.getClass();
        fnfVar.getClass();
        jtaVar.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        function2.getClass();
        gu5Var4.getClass();
        function1.getClass();
        function22.getClass();
        c cVarH = bVar.h(-866019031);
        int i3 = i | (cVarH.x(y1eVar) ? 4 : 2) | (cVarH.x(fnfVar) ? 32 : 16) | (cVarH.x(jtaVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(gu5Var2) ? 16384 : 8192) | (cVarH.x(gu5Var3) ? 131072 : 65536) | (cVarH.x(function2) ? 1048576 : 524288) | (cVarH.x(gu5Var4) ? 8388608 : 4194304) | (cVarH.x(function1) ? 67108864 : 33554432) | (cVarH.x(fragmentManager) ? 536870912 : 268435456);
        int i4 = (cVarH.x(eVar) ? 4 : 2) | (cVarH.x(function22) ? 32 : 16);
        if (cVarH.o(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            pqc pqcVar = y1eVar.Z;
            yz8 yz8Var = dt8.a;
            pqcVar.getClass();
            cVarH.u(388053246);
            cVarH.u(1046463091);
            boolean zK = cVarH.K(pqcVar);
            Object objV = cVarH.v();
            b.a.C0020a c0020a3 = b.a.a;
            if (zK || objV == c0020a3) {
                objV = new at8(pqcVar);
                cVarH.p(objV);
            }
            at8 at8Var2 = (at8) objV;
            cVarH.U(false);
            cVarH.u(1046463169);
            vr4 vr4Var = vr4.a;
            boolean zX = cVarH.x(vr4Var) | cVarH.x(at8Var2);
            Object objV2 = cVarH.v();
            if (zX || objV2 == c0020a3) {
                objV2 = new bt8(vr4Var, at8Var2, null);
                cVarH.p(objV2);
            }
            cVarH.U(false);
            to4.d(cVarH, at8Var2, (Function2) objV2);
            cVarH.u(1046463438);
            boolean zX2 = cVarH.x(vr4Var) | cVarH.x(at8Var2);
            Object objV3 = cVarH.v();
            if (zX2 || objV3 == c0020a3) {
                objV3 = new ct8(vr4Var, at8Var2, null);
                cVarH.p(objV3);
            }
            cVarH.U(false);
            to4.d(cVarH, at8Var2, (Function2) objV3);
            cVarH.U(false);
            g4a g4aVarA = r.a(y1eVar.d0, cVarH);
            cVarH.u(-1072256281);
            jrg jrgVarA = z09.a(cVarH);
            if (jrgVarA == null) {
                r6.g("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            p63 p63VarA = ojd.a(jrgVarA, cVarH);
            vh8 vh8Var = web.d;
            if (vh8Var == null) {
                r6.g("KoinApplication has not been started");
                return;
            }
            qpd qpdVar = (qpd) vh8Var.a.b;
            d dVar = jrgVarA instanceof d ? (d) jrgVarA : null;
            p63 p63VarQ = (dVar == null || (bundleA = dVar.a()) == null) ? null : pnb.Q(bundleA, jrgVarA);
            yd8 yd8VarB = fwc.a.b(j7d.class);
            irg viewModelStore = jrgVarA.getViewModelStore();
            viewModelStore.getClass();
            brg brgVarA = p66.a(yd8VarB, viewModelStore, p63VarQ == null ? p63VarA : p63VarQ, null, qpdVar, null);
            cVarH.U(false);
            g4a g4aVarA2 = r.a(((j7d) brgVarA).e, cVarH);
            boolean z = (at8Var2.c().a instanceof xz8.b) || (at8Var2.c().b instanceof xz8.b) || (at8Var2.c().c instanceof xz8.b);
            boolean z2 = (at8Var2.c().a instanceof xz8.a) || (at8Var2.c().b instanceof xz8.a) || (at8Var2.c().c instanceof xz8.a);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zX3 = cVarH.x(y1eVar) | cVarH.a(z);
            Object objV4 = cVarH.v();
            if (zX3 || objV4 == c0020a3) {
                at8Var = at8Var2;
                objV4 = new f1e(y1eVar, z, null);
                cVarH.p(objV4);
            } else {
                at8Var = at8Var2;
            }
            to4.d(cVarH, boolValueOf, (Function2) objV4);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            boolean zX4 = cVarH.x(y1eVar) | cVarH.a(z2);
            Object objV5 = cVarH.v();
            if (zX4 || objV5 == c0020a3) {
                objV5 = new o1e(y1eVar, z2, null);
                cVarH.p(objV5);
            }
            to4.d(cVarH, boolValueOf2, (Function2) objV5);
            boolean z3 = (i3 & 7168) == 2048;
            Object objV6 = cVarH.v();
            if (z3 || objV6 == c0020a3) {
                objV6 = new wc(7, gu5Var);
                cVarH.p(objV6);
            }
            g71.a(false, (gu5) objV6, cVarH, 0, 1);
            x1e x1eVar = (x1e) g4aVarA.getValue();
            boolean zX5 = cVarH.x(y1eVar);
            Object objV7 = cVarH.v();
            if (zX5 || objV7 == c0020a3) {
                i2 = i3;
                c0020a = c0020a3;
                q1e q1eVar = new q1e(1, y1eVar, y1e.class, "onRetryClicked", "onRetryClicked(Ljava/lang/String;)V", 0);
                cVarH.p(q1eVar);
                objV7 = q1eVar;
            } else {
                i2 = i3;
                c0020a = c0020a3;
            }
            Function1 function12 = (Function1) ((ve8) objV7);
            boolean zX6 = cVarH.x(y1eVar);
            Object objV8 = cVarH.v();
            if (zX6 || objV8 == c0020a) {
                r1e r1eVar = new r1e(1, y1eVar, y1e.class, "onMessageInput", "onMessageInput(Ljava/lang/String;Z)V", 0);
                cVarH.p(r1eVar);
                objV8 = r1eVar;
            }
            Function1 function13 = (Function1) objV8;
            boolean zX7 = cVarH.x(y1eVar);
            Object objV9 = cVarH.v();
            if (zX7 || objV9 == c0020a) {
                s1e s1eVar = new s1e(0, y1eVar, y1e.class, "onSendClicked", "onSendClicked()V", 0);
                cVarH.p(s1eVar);
                objV9 = s1eVar;
            }
            gu5 gu5Var5 = (gu5) ((ve8) objV9);
            boolean zX8 = cVarH.x(y1eVar);
            Object objV10 = cVarH.v();
            if (zX8 || objV10 == c0020a) {
                t1e t1eVar = new t1e(0, y1eVar, y1e.class, "onAttachClicked", "onAttachClicked()V", 0);
                cVarH.p(t1eVar);
                objV10 = t1eVar;
            }
            gu5 gu5Var6 = (gu5) ((ve8) objV10);
            boolean zX9 = cVarH.x(y1eVar);
            Object objV11 = cVarH.v();
            if (zX9 || objV11 == c0020a) {
                u1e u1eVar = new u1e(0, y1eVar, y1e.class, "onDismissAttachmentBottomSheet", "onDismissAttachmentBottomSheet()V", 0);
                cVarH.p(u1eVar);
                objV11 = u1eVar;
            }
            gu5 gu5Var7 = (gu5) ((ve8) objV11);
            boolean zX10 = cVarH.x(y1eVar);
            Object objV12 = cVarH.v();
            if (zX10 || objV12 == c0020a) {
                v1e v1eVar = new v1e(1, y1eVar, y1e.class, "onAttachmentSelected", "onAttachmentSelected(Landroid/net/Uri;Lkotlin/jvm/functions/Function0;)V", 0);
                cVarH.p(v1eVar);
                objV12 = v1eVar;
            }
            Function1 function14 = (Function1) objV12;
            boolean zX11 = cVarH.x(y1eVar);
            Object objV13 = cVarH.v();
            if (zX11 || objV13 == c0020a) {
                g1e g1eVar = new g1e(1, y1eVar, y1e.class, "onAttachmentRemoveClicked", "onAttachmentRemoveClicked(Lcom/indeed/android/messaging/data/events/EventRecord$Attachment;)V", 0);
                cVarH.p(g1eVar);
                objV13 = g1eVar;
            }
            Function1 function15 = (Function1) ((ve8) objV13);
            boolean zX12 = cVarH.x(y1eVar);
            Object objV14 = cVarH.v();
            if (zX12 || objV14 == c0020a) {
                h1e h1eVar = new h1e(1, y1eVar, y1e.class, "onRetryAttachmentUploadClicked", "onRetryAttachmentUploadClicked(Lcom/indeed/android/messaging/data/events/EventRecord$Attachment;)V", 0);
                cVarH.p(h1eVar);
                objV14 = h1eVar;
            }
            Function1 function16 = (Function1) ((ve8) objV14);
            boolean zX13 = cVarH.x(y1eVar);
            Object objV15 = cVarH.v();
            if (zX13 || objV15 == c0020a) {
                evb evbVar = new evb(0, y1eVar, y1e.class, "onRestoreFromComposeBoxClicked", "onRestoreFromComposeBoxClicked()V", 0);
                cVarH.p(evbVar);
                objV15 = evbVar;
            }
            gu5 gu5Var8 = (gu5) ((ve8) objV15);
            boolean zX14 = cVarH.x(y1eVar);
            Object objV16 = cVarH.v();
            if (zX14 || objV16 == c0020a) {
                i1e i1eVar = new i1e(1, y1eVar, y1e.class, "enterConversation", "enterConversation(Ljava/lang/String;ZLjava/lang/String;)V", 0);
                cVarH.p(i1eVar);
                objV16 = i1eVar;
            }
            Function1 function17 = (Function1) objV16;
            boolean zX15 = cVarH.x(y1eVar);
            Object objV17 = cVarH.v();
            if (zX15 || objV17 == c0020a) {
                j1e j1eVar = new j1e(1, y1eVar, y1e.class, "markConversationRead", "markConversationRead(Ljava/lang/String;)V", 0);
                cVarH.p(j1eVar);
                objV17 = j1eVar;
            }
            Function1 function18 = (Function1) ((ve8) objV17);
            i7d i7dVar = (i7d) g4aVarA2.getValue();
            boolean zX16 = cVarH.x(y1eVar);
            Object objV18 = cVarH.v();
            if (zX16 || objV18 == c0020a) {
                k1e k1eVar = new k1e(0, y1eVar, y1e.class, "onAiMessagingPromoDismissed", "onAiMessagingPromoDismissed()V", 0);
                cVarH.p(k1eVar);
                objV18 = k1eVar;
            }
            gu5 gu5Var9 = (gu5) ((ve8) objV18);
            boolean zX17 = cVarH.x(y1eVar);
            Object objV19 = cVarH.v();
            if (zX17 || objV19 == c0020a) {
                l1e l1eVar = new l1e(0, y1eVar, y1e.class, "onAiMessagingButtonTapped", "onAiMessagingButtonTapped()V", 0);
                cVarH.p(l1eVar);
                objV19 = l1eVar;
            }
            gu5 gu5Var10 = (gu5) ((ve8) objV19);
            boolean zX18 = cVarH.x(y1eVar);
            Object objV20 = cVarH.v();
            if (zX18 || objV20 == c0020a) {
                m1e m1eVar = new m1e(0, y1eVar, y1e.class, "onAiMessagingSuggestionBottomSheetDismissed", "onAiMessagingSuggestionBottomSheetDismissed()V", 0);
                cVarH.p(m1eVar);
                objV20 = m1eVar;
            }
            gu5 gu5Var11 = (gu5) ((ve8) objV20);
            boolean zX19 = cVarH.x(y1eVar);
            Object objV21 = cVarH.v();
            if (zX19 || objV21 == c0020a) {
                c0020a2 = c0020a;
                cm5 cm5Var = new cm5(0, y1eVar, y1e.class, "onRetryFetchSuggestedMessages", "onRetryFetchSuggestedMessages()V", 0, 1);
                cVarH.p(cm5Var);
                objV21 = cm5Var;
            } else {
                c0020a2 = c0020a;
            }
            gu5 gu5Var12 = (gu5) ((ve8) objV21);
            boolean zX20 = cVarH.x(y1eVar);
            Object objV22 = cVarH.v();
            if (zX20 || objV22 == c0020a2) {
                n1e n1eVar = new n1e(1, y1eVar, y1e.class, "onAiSuggestedMessageSelected", "onAiSuggestedMessageSelected(Lcom/indeed/android/messaging/data/conversations/model/SuggestedMessageModel;)V", 0);
                cVarH.p(n1eVar);
                objV22 = n1eVar;
            }
            Function1 function19 = (Function1) ((ve8) objV22);
            boolean zX21 = cVarH.x(y1eVar);
            Object objV23 = cVarH.v();
            if (zX21 || objV23 == c0020a2) {
                p1e p1eVar = new p1e(0, y1eVar, y1e.class, "onDownloadReportToastDismissed", "onDownloadReportToastDismissed()V", 0);
                cVarH.p(p1eVar);
                objV23 = p1eVar;
            }
            int i5 = i2 << 3;
            cVar = cVarH;
            a(x1eVar, at8Var, fnfVar, jtaVar, gu5Var, gu5Var2, function2, function12, function13, gu5Var5, gu5Var6, gu5Var3, gu5Var7, function14, function15, function16, gu5Var8, function17, gu5Var4, function1, function18, fragmentManager, eVar, i7dVar, function22, gu5Var9, gu5Var10, gu5Var11, gu5Var12, function19, (gu5) ((ve8) objV23), cVar, (i5 & 896) | 64 | (i5 & 7168) | (i5 & 57344) | (458752 & i5) | (i2 & 3670016), (i5 & 1879048192) | ((i2 >> 12) & 112) | (234881024 & i5), (57344 & (i4 << 9)) | ((i2 >> 24) & 112) | ((i4 << 6) & 896));
        } else {
            cVar = cVarH;
            cVar.D();
        }
        androidx.compose.runtime.i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(fnfVar, jtaVar, gu5Var, gu5Var2, gu5Var3, function2, gu5Var4, function1, fragmentManager, eVar, function22, i) { // from class: s0e
                public final /* synthetic */ Function2 V;
                public final /* synthetic */ gu5 W;
                public final /* synthetic */ Function1 X;
                public final /* synthetic */ FragmentManager Y;
                public final /* synthetic */ androidx.navigation.e Z;
                public final /* synthetic */ Function2 a0;
                public final /* synthetic */ fnf b;
                public final /* synthetic */ jta c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ gu5 e;
                public final /* synthetic */ gu5 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    w1e.b(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, this.X, this.Y, this.Z, this.a0, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
