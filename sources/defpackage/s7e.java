package defpackage;

import defpackage.c8e;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class s7e<T> implements az2<T, RequestBody> {
    public final MediaType a;
    public final r7e<T> b;
    public final c8e c;

    public s7e(MediaType mediaType, r7e r7eVar, c8e.a aVar) {
        mediaType.getClass();
        aVar.getClass();
        this.a = mediaType;
        this.b = r7eVar;
        this.c = aVar;
    }

    @Override // defpackage.az2
    public final RequestBody convert(Object obj) {
        return this.c.b(this.a, this.b, obj);
    }
}
