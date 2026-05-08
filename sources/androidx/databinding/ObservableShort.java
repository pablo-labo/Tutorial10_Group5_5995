package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ja1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ObservableShort extends ja1 implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableShort> CREATOR = new a();
    static final long serialVersionUID = 1;
    private short mValue;

    public class a implements Parcelable.Creator<ObservableShort> {
        @Override // android.os.Parcelable.Creator
        public final ObservableShort createFromParcel(Parcel parcel) {
            return new ObservableShort((short) parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableShort[] newArray(int i) {
            return new ObservableShort[i];
        }
    }

    public ObservableShort(short s) {
        super(13);
        this.mValue = s;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }

    public ObservableShort() {
        super(13);
    }
}
