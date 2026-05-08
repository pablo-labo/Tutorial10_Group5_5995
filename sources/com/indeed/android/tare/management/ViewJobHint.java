package com.indeed.android.tare.management;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/indeed/android/tare/management/ViewJobHint;", "Lcom/indeed/android/tare/management/JSTCacheValue;", "Landroid/os/Parcelable;", "tare_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ViewJobHint implements JSTCacheValue, Parcelable {
    public static final Parcelable.Creator<ViewJobHint> CREATOR = new a();
    public final Boolean a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final Boolean e;
    public final String f;

    public static final class a implements Parcelable.Creator<ViewJobHint> {
        @Override // android.os.Parcelable.Creator
        public final ViewJobHint createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            parcel.getClass();
            Boolean boolValueOf3 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ViewJobHint(boolValueOf, string, boolValueOf2, string2, boolValueOf3, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ViewJobHint[] newArray(int i) {
            return new ViewJobHint[i];
        }
    }

    public ViewJobHint(Boolean bool, String str, Boolean bool2, String str2, Boolean bool3, String str3) {
        this.a = bool;
        this.b = str;
        this.c = bool2;
        this.d = str2;
        this.e = bool3;
        this.f = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getE() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewJobHint)) {
            return false;
        }
        ViewJobHint viewJobHint = (ViewJobHint) obj;
        return wl7.b(this.a, viewJobHint.a) && wl7.b(this.b, viewJobHint.b) && wl7.b(this.c, viewJobHint.c) && wl7.b(this.d, viewJobHint.d) && wl7.b(this.e, viewJobHint.e) && wl7.b(this.f, viewJobHint.f);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getA() {
        return this.a;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.c;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool3 = this.e;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "ViewJobHint(isSaved=" + this.a + ", title=" + this.b + ", isFromAce=" + this.c + ", jobResultTrackingKey=" + this.d + ", isDisliked=" + this.e + ", matchFactor=" + this.f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Boolean bool = this.a;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.b);
        Boolean bool2 = this.c;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.d);
        Boolean bool3 = this.e;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.f);
    }

    public ViewJobHint() {
        this(null, null, null, null, null, null);
    }
}
