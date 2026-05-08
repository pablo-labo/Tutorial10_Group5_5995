package defpackage;

import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.internal.location.zzdb;
import com.google.android.gms.internal.location.zzdf;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes2.dex */
public interface pji extends IInterface {
    void V(zzdb zzdbVar, LocationRequest locationRequest, pqh pqhVar);

    void V0(zzdb zzdbVar, pqh pqhVar);

    @Deprecated
    void Z0(LastLocationRequest lastLocationRequest, rqh rqhVar);

    @Deprecated
    dn6 a0(CurrentLocationRequest currentLocationRequest, rqh rqhVar);

    @Deprecated
    void t0(zzdf zzdfVar);

    @Deprecated
    Location zzd();
}
