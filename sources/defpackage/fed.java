package defpackage;

import java.util.ArrayList;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes2.dex */
public final class fed extends z77 {
    public fed() {
        super(0);
    }

    @Override // defpackage.z77, okhttp3.CookieJar
    public final List<Cookie> b(HttpUrl httpUrl) {
        httpUrl.getClass();
        ArrayList arrayList = new ArrayList(super.b(httpUrl));
        Cookie.Builder builder = new Cookie.Builder();
        builder.c("NOMOB");
        builder.d("1");
        builder.b(d93.b());
        if (!wve.K("/", "/", false)) {
            l5.q("path must start with '/'");
            return null;
        }
        builder.e = "/";
        arrayList.add(builder.a());
        return arrayList;
    }
}
