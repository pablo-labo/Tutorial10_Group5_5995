package okhttp3;

import defpackage.ro1;
import defpackage.zn1;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/FormBody;", "Lokhttp3/RequestBody;", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FormBody extends RequestBody {
    public static final MediaType c;
    public final List<String> a;
    public final List<String> b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/FormBody$Builder;", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public final ArrayList a = new ArrayList();
        public final ArrayList b = new ArrayList();
    }

    static {
        new Companion(0);
        MediaType.e.getClass();
        c = MediaType.Companion.a("application/x-www-form-urlencoded");
    }

    public FormBody(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.a = Util.x(arrayList);
        this.b = Util.x(arrayList2);
    }

    public final long a(ro1 ro1Var, boolean z) throws EOFException {
        zn1 zn1VarF;
        if (z) {
            zn1VarF = new zn1();
        } else {
            ro1Var.getClass();
            zn1VarF = ro1Var.f();
        }
        List<String> list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                zn1VarF.r0(38);
            }
            zn1VarF.Q0(list.get(i));
            zn1VarF.r0(61);
            zn1VarF.Q0(this.b.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = zn1VarF.b;
        zn1VarF.h();
        return j;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return a(null, true);
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public final MediaType getA() {
        return c;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(ro1 ro1Var) throws EOFException {
        ro1Var.getClass();
        a(ro1Var, false);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lokhttp3/FormBody$Companion;", "", "()V", "CONTENT_TYPE", "Lokhttp3/MediaType;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
