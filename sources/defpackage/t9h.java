package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class t9h implements Parcelable.Creator {
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
        ArrayList arrayListJ = null;
        String strF7 = null;
        String strF8 = null;
        long jQ = 0;
        int iO = 0;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iO = SafeParcelReader.o(parcel, i);
                    break;
                case 2:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case 3:
                    strF2 = SafeParcelReader.f(parcel, i);
                    break;
                case 4:
                    strF3 = SafeParcelReader.f(parcel, i);
                    break;
                case 5:
                    strF4 = SafeParcelReader.f(parcel, i);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.e(parcel, i, Uri.CREATOR);
                    break;
                case 7:
                    strF5 = SafeParcelReader.f(parcel, i);
                    break;
                case '\b':
                    jQ = SafeParcelReader.q(parcel, i);
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    strF6 = SafeParcelReader.f(parcel, i);
                    break;
                case '\n':
                    arrayListJ = SafeParcelReader.j(parcel, i, Scope.CREATOR);
                    break;
                case 11:
                    strF7 = SafeParcelReader.f(parcel, i);
                    break;
                case '\f':
                    strF8 = SafeParcelReader.f(parcel, i);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new GoogleSignInAccount(iO, strF, strF2, strF3, strF4, uri, strF5, jQ, strF6, arrayListJ, strF7, strF8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
