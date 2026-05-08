package defpackage;

import android.os.Build;
import defpackage.slb;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class xlb {
    public static final a a;

    public static final class a implements wlb {
        @Override // defpackage.wlb
        public final void a(slb.a aVar) {
        }
    }

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        a = lowerCase.equals("robolectric") ? new a() : null;
    }
}
