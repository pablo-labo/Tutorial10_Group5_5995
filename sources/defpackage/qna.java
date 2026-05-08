package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qna {
    public final int a;
    public final Integer b;

    public qna(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qna)) {
            return false;
        }
        qna qnaVar = (qna) obj;
        return this.a == qnaVar.a && wl7.b(this.b, qnaVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.a + ", dataOffset=" + this.b + ')';
    }
}
