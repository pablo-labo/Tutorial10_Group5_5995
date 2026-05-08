package com.indeed.android.myjobs.data.model;

import defpackage.wl7;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/indeed/android/myjobs/data/model/EVNT5722Data;", "", "applicationImpacted", "", "applicationViewedByEmployer", "jobHosted", "thirdPartyApplyLink", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getApplicationImpacted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getApplicationViewedByEmployer", "getJobHosted", "getThirdPartyApplyLink", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/indeed/android/myjobs/data/model/EVNT5722Data;", "equals", "other", "hashCode", "", "toString", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EVNT5722Data {
    public static final int $stable = 0;
    private final Boolean applicationImpacted;
    private final Boolean applicationViewedByEmployer;
    private final Boolean jobHosted;
    private final String thirdPartyApplyLink;

    public EVNT5722Data(Boolean bool, Boolean bool2, Boolean bool3, String str) {
        this.applicationImpacted = bool;
        this.applicationViewedByEmployer = bool2;
        this.jobHosted = bool3;
        this.thirdPartyApplyLink = str;
    }

    public static /* synthetic */ EVNT5722Data copy$default(EVNT5722Data eVNT5722Data, Boolean bool, Boolean bool2, Boolean bool3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = eVNT5722Data.applicationImpacted;
        }
        if ((i & 2) != 0) {
            bool2 = eVNT5722Data.applicationViewedByEmployer;
        }
        if ((i & 4) != 0) {
            bool3 = eVNT5722Data.jobHosted;
        }
        if ((i & 8) != 0) {
            str = eVNT5722Data.thirdPartyApplyLink;
        }
        return eVNT5722Data.copy(bool, bool2, bool3, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getApplicationImpacted() {
        return this.applicationImpacted;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getApplicationViewedByEmployer() {
        return this.applicationViewedByEmployer;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getJobHosted() {
        return this.jobHosted;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getThirdPartyApplyLink() {
        return this.thirdPartyApplyLink;
    }

    public final EVNT5722Data copy(Boolean applicationImpacted, Boolean applicationViewedByEmployer, Boolean jobHosted, String thirdPartyApplyLink) {
        return new EVNT5722Data(applicationImpacted, applicationViewedByEmployer, jobHosted, thirdPartyApplyLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EVNT5722Data)) {
            return false;
        }
        EVNT5722Data eVNT5722Data = (EVNT5722Data) other;
        return wl7.b(this.applicationImpacted, eVNT5722Data.applicationImpacted) && wl7.b(this.applicationViewedByEmployer, eVNT5722Data.applicationViewedByEmployer) && wl7.b(this.jobHosted, eVNT5722Data.jobHosted) && wl7.b(this.thirdPartyApplyLink, eVNT5722Data.thirdPartyApplyLink);
    }

    public final Boolean getApplicationImpacted() {
        return this.applicationImpacted;
    }

    public final Boolean getApplicationViewedByEmployer() {
        return this.applicationViewedByEmployer;
    }

    public final Boolean getJobHosted() {
        return this.jobHosted;
    }

    public final String getThirdPartyApplyLink() {
        return this.thirdPartyApplyLink;
    }

    public int hashCode() {
        Boolean bool = this.applicationImpacted;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.applicationViewedByEmployer;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.jobHosted;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.thirdPartyApplyLink;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "EVNT5722Data(applicationImpacted=" + this.applicationImpacted + ", applicationViewedByEmployer=" + this.applicationViewedByEmployer + ", jobHosted=" + this.jobHosted + ", thirdPartyApplyLink=" + this.thirdPartyApplyLink + ")";
    }
}
