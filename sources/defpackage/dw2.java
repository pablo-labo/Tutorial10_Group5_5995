package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.e;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class dw2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final ConversationRecord conversationRecord, final jta jtaVar, final gu5 gu5Var, final gu5 gu5Var2, final gu5 gu5Var3, final Function1 function1, final FragmentManager fragmentManager, final e eVar, b bVar, final int i) {
        c cVar;
        e13 e13Var;
        g4a g4aVar;
        c cVar2;
        boolean z;
        boolean z2;
        conversationRecord.getClass();
        jtaVar.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        c cVarH = bVar.h(1954768349);
        int i2 = i | (cVarH.x(conversationRecord) ? 4 : 2) | (cVarH.x(jtaVar) ? 32 : 16) | (cVarH.x(gu5Var) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(gu5Var3) ? 16384 : 8192) | (cVarH.x(function1) ? 131072 : 65536) | (cVarH.x(fragmentManager) ? 1048576 : 524288) | (cVarH.x(eVar) ? 8388608 : 4194304);
        if (cVarH.o(i2 & 1, (4793491 & i2) != 4793490)) {
            boolean z3 = (i2 & 896) == 256;
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (z3 || objV == c0020a) {
                objV = new mg(3, gu5Var);
                cVarH.p(objV);
            }
            g71.a(false, (gu5) objV, cVarH, 0, 1);
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                m74 m74Var = to4.a;
                objV2 = v40.b(cVarH.l(), cVarH);
            }
            e13 e13Var2 = (e13) objV2;
            final hee heeVarF = hv9.f(false, cVarH, 6, 2);
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = r.f(Boolean.FALSE);
                cVarH.p(objV3);
            }
            g4a g4aVar2 = (g4a) objV3;
            boolean zX = cVarH.x(conversationRecord);
            Object objV4 = cVarH.v();
            if (zX || objV4 == c0020a) {
                objV4 = new aw2(conversationRecord, null);
                cVarH.p(objV4);
            }
            to4.d(cVarH, conversationRecord, (Function2) objV4);
            if (((Boolean) g4aVar2.getValue()).booleanValue()) {
                cVarH.L(-956730137);
                boolean z4 = jtaVar.b;
                boolean z5 = (458752 & i2) == 131072;
                Object objV5 = cVarH.v();
                if (z5 || objV5 == c0020a) {
                    objV5 = new cj(function1, 3);
                    cVarH.p(objV5);
                }
                Function1 function12 = (Function1) objV5;
                boolean zX2 = cVarH.x(e13Var2) | cVarH.K(heeVarF);
                Object objV6 = cVarH.v();
                if (zX2 || objV6 == c0020a) {
                    z2 = false;
                    objV6 = new vv2(0, e13Var2, heeVarF, g4aVar2);
                    cVarH.p(objV6);
                } else {
                    z2 = false;
                }
                g4aVar = g4aVar2;
                e13Var = e13Var2;
                z = z2;
                mn4.a(heeVarF, z4, function12, (gu5) objV6, cVarH, 0);
                heeVarF = heeVarF;
                cVar2 = cVarH;
            } else {
                e13Var = e13Var2;
                g4aVar = g4aVar2;
                cVar2 = cVarH;
                z = false;
                cVar2.L(-959554299);
            }
            cVar2.U(z);
            final e13 e13Var3 = e13Var;
            final g4a g4aVar3 = g4aVar;
            cVar = cVar2;
            oi7.a(R.string.messaging_conversation_details_header, "ConversationDetails", null, gu5Var, null, null, null, false, true, null, bh2.c(1593484042, new wu5() { // from class: wv2
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    int i3;
                    int i4;
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((pb2) obj).getClass();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        ConversationRecord conversationRecord2 = conversationRecord;
                        mx7.a(conversationRecord2, fragmentManager, eVar, bVar2, 0);
                        e13 e13Var4 = e13Var3;
                        boolean zX3 = bVar2.x(e13Var4);
                        hee heeVar = heeVarF;
                        boolean zK = zX3 | bVar2.K(heeVar);
                        Object objV7 = bVar2.v();
                        b.a.C0020a c0020a2 = b.a.a;
                        if (zK || objV7 == c0020a2) {
                            objV7 = new yv2(0, e13Var4, heeVar, g4aVar3);
                            bVar2.p(objV7);
                        }
                        y4b.a(conversationRecord2, jtaVar, (gu5) objV7, bVar2, 0);
                        e.a aVar = e.a.b;
                        androidx.compose.ui.e eVarF = g.f(aVar, 1.0f);
                        boolean zX4 = bVar2.x(conversationRecord2);
                        Object objV8 = bVar2.v();
                        if (zX4 || objV8 == c0020a2) {
                            objV8 = new fj(conversationRecord2, 2);
                            bVar2.p(objV8);
                        }
                        androidx.compose.ui.e eVarB = b5e.b(eVarF, false, (Function1) objV8);
                        ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(bVar2, eVarB);
                        gl2.j.getClass();
                        pm8.a aVar2 = gl2.a.b;
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar2);
                        } else {
                            bVar2.n();
                        }
                        ygg.y(bVar2, ob2VarA, gl2.a.g);
                        ygg.y(bVar2, t8bVarM, gl2.a.f);
                        gl2.a.C0251a c0251a = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar2, iHashCode, c0251a);
                        }
                        ygg.y(bVar2, eVarC, gl2.a.d);
                        if (conversationRecord2.getFolder() == w47.INBOX) {
                            i3 = -821673860;
                            i4 = R.string.messaging_conversation_archive_action;
                        } else {
                            i3 = -821566724;
                            i4 = R.string.messaging_conversation_restore_action;
                        }
                        String strE = l.e(bVar2, i3, i4, bVar2);
                        androidx.compose.ui.e eVarF2 = g.f(aVar, 1.0f);
                        Object objV9 = bVar2.v();
                        if (objV9 == c0020a2) {
                            objV9 = new nf(6);
                            bVar2.p(objV9);
                        }
                        b bVar3 = bVar2;
                        gt6.m(strE, gu5Var2, b5e.b(eVarF2, false, (Function1) objV9), null, false, null, null, bVar3, 0, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
                        if (conversationRecord2.getFolder() != w47.SPAM) {
                            bVar3.L(-821008352);
                            String strI = ak2.I(R.string.messaging_conversation_report_spam_action, bVar3);
                            androidx.compose.ui.e eVarF3 = g.f(f.a(aVar, "reportSpamButton"), 1.0f);
                            Object objV10 = bVar3.v();
                            if (objV10 == c0020a2) {
                                objV10 = new dc(7);
                                bVar3.p(objV10);
                            }
                            gt6.e(strI, gu5Var3, b5e.b(eVarF3, false, (Function1) objV10), null, null, null, bVar3, 0, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
                            bVar3 = bVar3;
                        } else {
                            bVar3.L(-826086462);
                        }
                        bVar3.F();
                        bVar3.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVar), cVar, ((i2 << 3) & 7168) | 100663344, 756);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(jtaVar, gu5Var, gu5Var2, gu5Var3, function1, fragmentManager, eVar, i) { // from class: xv2
                public final /* synthetic */ FragmentManager V;
                public final /* synthetic */ androidx.navigation.e W;
                public final /* synthetic */ jta b;
                public final /* synthetic */ gu5 c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ gu5 e;
                public final /* synthetic */ Function1 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    dw2.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
