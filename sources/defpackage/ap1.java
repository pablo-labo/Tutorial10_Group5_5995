package defpackage;

import defpackage.az2;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;

/* JADX INFO: loaded from: classes3.dex */
public final class ap1 extends az2.a {
    public boolean a;

    public static final class a implements az2<ResponseBody, ResponseBody> {
        public static final a a = new a();

        @Override // defpackage.az2
        public final ResponseBody convert(ResponseBody responseBody) {
            ResponseBody responseBody2 = responseBody;
            try {
                zn1 zn1Var = new zn1();
                responseBody2.getE().k1(zn1Var);
                MediaType c = responseBody2.getC();
                long d = responseBody2.getD();
                ResponseBody.b.getClass();
                return new ResponseBody$Companion$asResponseBody$1(c, d, zn1Var);
            } finally {
                responseBody2.close();
            }
        }
    }

    public static final class b implements az2<RequestBody, RequestBody> {
        public static final b a = new b();

        @Override // defpackage.az2
        public final RequestBody convert(RequestBody requestBody) {
            return requestBody;
        }
    }

    public static final class c implements az2<ResponseBody, ResponseBody> {
        public static final c a = new c();

        @Override // defpackage.az2
        public final ResponseBody convert(ResponseBody responseBody) {
            return responseBody;
        }
    }

    public static final class d implements az2<Object, String> {
        public static final d a = new d();

        @Override // defpackage.az2
        public final String convert(Object obj) {
            return obj.toString();
        }
    }

    public static final class e implements az2<ResponseBody, j6g> {
        public static final e a = new e();

        @Override // defpackage.az2
        public final j6g convert(ResponseBody responseBody) {
            responseBody.close();
            return j6g.a;
        }
    }

    public static final class f implements az2<ResponseBody, Void> {
        public static final f a = new f();

        @Override // defpackage.az2
        public final Void convert(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    @Override // az2.a
    public final az2<?, RequestBody> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, bad badVar) {
        if (RequestBody.class.isAssignableFrom(fkg.e(type))) {
            return b.a;
        }
        return null;
    }

    @Override // az2.a
    public final az2<ResponseBody, ?> b(Type type, Annotation[] annotationArr, bad badVar) {
        if (type == ResponseBody.class) {
            return fkg.h(annotationArr, pue.class) ? c.a : a.a;
        }
        if (type == Void.class) {
            return f.a;
        }
        if (!this.a || type != j6g.class) {
            return null;
        }
        try {
            return e.a;
        } catch (NoClassDefFoundError unused) {
            this.a = false;
            return null;
        }
    }
}
