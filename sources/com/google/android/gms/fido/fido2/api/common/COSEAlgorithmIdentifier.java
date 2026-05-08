package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bg;
import defpackage.se4;
import defpackage.thc;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class COSEAlgorithmIdentifier implements Parcelable {
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new g();
    public final a a;

    public static class UnsupportedAlgorithmIdentifierException extends Exception {
    }

    public COSEAlgorithmIdentifier(a aVar) {
        this.a = aVar;
    }

    public static COSEAlgorithmIdentifier a(int i) throws UnsupportedAlgorithmIdentifierException {
        a aVar;
        if (i == thc.LEGACY_RS1.a()) {
            aVar = thc.RS1;
        } else {
            thc[] thcVarArrValues = thc.values();
            int length = thcVarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    for (se4 se4Var : se4.values()) {
                        if (se4Var.a() == i) {
                            aVar = se4Var;
                        }
                    }
                    throw new UnsupportedAlgorithmIdentifierException(bg.d(i, "Algorithm with COSE value ", " not supported"));
                }
                thc thcVar = thcVarArrValues[i2];
                if (thcVar.a() == i) {
                    aVar = thcVar;
                    break;
                }
                i2++;
            }
        }
        return new COSEAlgorithmIdentifier(aVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.a.a() == ((COSEAlgorithmIdentifier) obj).a.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.a());
    }
}
