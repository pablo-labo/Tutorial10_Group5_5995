package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.iid.zzj;

/* JADX INFO: loaded from: classes2.dex */
public final class x6i implements Parcelable.Creator<zzj> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzj createFromParcel(Parcel parcel) {
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder != null) {
            return new zzj(strongBinder);
        }
        return null;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzj[] newArray(int i) {
        return new zzj[i];
    }
}
