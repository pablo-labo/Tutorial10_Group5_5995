package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ja1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ObservableFloat extends ja1 implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableFloat> CREATOR = new a();
    static final long serialVersionUID = 1;
    private float mValue;

    public class a implements Parcelable.Creator<ObservableFloat> {
        @Override // android.os.Parcelable.Creator
        public final ObservableFloat createFromParcel(Parcel parcel) {
            return new ObservableFloat(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableFloat[] newArray(int i) {
            return new ObservableFloat[i];
        }
    }

    public ObservableFloat(float f) {
        super(13);
        this.mValue = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.mValue);
    }

    public ObservableFloat() {
        super(13);
    }
}
