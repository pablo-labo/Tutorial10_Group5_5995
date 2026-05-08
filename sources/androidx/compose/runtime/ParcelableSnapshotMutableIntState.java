package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ame;
import defpackage.ca6;
import defpackage.dme;
import defpackage.wle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableIntState;", "Ldme;", "Landroid/os/Parcelable;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
final class ParcelableSnapshotMutableIntState extends dme implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableIntState> CREATOR = new a();

    public static final class a implements Parcelable.Creator<ParcelableSnapshotMutableIntState> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableSnapshotMutableIntState createFromParcel(Parcel parcel) {
            return new ParcelableSnapshotMutableIntState(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableSnapshotMutableIntState[] newArray(int i) {
            return new ParcelableSnapshotMutableIntState[i];
        }
    }

    public ParcelableSnapshotMutableIntState(int i) {
        wle wleVarJ = ame.j();
        dme.a aVar = new dme.a(wleVarJ.g(), i);
        if (!(wleVarJ instanceof ca6)) {
            aVar.b = new dme.a(1L, i);
        }
        this.b = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(e());
    }
}
