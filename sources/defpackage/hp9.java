package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.sp7;
import defpackage.vs0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class hp9 {

    @uh3(c = "com.indeed.android.messaging.ui.selected.conversation.components.MessageComposerKt$MessageComposer$2$1", f = "MessageComposer.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ g4a<Boolean> $startedTyping$delegate;
        final /* synthetic */ x1e $uiState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x1e x1eVar, g4a<Boolean> g4aVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$uiState = x1eVar;
            this.$startedTyping$delegate = g4aVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$uiState, this.$startedTyping$delegate, lu2Var);
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
            if (!zve.U(this.$uiState.f) && !this.$startedTyping$delegate.getValue().booleanValue()) {
                this.$startedTyping$delegate.setValue(Boolean.TRUE);
                ((tp7) cr8.p(tp7.class)).b(new sp7.a(0));
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.messaging.ui.selected.conversation.components.MessageComposerKt$MessageComposer$3$1", f = "MessageComposer.kt", l = {}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ boolean $showInlineAiButton;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$showInlineAiButton = z;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$showInlineAiButton, lu2Var);
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
            if (this.$showInlineAiButton) {
                ((tp7) cr8.p(tp7.class)).b(new sp7.c("messagingConversation", "messagingInlineAssistedMessagingButton", sp7.c.a.b, null, null, 24));
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.messaging.ui.selected.conversation.components.MessageComposerKt$MessageComposerAttachments$1$1", f = "MessageComposer.kt", l = {424}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ ss8 $listState;
        int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ss8 ss8Var, lu2<? super c> lu2Var) {
            super(2, lu2Var);
            this.$listState = ss8Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new c(this.$listState, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                int iMax = Math.max(this.$listState.j().f() - 1, 0);
                ss8 ss8Var = this.$listState;
                this.I$0 = iMax;
                this.label = 1;
                Object objK = ss8.k(ss8Var, iMax, this);
                g13 g13Var = g13.a;
                if (objK == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    public static final class d implements Function1<Integer, Object> {
        public final /* synthetic */ md1 a;
        public final /* synthetic */ List b;

        public d(md1 md1Var, List list) {
            this.a = md1Var;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            return this.a.invoke(this.b.get(num.intValue()));
        }
    }

    public static final class e implements Function1<Integer, Object> {
        public final /* synthetic */ List a;

        public e(List list) {
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.a.get(num.intValue());
            return null;
        }
    }

    public static final class f implements xu5<xo8, Integer, androidx.compose.runtime.b, Integer, j6g> {
        public final /* synthetic */ List a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ Function1 c;
        public final /* synthetic */ Function1 d;

        public f(List list, Function1 function1, Function1 function12, boolean z) {
            this.a = list;
            this.b = z;
            this.c = function1;
            this.d = function12;
        }

        @Override // defpackage.xu5
        public final j6g j(xo8 xo8Var, Integer num, androidx.compose.runtime.b bVar, Integer num2) {
            int i;
            xo8 xo8Var2 = xo8Var;
            int iIntValue = num.intValue();
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i = (bVar2.K(xo8Var2) ? 4 : 2) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i |= bVar2.d(iIntValue) ? 32 : 16;
            }
            if (bVar2.o(i & 1, (i & 147) != 146)) {
                EventRecord.Attachment attachment = (EventRecord.Attachment) this.a.get(iIntValue);
                bVar2.L(647049346);
                androidx.compose.ui.e eVarB = this.b ? xo8Var2.b() : e.a.b;
                ehd ehdVarA = chd.a(vs0.a, c20.a.j, bVar2, 0);
                int iHashCode = Long.hashCode(bVar2.k());
                t8b t8bVarM = bVar2.m();
                androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(bVar2, eVarB);
                gl2.j.getClass();
                pm8.a aVar = gl2.a.b;
                if (bVar2.j() == null) {
                    pg8.B();
                    throw null;
                }
                bVar2.B();
                if (bVar2.f()) {
                    bVar2.y(aVar);
                } else {
                    bVar2.n();
                }
                ygg.y(bVar2, ehdVarA, gl2.a.g);
                ygg.y(bVar2, t8bVarM, gl2.a.f);
                gl2.a.C0251a c0251a = gl2.a.j;
                if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                    uz.g(iHashCode, bVar2, iHashCode, c0251a);
                }
                ygg.y(bVar2, eVarC, gl2.a.d);
                pw0.a(attachment, this.b, false, this.c, null, this.d, bVar2, 0, 20);
                bVar2.q();
                bVar2.F();
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    public static final void a(final int i, final int i2, gu5 gu5Var, androidx.compose.runtime.b bVar, final androidx.compose.ui.e eVar, final boolean z) {
        int i3;
        final gu5 gu5Var2;
        androidx.compose.runtime.c cVarH = bVar.h(-1951917076);
        if ((i & 6) == 0) {
            i3 = (cVarH.a(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cVarH.x(gu5Var) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= cVarH.K(eVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (cVarH.o(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                eVar = e.a.b;
            }
            androidx.compose.ui.e eVar2 = eVar;
            int i5 = i3 >> 3;
            sq6.a(gu5Var, eVar2, z, hj2.c, cVarH, (i5 & 112) | (i5 & 14) | 24576 | ((i3 << 6) & 896), 8);
            gu5Var2 = gu5Var;
            eVar = eVar2;
        } else {
            gu5Var2 = gu5Var;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: ep9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hp9.a(ka2.L(i | 1), i2, gu5Var2, (b) obj, eVar, z);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(ArrayList arrayList, gu5 gu5Var, gu5 gu5Var2, androidx.compose.runtime.b bVar, int i) {
        androidx.compose.runtime.c cVar;
        androidx.compose.runtime.c cVarH = bVar.h(799987031);
        int i2 = 2;
        int i3 = i | (cVarH.x(arrayList) ? 4 : 2) | (cVarH.x(gu5Var2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarH.o(i3 & 1, (i3 & 147) != 146)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            o97.g gVar = o97Var.i;
            cVar = cVarH;
            l40.a(gu5Var, bh2.c(816888847, new jd(5, gu5Var2, o97Var), cVarH), null, bh2.c(-13764787, new nu(i2, gu5Var, o97Var), cVarH), bh2.c(-429091604, new dy1(o97Var, 1), cVarH), bh2.c(-844418421, new gs0(2, arrayList, o97Var), cVarH), ggd.a(16.0f), 0L, 0L, null, cVar, 224310, 900);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new uf(i, 2, gu5Var2, arrayList, gu5Var);
        }
    }

    public static final void c(final int i, gu5 gu5Var, androidx.compose.runtime.b bVar, final androidx.compose.ui.e eVar, boolean z) {
        final gu5 gu5Var2;
        final boolean z2;
        androidx.compose.runtime.c cVarH = bVar.h(9613358);
        int i2 = (cVarH.a(z) ? 4 : 2) | i | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.K(eVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            gu5Var2 = gu5Var;
            z2 = z;
            sq6.a(gu5Var2, androidx.compose.ui.platform.f.a(ygg.g(eVar, z ? 1.0f : 0.4f), "InlineAiButton"), z2, hj2.d, cVarH, ((i2 >> 3) & 14) | 24576 | ((i2 << 6) & 896), 8);
        } else {
            gu5Var2 = gu5Var;
            z2 = z;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(i, gu5Var2, eVar, z2) { // from class: bp9
                public final /* synthetic */ boolean a;
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ e c;

                {
                    this.a = z2;
                    this.b = gu5Var2;
                    this.c = eVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hp9.c(ka2.L(1), this.b, (b) obj, this.c, this.a);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final defpackage.x1e r30, final kotlin.jvm.functions.Function1<? super java.lang.String, defpackage.j6g> r31, final defpackage.gu5<defpackage.j6g> r32, final defpackage.gu5<defpackage.j6g> r33, final kotlin.jvm.functions.Function1<? super com.indeed.android.messaging.data.events.EventRecord.Attachment, defpackage.j6g> r34, final kotlin.jvm.functions.Function1<? super com.indeed.android.messaging.data.events.EventRecord.Attachment, defpackage.j6g> r35, boolean r36, defpackage.gu5<defpackage.j6g> r37, androidx.compose.runtime.b r38, final int r39, final int r40) {
        /*
            Method dump skipped, instruction units count: 1231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hp9.d(x1e, kotlin.jvm.functions.Function1, gu5, gu5, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, gu5, androidx.compose.runtime.b, int, int):void");
    }

    public static final void e(List<EventRecord.Attachment> list, Function1<? super EventRecord.Attachment, j6g> function1, Function1<? super EventRecord.Attachment, j6g> function12, androidx.compose.runtime.b bVar, int i) {
        int i2;
        androidx.compose.runtime.c cVarH = bVar.h(-2005402943);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(function12) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            ss8 ss8VarA = us8.a(cVarH);
            boolean zK = cVarH.K(ss8VarA);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zK || objV == c0020a) {
                objV = new c(ss8VarA, null);
                cVarH.p(objV);
            }
            to4.d(cVarH, list, (Function2) objV);
            androidx.compose.ui.e eVarA = androidx.compose.ui.platform.f.a(e.a.b, "MessageComposerAttachments");
            o97.g gVar = o97Var.i;
            androidx.compose.ui.e eVarF = g.f(androidx.compose.foundation.layout.f.f(eVarA, 12.0f), 1.0f);
            vs0.i iVar = new vs0.i(8.0f, true, new us0(0));
            boolean zX = ((i2 & 112) == 32) | cVarH.x(list) | ((i2 & 896) == 256);
            Object objV2 = cVarH.v();
            if (zX || objV2 == c0020a) {
                objV2 = new uz4(2, list, function1, function12);
                cVarH.p(objV2);
            }
            hn8.c(eVarF, ss8VarA, null, iVar, null, null, false, null, (Function1) objV2, cVarH, 0, 492);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new q90(i, 3, list, function1, function12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0241  */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(final java.lang.String r49, final kotlin.jvm.functions.Function1 r50, final androidx.compose.ui.e r51, boolean r52, final defpackage.le0 r53, final kotlin.jvm.functions.Function2 r54, defpackage.d3a r55, final java.util.List r56, final kotlin.jvm.functions.Function1 r57, final kotlin.jvm.functions.Function1 r58, androidx.compose.runtime.b r59, final int r60, final int r61) {
        /*
            Method dump skipped, instruction units count: 799
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hp9.f(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.e, boolean, le0, kotlin.jvm.functions.Function2, d3a, java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.b, int, int):void");
    }

    public static final void g(final int i, final gu5 gu5Var, androidx.compose.runtime.b bVar, final boolean z) {
        androidx.compose.runtime.c cVarH = bVar.h(23229927);
        int i2 = (cVarH.a(z) ? 4 : 2) | i | (cVarH.x(gu5Var) ? 32 : 16);
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e.a aVar = e.a.b;
            androidx.compose.ui.e eVarC = g.c(aVar, 1.0f);
            o97.g gVar = o97Var.i;
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.f.j(eVarC, 0.0f, 0.0f, 0.0f, 12.0f, 7), 0.0f, 0.0f, 6.0f, 0.0f, 11);
            ob2 ob2VarA = mb2.a(vs0.d, c20.a.m, cVarH, 6);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            androidx.compose.ui.e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarJ);
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
            ygg.y(cVarH, eVarC2, gl2.a.d);
            sq6.a(gu5Var, g.h(g.r(z ? androidx.compose.foundation.a.a(aVar, new kx8(0L, 9187343241974906880L, u63.a0(new da2(pnb.g(4281886383L)), new da2(pnb.g(4281757397L)))), ggd.a, 4) : androidx.compose.foundation.a.b(aVar, o97Var.c.c.b, ggd.a), 32.0f), 32.0f), z, bh2.c(161144825, new kj3(o97Var, 1), cVarH), cVarH, ((i2 << 6) & 896) | ((i2 >> 3) & 14) | 24576, 8);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(i, gu5Var, z) { // from class: cp9
                public final /* synthetic */ boolean a;
                public final /* synthetic */ gu5 b;

                {
                    this.a = z;
                    this.b = gu5Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hp9.g(ka2.L(1), this.b, (b) obj, this.a);
                    return j6g.a;
                }
            };
        }
    }
}
