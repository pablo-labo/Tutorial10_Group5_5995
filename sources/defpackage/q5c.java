package defpackage;

import defpackage.pi7;

/* JADX INFO: loaded from: classes3.dex */
public enum q5c implements pi7.a {
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL(0),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE(1),
    /* JADX INFO: Fake field, exist only in values array */
    PROTECTED(2),
    /* JADX INFO: Fake field, exist only in values array */
    PUBLIC(3),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE_TO_THIS(4),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL(5);

    private final int value;

    q5c(int i) {
        this.value = i;
    }

    @Override // pi7.a
    public final int getNumber() {
        return this.value;
    }
}
