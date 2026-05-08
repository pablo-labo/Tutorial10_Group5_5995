package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.f;
import com.datadog.android.rum.internal.domain.scope.RumViewManagerScope;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import com.indeed.android.messaging.data.conversations.ConversationWithDraft;
import com.indeed.android.messaging.data.conversations.DraftRecord;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class by2 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[w1f.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[w47.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr2;
        }
    }

    public static final class b implements goa, ev5 {
        public final /* synthetic */ gv2 a;

        public b(gv2 gv2Var) {
            this.a = gv2Var;
        }

        @Override // defpackage.ev5
        public final vu5<?> c() {
            return this.a;
        }

        @Override // defpackage.goa
        public final /* synthetic */ void d(Object obj) {
            this.a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof goa) && (obj instanceof ev5)) {
                return this.a == ((ev5) obj).c();
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final void a(final e eVar, final List list, final String str, final jta jtaVar, final Function1 function1, final wu5 wu5Var, final Function1 function12, final gu5 gu5Var, final i7d i7dVar, final Function1 function13, final Function2 function2, final pz8 pz8Var, androidx.compose.runtime.b bVar, final int i) {
        c cVar;
        boolean z;
        Object bVar2;
        list.getClass();
        jtaVar.getClass();
        function1.getClass();
        function13.getClass();
        function2.getClass();
        pz8Var.getClass();
        c cVarH = bVar.h(304709121);
        int i2 = i | (cVarH.K(eVar) ? 4 : 2) | (cVarH.x(list) ? 32 : 16) | (cVarH.K(str) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(jtaVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(function1) ? 16384 : 8192) | (cVarH.x(wu5Var) ? 131072 : 65536) | (cVarH.x(function12) ? 1048576 : 524288) | (cVarH.x(gu5Var) ? 8388608 : 4194304) | (cVarH.K(i7dVar) ? 67108864 : 33554432) | (cVarH.x(function13) ? 536870912 : 268435456);
        int i3 = (cVarH.x(function2) ? (char) 4 : (char) 2) | (cVarH.x(pz8Var) ? ' ' : (char) 16);
        if (cVarH.o(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 19) == 18) ? false : true)) {
            cVarH.v0();
            if ((i & 1) != 0 && !cVarH.c0()) {
                cVarH.D();
            }
            cVarH.V();
            o97 o97Var = (o97) cVarH.M(p97.a);
            ss8 ss8VarA = us8.a(cVarH);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                m74 m74Var = to4.a;
                objV = v40.b(cVarH.l(), cVarH);
            }
            e13 e13Var = (e13) objV;
            f7d f7dVarB = e7d.b(cVarH);
            List list2 = list;
            ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((ConversationWithDraft) it.next()).getConversation().getId());
            }
            boolean zK = cVarH.K(ss8VarA) | cVarH.x(e13Var);
            Object objV2 = cVarH.v();
            if (zK || objV2 == c0020a) {
                objV2 = new rx2(ss8VarA, e13Var, null);
                cVarH.p(objV2);
            }
            to4.d(cVarH, arrayList, (Function2) objV2);
            Boolean boolValueOf = Boolean.valueOf(f7dVarB.a());
            boolean zK2 = cVarH.K(f7dVarB) | cVarH.x(e13Var) | cVarH.K(ss8VarA);
            Object objV3 = cVarH.v();
            if (zK2 || objV3 == c0020a) {
                objV3 = new sx2(f7dVarB, e13Var, ss8VarA, null);
                cVarH.p(objV3);
            }
            to4.d(cVarH, boolValueOf, (Function2) objV3);
            if (((h2g) cr8.p(h2g.class)).f()) {
                cVarH.L(-1969616797);
                Integer numValueOf = Integer.valueOf(ss8VarA.i());
                boolean zK3 = ((i2 & 1879048192) == 536870912) | cVarH.K(ss8VarA) | ((i3 & 14) == 4);
                Object objV4 = cVarH.v();
                if (zK3 || objV4 == c0020a) {
                    objV4 = new tx2(function13, ss8VarA, function2, null);
                    cVarH.p(objV4);
                }
                to4.d(cVarH, numValueOf, (Function2) objV4);
                zv8 zv8Var = (zv8) cVarH.M(r09.a);
                boolean zX = cVarH.x(e13Var) | cVarH.K(ss8VarA);
                Object objV5 = cVarH.v();
                if (zX || objV5 == c0020a) {
                    bVar2 = new b(new gv2(1, e13Var, ss8VarA));
                    cVarH.p(bVar2);
                } else {
                    bVar2 = objV5;
                }
                pz8Var.e(zv8Var, (goa) bVar2);
                z = false;
            } else {
                z = false;
                cVarH.L(-1976705567);
            }
            cVarH.U(z);
            e eVarA = f.a(eVar, "ConversationList");
            boolean zX2 = cVarH.x(list);
            Object objV6 = cVarH.v();
            if (zX2 || objV6 == c0020a) {
                objV6 = new pq(list, 4);
                cVarH.p(objV6);
            }
            e eVarI = ygg.i(androidx.compose.foundation.a.b(g.c(b5e.b(eVarA, false, (Function1) objV6), 1.0f), o97Var.c.b.a, ytc.a));
            boolean zK4 = ((((i2 & 234881024) ^ 100663296) > 67108864 && cVarH.x(i7dVar)) || (i2 & 100663296) == 67108864) | cVarH.K(f7dVarB) | cVarH.x(list) | cVarH.x(jtaVar) | ((i2 & 57344) == 16384) | ((i2 & 458752) == 131072) | ((i2 & 3670016) == 1048576) | ((i2 & 896) == 256) | ((i2 & 29360128) == 8388608);
            Object objV7 = cVarH.v();
            if (zK4 || objV7 == c0020a) {
                mx2 mx2Var = new mx2(list, str, i7dVar, f7dVarB, jtaVar, function1, wu5Var, function12, gu5Var);
                cVarH.p(mx2Var);
                objV7 = mx2Var;
            }
            cVar = cVarH;
            hn8.b(eVarI, ss8VarA, null, false, null, null, null, false, null, (Function1) objV7, cVar, 0, 508);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(list, str, jtaVar, function1, wu5Var, function12, gu5Var, i7dVar, function13, function2, pz8Var, i) { // from class: nx2
                public final /* synthetic */ Function1 V;
                public final /* synthetic */ gu5 W;
                public final /* synthetic */ i7d X;
                public final /* synthetic */ Function1 Y;
                public final /* synthetic */ Function2 Z;
                public final /* synthetic */ pz8 a0;
                public final /* synthetic */ List b;
                public final /* synthetic */ String c;
                public final /* synthetic */ jta d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ wu5 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    by2.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, this.X, this.Y, this.Z, this.a0, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0275  */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r15v0, types: [androidx.compose.runtime.b, androidx.compose.runtime.c] */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.compose.runtime.c] */
    /* JADX WARN: Type inference failed for: r15v3, types: [androidx.compose.runtime.c] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [int] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [int] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v9, types: [yf6] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.ui.e r24, final com.indeed.android.messaging.data.conversations.ConversationRecord r25, final com.indeed.android.messaging.data.conversations.DraftRecord r26, final defpackage.jta r27, final kotlin.jvm.functions.Function1 r28, final defpackage.wu5 r29, final kotlin.jvm.functions.Function1 r30, final int r31, final int r32, androidx.compose.runtime.b r33, final int r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 813
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.by2.b(androidx.compose.ui.e, com.indeed.android.messaging.data.conversations.ConversationRecord, com.indeed.android.messaging.data.conversations.DraftRecord, jta, kotlin.jvm.functions.Function1, wu5, kotlin.jvm.functions.Function1, int, int, androidx.compose.runtime.b, int):void");
    }

    public static final void c(final ConversationRecord conversationRecord, final DraftRecord draftRecord, final boolean z, final Function1 function1, final Function1 function12, androidx.compose.runtime.b bVar, final int i) {
        c cVar;
        int i2;
        c cVarH = bVar.h(-494334147);
        int i3 = i | (cVarH.x(conversationRecord) ? 4 : 2) | (cVarH.x(draftRecord) ? 32 : 16) | (cVarH.a(z) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(function1) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(function12) ? 16384 : 8192);
        if (cVarH.o(i3 & 1, (i3 & 9363) != 9362)) {
            final String employerDisplayName = conversationRecord.getEmployerDisplayName();
            if (employerDisplayName == null) {
                employerDisplayName = z3.k(cVarH, 1686266926, R.string.messaging_sender_unknown, cVarH, false);
            } else {
                cVarH.L(1686265810);
                cVarH.U(false);
            }
            final o97 o97Var = (o97) cVarH.M(p97.a);
            tjf tjfVar = (tjf) cVarH.M(fif.a);
            o97.b bVar2 = o97Var.e;
            o97.a aVar = o97Var.c;
            long j = bVar2.g;
            int unreadCount = conversationRecord.getUnreadCount();
            o97.a.e eVar = aVar.a;
            final tjf tjfVarE = tjf.e(tjfVar, unreadCount > 0 ? eVar.c : eVar.a, j, null, null, null, 0L, null, 0, 0L, 16777212);
            int unreadCount2 = conversationRecord.getUnreadCount();
            o97.c cVar2 = o97Var.f;
            final tjf tjfVarE2 = tjf.e(tjfVarE, 0L, 0L, unreadCount2 > 0 ? cVar2.c : cVar2.a, null, null, 0L, null, 0, 0L, 16777211);
            e eVarF = g.f(e.a.b, 1.0f);
            boolean zX = ((57344 & i3) == 16384) | cVarH.x(conversationRecord);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                i2 = 1;
                objV = new aq0(i2, function12, conversationRecord);
                cVarH.p(objV);
            } else {
                i2 = 1;
            }
            gu5 gu5Var = (gu5) objV;
            if ((i3 & 7168) != 2048) {
                i2 = 0;
            }
            int i4 = (cVarH.x(conversationRecord) ? 1 : 0) | i2;
            Object objV2 = cVarH.v();
            if (i4 != 0 || objV2 == c0020a) {
                objV2 = new ry(3, function1, conversationRecord);
                cVarH.p(objV2);
            }
            e eVarA = f.a(androidx.compose.foundation.b.f(eVarF, gu5Var, (gu5) objV2), conversationRecord.getId());
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = new li(5);
                cVarH.p(objV3);
            }
            ay1.b(b5e.b(eVarA, false, (Function1) objV3), ytc.a, wx1.a(aVar.b.a, 0L, 0L, 0L, cVarH, 14), null, null, bh2.c(1011262895, new wu5() { // from class: ix2
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    pm8.a aVar2;
                    gl2.a.C0251a c0251a;
                    b bVar3 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((pb2) obj).getClass();
                    int i5 = 0;
                    if (bVar3.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        sl7 sl7Var = sl7.a;
                        e.a aVar3 = e.a.b;
                        e eVarA2 = d.a(aVar3, sl7Var);
                        o97.b bVar4 = o97Var.e;
                        e eVarF2 = androidx.compose.foundation.layout.f.f(eVarA2, 16.0f);
                        vs0.i iVar = new vs0.i(12.0f - nta.ConversationList.a(), true, new us0(i5));
                        ConversationRecord conversationRecord2 = conversationRecord;
                        boolean awaitingJobSeekerResponse = conversationRecord2.getAwaitingJobSeekerResponse();
                        af1.b bVar5 = c20.a.k;
                        ehd ehdVarA = chd.a(iVar, awaitingJobSeekerResponse ? c20.a.j : bVar5, bVar3, 0);
                        int iHashCode = Long.hashCode(bVar3.k());
                        t8b t8bVarM = bVar3.m();
                        e eVarC = androidx.compose.ui.c.c(bVar3, eVarF2);
                        gl2.j.getClass();
                        pm8.a aVar4 = gl2.a.b;
                        if (bVar3.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar3.B();
                        if (bVar3.f()) {
                            bVar3.y(aVar4);
                        } else {
                            bVar3.n();
                        }
                        gl2.a.d dVar = gl2.a.g;
                        ygg.y(bVar3, ehdVarA, dVar);
                        gl2.a.f fVar = gl2.a.f;
                        ygg.y(bVar3, t8bVarM, fVar);
                        gl2.a.C0251a c0251a2 = gl2.a.j;
                        if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar3, iHashCode, c0251a2);
                        }
                        gl2.a.e eVar2 = gl2.a.d;
                        ygg.y(bVar3, eVarC, eVar2);
                        vs0.k kVar = vs0.c;
                        af1.a aVar5 = c20.a.m;
                        ob2 ob2VarA = mb2.a(kVar, aVar5, bVar3, 0);
                        int iHashCode2 = Long.hashCode(bVar3.k());
                        t8b t8bVarM2 = bVar3.m();
                        e eVarC2 = androidx.compose.ui.c.c(bVar3, aVar3);
                        if (bVar3.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar3.B();
                        if (bVar3.f()) {
                            bVar3.y(aVar4);
                        } else {
                            bVar3.n();
                        }
                        ygg.y(bVar3, ob2VarA, dVar);
                        ygg.y(bVar3, t8bVarM2, fVar);
                        if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode2))) {
                            uz.g(iHashCode2, bVar3, iHashCode2, c0251a2);
                        }
                        ygg.y(bVar3, eVarC2, eVar2);
                        String str = employerDisplayName;
                        cta.a(z, usa.ConversationList, bh2.c(1933659745, new fq0(1, str, conversationRecord2), bVar3), bVar3, 432);
                        bVar3.q();
                        ob2 ob2VarA2 = mb2.a(new vs0.i(4.0f, true, new us0(0)), aVar5, bVar3, 0);
                        int iHashCode3 = Long.hashCode(bVar3.k());
                        t8b t8bVarM3 = bVar3.m();
                        e eVarC3 = androidx.compose.ui.c.c(bVar3, aVar3);
                        if (bVar3.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar3.B();
                        if (bVar3.f()) {
                            bVar3.y(aVar4);
                        } else {
                            bVar3.n();
                        }
                        ygg.y(bVar3, ob2VarA2, dVar);
                        ygg.y(bVar3, t8bVarM3, fVar);
                        if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode3))) {
                            uz.g(iHashCode3, bVar3, iHashCode3, c0251a2);
                        }
                        ygg.y(bVar3, eVarC3, eVar2);
                        e eVarF3 = g.f(aVar3, 1.0f);
                        vs0.g gVar = vs0.g;
                        ehd ehdVarA2 = chd.a(gVar, bVar5, bVar3, 54);
                        int iHashCode4 = Long.hashCode(bVar3.k());
                        t8b t8bVarM4 = bVar3.m();
                        e eVarC4 = androidx.compose.ui.c.c(bVar3, eVarF3);
                        if (bVar3.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar3.B();
                        if (bVar3.f()) {
                            bVar3.y(aVar4);
                        } else {
                            bVar3.n();
                        }
                        ygg.y(bVar3, ehdVarA2, dVar);
                        ygg.y(bVar3, t8bVarM4, fVar);
                        if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode4))) {
                            uz.g(iHashCode4, bVar3, iHashCode4, c0251a2);
                        }
                        ygg.y(bVar3, eVarC4, eVar2);
                        long j2 = bVar4.f;
                        tjf tjfVar2 = tjfVarE2;
                        tjf tjfVarE3 = tjf.e(tjfVar2, 0L, j2, null, null, null, 0L, null, 0, 0L, 16777213);
                        if (1.0f <= 0.0d) {
                            yd7.a("invalid weight; must be greater than zero");
                        }
                        fif.b(str, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0L, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, tjfVarE3, bVar3, 0, 3120, 55292);
                        ehd ehdVarA3 = chd.a(new vs0.i(4.0f, true, new us0(0)), bVar5, bVar3, 48);
                        int iHashCode5 = Long.hashCode(bVar3.k());
                        t8b t8bVarM5 = bVar3.m();
                        e eVarC5 = androidx.compose.ui.c.c(bVar3, aVar3);
                        if (bVar3.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar3.B();
                        if (bVar3.f()) {
                            aVar2 = aVar4;
                            bVar3.y(aVar2);
                        } else {
                            aVar2 = aVar4;
                            bVar3.n();
                        }
                        ygg.y(bVar3, ehdVarA3, dVar);
                        ygg.y(bVar3, t8bVarM5, fVar);
                        if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode5))) {
                            c0251a = c0251a2;
                            uz.g(iHashCode5, bVar3, iHashCode5, c0251a);
                        } else {
                            c0251a = c0251a2;
                        }
                        ygg.y(bVar3, eVarC5, eVar2);
                        gl2.a.C0251a c0251a3 = c0251a;
                        pm8.a aVar6 = aVar2;
                        fif.b(ojh.n(conversationRecord2.getLastEventTimestamp(), false, (Context) bVar3.M(AndroidCompositionLocals_androidKt.b)), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.e(tjfVar2, 0L, bVar4.h, null, null, null, 0L, null, 0, 0L, 16777213), bVar3, 0, 0, 65534);
                        bVar3.q();
                        bVar3.q();
                        e eVarF4 = g.f(aVar3, 1.0f);
                        ehd ehdVarA4 = chd.a(gVar, bVar5, bVar3, 54);
                        int iHashCode6 = Long.hashCode(bVar3.k());
                        t8b t8bVarM6 = bVar3.m();
                        e eVarC6 = androidx.compose.ui.c.c(bVar3, eVarF4);
                        if (bVar3.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar3.B();
                        if (bVar3.f()) {
                            bVar3.y(aVar6);
                        } else {
                            bVar3.n();
                        }
                        ygg.y(bVar3, ehdVarA4, dVar);
                        ygg.y(bVar3, t8bVarM6, fVar);
                        if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode6))) {
                            uz.g(iHashCode6, bVar3, iHashCode6, c0251a3);
                        }
                        ygg.y(bVar3, eVarC6, eVar2);
                        if (1.0f <= 0.0d) {
                            yd7.a("invalid weight; must be greater than zero");
                        }
                        jy2.a(conversationRecord2, draftRecord, tjfVarE, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), bVar3, 0);
                        if (conversationRecord2.getUnreadCount() > 0) {
                            bVar3.L(-1754087976);
                            by2.f(conversationRecord2.getUnreadCount(), 0, bVar3);
                        } else {
                            bVar3.L(-1772450361);
                        }
                        bVar3.F();
                        bVar3.q();
                        if (conversationRecord2.getAwaitingJobSeekerResponse()) {
                            bVar3.L(-940127960);
                            vg2.a(null, bVar3, 0);
                        } else {
                            bVar3.L(-958677182);
                        }
                        bVar3.F();
                        bVar3.q();
                        bVar3.q();
                    } else {
                        bVar3.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, 196656, 24);
            cVar = cVarH;
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(draftRecord, z, function1, function12, i) { // from class: jx2
                public final /* synthetic */ DraftRecord b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    by2.c(this.a, this.b, this.c, this.d, this.e, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void d(int i, gu5 gu5Var, androidx.compose.runtime.b bVar, String str) {
        c cVarH = bVar.h(1451163338);
        int i2 = (cVarH.K(str) ? 4 : 2) | i | (cVarH.x(gu5Var) ? 32 : 16);
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            boolean z = (i2 & 112) == 32;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new ay2(gu5Var, null);
                cVarH.p(objV);
            }
            to4.d(cVarH, str, (Function2) objV);
            e eVarF = g.f(e.a.b, 1.0f);
            o97.g gVar = o97Var.i;
            e eVarF2 = androidx.compose.foundation.layout.f.f(eVarF, 16.0f);
            ehd ehdVarA = chd.a(vs0.e, c20.a.j, cVarH, 6);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarF2);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
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
            tx6.a(null, "Loading more...", false, null, cVarH, 48, 13);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new uc(str, i, 3, gu5Var);
        }
    }

    public static final void e(w47 w47Var, androidx.compose.runtime.b bVar, int i) {
        c cVarH = bVar.h(-1445966440);
        int i2 = (cVarH.d(w47Var.ordinal()) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            tjf tjfVar = (tjf) cVarH.M(fif.a);
            o97.h hVar = o97Var.j;
            o97.a.C0340a c0340a = o97Var.c.b;
            tjf tjfVarD = tjfVar.d(hVar.h);
            int[] iArr = a.a;
            fv6 fv6Var = iArr[w47Var.ordinal()] == 1 ? fv6.k0 : fv6.e8;
            int i3 = iArr[w47Var.ordinal()] == 1 ? R.string.messaging_archive : R.string.messaging_restore;
            e.a aVar = e.a.b;
            e eVarB = androidx.compose.foundation.a.b(g.d(aVar, 1.0f), c0340a.h.b, ytc.a);
            ag9 ag9VarD = hl1.d(c20.a.f, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarB);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
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
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            e eVarJ = androidx.compose.foundation.layout.f.j(aVar, 0.0f, 0.0f, 12.0f, 0.0f, 11);
            ag9 ag9VarD2 = hl1.d(c20.a.a, false);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarJ);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD2, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar);
            e eVarA = f.a(aVar, fv6Var.name() + RumViewManagerScope.RUM_BACKGROUND_VIEW_NAME);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.n, cVarH, 48);
            int iHashCode3 = Long.hashCode(cVarH.T);
            t8b t8bVarP3 = cVarH.P();
            e eVarC3 = androidx.compose.ui.c.c(cVarH, eVarA);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, dVar);
            ygg.y(cVarH, t8bVarP3, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode3))) {
                ja.h(iHashCode3, cVarH, iHashCode3, c0251a);
            }
            ygg.y(cVarH, eVarC3, eVar);
            ev6.b(fv6Var, null, null, zq6.Xs, c0340a.g.d.a, null, cVarH, 3072, 38);
            fif.b(ak2.I(i3, cVarH), androidx.compose.foundation.layout.f.j(aVar, 0.0f, 4.0f, 0.0f, 0.0f, 13), c0340a.g.d.a, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVarD, cVarH, 0, 0, 65528);
            cVarH = cVarH;
            o6.j(cVarH, true, true, true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new pa(w47Var, i, 2);
        }
    }

    public static final void f(final int i, final int i2, androidx.compose.runtime.b bVar) {
        c cVar;
        c cVarH = bVar.h(125115569);
        int i3 = (cVarH.d(i) ? 4 : 2) | i2;
        if (cVarH.o(i3 & 1, (i3 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            iy3 iy3Var = (iy3) cVarH.M(um2.h);
            float fL1 = iy3Var.l1(iy3Var.p1() * iy3Var.t1(18.0f));
            tjf tjfVar = (tjf) cVarH.M(fif.a);
            o97.b bVar2 = o97Var.e;
            o97.a.e eVar = o97Var.c.a;
            tjf tjfVarE = tjf.e(tjfVar, eVar.f, bVar2.h, o97Var.f.c, null, null, 0L, null, 0, 0L, 16777208);
            String strX = ak2.x(R.plurals.messaging_unread_messages_count, i, new Object[]{Integer.valueOf(i)}, cVarH);
            e.a aVar = e.a.b;
            e eVarJ = g.j(g.t(androidx.compose.foundation.layout.f.j(f.a(aVar, "UnreadMessagesIndicator"), 4.0f, 0.0f, 0.0f, 0.0f, 14), fL1, 0.0f, 2), fL1, 0.0f, 2);
            long j = eVar.e;
            fgd fgdVar = ggd.a;
            y7b y7bVar = new y7b(100.0f);
            e eVarB = androidx.compose.foundation.a.b(eVarJ, j, new fgd(y7bVar, y7bVar, y7bVar, y7bVar));
            ag9 ag9VarD = hl1.d(c20.a.e, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarB);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            e eVarH = androidx.compose.foundation.layout.f.h(aVar, 4.0f, 0.0f, 2);
            boolean zK = cVarH.K(strX);
            Object objV = cVarH.v();
            if (zK || objV == b.a.a) {
                objV = new kx2(strX, 0);
                cVarH.p(objV);
            }
            fif.b(String.valueOf(i), b5e.b(eVarH, false, (Function1) objV), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVarE, cVarH, 0, 0, 65532);
            cVar = cVarH;
            cVar.U(true);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(i, i2) { // from class: lx2
                public final /* synthetic */ int a;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    by2.f(this.a, iL, (b) obj);
                    return j6g.a;
                }
            };
        }
    }
}
