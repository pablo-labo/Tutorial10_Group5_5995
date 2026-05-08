package com.indeed.android.jsmappservices.components.hybridactionoverflow;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.u40;
import defpackage.wl7;
import defpackage.z3;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/indeed/android/jsmappservices/components/hybridactionoverflow/HybridActionOverflowArgs;", "Landroid/os/Parcelable;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HybridActionOverflowArgs implements Parcelable {
    public static final Parcelable.Creator<HybridActionOverflowArgs> CREATOR = new a();
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final Integer e;

    public static final class a implements Parcelable.Creator<HybridActionOverflowArgs> {
        @Override // android.os.Parcelable.Creator
        public final HybridActionOverflowArgs createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(HybridActionOverflowRow.CREATOR.createFromParcel(parcel));
            }
            return new HybridActionOverflowArgs(string, string2, string3, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final HybridActionOverflowArgs[] newArray(int i) {
            return new HybridActionOverflowArgs[i];
        }
    }

    public HybridActionOverflowArgs(String str, String str2, String str3, ArrayList arrayList, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HybridActionOverflowArgs)) {
            return false;
        }
        HybridActionOverflowArgs hybridActionOverflowArgs = (HybridActionOverflowArgs) obj;
        return wl7.b(this.a, hybridActionOverflowArgs.a) && wl7.b(this.b, hybridActionOverflowArgs.b) && wl7.b(this.c, hybridActionOverflowArgs.c) && this.d.equals(hybridActionOverflowArgs.d) && wl7.b(this.e, hybridActionOverflowArgs.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iD = z3.d(this.d, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        Integer num = this.e;
        return iD + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("HybridActionOverflowArgs(heading=", this.a, ", subheading=", this.b, ", subheadingIcon=");
        sbF.append(this.c);
        sbF.append(", rows=");
        sbF.append(this.d);
        sbF.append(", currentSelectedIndex=");
        sbF.append(this.e);
        sbF.append(")");
        return sbF.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        ArrayList arrayList = this.d;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((HybridActionOverflowRow) it.next()).writeToParcel(parcel, i);
        }
        Integer num = this.e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }
}
