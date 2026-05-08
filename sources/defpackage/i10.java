package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import com.indeed.android.messaging.data.conversations.model.SuggestedMessageModel;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class i10 {
    public static final List<SuggestedMessageModel> a = u63.a0(new SuggestedMessageModel("I appreciate your interest. During my five years at Wayfair Hospital, I focused on patient management, collaborating with healthcare teams, and implementing process improvements that enhanced service delivery and efficiency.", "Dynamic label 1", "123", 0), new SuggestedMessageModel("Hi Lesley, short", "Dynamic label 2", "123", 1), new SuggestedMessageModel("Hi Lesley, I am very good at doing this and that because I had such a great experience before that. I would like to chat more about it. Let me know when is good time. A Also happy to chat with you over the phone too!", null, "123", 2), new SuggestedMessageModel("Thanxxxxxx a lot. During my five years at Wayfair Hospital, I focused on patient management, collaborating with healthcare teams, and implementing process improvements that enhanced service delivery and efficiency.", "Dynamic label 1", "123", 3));

    public static final void a(final gu5 gu5Var, final Function1 function1, final List list, final boolean z, final String str, final int i, final gu5 gu5Var2, b bVar, final int i2) {
        gu5Var.getClass();
        function1.getClass();
        list.getClass();
        str.getClass();
        c cVarH = bVar.h(-1809433610);
        int i3 = i2 | (cVarH.x(gu5Var) ? 4 : 2) | (cVarH.x(function1) ? 32 : 16) | (cVarH.x(list) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.a(z) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.K(str) ? 16384 : 8192) | (cVarH.d(i) ? 131072 : 65536) | (cVarH.x(gu5Var2) ? 1048576 : 524288);
        if (cVarH.o(i3 & 1, (599187 & i3) != 599186)) {
            nx6.a(gu5Var, null, hv9.f(true, cVarH, 6, 2), "AIMessagingSuggestionBottomSheet", false, null, bh2.c(-1821901028, new wu5() { // from class: v00
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    pb2 pb2Var = (pb2) obj;
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    pb2Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= bVar2.K(pb2Var) ? 4 : 2;
                    }
                    int i4 = 0;
                    if (bVar2.o(iIntValue & 1, (iIntValue & 19) != 18)) {
                        gu5 gu5Var3 = gu5Var;
                        nx6.c("", null, false, false, false, null, null, bh2.c(-1890367608, new x00(i4, gu5Var3), bVar2), null, "AIMessagingSuggestionBottomSheetHeader", bVar2, 817889286, 382);
                        if (z) {
                            bVar2.L(-751571048);
                            i10.e(0, bVar2);
                            bVar2.F();
                        } else {
                            bVar2.L(-751499841);
                            e.a aVar = e.a.b;
                            int i5 = i;
                            if (i5 == 0) {
                                bVar2.L(-751462765);
                                i10.b(function1, list, str, pb2Var.a(aVar, true), bVar2, 0);
                                bVar2.F();
                            } else {
                                bVar2.L(-751152269);
                                i10.c(gu5Var2, gu5Var3, i5, pb2Var.a(aVar, true), bVar2, 0);
                                bVar2.F();
                            }
                            bVar2.F();
                        }
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, (i3 & 14) | 1575936, 50);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(function1, list, z, str, i, gu5Var2, i2) { // from class: w00
                public final /* synthetic */ gu5 V;
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ List c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ String e;
                public final /* synthetic */ int f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    i10.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x036d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final kotlin.jvm.functions.Function1 r54, final java.util.List r55, final java.lang.String r56, final androidx.compose.ui.e r57, androidx.compose.runtime.b r58, final int r59) {
        /*
            Method dump skipped, instruction units count: 1328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i10.b(kotlin.jvm.functions.Function1, java.util.List, java.lang.String, androidx.compose.ui.e, androidx.compose.runtime.b, int):void");
    }

    public static final void c(final gu5 gu5Var, final gu5 gu5Var2, final int i, final e eVar, b bVar, final int i2) {
        c cVarH = bVar.h(1906911314);
        int i3 = i2 | (cVarH.x(gu5Var) ? 4 : 2) | (cVarH.x(gu5Var2) ? 32 : 16) | (cVarH.d(i) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.K(eVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        int i4 = 0;
        if (cVarH.o(i3 & 1, (i3 & 1171) != 1170)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            o97.g gVar = o97Var.i;
            tjf tjfVar = o97Var.j.f;
            vs0.i iVar = new vs0.i(16.0f, true, new us0(i4));
            e eVarG = f.g(g.f(eVar, 1.0f), 16.0f, 64.0f);
            ob2 ob2VarA = mb2.a(iVar, c20.a.n, cVarH, 48);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarG);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
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
            gl2.a.e eVar2 = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar2);
            ehd ehdVarA = chd.a(vs0.a, c20.a.j, cVarH, 0);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e.a aVar2 = e.a.b;
            e eVarC2 = androidx.compose.ui.c.c(cVarH, aVar2);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar2);
            ev6.b(fv6.ia, null, null, zq6.Md, o97Var.c.a.a, null, cVarH, 3078, 38);
            fif.b(ak2.I(R.string.messaging_ai_suggestions_error_message, cVarH), f.h(aVar2, 8.0f, 0.0f, 2), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar, cVarH, 0, 0, 65532);
            cVarH = cVarH;
            cVarH.U(true);
            if (i <= 3) {
                cVarH.L(-431006375);
                gt6.j(ak2.I(R.string.messaging_ai_suggestions_error_button_try_again, cVarH), gu5Var, null, null, false, false, null, null, null, cVarH, (i3 << 3) & 112, 508);
                cVarH.U(false);
            } else {
                cVarH.L(-430802209);
                fif.b(ak2.I(R.string.messaging_ai_suggestions_error_message_try_later, cVarH), f.h(aVar2, 8.0f, 0.0f, 2), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar, cVarH, 0, 0, 65532);
                cVarH = cVarH;
                gt6.j(ak2.I(R.string.messaging_ok, cVarH), gu5Var2, null, null, false, false, null, null, null, cVarH, i3 & 112, 508);
                cVarH.U(false);
            }
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(gu5Var2, i, eVar, i2) { // from class: d10
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ int c;
                public final /* synthetic */ e d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    i10.c(this.a, this.b, this.c, this.d, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final String str, boolean z, final int i, b bVar, final int i2) {
        boolean z2;
        final boolean z3 = z;
        c cVarH = bVar.h(1296119110);
        int i3 = i2 | (cVarH.K(str) ? 4 : 2) | (cVarH.a(z3) ? 32 : 16) | (cVarH.d(i) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        int i4 = 0;
        if (cVarH.o(i3 & 1, (i3 & 1171) != 1170)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(Boolean.FALSE);
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            float f = 0.0f;
            ese eseVarB = vc0.b(((Boolean) g4aVar.getValue()).booleanValue() ? 1.0f : 0.0f, zd0.d(1000, 0, null, 4), null, cVarH, 0, 28);
            if (((Boolean) g4aVar.getValue()).booleanValue()) {
                o97.g gVar = o97Var.i;
                f = 32.0f;
            }
            ese eseVarA = vc0.a(f, zd0.d(1000, 500, null, 4), cVarH, 0);
            Boolean bool = Boolean.TRUE;
            boolean z4 = (i3 & 896) == 256;
            Object objV2 = cVarH.v();
            if (z4 || objV2 == c0020a) {
                objV2 = new h10(i, 1000, g4aVar, null);
                cVarH.p(objV2);
            }
            to4.d(cVarH, bool, (Function2) objV2);
            float fFloatValue = ((Number) eseVarB.getValue()).floatValue();
            e.a aVar = e.a.b;
            e eVarG = ygg.g(aVar, fFloatValue);
            o97.g gVar2 = o97Var.i;
            ob2 ob2VarA = mb2.a(new vs0.i(4.0f, true, new us0(i4)), c20.a.m, cVarH, 48);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarG);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            fif.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.f, cVarH, i3 & 14, 0, 65534);
            z3 = z;
            cVarH = cVarH;
            if (z3) {
                z2 = false;
                cVarH.L(712174386);
            } else {
                cVarH.L(727318103);
                jh2.f(cVarH, g.h(aVar, 4.0f));
                jh2.f(cVarH, a.b(g.r(g.h(aVar, ((j94) eseVarA.getValue()).a), 2.0f), o97Var.c.b.c, ytc.a));
                jh2.f(cVarH, g.h(aVar, 4.0f));
                z2 = false;
            }
            cVarH.U(z2);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(i, i2, str, z3) { // from class: e10
                public final /* synthetic */ String a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ int c;

                {
                    this.a = str;
                    this.b = z3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(3073);
                    i10.d(this.a, this.b, this.c, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void e(int i, b bVar) {
        c cVarH = bVar.h(-527867122);
        if (cVarH.o(i & 1, i != 0)) {
            List listA0 = u63.a0(ak2.I(R.string.messaging_ai_searching_past_conversations, cVarH), ak2.I(R.string.messaging_ai_gathering_job_details, cVarH), ak2.I(R.string.messaging_ai_reviewing_your_indeed_profile, cVarH), ak2.I(R.string.messaging_ai_drafting_message_options, cVarH));
            o97 o97Var = (o97) cVarH.M(p97.a);
            e eVarC = g.c(e.a.b, 1.0f);
            o97.g gVar = o97Var.i;
            e eVarG = f.g(eVarC, 16.0f, 12.0f);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 48);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarG);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC2, gl2.a.d);
            cVarH.L(1449086910);
            int i2 = 0;
            for (Object obj : listA0) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    u63.o0();
                    throw null;
                }
                d((String) obj, i2 == listA0.size() - 1, i2, cVarH, 3072);
                i2 = i3;
            }
            cVarH.U(false);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new c10(i, 0);
        }
    }
}
