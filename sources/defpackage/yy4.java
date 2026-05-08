package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.indeed.android.jobsearch.R;
import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import java.util.Date;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class yy4 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[EventRecord.EventType.values().length];
            try {
                iArr[EventRecord.EventType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventRecord.EventType.INTERVIEW_EVENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EventRecord.EventType.RESUME_CONTACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[EventRecord.MessageSendStatus.values().length];
            try {
                iArr2[EventRecord.MessageSendStatus.SENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EventRecord.MessageSendStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final defpackage.x1e r35, final defpackage.at8 r36, final kotlin.jvm.functions.Function1 r37, final kotlin.jvm.functions.Function2 r38, androidx.compose.ui.e r39, final androidx.fragment.app.FragmentManager r40, final androidx.navigation.e r41, final kotlin.jvm.functions.Function2 r42, final defpackage.gu5 r43, final defpackage.hza r44, androidx.compose.runtime.b r45, final int r46) {
        /*
            Method dump skipped, instruction units count: 1056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yy4.a(x1e, at8, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, androidx.compose.ui.e, androidx.fragment.app.FragmentManager, androidx.navigation.e, kotlin.jvm.functions.Function2, gu5, hza, androidx.compose.runtime.b, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d7  */
    /* JADX WARN: Type inference failed for: r11v22, types: [androidx.compose.runtime.b, androidx.compose.runtime.c] */
    /* JADX WARN: Type inference failed for: r11v23, types: [androidx.compose.runtime.c] */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26, types: [androidx.compose.runtime.c] */
    /* JADX WARN: Type inference failed for: r11v27, types: [androidx.compose.runtime.b, androidx.compose.runtime.c] */
    /* JADX WARN: Type inference failed for: r11v28, types: [com.indeed.android.messaging.data.conversations.ConversationRecord$Participant] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30, types: [androidx.compose.runtime.c] */
    /* JADX WARN: Type inference failed for: r11v31, types: [androidx.compose.runtime.c] */
    /* JADX WARN: Type inference failed for: r11v33, types: [androidx.compose.runtime.c] */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v5, types: [androidx.compose.runtime.c] */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r11v57 */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v59 */
    /* JADX WARN: Type inference failed for: r11v60 */
    /* JADX WARN: Type inference failed for: r11v61 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r16v0, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r16v1, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r16v3, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final defpackage.x1e r36, final com.indeed.android.messaging.data.events.EventRecord r37, final com.indeed.android.messaging.data.events.EventRecord r38, kotlin.jvm.functions.Function1 r39, final kotlin.jvm.functions.Function2 r40, final boolean r41, boolean r42, final defpackage.gu5 r43, final androidx.fragment.app.FragmentManager r44, final kotlin.jvm.functions.Function2 r45, androidx.compose.runtime.b r46, final int r47) {
        /*
            Method dump skipped, instruction units count: 1433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yy4.b(x1e, com.indeed.android.messaging.data.events.EventRecord, com.indeed.android.messaging.data.events.EventRecord, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, boolean, boolean, gu5, androidx.fragment.app.FragmentManager, kotlin.jvm.functions.Function2, androidx.compose.runtime.b, int):void");
    }

    public static final void c(gu5<j6g> gu5Var, b bVar, int i) {
        c cVar;
        c cVarH = bVar.h(930658230);
        int i2 = i | (cVarH.x(gu5Var) ? 4 : 2);
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            tjf tjfVar = (tjf) cVarH.M(fif.a);
            o97.h hVar = o97Var.j;
            o97.a.e eVar = o97Var.c.a;
            tjf tjfVarD = tjfVar.d(hVar.h);
            e.a aVar = e.a.b;
            e eVarJ = f.j(g.f(aVar, 1.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13);
            ehd ehdVarA = chd.a(vs0.b, c20.a.j, cVarH, 6);
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
            ygg.y(cVarH, ehdVarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            fif.b(ak2.I(R.string.messaging_message_fail_to_send, cVarH), null, eVar.h.c.a, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVarD, cVarH, 0, 0, 65530);
            String strI = ak2.I(R.string.messaging_tap_to_retry, cVarH);
            long j = eVar.h.c.a;
            e eVarJ2 = f.j(aVar, 4.0f, 0.0f, 0.0f, 0.0f, 14);
            boolean z = (i2 & 14) == 4;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new ec(4, gu5Var);
                cVarH.p(objV);
            }
            fif.b(strI, androidx.compose.foundation.b.d(eVarJ2, false, null, null, (gu5) objV, 15), j, 0L, null, null, 0L, odf.c, null, 0L, 0, false, 0, 0, null, tjfVarD, cVarH, 100663296, 0, 65272);
            cVar = cVarH;
            cVar.U(true);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new my4(i, 0, gu5Var);
        }
    }

    public static final void d(String str, b bVar, int i) {
        c cVar;
        c cVarH = bVar.h(-1542796280);
        int i2 = i | (cVarH.K(str) ? 4 : 2);
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            cVar = cVarH;
            fif.b(str, f.j(e.a.b, 0.0f, 4.0f, 0.0f, 0.0f, 13), o97Var.c.a.b, 0L, o97Var.f.c, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((tjf) cVarH.M(fif.a)).d(o97Var.j.h), cVar, i2 & 14, 0, 65496);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new ok4(str, i, 2);
        }
    }

    public static final void e(int i, b bVar) {
        c cVar;
        c cVarH = bVar.h(694806293);
        if (cVarH.o(i & 1, i != 0)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e.a aVar = e.a.b;
            e eVarF = g.f(androidx.compose.ui.platform.f.a(aVar, "NewMessageIndicator"), 1.0f);
            ehd ehdVarA = chd.a(vs0.a, c20.a.k, cVarH, 48);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarF);
            gl2.j.getClass();
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
            hl1.a(androidx.compose.foundation.a.b(g.h(new LayoutWeightElement(1.0f, true), 1.0f), o97Var.c.c.a, ytc.a), cVarH, 0);
            fif.b(ak2.I(R.string.messaging_conversation_indicator_new, cVarH), f.j(aVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), o97Var.c.a.e, 0L, o97Var.f.c, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((tjf) cVarH.M(fif.a)).d(o97Var.j.h), cVarH, 0, 0, 65496);
            cVar = cVarH;
            cVar.U(true);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new hm0(i, 5);
        }
    }

    public static final void f(final long j, b bVar, final int i) {
        c cVar;
        c cVarH = bVar.h(57964370);
        int i2 = i | (cVarH.e(j) ? 4 : 2);
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            tjf tjfVar = (tjf) cVarH.M(fif.a);
            o97.h hVar = o97Var.j;
            o97.a aVar = o97Var.c;
            o97.a.e eVar = aVar.a;
            tjf tjfVarD = tjfVar.d(hVar.h);
            Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            e.a aVar2 = e.a.b;
            e eVarF = g.f(aVar2, 1.0f);
            ag9 ag9VarD = hl1.d(c20.a.e, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarF);
            gl2.j.getClass();
            pm8.a aVar3 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ag9VarD, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            gl2.a.e eVar2 = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar2);
            e eVarH = f.h(androidx.compose.foundation.a.b(aVar2, aVar.b.a, ytc.a), 8.0f, 0.0f, 2);
            ehd ehdVarA = chd.a(new vs0.i(4.0f, true, new us0(0)), c20.a.j, cVarH, 0);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarH);
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
            ygg.y(cVarH, eVarC2, eVar2);
            fif.b(ojh.n(j, true, context), null, eVar.b, 0L, o97Var.f.c, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVarD, cVarH, 0, 0, 65498);
            String str = DateFormat.getTimeFormat(context).format(new Date(j));
            str.getClass();
            fif.b(str, null, eVar.b, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVarD, cVarH, 0, 0, 65530);
            cVar = cVarH;
            cVar.U(true);
            cVar.U(true);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(j, i) { // from class: sy4
                public final /* synthetic */ long a;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    yy4.f(this.a, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
