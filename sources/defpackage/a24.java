package defpackage;

import com.indeed.android.rnsearch.detectlocation.DetectLocationCancelledException;
import com.indeed.android.rnsearch.detectlocation.DetectLocationMissingLocationData;
import com.indeed.android.rnsearch.detectlocation.DetectLocationUnexpectedException;
import defpackage.o7d;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.rnsearch.detectlocation.DetectLocationHandler$startDetectingLocation$1$1", f = "DetectLocationHandler.kt", l = {35}, m = "invokeSuspend")
public final class a24 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Function1<o7d<d24>, j6g> $callback;
    int label;
    final /* synthetic */ c24 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a24(c24 c24Var, Function1<? super o7d<d24>, j6g> function1, lu2<? super a24> lu2Var) {
        super(2, lu2Var);
        this.this$0 = c24Var;
        this.$callback = function1;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new a24(this.this$0, this.$callback, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((a24) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        try {
            if (i == 0) {
                r7d.b(obj);
                c24 c24Var = this.this$0;
                this.label = 1;
                obj = c24.a(c24Var, this);
                g13 g13Var = g13.a;
                if (obj == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            this.$callback.invoke(new o7d<>((d24) obj));
        } catch (DetectLocationMissingLocationData unused) {
            ArrayList arrayList = lz2.a;
            lz2.h("DetectLocationHandler", "Missing location data while detecting location", null, 12);
            this.$callback.invoke(new o7d<>(new o7d.a(new DetectLocationMissingLocationData())));
        } catch (CancellationException unused2) {
            ArrayList arrayList2 = lz2.a;
            lz2.h("DetectLocationHandler", "Location detection was superseded by another request", null, 12);
            this.$callback.invoke(new o7d<>(new o7d.a(new DetectLocationCancelledException())));
        } catch (Exception unused3) {
            ArrayList arrayList3 = lz2.a;
            lz2.h("DetectLocationHandler", "Unexpected error while detecting location", null, 12);
            this.$callback.invoke(new o7d<>(new o7d.a(new DetectLocationUnexpectedException())));
        }
        return j6g.a;
    }
}
