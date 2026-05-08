package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzkq;
import com.google.android.gms.measurement.internal.zzn;
import com.google.android.gms.measurement.internal.zzw;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class uvh extends ifh implements pvh {
    public uvh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // defpackage.pvh
    public final void C(zzkq zzkqVar, zzn zznVar) {
        Parcel parcelC = c();
        nkh.c(parcelC, zzkqVar);
        nkh.c(parcelC, zznVar);
        h(parcelC, 2);
    }

    @Override // defpackage.pvh
    public final void E0(zzn zznVar) {
        Parcel parcelC = c();
        nkh.c(parcelC, zznVar);
        h(parcelC, 18);
    }

    @Override // defpackage.pvh
    public final void J(zzn zznVar) {
        Parcel parcelC = c();
        nkh.c(parcelC, zznVar);
        h(parcelC, 4);
    }

    @Override // defpackage.pvh
    public final List<zzkq> K0(String str, String str2, boolean z, zzn zznVar) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        ClassLoader classLoader = nkh.a;
        parcelC.writeInt(z ? 1 : 0);
        nkh.c(parcelC, zznVar);
        Parcel parcelE = e(parcelC, 14);
        ArrayList arrayListCreateTypedArrayList = parcelE.createTypedArrayList(zzkq.CREATOR);
        parcelE.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.pvh
    public final void N(zzn zznVar) {
        Parcel parcelC = c();
        nkh.c(parcelC, zznVar);
        h(parcelC, 6);
    }

    @Override // defpackage.pvh
    public final void N0(zzao zzaoVar, zzn zznVar) {
        Parcel parcelC = c();
        nkh.c(parcelC, zzaoVar);
        nkh.c(parcelC, zznVar);
        h(parcelC, 1);
    }

    @Override // defpackage.pvh
    public final void X(Bundle bundle, zzn zznVar) {
        Parcel parcelC = c();
        nkh.c(parcelC, bundle);
        nkh.c(parcelC, zznVar);
        h(parcelC, 19);
    }

    @Override // defpackage.pvh
    public final byte[] Y0(zzao zzaoVar, String str) {
        Parcel parcelC = c();
        nkh.c(parcelC, zzaoVar);
        parcelC.writeString(str);
        Parcel parcelE = e(parcelC, 9);
        byte[] bArrCreateByteArray = parcelE.createByteArray();
        parcelE.recycle();
        return bArrCreateByteArray;
    }

    @Override // defpackage.pvh
    public final void k(zzw zzwVar, zzn zznVar) {
        Parcel parcelC = c();
        nkh.c(parcelC, zzwVar);
        nkh.c(parcelC, zznVar);
        h(parcelC, 12);
    }

    @Override // defpackage.pvh
    public final List<zzkq> p(String str, String str2, String str3, boolean z) {
        Parcel parcelC = c();
        parcelC.writeString(null);
        parcelC.writeString(str2);
        parcelC.writeString(str3);
        ClassLoader classLoader = nkh.a;
        parcelC.writeInt(z ? 1 : 0);
        Parcel parcelE = e(parcelC, 15);
        ArrayList arrayListCreateTypedArrayList = parcelE.createTypedArrayList(zzkq.CREATOR);
        parcelE.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.pvh
    public final void x(long j, String str, String str2, String str3) {
        Parcel parcelC = c();
        parcelC.writeLong(j);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        parcelC.writeString(str3);
        h(parcelC, 10);
    }

    @Override // defpackage.pvh
    public final List<zzw> y(String str, String str2, String str3) {
        Parcel parcelC = c();
        parcelC.writeString(null);
        parcelC.writeString(str2);
        parcelC.writeString(str3);
        Parcel parcelE = e(parcelC, 17);
        ArrayList arrayListCreateTypedArrayList = parcelE.createTypedArrayList(zzw.CREATOR);
        parcelE.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.pvh
    public final String y0(zzn zznVar) {
        Parcel parcelC = c();
        nkh.c(parcelC, zznVar);
        Parcel parcelE = e(parcelC, 11);
        String string = parcelE.readString();
        parcelE.recycle();
        return string;
    }

    @Override // defpackage.pvh
    public final List<zzw> z(String str, String str2, zzn zznVar) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        nkh.c(parcelC, zznVar);
        Parcel parcelE = e(parcelC, 16);
        ArrayList arrayListCreateTypedArrayList = parcelE.createTypedArrayList(zzw.CREATOR);
        parcelE.recycle();
        return arrayListCreateTypedArrayList;
    }
}
