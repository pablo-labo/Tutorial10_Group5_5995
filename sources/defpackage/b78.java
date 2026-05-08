package defpackage;

import android.os.Bundle;
import com.datadog.android.ndk.internal.NdkCrashLog;

/* JADX INFO: loaded from: classes3.dex */
public final class b78 {
    public final String a;
    public final long b;

    public b78(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("status", this.a);
        bundle.putLong(NdkCrashLog.TIMESTAMP_KEY_NAME, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b78)) {
            return false;
        }
        b78 b78Var = (b78) obj;
        return this.a.equals(b78Var.a) && this.b == b78Var.b;
    }

    public final int hashCode() {
        return ia.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "JobStatus(status=" + this.a + ", timestamp=" + this.b + ", source=null)";
    }
}
