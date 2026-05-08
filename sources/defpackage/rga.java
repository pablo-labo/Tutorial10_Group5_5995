package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.searchoverlay.network.NetworkRecentSearchesRepository$deleteRecentSearch$2", f = "RecentSearchesRepository.kt", l = {98}, m = "invokeSuspend")
public final class rga extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ lsc $recentSearch;
    int label;
    final /* synthetic */ tga this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rga(tga tgaVar, lsc lscVar, lu2<? super rga> lu2Var) {
        super(2, lu2Var);
        this.this$0 = tgaVar;
        this.$recentSearch = lscVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new rga(this.this$0, this.$recentSearch, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((rga) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                r7d.b(obj);
                cy3 cy3Var = (cy3) this.this$0.b.getValue();
                String strA = bu8.a.a();
                if (strA == null) {
                    strA = "";
                }
                lsc lscVar = this.$recentSearch;
                this.label = 1;
                Object objA = cy3Var.a(strA, lscVar, this);
                g13 g13Var = g13.a;
                if (objA == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
        } catch (CancellationException unused) {
            ArrayList arrayList = lz2.a;
            Log.d("RecentSearchesRepository", "Cancelled", null);
        } catch (Exception e) {
            ArrayList arrayList2 = lz2.a;
            lz2.b("RecentSearchesRepository", "deleteRecentSearch", false, e);
        }
        return j6g.a;
    }
}
