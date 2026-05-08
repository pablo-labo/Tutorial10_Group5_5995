package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class q94 extends mj8 implements Function1<r94, itf> {
    final /* synthetic */ huc $handled;
    final /* synthetic */ o94 $startEvent;
    final /* synthetic */ r94 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q94(o94 o94Var, r94 r94Var, huc hucVar) {
        super(1);
        this.$startEvent = o94Var;
        this.this$0 = r94Var;
        this.$handled = hucVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final itf invoke(r94 r94Var) {
        r94 r94Var2 = r94Var;
        if (!r94Var2.c0) {
            return itf.b;
        }
        if (r94Var2.f0 != null) {
            ae7.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
        }
        r94Var2.f0 = null;
        huc hucVar = this.$handled;
        hucVar.element = hucVar.element;
        return itf.a;
    }
}
