package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class ufh implements Parcelable.Creator {
    public static final ufh a = new ufh();

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        if (parcel.readInt() != -204102970) {
            parcel.setDataPosition(iDataPosition - 4);
            return ApiMetadata.d;
        }
        int iU = SafeParcelReader.u(parcel);
        boolean zL = false;
        ComplianceOptions complianceOptions = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                complianceOptions = (ComplianceOptions) SafeParcelReader.e(parcel, i, ComplianceOptions.CREATOR);
            } else if (c != 2) {
                SafeParcelReader.t(parcel, i);
            } else {
                zL = SafeParcelReader.l(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new ApiMetadata(complianceOptions, zL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ApiMetadata[i];
    }
}
