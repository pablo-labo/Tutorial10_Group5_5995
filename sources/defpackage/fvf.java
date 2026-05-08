package defpackage;

import android.content.Context;
import android.location.LocationManager;

/* JADX INFO: loaded from: classes.dex */
public final class fvf {
    public static fvf d;
    public final Context a;
    public final LocationManager b;
    public final a c = new a();

    public static class a {
        public boolean a;
        public long b;
    }

    public fvf(Context context, LocationManager locationManager) {
        this.a = context;
        this.b = locationManager;
    }
}
