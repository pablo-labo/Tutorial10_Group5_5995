package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.searchoverlay.ui.CombinedSearchScreenKt$CombinedSearchScreen$4$1", f = "CombinedSearchScreen.kt", l = {}, m = "invokeSuspend")
public final class cc2 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ g4a<Boolean> $isWhatSearchReady$delegate;
    final /* synthetic */ boolean $recentSearchesAreReady;
    final /* synthetic */ boolean $whatSuggestionsAreReady;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc2(boolean z, boolean z2, g4a<Boolean> g4aVar, lu2<? super cc2> lu2Var) {
        super(2, lu2Var);
        this.$whatSuggestionsAreReady = z;
        this.$recentSearchesAreReady = z2;
        this.$isWhatSearchReady$delegate = g4aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new cc2(this.$whatSuggestionsAreReady, this.$recentSearchesAreReady, this.$isWhatSearchReady$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((cc2) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        if (this.$whatSuggestionsAreReady && this.$recentSearchesAreReady) {
            this.$isWhatSearchReady$delegate.setValue(Boolean.TRUE);
        }
        return j6g.a;
    }
}
