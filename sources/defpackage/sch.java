package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class sch implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        String strF = null;
        String strF2 = null;
        Uri uri = null;
        ArrayList arrayListJ = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
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
                    uri = (Uri) SafeParcelReader.e(parcel, i, Uri.CREATOR);
                    break;
                case 4:
                    arrayListJ = SafeParcelReader.j(parcel, i, IdToken.CREATOR);
                    break;
                case 5:
                    strF3 = SafeParcelReader.f(parcel, i);
                    break;
                case 6:
                    strF4 = SafeParcelReader.f(parcel, i);
                    break;
                case 7:
                case '\b':
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    strF5 = SafeParcelReader.f(parcel, i);
                    break;
                case '\n':
                    strF6 = SafeParcelReader.f(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new Credential(strF, strF2, uri, arrayListJ, strF3, strF4, strF5, strF6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Credential[i];
    }
}
