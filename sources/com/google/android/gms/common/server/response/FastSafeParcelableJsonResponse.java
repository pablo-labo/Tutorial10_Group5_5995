package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import defpackage.fib;
import defpackage.xna;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public Object c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field<?, ?> field : a().values()) {
            if (d(field)) {
                if (!fastJsonResponse.d(field) || !xna.a(b(field), fastJsonResponse.b(field))) {
                    return false;
                }
            } else if (fastJsonResponse.d(field)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (FastJsonResponse.Field<?, ?> field : a().values()) {
            if (d(field)) {
                Object objB = b(field);
                fib.i(objB);
                iHashCode = (iHashCode * 31) + objB.hashCode();
            }
        }
        return iHashCode;
    }
}
