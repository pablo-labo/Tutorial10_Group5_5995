package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.l6;
import defpackage.ojd;
import defpackage.y6i;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new y6i();
    public final boolean a;
    public final byte[] b;

    public zzh(byte[] bArr, boolean z) {
        this.a = z;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return this.a == zzhVar.a && Arrays.equals(this.b, zzhVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public final JSONObject s0() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enabled", this.a);
            JSONObject jSONObject2 = new JSONObject();
            byte[] bArr = this.b;
            if (bArr != null) {
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOfRange(bArr, 0, 31), 11));
                if (bArr.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(bArr, 32, 64), 11));
                }
            }
            jSONObject.put("results", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            l6.p("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        ojd.m(parcel, 2, this.b, false);
        ojd.B(parcel, iA);
    }
}
