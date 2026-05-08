package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.components.inputs.MonthYearPickerKt$MonthYearValueDisplay$2$1", f = "MonthYearPicker.kt", l = {}, m = "invokeSuspend")
public final class bz9 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ tg3 $date;
    final /* synthetic */ boolean $isRequired;
    final /* synthetic */ Function1<Boolean, j6g> $onInternalDateValidationResultChange;
    final /* synthetic */ boolean $showErrorIfDateIsFuture;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public bz9(boolean z, tg3 tg3Var, Function1<? super Boolean, j6g> function1, boolean z2, lu2<? super bz9> lu2Var) {
        super(2, lu2Var);
        this.$isRequired = z;
        this.$date = tg3Var;
        this.$onInternalDateValidationResultChange = function1;
        this.$showErrorIfDateIsFuture = z2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new bz9(this.$isRequired, this.$date, this.$onInternalDateValidationResultChange, this.$showErrorIfDateIsFuture, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((bz9) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.label
            r1 = 0
            if (r0 != 0) goto L51
            defpackage.r7d.b(r3)
            boolean r3 = r2.$isRequired
            if (r3 != 0) goto L28
            tg3 r3 = r2.$date
            if (r3 == 0) goto L13
            s38 r0 = r3.b
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 != 0) goto L28
            if (r3 == 0) goto L1a
            java.lang.Integer r1 = r3.c
        L1a:
            if (r1 == 0) goto L42
            java.lang.Integer r3 = r3.c
            if (r3 != 0) goto L21
            goto L28
        L21:
            int r3 = r3.intValue()
            if (r3 != 0) goto L28
            goto L42
        L28:
            tg3 r3 = r2.$date
            if (r3 == 0) goto L44
            boolean r0 = r2.$showErrorIfDateIsFuture
            s38 r1 = r3.b
            if (r1 == 0) goto L44
            java.lang.Integer r3 = r3.c
            if (r3 == 0) goto L44
            int r3 = r3.intValue()
            boolean r3 = defpackage.cr8.v(r1, r3)
            if (r3 == 0) goto L42
            if (r0 != 0) goto L44
        L42:
            r3 = 1
            goto L45
        L44:
            r3 = 0
        L45:
            kotlin.jvm.functions.Function1<java.lang.Boolean, j6g> r2 = r2.$onInternalDateValidationResultChange
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.invoke(r3)
            j6g r2 = defpackage.j6g.a
            return r2
        L51:
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bz9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
