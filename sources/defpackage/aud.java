package defpackage;

import com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper;
import com.indeed.android.jsmappservices.bridge.SearchType;
import defpackage.s87;
import defpackage.xh8;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class aud implements xh8 {
    public final Lazy a = boa.E(qt8.a, new a(this));
    public final tx5 b = new tx5();
    public boolean c;
    public boolean d;

    public static final class a extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(aud audVar) {
            super(0);
            this.$this_inject = audVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public final gz4 a() {
        return (gz4) this.a.getValue();
    }

    public final void b(SearchType searchType) {
        searchType.getClass();
        Lazy<s87> lazy = s87.f;
        s87.a.a(a(), tx5.k(this.b, ak2.M(searchType), WindowCallbackWrapper.BACK_DEFAULT_TARGET_NAME, null, 12));
    }

    public final void c(SearchType searchType) {
        searchType.getClass();
        Lazy<s87> lazy = s87.f;
        s87.a.a(a(), tx5.k(this.b, ak2.M(searchType), "clear-search", null, 12));
    }

    public final void e(SearchType searchType) {
        searchType.getClass();
        Lazy<s87> lazy = s87.f;
        s87.a.a(a(), tx5.k(this.b, ak2.M(searchType), "search", null, 12));
    }

    public final void f() {
        Lazy<s87> lazy = s87.f;
        s87.a.a(a(), tx5.k(this.b, ak2.M(SearchType.b), "show-more", null, 12));
    }

    public final void g() {
        if (this.c) {
            return;
        }
        Lazy<s87> lazy = s87.f;
        s87.a.a(a(), this.b.b(ak2.M(SearchType.b), "what-text-field", zr4.a, sx5.a));
        this.c = true;
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    public final void h() {
        if (this.d) {
            return;
        }
        Lazy<s87> lazy = s87.f;
        s87.a.a(a(), this.b.b(ak2.M(SearchType.c), "where-text-field", zr4.a, sx5.a));
        this.d = true;
    }
}
