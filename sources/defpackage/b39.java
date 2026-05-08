package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b39 {
    public final long a;
    public final a b;

    public enum a implements u5c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        a(int i) {
            this.number_ = i;
        }

        @Override // defpackage.u5c
        public final int getNumber() {
            return this.number_;
        }
    }

    public b39(long j, a aVar) {
        this.a = j;
        this.b = aVar;
    }
}
