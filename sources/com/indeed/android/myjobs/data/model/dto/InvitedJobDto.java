package com.indeed.android.myjobs.data.model.dto;

import defpackage.wl7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/indeed/android/myjobs/data/model/dto/InvitedJobDto;", "", "job", "Lcom/indeed/android/myjobs/data/model/dto/JobDetailsDto;", "invite", "Lcom/indeed/android/myjobs/data/model/dto/InviteDto;", "conversation", "Lcom/indeed/android/myjobs/data/model/dto/ConversationDto;", "<init>", "(Lcom/indeed/android/myjobs/data/model/dto/JobDetailsDto;Lcom/indeed/android/myjobs/data/model/dto/InviteDto;Lcom/indeed/android/myjobs/data/model/dto/ConversationDto;)V", "getJob", "()Lcom/indeed/android/myjobs/data/model/dto/JobDetailsDto;", "getInvite", "()Lcom/indeed/android/myjobs/data/model/dto/InviteDto;", "getConversation", "()Lcom/indeed/android/myjobs/data/model/dto/ConversationDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvitedJobDto {
    private final ConversationDto conversation;
    private final InviteDto invite;
    private final JobDetailsDto job;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public InvitedJobDto(JobDetailsDto jobDetailsDto, InviteDto inviteDto, ConversationDto conversationDto) {
        jobDetailsDto.getClass();
        inviteDto.getClass();
        this.job = jobDetailsDto;
        this.invite = inviteDto;
        this.conversation = conversationDto;
    }

    public static /* synthetic */ InvitedJobDto copy$default(InvitedJobDto invitedJobDto, JobDetailsDto jobDetailsDto, InviteDto inviteDto, ConversationDto conversationDto, int i, Object obj) {
        if ((i & 1) != 0) {
            jobDetailsDto = invitedJobDto.job;
        }
        if ((i & 2) != 0) {
            inviteDto = invitedJobDto.invite;
        }
        if ((i & 4) != 0) {
            conversationDto = invitedJobDto.conversation;
        }
        return invitedJobDto.copy(jobDetailsDto, inviteDto, conversationDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JobDetailsDto getJob() {
        return this.job;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final InviteDto getInvite() {
        return this.invite;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ConversationDto getConversation() {
        return this.conversation;
    }

    public final InvitedJobDto copy(JobDetailsDto job, InviteDto invite, ConversationDto conversation) {
        job.getClass();
        invite.getClass();
        return new InvitedJobDto(job, invite, conversation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvitedJobDto)) {
            return false;
        }
        InvitedJobDto invitedJobDto = (InvitedJobDto) other;
        return wl7.b(this.job, invitedJobDto.job) && wl7.b(this.invite, invitedJobDto.invite) && wl7.b(this.conversation, invitedJobDto.conversation);
    }

    public final ConversationDto getConversation() {
        return this.conversation;
    }

    public final InviteDto getInvite() {
        return this.invite;
    }

    public final JobDetailsDto getJob() {
        return this.job;
    }

    public int hashCode() {
        int iHashCode = (this.invite.hashCode() + (this.job.hashCode() * 31)) * 31;
        ConversationDto conversationDto = this.conversation;
        return iHashCode + (conversationDto == null ? 0 : conversationDto.hashCode());
    }

    public String toString() {
        return "InvitedJobDto(job=" + this.job + ", invite=" + this.invite + ", conversation=" + this.conversation + ")";
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/indeed/android/myjobs/data/model/dto/InvitedJobDto$Companion;", "", "<init>", "()V", "init", "Lcom/indeed/android/myjobs/data/model/dto/InvitedJobDto;", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InvitedJobDto init() {
            return new InvitedJobDto(JobDetailsDto.INSTANCE.init(), InviteDto.INSTANCE.init(), null);
        }

        private Companion() {
        }
    }
}
