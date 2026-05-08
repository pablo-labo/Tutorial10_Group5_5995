package com.indeed.android.messaging.data.conversations;

import com.indeed.android.messaging.data.conversations.model.SuggestedMessageModel;
import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.aib;
import defpackage.b0;
import defpackage.j6g;
import defpackage.l2b;
import defpackage.lu2;
import defpackage.vi5;
import defpackage.w47;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00042\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00042\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\tH¦@¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u0015\u0010\u0011J8\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H¦@¢\u0006\u0004\b\u001c\u0010\u001dJ*\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H¦@¢\u0006\u0004\b\u001f\u0010 J \u0010!\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b#\u0010\u0011J\u0018\u0010%\u001a\u00020$2\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b%\u0010\u0011J\u001a\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b'\u0010\u0011J6\u0010)\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0005H¦@¢\u0006\u0004\b)\u0010*J\u0018\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020\tH¦@¢\u0006\u0004\b-\u0010\u0011J\u001f\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00042\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b.\u0010\rJ&\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010/\u001a\u00020\tH¦@¢\u0006\u0004\b1\u00102¨\u00063À\u0006\u0003"}, d2 = {"Lcom/indeed/android/messaging/data/conversations/ConversationsRepository;", "", "Lw47;", "folder", "Lvi5;", "", "Lcom/indeed/android/messaging/data/conversations/ConversationWithDraft;", "observeList", "(Lw47;)Lvi5;", "", "conversationId", "Lcom/indeed/android/messaging/data/conversations/ConversationRecord;", "observeSelectedConversation", "(Ljava/lang/String;)Lvi5;", "Ll2b;", "Lcom/indeed/android/messaging/data/events/EventRecord;", "observeSelectedConversationMessages", "(Ljava/lang/String;Llu2;)Ljava/lang/Object;", "loadMoreStartCursor", "loadConversationListNextPage", "(Lw47;Ljava/lang/String;Llu2;)Ljava/lang/Object;", "loadSelectedConversation", "messageBody", "Lcom/indeed/android/messaging/data/events/EventRecord$Attachment;", "attachments", "Laib;", "scope", "Lj6g;", "sendMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Laib;Llu2;)Ljava/lang/Object;", "messageId", "retryMessageSend", "(Ljava/lang/String;Ljava/lang/String;Laib;Llu2;)Ljava/lang/Object;", "moveConversationToFolder", "(Ljava/lang/String;Lw47;Llu2;)Ljava/lang/Object;", "markConversationRead", "", "doesConversationHasCachedMessages", "Lcom/indeed/android/messaging/data/conversations/DraftRecord;", "getDraft", "message", "saveDraft", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Llu2;)Ljava/lang/Object;", "token", "Lcom/indeed/android/messaging/data/conversations/InitiateResponse;", "initiateConversation", "observeLastEvent", "draft", "Lcom/indeed/android/messaging/data/conversations/model/SuggestedMessageModel;", "getSuggestedMessageModelList", "(Ljava/lang/String;Ljava/lang/String;Llu2;)Ljava/lang/Object;", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ConversationsRepository {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object loadConversationListNextPage$default(ConversationsRepository conversationsRepository, w47 w47Var, String str, lu2 lu2Var, int i, Object obj) {
        if (obj != null) {
            b0.u("Super calls with default arguments not supported in this target, function: loadConversationListNextPage");
            return null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return conversationsRepository.loadConversationListNextPage(w47Var, str, lu2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object saveDraft$default(ConversationsRepository conversationsRepository, String str, String str2, List list, lu2 lu2Var, int i, Object obj) {
        if (obj != null) {
            b0.u("Super calls with default arguments not supported in this target, function: saveDraft");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        return conversationsRepository.saveDraft(str, str2, list, lu2Var);
    }

    Object doesConversationHasCachedMessages(String str, lu2<? super Boolean> lu2Var);

    Object getDraft(String str, lu2<? super DraftRecord> lu2Var);

    Object getSuggestedMessageModelList(String str, String str2, lu2<? super List<SuggestedMessageModel>> lu2Var);

    Object initiateConversation(String str, lu2<? super InitiateResponse> lu2Var);

    Object loadConversationListNextPage(w47 w47Var, String str, lu2<? super String> lu2Var);

    Object loadSelectedConversation(String str, lu2<? super ConversationRecord> lu2Var);

    Object markConversationRead(String str, lu2<? super j6g> lu2Var);

    Object moveConversationToFolder(String str, w47 w47Var, lu2<? super j6g> lu2Var);

    vi5<EventRecord> observeLastEvent(String conversationId);

    vi5<List<ConversationWithDraft>> observeList(w47 folder);

    vi5<ConversationRecord> observeSelectedConversation(String conversationId);

    Object observeSelectedConversationMessages(String str, lu2<? super vi5<l2b<EventRecord>>> lu2Var);

    Object retryMessageSend(String str, String str2, aib aibVar, lu2<? super j6g> lu2Var);

    Object saveDraft(String str, String str2, List<EventRecord.Attachment> list, lu2<? super j6g> lu2Var);

    Object sendMessage(String str, String str2, List<EventRecord.Attachment> list, aib aibVar, lu2<? super j6g> lu2Var);
}
