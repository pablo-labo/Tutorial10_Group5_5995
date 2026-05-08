package com.indeed.android.myjobs.data.model;

import defpackage.g7;
import defpackage.wl7;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/indeed/android/myjobs/data/model/InterviewBody;", "", "interviews", "", "Lcom/indeed/android/myjobs/data/model/Interview;", "<init>", "(Ljava/util/List;)V", "getInterviews", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InterviewBody {
    public static final int $stable = 8;
    private final List<Interview> interviews;

    public InterviewBody(List<Interview> list) {
        this.interviews = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterviewBody copy$default(InterviewBody interviewBody, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = interviewBody.interviews;
        }
        return interviewBody.copy(list);
    }

    public final List<Interview> component1() {
        return this.interviews;
    }

    public final InterviewBody copy(List<Interview> interviews) {
        return new InterviewBody(interviews);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InterviewBody) && wl7.b(this.interviews, ((InterviewBody) other).interviews);
    }

    public final List<Interview> getInterviews() {
        return this.interviews;
    }

    public int hashCode() {
        List<Interview> list = this.interviews;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return g7.h("InterviewBody(interviews=", ")", this.interviews);
    }
}
