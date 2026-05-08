package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public interface hh6 {

    public enum a {
        NONE(0),
        /* JADX INFO: Fake field, exist only in values array */
        SDK(1),
        GLOBAL(2),
        /* JADX INFO: Fake field, exist only in values array */
        COMBINED(3);

        private final int code;

        a(int i) {
            this.code = i;
        }

        public final int a() {
            return this.code;
        }
    }

    a b();
}
