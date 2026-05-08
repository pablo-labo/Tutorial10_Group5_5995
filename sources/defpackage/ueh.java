package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class ueh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            if (((char) i) != 1) {
                SafeParcelReader.t(parcel, i);
            } else {
                pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, i, PendingIntent.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new SavePasswordResult(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SavePasswordResult[i];
    }
}
