package defpackage;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class kbh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        String[] strArrG = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundleB = null;
        int iO = 0;
        int iO2 = 0;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strArrG = SafeParcelReader.g(parcel, i);
            } else if (c == 2) {
                cursorWindowArr = (CursorWindow[]) SafeParcelReader.i(parcel, i, CursorWindow.CREATOR);
            } else if (c == 3) {
                iO2 = SafeParcelReader.o(parcel, i);
            } else if (c == 4) {
                bundleB = SafeParcelReader.b(parcel, i);
            } else if (c != 1000) {
                SafeParcelReader.t(parcel, i);
            } else {
                iO = SafeParcelReader.o(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        DataHolder dataHolder = new DataHolder(iO, strArrG, cursorWindowArr, iO2, bundleB);
        dataHolder.c = new Bundle();
        int i2 = 0;
        while (true) {
            String[] strArr = dataHolder.b;
            if (i2 >= strArr.length) {
                break;
            }
            dataHolder.c.putInt(strArr[i2], i2);
            i2++;
        }
        CursorWindow[] cursorWindowArr2 = dataHolder.d;
        dataHolder.V = new int[cursorWindowArr2.length];
        int numRows = 0;
        for (int i3 = 0; i3 < cursorWindowArr2.length; i3++) {
            dataHolder.V[i3] = numRows;
            numRows += cursorWindowArr2[i3].getNumRows() - (numRows - cursorWindowArr2[i3].getStartPosition());
        }
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
