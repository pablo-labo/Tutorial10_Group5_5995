package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ame;
import defpackage.bme;
import defpackage.ca6;
import defpackage.wle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableDoubleState;", "Lbme;", "Landroid/os/Parcelable;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
final class ParcelableSnapshotMutableDoubleState extends bme implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableDoubleState> CREATOR = new a();

    public static final class a implements Parcelable.Creator<ParcelableSnapshotMutableDoubleState> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableSnapshotMutableDoubleState createFromParcel(Parcel parcel) {
            return new ParcelableSnapshotMutableDoubleState(parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableSnapshotMutableDoubleState[] newArray(int i) {
            return new ParcelableSnapshotMutableDoubleState[i];
        }
    }

    public ParcelableSnapshotMutableDoubleState(double d) {
        wle wleVarJ = ame.j();
        bme.a aVar = new bme.a(wleVarJ.g(), d);
        if (!(wleVarJ instanceof ca6)) {
            aVar.b = new bme.a(1L, d);
        }
        this.b = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(c());
    }
}
