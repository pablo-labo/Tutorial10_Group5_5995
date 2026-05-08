package defpackage;

import com.indeed.android.messaging.data.conversations.AttachmentsRepository;
import com.indeed.android.messaging.data.events.EventRecord;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationViewModel$onRetryAttachmentUploadClicked$1", f = "SelectedConversationViewModel.kt", l = {359}, m = "invokeSuspend")
public final class j2e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ EventRecord.Attachment $attachment;
    int label;
    final /* synthetic */ y1e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2e(y1e y1eVar, EventRecord.Attachment attachment, lu2<? super j2e> lu2Var) {
        super(2, lu2Var);
        this.this$0 = y1eVar;
        this.$attachment = attachment;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new j2e(this.this$0, this.$attachment, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((j2e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            y1e y1eVar = this.this$0;
            AttachmentsRepository attachmentsRepository = y1eVar.c;
            EventRecord.Attachment attachment = this.$attachment;
            String str = (String) y1eVar.W.getValue();
            this.label = 1;
            Object objRetryAttachmentUpload = attachmentsRepository.retryAttachmentUpload(attachment, str, this);
            g13 g13Var = g13.a;
            if (objRetryAttachmentUpload == g13Var) {
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
