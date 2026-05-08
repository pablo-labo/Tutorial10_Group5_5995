package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public final class mla {
    public final Bundle a;
    public IconCompat b;
    public final q0d[] c;
    public final boolean d;
    public final boolean e;

    @Deprecated
    public final int f;
    public final CharSequence g;
    public final PendingIntent h;

    public mla(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, q0d[] q0dVarArr) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null && iconCompat.c() == 2) {
            this.f = iconCompat.b();
        }
        this.g = pla.b(charSequence);
        this.h = pendingIntent;
        this.a = bundle;
        this.c = q0dVarArr;
        this.d = true;
        this.e = true;
    }

    public mla(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        this(iconCompat, charSequence, pendingIntent, new Bundle(), null);
    }
}
