package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class rrh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        ArrayList arrayListJ = null;
        boolean z = false;
        Bundle bundleB = null;
        long jQ = 0;
        long jQ2 = 0;
        int iO = 0;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                arrayListJ = SafeParcelReader.j(parcel, i, DetectedActivity.CREATOR);
            } else if (c == 2) {
                jQ = SafeParcelReader.q(parcel, i);
            } else if (c == 3) {
                jQ2 = SafeParcelReader.q(parcel, i);
            } else if (c == 4) {
                iO = SafeParcelReader.o(parcel, i);
            } else if (c != 5) {
                SafeParcelReader.t(parcel, i);
            } else {
                bundleB = SafeParcelReader.b(parcel, i);
            }
        }
        SafeParcelReader.k(parcel, iU);
        ActivityRecognitionResult activityRecognitionResult = new ActivityRecognitionResult();
        fib.a("Must have at least 1 detected activity", arrayListJ != null && arrayListJ.size() > 0);
        if (jQ > 0 && jQ2 > 0) {
            z = true;
        }
        fib.a("Must set times", z);
        activityRecognitionResult.a = arrayListJ;
        activityRecognitionResult.b = jQ;
        activityRecognitionResult.c = jQ2;
        activityRecognitionResult.d = iO;
        activityRecognitionResult.e = bundleB;
        return activityRecognitionResult;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
