package defpackage;

import android.net.Uri;
import defpackage.fx9;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class vig<Data> implements fx9<Uri, Data> {
    public static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    public final fx9<p96, Data> a;

    public static class a implements gx9<Uri, InputStream> {
        @Override // defpackage.gx9
        public final fx9<Uri, InputStream> c(n1a n1aVar) {
            return new vig(n1aVar.a(p96.class, InputStream.class));
        }
    }

    public vig(fx9<p96, Data> fx9Var) {
        this.a = fx9Var;
    }

    @Override // defpackage.fx9
    public final fx9.a a(Uri uri, int i, int i2, ova ovaVar) {
        return this.a.a(new p96(uri.toString()), i, i2, ovaVar);
    }

    @Override // defpackage.fx9
    public final boolean b(Uri uri) {
        return b.contains(uri.getScheme());
    }
}
