package defpackage;

import defpackage.d0a;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3", f = "MouseWheelScrollable.kt", l = {253, 266, 283}, m = "invokeSuspend")
public final class h0a extends c1f implements Function2<afa, lu2<? super j6g>, Object> {
    final /* synthetic */ luc<ae0<Float, ce0>> $animationState;
    final /* synthetic */ float $speed;
    final /* synthetic */ luc<d0a.a> $targetScrollDelta;
    final /* synthetic */ iuc $targetValue;
    final /* synthetic */ xsd $this_dispatchMouseWheelScroll;
    final /* synthetic */ float $threshold;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d0a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0a(iuc iucVar, luc<ae0<Float, ce0>> lucVar, luc<d0a.a> lucVar2, float f, d0a d0aVar, float f2, xsd xsdVar, lu2<? super h0a> lu2Var) {
        super(2, lu2Var);
        this.$targetValue = iucVar;
        this.$animationState = lucVar;
        this.$targetScrollDelta = lucVar2;
        this.$threshold = f;
        this.this$0 = d0aVar;
        this.$speed = f2;
        this.$this_dispatchMouseWheelScroll = xsdVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        h0a h0aVar = new h0a(this.$targetValue, this.$animationState, this.$targetScrollDelta, this.$threshold, this.this$0, this.$speed, this.$this_dispatchMouseWheelScroll, lu2Var);
        h0aVar.L$0 = obj;
        return h0aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(afa afaVar, lu2<? super j6g> lu2Var) {
        return ((h0a) create(afaVar, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018b  */
    /* JADX WARN: Type inference failed for: r2v9, types: [T, ae0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x017d -> B:36:0x017f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x018b -> B:13:0x0064). Please report as a decompilation issue!!! */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h0a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
