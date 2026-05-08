package defpackage;

import android.os.Parcel;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.signin.internal.zak;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yah extends q9h {
    @Override // defpackage.q9h
    public final boolean k1(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                hah.b(parcel);
                break;
            case 4:
                hah.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                hah.b(parcel);
                break;
            case 7:
                hah.b(parcel);
                break;
            case 8:
                zak zakVar = (zak) hah.a(parcel, zak.CREATOR);
                hah.b(parcel);
                qah qahVar = (qah) this;
                qahVar.b.post(new pah(qahVar, zakVar));
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                hah.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
