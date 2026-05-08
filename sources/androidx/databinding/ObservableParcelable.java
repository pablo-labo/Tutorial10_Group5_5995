package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.yna;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ObservableParcelable<T extends Parcelable> extends yna<T> implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableParcelable> CREATOR = new a();
    static final long serialVersionUID = 1;

    public class a implements Parcelable.Creator<ObservableParcelable> {
        @Override // android.os.Parcelable.Creator
        public final ObservableParcelable createFromParcel(Parcel parcel) {
            return new ObservableParcelable(parcel.readParcelable(a.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableParcelable[] newArray(int i) {
            return new ObservableParcelable[i];
        }
    }

    public ObservableParcelable() {
        super(13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(U(), 0);
    }
}
