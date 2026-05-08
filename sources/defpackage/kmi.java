package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;

/* JADX INFO: loaded from: classes2.dex */
public final class kmi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        String strF = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            if (((char) i) != 2) {
                SafeParcelReader.t(parcel, i);
            } else {
                strF = SafeParcelReader.f(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new FidoAppIdExtension(strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FidoAppIdExtension[i];
    }
}
