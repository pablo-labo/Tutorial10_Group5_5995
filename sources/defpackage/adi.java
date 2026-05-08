package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class adi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        Integer numP = null;
        Double dM = null;
        Uri uri = null;
        byte[] bArrC = null;
        ArrayList arrayListJ = null;
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
                    bArrC = SafeParcelReader.c(parcel, i);
                    break;
                case 6:
                    arrayListJ = SafeParcelReader.j(parcel, i, RegisteredKey.CREATOR);
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
        return new SignRequestParams(numP, dM, uri, bArrC, arrayListJ, channelIdValue, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignRequestParams[i];
    }
}
