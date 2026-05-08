package okhttp3;

import defpackage.ze8;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"okhttp3/Cache$urls$1", "", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Cache$urls$1 implements Iterator<String>, ze8 {
    public boolean a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        this.a = false;
        throw null;
    }

    @Override // java.util.Iterator
    public final String next() {
        this.a = false;
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.a) {
            throw new IllegalStateException("remove() before next()");
        }
        throw null;
    }
}
