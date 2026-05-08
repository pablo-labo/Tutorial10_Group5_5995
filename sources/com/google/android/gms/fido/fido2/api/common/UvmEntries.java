package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.jkh;
import defpackage.l6;
import defpackage.ojd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class UvmEntries extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UvmEntries> CREATOR = new jkh();
    public final List a;

    public UvmEntries(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UvmEntries)) {
            return false;
        }
        List list = ((UvmEntries) obj).a;
        List list2 = this.a;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.a)});
    }

    public final JSONArray s0() {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = this.a;
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    UvmEntry uvmEntry = (UvmEntry) list.get(i);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) uvmEntry.c);
                    jSONArray2.put((int) uvmEntry.b);
                    jSONArray2.put((int) uvmEntry.c);
                    jSONArray.put(i, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            l6.p("Error encoding UvmEntries to JSON object", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.x(parcel, 1, this.a, false);
        ojd.B(parcel, iA);
    }
}
