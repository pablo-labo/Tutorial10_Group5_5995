package androidx.test.internal.util;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class ParcelableIBinder implements Parcelable {
    public static final Parcelable.Creator<ParcelableIBinder> CREATOR = new Parcelable.Creator<ParcelableIBinder>() { // from class: androidx.test.internal.util.ParcelableIBinder.1
        @Override // android.os.Parcelable.Creator
        public final ParcelableIBinder createFromParcel(Parcel parcel) {
            return new ParcelableIBinder(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableIBinder[] newArray(int i) {
            return new ParcelableIBinder[i];
        }
    };
    public final IBinder a;

    public ParcelableIBinder(Parcel parcel) {
        this.a = parcel.readStrongBinder();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.a);
    }
}
