package defpackage;

import defpackage.hmb;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.screens.sheets.profilesubtab.workexperience.UpdateLocationSheetKt$UpdateLocationInput$1$2$1$1$1", f = "UpdateLocationSheet.kt", l = {90}, m = "invokeSuspend")
public final class lfg extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ d3a $interactionSource;
    final /* synthetic */ gu5<j6g> $onReleaseClick;
    int label;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ gu5<j6g> a;

        public a(gu5<j6g> gu5Var) {
            this.a = gu5Var;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            if (((ci7) obj) instanceof hmb.c) {
                this.a.invoke();
            }
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfg(d3a d3aVar, gu5<j6g> gu5Var, lu2<? super lfg> lu2Var) {
        super(2, lu2Var);
        this.$interactionSource = d3aVar;
        this.$onReleaseClick = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new lfg(this.$interactionSource, this.$onReleaseClick, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((lfg) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                r7d.b(obj);
                return j6g.a;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        nde ndeVarB = this.$interactionSource.b();
        a aVar = new a(this.$onReleaseClick);
        this.label = 1;
        ndeVarB.e(aVar, this);
        return g13.a;
    }
}
