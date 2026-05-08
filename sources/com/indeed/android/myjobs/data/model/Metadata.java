package com.indeed.android.myjobs.data.model;

import defpackage.l6;
import defpackage.u40;
import defpackage.wl7;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/indeed/android/myjobs/data/model/Metadata;", "", "phoneNumber", "", "address", "linkToInterview", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPhoneNumber", "()Ljava/lang/String;", "getAddress", "getLinkToInterview", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Metadata {
    public static final int $stable = 0;
    private final String address;
    private final String linkToInterview;
    private final String phoneNumber;

    public Metadata(String str, String str2, String str3) {
        this.phoneNumber = str;
        this.address = str2;
        this.linkToInterview = str3;
    }

    public static /* synthetic */ Metadata copy$default(Metadata metadata, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = metadata.phoneNumber;
        }
        if ((i & 2) != 0) {
            str2 = metadata.address;
        }
        if ((i & 4) != 0) {
            str3 = metadata.linkToInterview;
        }
        return metadata.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLinkToInterview() {
        return this.linkToInterview;
    }

    public final Metadata copy(String phoneNumber, String address, String linkToInterview) {
        return new Metadata(phoneNumber, address, linkToInterview);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Metadata)) {
            return false;
        }
        Metadata metadata = (Metadata) other;
        return wl7.b(this.phoneNumber, metadata.phoneNumber) && wl7.b(this.address, metadata.address) && wl7.b(this.linkToInterview, metadata.linkToInterview);
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getLinkToInterview() {
        return this.linkToInterview;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        String str = this.phoneNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.address;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.linkToInterview;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.phoneNumber;
        String str2 = this.address;
        return l6.i(u40.f("Metadata(phoneNumber=", str, ", address=", str2, ", linkToInterview="), this.linkToInterview, ")");
    }
}
