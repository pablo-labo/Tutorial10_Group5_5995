package defpackage;

import defpackage.pi7;

/* JADX INFO: loaded from: classes3.dex */
public enum d5c implements pi7.a {
    /* JADX INFO: Fake field, exist only in values array */
    FINAL(0),
    /* JADX INFO: Fake field, exist only in values array */
    OPEN(1),
    /* JADX INFO: Fake field, exist only in values array */
    ABSTRACT(2),
    /* JADX INFO: Fake field, exist only in values array */
    SEALED(3);

    private final int value;

    d5c(int i) {
        this.value = i;
    }

    @Override // pi7.a
    public final int getNumber() {
        return this.value;
    }
}
