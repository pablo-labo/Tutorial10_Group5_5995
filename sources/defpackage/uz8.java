package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class uz8 {
    public static final AtomicLong c = new AtomicLong();
    public final Map<String, List<String>> a;
    public final long b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uz8(gf3 gf3Var) {
        this(0L, Collections.EMPTY_MAP);
        Uri uri = gf3Var.a;
    }

    public uz8(long j, Map map) {
        this.a = map;
        this.b = j;
    }
}
