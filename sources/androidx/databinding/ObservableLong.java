package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ja1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ObservableLong extends ja1 implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableLong> CREATOR = new a();
    static final long serialVersionUID = 1;
    private long mValue;

    public class a implements Parcelable.Creator<ObservableLong> {
        @Override // android.os.Parcelable.Creator
        public final ObservableLong createFromParcel(Parcel parcel) {
            return new ObservableLong(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableLong[] newArray(int i) {
            return new ObservableLong[i];
        }
    }

    public ObservableLong(long j) {
        super(13);
        this.mValue = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mValue);
    }

    public ObservableLong() {
        super(13);
    }
}
