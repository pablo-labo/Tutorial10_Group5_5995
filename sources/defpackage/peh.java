package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p000authapi.zbp;

/* JADX INFO: loaded from: classes2.dex */
public final class peh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            if (((char) i) != 1) {
                SafeParcelReader.t(parcel, i);
            } else {
                credential = (Credential) SafeParcelReader.e(parcel, i, Credential.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new zbp(credential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zbp[i];
    }
}
