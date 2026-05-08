package defpackage;

import com.indeed.android.messaging.data.conversations.ConversationRecord;
import com.indeed.android.messaging.data.conversations.ConversationsRepository;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.domain.ChangeConversationFolderUseCase$invoke$onUndoActionClicked$1", f = "ChangeConversationFolderUseCase.kt", l = {48}, m = "invokeSuspend")
public final class k02 extends c1f implements Function2<h4a<dnf>, lu2<? super j6g>, Object> {
    final /* synthetic */ ConversationRecord $conversation;
    final /* synthetic */ boolean $isArchiving;
    final /* synthetic */ boolean $isMovingToSpam;
    final /* synthetic */ w47 $newFolder;
    final /* synthetic */ w47 $oldFolder;
    final /* synthetic */ w47 $toFolder;
    final /* synthetic */ p12 $trigger;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ h02 this$0;

    @uh3(c = "com.indeed.android.messaging.domain.ChangeConversationFolderUseCase$invoke$onUndoActionClicked$1$2", f = "ChangeConversationFolderUseCase.kt", l = {73}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<h4a<dnf>, lu2<? super j6g>, Object> {
        final /* synthetic */ ConversationRecord $conversation;
        final /* synthetic */ w47 $newFolder;
        final /* synthetic */ w47 $toFolder;
        final /* synthetic */ p12 $trigger;
        Object L$0;
        int label;
        final /* synthetic */ h02 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ConversationRecord conversationRecord, w47 w47Var, h02 h02Var, p12 p12Var, w47 w47Var2, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$conversation = conversationRecord;
            this.$newFolder = w47Var;
            this.this$0 = h02Var;
            this.$trigger = p12Var;
            this.$toFolder = w47Var2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$conversation, this.$newFolder, this.this$0, this.$trigger, this.$toFolder, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(h4a<dnf> h4aVar, lu2<? super j6g> lu2Var) {
            return ((a) create(h4aVar, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                ConversationRecord conversationRecordCopy$default = ConversationRecord.copy$default(this.$conversation, null, null, null, null, null, null, 0L, null, null, 0, null, null, false, this.$newFolder, null, null, null, null, null, null, null, null, false, 8380415, null);
                h02 h02Var = this.this$0;
                p12 p12Var = this.$trigger;
                w47 w47Var = this.$toFolder;
                this.L$0 = null;
                this.label = 1;
                Object objA = h02Var.a(conversationRecordCopy$default, p12Var, w47Var, this);
                g13 g13Var = g13.a;
                if (objA == g13Var) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k02(h02 h02Var, ConversationRecord conversationRecord, w47 w47Var, boolean z, boolean z2, w47 w47Var2, p12 p12Var, w47 w47Var3, lu2<? super k02> lu2Var) {
        super(2, lu2Var);
        this.this$0 = h02Var;
        this.$conversation = conversationRecord;
        this.$oldFolder = w47Var;
        this.$isArchiving = z;
        this.$isMovingToSpam = z2;
        this.$newFolder = w47Var2;
        this.$trigger = p12Var;
        this.$toFolder = w47Var3;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        k02 k02Var = new k02(this.this$0, this.$conversation, this.$oldFolder, this.$isArchiving, this.$isMovingToSpam, this.$newFolder, this.$trigger, this.$toFolder, lu2Var);
        k02Var.L$0 = obj;
        return k02Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(h4a<dnf> h4aVar, lu2<? super j6g> lu2Var) {
        return ((k02) create(h4aVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object value;
        h4a h4aVar = (h4a) this.L$0;
        int i = this.label;
        try {
            if (i == 0) {
                r7d.b(obj);
                ConversationsRepository conversationsRepository = this.this$0.a;
                String id = this.$conversation.getId();
                w47 w47Var = this.$oldFolder;
                this.L$0 = h4aVar;
                this.label = 1;
                Object objMoveConversationToFolder = conversationsRepository.moveConversationToFolder(id, w47Var, this);
                g13 g13Var = g13.a;
                if (objMoveConversationToFolder == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            int iOrdinal = this.$oldFolder.ordinal();
            w5 w5Var = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? null : w5.c : w5.b : w5.a;
            do {
                value = h4aVar.getValue();
            } while (!h4aVar.h(value, dnf.a((dnf) value, w5Var)));
        } catch (Exception unused) {
            cnf cnfVar = (this.$isArchiving || this.$isMovingToSpam) ? cnf.d : cnf.b;
            h02 h02Var = this.this$0;
            fnf.h(h02Var.b, cnfVar, null, new a(this.$conversation, this.$newFolder, h02Var, this.$trigger, this.$toFolder, null), 2);
        }
        return j6g.a;
    }
}
