package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class v63 {
    public final Bundle a;
    public final Bundle b;
    public final Set<ComponentName> c;

    public v63(Bundle bundle, Bundle bundle2, Set set) {
        this.a = bundle;
        this.b = bundle2;
        this.c = set;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", true);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", true);
    }
}
