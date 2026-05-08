package com.indeed.android.messaging.data.conversations;

import defpackage.vc5;
import defpackage.wl7;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/indeed/android/messaging/data/conversations/ConversationsRes;", "", "", "Lcom/indeed/android/messaging/data/conversations/ConversationRecord;", "conversations", "Lvc5$d;", "pageInfo", "<init>", "(Ljava/util/List;Lvc5$d;)V", "component1", "()Ljava/util/List;", "component2", "()Lvc5$d;", "copy", "(Ljava/util/List;Lvc5$d;)Lcom/indeed/android/messaging/data/conversations/ConversationsRes;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getConversations", "Lvc5$d;", "getPageInfo", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConversationsRes {
    public static final int $stable = 8;
    private final List<ConversationRecord> conversations;
    private final vc5.d pageInfo;

    public ConversationsRes(List<ConversationRecord> list, vc5.d dVar) {
        list.getClass();
        this.conversations = list;
        this.pageInfo = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConversationsRes copy$default(ConversationsRes conversationsRes, List list, vc5.d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            list = conversationsRes.conversations;
        }
        if ((i & 2) != 0) {
            dVar = conversationsRes.pageInfo;
        }
        return conversationsRes.copy(list, dVar);
    }

    public final List<ConversationRecord> component1() {
        return this.conversations;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final vc5.d getPageInfo() {
        return this.pageInfo;
    }

    public final ConversationsRes copy(List<ConversationRecord> conversations, vc5.d pageInfo) {
        conversations.getClass();
        return new ConversationsRes(conversations, pageInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationsRes)) {
            return false;
        }
        ConversationsRes conversationsRes = (ConversationsRes) other;
        return wl7.b(this.conversations, conversationsRes.conversations) && wl7.b(this.pageInfo, conversationsRes.pageInfo);
    }

    public final List<ConversationRecord> getConversations() {
        return this.conversations;
    }

    public final vc5.d getPageInfo() {
        return this.pageInfo;
    }

    public int hashCode() {
        int iHashCode = this.conversations.hashCode() * 31;
        vc5.d dVar = this.pageInfo;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public String toString() {
        return "ConversationsRes(conversations=" + this.conversations + ", pageInfo=" + this.pageInfo + ")";
    }
}
