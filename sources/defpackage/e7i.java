package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionResult;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class e7i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        ArrayList arrayListJ = null;
        Bundle bundleB = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                arrayListJ = SafeParcelReader.j(parcel, i, ActivityTransitionEvent.CREATOR);
            } else if (c != 2) {
                SafeParcelReader.t(parcel, i);
            } else {
                bundleB = SafeParcelReader.b(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new ActivityTransitionResult(arrayListJ, bundleB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransitionResult[i];
    }
}
