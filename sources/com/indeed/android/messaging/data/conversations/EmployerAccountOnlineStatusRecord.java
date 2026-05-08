package com.indeed.android.messaging.data.conversations;

import com.indeed.android.messaging.data.conversations.ConversationRecord;
import defpackage.ia;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/indeed/android/messaging/data/conversations/EmployerAccountOnlineStatusRecord;", "", "isOnline", "", "timeStampUpdateInMills", "", "participant", "Lcom/indeed/android/messaging/data/conversations/ConversationRecord$Participant;", "<init>", "(ZJLcom/indeed/android/messaging/data/conversations/ConversationRecord$Participant;)V", "()Z", "setOnline", "(Z)V", "getTimeStampUpdateInMills", "()J", "setTimeStampUpdateInMills", "(J)V", "getParticipant", "()Lcom/indeed/android/messaging/data/conversations/ConversationRecord$Participant;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EmployerAccountOnlineStatusRecord {
    public static final int $stable = 8;
    private boolean isOnline;
    private final ConversationRecord.Participant participant;
    private long timeStampUpdateInMills;

    public EmployerAccountOnlineStatusRecord(boolean z, long j, ConversationRecord.Participant participant) {
        participant.getClass();
        this.isOnline = z;
        this.timeStampUpdateInMills = j;
        this.participant = participant;
    }

    public static /* synthetic */ EmployerAccountOnlineStatusRecord copy$default(EmployerAccountOnlineStatusRecord employerAccountOnlineStatusRecord, boolean z, long j, ConversationRecord.Participant participant, int i, Object obj) {
        if ((i & 1) != 0) {
            z = employerAccountOnlineStatusRecord.isOnline;
        }
        if ((i & 2) != 0) {
            j = employerAccountOnlineStatusRecord.timeStampUpdateInMills;
        }
        if ((i & 4) != 0) {
            participant = employerAccountOnlineStatusRecord.participant;
        }
        return employerAccountOnlineStatusRecord.copy(z, j, participant);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsOnline() {
        return this.isOnline;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimeStampUpdateInMills() {
        return this.timeStampUpdateInMills;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ConversationRecord.Participant getParticipant() {
        return this.participant;
    }

    public final EmployerAccountOnlineStatusRecord copy(boolean isOnline, long timeStampUpdateInMills, ConversationRecord.Participant participant) {
        participant.getClass();
        return new EmployerAccountOnlineStatusRecord(isOnline, timeStampUpdateInMills, participant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmployerAccountOnlineStatusRecord)) {
            return false;
        }
        EmployerAccountOnlineStatusRecord employerAccountOnlineStatusRecord = (EmployerAccountOnlineStatusRecord) other;
        return this.isOnline == employerAccountOnlineStatusRecord.isOnline && this.timeStampUpdateInMills == employerAccountOnlineStatusRecord.timeStampUpdateInMills && wl7.b(this.participant, employerAccountOnlineStatusRecord.participant);
    }

    public final ConversationRecord.Participant getParticipant() {
        return this.participant;
    }

    public final long getTimeStampUpdateInMills() {
        return this.timeStampUpdateInMills;
    }

    public int hashCode() {
        return this.participant.hashCode() + ia.d(Boolean.hashCode(this.isOnline) * 31, 31, this.timeStampUpdateInMills);
    }

    public final boolean isOnline() {
        return this.isOnline;
    }

    public final void setOnline(boolean z) {
        this.isOnline = z;
    }

    public final void setTimeStampUpdateInMills(long j) {
        this.timeStampUpdateInMills = j;
    }

    public String toString() {
        return "EmployerAccountOnlineStatusRecord(isOnline=" + this.isOnline + ", timeStampUpdateInMills=" + this.timeStampUpdateInMills + ", participant=" + this.participant + ")";
    }
}
