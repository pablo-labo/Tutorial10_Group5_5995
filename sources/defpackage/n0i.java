package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.recaptchabase.InitResult;

/* JADX INFO: loaded from: classes2.dex */
public final class n0i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        while (parcel.dataPosition() < iU) {
            SafeParcelReader.t(parcel, parcel.readInt());
        }
        SafeParcelReader.k(parcel, iU);
        return new InitResult();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new InitResult[i];
    }
}
