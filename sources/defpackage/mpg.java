package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mpg extends mj8 implements gu5<j6g> {
    final /* synthetic */ kv8 $lifecycle;
    final /* synthetic */ uv8 $observer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mpg(kv8 kv8Var, lpg lpgVar) {
        super(0);
        this.$lifecycle = kv8Var;
        this.$observer = lpgVar;
    }

    @Override // defpackage.gu5
    public final j6g invoke() {
        this.$lifecycle.c(this.$observer);
        return j6g.a;
    }
}
