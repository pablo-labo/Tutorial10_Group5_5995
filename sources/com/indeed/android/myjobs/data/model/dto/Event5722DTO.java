package com.indeed.android.myjobs.data.model.dto;

import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J>\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0002\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0005\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/indeed/android/myjobs/data/model/dto/Event5722DTO;", "", "isApplicationImpacted", "", "isApplicationViewedByEmployer", "isJobHosted", "thirdPartyApplyLink", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getThirdPartyApplyLink", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/indeed/android/myjobs/data/model/dto/Event5722DTO;", "equals", "other", "hashCode", "", "toString", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Event5722DTO {
    public static final int $stable = 0;
    private final Boolean isApplicationImpacted;
    private final Boolean isApplicationViewedByEmployer;
    private final Boolean isJobHosted;
    private final String thirdPartyApplyLink;

    public Event5722DTO(Boolean bool, Boolean bool2, Boolean bool3, String str) {
        this.isApplicationImpacted = bool;
        this.isApplicationViewedByEmployer = bool2;
        this.isJobHosted = bool3;
        this.thirdPartyApplyLink = str;
    }

    public static /* synthetic */ Event5722DTO copy$default(Event5722DTO event5722DTO, Boolean bool, Boolean bool2, Boolean bool3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = event5722DTO.isApplicationImpacted;
        }
        if ((i & 2) != 0) {
            bool2 = event5722DTO.isApplicationViewedByEmployer;
        }
        if ((i & 4) != 0) {
            bool3 = event5722DTO.isJobHosted;
        }
        if ((i & 8) != 0) {
            str = event5722DTO.thirdPartyApplyLink;
        }
        return event5722DTO.copy(bool, bool2, bool3, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsApplicationImpacted() {
        return this.isApplicationImpacted;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsApplicationViewedByEmployer() {
        return this.isApplicationViewedByEmployer;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsJobHosted() {
        return this.isJobHosted;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getThirdPartyApplyLink() {
        return this.thirdPartyApplyLink;
    }

    public final Event5722DTO copy(Boolean isApplicationImpacted, Boolean isApplicationViewedByEmployer, Boolean isJobHosted, String thirdPartyApplyLink) {
        return new Event5722DTO(isApplicationImpacted, isApplicationViewedByEmployer, isJobHosted, thirdPartyApplyLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Event5722DTO)) {
            return false;
        }
        Event5722DTO event5722DTO = (Event5722DTO) other;
        return wl7.b(this.isApplicationImpacted, event5722DTO.isApplicationImpacted) && wl7.b(this.isApplicationViewedByEmployer, event5722DTO.isApplicationViewedByEmployer) && wl7.b(this.isJobHosted, event5722DTO.isJobHosted) && wl7.b(this.thirdPartyApplyLink, event5722DTO.thirdPartyApplyLink);
    }

    public final String getThirdPartyApplyLink() {
        return this.thirdPartyApplyLink;
    }

    public int hashCode() {
        Boolean bool = this.isApplicationImpacted;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isApplicationViewedByEmployer;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isJobHosted;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.thirdPartyApplyLink;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final Boolean isApplicationImpacted() {
        return this.isApplicationImpacted;
    }

    public final Boolean isApplicationViewedByEmployer() {
        return this.isApplicationViewedByEmployer;
    }

    public final Boolean isJobHosted() {
        return this.isJobHosted;
    }

    public String toString() {
        return "Event5722DTO(isApplicationImpacted=" + this.isApplicationImpacted + ", isApplicationViewedByEmployer=" + this.isApplicationViewedByEmployer + ", isJobHosted=" + this.isJobHosted + ", thirdPartyApplyLink=" + this.thirdPartyApplyLink + ")";
    }
}
