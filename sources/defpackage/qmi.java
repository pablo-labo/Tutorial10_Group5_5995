package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzw;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class qmi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        DeviceMetaData deviceMetaData = null;
        int i2 = 0;
        while (parcel.dataPosition() < iU) {
            int i3 = parcel.readInt();
            switch ((char) i3) {
                case 1:
                    int iO = SafeParcelReader.o(parcel, i3);
                    hashSet.add(1);
                    i2 = iO;
                    break;
                case 2:
                    String strF = SafeParcelReader.f(parcel, i3);
                    hashSet.add(2);
                    str = strF;
                    break;
                case 3:
                    int iO2 = SafeParcelReader.o(parcel, i3);
                    hashSet.add(3);
                    i = iO2;
                    break;
                case 4:
                    byte[] bArrC = SafeParcelReader.c(parcel, i3);
                    hashSet.add(4);
                    bArr = bArrC;
                    break;
                case 5:
                    PendingIntent pendingIntent2 = (PendingIntent) SafeParcelReader.e(parcel, i3, PendingIntent.CREATOR);
                    hashSet.add(5);
                    pendingIntent = pendingIntent2;
                    break;
                case 6:
                    DeviceMetaData deviceMetaData2 = (DeviceMetaData) SafeParcelReader.e(parcel, i3, DeviceMetaData.CREATOR);
                    hashSet.add(6);
                    deviceMetaData = deviceMetaData2;
                    break;
                default:
                    SafeParcelReader.t(parcel, i3);
                    break;
            }
        }
        if (parcel.dataPosition() == iU) {
            return new zzw(hashSet, i2, str, i, bArr, pendingIntent, deviceMetaData);
        }
        throw new SafeParcelReader.ParseException(p6.c(iU, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzw[i];
    }
}
