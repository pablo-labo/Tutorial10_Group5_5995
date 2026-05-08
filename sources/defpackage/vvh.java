package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzkq;
import com.google.android.gms.measurement.internal.zzn;
import com.google.android.gms.measurement.internal.zzw;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vvh extends noh implements pvh {
    @Override // defpackage.noh
    public final boolean c(int i, Parcel parcel, Parcel parcel2) {
        ArrayList arrayList;
        switch (i) {
            case 1:
                ((h1i) this).N0((zzao) nkh.a(parcel, zzao.CREATOR), (zzn) nkh.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                ((h1i) this).C((zzkq) nkh.a(parcel, zzkq.CREATOR), (zzn) nkh.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                ((h1i) this).J((zzn) nkh.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                zzao zzaoVar = (zzao) nkh.a(parcel, zzao.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                h1i h1iVar = (h1i) this;
                fib.i(zzaoVar);
                fib.f(string);
                h1iVar.h(string, true);
                h1iVar.e(new m2i(h1iVar, zzaoVar, string));
                parcel2.writeNoException();
                return true;
            case 6:
                ((h1i) this).N((zzn) nkh.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                zzn zznVar = (zzn) nkh.a(parcel, zzn.CREATOR);
                boolean z = parcel.readInt() != 0;
                h1i h1iVar2 = (h1i) this;
                h1iVar2.k1(zznVar);
                fei feiVar = h1iVar2.a;
                try {
                    List<bfi> list = (List) feiVar.zzq().k(new m33(1, h1iVar2, zznVar)).get();
                    arrayList = new ArrayList(list.size());
                    for (bfi bfiVar : list) {
                        if (z || !yei.h0(bfiVar.c)) {
                            arrayList.add(new zzkq(bfiVar));
                        }
                        break;
                    }
                } catch (InterruptedException e) {
                    e = e;
                    feiVar.zzr().f.c("Failed to get user properties. appId", ewh.l(zznVar.a), e);
                    arrayList = null;
                } catch (ExecutionException e2) {
                    e = e2;
                    feiVar.zzr().f.c("Failed to get user properties. appId", ewh.l(zznVar.a), e);
                    arrayList = null;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case DatadogLogGenerator.CRASH /* 9 */:
                byte[] bArrY0 = ((h1i) this).Y0((zzao) nkh.a(parcel, zzao.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrY0);
                return true;
            case 10:
                ((h1i) this).x(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String strY0 = ((h1i) this).y0((zzn) nkh.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(strY0);
                return true;
            case 12:
                ((h1i) this).k((zzw) nkh.a(parcel, zzw.CREATOR), (zzn) nkh.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                zzw zzwVar = (zzw) nkh.a(parcel, zzw.CREATOR);
                h1i h1iVar3 = (h1i) this;
                fib.i(zzwVar);
                fib.i(zzwVar.c);
                h1iVar3.h(zzwVar.a, true);
                h1iVar3.e(new k1i(h1iVar3, new zzw(zzwVar)));
                parcel2.writeNoException();
                return true;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                ClassLoader classLoader = nkh.a;
                List<zzkq> listK0 = ((h1i) this).K0(string2, string3, parcel.readInt() != 0, (zzn) nkh.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(listK0);
                return true;
            case 15:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                ClassLoader classLoader2 = nkh.a;
                List<zzkq> listP = ((h1i) this).p(string4, string5, string6, parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeTypedList(listP);
                return true;
            case 16:
                List<zzw> listZ = ((h1i) this).z(parcel.readString(), parcel.readString(), (zzn) nkh.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(listZ);
                return true;
            case 17:
                List<zzw> listY = ((h1i) this).y(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(listY);
                return true;
            case 18:
                ((h1i) this).E0((zzn) nkh.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                ((h1i) this).X((Bundle) nkh.a(parcel, Bundle.CREATOR), (zzn) nkh.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
