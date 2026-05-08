package defpackage;

import java.util.List;
import okhttp3.Headers;

/* JADX INFO: loaded from: classes.dex */
public final class hpa {
    public static final d2f a = new d2f(new cn0(14));

    public static final Headers a(List<nl6> list) {
        list.getClass();
        Headers.Builder builder = new Headers.Builder();
        for (nl6 nl6Var : list) {
            builder.a(nl6Var.a, nl6Var.b);
        }
        return builder.e();
    }
}
