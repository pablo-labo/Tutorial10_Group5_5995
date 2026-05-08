package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q74 extends mj8 implements gu5<j6g> {
    final /* synthetic */ ald $androidxRegistry;
    final /* synthetic */ String $key;
    final /* synthetic */ boolean $registered;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q74(boolean z, ald aldVar, String str) {
        super(0);
        this.$registered = z;
        this.$androidxRegistry = aldVar;
        this.$key = str;
    }

    @Override // defpackage.gu5
    public final j6g invoke() {
        if (this.$registered) {
            ald aldVar = this.$androidxRegistry;
            String str = this.$key;
            aldVar.getClass();
            str.getClass();
            cld cldVar = aldVar.a;
            synchronized (cldVar.c) {
            }
        }
        return j6g.a;
    }
}
