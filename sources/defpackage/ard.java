package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ard implements cse {
    public static final a e = a.a;
    public long a = ((Number) e.invoke()).longValue();
    public long b;
    public long c;
    public Integer d;

    public static final class a extends mj8 implements gu5<Long> {
        public static final a a = new a(0);

        @Override // defpackage.gu5
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }
}
