package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class w3i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        Integer numP = null;
        Double dM = null;
        Uri uri = null;
        ArrayList arrayListJ = null;
        ArrayList arrayListJ2 = null;
        ChannelIdValue channelIdValue = null;
        String strF = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    numP = SafeParcelReader.p(parcel, i);
                    break;
                case 3:
                    dM = SafeParcelReader.m(parcel, i);
                    break;
                case 4:
                    uri = (Uri) SafeParcelReader.e(parcel, i, Uri.CREATOR);
                    break;
                case 5:
                    arrayListJ = SafeParcelReader.j(parcel, i, RegisterRequest.CREATOR);
                    break;
                case 6:
                    arrayListJ2 = SafeParcelReader.j(parcel, i, RegisteredKey.CREATOR);
                    break;
                case 7:
                    channelIdValue = (ChannelIdValue) SafeParcelReader.e(parcel, i, ChannelIdValue.CREATOR);
                    break;
                case '\b':
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new RegisterRequestParams(numP, dM, uri, arrayListJ, arrayListJ2, channelIdValue, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RegisterRequestParams[i];
    }
}
