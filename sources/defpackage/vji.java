package defpackage;

import android.os.Parcel;
import defpackage.tn6;

/* JADX INFO: loaded from: classes2.dex */
public final class vji extends ffh {
    public final tn6 h(vna vnaVar, String str, int i) {
        Parcel parcelE = e();
        koh.b(parcelE, vnaVar);
        parcelE.writeString(str);
        parcelE.writeInt(i);
        Parcel parcelC = c(parcelE, 2);
        tn6 tn6VarE = tn6.a.e(parcelC.readStrongBinder());
        parcelC.recycle();
        return tn6VarE;
    }

    public final tn6 k1(vna vnaVar, String str, int i) {
        Parcel parcelE = e();
        koh.b(parcelE, vnaVar);
        parcelE.writeString(str);
        parcelE.writeInt(i);
        Parcel parcelC = c(parcelE, 4);
        tn6 tn6VarE = tn6.a.e(parcelC.readStrongBinder());
        parcelC.recycle();
        return tn6VarE;
    }

    public final tn6 l1(vna vnaVar, String str, boolean z, long j) {
        Parcel parcelE = e();
        koh.b(parcelE, vnaVar);
        parcelE.writeString(str);
        parcelE.writeInt(z ? 1 : 0);
        parcelE.writeLong(j);
        Parcel parcelC = c(parcelE, 7);
        tn6 tn6VarE = tn6.a.e(parcelC.readStrongBinder());
        parcelC.recycle();
        return tn6VarE;
    }

    public final tn6 m1(vna vnaVar, String str, int i, vna vnaVar2) {
        Parcel parcelE = e();
        koh.b(parcelE, vnaVar);
        parcelE.writeString(str);
        parcelE.writeInt(i);
        koh.b(parcelE, vnaVar2);
        Parcel parcelC = c(parcelE, 8);
        tn6 tn6VarE = tn6.a.e(parcelC.readStrongBinder());
        parcelC.recycle();
        return tn6VarE;
    }
}
