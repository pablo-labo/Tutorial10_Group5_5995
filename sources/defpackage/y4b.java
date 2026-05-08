package defpackage;

import android.os.Bundle;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.navigation.d;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class y4b {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ConversationRecord conversationRecord, jta jtaVar, gu5 gu5Var, b bVar, int i) {
        Bundle bundleA;
        conversationRecord.getClass();
        jtaVar.getClass();
        c cVarH = bVar.h(1608564136);
        int i2 = i | (cVarH.x(conversationRecord) ? 4 : 2) | (cVarH.x(jtaVar) ? 32 : 16) | (cVarH.x(gu5Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
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
            p63 p63VarQ = null;
            d dVar = jrgVarA instanceof d ? (d) jrgVarA : null;
            if (dVar != null && (bundleA = dVar.a()) != null) {
                p63VarQ = pnb.Q(bundleA, jrgVarA);
            }
            yd8 yd8VarB = fwc.a.b(j7d.class);
            irg viewModelStore = jrgVarA.getViewModelStore();
            viewModelStore.getClass();
            brg brgVarA = p66.a(yd8VarB, viewModelStore, p63VarQ == null ? p63VarA : p63VarQ, null, qpdVar, null);
            cVarH.U(false);
            g4a g4aVarA = r.a(((j7d) brgVarA).e, cVarH);
            e.a aVar = e.a.b;
            e eVarA = ti1.a(a.b(g.f(aVar, 1.0f), o97Var.c.b.a, ggd.a(16.0f)), 1.0f, o97Var.c.c.b, ggd.a(16.0f));
            ag9 ag9VarD = hl1.d(c20.a.a, false);
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
            gl2.a.d dVar2 = gl2.a.g;
            ygg.y(cVarH, ag9VarD, dVar2);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            e eVarJ = f.j(aVar, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            vs0.k kVar = vs0.c;
            af1.a aVar3 = c20.a.m;
            ob2 ob2VarA = mb2.a(kVar, aVar3, cVarH, 0);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarJ);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, dVar2);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar);
            b(gu5Var, cVarH, (i2 >> 6) & 14);
            e eVarH = f.h(aVar, 16.0f, 0.0f, 2);
            ob2 ob2VarA2 = mb2.a(new vs0.i(16.0f, true, new us0(0)), aVar3, cVarH, 0);
            int iHashCode3 = Long.hashCode(cVarH.T);
            t8b t8bVarP3 = cVarH.P();
            e eVarC3 = androidx.compose.ui.c.c(cVarH, eVarH);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA2, dVar2);
            ygg.y(cVarH, t8bVarP3, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode3))) {
                ja.h(iHashCode3, cVarH, iHashCode3, c0251a);
            }
            ygg.y(cVarH, eVarC3, eVar);
            cVarH.L(-1400958726);
            List<ConversationRecord.Participant> listP1 = z92.p1(z92.p1(z92.p1(z92.p1(conversationRecord.getParticipants(), new wc0(1)), new w4b()), new g9h(2)), new hhd(1));
            ArrayList arrayList = new ArrayList(t92.r0(listP1, 10));
            for (ConversationRecord.Participant participant : listP1) {
                v9b.a(participant, z92.I0(jtaVar.a, participant.getOnlineStatusId()), jtaVar.b, u4b.b, androidx.compose.ui.platform.f.a(aVar, "ParticipantListItem"), (i7d) g4aVarA.getValue(), cVarH, 27648, 0);
                arrayList.add(j6g.a);
                aVar = aVar;
            }
            cVarH.U(false);
            cVarH.U(true);
            cVarH.U(true);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new uf(i, 4, gu5Var, conversationRecord, jtaVar);
        }
    }

    public static final void b(gu5 gu5Var, b bVar, final int i) {
        int i2;
        final gu5 gu5Var2;
        c cVarH = bVar.h(1518508631);
        if ((i & 6) == 0) {
            i2 = i | (cVarH.x(gu5Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                m74 m74Var = to4.a;
                objV = v40.b(cVarH.l(), cVarH);
            }
            e13 e13Var = (e13) objV;
            ie1 ie1VarD = ee1.d(false, cVarH, 5);
            o97.g gVar = o97Var.i;
            o97.a.e eVar = o97Var.c.a;
            o97.c cVar = o97Var.f;
            tjf tjfVar = o97Var.j.g;
            e.a aVar = e.a.b;
            e eVarH = f.h(aVar, 16.0f, 0.0f, 2);
            ehd ehdVarA = chd.a(vs0.a, c20.a.k, cVarH, 48);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarH);
            gl2.j.getClass();
            int i3 = i2;
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            fif.b(ak2.I(R.string.messaging_participant_list_heading, cVarH), null, eVar.c, 0L, cVar.c, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((tjf) cVarH.M(fif.a)).d(tjfVar), cVarH, 0, 0, 65498);
            b07.b(ak2.I(R.string.messaging_participant_list_disclaimer, cVarH), pnf.b, ie1VarD, null, 0.0f, null, bh2.c(413051522, new od(1, o97Var, e13Var, ie1VarD), cVarH), cVarH, 12583344, 112);
            jh2.f(cVarH, new LayoutWeightElement(1.0f, true));
            String strI = ak2.I(R.string.messaging_edit_status, cVarH);
            to5 to5Var = cVar.c;
            long j = eVar.c;
            boolean z = (i3 & 14) == 4;
            Object objV2 = cVarH.v();
            if (z || objV2 == c0020a) {
                gu5Var2 = gu5Var;
                objV2 = new cl6(4, gu5Var2);
                cVarH.p(objV2);
            } else {
                gu5Var2 = gu5Var;
            }
            fif.b(strI, androidx.compose.ui.platform.f.a(androidx.compose.foundation.b.d(aVar, false, null, null, (gu5) objV2, 15), "EditStatusLink"), j, 0L, to5Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar, cVarH, 0, 0, 65496);
            cVarH = cVarH;
            cVarH.U(true);
        } else {
            gu5Var2 = gu5Var;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: v4b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i | 1);
                    y4b.b(gu5Var2, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
