package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ja1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ObservableByte extends ja1 implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableByte> CREATOR = new a();
    static final long serialVersionUID = 1;
    private byte mValue;

    public class a implements Parcelable.Creator<ObservableByte> {
        @Override // android.os.Parcelable.Creator
        public final ObservableByte createFromParcel(Parcel parcel) {
            return new ObservableByte(parcel.readByte());
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableByte[] newArray(int i) {
            return new ObservableByte[i];
        }
    }

    public ObservableByte(byte b) {
        super(13);
        this.mValue = b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.mValue);
    }

    public ObservableByte() {
        super(13);
    }
}
