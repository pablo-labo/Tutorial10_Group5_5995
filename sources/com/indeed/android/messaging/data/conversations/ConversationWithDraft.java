package com.indeed.android.messaging.data.conversations;

import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/indeed/android/messaging/data/conversations/ConversationWithDraft;", "", "conversation", "Lcom/indeed/android/messaging/data/conversations/ConversationRecord;", "draft", "Lcom/indeed/android/messaging/data/conversations/DraftRecord;", "<init>", "(Lcom/indeed/android/messaging/data/conversations/ConversationRecord;Lcom/indeed/android/messaging/data/conversations/DraftRecord;)V", "getConversation", "()Lcom/indeed/android/messaging/data/conversations/ConversationRecord;", "getDraft", "()Lcom/indeed/android/messaging/data/conversations/DraftRecord;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConversationWithDraft {
    public static final int $stable = 8;
    private final ConversationRecord conversation;
    private final DraftRecord draft;

    public ConversationWithDraft(ConversationRecord conversationRecord, DraftRecord draftRecord) {
        conversationRecord.getClass();
        this.conversation = conversationRecord;
        this.draft = draftRecord;
    }

    public static /* synthetic */ ConversationWithDraft copy$default(ConversationWithDraft conversationWithDraft, ConversationRecord conversationRecord, DraftRecord draftRecord, int i, Object obj) {
        if ((i & 1) != 0) {
            conversationRecord = conversationWithDraft.conversation;
        }
        if ((i & 2) != 0) {
            draftRecord = conversationWithDraft.draft;
        }
        return conversationWithDraft.copy(conversationRecord, draftRecord);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ConversationRecord getConversation() {
        return this.conversation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DraftRecord getDraft() {
        return this.draft;
    }

    public final ConversationWithDraft copy(ConversationRecord conversation, DraftRecord draft) {
        conversation.getClass();
        return new ConversationWithDraft(conversation, draft);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationWithDraft)) {
            return false;
        }
        ConversationWithDraft conversationWithDraft = (ConversationWithDraft) other;
        return wl7.b(this.conversation, conversationWithDraft.conversation) && wl7.b(this.draft, conversationWithDraft.draft);
    }

    public final ConversationRecord getConversation() {
        return this.conversation;
    }

    public final DraftRecord getDraft() {
        return this.draft;
    }

    public int hashCode() {
        int iHashCode = this.conversation.hashCode() * 31;
        DraftRecord draftRecord = this.draft;
        return iHashCode + (draftRecord == null ? 0 : draftRecord.hashCode());
    }

    public String toString() {
        return "ConversationWithDraft(conversation=" + this.conversation + ", draft=" + this.draft + ")";
    }
}
