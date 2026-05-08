package com.indeed.android.myjobs.data.model.dto;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.g7;
import defpackage.u40;
import defpackage.wl7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00012Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J~\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00063"}, d2 = {"Lcom/indeed/android/myjobs/data/model/dto/InviteDto;", "", "id", "", "status", "type", "fullApplyRequested", "", "canTalkToEmployer", "sentAt", "recipient", "Lcom/indeed/android/myjobs/data/model/dto/RecipientDto;", "sender", "Lcom/indeed/android/myjobs/data/model/dto/SenderDto;", "ctaButtons", "", "Lcom/indeed/android/myjobs/data/model/dto/CtaButtonDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/indeed/android/myjobs/data/model/dto/RecipientDto;Lcom/indeed/android/myjobs/data/model/dto/SenderDto;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getStatus", "getType", "getFullApplyRequested", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCanTalkToEmployer", "getSentAt", "getRecipient", "()Lcom/indeed/android/myjobs/data/model/dto/RecipientDto;", "getSender", "()Lcom/indeed/android/myjobs/data/model/dto/SenderDto;", "getCtaButtons", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/indeed/android/myjobs/data/model/dto/RecipientDto;Lcom/indeed/android/myjobs/data/model/dto/SenderDto;Ljava/util/List;)Lcom/indeed/android/myjobs/data/model/dto/InviteDto;", "equals", "other", "hashCode", "", "toString", "Companion", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InviteDto {
    private final Boolean canTalkToEmployer;
    private final List<CtaButtonDto> ctaButtons;
    private final Boolean fullApplyRequested;
    private final String id;
    private final RecipientDto recipient;
    private final SenderDto sender;
    private final String sentAt;
    private final String status;
    private final String type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public InviteDto(String str, String str2, String str3, Boolean bool, Boolean bool2, String str4, RecipientDto recipientDto, SenderDto senderDto, List<CtaButtonDto> list) {
        str.getClass();
        this.id = str;
        this.status = str2;
        this.type = str3;
        this.fullApplyRequested = bool;
        this.canTalkToEmployer = bool2;
        this.sentAt = str4;
        this.recipient = recipientDto;
        this.sender = senderDto;
        this.ctaButtons = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InviteDto copy$default(InviteDto inviteDto, String str, String str2, String str3, Boolean bool, Boolean bool2, String str4, RecipientDto recipientDto, SenderDto senderDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inviteDto.id;
        }
        if ((i & 2) != 0) {
            str2 = inviteDto.status;
        }
        if ((i & 4) != 0) {
            str3 = inviteDto.type;
        }
        if ((i & 8) != 0) {
            bool = inviteDto.fullApplyRequested;
        }
        if ((i & 16) != 0) {
            bool2 = inviteDto.canTalkToEmployer;
        }
        if ((i & 32) != 0) {
            str4 = inviteDto.sentAt;
        }
        if ((i & 64) != 0) {
            recipientDto = inviteDto.recipient;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            senderDto = inviteDto.sender;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            list = inviteDto.ctaButtons;
        }
        SenderDto senderDto2 = senderDto;
        List list2 = list;
        String str5 = str4;
        RecipientDto recipientDto2 = recipientDto;
        Boolean bool3 = bool2;
        String str6 = str3;
        return inviteDto.copy(str, str2, str6, bool, bool3, str5, recipientDto2, senderDto2, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getFullApplyRequested() {
        return this.fullApplyRequested;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getCanTalkToEmployer() {
        return this.canTalkToEmployer;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSentAt() {
        return this.sentAt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final RecipientDto getRecipient() {
        return this.recipient;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final SenderDto getSender() {
        return this.sender;
    }

    public final List<CtaButtonDto> component9() {
        return this.ctaButtons;
    }

    public final InviteDto copy(String id, String status, String type, Boolean fullApplyRequested, Boolean canTalkToEmployer, String sentAt, RecipientDto recipient, SenderDto sender, List<CtaButtonDto> ctaButtons) {
        id.getClass();
        return new InviteDto(id, status, type, fullApplyRequested, canTalkToEmployer, sentAt, recipient, sender, ctaButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InviteDto)) {
            return false;
        }
        InviteDto inviteDto = (InviteDto) other;
        return wl7.b(this.id, inviteDto.id) && wl7.b(this.status, inviteDto.status) && wl7.b(this.type, inviteDto.type) && wl7.b(this.fullApplyRequested, inviteDto.fullApplyRequested) && wl7.b(this.canTalkToEmployer, inviteDto.canTalkToEmployer) && wl7.b(this.sentAt, inviteDto.sentAt) && wl7.b(this.recipient, inviteDto.recipient) && wl7.b(this.sender, inviteDto.sender) && wl7.b(this.ctaButtons, inviteDto.ctaButtons);
    }

    public final Boolean getCanTalkToEmployer() {
        return this.canTalkToEmployer;
    }

    public final List<CtaButtonDto> getCtaButtons() {
        return this.ctaButtons;
    }

    public final Boolean getFullApplyRequested() {
        return this.fullApplyRequested;
    }

    public final String getId() {
        return this.id;
    }

    public final RecipientDto getRecipient() {
        return this.recipient;
    }

    public final SenderDto getSender() {
        return this.sender;
    }

    public final String getSentAt() {
        return this.sentAt;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.status;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.fullApplyRequested;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canTalkToEmployer;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.sentAt;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        RecipientDto recipientDto = this.recipient;
        int iHashCode7 = (iHashCode6 + (recipientDto == null ? 0 : recipientDto.hashCode())) * 31;
        SenderDto senderDto = this.sender;
        int iHashCode8 = (iHashCode7 + (senderDto == null ? 0 : senderDto.hashCode())) * 31;
        List<CtaButtonDto> list = this.ctaButtons;
        return iHashCode8 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.status;
        String str3 = this.type;
        Boolean bool = this.fullApplyRequested;
        Boolean bool2 = this.canTalkToEmployer;
        String str4 = this.sentAt;
        RecipientDto recipientDto = this.recipient;
        SenderDto senderDto = this.sender;
        List<CtaButtonDto> list = this.ctaButtons;
        StringBuilder sbF = u40.f("InviteDto(id=", str, ", status=", str2, ", type=");
        sbF.append(str3);
        sbF.append(", fullApplyRequested=");
        sbF.append(bool);
        sbF.append(", canTalkToEmployer=");
        sbF.append(bool2);
        sbF.append(", sentAt=");
        sbF.append(str4);
        sbF.append(", recipient=");
        sbF.append(recipientDto);
        sbF.append(", sender=");
        sbF.append(senderDto);
        sbF.append(", ctaButtons=");
        return g7.i(sbF, list, ")");
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/indeed/android/myjobs/data/model/dto/InviteDto$Companion;", "", "<init>", "()V", "init", "Lcom/indeed/android/myjobs/data/model/dto/InviteDto;", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InviteDto init() {
            return new InviteDto("", null, null, null, null, null, null, null, null);
        }

        private Companion() {
        }
    }
}
