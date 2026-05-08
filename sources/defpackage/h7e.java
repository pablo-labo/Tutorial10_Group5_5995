package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class h7e implements Iterable<String>, ze8 {
    public final /* synthetic */ uv4 a;

    public h7e(uv4 uv4Var) {
        this.a = uv4Var;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new g7e(this.a);
    }
}
