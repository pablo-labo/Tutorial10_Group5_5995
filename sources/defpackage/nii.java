package defpackage;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.zzdb;
import com.google.android.gms.internal.location.zzdf;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationRequest;
import defpackage.dn6;

/* JADX INFO: loaded from: classes2.dex */
public final class nii extends hfh implements pji {
    @Override // defpackage.pji
    public final void V(zzdb zzdbVar, LocationRequest locationRequest, pqh pqhVar) {
        Parcel parcelC = c();
        int i = moh.a;
        parcelC.writeInt(1);
        zzdbVar.writeToParcel(parcelC, 0);
        parcelC.writeInt(1);
        locationRequest.writeToParcel(parcelC, 0);
        moh.c(parcelC, pqhVar);
        h(parcelC, 88);
    }

    @Override // defpackage.pji
    public final void V0(zzdb zzdbVar, pqh pqhVar) {
        Parcel parcelC = c();
        int i = moh.a;
        parcelC.writeInt(1);
        zzdbVar.writeToParcel(parcelC, 0);
        moh.c(parcelC, pqhVar);
        h(parcelC, 89);
    }

    @Override // defpackage.pji
    public final void Z0(LastLocationRequest lastLocationRequest, rqh rqhVar) {
        Parcel parcelC = c();
        int i = moh.a;
        parcelC.writeInt(1);
        lastLocationRequest.writeToParcel(parcelC, 0);
        moh.c(parcelC, rqhVar);
        h(parcelC, 82);
    }

    @Override // defpackage.pji
    public final dn6 a0(CurrentLocationRequest currentLocationRequest, rqh rqhVar) {
        dn6 pliVar;
        Parcel parcelC = c();
        int i = moh.a;
        parcelC.writeInt(1);
        currentLocationRequest.writeToParcel(parcelC, 0);
        moh.c(parcelC, rqhVar);
        Parcel parcelE = e(parcelC, 87);
        IBinder strongBinder = parcelE.readStrongBinder();
        int i2 = dn6.a.a;
        if (strongBinder == null) {
            pliVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            pliVar = iInterfaceQueryLocalInterface instanceof dn6 ? (dn6) iInterfaceQueryLocalInterface : new pli(strongBinder, "com.google.android.gms.common.internal.ICancelToken");
        }
        parcelE.recycle();
        return pliVar;
    }

    @Override // defpackage.pji
    public final void t0(zzdf zzdfVar) {
        Parcel parcelC = c();
        int i = moh.a;
        parcelC.writeInt(1);
        zzdfVar.writeToParcel(parcelC, 0);
        h(parcelC, 59);
    }

    @Override // defpackage.pji
    public final Location zzd() {
        Parcel parcelE = e(c(), 7);
        Location location = (Location) moh.a(parcelE, Location.CREATOR);
        parcelE.recycle();
        return location;
    }
}
