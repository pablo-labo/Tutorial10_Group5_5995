package defpackage;

import android.content.Context;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.indeed.android.jobsearch.R;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;

/* JADX INFO: loaded from: classes2.dex */
public final class ap9 {
    public static final void a(x1e x1eVar, gu5<j6g> gu5Var, b bVar, int i) {
        c cVarH = bVar.h(1703926034);
        int i2 = (cVarH.x(x1eVar) ? 4 : 2) | i | (cVarH.x(gu5Var) ? 32 : 16);
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            tjf tjfVarD = ((tjf) cVarH.M(fif.a)).d(o97Var.j.g);
            e.a aVar = e.a.b;
            e eVarJ = f.j(f.j(f.h(aVar, 16.0f, 0.0f, 2), 0.0f, 4.0f, 0.0f, 0.0f, 13), 0.0f, 0.0f, 0.0f, 16.0f, 7);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.n, cVarH, 48);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarJ);
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
            fif.b(ak2.I(R.string.messaging_conversation_restore_to_reply, cVarH), null, o97Var.c.a.c, 0L, o97Var.f.c, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVarD, cVarH, 0, 0, 65498);
            String strI = ak2.I(R.string.messaging_conversation_restore_button, cVarH);
            e eVarF = g.f(aVar, 1.0f);
            boolean z = x1eVar.i;
            gt6.j(strI, gu5Var, eVarF, vt6.Sm, z, z, null, null, "RestoreConversationButton", cVarH, (i2 & 112) | 100666752, 192);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new fs(x1eVar, gu5Var, i);
        }
    }

    public static final void b(x1e x1eVar, b bVar, int i) {
        c cVarH = bVar.h(-717401938);
        int i2 = i | (cVarH.x(x1eVar) ? 4 : 2);
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            tjf tjfVar = (tjf) cVarH.M(fif.a);
            o97.h hVar = o97Var.j;
            o97.a.e eVar = o97Var.c.a;
            tjf tjfVarD = tjfVar.d(hVar.g);
            e.a aVar = e.a.b;
            e eVarJ = f.j(f.j(f.h(aVar, 16.0f, 0.0f, 2), 0.0f, 4.0f, 0.0f, 0.0f, 13), 0.0f, 0.0f, 0.0f, 24.0f, 7);
            ehd ehdVarA = chd.a(new vs0.i(12.0f, true, new us0(0)), c20.a.k, cVarH, 48);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarJ);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ehdVarA, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            gl2.a.e eVar2 = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar2);
            ev6.b(fv6.a5, null, null, zq6.Xs, eVar.c, null, cVarH, 3078, 38);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, aVar);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar2);
            fif.b(ak2.I(R.string.messaging_locked_not_supported, cVarH), null, eVar.c, 0L, o97Var.f.c, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVarD, cVarH, 0, 0, 65498);
            cVarH = cVarH;
            ConversationRecord conversationRecord = x1eVar.a;
            Long lockDateTimestamp = conversationRecord != null ? conversationRecord.getLockDateTimestamp() : null;
            if (lockDateTimestamp == null) {
                cVarH.L(-2017141404);
            } else {
                cVarH.L(-2017141403);
                fif.b(ojh.n(lockDateTimestamp.longValue(), false, (Context) cVarH.M(AndroidCompositionLocals_androidKt.b)), null, eVar.c, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVarD, cVarH, 0, 0, 65530);
                cVarH = cVarH;
            }
            cVarH.U(false);
            cVarH.U(true);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ok4(x1eVar, i, 3);
        }
    }

    public static final void c(x1e x1eVar, gu5<j6g> gu5Var, b bVar, int i) {
        x1eVar.getClass();
        ConversationRecord conversationRecord = x1eVar.a;
        gu5Var.getClass();
        c cVarH = bVar.h(-1763240108);
        int i2 = (cVarH.x(x1eVar) ? 4 : 2) | i | (cVarH.x(gu5Var) ? 32 : 16);
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e eVarB = a.b(g.f(e.a.b, 1.0f), o97Var.c.b.b, ytc.a);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarB);
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
            ygg.y(cVarH, eVarC, gl2.a.d);
            b84.a(0.0f, 0, 13, o97Var.c.c.b, cVarH, null);
            if ((conversationRecord != null ? conversationRecord.getLockReason() : null) != null) {
                cVarH.L(1115956581);
                b(x1eVar, cVarH, i2 & 14);
                cVarH.U(false);
            } else {
                if ((conversationRecord != null ? conversationRecord.getFolder() : null) != w47.INBOX) {
                    cVarH.L(1116068305);
                    a(x1eVar, gu5Var, cVarH, i2 & 126);
                } else {
                    cVarH.L(1114056312);
                }
                cVarH.U(false);
            }
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ku(x1eVar, gu5Var, i);
        }
    }
}
