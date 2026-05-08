package defpackage;

import com.linecorp.linesdk.LineApiError;

/* JADX INFO: loaded from: classes3.dex */
public final class ww8<R> {
    public static final ww8<?> d = new ww8<>(xw8.a, null, LineApiError.d);
    public final xw8 a;
    public final R b;
    public final LineApiError c;

    public ww8(xw8 xw8Var, R r, LineApiError lineApiError) {
        this.a = xw8Var;
        this.b = r;
        this.c = lineApiError;
    }

    public static <T> ww8<T> a(xw8 xw8Var, LineApiError lineApiError) {
        return new ww8<>(xw8Var, null, lineApiError);
    }

    public static <T> ww8<T> b(T t) {
        return t == null ? (ww8<T>) d : new ww8<>(xw8.a, t, LineApiError.d);
    }

    public final R c() {
        R r = this.b;
        if (r != null) {
            return r;
        }
        s6.j("response data is null. Please check result by isSuccess before.");
        return null;
    }

    public final boolean d() {
        return this.a == xw8.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ww8.class != obj.getClass()) {
            return false;
        }
        ww8 ww8Var = (ww8) obj;
        if (this.a != ww8Var.a) {
            return false;
        }
        R r = ww8Var.b;
        R r2 = this.b;
        if (r2 != null) {
            if (!r2.equals(r)) {
                return false;
            }
        } else if (r != null) {
            return false;
        }
        return this.c.equals(ww8Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        R r = this.b;
        return this.c.hashCode() + ((iHashCode + (r != null ? r.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "LineApiResponse{errorData=" + this.c + ", responseCode=" + this.a + ", responseData=" + this.b + '}';
    }
}
