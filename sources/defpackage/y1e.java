package defpackage;

import android.content.Context;
import android.util.Log;
import com.indeed.android.messaging.data.conversations.AttachmentsRepository;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource;
import com.indeed.android.messaging.data.conversations.ConversationsRepository;
import com.indeed.android.messaging.data.conversations.model.AiMessagingButtonType;
import com.indeed.android.messaging.data.conversations.model.SuggestedMessageModel;
import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.sp7;
import defpackage.yde;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class y1e extends brg {
    public static final Set<String> e0 = ut0.I0(new String[]{"pdf", "png", "jpeg", "jpg"});
    public final ConversationsRemoteDataSource V;
    public final gse W;
    public final f22 X;
    public final f22 Y;
    public final pqc Z;
    public final boolean a0;
    public final ConversationsRepository b;
    public final vi5<List<EventRecord.Attachment>> b0;
    public final AttachmentsRepository c;
    public final gse c0;
    public final h02 d;
    public final gse d0;
    public final fnf e;
    public final lr9 f;

    @uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationViewModel$1", f = "SelectedConversationViewModel.kt", l = {117}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;
        final /* synthetic */ y1e this$0;

        /* JADX INFO: renamed from: y1e$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationViewModel$1$1", f = "SelectedConversationViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class C0479a extends c1f implements yu5<ConversationRecord, List<? extends EventRecord.Attachment>, x1e, EventRecord, lu2<? super x1e>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            /* synthetic */ Object L$2;
            /* synthetic */ Object L$3;
            int label;
            final /* synthetic */ y1e this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0479a(lu2 lu2Var, y1e y1eVar) {
                super(5, lu2Var);
                this.this$0 = y1eVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
            @Override // defpackage.x81
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r30) {
                /*
                    Method dump skipped, instruction units count: 223
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: y1e.a.C0479a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // defpackage.yu5
            public final Object t(ConversationRecord conversationRecord, List<? extends EventRecord.Attachment> list, x1e x1eVar, EventRecord eventRecord, lu2<? super x1e> lu2Var) {
                C0479a c0479a = new C0479a(lu2Var, this.this$0);
                c0479a.L$0 = conversationRecord;
                c0479a.L$1 = list;
                c0479a.L$2 = x1eVar;
                c0479a.L$3 = eventRecord;
                return c0479a.invokeSuspend(j6g.a);
            }
        }

        public static final class b<T> implements wi5 {
            public final /* synthetic */ y1e a;

            public b(y1e y1eVar) {
                this.a = y1eVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.wi5
            public final Object a(Object obj, lu2 lu2Var) {
                Object value;
                x1e x1eVar = (x1e) obj;
                gse gseVar = this.a.c0;
                do {
                    value = gseVar.getValue();
                } while (!gseVar.h(value, x1eVar));
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lu2 lu2Var, y1e y1eVar) {
            super(2, lu2Var);
            this.this$0 = y1eVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(lu2Var, this.this$0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            return g13.a;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type lu2 to y1e$a for r8v2 'this'  lu2
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.x81
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                int r0 = r8.label
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L12
                if (r0 == r2) goto Le
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r8)
                return r1
            Le:
                defpackage.r7d.b(r9)
                goto L6d
            L12:
                defpackage.r7d.b(r9)
                y1e r9 = r8.this$0
                f22 r0 = r9.X
                vi5<java.util.List<com.indeed.android.messaging.data.events.EventRecord$Attachment>> r3 = r9.b0
                gse r4 = r9.c0
                f22 r5 = r9.Y
                y1e$a$a r6 = new y1e$a$a
                r6.<init>(r1, r9)
                r9 = 4
                vi5[] r9 = new defpackage.vi5[r9]
                r7 = 0
                r9[r7] = r0
                r9[r2] = r3
                r0 = 2
                r9[r0] = r4
                r0 = 3
                r9[r0] = r5
                sk5 r0 = new sk5
                r0.<init>(r9, r6)
                y1e r9 = r8.this$0
                k82 r9 = defpackage.ee3.p(r9)
                xre r3 = new xre
                r4 = 0
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.<init>(r4, r6)
                x1e r4 = new x1e
                y1e r5 = r8.this$0
                boolean r5 = r5.a0
                r6 = 67100663(0x3ffdff7, float:1.5038973E-36)
                r4.<init>(r1, r1, r5, r6)
                rqc r9 = defpackage.wg2.Z(r0, r9, r3, r4)
                y1e$a$b r0 = new y1e$a$b
                y1e r3 = r8.this$0
                r0.<init>(r3)
                r8.label = r2
                fse<T> r9 = r9.a
                java.lang.Object r8 = r9.e(r0, r8)
                g13 r9 = defpackage.g13.a
                if (r8 != r9) goto L6d
                return r9
            L6d:
                defpackage.r40.e()
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: y1e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationViewModel$enterConversation$1", f = "SelectedConversationViewModel.kt", l = {129, 136}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $conversationId;
        final /* synthetic */ String $sessionSource;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$conversationId = str;
            this.$sessionSource = str2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return y1e.this.new b(this.$conversationId, this.$sessionSource, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00c7, code lost:
        
            if (r3.set(r1, r34) == r5) goto L30;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r35) {
            /*
                Method dump skipped, instruction units count: 210
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: y1e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationViewModel$enterConversation$2", f = "SelectedConversationViewModel.kt", l = {148, 152}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $conversationId;
        final /* synthetic */ String $sessionSource;
        final /* synthetic */ boolean $shouldEmitImpressionLog;
        int label;
        final /* synthetic */ y1e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(lu2 lu2Var, y1e y1eVar, String str, String str2, boolean z) {
            super(2, lu2Var);
            this.this$0 = y1eVar;
            this.$conversationId = str;
            this.$shouldEmitImpressionLog = z;
            this.$sessionSource = str2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new c(lu2Var, this.this$0, this.$conversationId, this.$sessionSource, this.$shouldEmitImpressionLog);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00dd, code lost:
        
            if (r1.j(r3, r5, r34) == r4) goto L26;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r35) {
            /*
                Method dump skipped, instruction units count: 231
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: y1e.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationViewModel", f = "SelectedConversationViewModel.kt", l = {163}, m = "loadData")
    public static final class d extends pu2 {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ y1e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(lu2 lu2Var, y1e y1eVar) {
            super(lu2Var);
            this.this$0 = y1eVar;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.j(null, false, this);
        }
    }

    @uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationViewModel$onDownloadClicked$1", f = "SelectedConversationViewModel.kt", l = {379, 409}, m = "invokeSuspend")
    public static final class e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ androidx.fragment.app.g $activity;
        final /* synthetic */ EventRecord.Attachment $attachment;
        final /* synthetic */ String $messageId;
        final /* synthetic */ gu5<j6g> $onNavigateToPreview;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        final /* synthetic */ y1e this$0;

        @uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationViewModel$onDownloadClicked$1$1$3", f = "SelectedConversationViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<h4a<dnf>, lu2<? super j6g>, Object> {
            final /* synthetic */ androidx.fragment.app.g $activity;
            final /* synthetic */ EventRecord.Attachment $attachment;
            final /* synthetic */ String $messageId;
            final /* synthetic */ gu5<j6g> $onNavigateToPreview;
            int label;
            final /* synthetic */ y1e this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(lu2 lu2Var, gu5 gu5Var, y1e y1eVar, androidx.fragment.app.g gVar, EventRecord.Attachment attachment, String str) {
                super(2, lu2Var);
                this.this$0 = y1eVar;
                this.$activity = gVar;
                this.$messageId = str;
                this.$attachment = attachment;
                this.$onNavigateToPreview = gu5Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                y1e y1eVar = this.this$0;
                androidx.fragment.app.g gVar = this.$activity;
                String str = this.$messageId;
                return new a(lu2Var, this.$onNavigateToPreview, y1eVar, gVar, this.$attachment, str);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(h4a<dnf> h4aVar, lu2<? super j6g> lu2Var) {
                return ((a) create(h4aVar, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                this.this$0.l(this.$activity, this.$messageId, this.$attachment, this.$onNavigateToPreview);
                return j6g.a;
            }
        }

        @uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationViewModel$onDownloadClicked$1$1$file$1", f = "SelectedConversationViewModel.kt", l = {380}, m = "invokeSuspend")
        public static final class b extends c1f implements Function2<e13, lu2<? super File>, Object> {
            final /* synthetic */ androidx.fragment.app.g $activity;
            final /* synthetic */ EventRecord.Attachment $attachment;
            final /* synthetic */ ConversationRecord $conversation;
            final /* synthetic */ String $messageId;
            int label;
            final /* synthetic */ y1e this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(y1e y1eVar, androidx.fragment.app.g gVar, ConversationRecord conversationRecord, String str, EventRecord.Attachment attachment, lu2<? super b> lu2Var) {
                super(2, lu2Var);
                this.this$0 = y1eVar;
                this.$activity = gVar;
                this.$conversation = conversationRecord;
                this.$messageId = str;
                this.$attachment = attachment;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new b(this.this$0, this.$activity, this.$conversation, this.$messageId, this.$attachment, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super File> lu2Var) {
                return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        r7d.b(obj);
                        return obj;
                    }
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                AttachmentsRepository attachmentsRepository = this.this$0.c;
                Context applicationContext = this.$activity.getApplicationContext();
                applicationContext.getClass();
                String id = this.$conversation.getId();
                String str = this.$messageId;
                EventRecord.Attachment attachment = this.$attachment;
                this.label = 1;
                Object objDownloadAttachmentPreview = attachmentsRepository.downloadAttachmentPreview(applicationContext, id, str, attachment, this);
                g13 g13Var = g13.a;
                return objDownloadAttachmentPreview == g13Var ? g13Var : objDownloadAttachmentPreview;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(lu2 lu2Var, gu5 gu5Var, y1e y1eVar, androidx.fragment.app.g gVar, EventRecord.Attachment attachment, String str) {
            super(2, lu2Var);
            this.this$0 = y1eVar;
            this.$attachment = attachment;
            this.$onNavigateToPreview = gu5Var;
            this.$activity = gVar;
            this.$messageId = str;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new e(lu2Var, this.$onNavigateToPreview, this.this$0, this.$activity, this.$attachment, this.$messageId);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0169  */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r46) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 503
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: y1e.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationViewModel$onMessageInput$2", f = "SelectedConversationViewModel.kt", l = {252}, m = "invokeSuspend")
    public static final class f extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $input;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ y1e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(lu2 lu2Var, y1e y1eVar, String str) {
            super(2, lu2Var);
            this.this$0 = y1eVar;
            this.$input = str;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new f(lu2Var, this.this$0, this.$input);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((f) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                String str = (String) this.this$0.W.getValue();
                if (str != null) {
                    y1e y1eVar = this.this$0;
                    String str2 = this.$input;
                    ConversationsRepository conversationsRepository = y1eVar.b;
                    this.L$0 = null;
                    this.I$0 = 0;
                    this.label = 1;
                    Object objSaveDraft$default = ConversationsRepository.saveDraft$default(conversationsRepository, str, str2, null, this, 4, null);
                    g13 g13Var = g13.a;
                    if (objSaveDraft$default == g13Var) {
                        return g13Var;
                    }
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

    @uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationViewModel$special$$inlined$flatMapLatest$1", f = "SelectedConversationViewModel.kt", l = {189}, m = "invokeSuspend")
    public static final class g extends c1f implements wu5<wi5<? super ConversationRecord>, String, lu2<? super j6g>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ y1e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(lu2 lu2Var, y1e y1eVar) {
            super(3, lu2Var);
            this.this$0 = y1eVar;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                wi5 wi5Var = (wi5) this.L$0;
                vi5<ConversationRecord> vi5VarObserveSelectedConversation = this.this$0.b.observeSelectedConversation((String) this.L$1);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                Object objX = wg2.x(wi5Var, vi5VarObserveSelectedConversation, this);
                g13 g13Var = g13.a;
                if (objX == g13Var) {
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

        @Override // defpackage.wu5
        public final Object q(wi5<? super ConversationRecord> wi5Var, String str, lu2<? super j6g> lu2Var) {
            g gVar = new g(lu2Var, this.this$0);
            gVar.L$0 = wi5Var;
            gVar.L$1 = str;
            return gVar.invokeSuspend(j6g.a);
        }
    }

    @uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationViewModel$special$$inlined$flatMapLatest$2", f = "SelectedConversationViewModel.kt", l = {189}, m = "invokeSuspend")
    public static final class h extends c1f implements wu5<wi5<? super EventRecord>, String, lu2<? super j6g>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ y1e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(lu2 lu2Var, y1e y1eVar) {
            super(3, lu2Var);
            this.this$0 = y1eVar;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                wi5 wi5Var = (wi5) this.L$0;
                vi5<EventRecord> vi5VarObserveLastEvent = this.this$0.b.observeLastEvent((String) this.L$1);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                Object objX = wg2.x(wi5Var, vi5VarObserveLastEvent, this);
                g13 g13Var = g13.a;
                if (objX == g13Var) {
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

        @Override // defpackage.wu5
        public final Object q(wi5<? super EventRecord> wi5Var, String str, lu2<? super j6g> lu2Var) {
            h hVar = new h(lu2Var, this.this$0);
            hVar.L$0 = wi5Var;
            hVar.L$1 = str;
            return hVar.invokeSuspend(j6g.a);
        }
    }

    @uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationViewModel$special$$inlined$flatMapLatest$3", f = "SelectedConversationViewModel.kt", l = {191, 189}, m = "invokeSuspend")
    public static final class i extends c1f implements wu5<wi5<? super l2b<EventRecord>>, String, lu2<? super j6g>, Object> {
        int I$0;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ y1e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(lu2 lu2Var, y1e y1eVar) {
            super(3, lu2Var);
            this.this$0 = y1eVar;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            wi5 wi5Var;
            int i = this.label;
            g13 g13Var = g13.a;
            if (i == 0) {
                r7d.b(obj);
                wi5Var = (wi5) this.L$0;
                String str = (String) this.L$1;
                ArrayList arrayList = lz2.a;
                Log.d("SelectedConversationViewModel", "lazyMessageFlow triggered for conversationId: " + str, null);
                ConversationsRepository conversationsRepository = this.this$0.b;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = wi5Var;
                this.L$3 = null;
                this.L$4 = null;
                this.I$0 = 0;
                this.label = 1;
                obj = conversationsRepository.observeSelectedConversationMessages(str, this);
                if (obj != g13Var) {
                }
                return g13Var;
            }
            if (i != 1) {
                if (i != 2) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                return j6g.a;
            }
            wi5Var = (wi5) this.L$2;
            r7d.b(obj);
            vi5 vi5Var = (vi5) obj;
            k82 k82VarP = ee3.p(this.this$0);
            vi5Var.getClass();
            vi5 vi5VarA = nfe.a(new cj5(vi5Var, new lu1(null, k82VarP), null));
            mu1 mu1Var = new mu1(3, null);
            vi5VarA.getClass();
            xde xdeVarA = nk5.a(new lj5(new mj5(new ku1(new kjd(new aj5(vi5VarA, mu1Var, null))), new nu1(2, null)), new ou1(3, null)));
            nde ndeVarC = wg2.c(1, xdeVarA.b, xdeVarA.c);
            v03 v03Var = xdeVarA.d;
            vi5<T> vi5Var2 = xdeVarA.a;
            ux0 ux0Var = wg2.b0;
            pi3 pi3Var = yde.a.a;
            wre wreVar = yde.a.b;
            u63.X(k82VarP, v03Var, wreVar != pi3Var ? i13.d : i13.a, new kk5(wreVar, vi5Var2, ndeVarC, ux0Var, null));
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 2;
            wg2.y(wi5Var);
            ndeVarC.e(wi5Var, this);
            return g13Var;
        }

        @Override // defpackage.wu5
        public final Object q(wi5<? super l2b<EventRecord>> wi5Var, String str, lu2<? super j6g> lu2Var) {
            i iVar = new i(lu2Var, this.this$0);
            iVar.L$0 = wi5Var;
            iVar.L$1 = str;
            return iVar.invokeSuspend(j6g.a);
        }
    }

    public y1e(ConversationsRepository conversationsRepository, AttachmentsRepository attachmentsRepository, h02 h02Var, fnf fnfVar, lr9 lr9Var, ConversationsRemoteDataSource conversationsRemoteDataSource) {
        this.b = conversationsRepository;
        this.c = attachmentsRepository;
        this.d = h02Var;
        this.e = fnfVar;
        this.f = lr9Var;
        this.V = conversationsRemoteDataSource;
        gse gseVarE = hh2.e(null);
        this.W = gseVarE;
        this.X = wg2.c0(wg2.v(new ok5(gseVarE)), new g(null, this));
        this.Y = wg2.c0(new ok5(gseVarE), new h(null, this));
        f22 f22VarC0 = wg2.c0(wg2.v(new ok5(gseVarE)), new i(null, this));
        k82 k82VarP = ee3.p(this);
        xre xreVar = new xre(5000L, Long.MAX_VALUE);
        xde xdeVarA = nk5.a(f22VarC0);
        nde ndeVarC = wg2.c(1, xdeVarA.b, xdeVarA.c);
        this.Z = new pqc(ndeVarC, u63.X(k82VarP, xdeVarA.d, xreVar.equals(yde.a.a) ? i13.a : i13.d, new kk5(xreVar, xdeVarA.a, ndeVarC, wg2.b0, null)));
        this.a0 = jh2.x() && !((kq7) cr8.p(kq7.class)).j("Messaging", "AiMessagingPromoIsDisplayed", false);
        this.b0 = attachmentsRepository.observeList();
        gse gseVarE2 = hh2.e(new x1e(null, null, false, 67108855));
        this.c0 = gseVarE2;
        this.d0 = gseVarE2;
        u63.Y(ee3.p(this), null, null, new a(null, this), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(defpackage.y1e r36, java.lang.String r37, defpackage.pu2 r38) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y1e.g(y1e, java.lang.String, pu2):java.lang.Object");
    }

    public final void h() {
        gse gseVar;
        Object value;
        File file;
        EventRecord.Attachment attachment = ((x1e) this.d0.getValue()).k;
        if (attachment != null && (file = attachment.getFile()) != null) {
            file.delete();
        }
        do {
            gseVar = this.c0;
            value = gseVar.getValue();
        } while (!gseVar.h(value, x1e.a((x1e) value, null, null, false, false, false, null, false, false, false, null, null, null, null, false, false, null, false, false, 0, null, null, null, null, false, null, 67107839)));
    }

    public final void i(String str, String str2, boolean z) {
        str.getClass();
        u63.Y(ee3.p(this), null, null, new b(str, str2, null), 3);
        u63.Y(ee3.p(this), null, null, new c(null, this, str, str2, z), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.lang.String r35, boolean r36, defpackage.lu2<? super defpackage.j6g> r37) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y1e.j(java.lang.String, boolean, lu2):java.lang.Object");
    }

    public final void k() {
        gse gseVar;
        Object value;
        do {
            gseVar = this.c0;
            value = gseVar.getValue();
        } while (!gseVar.h(value, x1e.a((x1e) value, null, null, false, false, false, null, false, false, false, null, null, null, null, false, false, null, false, false, 0, null, null, null, null, false, null, 66453503)));
        final boolean z = !((x1e) this.d0.getValue()).s;
        ((tp7) cr8.p(tp7.class)).b(new sp7.b("messagingAssistedResultsSheet", "messagingAssistedDismiss", null, new Function1() { // from class: vq9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                hr7 hr7Var = (hr7) obj;
                hr7Var.getClass();
                hr7Var.c(Integer.valueOf(z ? 1 : 0), "show");
                return j6g.a;
            }
        }, 4));
    }

    public final void l(androidx.fragment.app.g gVar, String str, EventRecord.Attachment attachment, gu5<j6g> gu5Var) {
        gVar.getClass();
        str.getClass();
        attachment.getClass();
        gu5Var.getClass();
        u63.Y(ee3.p(this), null, null, new e(null, gu5Var, this, gVar, attachment, str), 3);
    }

    public final void m(String str, boolean z) {
        str.getClass();
        gse gseVar = this.c0;
        AiMessagingButtonType aiMessagingButtonType = z ? AiMessagingButtonType.BACK_TO_OPTIONS : (str.length() != 0 || ((x1e) gseVar.getValue()).q.isEmpty()) ? AiMessagingButtonType.REFINE_DRAFT : AiMessagingButtonType.BACK_TO_OPTIONS;
        Object obj = null;
        SuggestedMessageModel suggestedMessageModel = (str.length() <= 0 && !z) ? null : ((x1e) gseVar.getValue()).w;
        while (true) {
            Object value = gseVar.getValue();
            if (gseVar.h(value, x1e.a((x1e) value, null, null, false, false, false, str, false, false, false, null, null, null, null, false, false, null, false, false, 0, aiMessagingButtonType, null, suggestedMessageModel, null, false, null, 61865951))) {
                u63.Y(ee3.p(this), null, null, new f(null, this, str), 3);
                return;
            }
            obj = null;
        }
    }
}
