package defpackage;

import expo.modules.kotlin.exception.CodedException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface p3c {

    public static final class a {
        public static void a(p3c p3cVar, CodedException codedException) {
            p3cVar.reject(codedException.getCode(), codedException.getLocalizedMessage(), codedException.getCause());
        }
    }

    void a(boolean z);

    void b(int i);

    void c(double d);

    void d(float f);

    void e();

    void f(Map<String, ? extends Object> map);

    void g(CodedException codedException);

    void reject(String str, String str2, Throwable th);

    void resolve(Object obj);

    void resolve(String str);
}
