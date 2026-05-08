package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class aki {
    public final i0i a;

    public aki(i0i i0iVar) {
        this.a = i0iVar;
    }

    public final void a(String str, Bundle bundle) {
        String string;
        i0i i0iVar = this.a;
        eyh eyhVar = i0iVar.W;
        a0i a0iVar = i0iVar.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        if (i0iVar.d()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        i0i.c(eyhVar);
        eyhVar.p0.b(string);
        i0i.c(eyhVar);
        uyh uyhVar = eyhVar.q0;
        i0iVar.c0.getClass();
        uyhVar.b(System.currentTimeMillis());
    }

    public final boolean b() {
        if (!c()) {
            return false;
        }
        i0i i0iVar = this.a;
        i0iVar.c0.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        eyh eyhVar = i0iVar.W;
        i0i.c(eyhVar);
        return jCurrentTimeMillis - eyhVar.q0.a() > i0iVar.V.g(null, djh.Q0);
    }

    public final boolean c() {
        eyh eyhVar = this.a.W;
        i0i.c(eyhVar);
        return eyhVar.q0.a() > 0;
    }
}
