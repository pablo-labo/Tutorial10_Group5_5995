package defpackage;

import defpackage.vs0;

/* JADX INFO: loaded from: classes2.dex */
public enum j89 {
    Center(vs0.e),
    Start(vs0.c),
    /* JADX INFO: Fake field, exist only in values array */
    End(vs0.d),
    /* JADX INFO: Fake field, exist only in values array */
    SpaceEvenly(vs0.f),
    /* JADX INFO: Fake field, exist only in values array */
    SpaceBetween(vs0.g),
    /* JADX INFO: Fake field, exist only in values array */
    SpaceAround(vs0.h);

    private final vs0.l arrangement;

    j89(vs0.l lVar) {
        this.arrangement = lVar;
    }

    public final vs0.l a() {
        return this.arrangement;
    }
}
