package defpackage;

import android.text.TextUtils;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class fva<T> {
    public static final a e = new a();
    public final T a;
    public final b<T> b;
    public final String c;
    public volatile byte[] d;

    public class a implements b<Object> {
        @Override // fva.b
        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    public interface b<T> {
        void a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    public fva(String str, T t, b<T> bVar) {
        if (TextUtils.isEmpty(str)) {
            l5.q("Must not be null or empty");
            throw null;
        }
        this.c = str;
        this.a = t;
        this.b = bVar;
    }

    public static fva a(Object obj, String str) {
        return new fva(str, obj, e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fva) {
            return this.c.equals(((fva) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return l6.i(new StringBuilder("Option{key='"), this.c, "'}");
    }
}
