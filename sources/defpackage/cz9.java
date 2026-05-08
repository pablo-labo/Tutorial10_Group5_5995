package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.components.inputs.MonthYearPickerKt$MonthYearValuesDisplay$2$1", f = "MonthYearPicker.kt", l = {}, m = "invokeSuspend")
public final class cz9 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ g4a<Boolean> $isDateRangeSequential$delegate;
    final /* synthetic */ boolean $isRequired;
    final /* synthetic */ Function1<Boolean, j6g> $onInternalDateRangeValidationResultChange;
    final /* synthetic */ ig3 $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cz9(boolean z, ig3 ig3Var, Function1<? super Boolean, j6g> function1, g4a<Boolean> g4aVar, lu2<? super cz9> lu2Var) {
        super(2, lu2Var);
        this.$isRequired = z;
        this.$value = ig3Var;
        this.$onInternalDateRangeValidationResultChange = function1;
        this.$isDateRangeSequential$delegate = g4aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new cz9(this.$isRequired, this.$value, this.$onInternalDateRangeValidationResultChange, this.$isDateRangeSequential$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((cz9) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00e4  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cz9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
