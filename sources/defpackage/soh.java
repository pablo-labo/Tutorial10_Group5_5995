package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class soh implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ lfh c;

    public soh(lfh lfhVar, String str, long j) {
        this.c = lfhVar;
        this.a = str;
        this.b = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        lfh lfhVar = this.c;
        lfhVar.g();
        lfhVar.b();
        String str = this.a;
        fib.f(str);
        ht0 ht0Var = lfhVar.c;
        boolean zIsEmpty = ht0Var.isEmpty();
        long j = this.b;
        if (zIsEmpty) {
            lfhVar.d = j;
        }
        Integer num = (Integer) ht0Var.get(str);
        if (num != null) {
            ht0Var.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (ht0Var.c >= 100) {
            lfhVar.zzr().X.b("Too many ads visible");
        } else {
            ht0Var.put(str, 1);
            lfhVar.b.put(str, Long.valueOf(j));
        }
    }
}
