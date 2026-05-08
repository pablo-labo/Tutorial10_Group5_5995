package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum usa {
    ConversationList(10.0f, 2.0f, 5.0f, 2.0f),
    ConversationHeader(6.0f, 1.0f, 1.0f, -3.0f),
    PersonAvatarRegular(10.0f, 2.0f, 2.0f, 2.0f),
    ProfileAvatar(18.0f, 2.0f, 0.0f, -16.0f);

    private final float borderWidth;
    private final float horizontalOffset;
    private final float indicatorSize;
    private final float verticalOffSet;

    usa(float f, float f2, float f3, float f4) {
        this.indicatorSize = f;
        this.borderWidth = f2;
        this.horizontalOffset = f3;
        this.verticalOffSet = f4;
    }

    public final float a() {
        return this.borderWidth;
    }

    public final float c() {
        return this.horizontalOffset;
    }

    public final float e() {
        return this.indicatorSize;
    }

    public final float f() {
        return this.verticalOffSet;
    }
}
