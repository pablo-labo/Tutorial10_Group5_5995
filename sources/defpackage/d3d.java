package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class d3d {

    @uh3(c = "com.indeed.android.messaging.ui.report.spam.ReportSpamScreenKt$ReportSpamScreen$1$1", f = "ReportSpamScreen.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ gu5<j6g> $onNavigateToInbox;
        final /* synthetic */ ese<f3d> $uiState$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gu5<j6g> gu5Var, ese<f3d> eseVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$onNavigateToInbox = gu5Var;
            this.$uiState$delegate = eseVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$onNavigateToInbox, this.$uiState$delegate, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            if (this.$uiState$delegate.getValue().d != null) {
                this.$onNavigateToInbox.invoke();
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.messaging.ui.report.spam.ReportSpamScreenKt$ReportSpamScreen$2$1", f = "ReportSpamScreen.kt", l = {}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ fnf $toastViewModel;
        final /* synthetic */ ese<f3d> $uiState$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fnf fnfVar, ese<f3d> eseVar, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$toastViewModel = fnfVar;
            this.$uiState$delegate = eseVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$toastViewModel, this.$uiState$delegate, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            if (wl7.b(this.$uiState$delegate.getValue().e, Boolean.FALSE)) {
                fnf.h(this.$toastViewModel, cnf.b0, null, null, 6);
            }
            return j6g.a;
        }
    }

    public static final /* synthetic */ class c extends qv5 implements gu5<j6g> {
        @Override // defpackage.gu5
        public final j6g invoke() {
            Object value;
            gse gseVar = ((i3d) this.receiver).d;
            do {
                value = gseVar.getValue();
            } while (!gseVar.h(value, f3d.a((f3d) value, null, null, null, null, false, 111)));
            return j6g.a;
        }
    }

    public static final /* synthetic */ class d extends qv5 implements gu5<j6g> {
        @Override // defpackage.gu5
        public final j6g invoke() {
            i3d i3dVar = (i3d) this.receiver;
            i3dVar.getClass();
            u63.Y(ee3.p(i3dVar), null, null, new g3d(i3dVar, null), 3);
            return j6g.a;
        }
    }

    public static final /* synthetic */ class e extends qv5 implements gu5<j6g> {
        @Override // defpackage.gu5
        public final j6g invoke() {
            Object value;
            Object value2;
            i3d i3dVar = (i3d) this.receiver;
            gse gseVar = i3dVar.d;
            f3d f3dVar = (f3d) gseVar.getValue();
            do {
                value = gseVar.getValue();
            } while (!gseVar.h(value, f3d.a((f3d) value, null, null, null, null, false, 63)));
            String str = f3dVar.b;
            if (str != null) {
                do {
                    value2 = gseVar.getValue();
                } while (!gseVar.h(value2, f3d.a((f3d) value2, null, null, null, null, true, 79)));
                ConversationRecord conversationRecord = f3dVar.a;
                if (conversationRecord != null) {
                    u63.Y(ee3.p(i3dVar), null, null, new h3d(i3dVar, conversationRecord, str, f3dVar, null), 3);
                }
            }
            return j6g.a;
        }
    }

    public static final /* synthetic */ class f extends qv5 implements Function1<String, j6g> {
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(String str) {
            Object value;
            String str2 = str;
            str2.getClass();
            i3d i3dVar = (i3d) this.receiver;
            i3dVar.getClass();
            gse gseVar = i3dVar.d;
            do {
                value = gseVar.getValue();
            } while (!gseVar.h(value, f3d.a((f3d) value, str2, null, null, null, false, 125)));
            return j6g.a;
        }
    }

    public static final /* synthetic */ class g extends qv5 implements Function1<String, j6g> {
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(String str) {
            Object value;
            String str2 = str;
            str2.getClass();
            i3d i3dVar = (i3d) this.receiver;
            i3dVar.getClass();
            gse gseVar = i3dVar.d;
            do {
                value = gseVar.getValue();
            } while (!gseVar.h(value, f3d.a((f3d) value, null, str2, null, null, false, 123)));
            return j6g.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(i3d i3dVar, fnf fnfVar, gu5<j6g> gu5Var, gu5<j6g> gu5Var2, androidx.compose.runtime.b bVar, int i) {
        androidx.compose.runtime.c cVar;
        i3dVar.getClass();
        fnfVar.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(-717723348);
        int i2 = i | (cVarH.x(i3dVar) ? 4 : 2) | (cVarH.x(fnfVar) ? 32 : 16) | (cVarH.x(gu5Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            g4a g4aVarA = r.a(i3dVar.e, cVarH);
            Boolean bool = ((f3d) g4aVarA.getValue()).d;
            boolean zK = cVarH.K(g4aVarA) | ((i2 & 7168) == 2048);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zK || objV == c0020a) {
                objV = new a(gu5Var2, g4aVarA, null);
                cVarH.p(objV);
            }
            to4.d(cVarH, bool, (Function2) objV);
            Boolean bool2 = ((f3d) g4aVarA.getValue()).e;
            boolean zK2 = cVarH.K(g4aVarA) | cVarH.x(fnfVar);
            Object objV2 = cVarH.v();
            if (zK2 || objV2 == c0020a) {
                objV2 = new b(fnfVar, g4aVarA, null);
                cVarH.p(objV2);
            }
            to4.d(cVarH, bool2, (Function2) objV2);
            if (wl7.b(((f3d) g4aVarA.getValue()).e, Boolean.TRUE)) {
                cVarH.L(-1348497570);
                boolean zX = cVarH.x(i3dVar);
                Object objV3 = cVarH.v();
                if (zX || objV3 == c0020a) {
                    c cVar2 = new c(0, i3dVar, i3d.class, "backToReportForm", "backToReportForm()V", 0);
                    cVarH.p(cVar2);
                    objV3 = cVar2;
                }
                gu5 gu5Var3 = (gu5) ((ve8) objV3);
                boolean zX2 = cVarH.x(i3dVar);
                Object objV4 = cVarH.v();
                if (zX2 || objV4 == c0020a) {
                    d dVar = new d(0, i3dVar, i3d.class, "moveToSpam", "moveToSpam()V", 0);
                    cVarH.p(dVar);
                    objV4 = dVar;
                }
                go2.a(gu5Var3, (gu5) ((ve8) objV4), cVarH, 0);
                cVarH.U(false);
                cVar = cVarH;
            } else {
                cVarH.L(-1348335285);
                f3d f3dVar = (f3d) g4aVarA.getValue();
                boolean zX3 = cVarH.x(i3dVar);
                Object objV5 = cVarH.v();
                if (zX3 || objV5 == c0020a) {
                    e eVar = new e(0, i3dVar, i3d.class, "reportSpam", "reportSpam()V", 0);
                    cVarH.p(eVar);
                    objV5 = eVar;
                }
                gu5 gu5Var4 = (gu5) ((ve8) objV5);
                boolean zX4 = cVarH.x(i3dVar);
                Object objV6 = cVarH.v();
                if (zX4 || objV6 == c0020a) {
                    f fVar = new f(1, i3dVar, i3d.class, "setReportType", "setReportType(Ljava/lang/String;)V", 0);
                    cVarH.p(fVar);
                    objV6 = fVar;
                }
                Function1 function1 = (Function1) ((ve8) objV6);
                boolean zX5 = cVarH.x(i3dVar);
                Object objV7 = cVarH.v();
                if (zX5 || objV7 == c0020a) {
                    g gVar = new g(1, i3dVar, i3d.class, "setAdditionalInfo", "setAdditionalInfo(Ljava/lang/String;)V", 0);
                    cVarH.p(gVar);
                    objV7 = gVar;
                }
                cVar = cVarH;
                b(f3dVar, gu5Var, gu5Var4, function1, (Function1) ((ve8) objV7), fnfVar, cVar, ((i2 >> 3) & 112) | ((i2 << 12) & 458752));
                cVar.U(false);
            }
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new an4(i3dVar, fnfVar, gu5Var, gu5Var2, i, 2);
        }
    }

    public static final void b(final f3d f3dVar, gu5 gu5Var, final gu5 gu5Var2, final Function1 function1, final Function1 function12, fnf fnfVar, androidx.compose.runtime.b bVar, int i) {
        int i2;
        int i3;
        androidx.compose.runtime.c cVarH = bVar.h(-913052511);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(f3dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(gu5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(gu5Var2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.x(function1) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.x(function12) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.x(fnfVar) ? 131072 : 65536;
        }
        if (cVarH.o(i2 & 1, (74899 & i2) != 74898)) {
            cVarH.v0();
            if ((i & 1) != 0 && !cVarH.c0()) {
                cVarH.D();
            }
            cVarH.V();
            final o97 o97Var = (o97) cVarH.M(p97.a);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = new sm5();
                cVarH.p(objV);
            }
            final sm5 sm5Var = (sm5) objV;
            final fm5 fm5Var = (fm5) cVarH.M(um2.i);
            final View view = (View) cVarH.M(AndroidCompositionLocals_androidKt.f);
            j6g j6gVar = j6g.a;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                i3 = i2;
                objV2 = new e3d(2, null);
                cVarH.p(objV2);
            } else {
                i3 = i2;
            }
            to4.d(cVarH, j6gVar, (Function2) objV2);
            final List listA0 = u63.a0(new j3d("advertisement", R.string.messaging_spam_type_advertisement), new j3d("offensive", R.string.messaging_spam_type_discriminatory_or_offensive), new j3d("fake", R.string.messaging_spam_type_fraud), new j3d("inaccurate", R.string.messaging_spam_type_misleading), new j3d("uninterested", R.string.messaging_spam_type_uninterested), new j3d("other", R.string.messaging_spam_type_other));
            boolean z = (i3 & 112) == 32;
            Object objV3 = cVarH.v();
            if (z || objV3 == c0020a) {
                objV3 = new di(10, gu5Var);
                cVarH.p(objV3);
            }
            g71.a(false, (gu5) objV3, cVarH, 0, 1);
            oi7.a(R.string.messaging_report_spam_header, "ReportSpam", null, gu5Var, null, bh2.c(940343890, new Function2() { // from class: b3d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    b bVar2 = (b) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Context context = (Context) bVar2.M(AndroidCompositionLocals_androidKt.b);
                        String strI = ak2.I(R.string.messaging_report_and_move_to_spam, bVar2);
                        gu5 gu5Var3 = gu5Var2;
                        boolean zK = bVar2.K(gu5Var3);
                        f3d f3dVar2 = f3dVar;
                        boolean zX = zK | bVar2.x(f3dVar2);
                        fm5 fm5Var2 = fm5Var;
                        boolean zX2 = zX | bVar2.x(fm5Var2);
                        View view2 = view;
                        boolean zX3 = zX2 | bVar2.x(view2);
                        Object objV4 = bVar2.v();
                        b.a.C0020a c0020a2 = b.a.a;
                        if (zX3 || objV4 == c0020a2) {
                            objV4 = new dr(gu5Var3, f3dVar2, fm5Var2, view2, sm5Var, 1);
                            bVar2.p(objV4);
                        }
                        gu5 gu5Var4 = (gu5) objV4;
                        e eVarA = f.a(g.f(e.a.b, 1.0f), "reportSpamButton");
                        boolean zX4 = bVar2.x(context) | bVar2.x(f3dVar2);
                        Object objV5 = bVar2.v();
                        if (zX4 || objV5 == c0020a2) {
                            objV5 = new bf(6, context, f3dVar2);
                            bVar2.p(objV5);
                        }
                        gt6.h(strI, gu5Var4, b5e.b(eVarA, false, (Function1) objV5), null, false, f3dVar2.f, null, null, null, bVar2, 0, 472);
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), null, false, true, bh2.c(-1548782250, new he4(fnfVar, 8), cVarH), bh2.c(-1881039212, new wu5() { // from class: c3d
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    String strE;
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((pb2) obj).getClass();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        String strI = ak2.I(R.string.messaging_required_fields_note, bVar2);
                        o97 o97Var2 = o97Var;
                        tjf tjfVar = o97Var2.j.g;
                        long j = o97Var2.c.a.c;
                        e.a aVar = e.a.b;
                        fif.b(strI, androidx.compose.foundation.layout.f.j(aVar, 0.0f, 0.0f, 0.0f, 8.0f, 7), j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar, bVar2, 0, 0, 65528);
                        String strI2 = ak2.I(R.string.messaging_report_spam_type_label, bVar2);
                        String strI3 = ak2.I(R.string.messaging_report_spam_type_label_detail, bVar2);
                        f3d f3dVar2 = f3dVar;
                        boolean z2 = f3dVar2.g;
                        String str = f3dVar2.b;
                        if (z2 && str == null) {
                            strE = l.e(bVar2, 502568685, R.string.messaging_report_spam_type_error, bVar2);
                        } else {
                            bVar2.L(-1600179095);
                            bVar2.F();
                            strE = null;
                        }
                        bVar2.L(502572506);
                        List list = listA0;
                        List<j3d> list2 = list;
                        ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
                        for (j3d j3dVar : list2) {
                            arrayList.add(new zv6(ak2.I(j3dVar.b, bVar2), j3dVar.a.equals(str)));
                        }
                        bVar2.F();
                        zv6[] zv6VarArr = (zv6[]) arrayList.toArray(new zv6[0]);
                        e eVarA = c.a(aVar, sm5Var);
                        Function1 function13 = function1;
                        boolean zK = bVar2.K(function13) | bVar2.K(list);
                        Object objV4 = bVar2.v();
                        b.a.C0020a c0020a2 = b.a.a;
                        if (zK || objV4 == c0020a2) {
                            objV4 = new uc(7, function13, list);
                            bVar2.p(objV4);
                        }
                        fw6.c(strI2, eVarA, strI3, strE, true, zv6VarArr, (Function2) objV4, "reportOption", bVar2, 100687872, 32);
                        ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e eVarC = androidx.compose.ui.c.c(bVar2, aVar);
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
                        kv6.a(ak2.I(R.string.messaging_spam_label_additional_information, bVar2), androidx.compose.foundation.layout.f.j(aVar, 0.0f, 0.0f, 0.0f, 16.0f, 7), ak2.I(R.string.messaging_spam_label_optional, bVar2), null, false, null, bVar2, 0, 120);
                        String str2 = f3dVar2.c;
                        String strI4 = ak2.I(R.string.messaging_spam_label_additional_information, bVar2);
                        Function1 function14 = function12;
                        boolean zK2 = bVar2.K(function14);
                        Object objV5 = bVar2.v();
                        if (zK2 || objV5 == c0020a2) {
                            objV5 = new bs2(function14, 4);
                            bVar2.p(objV5);
                        }
                        Function1 function15 = (Function1) objV5;
                        Object objV6 = bVar2.v();
                        if (objV6 == c0020a2) {
                            objV6 = new mc(11);
                            bVar2.p(objV6);
                        }
                        py6.a(str2, function15, strI4, (Function1) objV6, null, 0, 0, 0, "additionalInfoTextArea", bVar2, 3072);
                        bVar2.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, ((i3 << 6) & 7168) | 906166320, 212);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new os6(f3dVar, gu5Var, gu5Var2, function1, function12, fnfVar, i, 1);
        }
    }
}
