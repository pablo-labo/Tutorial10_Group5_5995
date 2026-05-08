package defpackage;

import android.content.ComponentName;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import defpackage.aae;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class bae implements aae.a {
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final ComponentName g;
    public final IBinder h;
    public final Bundle i;
    public final MediaSession.Token j;

    static {
        String str = vjg.a;
        k = Integer.toString(0, 36);
        l = Integer.toString(1, 36);
        m = Integer.toString(2, 36);
        n = Integer.toString(3, 36);
        o = Integer.toString(4, 36);
        p = Integer.toString(5, 36);
        q = Integer.toString(6, 36);
        r = Integer.toString(7, 36);
        s = Integer.toString(8, 36);
        t = Integer.toString(9, 36);
    }

    public bae(int i, int i2, int i3, int i4, String str, String str2, ComponentName componentName, IBinder iBinder, Bundle bundle, MediaSession.Token token) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = str;
        this.f = str2;
        this.g = componentName;
        this.h = iBinder;
        this.i = bundle;
        this.j = token;
    }

    @Override // aae.a
    public final int a() {
        return this.a;
    }

    @Override // aae.a
    public final Object b() {
        return this.h;
    }

    @Override // aae.a
    public final String c() {
        return this.f;
    }

    @Override // aae.a
    public final int d() {
        return this.d;
    }

    @Override // aae.a
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bae)) {
            return false;
        }
        bae baeVar = (bae) obj;
        return this.a == baeVar.a && this.b == baeVar.b && this.c == baeVar.c && this.d == baeVar.d && TextUtils.equals(this.e, baeVar.e) && TextUtils.equals(this.f, baeVar.f) && Objects.equals(this.g, baeVar.g) && Objects.equals(this.h, baeVar.h) && Objects.equals(this.j, baeVar.j);
    }

    @Override // aae.a
    public final ComponentName f() {
        return this.g;
    }

    @Override // aae.a
    public final boolean g() {
        return false;
    }

    @Override // aae.a
    public final Bundle getExtras() {
        return new Bundle(this.i);
    }

    @Override // aae.a
    public final int getType() {
        return this.b;
    }

    @Override // aae.a
    public final MediaSession.Token h() {
        return this.j;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f, this.g, this.h, this.j);
    }

    @Override // aae.a
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(k, this.a);
        bundle.putInt(l, this.b);
        bundle.putInt(m, this.c);
        bundle.putString(n, this.e);
        bundle.putString(o, this.f);
        bundle.putBinder(q, this.h);
        bundle.putParcelable(p, this.g);
        bundle.putBundle(r, this.i);
        bundle.putInt(s, this.d);
        MediaSession.Token token = this.j;
        if (token != null) {
            bundle.putParcelable(t, token);
        }
        return bundle;
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.e + " type=" + this.b + " libraryVersion=" + this.c + " interfaceVersion=" + this.d + " service=" + this.f + " IMediaSession=" + this.h + " extras=" + this.i + "}";
    }
}
