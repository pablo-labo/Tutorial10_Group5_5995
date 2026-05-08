package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ja1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ObservableChar extends ja1 implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableChar> CREATOR = new a();
    static final long serialVersionUID = 1;
    private char mValue;

    public class a implements Parcelable.Creator<ObservableChar> {
        @Override // android.os.Parcelable.Creator
        public final ObservableChar createFromParcel(Parcel parcel) {
            return new ObservableChar((char) parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableChar[] newArray(int i) {
            return new ObservableChar[i];
        }
    }

    public ObservableChar(char c) {
        super(13);
        this.mValue = c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }

    public ObservableChar() {
        super(13);
    }
}
