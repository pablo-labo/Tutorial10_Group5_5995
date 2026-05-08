package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ame;
import defpackage.ca6;
import defpackage.eme;
import defpackage.wle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;", "Leme;", "Landroid/os/Parcelable;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
final class ParcelableSnapshotMutableLongState extends eme implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableLongState> CREATOR = new a();

    public static final class a implements Parcelable.Creator<ParcelableSnapshotMutableLongState> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableSnapshotMutableLongState createFromParcel(Parcel parcel) {
            return new ParcelableSnapshotMutableLongState(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableSnapshotMutableLongState[] newArray(int i) {
            return new ParcelableSnapshotMutableLongState[i];
        }
    }

    public ParcelableSnapshotMutableLongState(long j) {
        wle wleVarJ = ame.j();
        eme.a aVar = new eme.a(wleVarJ.g(), j);
        if (!(wleVarJ instanceof ca6)) {
            aVar.b = new eme.a(1L, j);
        }
        this.b = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(a());
    }
}
