package defpackage;

import com.indeed.android.backendservices.autocomplete.network.AutoCompleteApiService;
import defpackage.bad;
import okhttp3.MediaType;

/* JADX INFO: loaded from: classes2.dex */
public final class jz0 {
    public static final bad a;
    public static final d2f b;

    static {
        int i = 2;
        ra8 ra8VarA = sa8.a(new he(i));
        bad.b bVar = new bad.b();
        MediaType.e.getClass();
        bVar.d.add(ewa.q(ra8VarA, MediaType.Companion.a("application/json")));
        bVar.a("https://autocomplete.indeed.com/api/v0/");
        a = bVar.b();
        b = new d2f(new ym0(i));
    }

    public static AutoCompleteApiService a() {
        Object value = b.getValue();
        value.getClass();
        return (AutoCompleteApiService) value;
    }
}
