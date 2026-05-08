package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.zzai;

/* JADX INFO: loaded from: classes2.dex */
public final class cih implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        while (true) {
            byte[][] bArr = null;
            while (parcel.dataPosition() < iU) {
                int i = parcel.readInt();
                if (((char) i) != 1) {
                    SafeParcelReader.t(parcel, i);
                } else {
                    int iS = SafeParcelReader.s(parcel, i);
                    int iDataPosition = parcel.dataPosition();
                    if (iS == 0) {
                        break;
                    }
                    int i2 = parcel.readInt();
                    byte[][] bArr2 = new byte[i2][];
                    for (int i3 = 0; i3 < i2; i3++) {
                        bArr2[i3] = parcel.createByteArray();
                    }
                    parcel.setDataPosition(iDataPosition + iS);
                    bArr = bArr2;
                }
            }
            SafeParcelReader.k(parcel, iU);
            return new zzai(bArr);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzai[i];
    }
}
