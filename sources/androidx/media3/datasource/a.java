package androidx.media3.datasource;

import android.net.Uri;
import defpackage.gf3;
import defpackage.grf;
import defpackage.te3;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface a extends te3 {

    /* JADX INFO: renamed from: androidx.media3.datasource.a$a, reason: collision with other inner class name */
    public interface InterfaceC0038a {
        a a();
    }

    Uri a();

    long b(gf3 gf3Var);

    void close();

    default Map<String, List<String>> e() {
        return Collections.EMPTY_MAP;
    }

    void i(grf grfVar);
}
