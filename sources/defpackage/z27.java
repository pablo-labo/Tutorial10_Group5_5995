package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import defpackage.fsf;
import defpackage.q55;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z27 {
    public static final q55.b<List<orf>> a = new q55.b<>(zr4.a);
    public static final q55.b<fsf.a> b = new q55.b<>(fsf.a.a);
    public static final q55.b<Bitmap.Config> c = new q55.b<>(ukg.b);
    public static final q55.b<ColorSpace> d = new q55.b<>(null);
    public static final q55.b<Boolean> e;
    public static final q55.b<kv8> f;
    public static final q55.b<Boolean> g;
    public static final q55.b<Boolean> h;
    public static final q55.b<Boolean> i;

    static {
        Boolean bool = Boolean.TRUE;
        e = new q55.b<>(bool);
        f = new q55.b<>(null);
        g = new q55.b<>(bool);
        h = new q55.b<>(bool);
        i = new q55.b<>(Boolean.FALSE);
    }

    public static final Bitmap.Config a(nva nvaVar) {
        return (Bitmap.Config) r55.b(nvaVar, c);
    }
}
