package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lki extends mkh implements uki {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.mkh
    public final boolean c(Parcel parcel, int i) {
        if (i == 1) {
            LocationResult locationResult = (LocationResult) moh.a(parcel, LocationResult.CREATOR);
            moh.b(parcel);
            iz8 iz8Var = (iz8) ((irh) this).b.c;
            hzh hzhVar = new hzh(locationResult);
            iz8Var.a.getClass();
            mqh mqhVar = iz8Var.b;
            if (mqhVar != null) {
                mqhVar.K((LocationResult) hzhVar.a);
                return true;
            }
        } else {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                ((irh) this).e();
                return true;
            }
            moh.b(parcel);
            ((iz8) ((irh) this).b.c).a.getClass();
        }
        return true;
    }
}
