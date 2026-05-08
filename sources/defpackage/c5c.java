package defpackage;

import defpackage.pi7;

/* JADX INFO: loaded from: classes3.dex */
public enum c5c implements pi7.a {
    /* JADX INFO: Fake field, exist only in values array */
    DECLARATION(0),
    /* JADX INFO: Fake field, exist only in values array */
    FAKE_OVERRIDE(1),
    /* JADX INFO: Fake field, exist only in values array */
    DELEGATION(2),
    /* JADX INFO: Fake field, exist only in values array */
    SYNTHESIZED(3);

    private final int value;

    c5c(int i) {
        this.value = i;
    }

    @Override // pi7.a
    public final int getNumber() {
        return this.value;
    }
}
