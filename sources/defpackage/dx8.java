package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dx8 {
    public boolean a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && dx8.class == obj.getClass() && this.a == ((dx8) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1 : 0;
    }

    public final String toString() {
        return m6.i(new StringBuilder("LineFriendshipStatus{friendFlag="), this.a, '}');
    }
}
