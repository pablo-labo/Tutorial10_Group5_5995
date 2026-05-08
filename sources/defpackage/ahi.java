package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class ahi implements Parcelable.Creator {
    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        int i2 = getServiceRequest.a;
        ojd.y(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = getServiceRequest.b;
        ojd.y(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = getServiceRequest.c;
        ojd.y(parcel, 3, 4);
        parcel.writeInt(i4);
        ojd.t(parcel, 4, getServiceRequest.d, false);
        ojd.o(parcel, 5, getServiceRequest.e);
        ojd.w(parcel, 6, getServiceRequest.f, i);
        ojd.l(parcel, 7, getServiceRequest.V);
        ojd.s(parcel, 8, getServiceRequest.W, i, false);
        ojd.w(parcel, 10, getServiceRequest.X, i);
        ojd.w(parcel, 11, getServiceRequest.Y, i);
        boolean z = getServiceRequest.Z;
        ojd.y(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = getServiceRequest.a0;
        ojd.y(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = getServiceRequest.b0;
        ojd.y(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        ojd.t(parcel, 15, getServiceRequest.c0, false);
        ojd.B(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = SafeParcelReader.u(parcel);
        Bundle bundle = new Bundle();
        Scope[] scopeArr = GetServiceRequest.d0;
        String strF = null;
        IBinder iBinderN = null;
        Account account = null;
        String strF2 = null;
        int iO = 0;
        int iO2 = 0;
        int iO3 = 0;
        boolean zL = false;
        int iO4 = 0;
        boolean zL2 = false;
        Feature[] featureArr = GetServiceRequest.e0;
        Feature[] featureArr2 = featureArr;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iO = SafeParcelReader.o(parcel, i);
                    break;
                case 2:
                    iO2 = SafeParcelReader.o(parcel, i);
                    break;
                case 3:
                    iO3 = SafeParcelReader.o(parcel, i);
                    break;
                case 4:
                    strF = SafeParcelReader.f(parcel, i);
                    break;
                case 5:
                    iBinderN = SafeParcelReader.n(parcel, i);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.i(parcel, i, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.b(parcel, i);
                    break;
                case '\b':
                    account = (Account) SafeParcelReader.e(parcel, i, Account.CREATOR);
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                default:
                    SafeParcelReader.t(parcel, i);
                    break;
                case '\n':
                    featureArr = (Feature[]) SafeParcelReader.i(parcel, i, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.i(parcel, i, Feature.CREATOR);
                    break;
                case '\f':
                    zL = SafeParcelReader.l(parcel, i);
                    break;
                case '\r':
                    iO4 = SafeParcelReader.o(parcel, i);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                    zL2 = SafeParcelReader.l(parcel, i);
                    break;
                case 15:
                    strF2 = SafeParcelReader.f(parcel, i);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iU);
        return new GetServiceRequest(iO, iO2, iO3, strF, iBinderN, scopeArr, bundle, account, featureArr, featureArr2, zL, iO4, zL2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
