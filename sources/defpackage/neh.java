package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class neh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        int iO = 0;
        PendingIntent pendingIntent = null;
        String strF = null;
        String strF2 = null;
        ArrayList<String> arrayListH = null;
        String strF3 = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, i, PendingIntent.CREATOR);
                    break;
                case 2:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case 3:
                    strF2 = SafeParcelReader.f(parcel, i);
                    break;
                case 4:
                    arrayListH = SafeParcelReader.h(parcel, i);
                    break;
                case 5:
                    strF3 = SafeParcelReader.f(parcel, i);
                    break;
                case 6:
                    iO = SafeParcelReader.o(parcel, i);
                    break;
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new SaveAccountLinkingTokenRequest(pendingIntent, strF, strF2, arrayListH, strF3, iO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SaveAccountLinkingTokenRequest[i];
    }
}
