package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ja1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ObservableInt extends ja1 implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableInt> CREATOR = new a();
    static final long serialVersionUID = 1;
    private int mValue;

    public class a implements Parcelable.Creator<ObservableInt> {
        @Override // android.os.Parcelable.Creator
        public final ObservableInt createFromParcel(Parcel parcel) {
            return new ObservableInt(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableInt[] newArray(int i) {
            return new ObservableInt[i];
        }
    }

    public ObservableInt(int i) {
        super(13);
        this.mValue = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }

    public ObservableInt() {
        super(13);
    }
}
