package defpackage;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import zn1.b;

/* JADX INFO: loaded from: classes3.dex */
public final class ce6<T> implements az2<T, RequestBody> {
    public static final MediaType c;
    public static final Charset d;
    public final ae6 a;
    public final pvf<T> b;

    static {
        MediaType.e.getClass();
        c = MediaType.Companion.a("application/json; charset=UTF-8");
        d = Charset.forName("UTF-8");
    }

    public ce6(ae6 ae6Var, pvf<T> pvfVar) {
        this.a = ae6Var;
        this.b = pvfVar;
    }

    @Override // defpackage.az2
    public final RequestBody convert(Object obj) throws IOException {
        zn1 zn1Var = new zn1();
        gc8 gc8VarE = this.a.e(new OutputStreamWriter(zn1Var.new b(), d));
        this.b.b(gc8VarE, obj);
        gc8VarE.close();
        return RequestBody.create(c, zn1Var.J0(zn1Var.b));
    }
}
