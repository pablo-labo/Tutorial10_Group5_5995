package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rkh implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ lfh c;

    public rkh(lfh lfhVar, String str, long j) {
        this.c = lfhVar;
        this.a = str;
        this.b = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        lfh lfhVar = this.c;
        ht0 ht0Var = lfhVar.b;
        lfhVar.g();
        lfhVar.b();
        String str = this.a;
        fib.f(str);
        ht0 ht0Var2 = lfhVar.c;
        Integer num = (Integer) ht0Var2.get(str);
        if (num == null) {
            lfhVar.zzr().f.a(str, "Call to endAdUnitExposure for unknown ad unit id");
            return;
        }
        f8i f8iVarO = lfhVar.i().o(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            ht0Var2.put(str, Integer.valueOf(iIntValue));
            return;
        }
        ht0Var2.remove(str);
        Long l = (Long) ht0Var.get(str);
        long j = this.b;
        if (l == null) {
            lfhVar.zzr().f.b("First ad unit exposure time was never set");
        } else {
            long jLongValue = j - l.longValue();
            ht0Var.remove(str);
            lfhVar.n(str, jLongValue, f8iVarO);
        }
        if (ht0Var2.isEmpty()) {
            long j2 = lfhVar.d;
            if (j2 == 0) {
                lfhVar.zzr().f.b("First ad exposure time was never set");
            } else {
                lfhVar.m(j - j2, f8iVarO);
                lfhVar.d = 0L;
            }
        }
    }
}
