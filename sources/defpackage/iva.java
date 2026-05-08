package defpackage;

import defpackage.az2;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.ResponseBody;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes3.dex */
@IgnoreJRERequirement
public final class iva extends az2.a {
    public static final iva a = new iva();

    @IgnoreJRERequirement
    public static final class a<T> implements az2<ResponseBody, Optional<T>> {
        public final az2<ResponseBody, T> a;

        public a(az2<ResponseBody, T> az2Var) {
            this.a = az2Var;
        }

        @Override // defpackage.az2
        public final Object convert(ResponseBody responseBody) {
            return Optional.ofNullable(this.a.convert(responseBody));
        }
    }

    @Override // az2.a
    public final az2<ResponseBody, ?> b(Type type, Annotation[] annotationArr, bad badVar) {
        if (fkg.e(type) != Optional.class) {
            return null;
        }
        return new a(badVar.d(fkg.d(0, (ParameterizedType) type), annotationArr));
    }
}
