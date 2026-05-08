package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes3.dex */
public enum txc {
    IGNORE_CASE(2),
    /* JADX INFO: Fake field, exist only in values array */
    MULTILINE(8),
    LITERAL(16),
    /* JADX INFO: Fake field, exist only in values array */
    UNIX_LINES(1),
    /* JADX INFO: Fake field, exist only in values array */
    COMMENTS(4),
    /* JADX INFO: Fake field, exist only in values array */
    DOT_MATCHES_ALL(32),
    /* JADX INFO: Fake field, exist only in values array */
    CANON_EQ(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);

    private final int mask;
    private final int value;

    txc() {
        throw null;
    }

    txc(int i) {
        this.value = i;
        this.mask = i;
    }

    public final int a() {
        return this.value;
    }
}
