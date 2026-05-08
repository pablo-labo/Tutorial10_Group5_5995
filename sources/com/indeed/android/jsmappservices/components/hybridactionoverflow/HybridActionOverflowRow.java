package com.indeed.android.jsmappservices.components.hybridactionoverflow;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.l6;
import defpackage.u40;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/indeed/android/jsmappservices/components/hybridactionoverflow/HybridActionOverflowRow;", "Landroid/os/Parcelable;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HybridActionOverflowRow implements Parcelable {
    public static final Parcelable.Creator<HybridActionOverflowRow> CREATOR = new a();
    public final String a;
    public final String b;
    public final String c;

    public static final class a implements Parcelable.Creator<HybridActionOverflowRow> {
        @Override // android.os.Parcelable.Creator
        public final HybridActionOverflowRow createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new HybridActionOverflowRow(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final HybridActionOverflowRow[] newArray(int i) {
            return new HybridActionOverflowRow[i];
        }
    }

    public HybridActionOverflowRow(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HybridActionOverflowRow)) {
            return false;
        }
        HybridActionOverflowRow hybridActionOverflowRow = (HybridActionOverflowRow) obj;
        return wl7.b(this.a, hybridActionOverflowRow.a) && wl7.b(this.b, hybridActionOverflowRow.b) && wl7.b(this.c, hybridActionOverflowRow.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return l6.i(u40.f("HybridActionOverflowRow(icon=", this.a, ", ctaText=", this.b, ", subText="), this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
