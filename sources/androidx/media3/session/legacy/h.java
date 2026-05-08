package androidx.media3.session.legacy;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.session.MediaSessionManager;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import defpackage.ja;
import defpackage.l5;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final boolean b = Log.isLoggable("MediaSessionManager", 3);
    public static final Object c = new Object();
    public static volatile h d;
    public a a;

    public static class a {
        public static final boolean c = h.b;
        public Context a;
        public ContentResolver b;

        public final boolean a(d dVar, String str) {
            int i = dVar.b;
            Context context = this.a;
            return i < 0 ? context.getPackageManager().checkPermission(str, dVar.a) == 0 : context.checkPermission(str, i, dVar.c) == 0;
        }
    }

    public static final class c extends d {
        public c(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
        }

        public static String a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            return remoteUserInfo.getPackageName();
        }
    }

    public static class d {
        public final String a;
        public final int b;
        public final int c;

        public d(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            int i = dVar.c;
            String str = dVar.a;
            int i2 = dVar.b;
            int i3 = this.c;
            String str2 = this.a;
            int i4 = this.b;
            return (i4 < 0 || i2 < 0) ? TextUtils.equals(str2, str) && i3 == i : TextUtils.equals(str2, str) && i4 == i2 && i3 == i;
        }

        public final int hashCode() {
            return Objects.hash(this.a, Integer.valueOf(this.c));
        }
    }

    public static h a(Context context) {
        h hVar;
        synchronized (c) {
            try {
                if (d == null) {
                    Context applicationContext = context.getApplicationContext();
                    h hVar2 = new h();
                    a aVar = new a();
                    aVar.a = applicationContext;
                    aVar.b = applicationContext.getContentResolver();
                    hVar2.a = aVar;
                    d = hVar2;
                }
                hVar = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public final boolean b(b bVar) {
        a aVar = this.a;
        d dVar = bVar.a;
        Context context = aVar.a;
        int i = dVar.b;
        String str = dVar.a;
        if (context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", i, dVar.c) == 0) {
            return true;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(str, 0) != null) {
                if (aVar.a(dVar, "android.permission.STATUS_BAR_SERVICE") || aVar.a(dVar, "android.permission.MEDIA_CONTENT_CONTROL") || dVar.c == 1000) {
                    return true;
                }
                String string = Settings.Secure.getString(aVar.b, "enabled_notification_listeners");
                if (string != null) {
                    for (String str2 : string.split(":")) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str2);
                        if (componentNameUnflattenFromString != null && componentNameUnflattenFromString.getPackageName().equals(str)) {
                            return true;
                        }
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            if (a.c) {
                Log.d("MediaSessionManager", "Package " + str + " doesn't exist");
            }
        }
        return false;
    }

    public static final class b {
        public final d a;

        public b(String str, int i, int i2) {
            if (str == null) {
                ja.k("package shouldn't be null");
                throw null;
            }
            if (TextUtils.isEmpty(str)) {
                l5.q("packageName should be nonempty");
                throw null;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                this.a = new c(str, i, i2);
            } else {
                this.a = new d(str, i, i2);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            String strA = c.a(remoteUserInfo);
            if (strA != null) {
                if (!TextUtils.isEmpty(strA)) {
                    this.a = new c(remoteUserInfo);
                    return;
                } else {
                    l5.q("packageName should be nonempty");
                    throw null;
                }
            }
            ja.k("package shouldn't be null");
            throw null;
        }
    }
}
