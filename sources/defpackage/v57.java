package defpackage;

import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.d;
import androidx.navigation.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import com.indeed.android.messaging.data.conversations.ConversationWithDraft;
import defpackage.c20;
import defpackage.v57;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class v57 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[w47.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final u67 u67Var, final kta ktaVar, final fnf fnfVar, final Function1 function1, final FragmentManager fragmentManager, final e eVar, final Function2 function2, final gu5 gu5Var, b bVar, final int i) {
        c cVar;
        gu5 gu5Var2;
        j7d j7dVar;
        b.a.C0020a c0020a;
        int i2;
        Bundle bundleA;
        u67Var.getClass();
        ktaVar.getClass();
        fnfVar.getClass();
        function1.getClass();
        function2.getClass();
        gu5Var.getClass();
        c cVarH = bVar.h(-156603754);
        int i3 = i | (cVarH.x(u67Var) ? 4 : 2) | (cVarH.x(ktaVar) ? 32 : 16) | (cVarH.x(fnfVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(function1) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(fragmentManager) ? 16384 : 8192) | (cVarH.x(eVar) ? 131072 : 65536) | (cVarH.x(function2) ? 1048576 : 524288) | (cVarH.x(gu5Var) ? 8388608 : 4194304);
        if (cVarH.o(i3 & 1, (4793491 & i3) != 4793490)) {
            g4a g4aVarA = r.a(u67Var.Y, cVarH);
            g4a g4aVarA2 = r.a(ktaVar.e, cVarH);
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
            j7d j7dVar2 = (j7d) brgVarA;
            g4a g4aVarA3 = r.a(j7dVar2.e, cVarH);
            Object objV = cVarH.v();
            b.a.C0020a c0020a2 = b.a.a;
            if (objV == c0020a2) {
                objV = r.f(Boolean.FALSE);
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            boolean zX = cVarH.x(u67Var);
            Object objV2 = cVarH.v();
            if (zX || objV2 == c0020a2) {
                objV2 = new gx(5, u67Var, g4aVar);
                cVarH.p(objV2);
            }
            gu5 gu5Var3 = (gu5) objV2;
            g7c g7cVarD = jh2.D(((Boolean) g4aVar.getValue()).booleanValue(), gu5Var3, cVarH);
            boolean z = ((t67) g4aVarA.getValue()).e != w47.INBOX;
            boolean zK = cVarH.K(g4aVarA) | cVarH.x(u67Var);
            Object objV3 = cVarH.v();
            if (zK || objV3 == c0020a2) {
                objV3 = new jp0(5, u67Var, g4aVarA);
                cVarH.p(objV3);
            }
            g71.a(z, (gu5) objV3, cVarH, 0, 0);
            Boolean bool = ((t67) g4aVarA.getValue()).a;
            List<ConversationWithDraft> list = ((t67) g4aVarA.getValue()).d;
            ArrayList arrayList = new ArrayList(t92.r0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ConversationWithDraft) it.next()).getConversation().getId());
            }
            boolean zK2 = cVarH.K(g4aVarA) | cVarH.x(ktaVar);
            Object objV4 = cVarH.v();
            if (zK2 || objV4 == c0020a2) {
                objV4 = new j57(null, ktaVar, g4aVarA);
                cVarH.p(objV4);
            }
            to4.f(bool, arrayList, (Function2) objV4, cVarH);
            w5 w5Var = ((t67) g4aVarA.getValue()).f;
            if (w5Var == null) {
                cVarH.L(-1046364571);
            } else {
                cVarH.L(-1046364570);
                if (Build.VERSION.SDK_INT >= 30) {
                    cVarH.L(-595777648);
                    v5.a(w5Var, cVarH, 0);
                } else {
                    cVarH.L(-601418346);
                }
                cVarH.U(false);
                boolean zX2 = cVarH.x(u67Var);
                Object objV5 = cVarH.v();
                if (zX2 || objV5 == c0020a2) {
                    objV5 = new k57(null, u67Var);
                    cVarH.p(objV5);
                }
                to4.d(cVarH, w5Var, (Function2) objV5);
                j6g j6gVar = j6g.a;
            }
            cVarH.U(false);
            t67 t67Var = (t67) g4aVarA.getValue();
            jta jtaVar = (jta) g4aVarA2.getValue();
            boolean zBooleanValue = ((Boolean) g4aVar.getValue()).booleanValue();
            boolean zX3 = cVarH.x(u67Var);
            Object objV6 = cVarH.v();
            if (zX3 || objV6 == c0020a2) {
                gu5Var2 = gu5Var3;
                j7dVar = j7dVar2;
                c0020a = c0020a2;
                i2 = 0;
                l57 l57Var = new l57(1, u67Var, u67.class, "switchToFolder", "switchToFolder(Lcom/indeed/android/messaging/ui/inbox/InboxFolder;)Lkotlinx/coroutines/Job;", 8);
                cVarH.p(l57Var);
                objV6 = l57Var;
            } else {
                c0020a = c0020a2;
                i2 = 0;
                gu5Var2 = gu5Var3;
                j7dVar = j7dVar2;
            }
            Function1 function12 = (Function1) objV6;
            boolean zX4 = cVarH.x(u67Var);
            Object objV7 = cVarH.v();
            if (zX4 || objV7 == c0020a) {
                m57 m57Var = new m57(3, u67Var, u67.class, "onUpdateConversationFolder", "onUpdateConversationFolder(Lcom/indeed/android/messaging/data/conversations/ConversationRecord;Lcom/indeed/android/messaging/domain/ChangeFolderTrigger;Lkotlin/jvm/functions/Function0;)V", 0);
                cVarH.p(m57Var);
                objV7 = m57Var;
            }
            wu5 wu5Var = (wu5) ((ve8) objV7);
            boolean zX5 = cVarH.x(u67Var);
            Object objV8 = cVarH.v();
            if (zX5 || objV8 == c0020a) {
                n57 n57Var = new n57(0, u67Var, u67.class, "loadMoreConversations", "loadMoreConversations()Lkotlinx/coroutines/Job;", 8);
                cVarH.p(n57Var);
                objV8 = n57Var;
            }
            gu5 gu5Var4 = (gu5) objV8;
            i7d i7dVar = (i7d) g4aVarA3.getValue();
            boolean zX6 = cVarH.x(j7dVar);
            Object objV9 = cVarH.v();
            if (zX6 || objV9 == c0020a) {
                objV9 = new o57(0, j7dVar, j7d.class, "getResponsiveStatus", "getResponsiveStatus()V", 0);
                cVarH.p(objV9);
            }
            gu5 gu5Var5 = (gu5) ((ve8) objV9);
            boolean zX7 = cVarH.x(u67Var);
            Object objV10 = cVarH.v();
            if (zX7 || objV10 == c0020a) {
                objV10 = new c57(u67Var, i2);
                cVarH.p(objV10);
            }
            int i4 = i3 << 6;
            cVar = cVarH;
            b(t67Var, jtaVar, fnfVar, zBooleanValue, g7cVarD, gu5Var2, fragmentManager, eVar, function1, function12, wu5Var, gu5Var4, i7dVar, gu5Var5, (Function1) objV10, function2, gu5Var, u67Var.a0, cVar, (i3 & 896) | 32768 | (3670016 & i4) | (i4 & 29360128) | ((i3 << 15) & 234881024), (i3 >> 3) & 4128768);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(ktaVar, fnfVar, function1, fragmentManager, eVar, function2, gu5Var, i) { // from class: d57
                public final /* synthetic */ Function2 V;
                public final /* synthetic */ gu5 W;
                public final /* synthetic */ kta b;
                public final /* synthetic */ fnf c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ FragmentManager e;
                public final /* synthetic */ e f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    v57.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(final t67 t67Var, final jta jtaVar, final fnf fnfVar, final boolean z, final g7c g7cVar, final gu5 gu5Var, final FragmentManager fragmentManager, final e eVar, final Function1 function1, final Function1 function12, final wu5 wu5Var, final gu5 gu5Var2, final i7d i7dVar, final gu5 gu5Var3, final Function1 function13, final Function2 function2, final gu5 gu5Var4, final pz8 pz8Var, b bVar, final int i, final int i2) {
        int i3;
        jta jtaVar2;
        fnf fnfVar2;
        boolean z2;
        int i4;
        gu5 gu5Var5;
        int i5;
        c cVar;
        Configuration configuration;
        e13 e13Var;
        hee heeVar;
        e13 e13Var2;
        c cVarH = bVar.h(396250871);
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
        int i6 = i & 3072;
        int i7 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        if (i6 == 0) {
            z2 = z;
            i3 |= cVarH.a(z2) ? 2048 : 1024;
        } else {
            z2 = z;
        }
        if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? cVarH.K(g7cVar) : cVarH.x(g7cVar) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i4 = 196608;
            gu5Var5 = gu5Var;
            i3 |= cVarH.x(gu5Var5) ? 131072 : 65536;
        } else {
            i4 = 196608;
            gu5Var5 = gu5Var;
        }
        if ((i & 1572864) == 0) {
            i3 |= cVarH.x(fragmentManager) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= cVarH.x(eVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= cVarH.x(function1) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= cVarH.x(function12) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (cVarH.x(wu5Var) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= cVarH.x(gu5Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0 ? cVarH.K(i7dVar) : cVarH.x(i7dVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i2 & 3072) == 0) {
            if (cVarH.x(gu5Var3)) {
                i7 = 2048;
            }
            i5 |= i7;
        }
        if ((i2 & 24576) == 0) {
            i5 |= cVarH.x(function13) ? 16384 : 8192;
        }
        if ((i2 & i4) == 0) {
            i5 |= cVarH.x(function2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= cVarH.x(gu5Var4) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= cVarH.x(pz8Var) ? 8388608 : 4194304;
        }
        if (cVarH.o(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 4793491) == 4793490) ? false : true)) {
            cVarH.v0();
            if ((i & 1) != 0 && !cVarH.c0()) {
                cVarH.D();
            }
            cVarH.V();
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                m74 m74Var = to4.a;
                objV = v40.b(cVarH.l(), cVarH);
            }
            e13 e13Var3 = (e13) objV;
            hee heeVarF = hv9.f(false, cVarH, 6, 2);
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(null);
                cVarH.p(objV2);
            }
            final g4a g4aVar = (g4a) objV2;
            Configuration configuration2 = (Configuration) cVarH.M(AndroidCompositionLocals_androidKt.a);
            boolean zX = cVarH.x(e13Var3) | cVarH.K(heeVarF);
            Object objV3 = cVarH.v();
            if (zX || objV3 == c0020a) {
                configuration = configuration2;
                objV3 = new jn1(2, e13Var3, heeVarF, g4aVar);
                cVarH.p(objV3);
            } else {
                configuration = configuration2;
            }
            final gu5 gu5Var6 = (gu5) objV3;
            yf6 yf6Var = (yf6) cVarH.M(um2.l);
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                objV4 = r.f(null);
                cVarH.p(objV4);
            }
            final g4a g4aVar2 = (g4a) objV4;
            boolean zX2 = cVarH.x(yf6Var) | cVarH.x(e13Var3) | cVarH.K(heeVarF);
            Object objV5 = cVarH.v();
            if (zX2 || objV5 == c0020a) {
                objV5 = new w41(yf6Var, e13Var3, g4aVar2, heeVarF, g4aVar);
                e13Var = e13Var3;
                heeVar = heeVarF;
                cVarH.p(objV5);
            } else {
                heeVar = heeVarF;
                e13Var = e13Var3;
            }
            final Function1 function14 = (Function1) objV5;
            boolean zX3 = cVarH.x(e13Var) | cVarH.K(heeVar) | ((i5 & 14) == 4);
            Object objV6 = cVarH.v();
            if (zX3 || objV6 == c0020a) {
                final e13 e13Var4 = e13Var;
                final hee heeVar2 = heeVar;
                objV6 = new Function1() { // from class: e57
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((w47) obj).getClass();
                        ConversationRecord conversationRecord = (ConversationRecord) g4aVar2.getValue();
                        if (conversationRecord != null) {
                            hee heeVar3 = heeVar2;
                            u63.Y(e13Var4, null, null, new s57(heeVar3, null), 3).d0(new w34(4, heeVar3, g4aVar));
                            wu5Var.q(conversationRecord, p12.b, new bo0(8));
                        }
                        return j6g.a;
                    }
                };
                e13Var2 = e13Var4;
                cVarH.p(objV6);
            } else {
                e13Var2 = e13Var;
            }
            final Function1 function15 = (Function1) objV6;
            final jta jtaVar3 = jtaVar2;
            final boolean z3 = z2;
            final gu5 gu5Var7 = gu5Var5;
            final e13 e13Var5 = e13Var2;
            final hee heeVar3 = heeVar;
            final Configuration configuration3 = configuration;
            final fnf fnfVar3 = fnfVar2;
            wu5 wu5Var2 = new wu5() { // from class: f57
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    ml1 ml1Var = (ml1) obj;
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ml1Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= bVar2.K(ml1Var) ? 4 : 2;
                    }
                    if (bVar2.o(iIntValue & 1, (iIntValue & 19) != 18)) {
                        g4a g4aVar3 = g4aVar;
                        v47 v47Var = (v47) g4aVar3.getValue();
                        final t67 t67Var2 = t67Var;
                        Function1 function16 = function12;
                        if (v47Var == null) {
                            bVar2.L(1133845600);
                        } else {
                            bVar2.L(1133845601);
                            bVar2.A(-794089016, Integer.valueOf(configuration3.orientation));
                            w47 w47Var = t67Var2.e;
                            e13 e13Var6 = e13Var5;
                            boolean zX4 = bVar2.x(e13Var6);
                            hee heeVar4 = heeVar3;
                            boolean zK = zX4 | bVar2.K(heeVar4);
                            Object objV7 = bVar2.v();
                            if (zK || objV7 == b.a.a) {
                                objV7 = new h57(0, e13Var6, heeVar4, g4aVar3);
                                bVar2.p(objV7);
                            }
                            u47.a(e13Var6, heeVar4, v47Var, w47Var, function16, function15, (gu5) objV7, bVar2, 0);
                            bVar2.I();
                        }
                        bVar2.F();
                        g7c g7cVar2 = g7cVar;
                        androidx.compose.ui.e eVarL = pyd.L(g7cVar2);
                        mg5 mg5Var = new mg5();
                        gu5 gu5Var8 = gu5Var6;
                        final i7d i7dVar2 = i7dVar;
                        ah2 ah2VarC = bh2.c(1687943431, new ql4(t67Var2, gu5Var8, function16, i7dVar2, gu5Var3, gu5Var4), bVar2);
                        ah2 ah2VarC2 = bh2.c(306135493, new pe(fnfVar3, 2), bVar2);
                        final gu5 gu5Var9 = gu5Var7;
                        final e eVar2 = eVar;
                        final FragmentManager fragmentManager2 = fragmentManager;
                        final jta jtaVar4 = jtaVar3;
                        final Function1 function17 = function1;
                        final wu5 wu5Var3 = wu5Var;
                        final Function1 function18 = function14;
                        final gu5 gu5Var10 = gu5Var2;
                        final Function1 function19 = function13;
                        final Function2 function22 = function2;
                        final pz8 pz8Var2 = pz8Var;
                        dmd.a(eVarL, ah2VarC, null, ah2VarC2, null, 0, 0L, 0L, mg5Var, bh2.c(1583565916, new wu5() { // from class: i57
                            @Override // defpackage.wu5
                            public final Object q(Object obj4, Object obj5, Object obj6) {
                                int i8;
                                int i9;
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
                                    w47 w47Var2 = t67Var3.e;
                                    boolean zB = wl7.b(bool, Boolean.TRUE);
                                    e.a aVar = e.a.b;
                                    b.a.C0020a c0020a2 = b.a.a;
                                    if (zB && list.isEmpty()) {
                                        bVar3.L(91552665);
                                        boolean zX5 = bVar3.x(t67Var3);
                                        Object objV8 = bVar3.v();
                                        if (zX5 || objV8 == c0020a2) {
                                            objV8 = new p57(t67Var3, null);
                                            bVar3.p(objV8);
                                        }
                                        to4.d(bVar3, bool, (Function2) objV8);
                                        dy2.a(f.e(aVar, gzaVar), bVar3, 0);
                                        bVar3.F();
                                    } else if (t67Var3.b) {
                                        bVar3.L(91985983);
                                        boolean zX6 = bVar3.x(t67Var3);
                                        Object objV9 = bVar3.v();
                                        if (zX6 || objV9 == c0020a2) {
                                            objV9 = new q57(t67Var3, null);
                                            bVar3.p(objV9);
                                        }
                                        to4.d(bVar3, bool, (Function2) objV9);
                                        gu5 gu5Var11 = gu5Var9;
                                        boolean zK2 = bVar3.K(gu5Var11);
                                        Object objV10 = bVar3.v();
                                        if (zK2 || objV10 == c0020a2) {
                                            objV10 = new wc(6, gu5Var11);
                                            bVar3.p(objV10);
                                        }
                                        lg0.a((gu5) objV10, bVar3, 0);
                                        bVar3.F();
                                    } else if (wl7.b(bool, Boolean.FALSE) && t67Var3.c == null && list.isEmpty()) {
                                        bVar3.L(92655583);
                                        int iOrdinal = w47Var2.ordinal();
                                        if (iOrdinal == 0) {
                                            i8 = R.string.messaging_empty_state_text_findjobs;
                                        } else if (iOrdinal == 1) {
                                            i8 = R.string.messaging_empty_state_text_archive;
                                        } else if (iOrdinal == 2) {
                                            i8 = R.string.messaging_empty_state_text_spam;
                                        } else {
                                            if (iOrdinal != 3) {
                                                l.g();
                                                return null;
                                            }
                                            i8 = R.string.messaging_empty_state_text_drafts;
                                        }
                                        int iOrdinal2 = w47Var2.ordinal();
                                        if (iOrdinal2 == 0) {
                                            i9 = R.drawable.messaging_empty_state_illustration_findjob;
                                        } else if (iOrdinal2 == 1) {
                                            i9 = R.drawable.messaging_empty_state_illustration_archive;
                                        } else if (iOrdinal2 == 2) {
                                            i9 = R.drawable.messaging_empty_state_illustration_spam;
                                        } else {
                                            if (iOrdinal2 != 3) {
                                                l.g();
                                                return null;
                                            }
                                            i9 = R.drawable.messaging_empty_state_illustration_drafts;
                                        }
                                        boolean z4 = v57.a.a[w47Var2.ordinal()] == 1;
                                        androidx.navigation.e eVar3 = eVar2;
                                        boolean zX7 = bVar3.x(eVar3);
                                        FragmentManager fragmentManager3 = fragmentManager2;
                                        boolean zX8 = zX7 | bVar3.x(fragmentManager3);
                                        Object objV11 = bVar3.v();
                                        if (zX8 || objV11 == c0020a2) {
                                            objV11 = new ry(6, eVar3, fragmentManager3);
                                            bVar3.p(objV11);
                                        }
                                        ls4 ls4Var = new ls4(i9, i8, (gu5) objV11, z4);
                                        boolean zX9 = bVar3.x(t67Var3);
                                        Object objV12 = bVar3.v();
                                        if (zX9 || objV12 == c0020a2) {
                                            objV12 = new r57(t67Var3, null);
                                            bVar3.p(objV12);
                                        }
                                        to4.d(bVar3, ls4Var, (Function2) objV12);
                                        ps4.a(ls4Var, bVar3, 0);
                                        bVar3.F();
                                    } else {
                                        bVar3.L(94929464);
                                        by2.a(f.e(aVar, gzaVar), t67Var3.d, t67Var3.c, jtaVar4, function17, wu5Var3, function18, gu5Var10, i7dVar2, function19, function22, pz8Var2, bVar3, 0);
                                        bVar3.F();
                                    }
                                } else {
                                    bVar3.D();
                                }
                                return j6g.a;
                            }
                        }, bVar2), bVar2, 805309488, 244);
                        c7c.b(z3, g7cVar2, ml1Var.h(e.a.b, c20.a.b), 0L, 0L, bVar2, 64);
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            };
            cVar = cVarH;
            kr9.a(bh2.c(-1487651765, wu5Var2, cVar), cVar, 6);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: g57
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i | 1);
                    int iL2 = ka2.L(i2);
                    v57.b(t67Var, jtaVar, fnfVar, z, g7cVar, gu5Var, fragmentManager, eVar, function1, function12, wu5Var, gu5Var2, i7dVar, gu5Var3, function13, function2, gu5Var4, pz8Var, (b) obj, iL, iL2);
                    return j6g.a;
                }
            };
        }
    }
}
