package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import defpackage.b0;
import defpackage.fib;
import defpackage.ojd;
import defpackage.rlh;
import defpackage.tih;
import defpackage.x3i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR;
    public final PublicKeyCredentialType a;
    public final byte[] b;
    public final List c;

    static {
        rlh.f(2, x3i.a, x3i.b);
        CREATOR = new tih();
    }

    public PublicKeyCredentialDescriptor(String str, byte[] bArr, ArrayList arrayList) {
        fib.i(str);
        try {
            this.a = PublicKeyCredentialType.a(str);
            fib.i(bArr);
            this.b = bArr;
            this.c = arrayList;
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e) {
            b0.s(e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        List list = publicKeyCredentialDescriptor.c;
        if (!this.a.equals(publicKeyCredentialDescriptor.a) || !Arrays.equals(this.b, publicKeyCredentialDescriptor.b)) {
            return false;
        }
        List list2 = this.c;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b)), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.t(parcel, 2, this.a.toString(), false);
        ojd.m(parcel, 3, this.b, false);
        ojd.x(parcel, 4, this.c, false);
        ojd.B(parcel, iA);
    }
}
