package com.indeed.android.messaging.data.conversations;

import defpackage.aib;
import defpackage.akb;
import defpackage.wl7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001f\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0011¨\u0006\""}, d2 = {"Lcom/indeed/android/messaging/data/conversations/InitiateResponse;", "", "", "exists", "", "conversationId", "conversationSid", "Laib;", "initiateScope", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Laib;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "()Laib;", "copy", "(ZLjava/lang/String;Ljava/lang/String;Laib;)Lcom/indeed/android/messaging/data/conversations/InitiateResponse;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getExists", "Ljava/lang/String;", "getConversationId", "getConversationSid", "Laib;", "getInitiateScope", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InitiateResponse {
    public static final int $stable = 8;
    private final String conversationId;
    private final String conversationSid;
    private final boolean exists;
    private final aib initiateScope;

    public InitiateResponse(boolean z, String str, String str2, aib aibVar) {
        str.getClass();
        str2.getClass();
        this.exists = z;
        this.conversationId = str;
        this.conversationSid = str2;
        this.initiateScope = aibVar;
    }

    public static /* synthetic */ InitiateResponse copy$default(InitiateResponse initiateResponse, boolean z, String str, String str2, aib aibVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = initiateResponse.exists;
        }
        if ((i & 2) != 0) {
            str = initiateResponse.conversationId;
        }
        if ((i & 4) != 0) {
            str2 = initiateResponse.conversationSid;
        }
        if ((i & 8) != 0) {
            aibVar = initiateResponse.initiateScope;
        }
        return initiateResponse.copy(z, str, str2, aibVar);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getExists() {
        return this.exists;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getConversationSid() {
        return this.conversationSid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final aib getInitiateScope() {
        return this.initiateScope;
    }

    public final InitiateResponse copy(boolean exists, String conversationId, String conversationSid, aib initiateScope) {
        conversationId.getClass();
        conversationSid.getClass();
        return new InitiateResponse(exists, conversationId, conversationSid, initiateScope);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitiateResponse)) {
            return false;
        }
        InitiateResponse initiateResponse = (InitiateResponse) other;
        return this.exists == initiateResponse.exists && wl7.b(this.conversationId, initiateResponse.conversationId) && wl7.b(this.conversationSid, initiateResponse.conversationSid) && wl7.b(this.initiateScope, initiateResponse.initiateScope);
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getConversationSid() {
        return this.conversationSid;
    }

    public final boolean getExists() {
        return this.exists;
    }

    public final aib getInitiateScope() {
        return this.initiateScope;
    }

    public int hashCode() {
        int iD = akb.d(akb.d(Boolean.hashCode(this.exists) * 31, 31, this.conversationId), 31, this.conversationSid);
        aib aibVar = this.initiateScope;
        return iD + (aibVar == null ? 0 : aibVar.hashCode());
    }

    public String toString() {
        return "InitiateResponse(exists=" + this.exists + ", conversationId=" + this.conversationId + ", conversationSid=" + this.conversationSid + ", initiateScope=" + this.initiateScope + ")";
    }

    public /* synthetic */ InitiateResponse(boolean z, String str, String str2, aib aibVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, str2, (i & 8) != 0 ? null : aibVar);
    }
}
