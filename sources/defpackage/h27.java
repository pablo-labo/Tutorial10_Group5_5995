package defpackage;

import defpackage.c27;
import expo.modules.imagepicker.ImagePickerOptions;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "expo.modules.imagepicker.ImagePickerModule$launchContract$2", f = "ImagePickerModule.kt", l = {216}, m = "invokeSuspend")
public final class h27 extends c1f implements Function1<lu2<? super c27>, Object> {
    final /* synthetic */ ImagePickerOptions $options;
    final /* synthetic */ luc<c27.c> $result;
    int label;
    final /* synthetic */ e27 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h27(e27 e27Var, luc<c27.c> lucVar, ImagePickerOptions imagePickerOptions, lu2<? super h27> lu2Var) {
        super(1, lu2Var);
        this.this$0 = e27Var;
        this.$result = lucVar;
        this.$options = imagePickerOptions;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new h27(this.this$0, this.$result, this.$options, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super c27> lu2Var) {
        return ((h27) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                r7d.b(obj);
                return obj;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        lk0<h73, c27> lk0Var = this.this$0.f;
        if (lk0Var == null) {
            wl7.g("cropImageLauncher");
            throw null;
        }
        String string = this.$result.element.a.get(0).e().toString();
        string.getClass();
        h73 h73Var = new h73(string, this.$options);
        this.label = 1;
        Object objA = lk0Var.a(h73Var, this);
        g13 g13Var = g13.a;
        return objA == g13Var ? g13Var : objA;
    }
}
