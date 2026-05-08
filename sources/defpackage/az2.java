package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public interface az2<F, T> {

    public static abstract class a {
        public az2<?, RequestBody> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, bad badVar) {
            return null;
        }

        public az2<ResponseBody, ?> b(Type type, Annotation[] annotationArr, bad badVar) {
            return null;
        }
    }

    T convert(F f);
}
