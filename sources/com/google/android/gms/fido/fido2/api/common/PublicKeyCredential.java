package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.l6;
import defpackage.ojd;
import defpackage.pih;
import defpackage.xna;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class PublicKeyCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new pih();
    public final AuthenticationExtensionsClientOutputs V;
    public final String W;
    public final String a;
    public final String b;
    public final byte[] c;
    public final AuthenticatorAttestationResponse d;
    public final AuthenticatorAssertionResponse e;
    public final AuthenticatorErrorResponse f;

    public PublicKeyCredential(String str, String str2, byte[] bArr, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3) {
        boolean z = true;
        if ((authenticatorAttestationResponse == null || authenticatorAssertionResponse != null || authenticatorErrorResponse != null) && ((authenticatorAttestationResponse != null || authenticatorAssertionResponse == null || authenticatorErrorResponse != null) && (authenticatorAttestationResponse != null || authenticatorAssertionResponse != null || authenticatorErrorResponse == null))) {
            z = false;
        }
        fib.b(z);
        this.a = str;
        this.b = str2;
        this.c = bArr;
        this.d = authenticatorAttestationResponse;
        this.e = authenticatorAssertionResponse;
        this.f = authenticatorErrorResponse;
        this.V = authenticationExtensionsClientOutputs;
        this.W = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        return xna.a(this.a, publicKeyCredential.a) && xna.a(this.b, publicKeyCredential.b) && Arrays.equals(this.c, publicKeyCredential.c) && xna.a(this.d, publicKeyCredential.d) && xna.a(this.e, publicKeyCredential.e) && xna.a(this.f, publicKeyCredential.f) && xna.a(this.V, publicKeyCredential.V) && xna.a(this.W, publicKeyCredential.W);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.d, this.f, this.V, this.W});
    }

    public final String s0() {
        JSONObject jSONObjectS0;
        try {
            JSONObject jSONObject = new JSONObject();
            byte[] bArr = this.c;
            if (bArr != null && bArr.length > 0) {
                jSONObject.put("rawId", Base64.encodeToString(bArr, 11));
            }
            String str = this.W;
            if (str != null) {
                jSONObject.put("authenticatorAttachment", str);
            }
            String str2 = this.b;
            AuthenticatorErrorResponse authenticatorErrorResponse = this.f;
            if (str2 != null && authenticatorErrorResponse == null) {
                jSONObject.put("type", str2);
            }
            String str3 = this.a;
            if (str3 != null) {
                jSONObject.put("id", str3);
            }
            String str4 = "response";
            AuthenticatorAssertionResponse authenticatorAssertionResponse = this.e;
            boolean z = true;
            if (authenticatorAssertionResponse != null) {
                jSONObjectS0 = authenticatorAssertionResponse.s0();
            } else {
                AuthenticatorAttestationResponse authenticatorAttestationResponse = this.d;
                if (authenticatorAttestationResponse != null) {
                    jSONObjectS0 = authenticatorAttestationResponse.s0();
                } else {
                    z = false;
                    if (authenticatorErrorResponse != null) {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("code", authenticatorErrorResponse.a.a());
                            String str5 = authenticatorErrorResponse.b;
                            if (str5 != null) {
                                jSONObject2.put("message", str5);
                            }
                            jSONObjectS0 = jSONObject2;
                            str4 = "error";
                        } catch (JSONException e) {
                            throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e);
                        }
                    } else {
                        jSONObjectS0 = null;
                    }
                }
            }
            if (jSONObjectS0 != null) {
                jSONObject.put(str4, jSONObjectS0);
            }
            AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.V;
            if (authenticationExtensionsClientOutputs != null) {
                jSONObject.put("clientExtensionResults", authenticationExtensionsClientOutputs.s0());
            } else if (z) {
                jSONObject.put("clientExtensionResults", new JSONObject());
            }
            return jSONObject.toString();
        } catch (JSONException e2) {
            l6.p("Error encoding PublicKeyCredential to JSON object", e2);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.t(parcel, 1, this.a, false);
        ojd.t(parcel, 2, this.b, false);
        ojd.m(parcel, 3, this.c, false);
        ojd.s(parcel, 4, this.d, i, false);
        ojd.s(parcel, 5, this.e, i, false);
        ojd.s(parcel, 6, this.f, i, false);
        ojd.s(parcel, 7, this.V, i, false);
        ojd.t(parcel, 8, this.W, false);
        ojd.B(parcel, iA);
    }
}
