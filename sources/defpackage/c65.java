package defpackage;

import defpackage.az2;
import defpackage.c8e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlinx.serialization.KSerializer;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class c65 extends az2.a {
    public final MediaType a;
    public final c8e.a b;

    public c65(MediaType mediaType, c8e.a aVar) {
        this.a = mediaType;
        this.b = aVar;
    }

    @Override // az2.a
    public final az2<?, RequestBody> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, bad badVar) {
        type.getClass();
        annotationArr2.getClass();
        c8e.a aVar = this.b;
        aVar.getClass();
        return new s7e(this.a, awd.l(aVar.c().a(), type), aVar);
    }

    @Override // az2.a
    public final az2<ResponseBody, ?> b(Type type, Annotation[] annotationArr, bad badVar) {
        annotationArr.getClass();
        c8e.a aVar = this.b;
        aVar.getClass();
        KSerializer kSerializerL = awd.l(aVar.c().a(), type);
        aVar.getClass();
        j04 j04Var = new j04();
        j04Var.a = kSerializerL;
        j04Var.b = aVar;
        return j04Var;
    }
}
