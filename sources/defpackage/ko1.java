package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ko1 {
    public static final k22<Object> a = new k22<>(-1, null, null, 0);
    public static final int b = wea.k(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int c = wea.k(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final ux0 d = new ux0("BUFFERED", 4);
    public static final ux0 e = new ux0("SHOULD_BUFFER", 4);
    public static final ux0 f = new ux0("S_RESUMING_BY_RCV", 4);
    public static final ux0 g = new ux0("RESUMING_BY_EB", 4);
    public static final ux0 h = new ux0("POISONED", 4);
    public static final ux0 i = new ux0("DONE_RCV", 4);
    public static final ux0 j = new ux0("INTERRUPTED_SEND", 4);
    public static final ux0 k = new ux0("INTERRUPTED_RCV", 4);
    public static final ux0 l = new ux0("CHANNEL_CLOSED", 4);
    public static final ux0 m = new ux0("SUSPEND", 4);
    public static final ux0 n = new ux0("SUSPEND_NO_WAITER", 4);
    public static final ux0 o = new ux0("FAILED", 4);
    public static final ux0 p = new ux0("NO_RECEIVE_RESULT", 4);
    public static final ux0 q = new ux0("CLOSE_HANDLER_CLOSED", 4);
    public static final ux0 r = new ux0("CLOSE_HANDLER_INVOKED", 4);
    public static final ux0 s = new ux0("NO_CLOSE_CAUSE", 4);

    public static final <T> boolean a(pw1<? super T> pw1Var, T t, wu5<? super Throwable, ? super T, ? super v03, j6g> wu5Var) {
        ux0 ux0VarD = pw1Var.d(t, wu5Var);
        if (ux0VarD == null) {
            return false;
        }
        pw1Var.w(ux0VarD);
        return true;
    }
}
