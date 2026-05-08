package com.indeed.android.messaging.data.conversations;

import android.content.Context;
import androidx.fragment.app.g;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.b0;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.vi5;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH¦@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH¦@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH¦@¢\u0006\u0004\b\u0011\u0010\u0010JD\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b0\u0015H¦@¢\u0006\u0004\b\u0018\u0010\u0019J2\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010!\u001a\u00020\u000b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0004\b!\u0010\"¨\u0006#À\u0006\u0003"}, d2 = {"Lcom/indeed/android/messaging/data/conversations/AttachmentsRepository;", "", "Lvi5;", "", "Lcom/indeed/android/messaging/data/events/EventRecord$Attachment;", "observeList", "()Lvi5;", "Ljava/io/File;", "file", "", "conversationId", "Lj6g;", "uploadAttachment", "(Ljava/io/File;Ljava/lang/String;Llu2;)Ljava/lang/Object;", "attachment", "retryAttachmentUpload", "(Lcom/indeed/android/messaging/data/events/EventRecord$Attachment;Ljava/lang/String;Llu2;)Ljava/lang/Object;", "removeAttachment", "Landroidx/fragment/app/g;", "activity", "messageId", "Lkotlin/Function1;", "", "onDownloadFileCallback", "downloadAttachmentWithoutPreview", "(Landroidx/fragment/app/g;Ljava/lang/String;Ljava/lang/String;Lcom/indeed/android/messaging/data/events/EventRecord$Attachment;Lkotlin/jvm/functions/Function1;Llu2;)Ljava/lang/Object;", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "downloadAttachmentPreview", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/indeed/android/messaging/data/events/EventRecord$Attachment;Llu2;)Ljava/lang/Object;", "clear", "(Llu2;)Ljava/lang/Object;", "list", "set", "(Ljava/util/List;Llu2;)Ljava/lang/Object;", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AttachmentsRepository {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object removeAttachment$default(AttachmentsRepository attachmentsRepository, EventRecord.Attachment attachment, String str, lu2 lu2Var, int i, Object obj) {
        if (obj != null) {
            b0.u("Super calls with default arguments not supported in this target, function: removeAttachment");
            return null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return attachmentsRepository.removeAttachment(attachment, str, lu2Var);
    }

    static /* synthetic */ Object retryAttachmentUpload$default(AttachmentsRepository attachmentsRepository, EventRecord.Attachment attachment, String str, lu2 lu2Var, int i, Object obj) {
        if (obj != null) {
            b0.u("Super calls with default arguments not supported in this target, function: retryAttachmentUpload");
            return null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return attachmentsRepository.retryAttachmentUpload(attachment, str, lu2Var);
    }

    static /* synthetic */ Object uploadAttachment$default(AttachmentsRepository attachmentsRepository, File file, String str, lu2 lu2Var, int i, Object obj) {
        if (obj != null) {
            b0.u("Super calls with default arguments not supported in this target, function: uploadAttachment");
            return null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return attachmentsRepository.uploadAttachment(file, str, lu2Var);
    }

    Object clear(lu2<? super j6g> lu2Var);

    Object downloadAttachmentPreview(Context context, String str, String str2, EventRecord.Attachment attachment, lu2<? super File> lu2Var);

    Object downloadAttachmentWithoutPreview(g gVar, String str, String str2, EventRecord.Attachment attachment, Function1<? super Integer, j6g> function1, lu2<? super j6g> lu2Var);

    vi5<List<EventRecord.Attachment>> observeList();

    Object removeAttachment(EventRecord.Attachment attachment, String str, lu2<? super j6g> lu2Var);

    Object retryAttachmentUpload(EventRecord.Attachment attachment, String str, lu2<? super j6g> lu2Var);

    Object set(List<EventRecord.Attachment> list, lu2<? super j6g> lu2Var);

    Object uploadAttachment(File file, String str, lu2<? super j6g> lu2Var);
}
