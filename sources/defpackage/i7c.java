package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i7c extends mj8 implements gu5<Float> {
    final /* synthetic */ w7c $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7c(w7c w7cVar) {
        super(0);
        this.$state = w7cVar;
    }

    @Override // defpackage.gu5
    public final Float invoke() {
        return Float.valueOf(this.$state.b());
    }
}
