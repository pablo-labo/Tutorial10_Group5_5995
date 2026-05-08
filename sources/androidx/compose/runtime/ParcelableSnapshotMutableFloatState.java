package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ame;
import defpackage.ca6;
import defpackage.cme;
import defpackage.wle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;", "Lcme;", "Landroid/os/Parcelable;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
final class ParcelableSnapshotMutableFloatState extends cme implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableFloatState> CREATOR = new a();

    public static final class a implements Parcelable.Creator<ParcelableSnapshotMutableFloatState> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableSnapshotMutableFloatState createFromParcel(Parcel parcel) {
            return new ParcelableSnapshotMutableFloatState(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableSnapshotMutableFloatState[] newArray(int i) {
            return new ParcelableSnapshotMutableFloatState[i];
        }
    }

    public ParcelableSnapshotMutableFloatState(float f) {
        wle wleVarJ = ame.j();
        cme.a aVar = new cme.a(wleVarJ.g(), f);
        if (!(wleVarJ instanceof ca6)) {
            aVar.b = new cme.a(1L, f);
        }
        this.b = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(g());
    }
}
