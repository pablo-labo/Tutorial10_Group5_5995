package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.luh;
import defpackage.ojd;
import defpackage.p7d;
import defpackage.xna;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class Status extends AbstractSafeParcelable implements p7d, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR;
    public static final Status V;
    public static final Status W;
    public static final Status X;
    public static final Status e;
    public static final Status f;
    public final int a;
    public final String b;
    public final PendingIntent c;
    public final ConnectionResult d;

    static {
        new Status(-1, null, null, null);
        e = new Status(0, null, null, null);
        f = new Status(14, null, null, null);
        V = new Status(8, null, null, null);
        W = new Status(15, null, null, null);
        X = new Status(16, null, null, null);
        new Status(17, null, null, null);
        new Status(18, null, null, null);
        CREATOR = new luh();
    }

    public Status(int i, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.a = i;
        this.b = str;
        this.c = pendingIntent;
        this.d = connectionResult;
    }

    @Override // defpackage.p7d
    public final Status a() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.a == status.a && xna.a(this.b, status.b) && xna.a(this.c, status.c) && xna.a(this.d, status.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public final boolean s0() {
        return this.a <= 0;
    }

    public final String toString() {
        xna.a aVar = new xna.a(this);
        String string = this.b;
        if (string == null) {
            int i = this.a;
            switch (i) {
                case -1:
                    string = "SUCCESS_CACHE";
                    break;
                case 0:
                    string = "SUCCESS";
                    break;
                case 1:
                case DatadogLogGenerator.CRASH /* 9 */:
                case 11:
                case 12:
                default:
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
                    sb.append("unknown status code: ");
                    sb.append(i);
                    string = sb.toString();
                    break;
                case 2:
                    string = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    string = "SERVICE_DISABLED";
                    break;
                case 4:
                    string = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    string = "INVALID_ACCOUNT";
                    break;
                case 6:
                    string = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    string = "NETWORK_ERROR";
                    break;
                case 8:
                    string = "INTERNAL_ERROR";
                    break;
                case 10:
                    string = "DEVELOPER_ERROR";
                    break;
                case 13:
                    string = "ERROR";
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                    string = "INTERRUPTED";
                    break;
                case 15:
                    string = "TIMEOUT";
                    break;
                case 16:
                    string = "CANCELED";
                    break;
                case 17:
                    string = "API_NOT_CONNECTED";
                    break;
                case 18:
                    string = "DEAD_CLIENT";
                    break;
                case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                    string = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    string = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    string = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    string = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        aVar.a(string, "statusCode");
        aVar.a(this.c, "resolution");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.t(parcel, 2, this.b, false);
        ojd.s(parcel, 3, this.c, i, false);
        ojd.s(parcel, 4, this.d, i, false);
        ojd.B(parcel, iA);
    }
}
