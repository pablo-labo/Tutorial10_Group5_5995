package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.awd;
import defpackage.b0;
import defpackage.fib;
import defpackage.l5;
import defpackage.ojd;
import defpackage.pjh;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class TokenBinding extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TokenBinding> CREATOR = new pjh();
    public final TokenBindingStatus a;
    public final String b;

    public enum TokenBindingStatus implements Parcelable {
        /* JADX INFO: Fake field, exist only in values array */
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");

        public static final Parcelable.Creator<TokenBindingStatus> CREATOR = new e();
        private final String zzb;

        TokenBindingStatus(String str) {
            this.zzb = str;
        }

        public static TokenBindingStatus a(String str) throws UnsupportedTokenBindingStatusException {
            for (TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.zzb)) {
                    return tokenBindingStatus;
                }
            }
            throw new UnsupportedTokenBindingStatusException(l5.m("TokenBindingStatus ", str, " not supported"));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.zzb;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.zzb);
        }
    }

    public static class UnsupportedTokenBindingStatusException extends Exception {
    }

    static {
        new TokenBinding(TokenBindingStatus.SUPPORTED.toString(), null);
        new TokenBinding(TokenBindingStatus.NOT_SUPPORTED.toString(), null);
    }

    public TokenBinding(String str, String str2) {
        fib.i(str);
        try {
            this.a = TokenBindingStatus.a(str);
            this.b = str2;
        } catch (UnsupportedTokenBindingStatusException e) {
            b0.s(e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        return awd.t(this.a, tokenBinding.a) && awd.t(this.b, tokenBinding.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.t(parcel, 2, this.a.toString(), false);
        ojd.t(parcel, 3, this.b, false);
        ojd.B(parcel, iA);
    }
}
