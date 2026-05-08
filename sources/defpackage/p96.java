package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class p96 implements kg8 {
    public final yg6 b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    public volatile byte[] g;
    public int h;

    public p96(String str) {
        wo8 wo8Var = yg6.a;
        this.c = null;
        if (TextUtils.isEmpty(str)) {
            l5.q("Must not be null or empty");
            throw null;
        }
        this.d = str;
        beb.e(wo8Var, "Argument must not be null");
        this.b = wo8Var;
    }

    @Override // defpackage.kg8
    public final void b(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = c().getBytes(kg8.a);
        }
        messageDigest.update(this.g);
    }

    public final String c() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        beb.e(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() {
        if (this.f == null) {
            if (TextUtils.isEmpty(this.e)) {
                String string = this.d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.c;
                    beb.e(url, "Argument must not be null");
                    string = url.toString();
                }
                this.e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f = new URL(this.e);
        }
        return this.f;
    }

    @Override // defpackage.kg8
    public final boolean equals(Object obj) {
        if (obj instanceof p96) {
            p96 p96Var = (p96) obj;
            if (c().equals(p96Var.c()) && this.b.equals(p96Var.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kg8
    public final int hashCode() {
        if (this.h == 0) {
            int iHashCode = c().hashCode();
            this.h = iHashCode;
            this.h = this.b.hashCode() + (iHashCode * 31);
        }
        return this.h;
    }

    public final String toString() {
        return c();
    }

    public p96(URL url) {
        wo8 wo8Var = yg6.a;
        beb.e(url, "Argument must not be null");
        this.c = url;
        this.d = null;
        beb.e(wo8Var, "Argument must not be null");
        this.b = wo8Var;
    }
}
