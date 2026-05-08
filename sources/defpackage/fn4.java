package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.screens.sheets.profilesubtab.skills.EditSkillSheetKt$EditSkillSheet$2$1", f = "EditSkillSheet.kt", l = {}, m = "invokeSuspend")
public final class fn4 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ boolean $isModifiedSinceLastSave;
    final /* synthetic */ g4a<Boolean> $skillYOEDeleted$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn4(boolean z, g4a<Boolean> g4aVar, lu2<? super fn4> lu2Var) {
        super(2, lu2Var);
        this.$isModifiedSinceLastSave = z;
        this.$skillYOEDeleted$delegate = g4aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new fn4(this.$isModifiedSinceLastSave, this.$skillYOEDeleted$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((fn4) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        if (this.$skillYOEDeleted$delegate.getValue().booleanValue() && this.$isModifiedSinceLastSave) {
            this.$skillYOEDeleted$delegate.setValue(Boolean.FALSE);
        }
        return j6g.a;
    }
}
