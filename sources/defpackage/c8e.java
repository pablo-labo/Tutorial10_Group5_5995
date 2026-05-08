package defpackage;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c8e {

    public static final class a extends c8e {
        public final dve a;

        public a(dve dveVar) {
            dveVar.getClass();
            this.a = dveVar;
        }

        @Override // defpackage.c8e
        public final <T> T a(i04<T> i04Var, ResponseBody responseBody) throws IOException {
            responseBody.getClass();
            return (T) this.a.c(i04Var, responseBody.v());
        }

        @Override // defpackage.c8e
        public final <T> RequestBody b(MediaType mediaType, r7e<? super T> r7eVar, T t) {
            mediaType.getClass();
            RequestBody requestBodyCreate = RequestBody.create(mediaType, this.a.b(r7eVar, t));
            requestBodyCreate.getClass();
            return requestBodyCreate;
        }

        public final dve c() {
            return this.a;
        }
    }

    public abstract <T> T a(i04<T> i04Var, ResponseBody responseBody);

    public abstract <T> RequestBody b(MediaType mediaType, r7e<? super T> r7eVar, T t);
}
