package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.l5;
import defpackage.ojd;
import defpackage.sch;
import defpackage.xna;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new sch();
    public final String V;
    public final String W;
    public final String a;
    public final String b;
    public final Uri c;
    public final List d;
    public final String e;
    public final String f;

    public Credential(String str, String str2, Uri uri, ArrayList arrayList, String str3, String str4, String str5, String str6) {
        Boolean boolValueOf;
        fib.j(str, "credential identifier cannot be null");
        String strTrim = str.trim();
        fib.g(strTrim, "credential identifier cannot be empty");
        if (str3 != null && TextUtils.isEmpty(str3)) {
            l5.q("Password must not be empty if set");
            throw null;
        }
        if (str4 != null) {
            if (TextUtils.isEmpty(str4)) {
                boolValueOf = Boolean.FALSE;
            } else {
                Uri uri2 = Uri.parse(str4);
                if (!uri2.isAbsolute() || !uri2.isHierarchical() || TextUtils.isEmpty(uri2.getScheme()) || TextUtils.isEmpty(uri2.getAuthority())) {
                    boolValueOf = Boolean.FALSE;
                } else {
                    boolean z = true;
                    if (!"http".equalsIgnoreCase(uri2.getScheme()) && !"https".equalsIgnoreCase(uri2.getScheme())) {
                        z = false;
                    }
                    boolValueOf = Boolean.valueOf(z);
                }
            }
            if (!boolValueOf.booleanValue()) {
                l5.q("Account type must be a valid Http/Https URI");
                throw null;
            }
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            l5.q("Password and AccountType are mutually exclusive");
            throw null;
        }
        if (str2 != null && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.b = str2;
        this.c = uri;
        this.d = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
        this.a = strTrim;
        this.e = str3;
        this.f = str4;
        this.V = str5;
        this.W = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.a, credential.a) && TextUtils.equals(this.b, credential.b) && xna.a(this.c, credential.c) && TextUtils.equals(this.e, credential.e) && TextUtils.equals(this.f, credential.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.t(parcel, 1, this.a, false);
        ojd.t(parcel, 2, this.b, false);
        ojd.s(parcel, 3, this.c, i, false);
        ojd.x(parcel, 4, this.d, false);
        ojd.t(parcel, 5, this.e, false);
        ojd.t(parcel, 6, this.f, false);
        ojd.t(parcel, 9, this.V, false);
        ojd.t(parcel, 10, this.W, false);
        ojd.B(parcel, iA);
    }
}
