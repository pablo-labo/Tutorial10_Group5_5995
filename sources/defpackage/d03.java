package defpackage;

import androidx.compose.runtime.r;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1", f = "CoreTextField.kt", l = {359}, m = "invokeSuspend")
public final class d03 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ t37 $imeOptions;
    final /* synthetic */ rgf $manager;
    final /* synthetic */ lu8 $state;
    final /* synthetic */ rhf $textInputService;
    final /* synthetic */ ese<Boolean> $writeable$delegate;
    int label;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ lu8 a;
        public final /* synthetic */ rhf b;
        public final /* synthetic */ rgf c;
        public final /* synthetic */ t37 d;

        public a(lu8 lu8Var, rhf rhfVar, rgf rgfVar, t37 t37Var) {
            this.a = lu8Var;
            this.b = rhfVar;
            this.c = rgfVar;
            this.d = t37Var;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            lu8 lu8Var = this.a;
            if (zBooleanValue && lu8Var.b()) {
                rgf rgfVar = this.c;
                l03.g(this.b, lu8Var, rgfVar.m(), this.d, rgfVar.b);
            } else {
                l03.e(lu8Var);
            }
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d03(lu8 lu8Var, ese<Boolean> eseVar, rhf rhfVar, rgf rgfVar, t37 t37Var, lu2<? super d03> lu2Var) {
        super(2, lu2Var);
        this.$state = lu8Var;
        this.$writeable$delegate = eseVar;
        this.$textInputService = rhfVar;
        this.$manager = rgfVar;
        this.$imeOptions = t37Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new d03(this.$state, this.$writeable$delegate, this.$textInputService, this.$manager, this.$imeOptions, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((d03) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [j6g, java.lang.Object] */
    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                r7d.b(obj);
                kjd kjdVarH = r.h(new c03(this.$writeable$delegate, 0));
                a aVar = new a(this.$state, this.$textInputService, this.$manager, this.$imeOptions);
                this.label = 1;
                Object objE = kjdVarH.e(aVar, this);
                g13 g13Var = g13.a;
                if (objE == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            l03.e(this.$state);
            this = j6g.a;
            return this;
        } catch (Throwable th) {
            l03.e(this.$state);
            throw th;
        }
    }
}
