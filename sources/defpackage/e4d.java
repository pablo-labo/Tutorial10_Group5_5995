package defpackage;

import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
public final class e4d {
    public Request a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e4d) && wl7.b(this.a, ((e4d) obj).a);
    }

    public final int hashCode() {
        Request request = this.a;
        if (request == null) {
            return 0;
        }
        return request.hashCode();
    }

    public final String toString() {
        return "RequestHolder(request=" + this.a + ")";
    }
}
