package com.indeed.android.tare.management;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.u40;
import defpackage.wl7;
import defpackage.z3;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/indeed/android/tare/management/ViewJobFeed;", "Lcom/indeed/android/tare/management/JSTCacheValue;", "Landroid/os/Parcelable;", "tare_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ViewJobFeed implements JSTCacheValue, Parcelable {
    public static final Parcelable.Creator<ViewJobFeed> CREATOR = new a();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public static final class a implements Parcelable.Creator<ViewJobFeed> {
        @Override // android.os.Parcelable.Creator
        public final ViewJobFeed createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ViewJobFeed(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ViewJobFeed[] newArray(int i) {
            return new ViewJobFeed[i];
        }
    }

    public ViewJobFeed(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public static ViewJobFeed a(ViewJobFeed viewJobFeed, String str, String str2, String str3, int i) {
        String str4 = viewJobFeed.a;
        if ((i & 2) != 0) {
            str = viewJobFeed.b;
        }
        if ((i & 4) != 0) {
            str2 = viewJobFeed.c;
        }
        if ((i & 8) != 0) {
            str3 = viewJobFeed.d;
        }
        return new ViewJobFeed(str4, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewJobFeed)) {
            return false;
        }
        ViewJobFeed viewJobFeed = (ViewJobFeed) obj;
        return wl7.b(this.a, viewJobFeed.a) && wl7.b(this.b, viewJobFeed.b) && wl7.b(this.c, viewJobFeed.c) && wl7.b(this.d, viewJobFeed.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return z3.n(u40.f("ViewJobFeed(homepageTk=", this.a, ", jobFeedData=", this.b, ", lastViewedJobSection="), this.c, ", lastViewedJobKey=", this.d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public ViewJobFeed() {
        this(null, null, null, null);
    }
}
