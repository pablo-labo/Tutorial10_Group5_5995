package com.indeed.android.messaging.data.conversations.model;

import com.indeed.android.messaging.data.conversations.ConversationRecord;
import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.ia;
import defpackage.o75;
import defpackage.wl7;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010¨\u0006#"}, d2 = {"Lcom/indeed/android/messaging/data/conversations/model/ConversationWithMessages;", "", "Lcom/indeed/android/messaging/data/conversations/ConversationRecord;", "conversation", "", "Lcom/indeed/android/messaging/data/events/EventRecord;", "events", "Lo75$j;", "pageInfo", "<init>", "(Lcom/indeed/android/messaging/data/conversations/ConversationRecord;Ljava/util/List;Lo75$j;)V", "component1", "()Lcom/indeed/android/messaging/data/conversations/ConversationRecord;", "component2", "()Ljava/util/List;", "component3", "()Lo75$j;", "copy", "(Lcom/indeed/android/messaging/data/conversations/ConversationRecord;Ljava/util/List;Lo75$j;)Lcom/indeed/android/messaging/data/conversations/model/ConversationWithMessages;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/indeed/android/messaging/data/conversations/ConversationRecord;", "getConversation", "Ljava/util/List;", "getEvents", "Lo75$j;", "getPageInfo", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConversationWithMessages {
    public static final int $stable = 8;
    private final ConversationRecord conversation;
    private final List<EventRecord> events;
    private final o75.j pageInfo;

    public ConversationWithMessages(ConversationRecord conversationRecord, List<EventRecord> list, o75.j jVar) {
        conversationRecord.getClass();
        list.getClass();
        this.conversation = conversationRecord;
        this.events = list;
        this.pageInfo = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConversationWithMessages copy$default(ConversationWithMessages conversationWithMessages, ConversationRecord conversationRecord, List list, o75.j jVar, int i, Object obj) {
        if ((i & 1) != 0) {
            conversationRecord = conversationWithMessages.conversation;
        }
        if ((i & 2) != 0) {
            list = conversationWithMessages.events;
        }
        if ((i & 4) != 0) {
            jVar = conversationWithMessages.pageInfo;
        }
        return conversationWithMessages.copy(conversationRecord, list, jVar);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ConversationRecord getConversation() {
        return this.conversation;
    }

    public final List<EventRecord> component2() {
        return this.events;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final o75.j getPageInfo() {
        return this.pageInfo;
    }

    public final ConversationWithMessages copy(ConversationRecord conversation, List<EventRecord> events, o75.j pageInfo) {
        conversation.getClass();
        events.getClass();
        return new ConversationWithMessages(conversation, events, pageInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationWithMessages)) {
            return false;
        }
        ConversationWithMessages conversationWithMessages = (ConversationWithMessages) other;
        return wl7.b(this.conversation, conversationWithMessages.conversation) && wl7.b(this.events, conversationWithMessages.events) && wl7.b(this.pageInfo, conversationWithMessages.pageInfo);
    }

    public final ConversationRecord getConversation() {
        return this.conversation;
    }

    public final List<EventRecord> getEvents() {
        return this.events;
    }

    public final o75.j getPageInfo() {
        return this.pageInfo;
    }

    public int hashCode() {
        int iG = ia.g(this.events, this.conversation.hashCode() * 31, 31);
        o75.j jVar = this.pageInfo;
        return iG + (jVar == null ? 0 : jVar.hashCode());
    }

    public String toString() {
        return "ConversationWithMessages(conversation=" + this.conversation + ", events=" + this.events + ", pageInfo=" + this.pageInfo + ")";
    }
}
