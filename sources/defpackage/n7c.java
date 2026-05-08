package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n7c extends mj8 implements gu5<Float> {
    final /* synthetic */ gu5<Float> $progress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7c(gu5<Float> gu5Var) {
        super(0);
        this.$progress = gu5Var;
    }

    @Override // defpackage.gu5
    public final Float invoke() {
        return Float.valueOf(this.$progress.invoke().floatValue() < 1.0f ? 0.3f : 1.0f);
    }
}
