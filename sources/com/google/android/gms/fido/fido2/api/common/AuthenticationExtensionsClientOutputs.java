package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bph;
import defpackage.l6;
import defpackage.ojd;
import defpackage.xna;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new bph();
    public final UvmEntries a;
    public final zzf b;
    public final AuthenticationExtensionsCredPropsOutputs c;
    public final zzh d;

    public AuthenticationExtensionsClientOutputs(UvmEntries uvmEntries, zzf zzfVar, AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, zzh zzhVar) {
        this.a = uvmEntries;
        this.b = zzfVar;
        this.c = authenticationExtensionsCredPropsOutputs;
        this.d = zzhVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        return xna.a(this.a, authenticationExtensionsClientOutputs.a) && xna.a(this.b, authenticationExtensionsClientOutputs.b) && xna.a(this.c, authenticationExtensionsClientOutputs.c) && xna.a(this.d, authenticationExtensionsClientOutputs.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final JSONObject s0() {
        try {
            JSONObject jSONObject = new JSONObject();
            AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = this.c;
            if (authenticationExtensionsCredPropsOutputs != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", authenticationExtensionsCredPropsOutputs.a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                }
            }
            UvmEntries uvmEntries = this.a;
            if (uvmEntries != null) {
                jSONObject.put("uvm", uvmEntries.s0());
            }
            zzh zzhVar = this.d;
            if (zzhVar != null) {
                jSONObject.put("prf", zzhVar.s0());
            }
            return jSONObject;
        } catch (JSONException e2) {
            l6.p("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e2);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.s(parcel, 1, this.a, i, false);
        ojd.s(parcel, 2, this.b, i, false);
        ojd.s(parcel, 3, this.c, i, false);
        ojd.s(parcel, 4, this.d, i, false);
        ojd.B(parcel, iA);
    }
}
