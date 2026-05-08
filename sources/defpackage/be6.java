package defpackage;

import defpackage.az2;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class be6 extends az2.a {
    public final ae6 a;

    public be6(ae6 ae6Var) {
        this.a = ae6Var;
    }

    @Override // az2.a
    public final az2<?, RequestBody> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, bad badVar) {
        iyf iyfVar = new iyf(type);
        ae6 ae6Var = this.a;
        return new ce6(ae6Var, ae6Var.c(iyfVar));
    }

    @Override // az2.a
    public final az2<ResponseBody, ?> b(Type type, Annotation[] annotationArr, bad badVar) {
        iyf iyfVar = new iyf(type);
        ae6 ae6Var = this.a;
        return new de6(ae6Var, ae6Var.c(iyfVar));
    }
}
