package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ja1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ObservableDouble extends ja1 implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableDouble> CREATOR = new a();
    static final long serialVersionUID = 1;
    private double mValue;

    public class a implements Parcelable.Creator<ObservableDouble> {
        @Override // android.os.Parcelable.Creator
        public final ObservableDouble createFromParcel(Parcel parcel) {
            return new ObservableDouble(parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableDouble[] newArray(int i) {
            return new ObservableDouble[i];
        }
    }

    public ObservableDouble(double d) {
        super(13);
        this.mValue = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.mValue);
    }

    public ObservableDouble() {
        super(13);
    }
}
