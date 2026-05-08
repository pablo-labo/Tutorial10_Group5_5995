package com.indeed.android.messaging.data.conversations;

import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.akb;
import defpackage.g7;
import defpackage.u40;
import defpackage.wl7;
import defpackage.zr4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/indeed/android/messaging/data/conversations/DraftRecord;", "", "conversationId", "", "content", "attachments", "", "Lcom/indeed/android/messaging/data/events/EventRecord$Attachment;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getConversationId", "()Ljava/lang/String;", "getContent", "getAttachments", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DraftRecord {
    public static final int $stable = 8;
    private final List<EventRecord.Attachment> attachments;
    private final String content;
    private final String conversationId;

    public DraftRecord(String str, String str2, List<EventRecord.Attachment> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.conversationId = str;
        this.content = str2;
        this.attachments = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DraftRecord copy$default(DraftRecord draftRecord, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = draftRecord.conversationId;
        }
        if ((i & 2) != 0) {
            str2 = draftRecord.content;
        }
        if ((i & 4) != 0) {
            list = draftRecord.attachments;
        }
        return draftRecord.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    public final List<EventRecord.Attachment> component3() {
        return this.attachments;
    }

    public final DraftRecord copy(String conversationId, String content, List<EventRecord.Attachment> attachments) {
        conversationId.getClass();
        content.getClass();
        attachments.getClass();
        return new DraftRecord(conversationId, content, attachments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DraftRecord)) {
            return false;
        }
        DraftRecord draftRecord = (DraftRecord) other;
        return wl7.b(this.conversationId, draftRecord.conversationId) && wl7.b(this.content, draftRecord.content) && wl7.b(this.attachments, draftRecord.attachments);
    }

    public final List<EventRecord.Attachment> getAttachments() {
        return this.attachments;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public int hashCode() {
        return this.attachments.hashCode() + akb.d(this.conversationId.hashCode() * 31, 31, this.content);
    }

    public String toString() {
        String str = this.conversationId;
        String str2 = this.content;
        return g7.i(u40.f("DraftRecord(conversationId=", str, ", content=", str2, ", attachments="), this.attachments, ")");
    }

    public /* synthetic */ DraftRecord(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? zr4.a : list);
    }
}
