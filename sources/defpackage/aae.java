package defpackage;

import android.content.ComponentName;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import androidx.media3.session.g;

/* JADX INFO: loaded from: classes.dex */
public final class aae {
    public static final String b;
    public static final String c;
    public final a a;

    public interface a {
        int a();

        Object b();

        String c();

        int d();

        String e();

        ComponentName f();

        boolean g();

        Bundle getExtras();

        int getType();

        MediaSession.Token h();

        Bundle toBundle();
    }

    static {
        jj9.a("media3.session");
        String str = vjg.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
    }

    public aae(int i, int i2, int i3, String str, g gVar, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        IBinder iBinderAsBinder = gVar.asBinder();
        bundle.getClass();
        this.a = new bae(i, 0, i2, i3, str, "", null, iBinderAsBinder, bundle, token);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        a aVar = this.a;
        boolean z = aVar instanceof bae;
        String str = b;
        if (z) {
            bundle.putInt(str, 0);
        } else {
            bundle.putInt(str, 1);
        }
        bundle.putBundle(c, aVar.toBundle());
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aae) {
            return this.a.equals(((aae) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
