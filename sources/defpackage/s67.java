package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import com.indeed.android.messaging.data.conversations.ConversationWithDraft;
import defpackage.c20;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class s67 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03c4 A[LOOP:0: B:140:0x03be->B:142:0x03c4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x052c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final int r54, final defpackage.gu5 r55, final defpackage.u67 r56, final defpackage.kta r57, final defpackage.j7d r58, final defpackage.fnf r59, final defpackage.d4g r60, androidx.compose.runtime.b r61, final androidx.fragment.app.FragmentManager r62, final androidx.navigation.e r63, final kotlin.jvm.functions.Function1 r64, final kotlin.jvm.functions.Function2 r65) {
        /*
            Method dump skipped, instruction units count: 1436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s67.a(int, gu5, u67, kta, j7d, fnf, d4g, androidx.compose.runtime.b, androidx.fragment.app.FragmentManager, androidx.navigation.e, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2):void");
    }

    public static final void b(final t67 t67Var, final jta jtaVar, final fnf fnfVar, final c4g c4gVar, final boolean z, final g7c g7cVar, final gu5 gu5Var, final FragmentManager fragmentManager, final e eVar, final Function1 function1, final Function1 function12, final wu5 wu5Var, final gu5 gu5Var2, final i7d i7dVar, final boolean z2, final hee heeVar, final gu5 gu5Var3, final hee heeVar2, final v47 v47Var, final gu5 gu5Var4, final Function1 function13, final Function2 function2, final pz8 pz8Var, b bVar, final int i, final int i2) {
        int i3;
        jta jtaVar2;
        fnf fnfVar2;
        boolean z3;
        int i4;
        int i5;
        hee heeVar3;
        c cVarH = bVar.h(-1016155607);
        if ((i & 6) == 0) {
            i3 = (cVarH.x(t67Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            jtaVar2 = jtaVar;
            i3 |= cVarH.x(jtaVar2) ? 32 : 16;
        } else {
            jtaVar2 = jtaVar;
        }
        if ((i & 384) == 0) {
            fnfVar2 = fnfVar;
            i3 |= cVarH.x(fnfVar2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        } else {
            fnfVar2 = fnfVar;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? cVarH.K(c4gVar) : cVarH.x(c4gVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z3 = z;
            i3 |= cVarH.a(z3) ? 16384 : 8192;
        } else {
            z3 = z;
        }
        if ((i & 196608) == 0) {
            i3 |= (i & 262144) == 0 ? cVarH.K(g7cVar) : cVarH.x(g7cVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= cVarH.x(gu5Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= cVarH.x(fragmentManager) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= cVarH.x(eVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= cVarH.x(function1) ? 536870912 : 268435456;
        }
        int i6 = 0 | (cVarH.x(function12) ? (char) 4 : (char) 2) | (cVarH.x(wu5Var) ? 32 : 16) | (cVarH.x(gu5Var2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.K(i7dVar) ? (char) 2048 : (char) 1024) | (cVarH.a(z2) ? (char) 16384 : (char) 8192) | (cVarH.K(heeVar) ? (char) 0 : (char) 0) | (cVarH.K(heeVar2) ? (char) 0 : (char) 0) | (cVarH.d(v47Var == null ? -1 : v47Var.ordinal()) ? (char) 0 : (char) 0);
        if ((i2 & 6) == 0) {
            i4 = i6;
            i5 = i2 | (cVarH.x(function13) ? 4 : 2);
        } else {
            i4 = i6;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= cVarH.x(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= cVarH.x(pz8Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (cVarH.o(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 306783379) == 306783378 && (i5 & 147) == 146) ? false : true)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                m74 m74Var = to4.a;
                objV = v40.b(cVarH.l(), cVarH);
            }
            final e13 e13Var = (e13) objV;
            final Configuration configuration = (Configuration) cVarH.M(AndroidCompositionLocals_androidKt.a);
            final hee heeVarF = hv9.f(false, cVarH, 6, 2);
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(null);
                cVarH.p(objV2);
            }
            final g4a g4aVar = (g4a) objV2;
            final yf6 yf6Var = (yf6) cVarH.M(um2.l);
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = r.f(null);
                cVarH.p(objV3);
            }
            final g4a g4aVar2 = (g4a) objV3;
            boolean zX = cVarH.x(yf6Var) | cVarH.x(e13Var) | cVarH.K(heeVarF);
            Object objV4 = cVarH.v();
            if (zX || objV4 == c0020a) {
                objV4 = new Function1() { // from class: w57
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ConversationRecord conversationRecord = (ConversationRecord) obj;
                        conversationRecord.getClass();
                        yf6Var.a(0);
                        g4aVar2.setValue(conversationRecord);
                        u63.Y(e13Var, null, null, new r67(heeVarF, g4aVar, null), 3);
                        return j6g.a;
                    }
                };
                heeVar3 = heeVarF;
                cVarH.p(objV4);
            } else {
                heeVar3 = heeVarF;
            }
            final Function1 function14 = (Function1) objV4;
            final hee heeVar4 = heeVar3;
            boolean zX2 = cVarH.x(e13Var) | cVarH.K(heeVar3) | ((i4 & 112) == 32);
            Object objV5 = cVarH.v();
            if (zX2 || objV5 == c0020a) {
                objV5 = new a80(g4aVar2, wu5Var, e13Var, heeVar4, g4aVar, 2);
                cVarH.p(objV5);
            }
            final Function1 function15 = (Function1) objV5;
            final jta jtaVar3 = jtaVar2;
            final fnf fnfVar3 = fnfVar2;
            final boolean z4 = z3;
            cVarH = cVarH;
            kr9.a(bh2.c(-1227313835, new wu5() { // from class: y57
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    e13 e13Var2;
                    Function1 function16;
                    ml1 ml1Var = (ml1) obj;
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ml1Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= bVar2.K(ml1Var) ? 4 : 2;
                    }
                    if (bVar2.o(iIntValue & 1, (iIntValue & 19) != 18)) {
                        g4a g4aVar3 = g4aVar;
                        v47 v47Var2 = (v47) g4aVar3.getValue();
                        Configuration configuration2 = configuration;
                        final t67 t67Var2 = t67Var;
                        e13 e13Var3 = e13Var;
                        Function1 function17 = function12;
                        Function1 function18 = function15;
                        b.a.C0020a c0020a2 = b.a.a;
                        if (v47Var2 == null) {
                            bVar2.L(150219784);
                            bVar2.F();
                            e13Var2 = e13Var3;
                            function16 = function17;
                        } else {
                            bVar2.L(150219785);
                            bVar2.A(1948398390, Integer.valueOf(configuration2.orientation));
                            w47 w47Var = t67Var2.e;
                            boolean zX3 = bVar2.x(e13Var3);
                            hee heeVar5 = heeVar4;
                            boolean zK = zX3 | bVar2.K(heeVar5);
                            Object objV6 = bVar2.v();
                            if (zK || objV6 == c0020a2) {
                                objV6 = new a67(0, e13Var3, heeVar5, g4aVar3);
                                bVar2.p(objV6);
                            }
                            e13Var2 = e13Var3;
                            function16 = function17;
                            u47.a(e13Var2, heeVar5, v47Var2, w47Var, function16, function18, (gu5) objV6, bVar2, 0);
                            bVar2.I();
                            bVar2.F();
                        }
                        v47 v47Var3 = v47Var;
                        if (v47Var3 == null) {
                            bVar2.L(150835630);
                        } else {
                            bVar2.L(150835631);
                            bVar2.A(-488807193, Integer.valueOf(configuration2.orientation));
                            w47 w47Var2 = t67Var2.e;
                            boolean zX4 = bVar2.x(e13Var2);
                            hee heeVar6 = heeVar2;
                            boolean zK2 = zX4 | bVar2.K(heeVar6);
                            gu5 gu5Var5 = gu5Var4;
                            boolean zK3 = zK2 | bVar2.K(gu5Var5);
                            Object objV7 = bVar2.v();
                            if (zK3 || objV7 == c0020a2) {
                                objV7 = new b67(e13Var2, gu5Var5, heeVar6);
                                bVar2.p(objV7);
                            }
                            u47.a(e13Var2, heeVar6, v47Var3, w47Var2, function16, function18, (gu5) objV7, bVar2, 0);
                            bVar2.I();
                        }
                        bVar2.F();
                        g7c g7cVar2 = g7cVar;
                        androidx.compose.ui.e eVarL = pyd.L(g7cVar2);
                        mg5 mg5Var = new mg5();
                        final c4g c4gVar2 = c4gVar;
                        final boolean z5 = z2;
                        final hee heeVar7 = heeVar;
                        final i7d i7dVar2 = i7dVar;
                        final gu5 gu5Var6 = gu5Var3;
                        ah2 ah2VarC = bh2.c(299524633, new Function2() { // from class: c67
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                b bVar3 = (b) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (bVar3.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    t67 t67Var3 = t67Var2;
                                    if (wl7.b(t67Var3.a, Boolean.TRUE) && t67Var3.d.isEmpty()) {
                                        bVar3.L(-1803614195);
                                        z47.a(0, bVar3);
                                        bVar3.F();
                                    } else {
                                        bVar3.L(-1803536509);
                                        h4.e(c4gVar2, z5, heeVar7, i7dVar2, gu5Var6, bVar3, 8);
                                        bVar3.F();
                                    }
                                } else {
                                    bVar3.D();
                                }
                                return j6g.a;
                            }
                        }, bVar2);
                        ah2 ah2VarC2 = bh2.c(1795599899, new uw(fnfVar3, 5), bVar2);
                        final gu5 gu5Var7 = gu5Var;
                        final e eVar2 = eVar;
                        final FragmentManager fragmentManager2 = fragmentManager;
                        final jta jtaVar4 = jtaVar3;
                        final Function1 function19 = function1;
                        final wu5 wu5Var2 = wu5Var;
                        final Function1 function110 = function14;
                        final gu5 gu5Var8 = gu5Var2;
                        final Function1 function111 = function13;
                        final Function2 function22 = function2;
                        final pz8 pz8Var2 = pz8Var;
                        dmd.a(eVarL, ah2VarC, null, ah2VarC2, null, 0, 0L, 0L, mg5Var, bh2.c(-430307100, new wu5() { // from class: d67
                            @Override // defpackage.wu5
                            public final Object q(Object obj4, Object obj5, Object obj6) {
                                int i7;
                                int i8;
                                gza gzaVar = (gza) obj4;
                                b bVar3 = (b) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                gzaVar.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= bVar3.K(gzaVar) ? 4 : 2;
                                }
                                if (bVar3.o(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    t67 t67Var3 = t67Var2;
                                    Boolean bool = t67Var3.a;
                                    List<ConversationWithDraft> list = t67Var3.d;
                                    w47 w47Var3 = t67Var3.e;
                                    boolean zB = wl7.b(bool, Boolean.TRUE);
                                    e.a aVar = e.a.b;
                                    b.a.C0020a c0020a3 = b.a.a;
                                    if (zB && list.isEmpty()) {
                                        bVar3.L(1198690833);
                                        boolean zX5 = bVar3.x(t67Var3);
                                        Object objV8 = bVar3.v();
                                        if (zX5 || objV8 == c0020a3) {
                                            objV8 = new m67(t67Var3, null);
                                            bVar3.p(objV8);
                                        }
                                        to4.d(bVar3, bool, (Function2) objV8);
                                        dy2.a(f.e(aVar, gzaVar), bVar3, 0);
                                        bVar3.F();
                                    } else if (t67Var3.b) {
                                        bVar3.L(1199124151);
                                        boolean zX6 = bVar3.x(t67Var3);
                                        Object objV9 = bVar3.v();
                                        if (zX6 || objV9 == c0020a3) {
                                            objV9 = new n67(t67Var3, null);
                                            bVar3.p(objV9);
                                        }
                                        to4.d(bVar3, bool, (Function2) objV9);
                                        gu5 gu5Var9 = gu5Var7;
                                        boolean zK4 = bVar3.K(gu5Var9);
                                        Object objV10 = bVar3.v();
                                        if (zK4 || objV10 == c0020a3) {
                                            objV10 = new eh(5, gu5Var9);
                                            bVar3.p(objV10);
                                        }
                                        lg0.a((gu5) objV10, bVar3, 0);
                                        bVar3.F();
                                    } else if (wl7.b(bool, Boolean.FALSE) && t67Var3.c == null && list.isEmpty()) {
                                        bVar3.L(1199790713);
                                        int iOrdinal = w47Var3.ordinal();
                                        if (iOrdinal == 0) {
                                            i7 = R.string.messaging_empty_state_text_findjobs;
                                        } else if (iOrdinal == 1) {
                                            i7 = R.string.messaging_empty_state_text_archive;
                                        } else if (iOrdinal == 2) {
                                            i7 = R.string.messaging_empty_state_text_spam;
                                        } else {
                                            if (iOrdinal != 3) {
                                                l.g();
                                                return null;
                                            }
                                            i7 = R.string.messaging_empty_state_text_drafts;
                                        }
                                        int iOrdinal2 = w47Var3.ordinal();
                                        if (iOrdinal2 == 0) {
                                            i8 = R.drawable.messaging_empty_state_illustration_findjob;
                                        } else if (iOrdinal2 == 1) {
                                            i8 = R.drawable.messaging_empty_state_illustration_archive;
                                        } else if (iOrdinal2 == 2) {
                                            i8 = R.drawable.messaging_empty_state_illustration_spam;
                                        } else {
                                            if (iOrdinal2 != 3) {
                                                l.g();
                                                return null;
                                            }
                                            i8 = R.drawable.messaging_empty_state_illustration_drafts;
                                        }
                                        boolean z6 = w47Var3 == w47.INBOX;
                                        androidx.navigation.e eVar3 = eVar2;
                                        boolean zX7 = bVar3.x(eVar3);
                                        FragmentManager fragmentManager3 = fragmentManager2;
                                        boolean zX8 = zX7 | bVar3.x(fragmentManager3);
                                        Object objV11 = bVar3.v();
                                        if (zX8 || objV11 == c0020a3) {
                                            objV11 = new yp0(4, eVar3, fragmentManager3);
                                            bVar3.p(objV11);
                                        }
                                        ls4 ls4Var = new ls4(i8, i7, (gu5) objV11, z6);
                                        boolean zX9 = bVar3.x(t67Var3);
                                        Object objV12 = bVar3.v();
                                        if (zX9 || objV12 == c0020a3) {
                                            objV12 = new o67(t67Var3, null);
                                            bVar3.p(objV12);
                                        }
                                        to4.d(bVar3, ls4Var, (Function2) objV12);
                                        ps4.a(ls4Var, bVar3, 0);
                                        bVar3.F();
                                    } else {
                                        bVar3.L(1201970416);
                                        by2.a(f.e(aVar, gzaVar), t67Var3.d, t67Var3.c, jtaVar4, function19, wu5Var2, function110, gu5Var8, i7dVar2, function111, function22, pz8Var2, bVar3, 0);
                                        bVar3.F();
                                    }
                                } else {
                                    bVar3.D();
                                }
                                return j6g.a;
                            }
                        }, bVar2), bVar2, 805309488, 244);
                        c7c.b(z4, g7cVar2, ml1Var.h(e.a.b, c20.a.b), 0L, 0L, bVar2, 64);
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, 6);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: z57
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i | 1);
                    int iL2 = ka2.L(i2);
                    s67.b(t67Var, jtaVar, fnfVar, c4gVar, z, g7cVar, gu5Var, fragmentManager, eVar, function1, function12, wu5Var, gu5Var2, i7dVar, z2, heeVar, gu5Var3, heeVar2, v47Var, gu5Var4, function13, function2, pz8Var, (b) obj, iL, iL2);
                    return j6g.a;
                }
            };
        }
    }
}
