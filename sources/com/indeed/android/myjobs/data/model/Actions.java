package com.indeed.android.myjobs.data.model;

import defpackage.l6;
import defpackage.u40;
import defpackage.wl7;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/indeed/android/myjobs/data/model/Actions;", "", "linkToCancelOrReschedule", "", "linkToReschedule", "linkToCancel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLinkToCancelOrReschedule", "()Ljava/lang/String;", "getLinkToReschedule", "getLinkToCancel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Actions {
    public static final int $stable = 0;
    private final String linkToCancel;
    private final String linkToCancelOrReschedule;
    private final String linkToReschedule;

    public Actions(String str, String str2, String str3) {
        this.linkToCancelOrReschedule = str;
        this.linkToReschedule = str2;
        this.linkToCancel = str3;
    }

    public static /* synthetic */ Actions copy$default(Actions actions, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actions.linkToCancelOrReschedule;
        }
        if ((i & 2) != 0) {
            str2 = actions.linkToReschedule;
        }
        if ((i & 4) != 0) {
            str3 = actions.linkToCancel;
        }
        return actions.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLinkToCancelOrReschedule() {
        return this.linkToCancelOrReschedule;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLinkToReschedule() {
        return this.linkToReschedule;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLinkToCancel() {
        return this.linkToCancel;
    }

    public final Actions copy(String linkToCancelOrReschedule, String linkToReschedule, String linkToCancel) {
        return new Actions(linkToCancelOrReschedule, linkToReschedule, linkToCancel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Actions)) {
            return false;
        }
        Actions actions = (Actions) other;
        return wl7.b(this.linkToCancelOrReschedule, actions.linkToCancelOrReschedule) && wl7.b(this.linkToReschedule, actions.linkToReschedule) && wl7.b(this.linkToCancel, actions.linkToCancel);
    }

    public final String getLinkToCancel() {
        return this.linkToCancel;
    }

    public final String getLinkToCancelOrReschedule() {
        return this.linkToCancelOrReschedule;
    }

    public final String getLinkToReschedule() {
        return this.linkToReschedule;
    }

    public int hashCode() {
        String str = this.linkToCancelOrReschedule;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.linkToReschedule;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.linkToCancel;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.linkToCancelOrReschedule;
        String str2 = this.linkToReschedule;
        return l6.i(u40.f("Actions(linkToCancelOrReschedule=", str, ", linkToReschedule=", str2, ", linkToCancel="), this.linkToCancel, ")");
    }
}
