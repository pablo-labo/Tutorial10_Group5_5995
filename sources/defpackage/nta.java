package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum nta {
    ConversationList(5.0f),
    PersonAvatarRegular(2.0f),
    ConversationHeader(1.0f);

    private final float offset;

    nta(float f) {
        this.offset = f;
    }

    public final float a() {
        return this.offset;
    }
}
