package defpackage;

import android.util.Log;
import com.indeed.android.backendservices.common.api.ApiError;
import defpackage.d36;
import defpackage.wg0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.searchoverlay.network.NetworkRecentSearchesRepository$getRecentSearches$2", f = "RecentSearchesRepository.kt", l = {60}, m = "invokeSuspend")
public final class sga extends c1f implements Function2<e13, lu2<? super List<? extends lsc>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ tga this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sga(tga tgaVar, lu2<? super sga> lu2Var) {
        super(2, lu2Var);
        this.this$0 = tgaVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new sga(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super List<? extends lsc>> lu2Var) {
        return ((sga) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [T, zr4] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5, types: [luc] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v10, types: [T, java.util.ArrayList] */
    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        luc lucVar;
        ?? r1 = this.label;
        try {
            if (r1 == 0) {
                r7d.b(obj);
                luc lucVar2 = new luc();
                lucVar2.element = zr4.a;
                gsa gsaVar = (gsa) this.this$0.a.getValue();
                pa paVar = new pa(this.this$0, 10);
                this.L$0 = lucVar2;
                this.label = 1;
                obj = gsaVar.K(paVar, this);
                g13 g13Var = g13.a;
                r1 = lucVar2;
                if (obj == g13Var) {
                    return g13Var;
                }
            } else {
                if (r1 != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                luc lucVar3 = (luc) this.L$0;
                r7d.b(obj);
                r1 = lucVar3;
            }
            wg0 wg0Var = (wg0) obj;
            tga tgaVar = this.this$0;
            if (wg0Var instanceof wg0.b) {
                d36.b bVar = ((d36.c) ((wg0.b) wg0Var).a).a;
                ArrayList arrayList = bVar != null ? bVar.a.a : null;
                if (arrayList != null) {
                    r1.element = tga.c(tgaVar, arrayList);
                }
            }
            lucVar = r1;
            if (wg0Var instanceof wg0.a) {
                p81 p81Var = ((wg0.a) wg0Var).a;
                p81Var.getClass();
                ApiError apiError = (ApiError) p81Var;
                ArrayList arrayList2 = lz2.a;
                lz2.g("RecentSearchesRepository", "Recent searches query failed with error: " + apiError.getError(), false, apiError.getCause());
                lucVar = r1;
            }
        } catch (CancellationException unused) {
            ArrayList arrayList3 = lz2.a;
            Log.d("RecentSearchesRepository", "Cancelled", null);
            lucVar = r1;
        } catch (Exception e) {
            ArrayList arrayList4 = lz2.a;
            lz2.b("RecentSearchesRepository", "getRecentSearches", false, e);
            lucVar = r1;
        }
        return lucVar.element;
    }
}
