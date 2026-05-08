package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.search.GoogleNowAuthState;

/* JADX INFO: loaded from: classes2.dex */
public final class mfh implements Parcelable.Creator<GoogleNowAuthState> {
    @Override // android.os.Parcelable.Creator
    public final GoogleNowAuthState createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        String strF = null;
        long jQ = 0;
        String strF2 = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strF = SafeParcelReader.f(parcel, i);
            } else if (c == 2) {
                strF2 = SafeParcelReader.f(parcel, i);
            } else if (c != 3) {
                SafeParcelReader.t(parcel, i);
            } else {
                jQ = SafeParcelReader.q(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        GoogleNowAuthState googleNowAuthState = new GoogleNowAuthState();
        googleNowAuthState.a = strF;
        googleNowAuthState.b = strF2;
        googleNowAuthState.c = jQ;
        return googleNowAuthState;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleNowAuthState[] newArray(int i) {
        return new GoogleNowAuthState[i];
    }
}
