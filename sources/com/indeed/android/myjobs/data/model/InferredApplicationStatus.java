package com.indeed.android.myjobs.data.model;

import defpackage.g7;
import defpackage.ia;
import defpackage.wl7;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003JP\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/indeed/android/myjobs/data/model/InferredApplicationStatus;", "", "jobKey", "", "employerStartedReview", "", "employerReplyLikelihood", "replyLikelihoodAdjusted", "applicationInsights", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getJobKey", "()Ljava/lang/String;", "getEmployerStartedReview", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEmployerReplyLikelihood", "getReplyLikelihoodAdjusted", "getApplicationInsights", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/indeed/android/myjobs/data/model/InferredApplicationStatus;", "equals", "other", "hashCode", "", "toString", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InferredApplicationStatus {
    public static final int $stable = 8;
    private final List<String> applicationInsights;
    private final String employerReplyLikelihood;
    private final Boolean employerStartedReview;
    private final String jobKey;
    private final String replyLikelihoodAdjusted;

    public /* synthetic */ InferredApplicationStatus(String str, Boolean bool, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bool, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InferredApplicationStatus copy$default(InferredApplicationStatus inferredApplicationStatus, String str, Boolean bool, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inferredApplicationStatus.jobKey;
        }
        if ((i & 2) != 0) {
            bool = inferredApplicationStatus.employerStartedReview;
        }
        if ((i & 4) != 0) {
            str2 = inferredApplicationStatus.employerReplyLikelihood;
        }
        if ((i & 8) != 0) {
            str3 = inferredApplicationStatus.replyLikelihoodAdjusted;
        }
        if ((i & 16) != 0) {
            list = inferredApplicationStatus.applicationInsights;
        }
        List list2 = list;
        String str4 = str2;
        return inferredApplicationStatus.copy(str, bool, str4, str3, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getJobKey() {
        return this.jobKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getEmployerStartedReview() {
        return this.employerStartedReview;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEmployerReplyLikelihood() {
        return this.employerReplyLikelihood;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReplyLikelihoodAdjusted() {
        return this.replyLikelihoodAdjusted;
    }

    public final List<String> component5() {
        return this.applicationInsights;
    }

    public final InferredApplicationStatus copy(String jobKey, Boolean employerStartedReview, String employerReplyLikelihood, String replyLikelihoodAdjusted, List<String> applicationInsights) {
        return new InferredApplicationStatus(jobKey, employerStartedReview, employerReplyLikelihood, replyLikelihoodAdjusted, applicationInsights);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InferredApplicationStatus)) {
            return false;
        }
        InferredApplicationStatus inferredApplicationStatus = (InferredApplicationStatus) other;
        return wl7.b(this.jobKey, inferredApplicationStatus.jobKey) && wl7.b(this.employerStartedReview, inferredApplicationStatus.employerStartedReview) && wl7.b(this.employerReplyLikelihood, inferredApplicationStatus.employerReplyLikelihood) && wl7.b(this.replyLikelihoodAdjusted, inferredApplicationStatus.replyLikelihoodAdjusted) && wl7.b(this.applicationInsights, inferredApplicationStatus.applicationInsights);
    }

    public final List<String> getApplicationInsights() {
        return this.applicationInsights;
    }

    public final String getEmployerReplyLikelihood() {
        return this.employerReplyLikelihood;
    }

    public final Boolean getEmployerStartedReview() {
        return this.employerStartedReview;
    }

    public final String getJobKey() {
        return this.jobKey;
    }

    public final String getReplyLikelihoodAdjusted() {
        return this.replyLikelihoodAdjusted;
    }

    public int hashCode() {
        String str = this.jobKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.employerStartedReview;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.employerReplyLikelihood;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.replyLikelihoodAdjusted;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.applicationInsights;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.jobKey;
        Boolean bool = this.employerStartedReview;
        String str2 = this.employerReplyLikelihood;
        String str3 = this.replyLikelihoodAdjusted;
        List<String> list = this.applicationInsights;
        StringBuilder sb = new StringBuilder("InferredApplicationStatus(jobKey=");
        sb.append(str);
        sb.append(", employerStartedReview=");
        sb.append(bool);
        sb.append(", employerReplyLikelihood=");
        ia.r(sb, str2, ", replyLikelihoodAdjusted=", str3, ", applicationInsights=");
        return g7.i(sb, list, ")");
    }

    public InferredApplicationStatus(String str, Boolean bool, String str2, String str3, List<String> list) {
        this.jobKey = str;
        this.employerStartedReview = bool;
        this.employerReplyLikelihood = str2;
        this.replyLikelihoodAdjusted = str3;
        this.applicationInsights = list;
    }
}
