package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import defpackage.b0;
import defpackage.bhi;
import defpackage.ojd;
import defpackage.xna;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new bhi();
    public final Attachment a;
    public final Boolean b;
    public final zzay c;
    public final ResidentKeyRequirement d;

    public AuthenticatorSelectionCriteria(String str, Boolean bool, String str2, String str3) {
        Attachment attachmentA;
        if (str == null) {
            attachmentA = null;
        } else {
            try {
                attachmentA = Attachment.a(str);
            } catch (Attachment.UnsupportedAttachmentException | ResidentKeyRequirement.UnsupportedResidentKeyRequirementException | zzax e) {
                b0.s(e);
                throw null;
            }
        }
        this.a = attachmentA;
        this.b = bool;
        this.c = str2 == null ? null : zzay.a(str2);
        this.d = str3 == null ? null : ResidentKeyRequirement.a(str3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        return xna.a(this.a, authenticatorSelectionCriteria.a) && xna.a(this.b, authenticatorSelectionCriteria.b) && xna.a(this.c, authenticatorSelectionCriteria.c) && xna.a(s0(), authenticatorSelectionCriteria.s0());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, s0()});
    }

    public final ResidentKeyRequirement s0() {
        ResidentKeyRequirement residentKeyRequirement = this.d;
        if (residentKeyRequirement == null) {
            residentKeyRequirement = null;
            Boolean bool = this.b;
            if (bool != null) {
                if (bool.booleanValue()) {
                    return ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
                }
                return null;
            }
        }
        return residentKeyRequirement;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        Attachment attachment = this.a;
        ojd.t(parcel, 2, attachment == null ? null : attachment.toString(), false);
        Boolean bool = this.b;
        if (bool != null) {
            ojd.y(parcel, 3, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        zzay zzayVar = this.c;
        ojd.t(parcel, 4, zzayVar == null ? null : zzayVar.toString(), false);
        ojd.t(parcel, 5, s0() != null ? s0().toString() : null, false);
        ojd.B(parcel, iA);
    }
}
