package com.indeed.android.myjobs.data.model.dto;

import defpackage.u40;
import defpackage.wl7;
import defpackage.z3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/indeed/android/myjobs/data/model/dto/ConversationDto;", "", "conversationId", "", "conversationKey", "messageIdOfInvite", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "getConversationKey", "getMessageIdOfInvite", "getMessage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConversationDto {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String conversationId;
    private final String conversationKey;
    private final String message;
    private final String messageIdOfInvite;

    public ConversationDto(String str, String str2, String str3, String str4) {
        this.conversationId = str;
        this.conversationKey = str2;
        this.messageIdOfInvite = str3;
        this.message = str4;
    }

    public static /* synthetic */ ConversationDto copy$default(ConversationDto conversationDto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conversationDto.conversationId;
        }
        if ((i & 2) != 0) {
            str2 = conversationDto.conversationKey;
        }
        if ((i & 4) != 0) {
            str3 = conversationDto.messageIdOfInvite;
        }
        if ((i & 8) != 0) {
            str4 = conversationDto.message;
        }
        return conversationDto.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConversationKey() {
        return this.conversationKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessageIdOfInvite() {
        return this.messageIdOfInvite;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final ConversationDto copy(String conversationId, String conversationKey, String messageIdOfInvite, String message) {
        return new ConversationDto(conversationId, conversationKey, messageIdOfInvite, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationDto)) {
            return false;
        }
        ConversationDto conversationDto = (ConversationDto) other;
        return wl7.b(this.conversationId, conversationDto.conversationId) && wl7.b(this.conversationKey, conversationDto.conversationKey) && wl7.b(this.messageIdOfInvite, conversationDto.messageIdOfInvite) && wl7.b(this.message, conversationDto.message);
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getConversationKey() {
        return this.conversationKey;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getMessageIdOfInvite() {
        return this.messageIdOfInvite;
    }

    public int hashCode() {
        String str = this.conversationId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.conversationKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.messageIdOfInvite;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.message;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.conversationId;
        String str2 = this.conversationKey;
        return z3.n(u40.f("ConversationDto(conversationId=", str, ", conversationKey=", str2, ", messageIdOfInvite="), this.messageIdOfInvite, ", message=", this.message, ")");
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/indeed/android/myjobs/data/model/dto/ConversationDto$Companion;", "", "<init>", "()V", "init", "Lcom/indeed/android/myjobs/data/model/dto/ConversationDto;", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ConversationDto init() {
            return new ConversationDto(null, null, null, null);
        }

        private Companion() {
        }
    }
}
