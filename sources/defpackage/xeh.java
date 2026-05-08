package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;

/* JADX INFO: loaded from: classes2.dex */
public final class xeh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        Uri uri = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        PublicKeyCredential publicKeyCredential = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case 2:
                    strF2 = SafeParcelReader.f(parcel, i);
                    break;
                case 3:
                    strF3 = SafeParcelReader.f(parcel, i);
                    break;
                case 4:
                    strF4 = SafeParcelReader.f(parcel, i);
                    break;
                case 5:
                    uri = (Uri) SafeParcelReader.e(parcel, i, Uri.CREATOR);
                    break;
                case 6:
                    strF5 = SafeParcelReader.f(parcel, i);
                    break;
                case 7:
                    strF6 = SafeParcelReader.f(parcel, i);
                    break;
                case '\b':
                    strF7 = SafeParcelReader.f(parcel, i);
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    publicKeyCredential = (PublicKeyCredential) SafeParcelReader.e(parcel, i, PublicKeyCredential.CREATOR);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new SignInCredential(strF, strF2, strF3, strF4, uri, strF5, strF6, strF7, publicKeyCredential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInCredential[i];
    }
}
