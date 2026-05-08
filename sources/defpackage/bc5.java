package defpackage;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.upstream.c;
import defpackage.wb5;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bc5<T extends wb5<T>> implements c.a<T> {
    public final c.a<? extends T> a;
    public final List<StreamKey> b;

    public bc5(c.a<? extends T> aVar, List<StreamKey> list) {
        this.a = aVar;
        this.b = list;
    }

    @Override // androidx.media3.exoplayer.upstream.c.a
    public final Object a(Uri uri, df3 df3Var) {
        wb5 wb5Var = (wb5) this.a.a(uri, df3Var);
        List<StreamKey> list = this.b;
        return (list == null || list.isEmpty()) ? wb5Var : (wb5) wb5Var.a(list);
    }
}
